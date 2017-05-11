package ua.com.controller;

/**
 * Created by oleg on 12.04.17.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.com.dao.DeveloperDao;
import ua.com.dao.impl.DeveloperDaoImpl;
import ua.com.model.Developer;

@Controller
public class DeveloperController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("name", "Click add to continue");
        return "page";
    }

    @RequestMapping(value = "developer", method = RequestMethod.GET)
    public ModelAndView developer() {
        Developer dev = new Developer();
        return new ModelAndView("developer", "command", dev);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String searchAll() {

        return "test";
    }


    @RequestMapping(value = "/addDeveloper", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("mvc-dispatcher") Developer developer,
                             ModelMap model) {
        model.addAttribute("id", developer.getId());
        model.addAttribute("name", developer.getName());
        model.addAttribute("specilaty", developer.getSpecialty());
        model.addAttribute("experience", developer.getExperience());
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        DeveloperDao dao = new DeveloperDaoImpl(session);
        dao.addDev(developer);
        return "result";
    }
}

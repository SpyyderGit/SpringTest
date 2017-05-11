package ua.com.dao;

import ua.com.model.Developer;

import java.util.List;

/**
 * Created by oleg on 06.05.17.
 */
public interface DeveloperDao {
    void addDev(Developer developer);

    void removeDev(Developer developer);

    void updateDev(Developer developer);

    List<Developer> listDev();

}

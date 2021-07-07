package com.rk.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * The controller fro Plant Diary REST endpoints and web UI
 * <p>
 * This class handles the CRUD operations for My Plant Diary specimens, via HTTP actions.
 * </p>
 * <p>
 * This class also serves HTML based web pages, for UI interactions with plant specimens.
 * </p>
 * @author Brandan Jones
 */
@RestController
public class ConnectorController {



    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/employees")
    List<String> all() {

        ArrayList<String> str = new ArrayList<String>();
        str.add("rk");
        str.add("for");
        str.add("Geeks1");
        return str;
    }

}

package com.baby.web.controller;

import com.baby.Dao.Do.StudentDo;
import com.baby.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import javax.inject.Inject;
import java.util.Map;

/**
 * Created by owner on 16-4-10.
 */
@Controller
public class HomeController {
    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;
    @Autowired
    private SpitterService _splitterService;

    /*@Inject
    public HomeController(SpitterService spitterService) {
        _splitterService = spitterService;
    }
*/
    @RequestMapping("/Home")
    public String showHomePage(Map<String, Object> model) {
        try {

            model.put("spittles", _splitterService.getRecentSpitters());
            return "Home";
        }
        catch (Exception e)
        {}
        return "index";
    }

    @RequestMapping("/insertBabyInfo")
    public String showHomePagea(Map<String, Object> model) {
        try {
            return "screen/InsertBabyInfo";
        }
        catch (Exception e)
        {}
        return "index";
    }

        @RequestMapping("/login")
        public String login(StudentDo studentDo,Map<String, Object> model ) throws Exception{
            if (studentDo.getName()== "")
            {
                model.put("aa", "请输入Name");
                return "screen/InsertBabyInfo";
            } else {
                _splitterService.insertStudent(studentDo);
                model.put("spittles", _splitterService.getRecentSpitters());
                return "Home";
            }
        }


    }

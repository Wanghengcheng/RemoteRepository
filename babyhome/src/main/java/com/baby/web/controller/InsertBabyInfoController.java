package com.baby.web.controller;

import com.baby.Dao.Do.StudentDo;
import com.baby.service.SpitterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.Map;

/**
 * Created by owner on 16-4-10.
 */
@Controller
public class InsertBabyInfoController {
    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;
    private SpitterService _splitterService;

    @Inject
    public InsertBabyInfoController(SpitterService spitterService) {
        _splitterService = spitterService;
    }

/*    @RequestMapping(value = "/InsertBabyInfo", method = RequestMethod.POST)
    public String InsertBabyInfo(StudentDo studentDo) {
        try {

            _splitterService.insertStudent(studentDo);
            return "Home";
        }
        catch (Exception e)
        {}
        return "index";
    }*/
}

package com.kefei.demo.controller;

import com.kefei.demo.model.ExamAddressMaintain;
import com.kefei.demo.service.ExamAddressMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author liukai
 * @Title: ExamAddressMaintainController
 * @ProjectName examination
 * @Description: TODO
 * @date 2019/9/513:20
 */
@Controller
@RequestMapping(value = "/exam")
public class ExamAddressMaintainController {

    @Autowired
    private ExamAddressMaintainService examAddressMaintainService;

    @ResponseBody
    @PostMapping("/add")
    public int addExam(ExamAddressMaintain examAddressMaintain){
        return examAddressMaintainService.addExamAddressMatain(examAddressMaintain);
    }

    @ResponseBody
    @GetMapping("/selectAllPage")
    public Object selectAllPage(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                          @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize){
        return examAddressMaintainService.selectAllPage(pageNum,pageSize);
    }

    @ResponseBody
    @GetMapping("/selectList")
    public Object selectList(){
        return examAddressMaintainService.selectList();
    }

    @ResponseBody
    @GetMapping("/selectOne")
    public ExamAddressMaintain selectOne(@RequestParam(name = "id", required = false, defaultValue = "1000") Integer id){
        return examAddressMaintainService.selectOne(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}

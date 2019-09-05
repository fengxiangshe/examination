package com.kefei.demo.service;

import com.github.pagehelper.PageInfo;
import com.kefei.demo.model.ExamAddressMaintain;

import java.util.List;

/**
 * @author liukai
 * @Title: ExamAddressMaintainService
 * @ProjectName examination
 * @Description: TODO
 * @date 2019/9/511:14
 */
public interface ExamAddressMaintainService {

    int addExamAddressMatain(ExamAddressMaintain examAddressMaintain);

    List<ExamAddressMaintain> selectList();

    PageInfo<ExamAddressMaintain> selectAllPage(int ageNum, int pageSize);

    ExamAddressMaintain selectOne(int id);
}

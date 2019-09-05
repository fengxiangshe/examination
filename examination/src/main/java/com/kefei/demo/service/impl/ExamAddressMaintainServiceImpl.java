package com.kefei.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kefei.demo.dao.ExamAddressMaintainDao;
import com.kefei.demo.model.ExamAddressMaintain;
import com.kefei.demo.service.ExamAddressMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liukai
 * @Title: ExamAddressMaintainServiceImpl
 * @ProjectName examination
 * @Description: TODO
 * @date 2019/9/513:11
 */
@Service(value = "ExamAddressMaintainService")
public class ExamAddressMaintainServiceImpl implements ExamAddressMaintainService {

    @Autowired
    private ExamAddressMaintainDao examAddressMaintainDao;

    @Override
    public int addExamAddressMatain(ExamAddressMaintain examAddressMaintain) {
        return examAddressMaintainDao.insert(examAddressMaintain);
    }

    @Override
    public List<ExamAddressMaintain> selectList() {
        List<ExamAddressMaintain> list =  examAddressMaintainDao.selectList();
        return list;
    }

    @Override
    public ExamAddressMaintain selectOne(int id) {
        ExamAddressMaintain examAddressMaintain = examAddressMaintainDao.selectOne(id);
        return examAddressMaintain;
    }

    @Override
    public PageInfo<ExamAddressMaintain> selectAllPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ExamAddressMaintain> examAddressMaintains = examAddressMaintainDao.selectAllPage();
        PageInfo result = new PageInfo(examAddressMaintains);
        return result;
    }


}

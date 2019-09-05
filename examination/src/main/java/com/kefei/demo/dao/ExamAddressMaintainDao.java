package com.kefei.demo.dao;

import com.github.pagehelper.PageInfo;
import com.kefei.demo.model.ExamAddressMaintain;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liukai
 * @Title: ExamAddressMaintainDao
 * @ProjectName examination
 * @Description: TODO
 * @date 2019/9/5 10:35
 */
@Repository
public interface ExamAddressMaintainDao {

    int insert(ExamAddressMaintain examAddressMaintain);

    List<ExamAddressMaintain> selectList();

    List<ExamAddressMaintain> selectAllPage();

    ExamAddressMaintain selectOne(int id);
}

package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.Visit;
import test.school.bean.VisitExample;
import test.school.dao.VisitMapper;

import java.util.List;

@Service
public class VisitService {
    @Autowired
    VisitMapper visitMapper;

    public void add(Visit u) {
        visitMapper.insert(u);
    }


    public void delete(Integer id) {
        visitMapper.deleteByPrimaryKey(id);
    }


    public void update(Visit u) {
        visitMapper.updateByPrimaryKeySelective(u);
    }


    public Visit get(Integer id) {
        return visitMapper.selectByPrimaryKey(id);
    }


    public List<Visit> list() {
        VisitExample example = new VisitExample();
        example.setOrderByClause("id desc");
        return visitMapper.selectByExample(example);
    }

}

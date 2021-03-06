package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.StopVisit;
import test.school.bean.StopVisitExample;
import test.school.dao.StopVisitMapper;

import java.util.List;

@Service
public class StopVisitService {
    @Autowired
    StopVisitMapper stopVisitMapper;

    public void add(StopVisit u) {
        stopVisitMapper.insert(u);
    }


    public void delete(Integer id) {
        stopVisitMapper.deleteByPrimaryKey(id);
    }


    public void update(StopVisit u) {
        stopVisitMapper.updateByPrimaryKeySelective(u);
    }


    public StopVisit get(Integer id) {
        return stopVisitMapper.selectByPrimaryKey(id);
    }


    public List<StopVisit> list() {
        StopVisitExample example = new StopVisitExample();
        example.setOrderByClause("id desc");
        return stopVisitMapper.selectByExample(example);
    }

}

package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.Logrecord;
import test.school.bean.LogrecordExample;
import test.school.dao.LogrecordMapper;

import java.util.List;

@Service
public class LogrecordService {
    @Autowired
    LogrecordMapper logrecordMapper;

    public void add(Logrecord u) {
        logrecordMapper.insert(u);
    }


    public void delete(Integer id) {
        logrecordMapper.deleteByPrimaryKey(id);
    }


    public void update(Logrecord u) {
        logrecordMapper.updateByPrimaryKeySelective(u);
    }


    public Logrecord get(Integer id) {
        return logrecordMapper.selectByPrimaryKey(id);
    }


    public List<Logrecord> list() {
        LogrecordExample example = new LogrecordExample();
        example.setOrderByClause("id desc");
        return logrecordMapper.selectByExample(example);
    }

}

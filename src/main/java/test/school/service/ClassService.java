package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.Class;
import test.school.bean.ClassExample;
import test.school.dao.ClassMapper;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    ClassMapper classMapper;

    public void add(Class u) {
        classMapper.insert(u);
    }


    public void delete(Integer id) { classMapper.deleteByPrimaryKey(id); }


    public void update(Class u) { classMapper.updateByPrimaryKeySelective(u); }


    public Class get(Integer id) {
        return classMapper.selectByPrimaryKey(id);
    }


    public List<Class> list() {
        ClassExample example = new ClassExample();
        example.setOrderByClause("id desc");
        return classMapper.selectByExample(example);
    }
}

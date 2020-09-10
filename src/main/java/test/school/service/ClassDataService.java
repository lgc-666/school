package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.ClassData;
import test.school.bean.ClassDataExample;
import test.school.dao.ClassDataMapper;

import java.util.List;

@Service
public class ClassDataService {
    @Autowired
    ClassDataMapper classDataMapper;

    public void add(ClassData u) {
        classDataMapper.insert(u);
    }


    public void delete(Integer id) {
        classDataMapper.deleteByPrimaryKey(id);
    }


    public void update(ClassData u) {
        classDataMapper.updateByPrimaryKeySelective(u);
    }


    public ClassData get(Integer id) {
        return classDataMapper.selectByPrimaryKey(id);
    }


    public List<ClassData> list() {
        ClassDataExample example = new ClassDataExample();
        example.setOrderByClause("id desc");
        return classDataMapper.selectByExample(example);
    }

}

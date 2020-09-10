package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.Teacher;
import test.school.bean.TeacherExample;
import test.school.dao.TeacherMapper;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    public void add(Teacher u) {
        teacherMapper.insert(u);
    }


    public void delete(Integer id) {
        teacherMapper.deleteByPrimaryKey(id);
    }


    public void update(Teacher u) {
        teacherMapper.updateByPrimaryKeySelective(u);
    }


    public Teacher get(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }


    public List<Teacher> list() {
        TeacherExample example = new TeacherExample();
        example.setOrderByClause("id desc");
        return teacherMapper.selectByExample(example);
    }
}

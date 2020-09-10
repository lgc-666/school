package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.TeacherClass;
import test.school.bean.TeacherClassExample;
import test.school.dao.TeacherClassMapper;

import java.util.List;

@Service
public class TeacherClassService {
    @Autowired
    TeacherClassMapper teacherClassMapper;

    public void add(TeacherClass u) {
        teacherClassMapper.insert(u);
    }


    public void delete(Integer id) {
        teacherClassMapper.deleteByPrimaryKey(id);
    }


    public void update(TeacherClass u) {
        teacherClassMapper.updateByPrimaryKeySelective(u);
    }


    public TeacherClass get(Integer id) {
        return teacherClassMapper.selectByPrimaryKey(id);
    }


    public List<TeacherClass> list() {
        TeacherClassExample example = new TeacherClassExample();
        example.setOrderByClause("id desc");
        return teacherClassMapper.selectByExample(example);
    }
}

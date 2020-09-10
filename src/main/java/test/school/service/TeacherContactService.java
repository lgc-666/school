package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.TeacherContact;
import test.school.bean.TeacherContactExample;
import test.school.dao.TeacherContactMapper;

import java.util.List;

@Service
public class TeacherContactService {
    @Autowired
    TeacherContactMapper teacherContactMapper;

    public void add(TeacherContact u) {
        teacherContactMapper.insert(u);
    }


    public void delete(Integer id) {
        teacherContactMapper.deleteByPrimaryKey(id);
    }


    public void update(TeacherContact u) {
        teacherContactMapper.updateByPrimaryKeySelective(u);
    }


    public TeacherContact get(Integer id) {
        return teacherContactMapper.selectByPrimaryKey(id);
    }


    public List<TeacherContact> list() {
        TeacherContactExample example = new TeacherContactExample();
        example.setOrderByClause("id desc");
        return teacherContactMapper.selectByExample(example);
    }

}

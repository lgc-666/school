package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.Student;
import test.school.bean.StudentExample;
import test.school.dao.StudentMapper;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public void add(Student u) {
        studentMapper.insert(u);
    }


    public void delete(Integer id) {
        studentMapper.deleteByPrimaryKey(id);
    }


    public void update(Student u) {
        studentMapper.updateByPrimaryKeySelective(u);
    }


    public Student get(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    public List<Student> selectByName(String studentname){
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andStudentnameEqualTo(studentname);
        return studentMapper.selectByExample(example);
    }

    public List<Student> list() {
        StudentExample example = new StudentExample();
        example.setOrderByClause("id desc");
        return studentMapper.selectByExample(example);
    }

}

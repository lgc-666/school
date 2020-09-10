package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.ContactStudent;
import test.school.bean.ContactStudentExample;
import test.school.dao.ContactStudentMapper;

import java.util.List;

@Service
public class ContactStudentService {
    @Autowired
    ContactStudentMapper contactStudentMapper;

    public void add(ContactStudent u) {
        contactStudentMapper.insert(u);
    }


    public void delete(Integer id) {
        contactStudentMapper.deleteByPrimaryKey(id);
    }


    public void update(ContactStudent u) {
        contactStudentMapper.updateByPrimaryKeySelective(u);
    }


    public ContactStudent get(Integer id) {
        return contactStudentMapper.selectByPrimaryKey(id);
    }


    public List<ContactStudent> list() {
        ContactStudentExample example = new ContactStudentExample();
        example.setOrderByClause("id desc");
        return contactStudentMapper.selectByExample(example);
    }

}

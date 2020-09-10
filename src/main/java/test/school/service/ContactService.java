package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.Contact;
import test.school.bean.ContactExample;
import test.school.dao.ContactMapper;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactMapper contactMapper;

    public void add(Contact u) {
        contactMapper.insert(u);
    }


    public void delete(Integer id) {
        contactMapper.deleteByPrimaryKey(id);
    }


    public void update(Contact u) {
        contactMapper.updateByPrimaryKeySelective(u);
    }


    public Contact get(Integer id) {
        return contactMapper.selectByPrimaryKey(id);
    }


    public List<Contact> list() {
        ContactExample example = new ContactExample();
        example.setOrderByClause("id desc");
        return contactMapper.selectByExample(example);
    }


}

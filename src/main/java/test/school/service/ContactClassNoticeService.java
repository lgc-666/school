package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.ContactClassNotice;
import test.school.bean.ContactClassNoticeExample;
import test.school.dao.ContactClassNoticeMapper;

import java.util.List;

@Service
public class ContactClassNoticeService {
    @Autowired
    ContactClassNoticeMapper contactClassNoticeMapper;

    public void add(ContactClassNotice u) {
        contactClassNoticeMapper.insert(u);
    }


    public void delete(Integer id) {
        contactClassNoticeMapper.deleteByPrimaryKey(id);
    }


    public void update(ContactClassNotice u) {
        contactClassNoticeMapper.updateByPrimaryKeySelective(u);
    }


    public ContactClassNotice get(Integer id) {
        return contactClassNoticeMapper.selectByPrimaryKey(id);
    }


    public List<ContactClassNotice> list() {
        ContactClassNoticeExample example = new ContactClassNoticeExample();
        example.setOrderByClause("id desc");
        return contactClassNoticeMapper.selectByExample(example);
    }

}

package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.ClassNotice;
import test.school.bean.ClassNoticeExample;
import test.school.dao.ClassNoticeMapper;

import java.util.List;

@Service
public class ClassNoticeService {
    @Autowired
    ClassNoticeMapper classNoticeMapper;

    public void add(ClassNotice u) {
        classNoticeMapper.insert(u);
    }


    public void delete(Integer id) {
        classNoticeMapper.deleteByPrimaryKey(id);
    }


    public void update(ClassNotice u) {
        classNoticeMapper.updateByPrimaryKeySelective(u);
    }


    public ClassNotice get(Integer id) {
        return classNoticeMapper.selectByPrimaryKey(id);
    }


    public List<ClassNotice> list() {
        ClassNoticeExample example = new ClassNoticeExample();
        example.setOrderByClause("id desc");
        return classNoticeMapper.selectByExample(example);
    }

}

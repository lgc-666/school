package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.Notice;
import test.school.bean.NoticeExample;
import test.school.dao.NoticeMapper;

import java.util.List;

@Service
public class NoticeService {
    @Autowired
    NoticeMapper noticeMapper;

    public void add(Notice u) {
        noticeMapper.insert(u);
    }


    public void delete(Integer id) {
        noticeMapper.deleteByPrimaryKey(id);
    }


    public void update(Notice u) {
        noticeMapper.updateByPrimaryKeySelective(u);
    }


    public Notice get(Integer id) {
        return noticeMapper.selectByPrimaryKey(id);
    }


    public List<Notice> list() {
        NoticeExample example = new NoticeExample();
        example.setOrderByClause("id desc");
        return noticeMapper.selectByExample(example);
    }

}

package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.UserNotice;
import test.school.bean.UserNoticeExample;
import test.school.dao.UserNoticeMapper;

import java.util.List;

@Service
public class UserNoticeService {
    @Autowired
    UserNoticeMapper userNoticeMapper;

    public void add(UserNotice u) {
        userNoticeMapper.insert(u);
    }


    public void delete(Integer id) {
        userNoticeMapper.deleteByPrimaryKey(id);
    }


    public void update(UserNotice u) {
        userNoticeMapper.updateByPrimaryKeySelective(u);
    }


    public UserNotice get(Integer id) {
        return userNoticeMapper.selectByPrimaryKey(id);
    }


    public List<UserNotice> list() {
        UserNoticeExample example = new UserNoticeExample();
        example.setOrderByClause("id desc");
        return userNoticeMapper.selectByExample(example);
    }

}

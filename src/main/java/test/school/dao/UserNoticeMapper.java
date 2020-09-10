package test.school.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import test.school.bean.UserNotice;
import test.school.bean.UserNoticeExample;
@Component
public interface UserNoticeMapper {
    long countByExample(UserNoticeExample example);

    int deleteByExample(UserNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserNotice record);

    int insertSelective(UserNotice record);

    List<UserNotice> selectByExample(UserNoticeExample example);

    UserNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserNotice record, @Param("example") UserNoticeExample example);

    int updateByExample(@Param("record") UserNotice record, @Param("example") UserNoticeExample example);

    int updateByPrimaryKeySelective(UserNotice record);

    int updateByPrimaryKey(UserNotice record);
}
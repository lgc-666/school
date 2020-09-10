package test.school.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import test.school.bean.ContactClassNotice;
import test.school.bean.ContactClassNoticeExample;
@Component
public interface ContactClassNoticeMapper {
    long countByExample(ContactClassNoticeExample example);

    int deleteByExample(ContactClassNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContactClassNotice record);

    int insertSelective(ContactClassNotice record);

    List<ContactClassNotice> selectByExample(ContactClassNoticeExample example);

    ContactClassNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContactClassNotice record, @Param("example") ContactClassNoticeExample example);

    int updateByExample(@Param("record") ContactClassNotice record, @Param("example") ContactClassNoticeExample example);

    int updateByPrimaryKeySelective(ContactClassNotice record);

    int updateByPrimaryKey(ContactClassNotice record);
}
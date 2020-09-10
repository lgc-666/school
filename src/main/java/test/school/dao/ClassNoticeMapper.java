package test.school.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import test.school.bean.ClassNotice;
import test.school.bean.ClassNoticeExample;
@Component
public interface ClassNoticeMapper {
    long countByExample(ClassNoticeExample example);

    int deleteByExample(ClassNoticeExample example);

    int deleteByPrimaryKey(Integer cnid);

    int insert(ClassNotice record);

    int insertSelective(ClassNotice record);

    List<ClassNotice> selectByExample(ClassNoticeExample example);

    ClassNotice selectByPrimaryKey(Integer cnid);

    int updateByExampleSelective(@Param("record") ClassNotice record, @Param("example") ClassNoticeExample example);

    int updateByExample(@Param("record") ClassNotice record, @Param("example") ClassNoticeExample example);

    int updateByPrimaryKeySelective(ClassNotice record);

    int updateByPrimaryKey(ClassNotice record);
}
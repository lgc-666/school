package test.school.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import test.school.bean.TeacherContact;
import test.school.bean.TeacherContactExample;
@Component
public interface TeacherContactMapper {
    long countByExample(TeacherContactExample example);

    int deleteByExample(TeacherContactExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherContact record);

    int insertSelective(TeacherContact record);

    List<TeacherContact> selectByExample(TeacherContactExample example);

    TeacherContact selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherContact record, @Param("example") TeacherContactExample example);

    int updateByExample(@Param("record") TeacherContact record, @Param("example") TeacherContactExample example);

    int updateByPrimaryKeySelective(TeacherContact record);

    int updateByPrimaryKey(TeacherContact record);
}
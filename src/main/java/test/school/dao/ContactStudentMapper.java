package test.school.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import test.school.bean.ContactStudent;
import test.school.bean.ContactStudentExample;
@Component
public interface ContactStudentMapper {
    long countByExample(ContactStudentExample example);

    int deleteByExample(ContactStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContactStudent record);

    int insertSelective(ContactStudent record);

    List<ContactStudent> selectByExample(ContactStudentExample example);

    ContactStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContactStudent record, @Param("example") ContactStudentExample example);

    int updateByExample(@Param("record") ContactStudent record, @Param("example") ContactStudentExample example);

    int updateByPrimaryKeySelective(ContactStudent record);

    int updateByPrimaryKey(ContactStudent record);
}
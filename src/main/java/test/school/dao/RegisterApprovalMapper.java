package test.school.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import test.school.bean.RegisterApproval;
import test.school.bean.RegisterApprovalExample;
@Component
public interface RegisterApprovalMapper {
    long countByExample(RegisterApprovalExample example);

    int deleteByExample(RegisterApprovalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegisterApproval record);

    int insertSelective(RegisterApproval record);

    List<RegisterApproval> selectByExample(RegisterApprovalExample example);

    RegisterApproval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegisterApproval record, @Param("example") RegisterApprovalExample example);

    int updateByExample(@Param("record") RegisterApproval record, @Param("example") RegisterApprovalExample example);

    int updateByPrimaryKeySelective(RegisterApproval record);

    int updateByPrimaryKey(RegisterApproval record);
}
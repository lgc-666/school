package test.school.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import test.school.bean.Machine;
import test.school.bean.MachineExample;
@Component
public interface MachineMapper {
    long countByExample(MachineExample example);

    int deleteByExample(MachineExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectByExample(MachineExample example);

    Machine selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);
}
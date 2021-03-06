package test.school.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import test.school.bean.StopVisit;
import test.school.bean.StopVisitExample;
@Component
public interface StopVisitMapper {
    long countByExample(StopVisitExample example);

    int deleteByExample(StopVisitExample example);

    int deleteByPrimaryKey(Integer stopVisitId);

    int insert(StopVisit record);

    int insertSelective(StopVisit record);

    List<StopVisit> selectByExample(StopVisitExample example);

    StopVisit selectByPrimaryKey(Integer stopVisitId);

    int updateByExampleSelective(@Param("record") StopVisit record, @Param("example") StopVisitExample example);

    int updateByExample(@Param("record") StopVisit record, @Param("example") StopVisitExample example);

    int updateByPrimaryKeySelective(StopVisit record);

    int updateByPrimaryKey(StopVisit record);
}
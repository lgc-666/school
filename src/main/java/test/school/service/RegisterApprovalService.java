package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.RegisterApproval;
import test.school.bean.RegisterApprovalExample;
import test.school.dao.RegisterApprovalMapper;

import java.util.List;

@Service
public class RegisterApprovalService {
    @Autowired
    RegisterApprovalMapper registerApprovalMapper;

    public void add(RegisterApproval u) {
        registerApprovalMapper.insert(u);
    }


    public void delete(Integer id) {
        registerApprovalMapper.deleteByPrimaryKey(id);
    }


    public void update(RegisterApproval u) {
        registerApprovalMapper.updateByPrimaryKeySelective(u);
    }


    public RegisterApproval get(Integer id) {
        return registerApprovalMapper.selectByPrimaryKey(id);
    }


    public List<RegisterApproval> list() {
        RegisterApprovalExample example = new RegisterApprovalExample();
        example.setOrderByClause("id desc");
        return registerApprovalMapper.selectByExample(example);
    }

}

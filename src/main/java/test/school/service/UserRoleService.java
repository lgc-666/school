package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.school.bean.User;
import test.school.bean.UserRole;
import test.school.bean.UserRoleExample;
import test.school.dao.UserRoleMapper;

import java.util.List;

@Service
public class UserRoleService {

    @Autowired
    UserRoleMapper userRoleMapper;

    public void setRoles(User user, Integer[] roleIds) {
        // 删除当前用户所有的角色
        UserRoleExample example = new UserRoleExample();
        example.createCriteria().andUidEqualTo(user.getUid());
        List<UserRole> urs = userRoleMapper.selectByExample(example);
        for (UserRole userRole : urs)
            userRoleMapper.deleteByPrimaryKey(userRole.getId());

        // 设置新的角色关系
        if (null != roleIds)
            for (Integer rid : roleIds){
                UserRole userRole = new UserRole();
                if(rid!=0){
                    userRole.setRid(rid);
                    userRole.setUid(user.getUid());
                    userRoleMapper.insert(userRole);
                }
            }
    }

    public void deleteByUser(Integer userId) {
        UserRoleExample example = new UserRoleExample();
        example.createCriteria().andUidEqualTo(userId);
        List<UserRole> urs = userRoleMapper.selectByExample(example);
        for (UserRole userRole : urs) {
            userRoleMapper.deleteByPrimaryKey(userRole.getId());
        }
    }

    public void deleteByRole(Integer roleId) {
        UserRoleExample example = new UserRoleExample();
        example.createCriteria().andRidEqualTo(roleId);
        List<UserRole> urs = userRoleMapper.selectByExample(example);
        for (UserRole userRole : urs) {
            userRoleMapper.deleteByPrimaryKey(userRole.getId());
        }
    }
}

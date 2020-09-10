package test.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import test.school.bean.Role;
import test.school.bean.RolePermission;
import test.school.bean.RolePermissionExample;
import test.school.dao.RolePermissionMapper;

import java.util.List;

public class RolePermissionService {

    @Autowired
    RolePermissionMapper rolePermissionMapper;


    public void setPermissions(Role role, Integer[] permissionIds) {
        // 删除当前角色所有的权限
        RolePermissionExample example = new RolePermissionExample();
        example.createCriteria().andRidEqualTo(role.getRid());
        List<RolePermission> rps = rolePermissionMapper.selectByExample(example);
        for (RolePermission rolePermission : rps)
            rolePermissionMapper.deleteByPrimaryKey(rolePermission.getId());

        // 设置新的权限关系
        if (null != permissionIds)
            for (Integer pid : permissionIds) {
                RolePermission rolePermission = new RolePermission();
                rolePermission.setPid(pid);
                rolePermission.setRid(role.getRid());
                rolePermissionMapper.insert(rolePermission);
            }
    }


    public void deleteByRole(Integer roleId) {
        RolePermissionExample example = new RolePermissionExample();
        example.createCriteria().andRidEqualTo(roleId);
        List<RolePermission> rps = rolePermissionMapper.selectByExample(example);
        for (RolePermission rolePermission : rps)
            rolePermissionMapper.deleteByPrimaryKey(rolePermission.getId());
    }


    public void deleteByPermission(Integer permissionId) {
        RolePermissionExample example = new RolePermissionExample();
        example.createCriteria().andPidEqualTo(permissionId);
        List<RolePermission> rps = rolePermissionMapper.selectByExample(example);
        for (RolePermission rolePermission : rps)
            rolePermissionMapper.deleteByPrimaryKey(rolePermission.getId());
    }
}

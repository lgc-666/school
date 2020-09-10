package test.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.school.bean.Msg;
import test.school.bean.Permission;
import test.school.bean.Role;
import test.school.service.PermissionService;
import test.school.service.RolePermissionService;
import test.school.service.RoleService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleController {
    @Autowired
    RoleService roleService;
    @Autowired
    RolePermissionService rolePermissionService;
    @Autowired
    PermissionService permissionService;

    @GetMapping("listRole")
    public Msg list() {
        try {
            List<Role> rs = roleService.list();
            Map<Role, List<Permission>> role_permissions = new HashMap<>();

            for (Role role : rs) {
                List<Permission> ps = permissionService.list(role);
                role_permissions.put(role, ps);
            }
            return new Msg(role_permissions);
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("查询失败", 401);
        }
    }

    @GetMapping("editRole")
    public Msg list(@RequestParam("rid") Integer rid) {
        try {
            Map<String, List<Permission>> permission_list = new HashMap<>();
            Role role = roleService.get(rid);
            List<Permission> ps = permissionService.list();
            List<Permission> currentPermissions = permissionService.list(role);
            permission_list.put("all_permission", ps);   //全部权限（用于展示）
            permission_list.put("role_permission", currentPermissions);  //该角色的权限（用于默认选中）
            return new Msg(permission_list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("查询指定角色失败", 401);
        }
    }

    @DeleteMapping("deleteRole")
    public Msg delete(@RequestParam("rid") Integer rid) {
        try {
            roleService.delete(rid);
            return new Msg();
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("删除指定角色失败", 401);
        }
    }

    @PutMapping("updateRole")
    public Msg update(@RequestBody Role role, @RequestParam("permissionIds") Integer[] permissionIds) {
        try {
            rolePermissionService.setPermissions(role, permissionIds);
            roleService.update(role);
            return new Msg();
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("更新指定角色失败", 401);
        }
    }

    @PostMapping("addRole")
    public Msg add(@RequestBody Role role) {
        try {
            roleService.add(role);
            return new Msg();
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("添加指定角色信息失败", 401);
        }
    }
}

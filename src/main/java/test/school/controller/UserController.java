package test.school.controller;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.school.bean.Msg;
import test.school.bean.Role;
import test.school.bean.User;
import test.school.service.RoleService;
import test.school.service.UserRoleService;
import test.school.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserRoleService userRoleService;
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    @GetMapping("listUser")
    public Msg list() {  //所有用户
        try {
            List<User> us = userService.list();
            Map<User, List<Role>> user_roles = new HashMap<>();
            for (User user : us) {
                List<Role> roles = roleService.listRoles(user);
                user_roles.put(user, roles);
            }
            return new Msg(user_roles);
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("查询失败", 401);
        }
    }

    @GetMapping("editUser")
    public Msg edit(@RequestParam("uid") Integer uid) {  //指定其中一个用户
        try {
            Map<String, List<Role>> role_list = new HashMap<>();
            List<Role> rs = roleService.list();
            User user = userService.get(uid);
            List<Role> roles = roleService.listRoles(user);
            role_list.put("all_role", rs);   //全部角色
            role_list.put("user_role", roles);  //用户的角色
            return new Msg(role_list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("查询指定用户失败", 401);
        }
    }

    @DeleteMapping("deleteUser")
    public Msg delete(@RequestParam("uid") Integer uid) {
        try {
            userService.delete(uid);
            return new Msg();
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("删除指定用户失败", 401);
        }
    }

    @PutMapping("updateUser")
    public Msg update(@RequestBody User user, @RequestParam("roleIds") Integer[] roleIds) { //更改用户权限(传数组)、密码
        try {
            userRoleService.setRoles(user, roleIds);
            String password = user.getPassword();
            // 如果在修改的时候没有设置密码，就表示不改动密码,改了密码要重新加盐生成新的加密密钥
            if (user.getPassword().length() != 0) {
                String salt = new SecureRandomNumberGenerator().nextBytes().toString();
                int times = 2;  //2次加密
                String algorithmName = "md5";
                String encodedPassword = new SimpleHash(algorithmName, password, salt, times).toString();
                user.setSalt(salt);
                user.setPassword(encodedPassword);
            } else {
                user.setPassword(null); //所调用的更新方法只更新不为null的属性
            }
            userService.update(user);
            return new Msg();
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("更新指定用户信息失败", 401);
        }
    }

    @PostMapping("addUser")
    public Msg add(@RequestParam("username") String username, @RequestParam("password") String password) {
        try {
            String salt = new SecureRandomNumberGenerator().nextBytes().toString();
            int times = 2;
            String algorithmName = "md5";
            String encodedPassword = new SimpleHash(algorithmName, password, salt, times).toString();

            User u = new User();
            u.setUsername(username);
            u.setPassword(encodedPassword);
            u.setSalt(salt);
            userService.add(u);
            return new Msg();
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("添加指定用户信息失败", 401);
        }
    }

}

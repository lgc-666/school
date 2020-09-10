package test.school.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import test.school.bean.*;
import test.school.dao.PermissionMapper;
import test.school.dao.RoleMapper;
import test.school.dao.RolePermissionMapper;
import test.school.dao.UserMapper;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 这里为了方便我把实现层给省去了
 */
@Service
public class PermissionService {
    @Autowired
    PermissionMapper permissionMapper;
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    RolePermissionMapper rolePermissionMapper;
    @Autowired
    RoleMapper roleMapper;

    public Set<String> listPermissions(String userName) {
        Set<String> result = new HashSet<>();  //对结果进行去重
        List<Role> roles = roleService.listRoles(userName);

        List<RolePermission> rolePermissions = new ArrayList<>();

        for (Role role : roles) {
            RolePermissionExample example = new RolePermissionExample();
            example.createCriteria().andRidEqualTo(role.getRid());
            List<RolePermission> rps = rolePermissionMapper.selectByExample(example);
            rolePermissions.addAll(rps);
        }

        for (RolePermission rolePermission : rolePermissions) {
            Permission p = permissionMapper.selectByPrimaryKey(rolePermission.getPid());
            if(p.getUrl()!=null)
               result.add(p.getUrl());
        }

        return result;
    }


    public void add(Permission u) {
        permissionMapper.insert(u);
    }


    public void delete(Integer id) {
        permissionMapper.deleteByPrimaryKey(id);
    }


    public void update(Permission u) {
        permissionMapper.updateByPrimaryKeySelective(u);
    }


    public Permission get(Integer id) {
        return permissionMapper.selectByPrimaryKey(id);
    }


    public List<Permission> list() {
        PermissionExample example = new PermissionExample();
        //example.setOrderByClause("pid desc");
        return permissionMapper.selectByExample(example);

    }


    public List<Permission> list(Role role) {
        List<Permission> result = new ArrayList<>();
        RolePermissionExample example = new RolePermissionExample();
        example.createCriteria().andRidEqualTo(role.getRid());
        List<RolePermission> rps = rolePermissionMapper.selectByExample(example);
        for (RolePermission rolePermission : rps) {
            result.add(permissionMapper.selectByPrimaryKey(rolePermission.getPid()));
        }

        return result;
    }


    public boolean needInterceptor(String requestURI) { //判断url是否需要拦截
        List<Permission> ps = list();
        for (Permission p : ps) {
            if(p.getUrl()!=null)
            if (p.getUrl().equals(requestURI))
                System.out.println("url在权限中存在");
                return true;
        }
        System.out.println("url在权限中不存在");
        return false;
    }


    public Set<String> listPermissionURLs(String userName) {  //获取某角色拥有的url
        Set<String> result = new HashSet<>();
        List<Role> roles = roleService.listRoles(userName);

        List<RolePermission> rolePermissions = new ArrayList<>();

        for (Role role : roles) {
            RolePermissionExample example = new RolePermissionExample();
            example.createCriteria().andRidEqualTo(role.getRid());
            List<RolePermission> rps = rolePermissionMapper.selectByExample(example);
            rolePermissions.addAll(rps);
        }

        for (RolePermission rolePermission : rolePermissions) {
            Permission p = permissionMapper.selectByPrimaryKey(rolePermission.getPid());
            if(p.getUrl()!=null){
                result.add(p.getUrl());
            }
        }
        System.out.println(result);
        return result;
    }

    public List<Permission> getmenuByuserid(String roledesc) {
        System.out.println("session中："+roledesc);
        RoleExample example = new RoleExample();
        example.createCriteria().andDescEqualTo(roledesc);
        List<Role> rps = roleMapper.selectByExample(example);
        return permissionMapper.getmenuByuserid(rps.get(0).getRid());
    }
}

package test.school.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.school.bean.Role;
import test.school.bean.User;
import test.school.service.RoleService;
import test.school.service.UserService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoleControllerTest {

    UserService userService = new UserService();
    @Test
    void list() {
        try {
            List<User> rs = userService.list();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package test.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.school.bean.Msg;
import test.school.bean.RegisterApproval;
import test.school.bean.User;
import test.school.service.RegisterApprovalService;

import java.util.List;

@RestController
public class RegisterApprovalController {
    @Autowired
    RegisterApprovalService registerApprovalService;

    @GetMapping("/listregisterApproval")
    public Msg list() {  //所有用户
        try {
            List<RegisterApproval> us = registerApprovalService.list();
            return new Msg(us);
        } catch (Exception e) {
            e.printStackTrace();
            return new Msg("查询失败", 401);
        }
    }
}

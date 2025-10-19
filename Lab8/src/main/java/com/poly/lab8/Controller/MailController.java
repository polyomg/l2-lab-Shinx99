package com.poly.lab8.Controller;

import com.poly.lab8.Service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MailController {

    @Autowired
    MailService mailService;

    @ResponseBody
    @RequestMapping("/mail/send")
    public String send() {
        mailService.push("nguyennam.zarakhan@gmail.com", "Subject", "heloo bạn nhé");
        return "Mail đã được xếp vào hàng đợi";
    }
}

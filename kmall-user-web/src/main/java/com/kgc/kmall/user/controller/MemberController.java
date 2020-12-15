package com.kgc.kmall.user.controller;

import com.kgc.kmall.bean.Member;
import com.kgc.kmall.service.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {


    @Reference
    MemberService memberService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Member> list(){
        List<Member> members = memberService.selectAllMember();

        return members;
    }
}

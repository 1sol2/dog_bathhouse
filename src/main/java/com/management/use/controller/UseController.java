package com.management.use.controller;

import com.common.SearchCondition;
import com.management.member.model.dto.MemberDTO;
import com.management.member.model.service.MemberService;
import com.management.member.view.MemberPrint;

import java.util.List;
import java.util.Map;

public class UseController {


    private final MemberPrint memberPrint;
    private final MemberService memberService;

    public UseController() {
        memberPrint = new MemberPrint();
        memberService = new MemberService();
    }

}

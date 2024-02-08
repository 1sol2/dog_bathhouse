package com.management.member.controller;

import com.common.SearchCondition;
import com.management.facility.view.FacilityMenu;
import com.management.member.model.dto.MemberDTO;
import com.management.member.model.service.MemberService;
import com.management.member.view.MemberPrint;

import java.util.List;
import java.util.Map;

public class MemberController {


    private final MemberPrint memberPrint;
    private final MemberService memberService;

    public MemberController() {
        memberPrint = new MemberPrint();
        memberService = new MemberService();
    }

    public void modifyMemberInfo(MemberDTO member) {
//        member.setReleaseDate(member.getReleaseDate().replaceAll("-",""));

//        if(memberService.modifyProductInfo(member)) {
//            memberPrint.printSuccessMessage("modifyMember");
//        } else {
//            memberPrint.printErrorMessage("modifyMember");
//        }
    }
}

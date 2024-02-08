package com.management.member.view;

import com.common.SearchCondition;
import com.management.facility.controller.FacilityController;
import com.management.facility.view.FacilityMenu;
import com.management.member.controller.MemberController;
import com.management.member.model.dto.MemberDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberMenu {

    public void memberdisplayMenu() {
        Scanner sc = new Scanner(System.in);
        MemberController memberController = new MemberController();

        do {
            System.out.println("========  ========");
            System.out.println("===================================");
            System.out.println("1. 시설 둘러보기");
            System.out.println("2. 회원 정보 변경");
            System.out.println("9. 이전 메뉴로 이동");
            System.out.println("===================================");
            System.out.println("원하는 메뉴의 번호를 입력해 주세요 : ");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : new FacilityMenu().facilityDisplayMenu(); break;
                case 2 : memberController.modifyMemberInfo(inputModifyMemberInfo()); break;
                case 9 : System.out.println("========상위 메뉴로 이동합니다.========"); return;
                default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
            }

        } while(true);
    }
    private static MemberDTO inputModifyMemberInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("수정할 제품 정보를 입력하세요. ");
        System.out.println("수정을 원하지 않는 정보는 SKIP을 입력하세요.");
        System.out.println("===================================");
        System.out.println("수정 대상 제품코드를 입력해 주세요 : ");
        String memberCode = sc.nextLine();

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMembCode(Integer.parseInt(memberCode));


        return memberDTO;
    }
}

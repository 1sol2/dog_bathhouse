package com.management.facility.view;

import com.common.SearchCondition;
import com.management.facility.controller.FacilityController;
import com.management.facility.model.dto.FacilityDTO;
import com.management.member.controller.MemberController;
import com.management.use.controller.UseController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityMenu {

    public void facilityDisplayMenu() {
        Scanner sc = new Scanner(System.in);
        FacilityController facilityController = new FacilityController();

        do {
            System.out.println("======== 시설 둘러보기 ========");
            System.out.println("===================================");
            System.out.println("1. 시설 전체 조회");
            System.out.println("2. 시설 상세 정보 조회");
            System.out.println("3. 시설 대여하기");
            System.out.println("9. 이전 메뉴로 이동");
            System.out.println("===================================");
            System.out.println("원하는 관리 메뉴의 번호를 입력해 주세요 : ");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : facilityController.selectAllFacilityList(); break;
//                case 2 : memberController.(); break;
//                case 3 : useController.(); break;
                case 9 : System.out.println("========상위 메뉴로 이동합니다.========"); return;
                default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
            }

        } while(true);
    }
}

package com.management.facility.controller;

import com.common.SearchCondition;
import com.management.facility.model.dto.FacilityDTO;
import com.management.facility.model.service.FacilityService;
import com.management.facility.view.FacilityPrint;
import com.management.member.model.dto.MemberDTO;
import com.management.member.model.service.MemberService;
import com.management.member.view.MemberPrint;

import java.util.List;
import java.util.Map;

public class FacilityController {


    private final FacilityPrint facilityPrint;
    private final FacilityService facilityService;

    public FacilityController() {
        facilityPrint = new FacilityPrint();
        facilityService = new FacilityService();
    }

    public void selectAllFacilityList() {

        List<FacilityDTO> allFacilityList = facilityService.selectAllFacilityList();

        if(allFacilityList != null && !allFacilityList.isEmpty()) {
            facilityPrint.printAllProductList(allFacilityList);
        } else {
            facilityPrint.printErrorMessage("selectAllFacilityList");
        }

    }

}

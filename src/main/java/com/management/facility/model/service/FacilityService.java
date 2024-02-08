package com.management.facility.model.service;

import com.management.facility.model.dao.FacilityDAO;
import com.management.facility.model.dto.FacilityDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.common.Template.getSqlSession;

public class FacilityService {

    private FacilityDAO facilityDAO;

    public List<FacilityDTO> selectAllFacilityList() {

        SqlSession sqlSession = getSqlSession();
        facilityDAO = sqlSession.getMapper(FacilityDAO.class);

        List<FacilityDTO> allFacilityList = facilityDAO.selectAllFacilityList();

        sqlSession.close();

        return allFacilityList;

    }
}

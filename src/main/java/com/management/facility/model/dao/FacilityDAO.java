package com.management.facility.model.dao;


import com.management.facility.model.dto.FacilityDTO;

import java.util.List;

public interface FacilityDAO {

    List<FacilityDTO> selectAllFacilityList();
}

package com.management.member.model.service;

import com.common.SearchCondition;
import com.management.member.model.dao.MemberDAO;
import com.management.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class MemberService {

    private MemberDAO memberDAO;

}

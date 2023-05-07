package com.codemos.servletstudy.web.frontcontroller.v3.controller;

import com.codemos.servletstudy.domain.member.Member;
import com.codemos.servletstudy.domain.member.MemberRepository;
import com.codemos.servletstudy.web.frontcontroller.ModelView;
import com.codemos.servletstudy.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {
	private MemberRepository memberRepository = MemberRepository.getInstance();

	@Override
	public ModelView process(Map<String, String> paramMap) {
		String username = paramMap.get("username");
		int age = Integer.parseInt(paramMap.get("age"));

		Member member = new Member(username, age);
		memberRepository.save(member);

		ModelView mv = new ModelView("save-result");
		mv.getModel().put("member", member);
		return mv;
	}
}

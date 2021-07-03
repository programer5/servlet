package hello.servlet.web.frontcontroller.v3.controller;

import java.util.List;
import java.util.Map;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModalView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModalView process(Map<String, String> paramMap) {

        List<Member> members = memberRepository.findAll();
        ModalView mv = new ModalView("members");
        mv.getModel().put("members", members);
        return mv;
    }
    
}

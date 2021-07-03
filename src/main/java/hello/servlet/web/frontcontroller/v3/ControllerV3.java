package hello.servlet.web.frontcontroller.v3;

import java.util.Map;

import hello.servlet.web.frontcontroller.ModalView;

public interface ControllerV3 {
    
    ModalView process(Map<String, String> paramMap);
}

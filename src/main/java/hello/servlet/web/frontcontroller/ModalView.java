package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ModalView {
    private String viewName;
    private Map<String, Object> model = new HashMap<>();
    
    public ModalView(String viewName) {
        this.viewName = viewName;
    }

    
}

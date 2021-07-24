package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


// 스프링 빈으로 등록
// @Component
// RequestMappingHandlerMapping, isHandler?
// @Controller나 @RequestMapping이 Class레벨에 있으면 맵핑의 대상이 됨
// @RequestMapping

// 내부에 이미 @Component가 있음, 스프링이 자동으로 맵핑 대상으로 인식함.
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}

package com.brocoding.nodragons.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by X086353 on 1/6/2016.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView viewIndexPage() {
        return new ModelAndView("/webjars/html/index.html");
    }
}

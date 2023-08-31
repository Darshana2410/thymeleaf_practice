package com.example.EmployeeApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller to test boolean expressions
 * 
 */
@Controller
public class ConditionalRendering_Controller {

    @RequestMapping(value = "conditions", method = RequestMethod.GET)
    public String getDates(Model model) {
        // true values
        model.addAttribute("trueValue", true);
        model.addAttribute("one", 1);
        model.addAttribute("nonZeroCharacter", 'a');
        model.addAttribute("object", new Object());
 
        // false values
        model.addAttribute("nullValue", null);
        model.addAttribute("falseValue", false);
        model.addAttribute("zeroCharacter", '\0');
 
        
        model.addAttribute("isRaining", true);
        model.addAttribute("isSunny", true);
        model.addAttribute("isCold", false);
        model.addAttribute("isWarm", false);

        return "conditions";
    }
}
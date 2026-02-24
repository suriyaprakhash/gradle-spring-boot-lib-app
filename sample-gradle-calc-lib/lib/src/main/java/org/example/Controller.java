package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Calc calc;

    @GetMapping("/add")
    public int add(@RequestParam int[] ids) {
        return calc.add(ids);
    }

    @GetMapping("/sub")
    public int sub(@RequestParam int[] ids) {
        return calc.sub(ids);
    }

}

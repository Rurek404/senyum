package com.senyum.senyum.api;

import com.senyum.senyum.api.przypomnienie.JasiekClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<Void> test() {

        JasiekClass jasiekClass = new JasiekClass();

        String greetings = jasiekClass.greetings();

        System.out.println(greetings);

        int addition = jasiekClass.addition(5, 10);
        System.out.println(addition);

        jasiekClass.showAllNumbersInRange(5, 25);

        int sum_from_0 = jasiekClass.sumFrom0(3);
        System.out.println(sum_from_0);

        int a = 8;
        System.out.print(a + " binarnie to ");
        jasiekClass.toBin(a);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/test2")
    public ResponseEntity<Void> test2() {
        System.out.println("TEST 2 works!");

        return ResponseEntity.ok().build();
    }
}

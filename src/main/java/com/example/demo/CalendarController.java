package com.example.demo; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 👈 중요! 얘는 "화면(HTML)"을 보여주는 담당자입니다.
public class CalendarController {

    @GetMapping("/calendar") // 주소창에 "/calendar"라고 치면
    public String showCalendar() {
        return "calendar"; // templates 폴더의 "calendar.html"을 보여줘라!
    }
}
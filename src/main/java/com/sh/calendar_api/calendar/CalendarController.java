package com.sh.calendar_api.calendar;

import org.springframework.web.bind.annotation.*;

import java.util.List;

// API 제공 ( 프론트 엔드로 서비스 기능 전달 )
// 함수 호출부(main)와 유사
// main: controller, funcs: service, class: domain, DB: repository에 있다

@RestController // json 반환: RestController, html 반환: Controller
@RequestMapping("/api/calendar")
public class CalendarController {

    private final CalendarService calendarService; // 권한 검사 담당할 객체 생성

    public CalendarController(CalendarService calendarService) { this.calendarService = calendarService; }

    @GetMapping // HTTP GET 요청 처리 ( GET /api/calendar 요청 받기 )
    public List<CalendarEvent> list() { return calendarService.findAll(); }
}

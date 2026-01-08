package com.example.demo.controller;

import com.example.demo.domain.CalendarEvent;
import com.example.demo.service.CalendarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// API 제공 ( 프론트 엔드로 서비스 기능 전달 )
@RestController // html 반환: Controller, json 반환: RestController
@RequestMapping("/api/calendar")
// @CrossOrigin(origins = "http://localhost:5173")
public class CalendarApiController {

    private final CalendarService calendarService; // 권한 검사 담당할 객체 생성

    public CalendarApiController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping // HTTP GET 요청 처리 ( GET /api/calendar 요청 받기 )
    public List<CalendarEvent> list() {
        return calendarService.findAll();
    }
}

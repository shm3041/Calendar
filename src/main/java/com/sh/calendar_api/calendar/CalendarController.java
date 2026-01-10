package com.sh.calendar_api.calendar;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// API 제공 ( 프론트 엔드로 서비스 기능 전달 )
// 함수 호출부(main)와 유사
// main: controller, funcs: service, class: domain, DB: repository에 있다

// json 반환: RestController, html 반환: Controller
@RestController
@RequestMapping("/api/calendar")
@CrossOrigin(origins = "http://localhost:5173")
public class CalendarController {

    private final CalendarService calendarService;

    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping
    public List<CalendarEvent> getEvents() {
        return calendarService.findAll();
    }

    @PostMapping
    public CalendarEvent addEvent(@RequestBody CalendarEvent event) {
        return calendarService.save(event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable String id) {
        calendarService.deleteById(id);
    }
}
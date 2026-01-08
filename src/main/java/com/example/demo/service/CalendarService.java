package com.example.demo.service;

import com.example.demo.domain.CalendarEvent;
import org.springframework.stereotype.Service;

import java.util.List;

// 비즈니스 로직 ( 권한 검증 )
@Service
public class CalendarService {

    public List<CalendarEvent> findAll() {
        // 나중에 DB, 권한, 검증 로직
        return List.of(
                new CalendarEvent(1L, "회의"),
                new CalendarEvent(2L, "공부")
        );
    }
}

package com.sh.calendar_api.service;

import com.sh.calendar_api.domain.CalendarEvent;
import org.springframework.stereotype.Service;

import java.util.List;

// 비즈니스 로직 ( 권한 검증 )
// 함수 구현부(func)와 유사
@Service
public class CalendarService {

    public List<CalendarEvent> findAll() {
        // TODO: DB, 권한, 검증 로직 추가할 것
        return List.of(
                new CalendarEvent(1L, "회의"),
                new CalendarEvent(2L, "공부")
        );
    }
}

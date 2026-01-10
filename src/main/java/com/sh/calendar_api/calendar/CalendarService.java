package com.sh.calendar_api.calendar;

import com.sh.calendar_api.calendar.CalendarService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CalendarService {

    // 임시 저장소 (DB 전 단계)
    private final List<CalendarEvent> events = new ArrayList<>();

    // 전체 조회
    public List<CalendarEvent> findAll() {
        return events;
    }

    // 일정 추가
    public CalendarEvent save(CalendarEvent event) {
        event.setId(UUID.randomUUID().toString());
        events.add(event);
        return event;
    }

    // 일정 삭제
    public void deleteById(String id) {
        events.removeIf(e -> e.getId().equals(id));
    }
}
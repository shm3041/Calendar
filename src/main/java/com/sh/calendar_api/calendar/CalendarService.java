package com.sh.calendar_api.calendar;

import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class CalendarService {

    private final List<CalendarEventDto> events = new ArrayList<>();

    public CalendarService() {
        CalendarEventDto sample = new CalendarEventDto();
        sample.setId("1");
        sample.setTitle("첫 일정");
        sample.setDate("2026-01-10");
        events.add(sample);
    }

    public List<CalendarEventDto> findAll() {
        return events;
    }

    public CalendarEventDto add(CalendarEventDto event) {
        event.setId(UUID.randomUUID().toString());
        events.add(event);
        return event;
    }
}

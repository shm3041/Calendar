package com.sh.calendar_api.calendar;

import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class CalendarService {

    private final List<CalendarEventDto> events = new ArrayList<>();

    public List<CalendarEventDto> findAll() {
        return events;
    }

    public CalendarEventDto add(CalendarEventDto event) {
        event.setId(UUID.randomUUID().toString());
        events.add(event);
        return event;
    }
}
package com.sh.calendar_api.calendar;

// 데이터 구조 정의 ( 받을 데이터 형식 정의 )
// 함수 구현부(func)에서 사용할 class, struct

public class CalendarEvent {
    public enum EventType { HIGH, MEDIUM, LOW }

    private Long id;
    private String title;
    private String memo;
    private EventType memoPriority;

    public CalendarEvent(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
}

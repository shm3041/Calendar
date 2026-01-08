package com.example.demo.domain;

// 데이터 구조 정의 ( 받을 데이터 형식 정의 )
public class CalendarEvent {
    private Long id;
    private String title;

    public CalendarEvent(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
}

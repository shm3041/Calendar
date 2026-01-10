package com.sh.calendar_api.calendar;

// 데이터 구조 정의 ( 받을 데이터 형식 정의 )
// 함수 구현부(func)에서 사용할 class, struct

public class CalendarEvent {

    private String id;
    private String title;
    private String date; // yyyy-MM-dd

    // getter / setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

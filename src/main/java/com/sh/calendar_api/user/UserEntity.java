package com.sh.calendar_api.user;

//import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

//@Entity
//@Table(name = "users")
public class UserEntity {
    // 식별 & 인증
    private Long id;
    private String email;
    private String password;

    // 계정 상태
    private UserRole role; // 역할 User Admin
    private UserStatus status; // 상태 1:활성화 2:비활성화 3:탈퇴

    // 감사 로그용   At 뜻:시간/시점
    private LocalDateTime createdAt; // 계정 생성 일시
    private LocalDateTime updatedAt; // 계정 프로필 업데이트 일시
    private LocalDateTime deletedAt; // 계정 삭제 일시
    private LocalDateTime lastLoginAt; // 마지막 로그인 일시
    private String lastLoginIp; // 마지막 로그인 IP

    // 사용자 정보
    private String name;
    private String phoneNumber;
    private LocalDate birthday;
}

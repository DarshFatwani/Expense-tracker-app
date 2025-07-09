package com.example.Authservice.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserInfoDto {

    private String userId;

    private String username;   // AuthService only

    private String password;   // AuthService only

    private String firstName;

    private String lastName;

    private Long phoneNumber;

    private String email;

    private String profilePic;
}

package com.codingshuttle.project.uber.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthSignupDTO {
   private String name;
   private String email;
   private String password;
}

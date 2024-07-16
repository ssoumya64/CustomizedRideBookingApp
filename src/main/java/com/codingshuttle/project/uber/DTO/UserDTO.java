package com.codingshuttle.project.uber.DTO;

import com.codingshuttle.project.uber.Entities.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String name;
    private String email;
    private String password;
    private Set<Roles> roles;
}

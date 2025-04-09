package net.javaguides.ems.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}

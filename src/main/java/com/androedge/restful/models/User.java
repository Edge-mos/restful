package com.androedge.restful.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    @Size(min = 2, max = 255, message = "Name should be between 2 and 255 characters")
    private String name;

    @Past(message = "BirthDate should be in past")
    private Date birthDate;

}

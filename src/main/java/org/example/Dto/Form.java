package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Form {

    private Long id;
    private String name;
    private String phoneNumber;
    private String gender;
    private Date date;
    private String type;


}

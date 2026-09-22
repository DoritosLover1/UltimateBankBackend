package com.bankserver.backendbankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInformationsDto {
    private long customerId;
    private String firstName;
    private String secondName;
    private Date birthDate;
    private String address;
    private String phoneNumber;
}

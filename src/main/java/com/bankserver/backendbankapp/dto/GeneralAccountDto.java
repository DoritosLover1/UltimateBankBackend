package com.bankserver.backendbankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeneralAccountDto {
    private long generalAccountId;
    private BigDecimal generalAccountBalance;
    private String generalAccountIBAN;
    private long accountId;
}


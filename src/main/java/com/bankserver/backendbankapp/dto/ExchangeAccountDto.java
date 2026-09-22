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
public class ExchangeAccountDto {
    private long exchangeAccountId;
    private BigDecimal exchangeAccountBalance;
    private String exchangeAccountIBAN;
    private long accountId;
}

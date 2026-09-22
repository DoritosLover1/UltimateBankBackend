package com.bankserver.backendbankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DebitCardDto {
    private long debitCardId;
    private BigDecimal debitCardBalance;
    private Date debitCardDate;
    private String debitCardCcv;
    private String debitCardNumber;
    private long accountId;
}

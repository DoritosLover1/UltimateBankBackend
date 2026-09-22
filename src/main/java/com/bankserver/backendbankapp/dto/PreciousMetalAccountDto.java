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
public class PreciousMetalAccountDto {
    private long pmetalAccountId;
    private BigDecimal pmetalGoldBalance;
    private BigDecimal  pmetalSilvereBalance;
    private long accountId;
}

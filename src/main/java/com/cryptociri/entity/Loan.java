package com.cryptociri.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString

public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loanId;
    private Double loanCryptoCollateral;
    private Double eligibleLoanAmt;
    private Double requestedLoanAmt;

}

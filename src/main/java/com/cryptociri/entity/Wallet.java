package com.cryptociri.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString

public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long assetId;
    private String assetName;
    private String assetSymbol;
    @Getter
    private Double assetBalance;
    @Column(name = "crypto")
    private String cryptoName;
    private Double requiredLoanAmt;
    private Double cryptoCollateralAmt;
    private Double eligibleAmt;

}

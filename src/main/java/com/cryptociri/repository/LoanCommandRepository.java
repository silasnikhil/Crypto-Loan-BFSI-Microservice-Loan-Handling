package com.cryptociri.repository;

import com.cryptociri.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface LoanCommandRepository extends JpaRepository<Wallet, Long> {

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE wallet SET required_loan_amt =:loan, asset_balance=asset_balance+:loan WHERE (asset_id = 2)", nativeQuery = true)
    void getLoan(@Param("loan") Double LoanAmt);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE wallet SET asset_balance=asset_balance-:cryptoAmt WHERE (crypto LIKE :cryptoName)", nativeQuery = true)
    void getCrypto(@Param("cryptoAmt") Double cryptoCollateralAmt,@Param("cryptoName") String cryptoName);
}

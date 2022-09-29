package com.cryptociri.repository;

import com.cryptociri.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletQueryRepository extends JpaRepository<Wallet, Long> {
}

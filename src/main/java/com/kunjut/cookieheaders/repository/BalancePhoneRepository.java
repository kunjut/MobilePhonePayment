package com.kunjut.cookieheaders.repository;

import com.kunjut.cookieheaders.entity.BalancePhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Vadim Dimnich
 */
@Repository
public interface BalancePhoneRepository extends JpaRepository<BalancePhoneEntity, Long> {
    BalancePhoneEntity findAllByNumberPhone(Integer number_phone);

    List<BalancePhoneEntity> findAllByNameCustomer(String name_customer);
}

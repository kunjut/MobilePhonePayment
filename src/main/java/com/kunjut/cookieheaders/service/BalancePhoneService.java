package com.kunjut.cookieheaders.service;

import com.kunjut.cookieheaders.entity.BalancePhoneEntity;
import com.kunjut.cookieheaders.repository.BalancePhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vadim Dimnich
 */
@Service
@RequiredArgsConstructor
public class BalancePhoneService {
    private final BalancePhoneRepository balancePhoneRepository;

    public void saveAll(List<BalancePhoneEntity> balancePhoneEntity) {
        balancePhoneRepository.saveAll(balancePhoneEntity);
    }

    public List<BalancePhoneEntity> findAll() {
        return balancePhoneRepository.findAll();
    }

    public BalancePhoneEntity findById(Long id) {
        return balancePhoneRepository.findById(id)
                .orElse(new BalancePhoneEntity());
    }

    public BalancePhoneEntity findByNumberPhone(Integer number_phone) {
        return balancePhoneRepository.findAllByNumberPhone(number_phone);
    }

    public List<BalancePhoneEntity> findByNameCustomer(String name_customer) {
        return balancePhoneRepository.findAllByNameCustomer(name_customer);
    }
}

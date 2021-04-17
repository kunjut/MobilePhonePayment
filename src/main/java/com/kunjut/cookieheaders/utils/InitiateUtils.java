package com.kunjut.cookieheaders.utils;

import com.kunjut.cookieheaders.entity.BalancePhoneEntity;
import com.kunjut.cookieheaders.repository.BalancePhoneRepository;
import com.kunjut.cookieheaders.service.BalancePhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vadim Dimnich
 */
@Service
@RequiredArgsConstructor
public class InitiateUtils implements CommandLineRunner {

    private final BalancePhoneService balancePhoneService;

    @Override
    public void run(String... args) throws Exception {
        // инициализируем таблицу с продуктами
        // так написано благодаря @Accessors(chain = true)
        List<BalancePhoneEntity> list = new ArrayList<>(
                Arrays.asList(
                    new BalancePhoneEntity()
                        .setNumberPhone(555111)
                        .setNameCustomer("Vader")
                        .setBalance(500),
                    new BalancePhoneEntity()
                            .setNumberPhone(111222)
                            .setNameCustomer("Darth")
                            .setBalance(250),
                    new BalancePhoneEntity()
                            .setNumberPhone(8967309)
                            .setNameCustomer("Vader")
                            .setBalance(750)
                )
        );

        balancePhoneService.saveAll(list);
        System.out.println(list);

        List<BalancePhoneEntity> findAll = balancePhoneService.findAll();
        System.out.println(findAll);

        System.out.println("Поиск по id: " + balancePhoneService.findById(2L));
        System.out.println("Поиск по номеру 8967309: " + balancePhoneService.findByNumberPhone(8967309));
        System.out.println("Поиск по имени: " + balancePhoneService.findByNameCustomer("Vader"));

    }
}

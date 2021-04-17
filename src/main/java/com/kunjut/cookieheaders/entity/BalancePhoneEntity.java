package com.kunjut.cookieheaders.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vadim Dimnich
 */
@Accessors(chain = true)
@Entity
@Data
@Table(name = "balance_phone")
public class BalancePhoneEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "number_phone")
    Integer numberPhone;

    @Column(name = "number_customer")
    String nameCustomer;

    @Column(name = "balance")
    Integer balance;
}

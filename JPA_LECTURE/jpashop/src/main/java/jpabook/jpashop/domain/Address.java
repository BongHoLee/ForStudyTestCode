package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import lombok.Getter;

// JPA의 내장 타입
// DDD에서의 Value type
@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}

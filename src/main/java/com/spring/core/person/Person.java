package com.spring.core.person;

import lombok.*;

@Setter @Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
//@Data // 위의 내용을 전부 만들어 주지만, 선택에 의해 기능을 구현할 수 있으므로 실무에선 자제
public class Person {

    private String nickName;
    private String address;
    private int age;


}

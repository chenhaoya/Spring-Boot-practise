package com.ch;

import com.ch.pojo.Dog;
import com.ch.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringBoot02ConfigApplicationTests {

    /**装配狗对象*/
    @Autowired
//    @Qualifier 如果有多个独对象，通过这个注解指定某一个狗对象
    private Dog dog;

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}

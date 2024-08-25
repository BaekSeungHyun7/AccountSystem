package com.example.account;

import org.junit.jupiter.api.Test;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class AccountApplicationTests {

    @MockBean
    private RedissonClient redissonClient;

    @Test
    void contextLoads() {
    }
}

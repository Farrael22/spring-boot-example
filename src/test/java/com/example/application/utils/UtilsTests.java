package com.example.application.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilsTests {

  @Test
	void SumNumbersTests() {
    var response = Utils.SumNumbers(2, 2);

    assertEquals(4, response);
	}
}

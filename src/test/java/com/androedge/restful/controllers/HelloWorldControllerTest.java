package com.androedge.restful.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HelloWorldControllerTest {

    @InjectMocks
    private HelloWorldController helloWorldController;


    @Test
    void test() {
        var result = helloWorldController.getMessageForGitTest();

        var expected = "just new message for git testing";

        assertThat(result)
                .isNotBlank()
                .isEqualTo(expected);
    }
}
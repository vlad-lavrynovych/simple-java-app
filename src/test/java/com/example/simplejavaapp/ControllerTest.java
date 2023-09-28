package com.example.simplejavaapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {

	@InjectMocks
	Controller controller = new Controller();

	@Test
	public void assertTest() {
		ReflectionTestUtils.setField(controller, "stage", "junit");

		assertEquals("junit", controller.getStage());
	}
}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
@GetMapping("colour")
public String name()
{
	String color="Blue";
	return "My favourite color is "+color;
}

}

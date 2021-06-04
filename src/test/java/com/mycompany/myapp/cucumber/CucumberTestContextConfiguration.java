package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.JhipsterSampleApplicationMonolith2App;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterSampleApplicationMonolith2App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

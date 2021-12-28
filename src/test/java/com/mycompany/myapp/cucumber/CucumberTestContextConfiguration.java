package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.BugTrackerJhipsterApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = BugTrackerJhipsterApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

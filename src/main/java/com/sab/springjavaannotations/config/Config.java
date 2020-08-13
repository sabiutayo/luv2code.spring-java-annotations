package com.sab.springjavaannotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sab.springjavaannotations")
@PropertySource("application.properties")
public class Config {


}

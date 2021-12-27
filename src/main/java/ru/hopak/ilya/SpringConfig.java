package ru.hopak.ilya;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.hopak.ilya")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}

package com.szasza.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by szasza on 2016. 02. 05..
 */

@Configuration
 @EnableAutoConfiguration
 @EntityScan(basePackages = {"com.szasza.entity"})
 @EnableJpaRepositories(basePackages = {"com.szasza.repositories"})
 @EnableTransactionManagement
 public class RepositoryConfiguration {
}
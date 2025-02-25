package org.fd.ase.grp15.ase_user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
public class AseUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AseUserServiceApplication.class, args);
    }

}

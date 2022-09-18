package com.hamitmizrak.layer.bean;


import com.hamitmizrak.layer.data.entity.RegisterEntity;
import com.hamitmizrak.layer.data.repository.IRegisterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterReadyData {


    @Bean
    CommandLineRunner createRegister(IRegisterRepository repository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                for (int i = 1; i <=5 ; i++) {
                    RegisterEntity entity=RegisterEntity.builder()
                            .name("adi "+i)
                            .surname("soyadi "+i)
                            .email("email "+i)
                            .password("password"+i)
                            .build();
                    repository.save(entity);
                }
            }
        };
    }
}

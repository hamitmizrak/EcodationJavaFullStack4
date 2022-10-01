package com.hamitmizrak.layer.bean;

import com.hamitmizrak.layer.data.entity.RegisterEntity;
import com.hamitmizrak.layer.data.repository.IRegisterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class RegisterDataSet {

    public int randomString(){
        Random random=new Random();
        int number=random.nextInt(10000)+1;
        return number;
    }

    //1.YOL(DATA SET
    @Bean
    CommandLineRunner createRegisterPath1(IRegisterRepository repository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                for (int i = 1; i <= 5; i++) {
                    RegisterEntity entity = RegisterEntity.builder()
                            .name("adi " + i)
                            .surname("soyadi " + i)
                            .email("email " + i)
                            .password("password" + randomString())
                            .build();
                    repository.save(entity);
                }
            }
        };
    }

    //2.YOL(DATA SET
    //Lambda Expression: Tek metotlu interface için kullanacağız az kod çok iş mantığıdır.
    @Bean
    CommandLineRunner createRegisterPath2(IRegisterRepository repository) {
        return (args) -> {
            for (int i = 6; i <= 10; i++) {
                RegisterEntity entity = RegisterEntity.builder()
                        .name("adi " + i)
                        .surname("soyadi " + i)
                        .email("email " + i)
                        .password("password" + i)
                        .build();
                repository.save(entity);
            }
        };
    }
}

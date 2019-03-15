package com.yela;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yela.mapper.MessageRepository;
import com.yela.model.Message;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MappedTypes(Message.class)
@MapperScan("com.yela.mapper")
@SpringBootApplication
public class SpringWebApplication implements CommandLineRunner{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MessageRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Message id 1 -> {}", repository.findById(1));

    }
}
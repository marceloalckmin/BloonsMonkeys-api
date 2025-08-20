package com.example.bloonsmonkey_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bloonsmonkey_api.repository.BloonsMonkeyRepository;
import com.example.bloonsmonkey_api.model.BloonsMonkey;



@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BloonsMonkeyRepository repository){
        return args -> {
            log.info("Preloading " + repository.save(new BloonsMonkey("Macaco Dardo", "Um macaco que atira dardos em baloes", "Afiado", 1)));
            log.info("Preloading " + repository.save(new BloonsMonkey("Macaco Sniper", "Um macaco que atira balas calibre 50 em baloes", "Perfurante", 10)));
        };
    }

}

package daggerok.vault.client;

import daggerok.fallback.FallbackConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Slf4j
@SpringBootApplication
@Import(FallbackConfig.class)
public class Main {

  public static void main(String[] args) {
    log.info("bootstrapping...");
    SpringApplication.run(Main.class, args);
  }
}

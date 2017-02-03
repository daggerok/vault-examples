package daggerok.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@SpringBootApplication
public class FallbackConfig {

    public static void main(String[] args) {
        log.info("bootRepackage stub");
    }

    @Bean
    public EmbeddedServletContainerCustomizer notFoundFallback() {
        return container -> container.addErrorPages(new ErrorPage(NOT_FOUND, "/404"));
    }
}

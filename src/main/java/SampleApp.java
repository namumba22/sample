import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dumin on 6/29/17.
 */


@Configuration
//@ComponentScan
@EnableAutoConfiguration
@RestController
@RequestMapping("/")
public class SampleApp {

    @RequestMapping(method = RequestMethod.GET)
    public String getStatus() {
        return "Hallow";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApp.class, args);
    }

}

package msahello.common;


import msahello.HelloApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { HelloApplication.class })
public class CucumberSpingConfiguration {
    
}

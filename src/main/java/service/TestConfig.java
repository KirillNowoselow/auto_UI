package service;

import org.aeonbits.owner.Config;
import static org.aeonbits.owner.Config.Sources;

@Sources({"file:src/main/resources/config.properties"})
public interface TestConfig extends Config {
    @Key("baseUrl")
    String baseUrl();
}

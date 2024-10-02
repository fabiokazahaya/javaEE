package sibs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api") // Base URI for all resources
public class RestApplication extends Application {
    // No implementation needed, it's just a configuration class
}


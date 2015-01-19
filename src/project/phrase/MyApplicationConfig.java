package project.phrase;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("project.phrase")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("project.phrase");
    }
}
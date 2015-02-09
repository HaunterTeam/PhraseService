package project.phrase;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("phrase-service") /* project.phrase or phrase-service */
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("project.phrase");
    }
}
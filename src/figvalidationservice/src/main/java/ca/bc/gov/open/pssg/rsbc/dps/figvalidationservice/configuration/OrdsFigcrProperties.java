package ca.bc.gov.open.pssg.rsbc.dps.figvalidationservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * This class represents the Figaro Validation custom properties
 *
 * @author shaunmillargov
 *
 */
@ConfigurationProperties(prefix = "dpsvalidation.service.ords.figcr.client")
public class OrdsFigcrProperties {

    private String basepath;
    private String username;
    private String password;

    public String getBasepath() {
        return basepath;
    }

    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

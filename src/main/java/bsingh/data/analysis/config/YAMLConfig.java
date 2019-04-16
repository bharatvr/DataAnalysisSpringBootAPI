package bsingh.data.analysis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
* Class to convert configuration properties in java obejct.
*
* @author Bharatveer
* @version 1.0
* @since  2019-03-20 
*/

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {
	@Value("${app-config.env}")
	private String env;
	@Value("${spring.datasource.url}")
	private String dbURL;

	public String getEnv() {
		return env;
	}

	public String getDbURL() {
		return dbURL;
	}

}

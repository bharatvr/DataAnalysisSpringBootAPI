package bsingh.data.analysis.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public FilterRegistrationBean<RequestFilter> filterRegistrationBean() {
		FilterRegistrationBean<RequestFilter> registrationBean = new FilterRegistrationBean<RequestFilter>();
		RequestFilter requestFilter = new RequestFilter();

		registrationBean.setFilter(requestFilter);
		registrationBean.addUrlPatterns("/*");
		registrationBean.setOrder(1);
		return registrationBean;
	}
}

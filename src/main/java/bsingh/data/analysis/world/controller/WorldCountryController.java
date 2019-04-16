package bsingh.data.analysis.world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bsingh.data.analysis.config.YAMLConfig;
import bsingh.data.analysis.utils.ValueResult;

/**
 * Data analysis controller for country in world.
 *
 * @author Bharatveer
 * @version 1.0
 * @since 2019-03-20
 */

@RestController
public class WorldCountryController {

	@Autowired
	private YAMLConfig yamlConfig;

	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
	public ValueResult<String> healthCheck() {

		ValueResult<String> result = new ValueResult<>(
				"Great!, your service is up and running @ " + yamlConfig.getEnv());
		//result.setSuccess(Boolean.FALSE);
		return result;
	}

}

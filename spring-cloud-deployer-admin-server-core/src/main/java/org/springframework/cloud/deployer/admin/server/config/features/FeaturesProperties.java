/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.deployer.admin.server.config.features;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for all the features that need to be enabled/disabled at the dataflow server.
 *
 * @author Ilayaperumal Gopinathan
 */
@ConfigurationProperties(prefix = FeaturesProperties.FEATURES_PREFIX)
public class FeaturesProperties {

	public static final String FEATURES_PREFIX = "spring.cloud.dataflow.features";

}

/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.binder.gemfire.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for GemFire binder.
 *
 * @author Patrick Peralta
 */
@ConfigurationProperties(prefix = "spring.cloud.stream.gemfire.binder")
public class GemfireBinderConfigurationProperties extends GemfireProperties {

	/**
	 * Number of messages to process at a time.
	 */
	private int batchSize = 100;

	/**
	 * Default region type for message consumers (processor and sink modules).
	 */
	private String consumerRegionType = "PARTITION";

	/**
	 * Default region type for message producers (sources).
	 */
	private String producerRegionType = "PARTITION_PROXY";

	/**
	 * Flag for queue persistence.
	 */
	private boolean persistentQueue = false;

	public int getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	public String getConsumerRegionType() {
		return consumerRegionType;
	}

	public void setConsumerRegionType(String consumerRegionType) {
		this.consumerRegionType = consumerRegionType;
	}

	public String getProducerRegionType() {
		return producerRegionType;
	}

	public void setProducerRegionType(String producerRegionType) {
		this.producerRegionType = producerRegionType;
	}

	public boolean isPersistentQueue() {
		return persistentQueue;
	}

	public void setPersistentQueue(boolean persistentQueue) {
		this.persistentQueue = persistentQueue;
	}

}

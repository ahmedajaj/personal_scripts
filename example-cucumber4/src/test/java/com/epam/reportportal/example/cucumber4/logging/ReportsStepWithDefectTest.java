/*
 * Copyright 2021 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.example.cucumber4.logging;

import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class ReportsStepWithDefectTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReportsStepWithDefectTest.class);

	@Given("Test is skipped")
	public void testSkipped() {
		LOGGER.info("I must be skipped");
	}

	@Given("^Test is failed$")
	public void testFailure() {
		assertEquals(2, 1);
	}

	@Given("^Test is failed with message$")
	public void testFailureWithMessage() {
		assertEquals("Failure msg", 2, 1);
	}
}

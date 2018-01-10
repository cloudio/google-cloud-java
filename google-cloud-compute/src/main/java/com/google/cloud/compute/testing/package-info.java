/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A testing helper for Google Compute Engine.
 *
 * <p>A simple usage example:
 *
 * <p>Before the test:
 * <pre> {@code
 * RemoteComputeHelper computeHelper = RemoteComputeHelper.create();
 * Compute compute = computeHelper.getOptions().getService();
 * } </pre>
 *
 * @see <a href="https://github.com/GoogleCloudPlatform/google-cloud-java/blob/master/TESTING.md#testing-code-that-uses-compute">
 *     Google Cloud Java tools for testing</a>
 */
package com.google.cloud.compute.testing;

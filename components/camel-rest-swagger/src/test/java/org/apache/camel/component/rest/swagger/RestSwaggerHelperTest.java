/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.rest.swagger;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RestSwaggerHelperTest {

    @Test
    public void emptyHostParamsAreNotAllowed() {
        assertThrows(IllegalArgumentException.class,
                () -> RestSwaggerHelper.isHostParam(""));
    }

    @Test
    public void nonUriHostParametersAreNotAllowed() {
        assertThrows(IllegalArgumentException.class,
                () -> RestSwaggerHelper.isHostParam("carrot"));
    }

    @Test
    public void nullHostParamsAreNotAllowed() {
        assertThrows(IllegalArgumentException.class,
                () -> RestSwaggerHelper.isHostParam(null));
    }

    @Test
    public void shouldNiceify() {
        assertThat(RestSwaggerHelper.isHostParam("http://api.example.com")).isEqualTo("http://api.example.com");
    }

    @Test
    public void shouldReturnUriParameter() {
        assertThat(RestSwaggerHelper.isHostParam("http://api.example.com")).isEqualTo("http://api.example.com");
    }

}

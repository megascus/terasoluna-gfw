/*
 * Copyright (C) 2013-2014 terasoluna.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.terasoluna.gfw.common.date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;
import org.terasoluna.gfw.common.date.DefaultDateFactory;

public class DefaultDateFactoryTest {

    @Test
    public void testNewDateTime() {
        DefaultDateFactory factory = new DefaultDateFactory();
        DateTime now = new DateTime();
        DateTime result = factory.newDateTime();

        assertThat(result.getYear(), is(now.getYear()));
        assertThat(result.getMonthOfYear(), is(now.getMonthOfYear()));
        assertThat(result.getDayOfMonth(), is(now.getDayOfMonth()));
        assertThat(result.getHourOfDay(), is(now.getHourOfDay()));
        assertThat(result.getMinuteOfHour(), is(now.getMinuteOfHour()));
        assertThat(result.getSecondOfMinute(), is(now.getSecondOfMinute()));
        assertThat(result.getMillisOfSecond() >= now.getMillisOfSecond(),
                is(true));
    }

}

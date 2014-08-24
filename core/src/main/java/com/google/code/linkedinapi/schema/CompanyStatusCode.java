/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.linkedinapi.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for null.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType>
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPR"/>
 *     &lt;enumeration value="OPS"/>
 *     &lt;enumeration value="RRG"/>
 *     &lt;enumeration value="OOB"/>
 *     &lt;enumeration value="ACQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum CompanyStatusCode {

    @XmlEnumValue("OPR")
    OPERATING("OPR"),
    @XmlEnumValue("OPS")
    OPERATING_SUBSIDIARY("OPS"),
    @XmlEnumValue("RRG")
    REORGANIZING("RRG"),
    @XmlEnumValue("OOB")
    OUT_OF_BUSINESS("OOB"),
    @XmlEnumValue("ACQ")
    ACQUIRED("ACQ");
    private final String value;

    CompanyStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyStatusCode fromValue(String v) {
        for (CompanyStatusCode c: CompanyStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}

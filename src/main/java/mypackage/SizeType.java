
package mypackage;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SizeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="small"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="large"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SizeType")
@XmlEnum
public enum SizeType {

    @XmlEnumValue("small")
    SMALL("small"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("large")
    LARGE("large");
    private final String value;

    SizeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SizeType fromValue(String v) {
        for (SizeType c: SizeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

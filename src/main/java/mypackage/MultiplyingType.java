
package mypackage;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiplyingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MultiplyingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="leaves"/&gt;
 *     &lt;enumeration value="cuttings"/&gt;
 *     &lt;enumeration value="seeds"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MultiplyingType")
@XmlEnum
public enum MultiplyingType {

    @XmlEnumValue("leaves")
    LEAVES("leaves"),
    @XmlEnumValue("cuttings")
    CUTTINGS("cuttings"),
    @XmlEnumValue("seeds")
    SEEDS("seeds");
    private final String value;

    MultiplyingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultiplyingType fromValue(String v) {
        for (MultiplyingType c: MultiplyingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

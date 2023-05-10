
package mypackage;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoilType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SoilType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="podzolic"/&gt;
 *     &lt;enumeration value="ground"/&gt;
 *     &lt;enumeration value="sod-podzolic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SoilType")
@XmlEnum
public enum SoilType {

    @XmlEnumValue("podzolic")
    PODZOLIC("podzolic"),
    @XmlEnumValue("ground")
    GROUND("ground"),
    @XmlEnumValue("sod-podzolic")
    SOD_PODZOLIC("sod-podzolic");
    private final String value;

    SoilType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoilType fromValue(String v) {
        for (SoilType c: SoilType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

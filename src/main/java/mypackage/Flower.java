
package mypackage;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Plant" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Soil" type="{}SoilType"/&gt;
 *                   &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="VisualParameters"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="StemColor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="LeafColor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Size" type="{}SizeType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GrowingTips"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Temperature"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;minInclusive value="-50"/&gt;
 *                                   &lt;maxInclusive value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Lighting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="Watering"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                   &lt;maxInclusive value="1000"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Multiplying" type="{}MultiplyingType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plant"
})
@XmlRootElement(name = "Flower")
public class Flower {

    @XmlElement(name = "Plant", required = true)
    protected List<Flower.Plant> plant;

    /**
     * Gets the value of the plant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the plant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flower.Plant }
     * 
     * 
     */
    public List<Flower.Plant> getPlant() {
        if (plant == null) {
            plant = new ArrayList<Flower.Plant>();
        }
        return this.plant;
    }



    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Soil" type="{}SoilType"/&gt;
     *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="VisualParameters"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="StemColor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="LeafColor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Size" type="{}SizeType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="GrowingTips"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Temperature"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;minInclusive value="-50"/&gt;
     *                         &lt;maxInclusive value="50"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Lighting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="Watering"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                         &lt;maxInclusive value="1000"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Multiplying" type="{}MultiplyingType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "soil",
        "origin",
        "visualParameters",
        "growingTips",
        "multiplying"
    })
    public static class Plant {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Soil", required = true)
        @XmlSchemaType(name = "string")
        protected SoilType soil;
        @XmlElement(name = "Origin", required = true)
        protected String origin;
        @XmlElement(name = "VisualParameters", required = true)
        protected Flower.Plant.VisualParameters visualParameters;
        @XmlElement(name = "GrowingTips", required = true)
        protected Flower.Plant.GrowingTips growingTips;
        @XmlElement(name = "Multiplying", required = true)
        @XmlSchemaType(name = "string")
        protected MultiplyingType multiplying;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the soil property.
         * 
         * @return
         *     possible object is
         *     {@link SoilType }
         *     
         */
        public SoilType getSoil() {
            return soil;
        }

        /**
         * Sets the value of the soil property.
         * 
         * @param value
         *     allowed object is
         *     {@link SoilType }
         *     
         */
        public void setSoil(SoilType value) {
            this.soil = value;
        }

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the visualParameters property.
         * 
         * @return
         *     possible object is
         *     {@link Flower.Plant.VisualParameters }
         *     
         */
        public Flower.Plant.VisualParameters getVisualParameters() {
            return visualParameters;
        }

        /**
         * Sets the value of the visualParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link Flower.Plant.VisualParameters }
         *     
         */
        public void setVisualParameters(Flower.Plant.VisualParameters value) {
            this.visualParameters = value;
        }

        /**
         * Gets the value of the growingTips property.
         * 
         * @return
         *     possible object is
         *     {@link Flower.Plant.GrowingTips }
         *     
         */
        public Flower.Plant.GrowingTips getGrowingTips() {
            return growingTips;
        }

        /**
         * Sets the value of the growingTips property.
         * 
         * @param value
         *     allowed object is
         *     {@link Flower.Plant.GrowingTips }
         *     
         */
        public void setGrowingTips(Flower.Plant.GrowingTips value) {
            this.growingTips = value;
        }

        /**
         * Gets the value of the multiplying property.
         * 
         * @return
         *     possible object is
         *     {@link MultiplyingType }
         *     
         */
        public MultiplyingType getMultiplying() {
            return multiplying;
        }

        /**
         * Sets the value of the multiplying property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiplyingType }
         *     
         */
        public void setMultiplying(MultiplyingType value) {
            this.multiplying = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Temperature"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;minInclusive value="-50"/&gt;
         *               &lt;maxInclusive value="50"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Lighting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="Watering"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;minInclusive value="0"/&gt;
         *               &lt;maxInclusive value="1000"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "temperature",
            "lighting",
            "watering"
        })
        public static class GrowingTips {

            @XmlElement(name = "Temperature")
            protected int temperature;
            @XmlElement(name = "Lighting")
            protected boolean lighting;
            @XmlElement(name = "Watering")
            protected int watering;

            /**
             * Gets the value of the temperature property.
             * 
             */
            public int getTemperature() {
                return temperature;
            }

            /**
             * Sets the value of the temperature property.
             * 
             */
            public void setTemperature(int value) {
                this.temperature = value;
            }

            /**
             * Gets the value of the lighting property.
             * 
             */
            public boolean isLighting() {
                return lighting;
            }

            /**
             * Sets the value of the lighting property.
             * 
             */
            public void setLighting(boolean value) {
                this.lighting = value;
            }

            /**
             * Gets the value of the watering property.
             * 
             */
            public int getWatering() {
                return watering;
            }

            /**
             * Sets the value of the watering property.
             * 
             */
            public void setWatering(int value) {
                this.watering = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="StemColor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="LeafColor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Size" type="{}SizeType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stemColor",
            "leafColor",
            "size"
        })
        public static class VisualParameters {

            @XmlElement(name = "StemColor", required = true)
            protected String stemColor;
            @XmlElement(name = "LeafColor", required = true)
            protected String leafColor;
            @XmlElement(name = "Size", required = true)
            @XmlSchemaType(name = "string")
            protected SizeType size;

            /**
             * Gets the value of the stemColor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStemColor() {
                return stemColor;
            }

            /**
             * Sets the value of the stemColor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStemColor(String value) {
                this.stemColor = value;
            }

            /**
             * Gets the value of the leafColor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLeafColor() {
                return leafColor;
            }

            /**
             * Sets the value of the leafColor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLeafColor(String value) {
                this.leafColor = value;
            }

            /**
             * Gets the value of the size property.
             * 
             * @return
             *     possible object is
             *     {@link SizeType }
             *     
             */
            public SizeType getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             * @param value
             *     allowed object is
             *     {@link SizeType }
             *     
             */
            public void setSize(SizeType value) {
                this.size = value;
            }

        }

    }

}

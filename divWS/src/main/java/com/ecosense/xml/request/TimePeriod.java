//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.06 at 01:17:09 PM CEST 
//


package com.ecosense.xml.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginPosition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endPosition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "beginPosition",
    "endPosition"
})
@XmlRootElement(name = "TimePeriod", namespace = "http://www.opengis.net/gml/3.2")
public class TimePeriod {

    @XmlElement(namespace = "http://www.opengis.net/gml/3.2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginPosition;
    @XmlElement(namespace = "http://www.opengis.net/gml/3.2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endPosition;
    @XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml/3.2", required = true)
    protected String id;

    /**
     * Gets the value of the beginPosition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginPosition() {
        return beginPosition;
    }

    /**
     * Sets the value of the beginPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginPosition(XMLGregorianCalendar value) {
        this.beginPosition = value;
    }

    /**
     * Gets the value of the endPosition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPosition() {
        return endPosition;
    }

    /**
     * Sets the value of the endPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndPosition(XMLGregorianCalendar value) {
        this.endPosition = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
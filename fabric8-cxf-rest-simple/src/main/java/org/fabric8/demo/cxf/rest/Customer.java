package org.fabric8.demo.cxf.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Customer class is just a plain old java object, with a few properties and getters and setters.
 * <p/>
 * By adding the @XmlRootElement annotation, we make it possible for JAXB to unmarshal this object into a XML document and
 * to marshal it back from the same XML document.
 * <p/>
 * The XML representation of a Customer will look like this:
 * <Customer>
 * <id>123</id>
 * <name>National Aquarium</name>
 * </Customer>
 */
@XmlRootElement(name = "Customer")
public class Customer {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
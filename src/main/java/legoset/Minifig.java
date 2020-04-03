package legoset;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

    @XmlValue
    private String minifigName;

    @XmlAttribute
    private int count;

    public Minifig(String minifigName, int count) {
        this.minifigName = minifigName;
        this.count = count;
    }
}

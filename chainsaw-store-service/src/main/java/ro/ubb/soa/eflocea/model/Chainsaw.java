package ro.ubb.soa.eflocea.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Chainsaw {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String chainsawId;
    private String chainsawBrand;
    private String chainsawName;
    private Float chainsawPrice;
    private Float chainsawSize;
    private Integer chainsawsAvailable;
    private Boolean isInStock;
}

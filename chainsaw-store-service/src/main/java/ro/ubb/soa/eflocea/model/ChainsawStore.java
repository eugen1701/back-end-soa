package ro.ubb.soa.eflocea.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class ChainsawStore {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String chainsawStoreId;
    private String chainsawStoreName;
    private String chainsawStoreAddress;
    private String chainsawStoreDescription;
    private Float chainsawStoreRating;

    @OneToMany
    private List<Chainsaw> inventory;
}

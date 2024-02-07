package ro.ubb.soa.eflocea.model.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChainsawResponse {
    private String chainsawId;
    private String chainsawBrand;
    private String chainsawName;
    private Float chainsawPrice;
    private Float chainsawSize;
    private Integer chainsawsAvailable;
    private Boolean isInStock;
    private Boolean isSelected;
}

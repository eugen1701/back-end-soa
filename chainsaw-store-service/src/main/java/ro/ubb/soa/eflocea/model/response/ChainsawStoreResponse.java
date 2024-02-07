package ro.ubb.soa.eflocea.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ChainsawStoreResponse {
    private String chainsawStoreName;
    private List<ChainsawResponse> inventory;
}

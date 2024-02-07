package ro.ubb.soa.eflocea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.soa.eflocea.model.ChainsawStore;
import ro.ubb.soa.eflocea.model.response.ChainsawResponse;
import ro.ubb.soa.eflocea.model.response.ChainsawStoreResponse;
import ro.ubb.soa.eflocea.services.ChainsawStoreService;
import ro.ubb.soa.eflocea.services.interfaces.ChainsawStoreServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ChainsawStoreController {
    private final ChainsawStoreServiceInterface chainsawStoreService;

    @Autowired
    public ChainsawStoreController(ChainsawStoreService chainsawStoreService) {
        this.chainsawStoreService = chainsawStoreService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ChainsawStore> getAllChainsawStores() {
        return chainsawStoreService.getAllChainsawStores();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ChainsawStore getChainsawStoreById(@PathVariable("id") String id) {
        return chainsawStoreService.getChainsawStoreById(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}/inventory")
    public ChainsawStoreResponse getChainsawStoreInventory(@PathVariable("id") String chainsawStoreId) {
        ChainsawStore chainsawStore = chainsawStoreService.getChainsawStoreById(chainsawStoreId);

        ChainsawStoreResponse chainsawStoreResponse = new ChainsawStoreResponse();
        chainsawStoreResponse.setChainsawStoreName(chainsawStore.getChainsawStoreName());
        chainsawStoreResponse.setInventory(chainsawStore.getInventory().stream().map(item -> {
            ChainsawResponse chainsawResponse = new ChainsawResponse();
            chainsawResponse.setChainsawId(item.getChainsawId());
            chainsawResponse.setChainsawName(item.getChainsawName());
            chainsawResponse.setChainsawBrand(item.getChainsawBrand());
            chainsawResponse.setChainsawPrice(item.getChainsawPrice());
            chainsawResponse.setChainsawSize(item.getChainsawSize());
            chainsawResponse.setIsInStock(item.getIsInStock());
            chainsawResponse.setChainsawsAvailable(item.getChainsawsAvailable());
            chainsawResponse.setIsSelected(false);

            return chainsawResponse;
        }).collect(Collectors.toList()));

        return chainsawStoreResponse;
    }
}

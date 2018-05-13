package api.controllers;

import api.entities.Bin;
import api.services.BinService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RESTController {

    @Autowired
    private BinService binService;

    @RequestMapping("/get-all-bins")
    public String getAllBins() {

        Gson binsGson = new Gson();

        List<Bin> binsList = binService.findAll();
        String response = binsGson.toJson(binsList);

        return response;
    }

    public void setBinService(BinService binService) {
        this.binService = binService;
    }
}

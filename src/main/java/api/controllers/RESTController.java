package api.controllers;

import api.entities.Bin;
import api.services.BinService;
import api.utils.BinsJsonSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.List;

@RestController
public class RESTController {

    @Autowired
    private BinService binService;

    @RequestMapping("/get-all-bins")
    public String getAllBins() {

        // Creating Gson object for serializing bins
        GsonBuilder binsGsonBuilder = new GsonBuilder();
        Type binsListType = new TypeToken<List<Bin>>() {}.getType();
        binsGsonBuilder.registerTypeAdapter(binsListType, new BinsJsonSerializer());
        Gson binsGson = binsGsonBuilder.create();

        // Accumulating bins and serializing them
        List<Bin> binsList = binService.findAll();
        String response = binsGson.toJson(binsList);

        return response;
    }

    public void setBinService(BinService binService) {
        this.binService = binService;
    }
}

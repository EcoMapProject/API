package api.utils;

import api.entities.Bin;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.List;

public class BinsJsonSerializer implements JsonSerializer<List<Bin>> {

    @Override
    public JsonElement serialize(List<Bin> bins, Type type, JsonSerializationContext jsonSerializationContext) {

        JsonArray jsonArray = new JsonArray();

        for(Bin bin : bins) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", bin.getId());
            jsonObject.addProperty("name", bin.getName());
            jsonObject.addProperty("description", bin.getDescription());
            jsonObject.addProperty("latitude", bin.getLatitude());
            jsonObject.addProperty("longitude", bin.getLongitude());
            jsonArray.add(jsonObject);
        }

        return jsonArray;
    }

}

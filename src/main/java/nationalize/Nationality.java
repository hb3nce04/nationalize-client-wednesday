package nationalize;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Nationality {

    private long count;
    private String name;

    @SerializedName("country")
    private List<Country> countries;

    @Data
    public static class Country {

        private String countryId;
        private float probability;

    }
}
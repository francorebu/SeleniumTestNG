package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"placeName", "longitude", "state", "stateAbrev","latitude"})
public class Place {
    private String placeName;
    private String longitude;
    private String state;
    private String stateAbrev;
    private String latitude;

    public Place(){
    }

    @JsonProperty("place name")
    public String getPlaceName() {
        return placeName;
    }

    @JsonProperty("place name")
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("state abbreviation")
    public String getStateAbrev() {
        return stateAbrev;
    }

    @JsonProperty("state abbreviation")
    public void setStateAbrev(String stateAbrev) {
        this.stateAbrev = stateAbrev;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}

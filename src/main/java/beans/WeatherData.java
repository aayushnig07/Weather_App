package beans;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class WeatherData {

    @SerializedName("coord")
    @Expose
    @Valid
    private Coord coord;
    @SerializedName("weather")
    @Expose
    @Valid
    private List<Weather> weather = new ArrayList<Weather>();
    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("main")
    @Expose
    @Valid
    private Main main;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("wind")
    @Expose
    @Valid
    private Wind wind;
    @SerializedName("clouds")
    @Expose
    @Valid
    private Clouds clouds;
    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("sys")
    @Expose
    @Valid
    private Sys sys;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cod")
    @Expose
    private Integer cod;

    /**
     * 
     * @return
     *     The coord
     */
    public Coord getCoord() {
        return coord;
    }

    /**
     * 
     * @param coord
     *     The coord
     */
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    /**
     * 
     * @return
     *     The weather
     */
    public List<Weather> getWeather() {
        return weather;
    }

    /**
     * 
     * @param weather
     *     The weather
     */
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    /**
     * 
     * @return
     *     The base
     */
    public String getBase() {
        return base;
    }

    /**
     * 
     * @param base
     *     The base
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * 
     * @return
     *     The main
     */
    public Main getMain() {
        return main;
    }

    /**
     * 
     * @param main
     *     The main
     */
    public void setMain(Main main) {
        this.main = main;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public Integer getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * 
     * @param wind
     *     The wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * 
     * @return
     *     The clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * 
     * @param clouds
     *     The clouds
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    /**
     * 
     * @return
     *     The dt
     */
    public Integer getDt() {
        return dt;
    }

    /**
     * 
     * @param dt
     *     The dt
     */
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    /**
     * 
     * @return
     *     The sys
     */
    public Sys getSys() {
        return sys;
    }

    /**
     * 
     * @param sys
     *     The sys
     */
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The cod
     */
    public Integer getCod() {
        return cod;
    }

    /**
     * 
     * @param cod
     *     The cod
     */
    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(coord).append(weather).append(base).append(main).append(visibility).append(wind).append(clouds).append(dt).append(sys).append(id).append(name).append(cod).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeatherData) == false) {
            return false;
        }
        WeatherData rhs = ((WeatherData) other);
        return new EqualsBuilder().append(coord, rhs.coord).append(weather, rhs.weather).append(base, rhs.base).append(main, rhs.main).append(visibility, rhs.visibility).append(wind, rhs.wind).append(clouds, rhs.clouds).append(dt, rhs.dt).append(sys, rhs.sys).append(id, rhs.id).append(name, rhs.name).append(cod, rhs.cod).isEquals();
    }

}

package beans;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Clouds {

    @SerializedName("all")
    @Expose
    private Integer all;

    /**
     * 
     * @return
     *     The all
     */
    public Integer getAll() {
        return all;
    }

    /**
     * 
     * @param all
     *     The all
     */
    public void setAll(Integer all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(all).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Clouds) == false) {
            return false;
        }
        Clouds rhs = ((Clouds) other);
        return new EqualsBuilder().append(all, rhs.all).isEquals();
    }

}


package org.woehlke.javaee7.petclinic.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "3h"
})
public class Rain {

    @JsonProperty("3h")
    private Double _3h;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _3h
     */
    @JsonProperty("3h")
    public Double get3h() {
        return _3h;
    }

    /**
     * 
     * @param _3h
     *     The 3h
     */
    @JsonProperty("3h")
    public void set3h(Double _3h) {
        this._3h = _3h;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_3h).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rain) == false) {
            return false;
        }
        Rain rhs = ((Rain) other);
        return new EqualsBuilder().append(_3h, rhs._3h).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

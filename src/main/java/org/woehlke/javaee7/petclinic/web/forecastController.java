package org.woehlke.javaee7.petclinic.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;
import org.apache.commons.lang.WordUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonReader;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@ManagedBean
@SessionScoped
public class forecastController implements Serializable {

    private static Logger log = Logger.getLogger(forecastController.class.getName());

    //@EJB
    //private ForecastService forecastService;

    private String searchterm;

    public String getSearchterm() {
        return searchterm;
    }

    public void setSearchterm(String searchterm) {
        log.warning(searchterm);
        this.searchterm = WordUtils.capitalize(searchterm);
        log.warning(searchterm);
    }
    
    public String search() {
        try {

            URL url = new URL("http://api.openweathermap.org/data/2.5/forecast?q=London,us&mode=json&APPID=9c6cc69cad227d2f2b7c54783bdb1cc4");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            log.warning(searchterm);
            
            ObjectMapper mapper = new ObjectMapper();
            String output;
            Json obj = null;
            JsonReader json = Json.createReader(conn.getInputStream());
            //log.warning(json.readObject().toString());
            CityPOJO city = mapper.readValue(json.readObject().toString(), CityPOJO.class);
            log.warning(city.toString());

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return "forecast.jsf";
    }    
        
           
}

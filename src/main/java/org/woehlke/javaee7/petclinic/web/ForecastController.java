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
import java.util.List;
import java.util.logging.Level;
import org.codehaus.jackson.map.ObjectMapper;
import org.woehlke.javaee7.petclinic.model.Forecast;
import org.woehlke.javaee7.petclinic.model.Weather;

@ManagedBean
@SessionScoped
public class ForecastController implements Serializable {

    private static Logger log = Logger.getLogger(ForecastController.class.getName());

    //@EJB
    //private ForecastService forecastService;

    private String searchterm;
    
    private Forecast fc;

    public String getSearchterm() {
        return searchterm;
    }

    public void setSearchterm(String searchterm) {
        log.warning(searchterm);
    }
    
    public String search() {

        ObjectMapper mapper = new ObjectMapper();
        try {
            fc = mapper.readValue(new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q=PortoAlegre,br&lang=pt&cnt=3&units=metric&mode=json&APPID=9c6cc69cad227d2f2b7c54783bdb1cc4"), Forecast.class);
            
            for(org.woehlke.javaee7.petclinic.model.List ls : fc.getList()){
                log.log(Level.WARNING, "{0} :Dia", ls.getDtTxt());
                log.log(Level.WARNING, "{0} :Dia Estranho", ls.getDt());
                log.log(Level.WARNING, "Temperatura: {0}", ls.getMain().getTemp());
//                log.log(Level.WARNING, "Temperatura M\u00e1xima: {0}", ls.getMain().getTempMax());
//                log.log(Level.WARNING, "Temperatura M\u00ednima: {0}", ls.getMain().getTempMin());
                log.log(Level.WARNING, "Umidade: {0}", ls.getMain().getHumidity());
                
//                for(org.woehlke.javaee7.petclinic.model.List list : fc.getList()){
                    
                    Weather wt = fc.getList().get(0).getWeather().get(0);
//                    for(Weather wt : list.getWeather()){
                        log.warning("Chuva: " + wt.getMain());
                        log.warning("Tipo de Chuva: " + wt.getDescription());
                        log.warning("Icone: " + wt.getIcon());
//                    };                    
                //};
                log.warning("\n");
            };
            
            //log.warning(fc.getCity().getCountry() + fc.getCity().getName() + " " + fc.getMessage() + " " + fc.getList());
        } catch (IOException ex) {
            Logger.getLogger(ForecastController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "forecast.jsf";
    }    
           
}
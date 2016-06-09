package org.woehlke.javaee7.petclinic.web;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;
import org.woehlke.javaee7.petclinic.services.ForecastService;


@ManagedBean
@SessionScoped
public class forecastController implements Serializable {

    private static Logger log = Logger.getLogger(forecastController.class.getName());

    @EJB
    private ForecastService forecastService;

    private String searchterm;

    public String getSearchterm() {
        return searchterm;
    }

    public void setSearchterm(String searchterm) {
        this.searchterm = searchterm;
    }
    
    public String search(){
        return "forecast.jsf";
    }    
}

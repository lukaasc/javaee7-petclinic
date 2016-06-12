/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.model;

public class ForecastList {
    
    private String city;
    
    private String country;
    
    private String date;
    
    private int temp;
    
    private int temp_max;
    
    private int temp_min;
    
    private int temp_manha;
    
    private int temp_tarde;
    
    private int temp_noite;
    
    private int umidade;

    private String previsao;
    
    private double pressao;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(int temp_max) {
        this.temp_max = temp_max;
    }

    public int getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(int temp_min) {
        this.temp_min = temp_min;
    }

    public int getTemp_manha() {
        return temp_manha;
    }

    public void setTemp_manha(int temp_manha) {
        this.temp_manha = temp_manha;
    }

    public int getTemp_tarde() {
        return temp_tarde;
    }

    public void setTemp_tarde(int temp_tarde) {
        this.temp_tarde = temp_tarde;
    }

    public int getTemp_noite() {
        return temp_noite;
    }

    public void setTemp_noite(int temp_noite) {
        this.temp_noite = temp_noite;
    }

    public int getUmidade() {
        return umidade;
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
    }

    public String getPrevisao() {
        return previsao;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }
    
    private String icone;
    
    
}

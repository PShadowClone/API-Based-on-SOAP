/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;

/**
 *
 * @author Amr Saidam
 */
public class Rate implements Serializable {

    private Distance distance;
    private Rank rank;
    private String promotionalCodes;
    private String codes;
    private String type;
    private double rateValue;

    public Rate(Distance distance, Rank rank, String promotionalCodes, String codes, String type, double rateValue) {
        this.distance = distance;
        this.rank = rank;
        this.promotionalCodes = promotionalCodes;
        this.codes = codes;
        this.type = type;
        this.rateValue = rateValue;
    }

    public Rate() {
    }

    public double getRateValue() {
        return rateValue;
    }

    public void setRateValue(double rateValue) {
        this.rateValue = rateValue;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public String getPromotionalCodes() {
        return promotionalCodes;
    }

    public void setPromotionalCodes(String promotionalCodes) {
        this.promotionalCodes = promotionalCodes;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

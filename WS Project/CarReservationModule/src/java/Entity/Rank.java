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
public class Rank implements Serializable{

    private String leisure;
    private String corporate;

    public Rank() {
    }

    public Rank(String leisure, String corporate) {
        this.leisure = leisure;
        this.corporate = corporate;
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public String getLeisure() {
        return leisure;
    }

    public void setLeisure(String leisure) {
        this.leisure = leisure;
    }
}

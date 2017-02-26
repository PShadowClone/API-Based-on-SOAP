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
public class Distance implements Serializable{

    private String limited;
    private String unlimited;

    public Distance(String limited, String unlimited) {
        this.limited = limited;
        this.unlimited = unlimited;
    }

    public Distance() {
    }

    public String getLimited() {
        return limited;
    }

    public void setLimited(String limited) {
        this.limited = limited;
    }

    public String getUnlimited() {
        return unlimited;
    }

    public void setUnlimited(String unlimited) {
        this.unlimited = unlimited;
    }


}

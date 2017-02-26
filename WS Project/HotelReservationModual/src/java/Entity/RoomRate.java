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
public class RoomRate implements Serializable{

    private String regular;
    private String highClass;
    private String anyone;

    public RoomRate() {
    }

    public RoomRate(String regular, String highClass, String anyone) {
        this.regular = regular;
        this.highClass = highClass;
        this.anyone = anyone;
    }

    public String getAnyone() {
        return anyone;
    }

    public void setAnyone(String anyone) {
        this.anyone = anyone;
    }

    public String getHighClass() {
        return highClass;
    }

    public void setHighClass(String highClass) {
        this.highClass = highClass;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }


}

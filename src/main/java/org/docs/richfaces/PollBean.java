package org.docs.richfaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jjarvela on 21/05/15.
 */

@ViewScoped
@ManagedBean
public class PollBean implements Serializable {

    private boolean pollEnabled;
    private Date currentDate;

    public boolean isPollEnabled() {
        return pollEnabled;
    }

    public void setPollEnabled(boolean pollEnabled) {
        this.pollEnabled = pollEnabled;
    }

    public Date getCurrentDate() {

        currentDate = new Date();

        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}

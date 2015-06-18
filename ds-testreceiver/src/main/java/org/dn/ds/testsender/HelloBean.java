package org.dn.ds.testsender;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A bean which we use in the route
 */
public class HelloBean implements Hello {

    private String say = "Hello";
    private String group = "A";
    private int sequence = 0;

    public String hello() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return say + " this is message " + sequence + " at " + sdf.format(new Date());
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
    
    public void setGroup(String group) {
    	this.group = group;
    }
    
    public String getGroup() {
    	return group;
    }
    
    public int getSequence() {
    	sequence++;
    	return sequence;
    }
}

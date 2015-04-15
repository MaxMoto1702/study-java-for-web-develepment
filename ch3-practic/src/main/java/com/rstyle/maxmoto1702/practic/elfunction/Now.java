package com.rstyle.maxmoto1702.practic.elfunction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by maksim.serebryanskiy on 15.04.2015.
 */
public class Now {

    private static final Logger LOG = LoggerFactory.getLogger(Now.class);
    
    public static String now() {
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String now = formatter.format(currentDate.getTime());
        return now;
    }
}

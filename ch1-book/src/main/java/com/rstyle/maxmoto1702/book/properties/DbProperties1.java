package com.rstyle.maxmoto1702.book.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

/**
 * Created by maksim.serebryanskiy on 14.04.2015.
 */
@Resource.Classpath({"db.properties", "db.bak.properties"})
public class DbProperties1 {

    private static final Logger LOG = LoggerFactory.getLogger(DbProperties1.class);
    @Property("driver")
    private String driver;
    @Property("url")
    private String url;
    @Property("username")
    private String username;
    @Property("password")
    private String password;

    public DbProperties1() {
        LOG.debug("Initialization properties");
        PropertyLoader.populate(this);
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

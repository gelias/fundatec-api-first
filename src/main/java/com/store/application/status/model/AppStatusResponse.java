package com.store.application.status.model;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import static java.lang.String.format;

public class AppStatusResponse {

    @Getter private String applicationName;
    @Getter private String version;
    @Getter private int status;

    public AppStatusResponse(String applicationName, String version, int status) throws Exception {
        this.applicationName = applicationName;
        this.version = version;
        this.status = status;
    }

    @Override
    public String toString() {
        return format("%s_%s_%s",this.applicationName,this.version,this.status);
    }
}

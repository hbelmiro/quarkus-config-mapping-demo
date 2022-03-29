package com.thegreatapi;

import io.smallrye.config.ConfigMapping;

@ConfigMapping
public interface Company {

    String name();
    String country();
    String webSite();
}

package com.thegreatapi;

import io.smallrye.config.ConfigMapping;

@ConfigMapping
public interface Address {

    String city();

    String country();
}

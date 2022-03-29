package com.thegreatapi;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "com.thegreatapi.client")
public interface Client {

    Company company();

    Address address();
}

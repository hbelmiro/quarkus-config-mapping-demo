package com.thegreatapi;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "server")
public interface Server {

    String host();

    String propertyWithMoreThanOneWord();

    @WithName("ClassName")
    String className();

    @WithName("separated/by/slash")
    String separated();
}

package com.thegreatapi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class AppTest {

    @Inject
    Server server;

    @Inject
    Client client;

    @Test
    void testProperties() {
        assertThat(server.host()).isEqualTo("localhost");
        assertThat(server.propertyWithMoreThanOneWord()).isEqualTo("value");
        assertThat(server.className()).isEqualTo("com.example.MyApplication");
        assertThat(server.separated()).isEqualTo("iiii];)'");

        assertThat(client.company().name()).isEqualTo("Red Hat");
        assertThat(client.company().country()).isEqualTo("United States");
        assertThat(client.company().webSite()).isEqualTo("redhat.com");

        assertThat(client.address().city()).isEqualTo("Porto Alegre");
        assertThat(client.address().country()).isEqualTo("Brazil");
    }

}
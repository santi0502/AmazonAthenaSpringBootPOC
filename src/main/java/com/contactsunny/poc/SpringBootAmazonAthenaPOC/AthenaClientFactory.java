package com.contactsunny.poc.SpringBootAmazonAthenaPOC;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.athena.AthenaClientBuilder;

class AthenaClientFactory {

    private final AthenaClientBuilder builder = AthenaClient.builder()
            .region(Region.US_EAST_1);

    AthenaClient createClient() {
        return builder.build();
    }
}

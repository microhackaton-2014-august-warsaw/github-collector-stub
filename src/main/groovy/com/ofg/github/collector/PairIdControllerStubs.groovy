package com.ofg.github.collector

import com.ofg.infrastructure.Stub
import groovy.transform.TypeChecked

import static com.github.tomakehurst.wiremock.client.WireMock.*
import static com.ofg.infrastructure.GithubCollectorMediaType.CONTENT_TYPE
import static com.ofg.infrastructure.GithubCollectorMediaType.V1_JSON

@TypeChecked
class PairIdControllerStubs {

    @Stub
    public static void collectPairId() {
        stubFor(
                put(urlMatching('/api/[0-9]+'))
                        .withHeader(CONTENT_TYPE, equalTo(V1_JSON))
                        .willReturn(aResponse()
                        .withStatus(200)
                ))

    }

}

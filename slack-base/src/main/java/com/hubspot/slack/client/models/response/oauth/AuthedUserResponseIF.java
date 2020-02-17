package com.hubspot.slack.client.models.response.oauth;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@HubSpotStyle
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public interface AuthedUserResponseIF {
    String getId();
    Optional<String> getScope();
    Optional<String> getAccessToken();
    Optional<String> getTokenType();

}
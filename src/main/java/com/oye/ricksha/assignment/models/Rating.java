package com.oye.ricksha.assignment.models;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * The type Rating.
 */
@Builder
@Data
@AllArgsConstructor
@Document
public class Rating {

    /**
     * The Id.
     */
    @Id
    final String id;

    @Field
    @NotNull
    private String driverName;

    /**
     * The Driver email.
     */
    @NotNull
    @Field
    String driverEmail;

    /**
     * The Rating.
     */
    @NotNull
    @Field
    Integer rating;

    /**
     * The Passenger name.
     */
    @NotNull
    @Field
    String passengerName;

    /**
     * The Passenger email.
     */
    @NotNull
    @Field
    String passengerEmail;

    /**
     * The Source.
     */
    @NotNull
    @Field
    String source;

    /**
     * The Destination.
     */
    @NotNull
    @Field
    String destination;

    /**
     * The Date.
     */
    @Field
    Date date;

}

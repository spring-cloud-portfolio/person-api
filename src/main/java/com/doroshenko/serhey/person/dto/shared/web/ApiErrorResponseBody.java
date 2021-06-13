package com.doroshenko.serhey.person.dto.shared.web;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.springframework.util.Assert;

import java.io.Serial;
import java.io.Serializable;

/**
 * Represents a data transfer object, which will be returned as a response body in error case
 *
 * @author Serhey Doroshenko
 * @see Serializable
 */
@JsonDeserialize(builder = ApiErrorResponseBody.Builder.class)
public class ApiErrorResponseBody implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;

    private final int status;
    private final String path;
    private final String error;
    private final String trace;
    private final String message;
    private final long timestamp;

    private ApiErrorResponseBody(final int status,
                                 final String path,
                                 final String error,
                                 final String trace,
                                 final String message,
                                 final long timestamp) {
        this.path = path;
        this.error = error;
        this.trace = trace;
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    /* Getters and setters */
    public int getStatus() {
        return status;
    }

    public String getPath() {
        return path;
    }

    public String getError() {
        return error;
    }

    public String getTrace() {
        return trace;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    /* Builder */
    public static Builder builder() {
        return new Builder();
    }

    public static Builder withStatus(final int status) {
        return new Builder().status(status);
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder implements Serializable {
        @Serial
        private static final long serialVersionUID = 42L;

        private int status;
        private String path;
        private String error;
        private String trace;
        private String message;
        private long timestamp;

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder error(String error) {
            this.error = error;
            return this;
        }

        public Builder trace(String trace) {
            this.trace = trace;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ApiErrorResponseBody build() {
            Assert.hasText(this.error, "error cannot be null");
            Assert.hasText(this.message, "message cannot be null");
            if (this.timestamp == 0) this.timestamp = System.currentTimeMillis();
            return new ApiErrorResponseBody(this.status, this.path, this.error, this.trace, this.message, this.timestamp);
        }

    }

}

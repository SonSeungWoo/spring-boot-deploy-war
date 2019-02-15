package me.seungwoo;

import lombok.Data;
import me.seungwoo.dto.ParamDto;

@Data
public class ExResponse<T> {
    private String serviceName;
    private String languageCode;
    private String currencyCode;
    private String trId;
    private Boolean isSucceed;
    private Boolean isWarning;
    private T error;
    private T warning;
    private T data;

    public ExResponse() {

    }

    private ExResponse(ExResponse.Builder<T> builder) {
        this.serviceName = builder.serviceName;
        this.languageCode = builder.languageCode;
        this.currencyCode = builder.currencyCode;
        this.trId = builder.trId;
        this.isSucceed = builder.isSucceed;
        this.isWarning = builder.isWarning;
        this.error = builder.error;
        this.warning = builder.warning;
        this.data = builder.data;
    }

    public static class Builder<T> {
        private String serviceName;
        private String languageCode;
        private String currencyCode;
        private String trId;
        private Boolean isSucceed;
        private Boolean isWarning;
        private T error;
        private T warning;
        private T data;

        public Builder(T data) {
            this.data = data;
        }

        public Builder(T data, T error, T warning) {
            this.data = data;
            this.error = error;
            this.warning = warning;
        }

        public ExResponse.Builder setIsSucceed(Boolean isSucceed) {
            this.isSucceed = isSucceed;
            return this;
        }

        public ExResponse.Builder setIsWarning(Boolean isWarning) {
            this.isWarning = isWarning;
            return this;
        }

        public ExResponse.Builder setResponse(ParamDto response) {
            this.serviceName = response.getServiceName();
            this.languageCode = response.getLanguageCode();
            this.currencyCode = response.getCurrencyCode();
            this.trId = response.getTrId();
            return this;
        }

        public ExResponse build() {
            return new ExResponse<>(this);
        }
    }
}

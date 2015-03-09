package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

public class GetEventSubscriptionRegisterResponse {

    private String callbackUrl;
    private String clientIp;
    private String eventType;

    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    public void setCallbackUrl(final String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
    public String getClientIp() {
        return this.clientIp;
    }
    public void setClientIp(final String clientIp) {
        this.clientIp = clientIp;
    }
    public String getEventType() {
        return this.eventType;
    }
    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}

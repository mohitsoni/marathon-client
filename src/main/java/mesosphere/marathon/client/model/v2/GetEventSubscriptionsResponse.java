package mesosphere.marathon.client.model.v2;

import java.util.ArrayList;
import java.util.List;

public class GetEventSubscriptionsResponse {

    List<String> callbackUrls = new ArrayList<String>() ;

    public List<String> getCallbackUrls() {
        return this.callbackUrls;
    }

    public void setCallbackUrls(final List<String> callbackUrls) {
        this.callbackUrls = callbackUrls;
    }

    @Override
    public String toString() {
        return "SubscriptionsResponse [callbackUrls=" + this.callbackUrls + "]";
    }
}

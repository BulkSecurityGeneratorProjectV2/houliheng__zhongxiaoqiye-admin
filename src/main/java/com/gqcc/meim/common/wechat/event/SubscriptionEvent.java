package com.gqcc.meim.common.wechat.event;

/**
 * Created by exizhai on 9/30/2015.
 */
public class SubscriptionEvent extends EventRequest {

    private boolean sub;

    public boolean isSub() {
        return EventType.subscribe == this.getEventType();
    }
}
package org.webrtc;

/* loaded from: classes9.dex */
public class InitWebRTCCameraEvent {
    private final Type type;

    public enum Type {
        OPEN_SUCCESS,
        OPEN_FAIL,
        OPEN_BY_CACHE,
        OPEN_DISMISS
    }

    public InitWebRTCCameraEvent(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }
}

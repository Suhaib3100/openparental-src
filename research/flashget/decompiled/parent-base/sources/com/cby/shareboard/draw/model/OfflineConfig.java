package com.cby.shareboard.draw.model;

import kotlin.Metadata;

/* compiled from: OfflineConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/cby/shareboard/draw/model/OfflineConfig;", "", "()V", "onlineAutoSync", "", "getOnlineAutoSync", "()Z", "setOnlineAutoSync", "(Z)V", "supportOffline", "getSupportOffline", "setSupportOffline", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineConfig {
    private boolean onlineAutoSync;
    private boolean supportOffline;

    public final boolean getOnlineAutoSync() {
        return this.onlineAutoSync;
    }

    public final boolean getSupportOffline() {
        return this.supportOffline;
    }

    public final void setOnlineAutoSync(boolean z4) {
        this.onlineAutoSync = z4;
    }

    public final void setSupportOffline(boolean z4) {
        this.supportOffline = z4;
    }
}

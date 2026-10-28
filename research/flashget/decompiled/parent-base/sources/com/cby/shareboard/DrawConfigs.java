package com.cby.shareboard;

import fg.l;
import kotlin.Metadata;

/* compiled from: DrawConfigs.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/cby/shareboard/DrawConfigs;", "", "()V", "isImageDataNeedUrlEncode", "", "()Z", "setImageDataNeedUrlEncode", "(Z)V", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawConfigs {

    @l
    public static final DrawConfigs INSTANCE = new DrawConfigs();
    private static boolean isImageDataNeedUrlEncode;

    private DrawConfigs() {
    }

    public final boolean isImageDataNeedUrlEncode() {
        return isImageDataNeedUrlEncode;
    }

    public final void setImageDataNeedUrlEncode(boolean z4) {
        isImageDataNeedUrlEncode = z4;
    }
}

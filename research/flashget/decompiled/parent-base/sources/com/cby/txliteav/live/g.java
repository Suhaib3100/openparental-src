package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/cby/txliteav/live/g;", "", "<init>", "(Ljava/lang/String;I)V", "LiveBufferTypeUnknown", "LiveBufferTypeByteBuffer", "LiveBufferTypeByteArray", "LiveBufferTypeTexture", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g LiveBufferTypeUnknown = new g(ProtectedSandApp.s("ൎ"), 0);
    public static final g LiveBufferTypeByteBuffer = new g(ProtectedSandApp.s("൏"), 1);
    public static final g LiveBufferTypeByteArray = new g(ProtectedSandApp.s("\u0d50"), 2);
    public static final g LiveBufferTypeTexture = new g(ProtectedSandApp.s("\u0d51"), 3);

    private static final /* synthetic */ g[] $values() {
        return new g[]{LiveBufferTypeUnknown, LiveBufferTypeByteBuffer, LiveBufferTypeByteArray, LiveBufferTypeTexture};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private g(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/cby/txliteav/live/v;", "", "<init>", "(Ljava/lang/String;I)V", "LiveVideoResolutionModeLandscape", "LiveVideoResolutionModePortrait", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v LiveVideoResolutionModeLandscape = new v(ProtectedSandApp.s("ษ"), 0);
    public static final v LiveVideoResolutionModePortrait = new v(ProtectedSandApp.s("ส"), 1);

    private static final /* synthetic */ v[] $values() {
        return new v[]{LiveVideoResolutionModeLandscape, LiveVideoResolutionModePortrait};
    }

    static {
        v[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private v(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<v> getEntries() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}

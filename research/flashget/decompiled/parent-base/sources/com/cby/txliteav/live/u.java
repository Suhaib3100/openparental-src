package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/cby/txliteav/live/u;", "", "<init>", "(Ljava/lang/String;I)V", "LiveVideoResolution480x480", "LiveVideoResolution640x480", "LiveVideoResolution640x360", "LiveVideoResolution960x540", "LiveVideoResolution1280x720", "LiveVideoResolution1920x1080", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u LiveVideoResolution480x480 = new u(ProtectedSandApp.s("ร"), 0);
    public static final u LiveVideoResolution640x480 = new u(ProtectedSandApp.s("ฤ"), 1);
    public static final u LiveVideoResolution640x360 = new u(ProtectedSandApp.s("ล"), 2);
    public static final u LiveVideoResolution960x540 = new u(ProtectedSandApp.s("ฦ"), 3);
    public static final u LiveVideoResolution1280x720 = new u(ProtectedSandApp.s("ว"), 4);
    public static final u LiveVideoResolution1920x1080 = new u(ProtectedSandApp.s("ศ"), 5);

    private static final /* synthetic */ u[] $values() {
        return new u[]{LiveVideoResolution480x480, LiveVideoResolution640x480, LiveVideoResolution640x360, LiveVideoResolution960x540, LiveVideoResolution1280x720, LiveVideoResolution1920x1080};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private u(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<u> getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}

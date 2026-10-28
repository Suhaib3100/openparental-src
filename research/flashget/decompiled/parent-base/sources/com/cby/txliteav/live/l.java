package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/cby/txliteav/live/l;", "", "<init>", "(Ljava/lang/String;I)V", "LivePixelFormatUnknown", "LivePixelFormatI420", "LivePixelFormatTexture2D", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l LivePixelFormatUnknown = new l(ProtectedSandApp.s("෪"), 0);
    public static final l LivePixelFormatI420 = new l(ProtectedSandApp.s("෫"), 1);
    public static final l LivePixelFormatTexture2D = new l(ProtectedSandApp.s("෬"), 2);

    private static final /* synthetic */ l[] $values() {
        return new l[]{LivePixelFormatUnknown, LivePixelFormatI420, LivePixelFormatTexture2D};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private l(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<l> getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}

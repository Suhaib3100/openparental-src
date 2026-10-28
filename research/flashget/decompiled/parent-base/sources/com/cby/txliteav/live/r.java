package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/cby/txliteav/live/r;", "", "<init>", "(Ljava/lang/String;I)V", "Rotation0", "Rotation90", "Rotation180", "Rotation270", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r Rotation0 = new r(ProtectedSandApp.s("พ"), 0);
    public static final r Rotation90 = new r(ProtectedSandApp.s("ฟ"), 1);
    public static final r Rotation180 = new r(ProtectedSandApp.s("ภ"), 2);
    public static final r Rotation270 = new r(ProtectedSandApp.s("ม"), 3);

    private static final /* synthetic */ r[] $values() {
        return new r[]{Rotation0, Rotation90, Rotation180, Rotation270};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private r(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<r> getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}

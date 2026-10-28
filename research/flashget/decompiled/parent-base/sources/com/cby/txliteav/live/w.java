package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/cby/txliteav/live/w;", "", "<init>", "(Ljava/lang/String;I)V", "SystemVolumeTypeAuto", "SystemVolumeTypeMedia", "SystemVolumeTypeVOIP", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w SystemVolumeTypeAuto = new w(ProtectedSandApp.s("ห"), 0);
    public static final w SystemVolumeTypeMedia = new w(ProtectedSandApp.s("ฬ"), 1);
    public static final w SystemVolumeTypeVOIP = new w(ProtectedSandApp.s("อ"), 2);

    private static final /* synthetic */ w[] $values() {
        return new w[]{SystemVolumeTypeAuto, SystemVolumeTypeMedia, SystemVolumeTypeVOIP};
    }

    static {
        w[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private w(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<w> getEntries() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}

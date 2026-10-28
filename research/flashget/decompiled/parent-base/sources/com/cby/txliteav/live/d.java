package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/cby/txliteav/live/d;", "", "Ljava/io/Serializable;", "<init>", "(Ljava/lang/String;I)V", "NONE", "CAMERA", "SCREEN_CAPTURE", "IMAGE", "AUDIU_ONLY", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements Serializable {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d NONE = new d(ProtectedSandApp.s("ു"), 0);
    public static final d CAMERA = new d(ProtectedSandApp.s("ൂ"), 1);
    public static final d SCREEN_CAPTURE = new d(ProtectedSandApp.s("ൃ"), 2);
    public static final d IMAGE = new d(ProtectedSandApp.s("ൄ"), 3);
    public static final d AUDIU_ONLY = new d(ProtectedSandApp.s("\u0d45"), 4);

    private static final /* synthetic */ d[] $values() {
        return new d[]{NONE, CAMERA, SCREEN_CAPTURE, IMAGE, AUDIU_ONLY};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private d(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<d> getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}

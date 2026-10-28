package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/cby/txliteav/live/b;", "", "<init>", "(Ljava/lang/String;I)V", "CameraResolutionStrategyAuto", "CameraResolutionStrategyPerformance", "CameraResolutionStrategyHighQuality", "CameraCaptureManual", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CameraResolutionStrategyAuto = new b(ProtectedSandApp.s("ഹ"), 0);
    public static final b CameraResolutionStrategyPerformance = new b(ProtectedSandApp.s("ഺ"), 1);
    public static final b CameraResolutionStrategyHighQuality = new b(ProtectedSandApp.s("഻"), 2);
    public static final b CameraCaptureManual = new b(ProtectedSandApp.s("഼"), 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{CameraResolutionStrategyAuto, CameraResolutionStrategyPerformance, CameraResolutionStrategyHighQuality, CameraCaptureManual};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private b(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}

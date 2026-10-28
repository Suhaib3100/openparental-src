package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapType.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/x0;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "NONE", "NORMAL", "SATELLITE", "TERRAIN", "HYBRID", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class x0 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ x0[] $VALUES;
    private final int value;
    public static final x0 NONE = new x0(ProtectedSandApp.s("ࡆ\u0001"), 0, 0);
    public static final x0 NORMAL = new x0(ProtectedSandApp.s("ࡇ\u0001"), 1, 1);
    public static final x0 SATELLITE = new x0(ProtectedSandApp.s("ࡈ\u0001"), 2, 2);
    public static final x0 TERRAIN = new x0(ProtectedSandApp.s("ࡉ\u0001"), 3, 3);
    public static final x0 HYBRID = new x0(ProtectedSandApp.s("ࡊ\u0001"), 4, 4);

    private static final /* synthetic */ x0[] $values() {
        return new x0[]{NONE, NORMAL, SATELLITE, TERRAIN, HYBRID};
    }

    static {
        x0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private x0(String str, int i4, int i5) {
        this.value = i5;
    }

    @fg.l
    public static kotlin.enums.a<x0> getEntries() {
        return $ENTRIES;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}

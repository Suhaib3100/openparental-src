package wd;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: javaElements.kt */
/* loaded from: classes8.dex */
public final class d0 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 SOURCE = new d0(ProtectedSandApp.s("ꍂ\u0001"), 0);
    public static final d0 BINARY = new d0(ProtectedSandApp.s("ꍃ\u0001"), 1);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{SOURCE, BINARY};
    }

    static {
        d0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private d0(String str, int i4) {
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}

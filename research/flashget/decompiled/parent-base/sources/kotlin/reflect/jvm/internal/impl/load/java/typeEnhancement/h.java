package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: typeQualifiers.kt */
/* loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h FORCE_FLEXIBILITY = new h(ProtectedSandApp.s("犭\u0001"), 0);
    public static final h NULLABLE = new h(ProtectedSandApp.s("犮\u0001"), 1);
    public static final h NOT_NULL = new h(ProtectedSandApp.s("犯\u0001"), 2);

    private static final /* synthetic */ h[] $values() {
        return new h[]{FORCE_FLEXIBILITY, NULLABLE, NOT_NULL};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private h(String str, int i4) {
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}

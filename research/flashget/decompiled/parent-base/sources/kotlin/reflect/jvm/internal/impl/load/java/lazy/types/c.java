package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JavaTypeFlexibility.kt */
/* loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c INFLEXIBLE = new c(ProtectedSandApp.s("爖\u0001"), 0);
    public static final c FLEXIBLE_UPPER_BOUND = new c(ProtectedSandApp.s("爗\u0001"), 1);
    public static final c FLEXIBLE_LOWER_BOUND = new c(ProtectedSandApp.s("爘\u0001"), 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{INFLEXIBLE, FLEXIBLE_UPPER_BOUND, FLEXIBLE_LOWER_BOUND};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private c(String str, int i4) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeComponentPosition.kt */
/* loaded from: classes7.dex */
public final class o {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o FLEXIBLE_LOWER = new o(ProtectedSandApp.s("猕\u0001"), 0);
    public static final o FLEXIBLE_UPPER = new o(ProtectedSandApp.s("猖\u0001"), 1);
    public static final o INFLEXIBLE = new o(ProtectedSandApp.s("猗\u0001"), 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{FLEXIBLE_LOWER, FLEXIBLE_UPPER, INFLEXIBLE};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private o(String str, int i4) {
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}

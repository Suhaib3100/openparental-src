package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FqNamesUtil.kt */
/* loaded from: classes7.dex */
final class k {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k BEGINNING = new k(ProtectedSandApp.s("皢\u0001"), 0);
    public static final k MIDDLE = new k(ProtectedSandApp.s("皣\u0001"), 1);
    public static final k AFTER_DOT = new k(ProtectedSandApp.s("皤\u0001"), 2);

    private static final /* synthetic */ k[] $values() {
        return new k[]{BEGINNING, MIDDLE, AFTER_DOT};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private k(String str, int i4) {
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}

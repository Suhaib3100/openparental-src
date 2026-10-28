package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KotlinRetention.kt */
/* loaded from: classes7.dex */
public final class m {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m RUNTIME = new m(ProtectedSandApp.s("欐\u0001"), 0);
    public static final m BINARY = new m(ProtectedSandApp.s("欑\u0001"), 1);
    public static final m SOURCE = new m(ProtectedSandApp.s("欒\u0001"), 2);

    private static final /* synthetic */ m[] $values() {
        return new m[]{RUNTIME, BINARY, SOURCE};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private m(String str, int i4) {
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}

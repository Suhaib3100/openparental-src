package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeUsage.kt */
/* loaded from: classes7.dex */
public final class s1 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ s1[] $VALUES;
    public static final s1 SUPERTYPE = new s1(ProtectedSandApp.s("者\u0001"), 0);
    public static final s1 COMMON = new s1(ProtectedSandApp.s("耆\u0001"), 1);

    private static final /* synthetic */ s1[] $values() {
        return new s1[]{SUPERTYPE, COMMON};
    }

    static {
        s1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private s1(String str, int i4) {
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) $VALUES.clone();
    }
}

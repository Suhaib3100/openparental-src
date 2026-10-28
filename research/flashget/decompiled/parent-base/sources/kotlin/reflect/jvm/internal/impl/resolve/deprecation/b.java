package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeprecationInfo.kt */
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b WARNING = new b(ProtectedSandApp.s("磽\u0001"), 0);
    public static final b ERROR = new b(ProtectedSandApp.s("磾\u0001"), 1);
    public static final b HIDDEN = new b(ProtectedSandApp.s("磿\u0001"), 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{WARNING, ERROR, HIDDEN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private b(String str, int i4) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}

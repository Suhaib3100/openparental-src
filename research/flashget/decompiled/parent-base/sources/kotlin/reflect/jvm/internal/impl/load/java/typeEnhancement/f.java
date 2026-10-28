package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: typeQualifiers.kt */
/* loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f READ_ONLY = new f(ProtectedSandApp.s("犞\u0001"), 0);
    public static final f MUTABLE = new f(ProtectedSandApp.s("犟\u0001"), 1);

    private static final /* synthetic */ f[] $values() {
        return new f[]{READ_ONLY, MUTABLE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private f(String str, int i4) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}

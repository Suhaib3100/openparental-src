package ce;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FOR_SUBTYPING = new b(ProtectedSandApp.s("㨔\u0001"), 0);
    public static final b FOR_INCORPORATION = new b(ProtectedSandApp.s("㨕\u0001"), 1);
    public static final b FROM_EXPRESSION = new b(ProtectedSandApp.s("㨖\u0001"), 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{FOR_SUBTYPING, FOR_INCORPORATION, FROM_EXPRESSION};
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

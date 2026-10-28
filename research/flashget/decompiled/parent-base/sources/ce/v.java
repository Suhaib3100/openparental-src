package ce;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes7.dex */
public final class v {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;

    @fg.l
    private final String presentation;
    public static final v IN = new v(ProtectedSandApp.s("㨙\u0001"), 0, ProtectedSandApp.s("㨘\u0001"));
    public static final v OUT = new v(ProtectedSandApp.s("㨛\u0001"), 1, ProtectedSandApp.s("㨚\u0001"));
    public static final v INV = new v(ProtectedSandApp.s("㨜\u0001"), 2, "");

    private static final /* synthetic */ v[] $values() {
        return new v[]{IN, OUT, INV};
    }

    static {
        v[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private v(String str, int i4, String str2) {
        this.presentation = str2;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @fg.l
    public String toString() {
        return this.presentation;
    }
}

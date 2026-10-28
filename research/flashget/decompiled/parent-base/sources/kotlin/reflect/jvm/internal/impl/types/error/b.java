package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorEntity.kt */
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @fg.l
    private final String debugText;
    public static final b ERROR_CLASS = new b(ProtectedSandApp.s("縗\u0001"), 0, ProtectedSandApp.s("縖\u0001"));
    public static final b ERROR_FUNCTION = new b(ProtectedSandApp.s("縙\u0001"), 1, ProtectedSandApp.s("縘\u0001"));
    public static final b ERROR_SCOPE = new b(ProtectedSandApp.s("縛\u0001"), 2, ProtectedSandApp.s("縚\u0001"));
    public static final b ERROR_MODULE = new b(ProtectedSandApp.s("縝\u0001"), 3, ProtectedSandApp.s("縜\u0001"));
    public static final b ERROR_PROPERTY = new b(ProtectedSandApp.s("縟\u0001"), 4, ProtectedSandApp.s("縞\u0001"));
    public static final b ERROR_TYPE = new b(ProtectedSandApp.s("縡\u0001"), 5, ProtectedSandApp.s("縠\u0001"));
    public static final b PARENT_OF_ERROR_SCOPE = new b(ProtectedSandApp.s("縣\u0001"), 6, ProtectedSandApp.s("縢\u0001"));

    private static final /* synthetic */ b[] $values() {
        return new b[]{ERROR_CLASS, ERROR_FUNCTION, ERROR_SCOPE, ERROR_MODULE, ERROR_PROPERTY, ERROR_TYPE, PARENT_OF_ERROR_SCOPE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private b(String str, int i4, String str2) {
        this.debugText = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @fg.l
    public final String getDebugText() {
        return this.debugText;
    }
}

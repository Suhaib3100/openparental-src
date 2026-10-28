package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorScopeKind.kt */
/* loaded from: classes7.dex */
public final class g {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @fg.l
    private final String debugMessage;
    public static final g CAPTURED_TYPE_SCOPE = new g(ProtectedSandApp.s("繋\u0001"), 0, ProtectedSandApp.s("繊\u0001"));
    public static final g INTEGER_LITERAL_TYPE_SCOPE = new g(ProtectedSandApp.s("繍\u0001"), 1, ProtectedSandApp.s("繌\u0001"));
    public static final g ERASED_RECEIVER_TYPE_SCOPE = new g(ProtectedSandApp.s("繏\u0001"), 2, ProtectedSandApp.s("繎\u0001"));
    public static final g SCOPE_FOR_ABBREVIATION_TYPE = new g(ProtectedSandApp.s("繑\u0001"), 3, ProtectedSandApp.s("繐\u0001"));
    public static final g STUB_TYPE_SCOPE = new g(ProtectedSandApp.s("繓\u0001"), 4, ProtectedSandApp.s("繒\u0001"));
    public static final g NON_CLASSIFIER_SUPER_TYPE_SCOPE = new g(ProtectedSandApp.s("繕\u0001"), 5, ProtectedSandApp.s("織\u0001"));
    public static final g ERROR_TYPE_SCOPE = new g(ProtectedSandApp.s("繗\u0001"), 6, ProtectedSandApp.s("繖\u0001"));
    public static final g UNSUPPORTED_TYPE_SCOPE = new g(ProtectedSandApp.s("繙\u0001"), 7, ProtectedSandApp.s("繘\u0001"));
    public static final g SCOPE_FOR_ERROR_CLASS = new g(ProtectedSandApp.s("繛\u0001"), 8, ProtectedSandApp.s("繚\u0001"));
    public static final g SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = new g(ProtectedSandApp.s("繝\u0001"), 9, ProtectedSandApp.s("繜\u0001"));

    private static final /* synthetic */ g[] $values() {
        return new g[]{CAPTURED_TYPE_SCOPE, INTEGER_LITERAL_TYPE_SCOPE, ERASED_RECEIVER_TYPE_SCOPE, SCOPE_FOR_ABBREVIATION_TYPE, STUB_TYPE_SCOPE, NON_CLASSIFIER_SUPER_TYPE_SCOPE, ERROR_TYPE_SCOPE, UNSUPPORTED_TYPE_SCOPE, SCOPE_FOR_ERROR_CLASS, SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private g(String str, int i4, String str2) {
        this.debugMessage = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @fg.l
    public final String getDebugMessage() {
        return this.debugMessage;
    }
}

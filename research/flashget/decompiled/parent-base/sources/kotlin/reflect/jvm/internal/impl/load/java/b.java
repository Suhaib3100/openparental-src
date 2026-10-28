package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnnotationQualifierApplicabilityType.kt */
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FIELD;
    public static final b TYPE_PARAMETER;
    public static final b TYPE_PARAMETER_BOUNDS;
    public static final b TYPE_USE;

    @fg.l
    private final String javaTarget;
    public static final b METHOD_RETURN_TYPE = new b(ProtectedSandApp.s("澠\u0001"), 0, ProtectedSandApp.s("澟\u0001"));
    public static final b VALUE_PARAMETER = new b(ProtectedSandApp.s("澢\u0001"), 1, ProtectedSandApp.s("澡\u0001"));

    private static final /* synthetic */ b[] $values() {
        return new b[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        String s4 = ProtectedSandApp.s("澣\u0001");
        FIELD = new b(s4, 2, s4);
        String s5 = ProtectedSandApp.s("澤\u0001");
        TYPE_USE = new b(s5, 3, s5);
        TYPE_PARAMETER_BOUNDS = new b(ProtectedSandApp.s("澥\u0001"), 4, s5);
        String s6 = ProtectedSandApp.s("澦\u0001");
        TYPE_PARAMETER = new b(s6, 5, s6);
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private b(String str, int i4, String str2) {
        this.javaTarget = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @fg.l
    public final String getJavaTarget() {
        return this.javaTarget;
    }
}

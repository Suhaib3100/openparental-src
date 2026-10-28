package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FIELD' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: AnnotationQualifierApplicabilityType.kt */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b FIELD;
    public static final b TYPE_PARAMETER;
    public static final b TYPE_PARAMETER_BOUNDS;
    public static final b TYPE_USE;

    @d5.d
    private final String javaTarget;
    public static final b METHOD_RETURN_TYPE = new b(ProtectedSandApp.s("䤘"), 0, ProtectedSandApp.s("䤗"));
    public static final b VALUE_PARAMETER = new b(ProtectedSandApp.s("䤚"), 1, ProtectedSandApp.s("䤙"));

    private static final /* synthetic */ b[] $values() {
        return new b[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        String s5 = ProtectedSandApp.s("䤛");
        FIELD = new b(s5, 2, s5);
        String s6 = ProtectedSandApp.s("䤜");
        TYPE_USE = new b(s6, 3, s6);
        TYPE_PARAMETER_BOUNDS = new b(ProtectedSandApp.s("䤝"), 4, s6);
        String s7 = ProtectedSandApp.s("䤞");
        TYPE_PARAMETER = new b(s7, 5, s7);
        $VALUES = $values();
    }

    private b(String str, int i5, String str2) {
        this.javaTarget = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @d5.d
    public final String getJavaTarget() {
        return this.javaTarget;
    }
}

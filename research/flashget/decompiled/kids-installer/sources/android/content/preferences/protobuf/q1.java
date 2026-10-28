package android.content.preferences.protobuf;

import com.google.firebase.remoteconfig.p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: JavaType.java */
/* loaded from: classes.dex */
public final class q1 {
    private static final /* synthetic */ q1[] $VALUES;
    public static final q1 BOOLEAN;
    public static final q1 BYTE_STRING;
    public static final q1 DOUBLE;
    public static final q1 ENUM;
    public static final q1 FLOAT;
    public static final q1 INT;
    public static final q1 LONG;
    public static final q1 MESSAGE;
    public static final q1 STRING;
    public static final q1 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        q1 q1Var = new q1("VOID", 0, Void.class, Void.class, null);
        VOID = q1Var;
        Class cls = Integer.TYPE;
        q1 q1Var2 = new q1("INT", 1, cls, Integer.class, 0);
        INT = q1Var2;
        q1 q1Var3 = new q1("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = q1Var3;
        q1 q1Var4 = new q1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = q1Var4;
        q1 q1Var5 = new q1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(p.f18289o));
        DOUBLE = q1Var5;
        q1 q1Var6 = new q1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = q1Var6;
        q1 q1Var7 = new q1("STRING", 6, String.class, String.class, "");
        STRING = q1Var7;
        q1 q1Var8 = new q1("BYTE_STRING", 7, w.class, w.class, w.f7553s);
        BYTE_STRING = q1Var8;
        q1 q1Var9 = new q1("ENUM", 8, cls, Integer.class, null);
        ENUM = q1Var9;
        q1 q1Var10 = new q1("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = q1Var10;
        $VALUES = new q1[]{q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6, q1Var7, q1Var8, q1Var9, q1Var10};
    }

    private q1(String str, int i5, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}

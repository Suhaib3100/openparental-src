package androidx.content.preferences.protobuf;

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
/* loaded from: classes3.dex */
public final class r1 {
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 BOOLEAN;
    public static final r1 BYTE_STRING;
    public static final r1 DOUBLE;
    public static final r1 ENUM;
    public static final r1 FLOAT;
    public static final r1 INT;
    public static final r1 LONG;
    public static final r1 MESSAGE;
    public static final r1 STRING;
    public static final r1 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        r1 r1Var = new r1("VOID", 0, Void.class, Void.class, null);
        VOID = r1Var;
        Class cls = Integer.TYPE;
        r1 r1Var2 = new r1("INT", 1, cls, Integer.class, 0);
        INT = r1Var2;
        r1 r1Var3 = new r1("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = r1Var3;
        r1 r1Var4 = new r1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = r1Var4;
        r1 r1Var5 = new r1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(p.f60679p));
        DOUBLE = r1Var5;
        r1 r1Var6 = new r1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = r1Var6;
        r1 r1Var7 = new r1("STRING", 6, String.class, String.class, "");
        STRING = r1Var7;
        r1 r1Var8 = new r1("BYTE_STRING", 7, w.class, w.class, w.f28998f);
        BYTE_STRING = r1Var8;
        r1 r1Var9 = new r1("ENUM", 8, cls, Integer.class, null);
        ENUM = r1Var9;
        r1 r1Var10 = new r1("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = r1Var10;
        $VALUES = new r1[]{r1Var, r1Var2, r1Var3, r1Var4, r1Var5, r1Var6, r1Var7, r1Var8, r1Var9, r1Var10};
    }

    private r1(String str, int i4, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
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

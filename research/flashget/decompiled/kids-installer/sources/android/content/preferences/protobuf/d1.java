package android.content.preferences.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: FieldType.java */
/* loaded from: classes.dex */
public final class d1 {
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 BOOL;
    public static final d1 BOOL_LIST;
    public static final d1 BOOL_LIST_PACKED;
    public static final d1 BYTES;
    public static final d1 BYTES_LIST;
    public static final d1 DOUBLE;
    public static final d1 DOUBLE_LIST;
    public static final d1 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final d1 ENUM;
    public static final d1 ENUM_LIST;
    public static final d1 ENUM_LIST_PACKED;
    public static final d1 FIXED32;
    public static final d1 FIXED32_LIST;
    public static final d1 FIXED32_LIST_PACKED;
    public static final d1 FIXED64;
    public static final d1 FIXED64_LIST;
    public static final d1 FIXED64_LIST_PACKED;
    public static final d1 FLOAT;
    public static final d1 FLOAT_LIST;
    public static final d1 FLOAT_LIST_PACKED;
    public static final d1 GROUP;
    public static final d1 GROUP_LIST;
    public static final d1 INT32;
    public static final d1 INT32_LIST;
    public static final d1 INT32_LIST_PACKED;
    public static final d1 INT64;
    public static final d1 INT64_LIST;
    public static final d1 INT64_LIST_PACKED;
    public static final d1 MAP;
    public static final d1 MESSAGE;
    public static final d1 MESSAGE_LIST;
    public static final d1 SFIXED32;
    public static final d1 SFIXED32_LIST;
    public static final d1 SFIXED32_LIST_PACKED;
    public static final d1 SFIXED64;
    public static final d1 SFIXED64_LIST;
    public static final d1 SFIXED64_LIST_PACKED;
    public static final d1 SINT32;
    public static final d1 SINT32_LIST;
    public static final d1 SINT32_LIST_PACKED;
    public static final d1 SINT64;
    public static final d1 SINT64_LIST;
    public static final d1 SINT64_LIST_PACKED;
    public static final d1 STRING;
    public static final d1 STRING_LIST;
    public static final d1 UINT32;
    public static final d1 UINT32_LIST;
    public static final d1 UINT32_LIST_PACKED;
    public static final d1 UINT64;
    public static final d1 UINT64_LIST;
    public static final d1 UINT64_LIST_PACKED;
    private static final d1[] VALUES;
    private final b collection;
    private final Class<?> elementType;
    private final int id;
    private final q1 javaType;
    private final boolean primitiveScalar;

    /* compiled from: FieldType.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7212a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7213b;

        static {
            int[] iArr = new int[q1.values().length];
            f7213b = iArr;
            try {
                iArr[q1.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7213b[q1.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7213b[q1.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f7212a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7212a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7212a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: FieldType.java */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z5) {
            this.isList = z5;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        b bVar = b.SCALAR;
        q1 q1Var = q1.DOUBLE;
        d1 d1Var = new d1("DOUBLE", 0, 0, bVar, q1Var);
        DOUBLE = d1Var;
        q1 q1Var2 = q1.FLOAT;
        d1 d1Var2 = new d1("FLOAT", 1, 1, bVar, q1Var2);
        FLOAT = d1Var2;
        q1 q1Var3 = q1.LONG;
        d1 d1Var3 = new d1("INT64", 2, 2, bVar, q1Var3);
        INT64 = d1Var3;
        d1 d1Var4 = new d1("UINT64", 3, 3, bVar, q1Var3);
        UINT64 = d1Var4;
        q1 q1Var4 = q1.INT;
        d1 d1Var5 = new d1("INT32", 4, 4, bVar, q1Var4);
        INT32 = d1Var5;
        d1 d1Var6 = new d1("FIXED64", 5, 5, bVar, q1Var3);
        FIXED64 = d1Var6;
        d1 d1Var7 = new d1("FIXED32", 6, 6, bVar, q1Var4);
        FIXED32 = d1Var7;
        q1 q1Var5 = q1.BOOLEAN;
        d1 d1Var8 = new d1("BOOL", 7, 7, bVar, q1Var5);
        BOOL = d1Var8;
        q1 q1Var6 = q1.STRING;
        d1 d1Var9 = new d1("STRING", 8, 8, bVar, q1Var6);
        STRING = d1Var9;
        q1 q1Var7 = q1.MESSAGE;
        d1 d1Var10 = new d1("MESSAGE", 9, 9, bVar, q1Var7);
        MESSAGE = d1Var10;
        q1 q1Var8 = q1.BYTE_STRING;
        d1 d1Var11 = new d1("BYTES", 10, 10, bVar, q1Var8);
        BYTES = d1Var11;
        d1 d1Var12 = new d1("UINT32", 11, 11, bVar, q1Var4);
        UINT32 = d1Var12;
        q1 q1Var9 = q1.ENUM;
        d1 d1Var13 = new d1("ENUM", 12, 12, bVar, q1Var9);
        ENUM = d1Var13;
        d1 d1Var14 = new d1("SFIXED32", 13, 13, bVar, q1Var4);
        SFIXED32 = d1Var14;
        d1 d1Var15 = new d1("SFIXED64", 14, 14, bVar, q1Var3);
        SFIXED64 = d1Var15;
        d1 d1Var16 = new d1("SINT32", 15, 15, bVar, q1Var4);
        SINT32 = d1Var16;
        d1 d1Var17 = new d1("SINT64", 16, 16, bVar, q1Var3);
        SINT64 = d1Var17;
        d1 d1Var18 = new d1("GROUP", 17, 17, bVar, q1Var7);
        GROUP = d1Var18;
        b bVar2 = b.VECTOR;
        d1 d1Var19 = new d1("DOUBLE_LIST", 18, 18, bVar2, q1Var);
        DOUBLE_LIST = d1Var19;
        d1 d1Var20 = new d1("FLOAT_LIST", 19, 19, bVar2, q1Var2);
        FLOAT_LIST = d1Var20;
        d1 d1Var21 = new d1("INT64_LIST", 20, 20, bVar2, q1Var3);
        INT64_LIST = d1Var21;
        d1 d1Var22 = new d1("UINT64_LIST", 21, 21, bVar2, q1Var3);
        UINT64_LIST = d1Var22;
        d1 d1Var23 = new d1("INT32_LIST", 22, 22, bVar2, q1Var4);
        INT32_LIST = d1Var23;
        d1 d1Var24 = new d1("FIXED64_LIST", 23, 23, bVar2, q1Var3);
        FIXED64_LIST = d1Var24;
        d1 d1Var25 = new d1("FIXED32_LIST", 24, 24, bVar2, q1Var4);
        FIXED32_LIST = d1Var25;
        d1 d1Var26 = new d1("BOOL_LIST", 25, 25, bVar2, q1Var5);
        BOOL_LIST = d1Var26;
        d1 d1Var27 = new d1("STRING_LIST", 26, 26, bVar2, q1Var6);
        STRING_LIST = d1Var27;
        d1 d1Var28 = new d1("MESSAGE_LIST", 27, 27, bVar2, q1Var7);
        MESSAGE_LIST = d1Var28;
        d1 d1Var29 = new d1("BYTES_LIST", 28, 28, bVar2, q1Var8);
        BYTES_LIST = d1Var29;
        d1 d1Var30 = new d1("UINT32_LIST", 29, 29, bVar2, q1Var4);
        UINT32_LIST = d1Var30;
        d1 d1Var31 = new d1("ENUM_LIST", 30, 30, bVar2, q1Var9);
        ENUM_LIST = d1Var31;
        d1 d1Var32 = new d1("SFIXED32_LIST", 31, 31, bVar2, q1Var4);
        SFIXED32_LIST = d1Var32;
        d1 d1Var33 = new d1("SFIXED64_LIST", 32, 32, bVar2, q1Var3);
        SFIXED64_LIST = d1Var33;
        d1 d1Var34 = new d1("SINT32_LIST", 33, 33, bVar2, q1Var4);
        SINT32_LIST = d1Var34;
        d1 d1Var35 = new d1("SINT64_LIST", 34, 34, bVar2, q1Var3);
        SINT64_LIST = d1Var35;
        b bVar3 = b.PACKED_VECTOR;
        d1 d1Var36 = new d1("DOUBLE_LIST_PACKED", 35, 35, bVar3, q1Var);
        DOUBLE_LIST_PACKED = d1Var36;
        d1 d1Var37 = new d1("FLOAT_LIST_PACKED", 36, 36, bVar3, q1Var2);
        FLOAT_LIST_PACKED = d1Var37;
        d1 d1Var38 = new d1("INT64_LIST_PACKED", 37, 37, bVar3, q1Var3);
        INT64_LIST_PACKED = d1Var38;
        d1 d1Var39 = new d1("UINT64_LIST_PACKED", 38, 38, bVar3, q1Var3);
        UINT64_LIST_PACKED = d1Var39;
        d1 d1Var40 = new d1("INT32_LIST_PACKED", 39, 39, bVar3, q1Var4);
        INT32_LIST_PACKED = d1Var40;
        d1 d1Var41 = new d1("FIXED64_LIST_PACKED", 40, 40, bVar3, q1Var3);
        FIXED64_LIST_PACKED = d1Var41;
        d1 d1Var42 = new d1("FIXED32_LIST_PACKED", 41, 41, bVar3, q1Var4);
        FIXED32_LIST_PACKED = d1Var42;
        d1 d1Var43 = new d1("BOOL_LIST_PACKED", 42, 42, bVar3, q1Var5);
        BOOL_LIST_PACKED = d1Var43;
        d1 d1Var44 = new d1("UINT32_LIST_PACKED", 43, 43, bVar3, q1Var4);
        UINT32_LIST_PACKED = d1Var44;
        d1 d1Var45 = new d1("ENUM_LIST_PACKED", 44, 44, bVar3, q1Var9);
        ENUM_LIST_PACKED = d1Var45;
        d1 d1Var46 = new d1("SFIXED32_LIST_PACKED", 45, 45, bVar3, q1Var4);
        SFIXED32_LIST_PACKED = d1Var46;
        d1 d1Var47 = new d1("SFIXED64_LIST_PACKED", 46, 46, bVar3, q1Var3);
        SFIXED64_LIST_PACKED = d1Var47;
        d1 d1Var48 = new d1("SINT32_LIST_PACKED", 47, 47, bVar3, q1Var4);
        SINT32_LIST_PACKED = d1Var48;
        d1 d1Var49 = new d1("SINT64_LIST_PACKED", 48, 48, bVar3, q1Var3);
        SINT64_LIST_PACKED = d1Var49;
        d1 d1Var50 = new d1("GROUP_LIST", 49, 49, bVar2, q1Var7);
        GROUP_LIST = d1Var50;
        d1 d1Var51 = new d1("MAP", 50, 50, b.MAP, q1.VOID);
        MAP = d1Var51;
        $VALUES = new d1[]{d1Var, d1Var2, d1Var3, d1Var4, d1Var5, d1Var6, d1Var7, d1Var8, d1Var9, d1Var10, d1Var11, d1Var12, d1Var13, d1Var14, d1Var15, d1Var16, d1Var17, d1Var18, d1Var19, d1Var20, d1Var21, d1Var22, d1Var23, d1Var24, d1Var25, d1Var26, d1Var27, d1Var28, d1Var29, d1Var30, d1Var31, d1Var32, d1Var33, d1Var34, d1Var35, d1Var36, d1Var37, d1Var38, d1Var39, d1Var40, d1Var41, d1Var42, d1Var43, d1Var44, d1Var45, d1Var46, d1Var47, d1Var48, d1Var49, d1Var50, d1Var51};
        EMPTY_TYPES = new Type[0];
        d1[] values = values();
        VALUES = new d1[values.length];
        for (d1 d1Var52 : values) {
            VALUES[d1Var52.id] = d1Var52;
        }
    }

    private d1(String str, int i5, int i6, b bVar, q1 q1Var) {
        int i7;
        this.id = i6;
        this.collection = bVar;
        this.javaType = q1Var;
        int i8 = a.f7212a[bVar.ordinal()];
        if (i8 == 1) {
            this.elementType = q1Var.getBoxedType();
        } else if (i8 != 2) {
            this.elementType = null;
        } else {
            this.elementType = q1Var.getBoxedType();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i7 = a.f7213b[q1Var.ordinal()]) == 1 || i7 == 2 || i7 == 3) ? false : true;
    }

    public static d1 forId(int i5) {
        if (i5 < 0) {
            return null;
        }
        d1[] d1VarArr = VALUES;
        if (i5 >= d1VarArr.length) {
            return null;
        }
        return d1VarArr[i5];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        boolean z5;
        while (true) {
            int i5 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i5 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i5];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i5++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i6 = 0; i6 < actualTypeArguments.length; i6++) {
                    Type type = actualTypeArguments[i6];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        int i7 = 0;
                        while (true) {
                            if (i7 >= typeParameters.length) {
                                z5 = false;
                                break;
                            }
                            if (type == typeParameters[i7]) {
                                actualTypeArguments[i6] = typeArr[i7];
                                z5 = true;
                                break;
                            }
                            i7++;
                        }
                        if (!z5) {
                            throw new RuntimeException("Unable to find replacement for " + type);
                        }
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }

    public q1 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}

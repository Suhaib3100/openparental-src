package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: WireFormat.java */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    static final int f77785a = 11;

    /* renamed from: b, reason: collision with root package name */
    static final int f77786b = 12;

    /* renamed from: c, reason: collision with root package name */
    static final int f77787c = 16;

    /* renamed from: d, reason: collision with root package name */
    static final int f77788d = 26;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: WireFormat.java */
    public static class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOL;
        public static final b BYTES;
        public static final b DOUBLE;
        public static final b ENUM;
        public static final b FIXED32;
        public static final b FIXED64;
        public static final b FLOAT;
        public static final b GROUP;
        public static final b INT32;
        public static final b INT64;
        public static final b MESSAGE;
        public static final b SFIXED32;
        public static final b SFIXED64;
        public static final b SINT32;
        public static final b SINT64;
        public static final b STRING;
        public static final b UINT32;
        public static final b UINT64;
        private final c javaType;
        private final int wireType;

        /* compiled from: WireFormat.java */
        enum a extends b {
            a(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$b, reason: collision with other inner class name */
        enum C1170b extends b {
            C1170b(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        enum c extends b {
            c(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        enum d extends b {
            d(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean isPackable() {
                return false;
            }
        }

        static {
            b bVar = new b(ProtectedSandApp.s("盠\u0001"), 0, c.DOUBLE, 1);
            DOUBLE = bVar;
            b bVar2 = new b(ProtectedSandApp.s("盡\u0001"), 1, c.FLOAT, 5);
            FLOAT = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b(ProtectedSandApp.s("盢\u0001"), 2, cVar, 0);
            INT64 = bVar3;
            b bVar4 = new b(ProtectedSandApp.s("監\u0001"), 3, cVar, 0);
            UINT64 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b(ProtectedSandApp.s("盤\u0001"), 4, cVar2, 0);
            INT32 = bVar5;
            b bVar6 = new b(ProtectedSandApp.s("盥\u0001"), 5, cVar, 1);
            FIXED64 = bVar6;
            b bVar7 = new b(ProtectedSandApp.s("盦\u0001"), 6, cVar2, 5);
            FIXED32 = bVar7;
            b bVar8 = new b(ProtectedSandApp.s("盧\u0001"), 7, c.BOOLEAN, 0);
            BOOL = bVar8;
            a aVar = new a(ProtectedSandApp.s("盨\u0001"), 8, c.STRING, 2);
            STRING = aVar;
            c cVar3 = c.MESSAGE;
            C1170b c1170b = new C1170b(ProtectedSandApp.s("盩\u0001"), 9, cVar3, 3);
            GROUP = c1170b;
            c cVar4 = new c(ProtectedSandApp.s("盪\u0001"), 10, cVar3, 2);
            MESSAGE = cVar4;
            d dVar = new d(ProtectedSandApp.s("盫\u0001"), 11, c.BYTE_STRING, 2);
            BYTES = dVar;
            b bVar9 = new b(ProtectedSandApp.s("盬\u0001"), 12, cVar2, 0);
            UINT32 = bVar9;
            b bVar10 = new b(ProtectedSandApp.s("盭\u0001"), 13, c.ENUM, 0);
            ENUM = bVar10;
            b bVar11 = new b(ProtectedSandApp.s("目\u0001"), 14, cVar2, 5);
            SFIXED32 = bVar11;
            b bVar12 = new b(ProtectedSandApp.s("盯\u0001"), 15, cVar, 1);
            SFIXED64 = bVar12;
            b bVar13 = new b(ProtectedSandApp.s("盰\u0001"), 16, cVar2, 0);
            SINT32 = bVar13;
            b bVar14 = new b(ProtectedSandApp.s("盱\u0001"), 17, cVar, 0);
            SINT64 = bVar14;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c1170b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public c getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private b(String str, int i4, c cVar, int i5) {
            this.javaType = cVar;
            this.wireType = i5;
        }
    }

    /* compiled from: WireFormat.java */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(com.google.firebase.remoteconfig.p.f60679p)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(d.f77674b),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }
    }

    public static int a(int i4) {
        return i4 >>> 3;
    }

    static int b(int i4) {
        return i4 & 7;
    }

    static int c(int i4, int i5) {
        return (i4 << 3) | i5;
    }
}

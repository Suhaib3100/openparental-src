package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: WireFormat.java */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    static final int f25803a = 11;

    /* renamed from: b, reason: collision with root package name */
    static final int f25804b = 12;

    /* renamed from: c, reason: collision with root package name */
    static final int f25805c = 16;

    /* renamed from: d, reason: collision with root package name */
    static final int f25806d = 26;

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
            a(String str, int i5, c cVar, int i6) {
                super(str, i5, cVar, i6);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$b, reason: collision with other inner class name */
        enum C0365b extends b {
            C0365b(String str, int i5, c cVar, int i6) {
                super(str, i5, cVar, i6);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        enum c extends b {
            c(String str, int i5, c cVar, int i6) {
                super(str, i5, cVar, i6);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        enum d extends b {
            d(String str, int i5, c cVar, int i6) {
                super(str, i5, cVar, i6);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean isPackable() {
                return false;
            }
        }

        static {
            b bVar = new b(ProtectedSandApp.s("佝"), 0, c.DOUBLE, 1);
            DOUBLE = bVar;
            b bVar2 = new b(ProtectedSandApp.s("佞"), 1, c.FLOAT, 5);
            FLOAT = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b(ProtectedSandApp.s("佟"), 2, cVar, 0);
            INT64 = bVar3;
            b bVar4 = new b(ProtectedSandApp.s("你"), 3, cVar, 0);
            UINT64 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b(ProtectedSandApp.s("佡"), 4, cVar2, 0);
            INT32 = bVar5;
            b bVar6 = new b(ProtectedSandApp.s("佢"), 5, cVar, 1);
            FIXED64 = bVar6;
            b bVar7 = new b(ProtectedSandApp.s("佣"), 6, cVar2, 5);
            FIXED32 = bVar7;
            b bVar8 = new b(ProtectedSandApp.s("佤"), 7, c.BOOLEAN, 0);
            BOOL = bVar8;
            a aVar = new a(ProtectedSandApp.s("佥"), 8, c.STRING, 2);
            STRING = aVar;
            c cVar3 = c.MESSAGE;
            C0365b c0365b = new C0365b(ProtectedSandApp.s("佦"), 9, cVar3, 3);
            GROUP = c0365b;
            c cVar4 = new c(ProtectedSandApp.s("佧"), 10, cVar3, 2);
            MESSAGE = cVar4;
            d dVar = new d(ProtectedSandApp.s("佨"), 11, c.BYTE_STRING, 2);
            BYTES = dVar;
            b bVar9 = new b(ProtectedSandApp.s("佩"), 12, cVar2, 0);
            UINT32 = bVar9;
            b bVar10 = new b(ProtectedSandApp.s("佪"), 13, c.ENUM, 0);
            ENUM = bVar10;
            b bVar11 = new b(ProtectedSandApp.s("佫"), 14, cVar2, 5);
            SFIXED32 = bVar11;
            b bVar12 = new b(ProtectedSandApp.s("佬"), 15, cVar, 1);
            SFIXED64 = bVar12;
            b bVar13 = new b(ProtectedSandApp.s("佭"), 16, cVar2, 0);
            SINT32 = bVar13;
            b bVar14 = new b(ProtectedSandApp.s("佮"), 17, cVar, 0);
            SINT64 = bVar14;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0365b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
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

        private b(String str, int i5, c cVar, int i6) {
            this.javaType = cVar;
            this.wireType = i6;
        }
    }

    /* compiled from: WireFormat.java */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(com.google.firebase.remoteconfig.p.f18289o)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(d.f25692o),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }
    }

    public static int a(int i5) {
        return i5 >>> 3;
    }

    static int b(int i5) {
        return i5 & 7;
    }

    static int c(int i5, int i6) {
        return (i5 << 3) | i6;
    }
}

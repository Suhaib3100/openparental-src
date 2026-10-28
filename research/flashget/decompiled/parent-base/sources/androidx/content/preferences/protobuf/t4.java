package androidx.content.preferences.protobuf;

import com.google.firebase.remoteconfig.p;
import java.io.IOException;

/* compiled from: WireFormat.java */
/* loaded from: classes3.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    static final int f28958a = 4;

    /* renamed from: b, reason: collision with root package name */
    static final int f28959b = 8;

    /* renamed from: c, reason: collision with root package name */
    static final int f28960c = 5;

    /* renamed from: d, reason: collision with root package name */
    static final int f28961d = 10;

    /* renamed from: e, reason: collision with root package name */
    static final int f28962e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static final int f28963f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f28964g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f28965h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f28966i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f28967j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f28968k = 5;

    /* renamed from: l, reason: collision with root package name */
    static final int f28969l = 3;

    /* renamed from: m, reason: collision with root package name */
    static final int f28970m = 7;

    /* renamed from: n, reason: collision with root package name */
    static final int f28971n = 1;

    /* renamed from: o, reason: collision with root package name */
    static final int f28972o = 2;

    /* renamed from: p, reason: collision with root package name */
    static final int f28973p = 3;

    /* renamed from: q, reason: collision with root package name */
    static final int f28974q = 11;

    /* renamed from: r, reason: collision with root package name */
    static final int f28975r = 12;

    /* renamed from: s, reason: collision with root package name */
    static final int f28976s = 16;

    /* renamed from: t, reason: collision with root package name */
    static final int f28977t = 26;

    /* compiled from: WireFormat.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28978a;

        static {
            int[] iArr = new int[b.values().length];
            f28978a = iArr;
            try {
                iArr[b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28978a[b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28978a[b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28978a[b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28978a[b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28978a[b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28978a[b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28978a[b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28978a[b.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28978a[b.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28978a[b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28978a[b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28978a[b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28978a[b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28978a[b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28978a[b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28978a[b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28978a[b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

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
                super(str, i4, cVar, i5, null);
            }

            @Override // androidx.datastore.preferences.protobuf.t4.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: androidx.datastore.preferences.protobuf.t4$b$b, reason: collision with other inner class name */
        enum C0473b extends b {
            C0473b(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5, null);
            }

            @Override // androidx.datastore.preferences.protobuf.t4.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        enum c extends b {
            c(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5, null);
            }

            @Override // androidx.datastore.preferences.protobuf.t4.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        enum d extends b {
            d(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5, null);
            }

            @Override // androidx.datastore.preferences.protobuf.t4.b
            public boolean isPackable() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            DOUBLE = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            FLOAT = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            INT64 = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            UINT64 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            INT32 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            FIXED64 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            FIXED32 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            BOOL = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            STRING = aVar;
            c cVar3 = c.MESSAGE;
            C0473b c0473b = new C0473b("GROUP", 9, cVar3, 3);
            GROUP = c0473b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            MESSAGE = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            BYTES = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            UINT32 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            ENUM = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            SFIXED32 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            SFIXED64 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            SINT32 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            SINT64 = bVar14;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0473b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        /* synthetic */ b(String str, int i4, c cVar, int i5, a aVar) {
            this(str, i4, cVar, i5);
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
        DOUBLE(Double.valueOf(p.f60679p)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(w.f28998f),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }

        Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WireFormat.java */
    static abstract class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d LAZY;
        public static final d LOOSE;
        public static final d STRICT;

        /* compiled from: WireFormat.java */
        enum a extends d {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // androidx.datastore.preferences.protobuf.t4.d
            Object readString(z zVar) throws IOException {
                return zVar.W();
            }
        }

        /* compiled from: WireFormat.java */
        enum b extends d {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // androidx.datastore.preferences.protobuf.t4.d
            Object readString(z zVar) throws IOException {
                return zVar.X();
            }
        }

        /* compiled from: WireFormat.java */
        enum c extends d {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // androidx.datastore.preferences.protobuf.t4.d
            Object readString(z zVar) throws IOException {
                return zVar.x();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            LOOSE = aVar;
            b bVar = new b("STRICT", 1);
            STRICT = bVar;
            c cVar = new c("LAZY", 2);
            LAZY = cVar;
            $VALUES = new d[]{aVar, bVar, cVar};
        }

        private d(String str, int i4) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        abstract Object readString(z zVar) throws IOException;

        /* synthetic */ d(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    private t4() {
    }

    public static int a(int i4) {
        return i4 >>> 3;
    }

    public static int b(int i4) {
        return i4 & 7;
    }

    static int c(int i4, int i5) {
        return (i4 << 3) | i5;
    }

    static Object d(z zVar, b bVar, d dVar) throws IOException {
        switch (a.f28978a[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(zVar.y());
            case 2:
                return Float.valueOf(zVar.C());
            case 3:
                return Long.valueOf(zVar.G());
            case 4:
                return Long.valueOf(zVar.a0());
            case 5:
                return Integer.valueOf(zVar.F());
            case 6:
                return Long.valueOf(zVar.B());
            case 7:
                return Integer.valueOf(zVar.A());
            case 8:
                return Boolean.valueOf(zVar.u());
            case 9:
                return zVar.x();
            case 10:
                return Integer.valueOf(zVar.Z());
            case 11:
                return Integer.valueOf(zVar.S());
            case 12:
                return Long.valueOf(zVar.T());
            case 13:
                return Integer.valueOf(zVar.U());
            case 14:
                return Long.valueOf(zVar.V());
            case 15:
                return dVar.readString(zVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}

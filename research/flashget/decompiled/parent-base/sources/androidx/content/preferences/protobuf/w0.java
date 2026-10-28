package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.a3;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.p1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Field.java */
/* loaded from: classes3.dex */
public final class w0 extends i1<w0, b> implements b1 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final w0 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile c3<w0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private p1.k<a3> options_ = g3.f();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* compiled from: Field.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29019a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f29019a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29019a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29019a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29019a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29019a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29019a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29019a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Field.java */
    public static final class b extends i1.b<w0, b> implements b1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.b1
        public String A() {
            return ((w0) this.f28695c).A();
        }

        public b B2(String str) {
            W1();
            ((w0) this.f28695c).f4(str);
            return this;
        }

        public b C2(w wVar) {
            W1();
            ((w0) this.f28695c).g4(wVar);
            return this;
        }

        public b D2(d dVar) {
            W1();
            ((w0) this.f28695c).h4(dVar);
            return this;
        }

        public b E2(int i4) {
            W1();
            w0.J2((w0) this.f28695c, i4);
            return this;
        }

        public b F2(String str) {
            W1();
            ((w0) this.f28695c).j4(str);
            return this;
        }

        public b G2(w wVar) {
            W1();
            ((w0) this.f28695c).k4(wVar);
            return this;
        }

        public b H2(int i4) {
            W1();
            w0.n3((w0) this.f28695c, i4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public c I() {
            return ((w0) this.f28695c).I();
        }

        public b I2(int i4) {
            W1();
            w0.P2((w0) this.f28695c, i4);
            return this;
        }

        public b J2(int i4, a3.b bVar) {
            W1();
            ((w0) this.f28695c).n4(i4, bVar);
            return this;
        }

        public b K2(int i4, a3 a3Var) {
            W1();
            ((w0) this.f28695c).o4(i4, a3Var);
            return this;
        }

        public b L2(boolean z4) {
            W1();
            w0.R2((w0) this.f28695c, z4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public boolean M() {
            return ((w0) this.f28695c).M();
        }

        public b M2(String str) {
            W1();
            ((w0) this.f28695c).q4(str);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public w N() {
            return ((w0) this.f28695c).N();
        }

        public b N2(w wVar) {
            W1();
            ((w0) this.f28695c).r4(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public int Y() {
            return ((w0) this.f28695c).Y();
        }

        @Override // androidx.content.preferences.protobuf.b1
        public d b() {
            return ((w0) this.f28695c).b();
        }

        @Override // androidx.content.preferences.protobuf.b1
        public w c() {
            return ((w0) this.f28695c).c();
        }

        @Override // androidx.content.preferences.protobuf.b1
        public List<a3> d() {
            return Collections.unmodifiableList(((w0) this.f28695c).d());
        }

        @Override // androidx.content.preferences.protobuf.b1
        public int e() {
            return ((w0) this.f28695c).e();
        }

        public b e2(Iterable<? extends a3> iterable) {
            W1();
            ((w0) this.f28695c).q3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public a3 f(int i4) {
            return ((w0) this.f28695c).f(i4);
        }

        public b f2(int i4, a3.b bVar) {
            W1();
            ((w0) this.f28695c).r3(i4, bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public int g0() {
            return ((w0) this.f28695c).g0();
        }

        public b g2(int i4, a3 a3Var) {
            W1();
            ((w0) this.f28695c).s3(i4, a3Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public String getName() {
            return ((w0) this.f28695c).getName();
        }

        @Override // androidx.content.preferences.protobuf.b1
        public int getNumber() {
            return ((w0) this.f28695c).getNumber();
        }

        public b h2(a3.b bVar) {
            W1();
            ((w0) this.f28695c).t3(bVar);
            return this;
        }

        public b i2(a3 a3Var) {
            W1();
            ((w0) this.f28695c).u3(a3Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public String j1() {
            return ((w0) this.f28695c).j1();
        }

        public b j2() {
            W1();
            w0.m3((w0) this.f28695c);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public int k1() {
            return ((w0) this.f28695c).k1();
        }

        public b k2() {
            W1();
            ((w0) this.f28695c).x3();
            return this;
        }

        public b l2() {
            W1();
            ((w0) this.f28695c).y3();
            return this;
        }

        public b m2() {
            W1();
            w0.f3((w0) this.f28695c);
            return this;
        }

        public b o2() {
            W1();
            ((w0) this.f28695c).B3();
            return this;
        }

        public b p2() {
            W1();
            w0.o3((w0) this.f28695c);
            return this;
        }

        public b r2() {
            W1();
            w0.Q2((w0) this.f28695c);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public w s() {
            return ((w0) this.f28695c).s();
        }

        public b s2() {
            W1();
            ((w0) this.f28695c).E3();
            return this;
        }

        public b t2() {
            W1();
            w0.S2((w0) this.f28695c);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public w u1() {
            return ((w0) this.f28695c).u1();
        }

        public b u2() {
            W1();
            ((w0) this.f28695c).G3();
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b1
        public String v() {
            return ((w0) this.f28695c).v();
        }

        public b v2(int i4) {
            W1();
            ((w0) this.f28695c).a4(i4);
            return this;
        }

        public b w2(c cVar) {
            W1();
            ((w0) this.f28695c).b4(cVar);
            return this;
        }

        public b x2(int i4) {
            W1();
            w0.k3((w0) this.f28695c, i4);
            return this;
        }

        public b y2(String str) {
            W1();
            ((w0) this.f28695c).d4(str);
            return this;
        }

        public b z2(w wVar) {
            W1();
            ((w0) this.f28695c).e4(wVar);
            return this;
        }

        private b() {
            super(w0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Field.java */
    public enum c implements p1.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final p1.d<c> internalValueMap = new a();
        private final int value;

        /* compiled from: Field.java */
        static class a implements p1.d<c> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.p1.d
            public c a(int i4) {
                return c.forNumber(i4);
            }

            public c b(int i4) {
                return c.forNumber(i4);
            }
        }

        /* compiled from: Field.java */
        private static final class b implements p1.e {

            /* renamed from: a, reason: collision with root package name */
            static final p1.e f29020a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.p1.e
            public boolean a(int i4) {
                return c.forNumber(i4) != null;
            }
        }

        c(int i4) {
            this.value = i4;
        }

        public static c forNumber(int i4) {
            if (i4 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i4 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i4 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i4 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static p1.d<c> internalGetValueMap() {
            return internalValueMap;
        }

        public static p1.e internalGetVerifier() {
            return b.f29020a;
        }

        @Override // androidx.datastore.preferences.protobuf.p1.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static c valueOf(int i4) {
            return forNumber(i4);
        }
    }

    /* compiled from: Field.java */
    public enum d implements p1.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final p1.d<d> internalValueMap = new a();
        private final int value;

        /* compiled from: Field.java */
        static class a implements p1.d<d> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.p1.d
            public d a(int i4) {
                return d.forNumber(i4);
            }

            public d b(int i4) {
                return d.forNumber(i4);
            }
        }

        /* compiled from: Field.java */
        private static final class b implements p1.e {

            /* renamed from: a, reason: collision with root package name */
            static final p1.e f29021a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.p1.e
            public boolean a(int i4) {
                return d.forNumber(i4) != null;
            }
        }

        d(int i4) {
            this.value = i4;
        }

        public static d forNumber(int i4) {
            switch (i4) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static p1.d<d> internalGetValueMap() {
            return internalValueMap;
        }

        public static p1.e internalGetVerifier() {
            return b.f29021a;
        }

        @Override // androidx.datastore.preferences.protobuf.p1.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static d valueOf(int i4) {
            return forNumber(i4);
        }
    }

    static {
        w0 w0Var = new w0();
        DEFAULT_INSTANCE = w0Var;
        i1.G2(w0.class, w0Var);
    }

    private w0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    private void C3() {
        this.number_ = 0;
    }

    private void D3() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3() {
        this.options_ = g3.f();
    }

    private void F3() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3() {
        this.typeUrl_ = DEFAULT_INSTANCE.typeUrl_;
    }

    private void H3() {
        if (this.options_.S1()) {
            return;
        }
        this.options_ = i1.g2(this.options_);
    }

    public static w0 I3() {
        return DEFAULT_INSTANCE;
    }

    static void J2(w0 w0Var, int i4) {
        w0Var.kind_ = i4;
    }

    public static b L3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b M3(w0 w0Var) {
        return DEFAULT_INSTANCE.G1(w0Var);
    }

    public static w0 N3(InputStream inputStream) throws IOException {
        return (w0) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static w0 O3(InputStream inputStream, s0 s0Var) throws IOException {
        return (w0) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    static void P2(w0 w0Var, int i4) {
        w0Var.oneofIndex_ = i4;
    }

    public static w0 P3(w wVar) throws InvalidProtocolBufferException {
        return (w0) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    static void Q2(w0 w0Var) {
        w0Var.oneofIndex_ = 0;
    }

    public static w0 Q3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (w0) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    static void R2(w0 w0Var, boolean z4) {
        w0Var.packed_ = z4;
    }

    public static w0 R3(z zVar) throws IOException {
        return (w0) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    static void S2(w0 w0Var) {
        w0Var.packed_ = false;
    }

    public static w0 S3(z zVar, s0 s0Var) throws IOException {
        return (w0) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static w0 T3(InputStream inputStream) throws IOException {
        return (w0) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static w0 U3(InputStream inputStream, s0 s0Var) throws IOException {
        return (w0) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static w0 V3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (w0) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w0 W3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (w0) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static w0 X3(byte[] bArr) throws InvalidProtocolBufferException {
        return (w0) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static w0 Y3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (w0) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<w0> Z3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(int i4) {
        H3();
        this.options_.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(c cVar) {
        cVar.getClass();
        this.cardinality_ = cVar.getNumber();
    }

    private void c4(int i4) {
        this.cardinality_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.defaultValue_ = wVar.l0(p1.f28847a);
    }

    static void f3(w0 w0Var) {
        w0Var.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.jsonName_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(d dVar) {
        dVar.getClass();
        this.kind_ = dVar.getNumber();
    }

    private void i4(int i4) {
        this.kind_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(String str) {
        str.getClass();
        this.name_ = str;
    }

    static void k3(w0 w0Var, int i4) {
        w0Var.cardinality_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k4(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.name_ = wVar.l0(p1.f28847a);
    }

    private void l4(int i4) {
        this.number_ = i4;
    }

    static void m3(w0 w0Var) {
        w0Var.cardinality_ = 0;
    }

    private void m4(int i4) {
        this.oneofIndex_ = i4;
    }

    static void n3(w0 w0Var, int i4) {
        w0Var.number_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n4(int i4, a3.b bVar) {
        H3();
        this.options_.set(i4, bVar.a());
    }

    static void o3(w0 w0Var) {
        w0Var.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4(int i4, a3 a3Var) {
        a3Var.getClass();
        H3();
        this.options_.set(i4, a3Var);
    }

    private void p4(boolean z4) {
        this.packed_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(Iterable<? extends a3> iterable) {
        H3();
        a.AbstractC0471a.y1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q4(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(int i4, a3.b bVar) {
        H3();
        this.options_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r4(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.typeUrl_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i4, a3 a3Var) {
        a3Var.getClass();
        H3();
        this.options_.add(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(a3.b bVar) {
        H3();
        this.options_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(a3 a3Var) {
        a3Var.getClass();
        H3();
        this.options_.add(a3Var);
    }

    private void w3() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3() {
        this.defaultValue_ = DEFAULT_INSTANCE.defaultValue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        this.jsonName_ = DEFAULT_INSTANCE.jsonName_;
    }

    private void z3() {
        this.kind_ = 0;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public String A() {
        return this.defaultValue_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public c I() {
        c forNumber = c.forNumber(this.cardinality_);
        return forNumber == null ? c.UNRECOGNIZED : forNumber;
    }

    public b3 J3(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f29019a[iVar.ordinal()]) {
            case 1:
                return new w0();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", a3.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<w0> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (w0.class) {
                        try {
                            c3Var = PARSER;
                            if (c3Var == null) {
                                c3Var = new i1.c<>(DEFAULT_INSTANCE);
                                PARSER = c3Var;
                            }
                        } finally {
                        }
                    }
                }
                return c3Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public List<? extends b3> K3() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public boolean M() {
        return this.packed_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public w N() {
        return w.A(this.defaultValue_);
    }

    @Override // androidx.content.preferences.protobuf.b1
    public int Y() {
        return this.oneofIndex_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public d b() {
        d forNumber = d.forNumber(this.kind_);
        return forNumber == null ? d.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public w c() {
        return w.A(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.b1
    public List<a3> d() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.b1
    public a3 f(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.b1
    public int g0() {
        return this.cardinality_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public int getNumber() {
        return this.number_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public String j1() {
        return this.jsonName_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public int k1() {
        return this.kind_;
    }

    @Override // androidx.content.preferences.protobuf.b1
    public w s() {
        return w.A(this.typeUrl_);
    }

    @Override // androidx.content.preferences.protobuf.b1
    public w u1() {
        return w.A(this.jsonName_);
    }

    @Override // androidx.content.preferences.protobuf.b1
    public String v() {
        return this.typeUrl_;
    }
}

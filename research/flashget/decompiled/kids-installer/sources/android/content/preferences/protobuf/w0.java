package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.x2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Field.java */
/* loaded from: classes4.dex */
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
    private static volatile z2<w0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private o1.k<x2> options_ = d3.g();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* compiled from: Field.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7573a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7573a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7573a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7573a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7573a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7573a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7573a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7573a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Field.java */
    public static final class b extends i1.b<w0, b> implements b1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(String str) {
            a2();
            ((w0) this.f7240p).c4(str);
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public w B1() {
            return ((w0) this.f7240p).B1();
        }

        public b B2(w wVar) {
            a2();
            ((w0) this.f7240p).d4(wVar);
            return this;
        }

        public b C2(String str) {
            a2();
            ((w0) this.f7240p).e4(str);
            return this;
        }

        public b D2(w wVar) {
            a2();
            ((w0) this.f7240p).f4(wVar);
            return this;
        }

        public b E2(d dVar) {
            a2();
            ((w0) this.f7240p).g4(dVar);
            return this;
        }

        public b F2(int i5) {
            a2();
            w0.K2((w0) this.f7240p, i5);
            return this;
        }

        public b G2(String str) {
            a2();
            ((w0) this.f7240p).i4(str);
            return this;
        }

        public b H2(w wVar) {
            a2();
            ((w0) this.f7240p).j4(wVar);
            return this;
        }

        public b I2(int i5) {
            a2();
            w0.o3((w0) this.f7240p, i5);
            return this;
        }

        public b J2(int i5) {
            a2();
            w0.Q2((w0) this.f7240p, i5);
            return this;
        }

        public b K2(int i5, x2.b bVar) {
            a2();
            ((w0) this.f7240p).m4(i5, bVar);
            return this;
        }

        public b L2(int i5, x2 x2Var) {
            a2();
            ((w0) this.f7240p).n4(i5, x2Var);
            return this;
        }

        public b M2(boolean z5) {
            a2();
            w0.S2((w0) this.f7240p, z5);
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public c N() {
            return ((w0) this.f7240p).N();
        }

        public b N2(String str) {
            a2();
            ((w0) this.f7240p).p4(str);
            return this;
        }

        public b O2(w wVar) {
            a2();
            ((w0) this.f7240p).q4(wVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public int Q0() {
            return ((w0) this.f7240p).Q0();
        }

        @Override // android.content.preferences.protobuf.b1
        public w a() {
            return ((w0) this.f7240p).a();
        }

        @Override // android.content.preferences.protobuf.b1
        public int b() {
            return ((w0) this.f7240p).b();
        }

        @Override // android.content.preferences.protobuf.b1
        public boolean b0() {
            return ((w0) this.f7240p).b0();
        }

        @Override // android.content.preferences.protobuf.b1
        public List<x2> c() {
            return Collections.unmodifiableList(((w0) this.f7240p).c());
        }

        @Override // android.content.preferences.protobuf.b1
        public x2 d(int i5) {
            return ((w0) this.f7240p).d(i5);
        }

        @Override // android.content.preferences.protobuf.b1
        public w d0() {
            return ((w0) this.f7240p).d0();
        }

        @Override // android.content.preferences.protobuf.b1
        public String f1() {
            return ((w0) this.f7240p).f1();
        }

        @Override // android.content.preferences.protobuf.b1
        public String getName() {
            return ((w0) this.f7240p).getName();
        }

        @Override // android.content.preferences.protobuf.b1
        public int getNumber() {
            return ((w0) this.f7240p).getNumber();
        }

        public b i2(Iterable<? extends x2> iterable) {
            a2();
            ((w0) this.f7240p).r3(iterable);
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public d j() {
            return ((w0) this.f7240p).j();
        }

        public b j2(int i5, x2.b bVar) {
            a2();
            ((w0) this.f7240p).s3(i5, bVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public int k1() {
            return ((w0) this.f7240p).k1();
        }

        public b k2(int i5, x2 x2Var) {
            a2();
            ((w0) this.f7240p).t3(i5, x2Var);
            return this;
        }

        public b l2(x2.b bVar) {
            a2();
            ((w0) this.f7240p).u3(bVar);
            return this;
        }

        public b m2(x2 x2Var) {
            a2();
            ((w0) this.f7240p).v3(x2Var);
            return this;
        }

        public b n2() {
            a2();
            w0.n3((w0) this.f7240p);
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public String o() {
            return ((w0) this.f7240p).o();
        }

        public b o2() {
            a2();
            ((w0) this.f7240p).x3();
            return this;
        }

        public b p2() {
            a2();
            ((w0) this.f7240p).y3();
            return this;
        }

        public b q2() {
            a2();
            w0.g3((w0) this.f7240p);
            return this;
        }

        public b r2() {
            a2();
            ((w0) this.f7240p).A3();
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public w s() {
            return ((w0) this.f7240p).s();
        }

        public b s2() {
            a2();
            w0.p3((w0) this.f7240p);
            return this;
        }

        public b t2() {
            a2();
            w0.R2((w0) this.f7240p);
            return this;
        }

        public b u2() {
            a2();
            ((w0) this.f7240p).D3();
            return this;
        }

        public b v2() {
            a2();
            w0.T2((w0) this.f7240p);
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public String w() {
            return ((w0) this.f7240p).w();
        }

        public b w2() {
            a2();
            ((w0) this.f7240p).F3();
            return this;
        }

        public b x2(int i5) {
            a2();
            ((w0) this.f7240p).Z3(i5);
            return this;
        }

        public b y2(c cVar) {
            a2();
            ((w0) this.f7240p).a4(cVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.b1
        public int z0() {
            return ((w0) this.f7240p).z0();
        }

        public b z2(int i5) {
            a2();
            w0.l3((w0) this.f7240p, i5);
            return this;
        }

        private b() {
            super(w0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Field.java */
    /* loaded from: classes3.dex */
    public enum c implements o1.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final o1.d<c> internalValueMap = new a();
        private final int value;

        /* compiled from: Field.java */
        static class a implements o1.d<c> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.o1.d
            public c a(int i5) {
                return c.forNumber(i5);
            }

            public c b(int i5) {
                return c.forNumber(i5);
            }
        }

        /* compiled from: Field.java */
        private static final class b implements o1.e {

            /* renamed from: a, reason: collision with root package name */
            static final o1.e f7574a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.o1.e
            public boolean a(int i5) {
                return c.forNumber(i5) != null;
            }
        }

        c(int i5) {
            this.value = i5;
        }

        public static c forNumber(int i5) {
            if (i5 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i5 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i5 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i5 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static o1.d<c> internalGetValueMap() {
            return internalValueMap;
        }

        public static o1.e internalGetVerifier() {
            return b.f7574a;
        }

        @Override // androidx.datastore.preferences.protobuf.o1.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static c valueOf(int i5) {
            return forNumber(i5);
        }
    }

    /* compiled from: Field.java */
    /* loaded from: classes3.dex */
    public enum d implements o1.c {
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
        private static final o1.d<d> internalValueMap = new a();
        private final int value;

        /* compiled from: Field.java */
        static class a implements o1.d<d> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.o1.d
            public d a(int i5) {
                return d.forNumber(i5);
            }

            public d b(int i5) {
                return d.forNumber(i5);
            }
        }

        /* compiled from: Field.java */
        private static final class b implements o1.e {

            /* renamed from: a, reason: collision with root package name */
            static final o1.e f7575a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.o1.e
            public boolean a(int i5) {
                return d.forNumber(i5) != null;
            }
        }

        d(int i5) {
            this.value = i5;
        }

        public static d forNumber(int i5) {
            switch (i5) {
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

        public static o1.d<d> internalGetValueMap() {
            return internalValueMap;
        }

        public static o1.e internalGetVerifier() {
            return b.f7575a;
        }

        @Override // androidx.datastore.preferences.protobuf.o1.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static d valueOf(int i5) {
            return forNumber(i5);
        }
    }

    static {
        w0 w0Var = new w0();
        DEFAULT_INSTANCE = w0Var;
        i1.H2(w0.class, w0Var);
    }

    private w0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    private void B3() {
        this.number_ = 0;
    }

    private void C3() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3() {
        this.options_ = d3.g();
    }

    private void E3() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3() {
        this.typeUrl_ = DEFAULT_INSTANCE.typeUrl_;
    }

    private void G3() {
        if (this.options_.m1()) {
            return;
        }
        this.options_ = i1.j2(this.options_);
    }

    public static w0 H3() {
        return DEFAULT_INSTANCE;
    }

    static void K2(w0 w0Var, int i5) {
        w0Var.kind_ = i5;
    }

    public static b K3() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b L3(w0 w0Var) {
        return DEFAULT_INSTANCE.K1(w0Var);
    }

    public static w0 M3(InputStream inputStream) throws IOException {
        return (w0) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static w0 N3(InputStream inputStream, s0 s0Var) throws IOException {
        return (w0) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static w0 O3(w wVar) throws InvalidProtocolBufferException {
        return (w0) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static w0 P3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (w0) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    static void Q2(w0 w0Var, int i5) {
        w0Var.oneofIndex_ = i5;
    }

    public static w0 Q3(z zVar) throws IOException {
        return (w0) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    static void R2(w0 w0Var) {
        w0Var.oneofIndex_ = 0;
    }

    public static w0 R3(z zVar, s0 s0Var) throws IOException {
        return (w0) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    static void S2(w0 w0Var, boolean z5) {
        w0Var.packed_ = z5;
    }

    public static w0 S3(InputStream inputStream) throws IOException {
        return (w0) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    static void T2(w0 w0Var) {
        w0Var.packed_ = false;
    }

    public static w0 T3(InputStream inputStream, s0 s0Var) throws IOException {
        return (w0) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static w0 U3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (w0) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w0 V3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (w0) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static w0 W3(byte[] bArr) throws InvalidProtocolBufferException {
        return (w0) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static w0 X3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (w0) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<w0> Y3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(int i5) {
        G3();
        this.options_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(c cVar) {
        cVar.getClass();
        this.cardinality_ = cVar.getNumber();
    }

    private void b4(int i5) {
        this.cardinality_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.defaultValue_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.jsonName_ = wVar.p0();
    }

    static void g3(w0 w0Var) {
        w0Var.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(d dVar) {
        dVar.getClass();
        this.kind_ = dVar.getNumber();
    }

    private void h4(int i5) {
        this.kind_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.name_ = wVar.p0();
    }

    private void k4(int i5) {
        this.number_ = i5;
    }

    static void l3(w0 w0Var, int i5) {
        w0Var.cardinality_ = i5;
    }

    private void l4(int i5) {
        this.oneofIndex_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(int i5, x2.b bVar) {
        G3();
        this.options_.set(i5, bVar.build());
    }

    static void n3(w0 w0Var) {
        w0Var.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n4(int i5, x2 x2Var) {
        x2Var.getClass();
        G3();
        this.options_.set(i5, x2Var);
    }

    static void o3(w0 w0Var, int i5) {
        w0Var.number_ = i5;
    }

    private void o4(boolean z5) {
        this.packed_ = z5;
    }

    static void p3(w0 w0Var) {
        w0Var.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q4(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.typeUrl_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(Iterable<? extends x2> iterable) {
        G3();
        a.AbstractC0082a.F1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i5, x2.b bVar) {
        G3();
        this.options_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(int i5, x2 x2Var) {
        x2Var.getClass();
        G3();
        this.options_.add(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(x2.b bVar) {
        G3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(x2 x2Var) {
        x2Var.getClass();
        G3();
        this.options_.add(x2Var);
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

    @Override // android.content.preferences.protobuf.b1
    public w B1() {
        return w.z(this.jsonName_);
    }

    public y2 I3(int i5) {
        return this.options_.get(i5);
    }

    public List<? extends y2> J3() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.b1
    public c N() {
        c forNumber = c.forNumber(this.cardinality_);
        return forNumber == null ? c.UNRECOGNIZED : forNumber;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7573a[iVar.ordinal()]) {
            case 1:
                return new w0();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", x2.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<w0> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (w0.class) {
                        z2Var = PARSER;
                        if (z2Var == null) {
                            z2Var = new i1.c<>(DEFAULT_INSTANCE);
                            PARSER = z2Var;
                        }
                    }
                }
                return z2Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // android.content.preferences.protobuf.b1
    public int Q0() {
        return this.cardinality_;
    }

    @Override // android.content.preferences.protobuf.b1
    public w a() {
        return w.z(this.name_);
    }

    @Override // android.content.preferences.protobuf.b1
    public int b() {
        return this.options_.size();
    }

    @Override // android.content.preferences.protobuf.b1
    public boolean b0() {
        return this.packed_;
    }

    @Override // android.content.preferences.protobuf.b1
    public List<x2> c() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.b1
    public x2 d(int i5) {
        return this.options_.get(i5);
    }

    @Override // android.content.preferences.protobuf.b1
    public w d0() {
        return w.z(this.defaultValue_);
    }

    @Override // android.content.preferences.protobuf.b1
    public String f1() {
        return this.jsonName_;
    }

    @Override // android.content.preferences.protobuf.b1
    public String getName() {
        return this.name_;
    }

    @Override // android.content.preferences.protobuf.b1
    public int getNumber() {
        return this.number_;
    }

    @Override // android.content.preferences.protobuf.b1
    public d j() {
        d forNumber = d.forNumber(this.kind_);
        return forNumber == null ? d.UNRECOGNIZED : forNumber;
    }

    @Override // android.content.preferences.protobuf.b1
    public int k1() {
        return this.kind_;
    }

    @Override // android.content.preferences.protobuf.b1
    public String o() {
        return this.defaultValue_;
    }

    @Override // android.content.preferences.protobuf.b1
    public w s() {
        return w.z(this.typeUrl_);
    }

    @Override // android.content.preferences.protobuf.b1
    public String w() {
        return this.typeUrl_;
    }

    @Override // android.content.preferences.protobuf.b1
    public int z0() {
        return this.oneofIndex_;
    }
}

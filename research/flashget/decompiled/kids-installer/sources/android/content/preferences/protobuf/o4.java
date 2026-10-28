package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.s3;
import android.content.preferences.protobuf.w1;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Value.java */
/* loaded from: classes4.dex */
public final class o4 extends i1<o4, b> implements p4 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final o4 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile z2<o4> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* compiled from: Value.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7458a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7458a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7458a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7458a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7458a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7458a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7458a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7458a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Value.java */
    public static final class b extends i1.b<o4, b> implements p4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(s3 s3Var) {
            a2();
            ((o4) this.f7240p).L3(s3Var);
            return this;
        }

        @Override // android.content.preferences.protobuf.p4
        public String H0() {
            return ((o4) this.f7240p).H0();
        }

        @Override // android.content.preferences.protobuf.p4
        public int K0() {
            return ((o4) this.f7240p).K0();
        }

        @Override // android.content.preferences.protobuf.p4
        public v2 L0() {
            return ((o4) this.f7240p).L0();
        }

        @Override // android.content.preferences.protobuf.p4
        public boolean h1() {
            return ((o4) this.f7240p).h1();
        }

        public b i2() {
            a2();
            ((o4) this.f7240p).d3();
            return this;
        }

        @Override // android.content.preferences.protobuf.p4
        public w1 j1() {
            return ((o4) this.f7240p).j1();
        }

        public b j2() {
            a2();
            ((o4) this.f7240p).e3();
            return this;
        }

        public b k2() {
            a2();
            ((o4) this.f7240p).f3();
            return this;
        }

        @Override // android.content.preferences.protobuf.p4
        public boolean l1() {
            return ((o4) this.f7240p).l1();
        }

        public b l2() {
            a2();
            ((o4) this.f7240p).g3();
            return this;
        }

        public b m2() {
            a2();
            ((o4) this.f7240p).h3();
            return this;
        }

        public b n2() {
            a2();
            ((o4) this.f7240p).i3();
            return this;
        }

        @Override // android.content.preferences.protobuf.p4
        public boolean o0() {
            return ((o4) this.f7240p).o0();
        }

        @Override // android.content.preferences.protobuf.p4
        public w o1() {
            return ((o4) this.f7240p).o1();
        }

        public b o2() {
            a2();
            ((o4) this.f7240p).j3();
            return this;
        }

        public b p2(w1 w1Var) {
            a2();
            ((o4) this.f7240p).l3(w1Var);
            return this;
        }

        public b q2(s3 s3Var) {
            a2();
            ((o4) this.f7240p).m3(s3Var);
            return this;
        }

        public b r2(boolean z5) {
            a2();
            ((o4) this.f7240p).C3(z5);
            return this;
        }

        public b s2(w1.b bVar) {
            a2();
            ((o4) this.f7240p).D3(bVar);
            return this;
        }

        public b t2(w1 w1Var) {
            a2();
            ((o4) this.f7240p).E3(w1Var);
            return this;
        }

        public b u2(v2 v2Var) {
            a2();
            ((o4) this.f7240p).F3(v2Var);
            return this;
        }

        public b v2(int i5) {
            a2();
            ((o4) this.f7240p).G3(i5);
            return this;
        }

        @Override // android.content.preferences.protobuf.p4
        public double w0() {
            return ((o4) this.f7240p).w0();
        }

        public b w2(double d6) {
            a2();
            ((o4) this.f7240p).H3(d6);
            return this;
        }

        @Override // android.content.preferences.protobuf.p4
        public s3 x1() {
            return ((o4) this.f7240p).x1();
        }

        public b x2(String str) {
            a2();
            ((o4) this.f7240p).I3(str);
            return this;
        }

        @Override // android.content.preferences.protobuf.p4
        public c y1() {
            return ((o4) this.f7240p).y1();
        }

        public b y2(w wVar) {
            a2();
            ((o4) this.f7240p).J3(wVar);
            return this;
        }

        public b z2(s3.b bVar) {
            a2();
            ((o4) this.f7240p).K3(bVar);
            return this;
        }

        private b() {
            super(o4.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Value.java */
    /* loaded from: classes.dex */
    public enum c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        c(int i5) {
            this.value = i5;
        }

        public static c forNumber(int i5) {
            switch (i5) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static c valueOf(int i5) {
            return forNumber(i5);
        }
    }

    static {
        o4 o4Var = new o4();
        DEFAULT_INSTANCE = o4Var;
        i1.H2(o4.class, o4Var);
    }

    private o4() {
    }

    public static o4 A3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (o4) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<o4> B3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(boolean z5) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(w1.b bVar) {
        this.kind_ = bVar.build();
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(w1 w1Var) {
        w1Var.getClass();
        this.kind_ = w1Var;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(v2 v2Var) {
        v2Var.getClass();
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(v2Var.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(int i5) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(double d6) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.kindCase_ = 3;
        this.kind_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(s3.b bVar) {
        this.kind_ = bVar.build();
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(s3 s3Var) {
        s3Var.getClass();
        this.kind_ = s3Var;
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static o4 k3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(w1 w1Var) {
        w1Var.getClass();
        if (this.kindCase_ != 6 || this.kind_ == w1.a3()) {
            this.kind_ = w1Var;
        } else {
            this.kind_ = w1.e3((w1) this.kind_).e2(w1Var).N0();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(s3 s3Var) {
        s3Var.getClass();
        if (this.kindCase_ != 5 || this.kind_ == s3.L2()) {
            this.kind_ = s3Var;
        } else {
            this.kind_ = s3.Q2((s3) this.kind_).e2(s3Var).N0();
        }
        this.kindCase_ = 5;
    }

    public static b n3() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b o3(o4 o4Var) {
        return DEFAULT_INSTANCE.K1(o4Var);
    }

    public static o4 p3(InputStream inputStream) throws IOException {
        return (o4) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static o4 q3(InputStream inputStream, s0 s0Var) throws IOException {
        return (o4) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static o4 r3(w wVar) throws InvalidProtocolBufferException {
        return (o4) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static o4 s3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (o4) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static o4 t3(z zVar) throws IOException {
        return (o4) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static o4 u3(z zVar, s0 s0Var) throws IOException {
        return (o4) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static o4 v3(InputStream inputStream) throws IOException {
        return (o4) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static o4 w3(InputStream inputStream, s0 s0Var) throws IOException {
        return (o4) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static o4 x3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (o4) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o4 y3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (o4) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static o4 z3(byte[] bArr) throws InvalidProtocolBufferException {
        return (o4) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    @Override // android.content.preferences.protobuf.p4
    public String H0() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // android.content.preferences.protobuf.p4
    public int K0() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // android.content.preferences.protobuf.p4
    public v2 L0() {
        if (this.kindCase_ != 1) {
            return v2.NULL_VALUE;
        }
        v2 forNumber = v2.forNumber(((Integer) this.kind_).intValue());
        return forNumber == null ? v2.UNRECOGNIZED : forNumber;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7458a[iVar.ordinal()]) {
            case 1:
                return new o4();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", s3.class, w1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<o4> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (o4.class) {
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

    @Override // android.content.preferences.protobuf.p4
    public boolean h1() {
        return this.kindCase_ == 5;
    }

    @Override // android.content.preferences.protobuf.p4
    public w1 j1() {
        return this.kindCase_ == 6 ? (w1) this.kind_ : w1.a3();
    }

    @Override // android.content.preferences.protobuf.p4
    public boolean l1() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // android.content.preferences.protobuf.p4
    public boolean o0() {
        return this.kindCase_ == 6;
    }

    @Override // android.content.preferences.protobuf.p4
    public w o1() {
        return w.z(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // android.content.preferences.protobuf.p4
    public double w0() {
        return this.kindCase_ == 2 ? ((Double) this.kind_).doubleValue() : p.f18289o;
    }

    @Override // android.content.preferences.protobuf.p4
    public s3 x1() {
        return this.kindCase_ == 5 ? (s3) this.kind_ : s3.L2();
    }

    @Override // android.content.preferences.protobuf.p4
    public c y1() {
        return c.forNumber(this.kindCase_);
    }
}

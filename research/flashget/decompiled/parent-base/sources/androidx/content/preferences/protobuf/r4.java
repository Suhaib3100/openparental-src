package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.v3;
import androidx.content.preferences.protobuf.x1;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Value.java */
/* loaded from: classes3.dex */
public final class r4 extends i1<r4, b> implements s4 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final r4 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile c3<r4> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* compiled from: Value.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28934a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28934a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28934a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28934a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28934a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28934a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28934a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28934a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Value.java */
    public static final class b extends i1.b<r4, b> implements s4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.s4
        public boolean R0() {
            return ((r4) this.f28695c).R0();
        }

        @Override // androidx.content.preferences.protobuf.s4
        public double V0() {
            return ((r4) this.f28695c).V0();
        }

        @Override // androidx.content.preferences.protobuf.s4
        public String Y0() {
            return ((r4) this.f28695c).Y0();
        }

        @Override // androidx.content.preferences.protobuf.s4
        public int a1() {
            return ((r4) this.f28695c).a1();
        }

        @Override // androidx.content.preferences.protobuf.s4
        public y2 b1() {
            return ((r4) this.f28695c).b1();
        }

        public b e2() {
            W1();
            ((r4) this.f28695c).c3();
            return this;
        }

        public b f2() {
            W1();
            ((r4) this.f28695c).d3();
            return this;
        }

        public b g2() {
            W1();
            ((r4) this.f28695c).e3();
            return this;
        }

        public b h2() {
            W1();
            ((r4) this.f28695c).f3();
            return this;
        }

        public b i2() {
            W1();
            ((r4) this.f28695c).g3();
            return this;
        }

        public b j2() {
            W1();
            ((r4) this.f28695c).h3();
            return this;
        }

        public b k2() {
            W1();
            ((r4) this.f28695c).i3();
            return this;
        }

        public b l2(x1 x1Var) {
            W1();
            ((r4) this.f28695c).k3(x1Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.s4
        public boolean m1() {
            return ((r4) this.f28695c).m1();
        }

        public b m2(v3 v3Var) {
            W1();
            ((r4) this.f28695c).l3(v3Var);
            return this;
        }

        public b o2(boolean z4) {
            W1();
            ((r4) this.f28695c).D3(z4);
            return this;
        }

        public b p2(x1.b bVar) {
            W1();
            ((r4) this.f28695c).E3(bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.s4
        public boolean q0() {
            return ((r4) this.f28695c).q0();
        }

        public b r2(x1 x1Var) {
            W1();
            ((r4) this.f28695c).F3(x1Var);
            return this;
        }

        public b s2(y2 y2Var) {
            W1();
            ((r4) this.f28695c).G3(y2Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.s4
        public x1 t0() {
            return ((r4) this.f28695c).t0();
        }

        public b t2(int i4) {
            W1();
            ((r4) this.f28695c).H3(i4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.s4
        public w u0() {
            return ((r4) this.f28695c).u0();
        }

        public b u2(double d5) {
            W1();
            ((r4) this.f28695c).I3(d5);
            return this;
        }

        public b v2(String str) {
            W1();
            ((r4) this.f28695c).J3(str);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.s4
        public v3 w0() {
            return ((r4) this.f28695c).w0();
        }

        public b w2(w wVar) {
            W1();
            ((r4) this.f28695c).K3(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.s4
        public c x0() {
            return ((r4) this.f28695c).x0();
        }

        public b x2(v3.b bVar) {
            W1();
            ((r4) this.f28695c).L3(bVar);
            return this;
        }

        public b y2(v3 v3Var) {
            W1();
            ((r4) this.f28695c).M3(v3Var);
            return this;
        }

        private b() {
            super(r4.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Value.java */
    public enum c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        c(int i4) {
            this.value = i4;
        }

        public static c forNumber(int i4) {
            switch (i4) {
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
        public static c valueOf(int i4) {
            return forNumber(i4);
        }
    }

    static {
        r4 r4Var = new r4();
        DEFAULT_INSTANCE = r4Var;
        i1.G2(r4.class, r4Var);
    }

    private r4() {
    }

    public static r4 B3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (r4) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<r4> C3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(boolean z4) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(x1.b bVar) {
        this.kind_ = bVar.a();
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(x1 x1Var) {
        x1Var.getClass();
        this.kind_ = x1Var;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(y2 y2Var) {
        y2Var.getClass();
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(y2Var.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(int i4) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(double d5) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.kindCase_ = 3;
        this.kind_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(v3.b bVar) {
        this.kind_ = bVar.a();
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(v3 v3Var) {
        v3Var.getClass();
        this.kind_ = v3Var;
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static r4 j3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(x1 x1Var) {
        x1Var.getClass();
        if (this.kindCase_ != 6 || this.kind_ == x1.Z2()) {
            this.kind_ = x1Var;
        } else {
            this.kind_ = x1.d3((x1) this.kind_).a2(x1Var).l1();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(v3 v3Var) {
        v3Var.getClass();
        if (this.kindCase_ != 5 || this.kind_ == v3.K2()) {
            this.kind_ = v3Var;
        } else {
            this.kind_ = v3.P2((v3) this.kind_).a2(v3Var).l1();
        }
        this.kindCase_ = 5;
    }

    public static b m3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b n3(r4 r4Var) {
        return DEFAULT_INSTANCE.G1(r4Var);
    }

    public static r4 o3(InputStream inputStream) throws IOException {
        return (r4) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static r4 p3(InputStream inputStream, s0 s0Var) throws IOException {
        return (r4) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static r4 q3(w wVar) throws InvalidProtocolBufferException {
        return (r4) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static r4 r3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (r4) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static r4 s3(z zVar) throws IOException {
        return (r4) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static r4 t3(z zVar, s0 s0Var) throws IOException {
        return (r4) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static r4 u3(InputStream inputStream) throws IOException {
        return (r4) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static r4 w3(InputStream inputStream, s0 s0Var) throws IOException {
        return (r4) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static r4 x3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (r4) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r4 y3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (r4) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static r4 z3(byte[] bArr) throws InvalidProtocolBufferException {
        return (r4) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28934a[iVar.ordinal()]) {
            case 1:
                return new r4();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", v3.class, x1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<r4> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (r4.class) {
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

    @Override // androidx.content.preferences.protobuf.s4
    public boolean R0() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.content.preferences.protobuf.s4
    public double V0() {
        return this.kindCase_ == 2 ? ((Double) this.kind_).doubleValue() : p.f60679p;
    }

    @Override // androidx.content.preferences.protobuf.s4
    public String Y0() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // androidx.content.preferences.protobuf.s4
    public int a1() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.content.preferences.protobuf.s4
    public y2 b1() {
        if (this.kindCase_ != 1) {
            return y2.NULL_VALUE;
        }
        y2 forNumber = y2.forNumber(((Integer) this.kind_).intValue());
        return forNumber == null ? y2.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.s4
    public boolean m1() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // androidx.content.preferences.protobuf.s4
    public boolean q0() {
        return this.kindCase_ == 5;
    }

    @Override // androidx.content.preferences.protobuf.s4
    public x1 t0() {
        return this.kindCase_ == 6 ? (x1) this.kind_ : x1.Z2();
    }

    @Override // androidx.content.preferences.protobuf.s4
    public w u0() {
        return w.A(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // androidx.content.preferences.protobuf.s4
    public v3 w0() {
        return this.kindCase_ == 5 ? (v3) this.kind_ : v3.K2();
    }

    @Override // androidx.content.preferences.protobuf.s4
    public c x0() {
        return c.forNumber(this.kindCase_);
    }
}

package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: DoubleValue.java */
/* loaded from: classes3.dex */
public final class d0 extends i1<d0, b> implements e0 {
    private static final d0 DEFAULT_INSTANCE;
    private static volatile c3<d0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* compiled from: DoubleValue.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28668a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28668a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28668a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28668a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28668a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28668a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28668a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28668a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: DoubleValue.java */
    public static final class b extends i1.b<d0, b> implements e0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            d0.K2((d0) this.f28695c);
            return this;
        }

        public b f2(double d5) {
            W1();
            d0.J2((d0) this.f28695c, d5);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.e0
        public double getValue() {
            return ((d0) this.f28695c).getValue();
        }

        private b() {
            super(d0.DEFAULT_INSTANCE);
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        i1.G2(d0.class, d0Var);
    }

    private d0() {
    }

    static void J2(d0 d0Var, double d5) {
        d0Var.value_ = d5;
    }

    static void K2(d0 d0Var) {
        d0Var.value_ = p.f60679p;
    }

    private void L2() {
        this.value_ = p.f60679p;
    }

    public static d0 M2() {
        return DEFAULT_INSTANCE;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(d0 d0Var) {
        return DEFAULT_INSTANCE.G1(d0Var);
    }

    public static d0 P2(double d5) {
        return N2().f2(d5).a();
    }

    public static d0 Q2(InputStream inputStream) throws IOException {
        return (d0) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static d0 R2(InputStream inputStream, s0 s0Var) throws IOException {
        return (d0) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static d0 S2(w wVar) throws InvalidProtocolBufferException {
        return (d0) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static d0 T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (d0) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static d0 U2(z zVar) throws IOException {
        return (d0) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static d0 V2(z zVar, s0 s0Var) throws IOException {
        return (d0) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static d0 W2(InputStream inputStream) throws IOException {
        return (d0) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static d0 X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (d0) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static d0 Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (d0) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d0 Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (d0) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static d0 a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (d0) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static d0 b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (d0) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<d0> c3() {
        return DEFAULT_INSTANCE.B();
    }

    private void d3(double d5) {
        this.value_ = d5;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28668a[iVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<d0> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (d0.class) {
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

    @Override // androidx.content.preferences.protobuf.e0
    public double getValue() {
        return this.value_;
    }
}

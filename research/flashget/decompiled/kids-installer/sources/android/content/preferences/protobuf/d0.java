package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: DoubleValue.java */
/* loaded from: classes4.dex */
public final class d0 extends i1<d0, b> implements e0 {
    private static final d0 DEFAULT_INSTANCE;
    private static volatile z2<d0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* compiled from: DoubleValue.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7211a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7211a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7211a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7211a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7211a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7211a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7211a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7211a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: DoubleValue.java */
    public static final class b extends i1.b<d0, b> implements e0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.e0
        public double getValue() {
            return ((d0) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            d0.L2((d0) this.f7240p);
            return this;
        }

        public b j2(double d6) {
            a2();
            d0.K2((d0) this.f7240p, d6);
            return this;
        }

        private b() {
            super(d0.DEFAULT_INSTANCE);
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        i1.H2(d0.class, d0Var);
    }

    private d0() {
    }

    static void K2(d0 d0Var, double d6) {
        d0Var.value_ = d6;
    }

    static void L2(d0 d0Var) {
        d0Var.value_ = p.f18289o;
    }

    private void M2() {
        this.value_ = p.f18289o;
    }

    public static d0 N2() {
        return DEFAULT_INSTANCE;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b P2(d0 d0Var) {
        return DEFAULT_INSTANCE.K1(d0Var);
    }

    public static d0 Q2(double d6) {
        return O2().j2(d6).build();
    }

    public static d0 R2(InputStream inputStream) throws IOException {
        return (d0) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static d0 S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (d0) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static d0 T2(w wVar) throws InvalidProtocolBufferException {
        return (d0) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static d0 U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (d0) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static d0 V2(z zVar) throws IOException {
        return (d0) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static d0 W2(z zVar, s0 s0Var) throws IOException {
        return (d0) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static d0 X2(InputStream inputStream) throws IOException {
        return (d0) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static d0 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (d0) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static d0 Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (d0) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d0 a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (d0) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static d0 b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (d0) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static d0 c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (d0) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<d0> d3() {
        return DEFAULT_INSTANCE.z();
    }

    private void e3(double d6) {
        this.value_ = d6;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7211a[iVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<d0> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (d0.class) {
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

    @Override // android.content.preferences.protobuf.e0
    public double getValue() {
        return this.value_;
    }
}

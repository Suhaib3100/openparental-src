package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: FloatValue.java */
/* loaded from: classes4.dex */
public final class f1 extends i1<f1, b> implements g1 {
    private static final f1 DEFAULT_INSTANCE;
    private static volatile z2<f1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    /* compiled from: FloatValue.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7227a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7227a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7227a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7227a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7227a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7227a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7227a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7227a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: FloatValue.java */
    public static final class b extends i1.b<f1, b> implements g1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.g1
        public float getValue() {
            return ((f1) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            f1.L2((f1) this.f7240p);
            return this;
        }

        public b j2(float f6) {
            a2();
            f1.K2((f1) this.f7240p, f6);
            return this;
        }

        private b() {
            super(f1.DEFAULT_INSTANCE);
        }
    }

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        i1.H2(f1.class, f1Var);
    }

    private f1() {
    }

    static void K2(f1 f1Var, float f6) {
        f1Var.value_ = f6;
    }

    static void L2(f1 f1Var) {
        f1Var.value_ = 0.0f;
    }

    private void M2() {
        this.value_ = 0.0f;
    }

    public static f1 N2() {
        return DEFAULT_INSTANCE;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b P2(f1 f1Var) {
        return DEFAULT_INSTANCE.K1(f1Var);
    }

    public static f1 Q2(float f6) {
        return O2().j2(f6).build();
    }

    public static f1 R2(InputStream inputStream) throws IOException {
        return (f1) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static f1 S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (f1) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f1 T2(w wVar) throws InvalidProtocolBufferException {
        return (f1) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static f1 U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (f1) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static f1 V2(z zVar) throws IOException {
        return (f1) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static f1 W2(z zVar, s0 s0Var) throws IOException {
        return (f1) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static f1 X2(InputStream inputStream) throws IOException {
        return (f1) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static f1 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (f1) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f1 Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f1) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f1 a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (f1) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static f1 b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f1) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static f1 c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (f1) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<f1> d3() {
        return DEFAULT_INSTANCE.z();
    }

    private void e3(float f6) {
        this.value_ = f6;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7227a[iVar.ordinal()]) {
            case 1:
                return new f1();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<f1> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (f1.class) {
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

    @Override // android.content.preferences.protobuf.g1
    public float getValue() {
        return this.value_;
    }
}

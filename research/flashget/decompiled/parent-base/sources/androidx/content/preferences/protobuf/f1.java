package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: FloatValue.java */
/* loaded from: classes3.dex */
public final class f1 extends i1<f1, b> implements g1 {
    private static final f1 DEFAULT_INSTANCE;
    private static volatile c3<f1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    /* compiled from: FloatValue.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28680a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28680a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28680a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28680a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28680a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28680a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28680a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28680a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: FloatValue.java */
    public static final class b extends i1.b<f1, b> implements g1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            f1.K2((f1) this.f28695c);
            return this;
        }

        public b f2(float f4) {
            W1();
            f1.J2((f1) this.f28695c, f4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.g1
        public float getValue() {
            return ((f1) this.f28695c).getValue();
        }

        private b() {
            super(f1.DEFAULT_INSTANCE);
        }
    }

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        i1.G2(f1.class, f1Var);
    }

    private f1() {
    }

    static void J2(f1 f1Var, float f4) {
        f1Var.value_ = f4;
    }

    static void K2(f1 f1Var) {
        f1Var.value_ = 0.0f;
    }

    private void L2() {
        this.value_ = 0.0f;
    }

    public static f1 M2() {
        return DEFAULT_INSTANCE;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(f1 f1Var) {
        return DEFAULT_INSTANCE.G1(f1Var);
    }

    public static f1 P2(float f4) {
        return N2().f2(f4).a();
    }

    public static f1 Q2(InputStream inputStream) throws IOException {
        return (f1) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static f1 R2(InputStream inputStream, s0 s0Var) throws IOException {
        return (f1) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f1 S2(w wVar) throws InvalidProtocolBufferException {
        return (f1) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static f1 T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (f1) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static f1 U2(z zVar) throws IOException {
        return (f1) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static f1 V2(z zVar, s0 s0Var) throws IOException {
        return (f1) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static f1 W2(InputStream inputStream) throws IOException {
        return (f1) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static f1 X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (f1) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f1 Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f1) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f1 Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (f1) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static f1 a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f1) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static f1 b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (f1) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<f1> c3() {
        return DEFAULT_INSTANCE.B();
    }

    private void d3(float f4) {
        this.value_ = f4;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28680a[iVar.ordinal()]) {
            case 1:
                return new f1();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<f1> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (f1.class) {
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

    @Override // androidx.content.preferences.protobuf.g1
    public float getValue() {
        return this.value_;
    }
}

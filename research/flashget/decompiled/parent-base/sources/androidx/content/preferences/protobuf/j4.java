package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: UInt64Value.java */
/* loaded from: classes3.dex */
public final class j4 extends i1<j4, b> implements k4 {
    private static final j4 DEFAULT_INSTANCE;
    private static volatile c3<j4> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* compiled from: UInt64Value.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28720a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28720a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28720a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28720a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28720a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28720a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28720a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28720a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: UInt64Value.java */
    public static final class b extends i1.b<j4, b> implements k4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            j4.K2((j4) this.f28695c);
            return this;
        }

        public b f2(long j4) {
            W1();
            j4.J2((j4) this.f28695c, j4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.k4
        public long getValue() {
            return ((j4) this.f28695c).getValue();
        }

        private b() {
            super(j4.DEFAULT_INSTANCE);
        }
    }

    static {
        j4 j4Var = new j4();
        DEFAULT_INSTANCE = j4Var;
        i1.G2(j4.class, j4Var);
    }

    private j4() {
    }

    static void J2(j4 j4Var, long j4) {
        j4Var.value_ = j4;
    }

    static void K2(j4 j4Var) {
        j4Var.value_ = 0L;
    }

    private void L2() {
        this.value_ = 0L;
    }

    public static j4 M2() {
        return DEFAULT_INSTANCE;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(j4 j4Var) {
        return DEFAULT_INSTANCE.G1(j4Var);
    }

    public static j4 P2(long j4) {
        return N2().f2(j4).a();
    }

    public static j4 Q2(InputStream inputStream) throws IOException {
        return (j4) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static j4 R2(InputStream inputStream, s0 s0Var) throws IOException {
        return (j4) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static j4 S2(w wVar) throws InvalidProtocolBufferException {
        return (j4) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static j4 T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (j4) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static j4 U2(z zVar) throws IOException {
        return (j4) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static j4 V2(z zVar, s0 s0Var) throws IOException {
        return (j4) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static j4 W2(InputStream inputStream) throws IOException {
        return (j4) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static j4 X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (j4) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static j4 Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (j4) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j4 Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (j4) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static j4 a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (j4) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static j4 b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (j4) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<j4> c3() {
        return DEFAULT_INSTANCE.B();
    }

    private void d3(long j4) {
        this.value_ = j4;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28720a[iVar.ordinal()]) {
            case 1:
                return new j4();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<j4> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (j4.class) {
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

    @Override // androidx.content.preferences.protobuf.k4
    public long getValue() {
        return this.value_;
    }
}

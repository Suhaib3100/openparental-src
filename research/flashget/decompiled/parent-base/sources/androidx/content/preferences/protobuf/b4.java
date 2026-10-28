package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Timestamp.java */
/* loaded from: classes3.dex */
public final class b4 extends i1<b4, b> implements c4 {
    private static final b4 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile c3<b4> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* compiled from: Timestamp.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28644a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28644a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28644a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28644a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28644a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28644a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28644a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28644a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Timestamp.java */
    public static final class b extends i1.b<b4, b> implements c4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            b4.M2((b4) this.f28695c);
            return this;
        }

        public b f2() {
            W1();
            b4.K2((b4) this.f28695c);
            return this;
        }

        public b g2(int i4) {
            W1();
            b4.L2((b4) this.f28695c, i4);
            return this;
        }

        public b h2(long j4) {
            W1();
            b4.J2((b4) this.f28695c, j4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.c4
        public int k() {
            return ((b4) this.f28695c).k();
        }

        @Override // androidx.content.preferences.protobuf.c4
        public long y() {
            return ((b4) this.f28695c).y();
        }

        private b() {
            super(b4.DEFAULT_INSTANCE);
        }
    }

    static {
        b4 b4Var = new b4();
        DEFAULT_INSTANCE = b4Var;
        i1.G2(b4.class, b4Var);
    }

    private b4() {
    }

    static void J2(b4 b4Var, long j4) {
        b4Var.seconds_ = j4;
    }

    static void K2(b4 b4Var) {
        b4Var.seconds_ = 0L;
    }

    static void L2(b4 b4Var, int i4) {
        b4Var.nanos_ = i4;
    }

    static void M2(b4 b4Var) {
        b4Var.nanos_ = 0;
    }

    private void N2() {
        this.nanos_ = 0;
    }

    private void O2() {
        this.seconds_ = 0L;
    }

    public static b4 P2() {
        return DEFAULT_INSTANCE;
    }

    public static b Q2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b R2(b4 b4Var) {
        return DEFAULT_INSTANCE.G1(b4Var);
    }

    public static b4 S2(InputStream inputStream) throws IOException {
        return (b4) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static b4 T2(InputStream inputStream, s0 s0Var) throws IOException {
        return (b4) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static b4 U2(w wVar) throws InvalidProtocolBufferException {
        return (b4) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static b4 V2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (b4) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static b4 W2(z zVar) throws IOException {
        return (b4) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static b4 X2(z zVar, s0 s0Var) throws IOException {
        return (b4) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static b4 Y2(InputStream inputStream) throws IOException {
        return (b4) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static b4 Z2(InputStream inputStream, s0 s0Var) throws IOException {
        return (b4) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static b4 a3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (b4) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b4 b3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (b4) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static b4 c3(byte[] bArr) throws InvalidProtocolBufferException {
        return (b4) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static b4 d3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (b4) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<b4> e3() {
        return DEFAULT_INSTANCE.B();
    }

    private void f3(int i4) {
        this.nanos_ = i4;
    }

    private void g3(long j4) {
        this.seconds_ = j4;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28644a[iVar.ordinal()]) {
            case 1:
                return new b4();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<b4> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (b4.class) {
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

    @Override // androidx.content.preferences.protobuf.c4
    public int k() {
        return this.nanos_;
    }

    @Override // androidx.content.preferences.protobuf.c4
    public long y() {
        return this.seconds_;
    }
}

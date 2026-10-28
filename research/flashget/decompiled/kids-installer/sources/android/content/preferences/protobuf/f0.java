package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Duration.java */
/* loaded from: classes4.dex */
public final class f0 extends i1<f0, b> implements g0 {
    private static final f0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile z2<f0> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* compiled from: Duration.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7226a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7226a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7226a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7226a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7226a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7226a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7226a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7226a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Duration.java */
    public static final class b extends i1.b<f0, b> implements g0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b i2() {
            a2();
            f0.N2((f0) this.f7240p);
            return this;
        }

        public b j2() {
            a2();
            f0.L2((f0) this.f7240p);
            return this;
        }

        public b k2(int i5) {
            a2();
            f0.M2((f0) this.f7240p, i5);
            return this;
        }

        public b l2(long j5) {
            a2();
            f0.K2((f0) this.f7240p, j5);
            return this;
        }

        @Override // android.content.preferences.protobuf.g0
        public int p() {
            return ((f0) this.f7240p).p();
        }

        @Override // android.content.preferences.protobuf.g0
        public long y() {
            return ((f0) this.f7240p).y();
        }

        private b() {
            super(f0.DEFAULT_INSTANCE);
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        i1.H2(f0.class, f0Var);
    }

    private f0() {
    }

    static void K2(f0 f0Var, long j5) {
        f0Var.seconds_ = j5;
    }

    static void L2(f0 f0Var) {
        f0Var.seconds_ = 0L;
    }

    static void M2(f0 f0Var, int i5) {
        f0Var.nanos_ = i5;
    }

    static void N2(f0 f0Var) {
        f0Var.nanos_ = 0;
    }

    private void O2() {
        this.nanos_ = 0;
    }

    private void P2() {
        this.seconds_ = 0L;
    }

    public static f0 Q2() {
        return DEFAULT_INSTANCE;
    }

    public static b R2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b S2(f0 f0Var) {
        return DEFAULT_INSTANCE.K1(f0Var);
    }

    public static f0 T2(InputStream inputStream) throws IOException {
        return (f0) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 U2(InputStream inputStream, s0 s0Var) throws IOException {
        return (f0) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f0 V2(w wVar) throws InvalidProtocolBufferException {
        return (f0) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static f0 W2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (f0) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static f0 X2(z zVar) throws IOException {
        return (f0) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static f0 Y2(z zVar, s0 s0Var) throws IOException {
        return (f0) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static f0 Z2(InputStream inputStream) throws IOException {
        return (f0) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 a3(InputStream inputStream, s0 s0Var) throws IOException {
        return (f0) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f0 b3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f0) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f0 c3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (f0) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static f0 d3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f0) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static f0 e3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (f0) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<f0> f3() {
        return DEFAULT_INSTANCE.z();
    }

    private void g3(int i5) {
        this.nanos_ = i5;
    }

    private void h3(long j5) {
        this.seconds_ = j5;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7226a[iVar.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<f0> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (f0.class) {
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

    @Override // android.content.preferences.protobuf.g0
    public int p() {
        return this.nanos_;
    }

    @Override // android.content.preferences.protobuf.g0
    public long y() {
        return this.seconds_;
    }
}

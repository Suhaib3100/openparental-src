package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: UInt64Value.java */
/* loaded from: classes4.dex */
public final class g4 extends i1<g4, b> implements h4 {
    private static final g4 DEFAULT_INSTANCE;
    private static volatile z2<g4> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* compiled from: UInt64Value.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7232a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7232a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7232a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7232a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7232a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7232a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7232a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7232a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: UInt64Value.java */
    public static final class b extends i1.b<g4, b> implements h4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.h4
        public long getValue() {
            return ((g4) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            g4.L2((g4) this.f7240p);
            return this;
        }

        public b j2(long j5) {
            a2();
            g4.K2((g4) this.f7240p, j5);
            return this;
        }

        private b() {
            super(g4.DEFAULT_INSTANCE);
        }
    }

    static {
        g4 g4Var = new g4();
        DEFAULT_INSTANCE = g4Var;
        i1.H2(g4.class, g4Var);
    }

    private g4() {
    }

    static void K2(g4 g4Var, long j5) {
        g4Var.value_ = j5;
    }

    static void L2(g4 g4Var) {
        g4Var.value_ = 0L;
    }

    private void M2() {
        this.value_ = 0L;
    }

    public static g4 N2() {
        return DEFAULT_INSTANCE;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b P2(g4 g4Var) {
        return DEFAULT_INSTANCE.K1(g4Var);
    }

    public static g4 Q2(long j5) {
        return O2().j2(j5).build();
    }

    public static g4 R2(InputStream inputStream) throws IOException {
        return (g4) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static g4 S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (g4) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static g4 T2(w wVar) throws InvalidProtocolBufferException {
        return (g4) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static g4 U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (g4) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static g4 V2(z zVar) throws IOException {
        return (g4) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static g4 W2(z zVar, s0 s0Var) throws IOException {
        return (g4) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static g4 X2(InputStream inputStream) throws IOException {
        return (g4) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static g4 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (g4) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static g4 Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (g4) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g4 a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (g4) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static g4 b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (g4) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static g4 c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (g4) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<g4> d3() {
        return DEFAULT_INSTANCE.z();
    }

    private void e3(long j5) {
        this.value_ = j5;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7232a[iVar.ordinal()]) {
            case 1:
                return new g4();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<g4> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (g4.class) {
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

    @Override // android.content.preferences.protobuf.h4
    public long getValue() {
        return this.value_;
    }
}

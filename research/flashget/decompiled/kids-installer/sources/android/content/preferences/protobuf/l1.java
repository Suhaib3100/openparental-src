package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Int64Value.java */
/* loaded from: classes4.dex */
public final class l1 extends i1<l1, b> implements m1 {
    private static final l1 DEFAULT_INSTANCE;
    private static volatile z2<l1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* compiled from: Int64Value.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7322a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7322a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7322a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7322a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7322a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7322a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7322a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7322a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Int64Value.java */
    public static final class b extends i1.b<l1, b> implements m1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.m1
        public long getValue() {
            return ((l1) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            l1.L2((l1) this.f7240p);
            return this;
        }

        public b j2(long j5) {
            a2();
            l1.K2((l1) this.f7240p, j5);
            return this;
        }

        private b() {
            super(l1.DEFAULT_INSTANCE);
        }
    }

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        i1.H2(l1.class, l1Var);
    }

    private l1() {
    }

    static void K2(l1 l1Var, long j5) {
        l1Var.value_ = j5;
    }

    static void L2(l1 l1Var) {
        l1Var.value_ = 0L;
    }

    private void M2() {
        this.value_ = 0L;
    }

    public static l1 N2() {
        return DEFAULT_INSTANCE;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b P2(l1 l1Var) {
        return DEFAULT_INSTANCE.K1(l1Var);
    }

    public static l1 Q2(long j5) {
        return O2().j2(j5).build();
    }

    public static l1 R2(InputStream inputStream) throws IOException {
        return (l1) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static l1 S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (l1) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static l1 T2(w wVar) throws InvalidProtocolBufferException {
        return (l1) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static l1 U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (l1) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static l1 V2(z zVar) throws IOException {
        return (l1) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static l1 W2(z zVar, s0 s0Var) throws IOException {
        return (l1) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static l1 X2(InputStream inputStream) throws IOException {
        return (l1) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static l1 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (l1) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static l1 Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (l1) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l1 a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (l1) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static l1 b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (l1) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static l1 c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (l1) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<l1> d3() {
        return DEFAULT_INSTANCE.z();
    }

    private void e3(long j5) {
        this.value_ = j5;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7322a[iVar.ordinal()]) {
            case 1:
                return new l1();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<l1> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (l1.class) {
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

    @Override // android.content.preferences.protobuf.m1
    public long getValue() {
        return this.value_;
    }
}

package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Int64Value.java */
/* loaded from: classes3.dex */
public final class l1 extends i1<l1, b> implements m1 {
    private static final l1 DEFAULT_INSTANCE;
    private static volatile c3<l1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* compiled from: Int64Value.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28733a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28733a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28733a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28733a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28733a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28733a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28733a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28733a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Int64Value.java */
    public static final class b extends i1.b<l1, b> implements m1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            l1.K2((l1) this.f28695c);
            return this;
        }

        public b f2(long j4) {
            W1();
            l1.J2((l1) this.f28695c, j4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.m1
        public long getValue() {
            return ((l1) this.f28695c).getValue();
        }

        private b() {
            super(l1.DEFAULT_INSTANCE);
        }
    }

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        i1.G2(l1.class, l1Var);
    }

    private l1() {
    }

    static void J2(l1 l1Var, long j4) {
        l1Var.value_ = j4;
    }

    static void K2(l1 l1Var) {
        l1Var.value_ = 0L;
    }

    private void L2() {
        this.value_ = 0L;
    }

    public static l1 M2() {
        return DEFAULT_INSTANCE;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(l1 l1Var) {
        return DEFAULT_INSTANCE.G1(l1Var);
    }

    public static l1 P2(long j4) {
        return N2().f2(j4).a();
    }

    public static l1 Q2(InputStream inputStream) throws IOException {
        return (l1) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static l1 R2(InputStream inputStream, s0 s0Var) throws IOException {
        return (l1) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static l1 S2(w wVar) throws InvalidProtocolBufferException {
        return (l1) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static l1 T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (l1) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static l1 U2(z zVar) throws IOException {
        return (l1) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static l1 V2(z zVar, s0 s0Var) throws IOException {
        return (l1) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static l1 W2(InputStream inputStream) throws IOException {
        return (l1) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static l1 X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (l1) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static l1 Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (l1) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l1 Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (l1) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static l1 a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (l1) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static l1 b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (l1) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<l1> c3() {
        return DEFAULT_INSTANCE.B();
    }

    private void d3(long j4) {
        this.value_ = j4;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28733a[iVar.ordinal()]) {
            case 1:
                return new l1();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<l1> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (l1.class) {
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

    @Override // androidx.content.preferences.protobuf.m1
    public long getValue() {
        return this.value_;
    }
}

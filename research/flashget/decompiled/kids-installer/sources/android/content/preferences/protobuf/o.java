package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BoolValue.java */
/* loaded from: classes4.dex */
public final class o extends i1<o, b> implements p {
    private static final o DEFAULT_INSTANCE;
    private static volatile z2<o> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* compiled from: BoolValue.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7438a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7438a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7438a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7438a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7438a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7438a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7438a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7438a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BoolValue.java */
    public static final class b extends i1.b<o, b> implements p {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.p
        public boolean getValue() {
            return ((o) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            o.L2((o) this.f7240p);
            return this;
        }

        public b j2(boolean z5) {
            a2();
            o.K2((o) this.f7240p, z5);
            return this;
        }

        private b() {
            super(o.DEFAULT_INSTANCE);
        }
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        i1.H2(o.class, oVar);
    }

    private o() {
    }

    static void K2(o oVar, boolean z5) {
        oVar.value_ = z5;
    }

    static void L2(o oVar) {
        oVar.value_ = false;
    }

    private void M2() {
        this.value_ = false;
    }

    public static o N2() {
        return DEFAULT_INSTANCE;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b P2(o oVar) {
        return DEFAULT_INSTANCE.K1(oVar);
    }

    public static o Q2(boolean z5) {
        return O2().j2(z5).build();
    }

    public static o R2(InputStream inputStream) throws IOException {
        return (o) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static o S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (o) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static o T2(w wVar) throws InvalidProtocolBufferException {
        return (o) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static o U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (o) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static o V2(z zVar) throws IOException {
        return (o) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static o W2(z zVar, s0 s0Var) throws IOException {
        return (o) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static o X2(InputStream inputStream) throws IOException {
        return (o) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static o Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (o) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static o Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (o) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (o) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static o b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (o) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static o c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (o) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<o> d3() {
        return DEFAULT_INSTANCE.z();
    }

    private void e3(boolean z5) {
        this.value_ = z5;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7438a[iVar.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<o> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (o.class) {
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

    @Override // android.content.preferences.protobuf.p
    public boolean getValue() {
        return this.value_;
    }
}

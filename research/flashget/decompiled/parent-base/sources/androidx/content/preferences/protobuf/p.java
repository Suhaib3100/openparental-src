package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BoolValue.java */
/* loaded from: classes3.dex */
public final class p extends i1<p, b> implements q {
    private static final p DEFAULT_INSTANCE;
    private static volatile c3<p> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* compiled from: BoolValue.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28846a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28846a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28846a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28846a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28846a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28846a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28846a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28846a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BoolValue.java */
    public static final class b extends i1.b<p, b> implements q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            p.K2((p) this.f28695c);
            return this;
        }

        public b f2(boolean z4) {
            W1();
            p.J2((p) this.f28695c, z4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q
        public boolean getValue() {
            return ((p) this.f28695c).getValue();
        }

        private b() {
            super(p.DEFAULT_INSTANCE);
        }
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        i1.G2(p.class, pVar);
    }

    private p() {
    }

    static void J2(p pVar, boolean z4) {
        pVar.value_ = z4;
    }

    static void K2(p pVar) {
        pVar.value_ = false;
    }

    private void L2() {
        this.value_ = false;
    }

    public static p M2() {
        return DEFAULT_INSTANCE;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(p pVar) {
        return DEFAULT_INSTANCE.G1(pVar);
    }

    public static p P2(boolean z4) {
        return N2().f2(z4).a();
    }

    public static p Q2(InputStream inputStream) throws IOException {
        return (p) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static p R2(InputStream inputStream, s0 s0Var) throws IOException {
        return (p) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static p S2(w wVar) throws InvalidProtocolBufferException {
        return (p) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static p T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (p) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static p U2(z zVar) throws IOException {
        return (p) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static p V2(z zVar, s0 s0Var) throws IOException {
        return (p) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static p W2(InputStream inputStream) throws IOException {
        return (p) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static p X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (p) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static p Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (p) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (p) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static p a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (p) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static p b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (p) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<p> c3() {
        return DEFAULT_INSTANCE.B();
    }

    private void d3(boolean z4) {
        this.value_ = z4;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28846a[iVar.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<p> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (p.class) {
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

    @Override // androidx.content.preferences.protobuf.q
    public boolean getValue() {
        return this.value_;
    }
}

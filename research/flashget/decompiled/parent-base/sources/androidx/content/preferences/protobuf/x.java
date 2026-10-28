package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BytesValue.java */
/* loaded from: classes3.dex */
public final class x extends i1<x, b> implements y {
    private static final x DEFAULT_INSTANCE;
    private static volatile c3<x> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private w value_ = w.f28998f;

    /* compiled from: BytesValue.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29027a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f29027a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29027a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29027a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29027a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29027a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29027a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29027a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BytesValue.java */
    public static final class b extends i1.b<x, b> implements y {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            ((x) this.f28695c).L2();
            return this;
        }

        public b f2(w wVar) {
            W1();
            ((x) this.f28695c).d3(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.y
        public w getValue() {
            return ((x) this.f28695c).getValue();
        }

        private b() {
            super(x.DEFAULT_INSTANCE);
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        i1.G2(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2() {
        this.value_ = DEFAULT_INSTANCE.value_;
    }

    public static x M2() {
        return DEFAULT_INSTANCE;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(x xVar) {
        return DEFAULT_INSTANCE.G1(xVar);
    }

    public static x P2(w wVar) {
        return N2().f2(wVar).a();
    }

    public static x Q2(InputStream inputStream) throws IOException {
        return (x) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static x R2(InputStream inputStream, s0 s0Var) throws IOException {
        return (x) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static x S2(w wVar) throws InvalidProtocolBufferException {
        return (x) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static x T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (x) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static x U2(z zVar) throws IOException {
        return (x) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static x V2(z zVar, s0 s0Var) throws IOException {
        return (x) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static x W2(InputStream inputStream) throws IOException {
        return (x) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static x X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (x) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static x Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (x) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (x) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static x a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (x) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static x b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (x) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<x> c3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3(w wVar) {
        wVar.getClass();
        this.value_ = wVar;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f29027a[iVar.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<x> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (x.class) {
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

    @Override // androidx.content.preferences.protobuf.y
    public w getValue() {
        return this.value_;
    }
}

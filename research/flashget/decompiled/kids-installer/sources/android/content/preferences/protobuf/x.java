package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BytesValue.java */
/* loaded from: classes4.dex */
public final class x extends i1<x, b> implements y {
    private static final x DEFAULT_INSTANCE;
    private static volatile z2<x> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private w value_ = w.f7553s;

    /* compiled from: BytesValue.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7581a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7581a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7581a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7581a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7581a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7581a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7581a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7581a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BytesValue.java */
    public static final class b extends i1.b<x, b> implements y {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.y
        public w getValue() {
            return ((x) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            ((x) this.f7240p).M2();
            return this;
        }

        public b j2(w wVar) {
            a2();
            ((x) this.f7240p).e3(wVar);
            return this;
        }

        private b() {
            super(x.DEFAULT_INSTANCE);
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        i1.H2(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        this.value_ = DEFAULT_INSTANCE.value_;
    }

    public static x N2() {
        return DEFAULT_INSTANCE;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b P2(x xVar) {
        return DEFAULT_INSTANCE.K1(xVar);
    }

    public static x Q2(w wVar) {
        return O2().j2(wVar).build();
    }

    public static x R2(InputStream inputStream) throws IOException {
        return (x) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static x S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (x) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static x T2(w wVar) throws InvalidProtocolBufferException {
        return (x) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static x U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (x) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static x V2(z zVar) throws IOException {
        return (x) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static x W2(z zVar, s0 s0Var) throws IOException {
        return (x) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static x X2(InputStream inputStream) throws IOException {
        return (x) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static x Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (x) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static x Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (x) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (x) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static x b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (x) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static x c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (x) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<x> d3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3(w wVar) {
        wVar.getClass();
        this.value_ = wVar;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7581a[iVar.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<x> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (x.class) {
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

    @Override // android.content.preferences.protobuf.y
    public w getValue() {
        return this.value_;
    }
}

package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Empty.java */
/* loaded from: classes3.dex */
public final class i0 extends i1<i0, b> implements j0 {
    private static final i0 DEFAULT_INSTANCE;
    private static volatile c3<i0> PARSER;

    /* compiled from: Empty.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28692a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28692a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28692a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28692a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28692a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28692a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28692a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28692a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Empty.java */
    public static final class b extends i1.b<i0, b> implements j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(i0.DEFAULT_INSTANCE);
        }
    }

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        i1.G2(i0.class, i0Var);
    }

    private i0() {
    }

    public static i0 J2() {
        return DEFAULT_INSTANCE;
    }

    public static b K2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b L2(i0 i0Var) {
        return DEFAULT_INSTANCE.G1(i0Var);
    }

    public static i0 M2(InputStream inputStream) throws IOException {
        return (i0) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 N2(InputStream inputStream, s0 s0Var) throws IOException {
        return (i0) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static i0 O2(w wVar) throws InvalidProtocolBufferException {
        return (i0) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static i0 P2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (i0) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static i0 Q2(z zVar) throws IOException {
        return (i0) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static i0 R2(z zVar, s0 s0Var) throws IOException {
        return (i0) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static i0 S2(InputStream inputStream) throws IOException {
        return (i0) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 T2(InputStream inputStream, s0 s0Var) throws IOException {
        return (i0) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static i0 U2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (i0) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i0 V2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (i0) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static i0 W2(byte[] bArr) throws InvalidProtocolBufferException {
        return (i0) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static i0 X2(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (i0) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<i0> Y2() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28692a[iVar.ordinal()]) {
            case 1:
                return new i0();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<i0> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (i0.class) {
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
}

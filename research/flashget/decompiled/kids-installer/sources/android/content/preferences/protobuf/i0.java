package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Empty.java */
/* loaded from: classes4.dex */
public final class i0 extends i1<i0, b> implements j0 {
    private static final i0 DEFAULT_INSTANCE;
    private static volatile z2<i0> PARSER;

    /* compiled from: Empty.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7237a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7237a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7237a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7237a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7237a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7237a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7237a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7237a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
        i1.H2(i0.class, i0Var);
    }

    private i0() {
    }

    public static i0 K2() {
        return DEFAULT_INSTANCE;
    }

    public static b L2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b M2(i0 i0Var) {
        return DEFAULT_INSTANCE.K1(i0Var);
    }

    public static i0 N2(InputStream inputStream) throws IOException {
        return (i0) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 O2(InputStream inputStream, s0 s0Var) throws IOException {
        return (i0) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static i0 P2(w wVar) throws InvalidProtocolBufferException {
        return (i0) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static i0 Q2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (i0) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static i0 R2(z zVar) throws IOException {
        return (i0) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static i0 S2(z zVar, s0 s0Var) throws IOException {
        return (i0) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static i0 T2(InputStream inputStream) throws IOException {
        return (i0) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 U2(InputStream inputStream, s0 s0Var) throws IOException {
        return (i0) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static i0 V2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (i0) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i0 W2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (i0) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static i0 X2(byte[] bArr) throws InvalidProtocolBufferException {
        return (i0) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static i0 Y2(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (i0) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<i0> Z2() {
        return DEFAULT_INSTANCE.z();
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7237a[iVar.ordinal()]) {
            case 1:
                return new i0();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<i0> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (i0.class) {
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
}

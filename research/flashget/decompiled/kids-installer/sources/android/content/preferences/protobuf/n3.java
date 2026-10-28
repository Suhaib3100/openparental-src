package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: SourceContext.java */
/* loaded from: classes4.dex */
public final class n3 extends i1<n3, b> implements o3 {
    private static final n3 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile z2<n3> PARSER;
    private String fileName_ = "";

    /* compiled from: SourceContext.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7431a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7431a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7431a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7431a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7431a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7431a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7431a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7431a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: SourceContext.java */
    public static final class b extends i1.b<n3, b> implements o3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.o3
        public w J0() {
            return ((n3) this.f7240p).J0();
        }

        @Override // android.content.preferences.protobuf.o3
        public String getFileName() {
            return ((n3) this.f7240p).getFileName();
        }

        public b i2() {
            a2();
            ((n3) this.f7240p).N2();
            return this;
        }

        public b j2(String str) {
            a2();
            ((n3) this.f7240p).e3(str);
            return this;
        }

        public b k2(w wVar) {
            a2();
            ((n3) this.f7240p).f3(wVar);
            return this;
        }

        private b() {
            super(n3.DEFAULT_INSTANCE);
        }
    }

    static {
        n3 n3Var = new n3();
        DEFAULT_INSTANCE = n3Var;
        i1.H2(n3.class, n3Var);
    }

    private n3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.fileName_ = DEFAULT_INSTANCE.fileName_;
    }

    public static n3 O2() {
        return DEFAULT_INSTANCE;
    }

    public static b P2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b Q2(n3 n3Var) {
        return DEFAULT_INSTANCE.K1(n3Var);
    }

    public static n3 R2(InputStream inputStream) throws IOException {
        return (n3) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static n3 S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (n3) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static n3 T2(w wVar) throws InvalidProtocolBufferException {
        return (n3) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static n3 U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (n3) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static n3 V2(z zVar) throws IOException {
        return (n3) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static n3 W2(z zVar, s0 s0Var) throws IOException {
        return (n3) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static n3 X2(InputStream inputStream) throws IOException {
        return (n3) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static n3 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (n3) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static n3 Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (n3) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n3 a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (n3) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static n3 b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (n3) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static n3 c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (n3) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<n3> d3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.fileName_ = wVar.p0();
    }

    @Override // android.content.preferences.protobuf.o3
    public w J0() {
        return w.z(this.fileName_);
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7431a[iVar.ordinal()]) {
            case 1:
                return new n3();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<n3> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (n3.class) {
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

    @Override // android.content.preferences.protobuf.o3
    public String getFileName() {
        return this.fileName_;
    }
}

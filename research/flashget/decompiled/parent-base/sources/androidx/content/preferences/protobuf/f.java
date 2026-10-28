package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Any.java */
/* loaded from: classes3.dex */
public final class f extends i1<f, b> implements g {
    private static final f DEFAULT_INSTANCE;
    private static volatile c3<f> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private w value_ = w.f28998f;

    /* compiled from: Any.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28678a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28678a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28678a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28678a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28678a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28678a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28678a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28678a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Any.java */
    public static final class b extends i1.b<f, b> implements g {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            ((f) this.f28695c).O2();
            return this;
        }

        public b f2() {
            W1();
            ((f) this.f28695c).P2();
            return this;
        }

        public b g2(String str) {
            W1();
            ((f) this.f28695c).g3(str);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.g
        public w getValue() {
            return ((f) this.f28695c).getValue();
        }

        public b h2(w wVar) {
            W1();
            ((f) this.f28695c).h3(wVar);
            return this;
        }

        public b i2(w wVar) {
            W1();
            ((f) this.f28695c).i3(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.g
        public w s() {
            return ((f) this.f28695c).s();
        }

        @Override // androidx.content.preferences.protobuf.g
        public String v() {
            return ((f) this.f28695c).v();
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        i1.G2(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2() {
        this.typeUrl_ = DEFAULT_INSTANCE.typeUrl_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2() {
        this.value_ = DEFAULT_INSTANCE.value_;
    }

    public static f Q2() {
        return DEFAULT_INSTANCE;
    }

    public static b R2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b S2(f fVar) {
        return DEFAULT_INSTANCE.G1(fVar);
    }

    public static f T2(InputStream inputStream) throws IOException {
        return (f) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static f U2(InputStream inputStream, s0 s0Var) throws IOException {
        return (f) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f V2(w wVar) throws InvalidProtocolBufferException {
        return (f) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static f W2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (f) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static f X2(z zVar) throws IOException {
        return (f) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static f Y2(z zVar, s0 s0Var) throws IOException {
        return (f) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static f Z2(InputStream inputStream) throws IOException {
        return (f) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static f a3(InputStream inputStream, s0 s0Var) throws IOException {
        return (f) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f b3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f c3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (f) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static f d3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static f e3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (f) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<f> f3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.typeUrl_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(w wVar) {
        wVar.getClass();
        this.value_ = wVar;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28678a[iVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<f> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (f.class) {
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

    @Override // androidx.content.preferences.protobuf.g
    public w getValue() {
        return this.value_;
    }

    @Override // androidx.content.preferences.protobuf.g
    public w s() {
        return w.A(this.typeUrl_);
    }

    @Override // androidx.content.preferences.protobuf.g
    public String v() {
        return this.typeUrl_;
    }
}

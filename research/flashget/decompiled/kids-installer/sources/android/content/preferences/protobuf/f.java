package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Any.java */
/* loaded from: classes4.dex */
public final class f extends i1<f, b> implements g {
    private static final f DEFAULT_INSTANCE;
    private static volatile z2<f> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private w value_ = w.f7553s;

    /* compiled from: Any.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7225a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7225a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7225a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7225a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7225a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7225a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7225a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7225a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Any.java */
    public static final class b extends i1.b<f, b> implements g {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.g
        public w getValue() {
            return ((f) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            ((f) this.f7240p).P2();
            return this;
        }

        public b j2() {
            a2();
            ((f) this.f7240p).Q2();
            return this;
        }

        public b k2(String str) {
            a2();
            ((f) this.f7240p).h3(str);
            return this;
        }

        public b l2(w wVar) {
            a2();
            ((f) this.f7240p).i3(wVar);
            return this;
        }

        public b m2(w wVar) {
            a2();
            ((f) this.f7240p).j3(wVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.g
        public w s() {
            return ((f) this.f7240p).s();
        }

        @Override // android.content.preferences.protobuf.g
        public String w() {
            return ((f) this.f7240p).w();
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        i1.H2(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2() {
        this.typeUrl_ = DEFAULT_INSTANCE.typeUrl_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        this.value_ = DEFAULT_INSTANCE.value_;
    }

    public static f R2() {
        return DEFAULT_INSTANCE;
    }

    public static b S2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b T2(f fVar) {
        return DEFAULT_INSTANCE.K1(fVar);
    }

    public static f U2(InputStream inputStream) throws IOException {
        return (f) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static f V2(InputStream inputStream, s0 s0Var) throws IOException {
        return (f) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f W2(w wVar) throws InvalidProtocolBufferException {
        return (f) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static f X2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (f) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static f Y2(z zVar) throws IOException {
        return (f) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static f Z2(z zVar, s0 s0Var) throws IOException {
        return (f) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static f a3(InputStream inputStream) throws IOException {
        return (f) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static f b3(InputStream inputStream, s0 s0Var) throws IOException {
        return (f) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static f c3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f d3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (f) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static f e3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static f f3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (f) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<f> g3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.typeUrl_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(w wVar) {
        wVar.getClass();
        this.value_ = wVar;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7225a[iVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<f> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (f.class) {
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

    @Override // android.content.preferences.protobuf.g
    public w getValue() {
        return this.value_;
    }

    @Override // android.content.preferences.protobuf.g
    public w s() {
        return w.z(this.typeUrl_);
    }

    @Override // android.content.preferences.protobuf.g
    public String w() {
        return this.typeUrl_;
    }
}

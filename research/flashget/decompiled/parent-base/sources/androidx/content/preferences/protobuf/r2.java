package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Mixin.java */
/* loaded from: classes3.dex */
public final class r2 extends i1<r2, b> implements s2 {
    private static final r2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile c3<r2> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* compiled from: Mixin.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28933a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28933a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28933a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28933a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28933a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28933a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28933a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28933a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Mixin.java */
    public static final class b extends i1.b<r2, b> implements s2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.s2
        public w C() {
            return ((r2) this.f28695c).C();
        }

        @Override // androidx.content.preferences.protobuf.s2
        public w c() {
            return ((r2) this.f28695c).c();
        }

        public b e2() {
            W1();
            ((r2) this.f28695c).P2();
            return this;
        }

        public b f2() {
            W1();
            ((r2) this.f28695c).Q2();
            return this;
        }

        public b g2(String str) {
            W1();
            ((r2) this.f28695c).h3(str);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.s2
        public String getName() {
            return ((r2) this.f28695c).getName();
        }

        @Override // androidx.content.preferences.protobuf.s2
        public String getRoot() {
            return ((r2) this.f28695c).getRoot();
        }

        public b h2(w wVar) {
            W1();
            ((r2) this.f28695c).i3(wVar);
            return this;
        }

        public b i2(String str) {
            W1();
            ((r2) this.f28695c).j3(str);
            return this;
        }

        public b j2(w wVar) {
            W1();
            ((r2) this.f28695c).k3(wVar);
            return this;
        }

        private b() {
            super(r2.DEFAULT_INSTANCE);
        }
    }

    static {
        r2 r2Var = new r2();
        DEFAULT_INSTANCE = r2Var;
        i1.G2(r2.class, r2Var);
    }

    private r2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        this.root_ = DEFAULT_INSTANCE.root_;
    }

    public static r2 R2() {
        return DEFAULT_INSTANCE;
    }

    public static b S2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b T2(r2 r2Var) {
        return DEFAULT_INSTANCE.G1(r2Var);
    }

    public static r2 U2(InputStream inputStream) throws IOException {
        return (r2) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static r2 V2(InputStream inputStream, s0 s0Var) throws IOException {
        return (r2) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static r2 W2(w wVar) throws InvalidProtocolBufferException {
        return (r2) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static r2 X2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (r2) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static r2 Y2(z zVar) throws IOException {
        return (r2) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static r2 Z2(z zVar, s0 s0Var) throws IOException {
        return (r2) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static r2 a3(InputStream inputStream) throws IOException {
        return (r2) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static r2 b3(InputStream inputStream, s0 s0Var) throws IOException {
        return (r2) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static r2 c3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (r2) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2 d3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (r2) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static r2 e3(byte[] bArr) throws InvalidProtocolBufferException {
        return (r2) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static r2 f3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (r2) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<r2> g3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.name_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(String str) {
        str.getClass();
        this.root_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.root_ = wVar.l0(p1.f28847a);
    }

    @Override // androidx.content.preferences.protobuf.s2
    public w C() {
        return w.A(this.root_);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28933a[iVar.ordinal()]) {
            case 1:
                return new r2();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<r2> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (r2.class) {
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

    @Override // androidx.content.preferences.protobuf.s2
    public w c() {
        return w.A(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.s2
    public String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.s2
    public String getRoot() {
        return this.root_;
    }
}

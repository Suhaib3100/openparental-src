package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.f;
import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Option.java */
/* loaded from: classes3.dex */
public final class a3 extends i1<a3, b> implements b3 {
    private static final a3 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile c3<a3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private f value_;

    /* compiled from: Option.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28628a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28628a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28628a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28628a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28628a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28628a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28628a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28628a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Option.java */
    public static final class b extends i1.b<a3, b> implements b3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.b3
        public boolean U0() {
            return ((a3) this.f28695c).U0();
        }

        @Override // androidx.content.preferences.protobuf.b3
        public w c() {
            return ((a3) this.f28695c).c();
        }

        public b e2() {
            W1();
            ((a3) this.f28695c).Q2();
            return this;
        }

        public b f2() {
            W1();
            a3.P2((a3) this.f28695c);
            return this;
        }

        public b g2(f fVar) {
            W1();
            ((a3) this.f28695c).T2(fVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.b3
        public String getName() {
            return ((a3) this.f28695c).getName();
        }

        @Override // androidx.content.preferences.protobuf.b3
        public f getValue() {
            return ((a3) this.f28695c).getValue();
        }

        public b h2(String str) {
            W1();
            ((a3) this.f28695c).j3(str);
            return this;
        }

        public b i2(w wVar) {
            W1();
            ((a3) this.f28695c).k3(wVar);
            return this;
        }

        public b j2(f.b bVar) {
            W1();
            ((a3) this.f28695c).l3(bVar);
            return this;
        }

        public b k2(f fVar) {
            W1();
            ((a3) this.f28695c).m3(fVar);
            return this;
        }

        private b() {
            super(a3.DEFAULT_INSTANCE);
        }
    }

    static {
        a3 a3Var = new a3();
        DEFAULT_INSTANCE = a3Var;
        i1.G2(a3.class, a3Var);
    }

    private a3() {
    }

    static void P2(a3 a3Var) {
        a3Var.value_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    private void R2() {
        this.value_ = null;
    }

    public static a3 S2() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2(f fVar) {
        fVar.getClass();
        f fVar2 = this.value_;
        if (fVar2 == null || fVar2 == f.Q2()) {
            this.value_ = fVar;
        } else {
            this.value_ = f.S2(this.value_).a2(fVar).l1();
        }
    }

    public static b U2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b V2(a3 a3Var) {
        return DEFAULT_INSTANCE.G1(a3Var);
    }

    public static a3 W2(InputStream inputStream) throws IOException {
        return (a3) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static a3 X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (a3) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static a3 Y2(w wVar) throws InvalidProtocolBufferException {
        return (a3) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static a3 Z2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (a3) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static a3 a3(z zVar) throws IOException {
        return (a3) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static a3 b3(z zVar, s0 s0Var) throws IOException {
        return (a3) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static a3 c3(InputStream inputStream) throws IOException {
        return (a3) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static a3 d3(InputStream inputStream, s0 s0Var) throws IOException {
        return (a3) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static a3 e3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (a3) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a3 f3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (a3) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static a3 g3(byte[] bArr) throws InvalidProtocolBufferException {
        return (a3) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static a3 h3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (a3) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<a3> i3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.name_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(f.b bVar) {
        this.value_ = bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(f fVar) {
        fVar.getClass();
        this.value_ = fVar;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28628a[iVar.ordinal()]) {
            case 1:
                return new a3();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<a3> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (a3.class) {
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

    @Override // androidx.content.preferences.protobuf.b3
    public boolean U0() {
        return this.value_ != null;
    }

    @Override // androidx.content.preferences.protobuf.b3
    public w c() {
        return w.A(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.b3
    public String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.b3
    public f getValue() {
        f fVar = this.value_;
        return fVar == null ? f.Q2() : fVar;
    }
}

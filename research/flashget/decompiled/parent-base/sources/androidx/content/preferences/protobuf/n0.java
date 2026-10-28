package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.a3;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.p1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: EnumValue.java */
/* loaded from: classes3.dex */
public final class n0 extends i1<n0, b> implements o0 {
    private static final n0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile c3<n0> PARSER;
    private int number_;
    private String name_ = "";
    private p1.k<a3> options_ = g3.f();

    /* compiled from: EnumValue.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28771a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28771a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28771a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28771a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28771a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28771a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28771a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28771a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: EnumValue.java */
    public static final class b extends i1.b<n0, b> implements o0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.o0
        public w c() {
            return ((n0) this.f28695c).c();
        }

        @Override // androidx.content.preferences.protobuf.o0
        public List<a3> d() {
            return Collections.unmodifiableList(((n0) this.f28695c).d());
        }

        @Override // androidx.content.preferences.protobuf.o0
        public int e() {
            return ((n0) this.f28695c).e();
        }

        public b e2(Iterable<? extends a3> iterable) {
            W1();
            ((n0) this.f28695c).X2(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.o0
        public a3 f(int i4) {
            return ((n0) this.f28695c).f(i4);
        }

        public b f2(int i4, a3.b bVar) {
            W1();
            ((n0) this.f28695c).Y2(i4, bVar);
            return this;
        }

        public b g2(int i4, a3 a3Var) {
            W1();
            ((n0) this.f28695c).Z2(i4, a3Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.o0
        public String getName() {
            return ((n0) this.f28695c).getName();
        }

        @Override // androidx.content.preferences.protobuf.o0
        public int getNumber() {
            return ((n0) this.f28695c).getNumber();
        }

        public b h2(a3.b bVar) {
            W1();
            ((n0) this.f28695c).a3(bVar);
            return this;
        }

        public b i2(a3 a3Var) {
            W1();
            ((n0) this.f28695c).b3(a3Var);
            return this;
        }

        public b j2() {
            W1();
            ((n0) this.f28695c).c3();
            return this;
        }

        public b k2() {
            W1();
            n0.S2((n0) this.f28695c);
            return this;
        }

        public b l2() {
            W1();
            ((n0) this.f28695c).e3();
            return this;
        }

        public b m2(int i4) {
            W1();
            ((n0) this.f28695c).z3(i4);
            return this;
        }

        public b o2(String str) {
            W1();
            ((n0) this.f28695c).B3(str);
            return this;
        }

        public b p2(w wVar) {
            W1();
            ((n0) this.f28695c).C3(wVar);
            return this;
        }

        public b r2(int i4) {
            W1();
            n0.R2((n0) this.f28695c, i4);
            return this;
        }

        public b s2(int i4, a3.b bVar) {
            W1();
            ((n0) this.f28695c).E3(i4, bVar);
            return this;
        }

        public b t2(int i4, a3 a3Var) {
            W1();
            ((n0) this.f28695c).F3(i4, a3Var);
            return this;
        }

        private b() {
            super(n0.DEFAULT_INSTANCE);
        }
    }

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        i1.G2(n0.class, n0Var);
    }

    private n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.name_ = wVar.l0(p1.f28847a);
    }

    private void D3(int i4) {
        this.number_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(int i4, a3.b bVar) {
        f3();
        this.options_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(int i4, a3 a3Var) {
        a3Var.getClass();
        f3();
        this.options_.set(i4, a3Var);
    }

    static void R2(n0 n0Var, int i4) {
        n0Var.number_ = i4;
    }

    static void S2(n0 n0Var) {
        n0Var.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X2(Iterable<? extends a3> iterable) {
        f3();
        a.AbstractC0471a.y1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2(int i4, a3.b bVar) {
        f3();
        this.options_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2(int i4, a3 a3Var) {
        a3Var.getClass();
        f3();
        this.options_.add(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(a3.b bVar) {
        f3();
        this.options_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3(a3 a3Var) {
        a3Var.getClass();
        f3();
        this.options_.add(a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    private void d3() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.options_ = g3.f();
    }

    private void f3() {
        if (this.options_.S1()) {
            return;
        }
        this.options_ = i1.g2(this.options_);
    }

    public static n0 g3() {
        return DEFAULT_INSTANCE;
    }

    public static b j3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b k3(n0 n0Var) {
        return DEFAULT_INSTANCE.G1(n0Var);
    }

    public static n0 l3(InputStream inputStream) throws IOException {
        return (n0) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static n0 m3(InputStream inputStream, s0 s0Var) throws IOException {
        return (n0) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static n0 n3(w wVar) throws InvalidProtocolBufferException {
        return (n0) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static n0 o3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (n0) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static n0 p3(z zVar) throws IOException {
        return (n0) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static n0 q3(z zVar, s0 s0Var) throws IOException {
        return (n0) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static n0 r3(InputStream inputStream) throws IOException {
        return (n0) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static n0 s3(InputStream inputStream, s0 s0Var) throws IOException {
        return (n0) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static n0 t3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (n0) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n0 u3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (n0) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static n0 w3(byte[] bArr) throws InvalidProtocolBufferException {
        return (n0) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static n0 x3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (n0) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<n0> y3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(int i4) {
        f3();
        this.options_.remove(i4);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28771a[iVar.ordinal()]) {
            case 1:
                return new n0();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", a3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<n0> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (n0.class) {
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

    @Override // androidx.content.preferences.protobuf.o0
    public w c() {
        return w.A(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.o0
    public List<a3> d() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.o0
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.o0
    public a3 f(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.o0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.o0
    public int getNumber() {
        return this.number_;
    }

    public b3 h3(int i4) {
        return this.options_.get(i4);
    }

    public List<? extends b3> i3() {
        return this.options_;
    }
}

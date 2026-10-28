package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.a3;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.n0;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.q3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Enum.java */
/* loaded from: classes3.dex */
public final class l0 extends i1<l0, b> implements m0 {
    private static final l0 DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile c3<l0> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private q3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private p1.k<n0> enumvalue_ = g3.f();
    private p1.k<a3> options_ = g3.f();

    /* compiled from: Enum.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28732a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28732a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28732a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28732a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28732a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28732a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28732a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28732a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Enum.java */
    public static final class b extends i1.b<l0, b> implements m0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b B2(String str) {
            W1();
            ((l0) this.f28695c).d4(str);
            return this;
        }

        public b C2(w wVar) {
            W1();
            ((l0) this.f28695c).e4(wVar);
            return this;
        }

        public b D2(int i4, a3.b bVar) {
            W1();
            ((l0) this.f28695c).f4(i4, bVar);
            return this;
        }

        public b E2(int i4, a3 a3Var) {
            W1();
            ((l0) this.f28695c).g4(i4, a3Var);
            return this;
        }

        public b F2(q3.b bVar) {
            W1();
            ((l0) this.f28695c).h4(bVar);
            return this;
        }

        public b G2(q3 q3Var) {
            W1();
            ((l0) this.f28695c).i4(q3Var);
            return this;
        }

        public b H2(z3 z3Var) {
            W1();
            ((l0) this.f28695c).j4(z3Var);
            return this;
        }

        public b I2(int i4) {
            W1();
            l0.b3((l0) this.f28695c, i4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.m0
        public n0 U(int i4) {
            return ((l0) this.f28695c).U(i4);
        }

        @Override // androidx.content.preferences.protobuf.m0
        public List<n0> Z() {
            return Collections.unmodifiableList(((l0) this.f28695c).Z());
        }

        @Override // androidx.content.preferences.protobuf.m0
        public w c() {
            return ((l0) this.f28695c).c();
        }

        @Override // androidx.content.preferences.protobuf.m0
        public List<a3> d() {
            return Collections.unmodifiableList(((l0) this.f28695c).d());
        }

        @Override // androidx.content.preferences.protobuf.m0
        public int d1() {
            return ((l0) this.f28695c).d1();
        }

        @Override // androidx.content.preferences.protobuf.m0
        public int e() {
            return ((l0) this.f28695c).e();
        }

        public b e2(Iterable<? extends n0> iterable) {
            W1();
            ((l0) this.f28695c).l3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.m0
        public a3 f(int i4) {
            return ((l0) this.f28695c).f(i4);
        }

        public b f2(Iterable<? extends a3> iterable) {
            W1();
            ((l0) this.f28695c).m3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.m0
        public z3 g() {
            return ((l0) this.f28695c).g();
        }

        public b g2(int i4, n0.b bVar) {
            W1();
            ((l0) this.f28695c).n3(i4, bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.m0
        public String getName() {
            return ((l0) this.f28695c).getName();
        }

        public b h2(int i4, n0 n0Var) {
            W1();
            ((l0) this.f28695c).o3(i4, n0Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.m0
        public int i() {
            return ((l0) this.f28695c).i();
        }

        public b i2(n0.b bVar) {
            W1();
            ((l0) this.f28695c).p3(bVar);
            return this;
        }

        public b j2(n0 n0Var) {
            W1();
            ((l0) this.f28695c).q3(n0Var);
            return this;
        }

        public b k2(int i4, a3.b bVar) {
            W1();
            ((l0) this.f28695c).r3(i4, bVar);
            return this;
        }

        public b l2(int i4, a3 a3Var) {
            W1();
            ((l0) this.f28695c).s3(i4, a3Var);
            return this;
        }

        public b m2(a3.b bVar) {
            W1();
            ((l0) this.f28695c).t3(bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.m0
        public boolean n() {
            return ((l0) this.f28695c).n();
        }

        @Override // androidx.content.preferences.protobuf.m0
        public q3 o() {
            return ((l0) this.f28695c).o();
        }

        public b o2(a3 a3Var) {
            W1();
            ((l0) this.f28695c).u3(a3Var);
            return this;
        }

        public b p2() {
            W1();
            ((l0) this.f28695c).w3();
            return this;
        }

        public b r2() {
            W1();
            ((l0) this.f28695c).x3();
            return this;
        }

        public b s2() {
            W1();
            ((l0) this.f28695c).y3();
            return this;
        }

        public b t2() {
            W1();
            l0.a3((l0) this.f28695c);
            return this;
        }

        public b u2() {
            W1();
            l0.d3((l0) this.f28695c);
            return this;
        }

        public b v2(q3 q3Var) {
            W1();
            ((l0) this.f28695c).J3(q3Var);
            return this;
        }

        public b w2(int i4) {
            W1();
            ((l0) this.f28695c).Z3(i4);
            return this;
        }

        public b x2(int i4) {
            W1();
            ((l0) this.f28695c).a4(i4);
            return this;
        }

        public b y2(int i4, n0.b bVar) {
            W1();
            ((l0) this.f28695c).b4(i4, bVar);
            return this;
        }

        public b z2(int i4, n0 n0Var) {
            W1();
            ((l0) this.f28695c).c4(i4, n0Var);
            return this;
        }

        private b() {
            super(l0.DEFAULT_INSTANCE);
        }
    }

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        i1.G2(l0.class, l0Var);
    }

    private l0() {
    }

    private void B3() {
        this.syntax_ = 0;
    }

    private void C3() {
        if (this.enumvalue_.S1()) {
            return;
        }
        this.enumvalue_ = i1.g2(this.enumvalue_);
    }

    private void D3() {
        if (this.options_.S1()) {
            return;
        }
        this.options_ = i1.g2(this.options_);
    }

    public static l0 E3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(q3 q3Var) {
        q3Var.getClass();
        q3 q3Var2 = this.sourceContext_;
        if (q3Var2 == null || q3Var2 == q3.N2()) {
            this.sourceContext_ = q3Var;
        } else {
            this.sourceContext_ = q3.P2(this.sourceContext_).a2(q3Var).l1();
        }
    }

    public static b K3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b L3(l0 l0Var) {
        return DEFAULT_INSTANCE.G1(l0Var);
    }

    public static l0 M3(InputStream inputStream) throws IOException {
        return (l0) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static l0 N3(InputStream inputStream, s0 s0Var) throws IOException {
        return (l0) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static l0 O3(w wVar) throws InvalidProtocolBufferException {
        return (l0) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static l0 P3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (l0) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static l0 Q3(z zVar) throws IOException {
        return (l0) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static l0 R3(z zVar, s0 s0Var) throws IOException {
        return (l0) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static l0 S3(InputStream inputStream) throws IOException {
        return (l0) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static l0 T3(InputStream inputStream, s0 s0Var) throws IOException {
        return (l0) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static l0 U3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (l0) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l0 V3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (l0) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static l0 W3(byte[] bArr) throws InvalidProtocolBufferException {
        return (l0) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static l0 X3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (l0) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<l0> Y3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(int i4) {
        C3();
        this.enumvalue_.remove(i4);
    }

    static void a3(l0 l0Var) {
        l0Var.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(int i4) {
        D3();
        this.options_.remove(i4);
    }

    static void b3(l0 l0Var, int i4) {
        l0Var.syntax_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(int i4, n0.b bVar) {
        C3();
        this.enumvalue_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(int i4, n0 n0Var) {
        n0Var.getClass();
        C3();
        this.enumvalue_.set(i4, n0Var);
    }

    static void d3(l0 l0Var) {
        l0Var.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.name_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(int i4, a3.b bVar) {
        D3();
        this.options_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(int i4, a3 a3Var) {
        a3Var.getClass();
        D3();
        this.options_.set(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(q3.b bVar) {
        this.sourceContext_ = bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(q3 q3Var) {
        q3Var.getClass();
        this.sourceContext_ = q3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(z3 z3Var) {
        z3Var.getClass();
        this.syntax_ = z3Var.getNumber();
    }

    private void k4(int i4) {
        this.syntax_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(Iterable<? extends n0> iterable) {
        C3();
        a.AbstractC0471a.y1(iterable, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(Iterable<? extends a3> iterable) {
        D3();
        a.AbstractC0471a.y1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3(int i4, n0.b bVar) {
        C3();
        this.enumvalue_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3(int i4, n0 n0Var) {
        n0Var.getClass();
        C3();
        this.enumvalue_.add(i4, n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(n0.b bVar) {
        C3();
        this.enumvalue_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(n0 n0Var) {
        n0Var.getClass();
        C3();
        this.enumvalue_.add(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(int i4, a3.b bVar) {
        D3();
        this.options_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i4, a3 a3Var) {
        a3Var.getClass();
        D3();
        this.options_.add(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(a3.b bVar) {
        D3();
        this.options_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(a3 a3Var) {
        a3Var.getClass();
        D3();
        this.options_.add(a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3() {
        this.enumvalue_ = g3.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        this.options_ = g3.f();
    }

    private void z3() {
        this.sourceContext_ = null;
    }

    public o0 F3(int i4) {
        return this.enumvalue_.get(i4);
    }

    public List<? extends o0> G3() {
        return this.enumvalue_;
    }

    public b3 H3(int i4) {
        return this.options_.get(i4);
    }

    public List<? extends b3> I3() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28732a[iVar.ordinal()]) {
            case 1:
                return new l0();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", n0.class, "options_", a3.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<l0> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (l0.class) {
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

    @Override // androidx.content.preferences.protobuf.m0
    public n0 U(int i4) {
        return this.enumvalue_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.m0
    public List<n0> Z() {
        return this.enumvalue_;
    }

    @Override // androidx.content.preferences.protobuf.m0
    public w c() {
        return w.A(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.m0
    public List<a3> d() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.m0
    public int d1() {
        return this.enumvalue_.size();
    }

    @Override // androidx.content.preferences.protobuf.m0
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.m0
    public a3 f(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.m0
    public z3 g() {
        z3 forNumber = z3.forNumber(this.syntax_);
        return forNumber == null ? z3.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.m0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.m0
    public int i() {
        return this.syntax_;
    }

    @Override // androidx.content.preferences.protobuf.m0
    public boolean n() {
        return this.sourceContext_ != null;
    }

    @Override // androidx.content.preferences.protobuf.m0
    public q3 o() {
        q3 q3Var = this.sourceContext_;
        return q3Var == null ? q3.N2() : q3Var;
    }
}

package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.n0;
import android.content.preferences.protobuf.n3;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.x2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Enum.java */
/* loaded from: classes4.dex */
public final class l0 extends i1<l0, b> implements m0 {
    private static final l0 DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile z2<l0> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private n3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private o1.k<n0> enumvalue_ = d3.g();
    private o1.k<x2> options_ = d3.g();

    /* compiled from: Enum.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7321a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7321a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7321a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7321a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7321a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7321a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7321a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7321a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Enum.java */
    public static final class b extends i1.b<l0, b> implements m0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(int i5, n0.b bVar) {
            a2();
            ((l0) this.f7240p).a4(i5, bVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.m0
        public List<n0> B0() {
            return Collections.unmodifiableList(((l0) this.f7240p).B0());
        }

        public b B2(int i5, n0 n0Var) {
            a2();
            ((l0) this.f7240p).b4(i5, n0Var);
            return this;
        }

        public b C2(String str) {
            a2();
            ((l0) this.f7240p).c4(str);
            return this;
        }

        public b D2(w wVar) {
            a2();
            ((l0) this.f7240p).d4(wVar);
            return this;
        }

        public b E2(int i5, x2.b bVar) {
            a2();
            ((l0) this.f7240p).e4(i5, bVar);
            return this;
        }

        public b F2(int i5, x2 x2Var) {
            a2();
            ((l0) this.f7240p).f4(i5, x2Var);
            return this;
        }

        public b G2(n3.b bVar) {
            a2();
            ((l0) this.f7240p).g4(bVar);
            return this;
        }

        public b H2(n3 n3Var) {
            a2();
            ((l0) this.f7240p).h4(n3Var);
            return this;
        }

        public b I2(w3 w3Var) {
            a2();
            ((l0) this.f7240p).i4(w3Var);
            return this;
        }

        public b J2(int i5) {
            a2();
            l0.c3((l0) this.f7240p, i5);
            return this;
        }

        @Override // android.content.preferences.protobuf.m0
        public int O0() {
            return ((l0) this.f7240p).O0();
        }

        @Override // android.content.preferences.protobuf.m0
        public w a() {
            return ((l0) this.f7240p).a();
        }

        @Override // android.content.preferences.protobuf.m0
        public int b() {
            return ((l0) this.f7240p).b();
        }

        @Override // android.content.preferences.protobuf.m0
        public List<x2> c() {
            return Collections.unmodifiableList(((l0) this.f7240p).c());
        }

        @Override // android.content.preferences.protobuf.m0
        public x2 d(int i5) {
            return ((l0) this.f7240p).d(i5);
        }

        @Override // android.content.preferences.protobuf.m0
        public w3 e() {
            return ((l0) this.f7240p).e();
        }

        @Override // android.content.preferences.protobuf.m0
        public int f() {
            return ((l0) this.f7240p).f();
        }

        @Override // android.content.preferences.protobuf.m0
        public String getName() {
            return ((l0) this.f7240p).getName();
        }

        @Override // android.content.preferences.protobuf.m0
        public n3 i() {
            return ((l0) this.f7240p).i();
        }

        public b i2(Iterable<? extends n0> iterable) {
            a2();
            ((l0) this.f7240p).m3(iterable);
            return this;
        }

        public b j2(Iterable<? extends x2> iterable) {
            a2();
            ((l0) this.f7240p).n3(iterable);
            return this;
        }

        @Override // android.content.preferences.protobuf.m0
        public boolean k() {
            return ((l0) this.f7240p).k();
        }

        public b k2(int i5, n0.b bVar) {
            a2();
            ((l0) this.f7240p).o3(i5, bVar);
            return this;
        }

        public b l2(int i5, n0 n0Var) {
            a2();
            ((l0) this.f7240p).p3(i5, n0Var);
            return this;
        }

        public b m2(n0.b bVar) {
            a2();
            ((l0) this.f7240p).q3(bVar);
            return this;
        }

        public b n2(n0 n0Var) {
            a2();
            ((l0) this.f7240p).r3(n0Var);
            return this;
        }

        public b o2(int i5, x2.b bVar) {
            a2();
            ((l0) this.f7240p).s3(i5, bVar);
            return this;
        }

        public b p2(int i5, x2 x2Var) {
            a2();
            ((l0) this.f7240p).t3(i5, x2Var);
            return this;
        }

        public b q2(x2.b bVar) {
            a2();
            ((l0) this.f7240p).u3(bVar);
            return this;
        }

        public b r2(x2 x2Var) {
            a2();
            ((l0) this.f7240p).v3(x2Var);
            return this;
        }

        @Override // android.content.preferences.protobuf.m0
        public n0 s0(int i5) {
            return ((l0) this.f7240p).s0(i5);
        }

        public b s2() {
            a2();
            ((l0) this.f7240p).w3();
            return this;
        }

        public b t2() {
            a2();
            ((l0) this.f7240p).x3();
            return this;
        }

        public b u2() {
            a2();
            ((l0) this.f7240p).y3();
            return this;
        }

        public b v2() {
            a2();
            l0.b3((l0) this.f7240p);
            return this;
        }

        public b w2() {
            a2();
            l0.e3((l0) this.f7240p);
            return this;
        }

        public b x2(n3 n3Var) {
            a2();
            ((l0) this.f7240p).I3(n3Var);
            return this;
        }

        public b y2(int i5) {
            a2();
            ((l0) this.f7240p).Y3(i5);
            return this;
        }

        public b z2(int i5) {
            a2();
            ((l0) this.f7240p).Z3(i5);
            return this;
        }

        private b() {
            super(l0.DEFAULT_INSTANCE);
        }
    }

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        i1.H2(l0.class, l0Var);
    }

    private l0() {
    }

    private void A3() {
        this.syntax_ = 0;
    }

    private void B3() {
        if (this.enumvalue_.m1()) {
            return;
        }
        this.enumvalue_ = i1.j2(this.enumvalue_);
    }

    private void C3() {
        if (this.options_.m1()) {
            return;
        }
        this.options_ = i1.j2(this.options_);
    }

    public static l0 D3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(n3 n3Var) {
        n3Var.getClass();
        n3 n3Var2 = this.sourceContext_;
        if (n3Var2 == null || n3Var2 == n3.O2()) {
            this.sourceContext_ = n3Var;
        } else {
            this.sourceContext_ = n3.Q2(this.sourceContext_).e2(n3Var).N0();
        }
    }

    public static b J3() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b K3(l0 l0Var) {
        return DEFAULT_INSTANCE.K1(l0Var);
    }

    public static l0 L3(InputStream inputStream) throws IOException {
        return (l0) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static l0 M3(InputStream inputStream, s0 s0Var) throws IOException {
        return (l0) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static l0 N3(w wVar) throws InvalidProtocolBufferException {
        return (l0) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static l0 O3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (l0) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static l0 P3(z zVar) throws IOException {
        return (l0) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static l0 Q3(z zVar, s0 s0Var) throws IOException {
        return (l0) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static l0 R3(InputStream inputStream) throws IOException {
        return (l0) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static l0 S3(InputStream inputStream, s0 s0Var) throws IOException {
        return (l0) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static l0 T3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (l0) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l0 U3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (l0) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static l0 V3(byte[] bArr) throws InvalidProtocolBufferException {
        return (l0) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static l0 W3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (l0) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<l0> X3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(int i5) {
        B3();
        this.enumvalue_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(int i5) {
        C3();
        this.options_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(int i5, n0.b bVar) {
        B3();
        this.enumvalue_.set(i5, bVar.build());
    }

    static void b3(l0 l0Var) {
        l0Var.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(int i5, n0 n0Var) {
        n0Var.getClass();
        B3();
        this.enumvalue_.set(i5, n0Var);
    }

    static void c3(l0 l0Var, int i5) {
        l0Var.syntax_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.name_ = wVar.p0();
    }

    static void e3(l0 l0Var) {
        l0Var.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(int i5, x2.b bVar) {
        C3();
        this.options_.set(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(int i5, x2 x2Var) {
        x2Var.getClass();
        C3();
        this.options_.set(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(n3.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(n3 n3Var) {
        n3Var.getClass();
        this.sourceContext_ = n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(w3 w3Var) {
        w3Var.getClass();
        this.syntax_ = w3Var.getNumber();
    }

    private void j4(int i5) {
        this.syntax_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(Iterable<? extends n0> iterable) {
        B3();
        a.AbstractC0082a.F1(iterable, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3(Iterable<? extends x2> iterable) {
        C3();
        a.AbstractC0082a.F1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3(int i5, n0.b bVar) {
        B3();
        this.enumvalue_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(int i5, n0 n0Var) {
        n0Var.getClass();
        B3();
        this.enumvalue_.add(i5, n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(n0.b bVar) {
        B3();
        this.enumvalue_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(n0 n0Var) {
        n0Var.getClass();
        B3();
        this.enumvalue_.add(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i5, x2.b bVar) {
        C3();
        this.options_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(int i5, x2 x2Var) {
        x2Var.getClass();
        C3();
        this.options_.add(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(x2.b bVar) {
        C3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(x2 x2Var) {
        x2Var.getClass();
        C3();
        this.options_.add(x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3() {
        this.enumvalue_ = d3.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        this.options_ = d3.g();
    }

    private void z3() {
        this.sourceContext_ = null;
    }

    @Override // android.content.preferences.protobuf.m0
    public List<n0> B0() {
        return this.enumvalue_;
    }

    public o0 E3(int i5) {
        return this.enumvalue_.get(i5);
    }

    public List<? extends o0> F3() {
        return this.enumvalue_;
    }

    public y2 G3(int i5) {
        return this.options_.get(i5);
    }

    public List<? extends y2> H3() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7321a[iVar.ordinal()]) {
            case 1:
                return new l0();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", n0.class, "options_", x2.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<l0> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (l0.class) {
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

    @Override // android.content.preferences.protobuf.m0
    public int O0() {
        return this.enumvalue_.size();
    }

    @Override // android.content.preferences.protobuf.m0
    public w a() {
        return w.z(this.name_);
    }

    @Override // android.content.preferences.protobuf.m0
    public int b() {
        return this.options_.size();
    }

    @Override // android.content.preferences.protobuf.m0
    public List<x2> c() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.m0
    public x2 d(int i5) {
        return this.options_.get(i5);
    }

    @Override // android.content.preferences.protobuf.m0
    public w3 e() {
        w3 forNumber = w3.forNumber(this.syntax_);
        return forNumber == null ? w3.UNRECOGNIZED : forNumber;
    }

    @Override // android.content.preferences.protobuf.m0
    public int f() {
        return this.syntax_;
    }

    @Override // android.content.preferences.protobuf.m0
    public String getName() {
        return this.name_;
    }

    @Override // android.content.preferences.protobuf.m0
    public n3 i() {
        n3 n3Var = this.sourceContext_;
        return n3Var == null ? n3.O2() : n3Var;
    }

    @Override // android.content.preferences.protobuf.m0
    public boolean k() {
        return this.sourceContext_ != null;
    }

    @Override // android.content.preferences.protobuf.m0
    public n0 s0(int i5) {
        return this.enumvalue_.get(i5);
    }
}

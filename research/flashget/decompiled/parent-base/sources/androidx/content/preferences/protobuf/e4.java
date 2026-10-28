package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.a3;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.q3;
import androidx.content.preferences.protobuf.w0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Type.java */
/* loaded from: classes3.dex */
public final class e4 extends i1<e4, b> implements f4 {
    private static final e4 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile c3<e4> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private q3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private p1.k<w0> fields_ = g3.f();
    private p1.k<String> oneofs_ = g3.f();
    private p1.k<a3> options_ = g3.f();

    /* compiled from: Type.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28677a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28677a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28677a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28677a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28677a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28677a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28677a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28677a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Type.java */
    public static final class b extends i1.b<e4, b> implements f4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b B2(int i4) {
            W1();
            ((e4) this.f28695c).j4(i4);
            return this;
        }

        public b C2(int i4) {
            W1();
            ((e4) this.f28695c).k4(i4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public List<String> D() {
            return Collections.unmodifiableList(((e4) this.f28695c).D());
        }

        public b D2(int i4, w0.b bVar) {
            W1();
            ((e4) this.f28695c).l4(i4, bVar);
            return this;
        }

        public b E2(int i4, w0 w0Var) {
            W1();
            ((e4) this.f28695c).m4(i4, w0Var);
            return this;
        }

        public b F2(String str) {
            W1();
            ((e4) this.f28695c).n4(str);
            return this;
        }

        public b G2(w wVar) {
            W1();
            ((e4) this.f28695c).o4(wVar);
            return this;
        }

        public b H2(int i4, String str) {
            W1();
            ((e4) this.f28695c).p4(i4, str);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public w0 I0(int i4) {
            return ((e4) this.f28695c).I0(i4);
        }

        public b I2(int i4, a3.b bVar) {
            W1();
            ((e4) this.f28695c).q4(i4, bVar);
            return this;
        }

        public b J2(int i4, a3 a3Var) {
            W1();
            ((e4) this.f28695c).r4(i4, a3Var);
            return this;
        }

        public b K2(q3.b bVar) {
            W1();
            ((e4) this.f28695c).s4(bVar);
            return this;
        }

        public b L2(q3 q3Var) {
            W1();
            ((e4) this.f28695c).t4(q3Var);
            return this;
        }

        public b M2(z3 z3Var) {
            W1();
            ((e4) this.f28695c).u4(z3Var);
            return this;
        }

        public b N2(int i4) {
            W1();
            e4.h3((e4) this.f28695c, i4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public List<w0> O() {
            return Collections.unmodifiableList(((e4) this.f28695c).O());
        }

        @Override // androidx.content.preferences.protobuf.f4
        public String T0(int i4) {
            return ((e4) this.f28695c).T0(i4);
        }

        @Override // androidx.content.preferences.protobuf.f4
        public w c() {
            return ((e4) this.f28695c).c();
        }

        @Override // androidx.content.preferences.protobuf.f4
        public List<a3> d() {
            return Collections.unmodifiableList(((e4) this.f28695c).d());
        }

        @Override // androidx.content.preferences.protobuf.f4
        public int e() {
            return ((e4) this.f28695c).e();
        }

        public b e2(Iterable<? extends w0> iterable) {
            W1();
            ((e4) this.f28695c).q3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public a3 f(int i4) {
            return ((e4) this.f28695c).f(i4);
        }

        @Override // androidx.content.preferences.protobuf.f4
        public w f0(int i4) {
            return ((e4) this.f28695c).f0(i4);
        }

        public b f2(Iterable<String> iterable) {
            W1();
            ((e4) this.f28695c).r3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public z3 g() {
            return ((e4) this.f28695c).g();
        }

        public b g2(Iterable<? extends a3> iterable) {
            W1();
            ((e4) this.f28695c).s3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public String getName() {
            return ((e4) this.f28695c).getName();
        }

        public b h2(int i4, w0.b bVar) {
            W1();
            ((e4) this.f28695c).t3(i4, bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public int i() {
            return ((e4) this.f28695c).i();
        }

        public b i2(int i4, w0 w0Var) {
            W1();
            ((e4) this.f28695c).u3(i4, w0Var);
            return this;
        }

        public b j2(w0.b bVar) {
            W1();
            ((e4) this.f28695c).w3(bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public int k0() {
            return ((e4) this.f28695c).k0();
        }

        public b k2(w0 w0Var) {
            W1();
            ((e4) this.f28695c).x3(w0Var);
            return this;
        }

        public b l2(String str) {
            W1();
            ((e4) this.f28695c).y3(str);
            return this;
        }

        public b m2(w wVar) {
            W1();
            ((e4) this.f28695c).z3(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public boolean n() {
            return ((e4) this.f28695c).n();
        }

        @Override // androidx.content.preferences.protobuf.f4
        public q3 o() {
            return ((e4) this.f28695c).o();
        }

        public b o2(int i4, a3.b bVar) {
            W1();
            ((e4) this.f28695c).B3(i4, bVar);
            return this;
        }

        public b p2(int i4, a3 a3Var) {
            W1();
            ((e4) this.f28695c).C3(i4, a3Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.f4
        public int r() {
            return ((e4) this.f28695c).r();
        }

        public b r2(a3.b bVar) {
            W1();
            ((e4) this.f28695c).D3(bVar);
            return this;
        }

        public b s2(a3 a3Var) {
            W1();
            ((e4) this.f28695c).E3(a3Var);
            return this;
        }

        public b t2() {
            W1();
            ((e4) this.f28695c).F3();
            return this;
        }

        public b u2() {
            W1();
            ((e4) this.f28695c).G3();
            return this;
        }

        public b v2() {
            W1();
            ((e4) this.f28695c).H3();
            return this;
        }

        public b w2() {
            W1();
            ((e4) this.f28695c).I3();
            return this;
        }

        public b x2() {
            W1();
            e4.g3((e4) this.f28695c);
            return this;
        }

        public b y2() {
            W1();
            e4.j3((e4) this.f28695c);
            return this;
        }

        public b z2(q3 q3Var) {
            W1();
            ((e4) this.f28695c).T3(q3Var);
            return this;
        }

        private b() {
            super(e4.DEFAULT_INSTANCE);
        }
    }

    static {
        e4 e4Var = new e4();
        DEFAULT_INSTANCE = e4Var;
        i1.G2(e4.class, e4Var);
    }

    private e4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(int i4, a3.b bVar) {
        N3();
        this.options_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i4, a3 a3Var) {
        a3Var.getClass();
        N3();
        this.options_.add(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(a3.b bVar) {
        N3();
        this.options_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(a3 a3Var) {
        a3Var.getClass();
        N3();
        this.options_.add(a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3() {
        this.fields_ = g3.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3() {
        this.oneofs_ = g3.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3() {
        this.options_ = g3.f();
    }

    private void J3() {
        this.sourceContext_ = null;
    }

    private void K3() {
        this.syntax_ = 0;
    }

    private void L3() {
        if (this.fields_.S1()) {
            return;
        }
        this.fields_ = i1.g2(this.fields_);
    }

    private void M3() {
        if (this.oneofs_.S1()) {
            return;
        }
        this.oneofs_ = i1.g2(this.oneofs_);
    }

    private void N3() {
        if (this.options_.S1()) {
            return;
        }
        this.options_ = i1.g2(this.options_);
    }

    public static e4 O3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(q3 q3Var) {
        q3Var.getClass();
        q3 q3Var2 = this.sourceContext_;
        if (q3Var2 == null || q3Var2 == q3.N2()) {
            this.sourceContext_ = q3Var;
        } else {
            this.sourceContext_ = q3.P2(this.sourceContext_).a2(q3Var).l1();
        }
    }

    public static b U3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b V3(e4 e4Var) {
        return DEFAULT_INSTANCE.G1(e4Var);
    }

    public static e4 W3(InputStream inputStream) throws IOException {
        return (e4) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static e4 X3(InputStream inputStream, s0 s0Var) throws IOException {
        return (e4) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static e4 Y3(w wVar) throws InvalidProtocolBufferException {
        return (e4) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static e4 Z3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (e4) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static e4 a4(z zVar) throws IOException {
        return (e4) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static e4 b4(z zVar, s0 s0Var) throws IOException {
        return (e4) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static e4 c4(InputStream inputStream) throws IOException {
        return (e4) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static e4 d4(InputStream inputStream, s0 s0Var) throws IOException {
        return (e4) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static e4 e4(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (e4) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e4 f4(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (e4) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    static void g3(e4 e4Var) {
        e4Var.sourceContext_ = null;
    }

    public static e4 g4(byte[] bArr) throws InvalidProtocolBufferException {
        return (e4) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    static void h3(e4 e4Var, int i4) {
        e4Var.syntax_ = i4;
    }

    public static e4 h4(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (e4) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<e4> i4() {
        return DEFAULT_INSTANCE.B();
    }

    static void j3(e4 e4Var) {
        e4Var.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(int i4) {
        L3();
        this.fields_.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k4(int i4) {
        N3();
        this.options_.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l4(int i4, w0.b bVar) {
        L3();
        this.fields_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(int i4, w0 w0Var) {
        w0Var.getClass();
        L3();
        this.fields_.set(i4, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.name_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(int i4, String str) {
        str.getClass();
        M3();
        this.oneofs_.set(i4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(Iterable<? extends w0> iterable) {
        L3();
        a.AbstractC0471a.y1(iterable, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q4(int i4, a3.b bVar) {
        N3();
        this.options_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(Iterable<String> iterable) {
        M3();
        a.AbstractC0471a.y1(iterable, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r4(int i4, a3 a3Var) {
        a3Var.getClass();
        N3();
        this.options_.set(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(Iterable<? extends a3> iterable) {
        N3();
        a.AbstractC0471a.y1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s4(q3.b bVar) {
        this.sourceContext_ = bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(int i4, w0.b bVar) {
        L3();
        this.fields_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t4(q3 q3Var) {
        q3Var.getClass();
        this.sourceContext_ = q3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(int i4, w0 w0Var) {
        w0Var.getClass();
        L3();
        this.fields_.add(i4, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u4(z3 z3Var) {
        z3Var.getClass();
        this.syntax_ = z3Var.getNumber();
    }

    private void v4(int i4) {
        this.syntax_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(w0.b bVar) {
        L3();
        this.fields_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(w0 w0Var) {
        w0Var.getClass();
        L3();
        this.fields_.add(w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        str.getClass();
        M3();
        this.oneofs_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        M3();
        this.oneofs_.add(wVar.l0(p1.f28847a));
    }

    @Override // androidx.content.preferences.protobuf.f4
    public List<String> D() {
        return this.oneofs_;
    }

    @Override // androidx.content.preferences.protobuf.f4
    public w0 I0(int i4) {
        return this.fields_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28677a[iVar.ordinal()]) {
            case 1:
                return new e4();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", w0.class, "oneofs_", "options_", a3.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<e4> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (e4.class) {
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

    @Override // androidx.content.preferences.protobuf.f4
    public List<w0> O() {
        return this.fields_;
    }

    public b1 P3(int i4) {
        return this.fields_.get(i4);
    }

    public List<? extends b1> Q3() {
        return this.fields_;
    }

    public b3 R3(int i4) {
        return this.options_.get(i4);
    }

    public List<? extends b3> S3() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.f4
    public String T0(int i4) {
        return this.oneofs_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.f4
    public w c() {
        return w.A(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.f4
    public List<a3> d() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.f4
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.f4
    public a3 f(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.f4
    public w f0(int i4) {
        return w.A(this.oneofs_.get(i4));
    }

    @Override // androidx.content.preferences.protobuf.f4
    public z3 g() {
        z3 forNumber = z3.forNumber(this.syntax_);
        return forNumber == null ? z3.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.f4
    public String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.f4
    public int i() {
        return this.syntax_;
    }

    @Override // androidx.content.preferences.protobuf.f4
    public int k0() {
        return this.oneofs_.size();
    }

    @Override // androidx.content.preferences.protobuf.f4
    public boolean n() {
        return this.sourceContext_ != null;
    }

    @Override // androidx.content.preferences.protobuf.f4
    public q3 o() {
        q3 q3Var = this.sourceContext_;
        return q3Var == null ? q3.N2() : q3Var;
    }

    @Override // androidx.content.preferences.protobuf.f4
    public int r() {
        return this.fields_.size();
    }
}

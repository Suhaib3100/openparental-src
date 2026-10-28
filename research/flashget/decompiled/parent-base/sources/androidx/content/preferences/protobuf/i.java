package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.a3;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.p2;
import androidx.content.preferences.protobuf.q3;
import androidx.content.preferences.protobuf.r2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Api.java */
/* loaded from: classes3.dex */
public final class i extends i1<i, b> implements j {
    private static final i DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile c3<i> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private q3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private p1.k<p2> methods_ = g3.f();
    private p1.k<a3> options_ = g3.f();
    private String version_ = "";
    private p1.k<r2> mixins_ = g3.f();

    /* compiled from: Api.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28691a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28691a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28691a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28691a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28691a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28691a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28691a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28691a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Api.java */
    public static final class b extends i1.b<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b B2() {
            W1();
            i.r3((i) this.f28695c);
            return this;
        }

        public b C2() {
            W1();
            ((i) this.f28695c).U3();
            return this;
        }

        public b D2(q3 q3Var) {
            W1();
            ((i) this.f28695c).f4(q3Var);
            return this;
        }

        public b E2(int i4) {
            W1();
            ((i) this.f28695c).v4(i4);
            return this;
        }

        public b F2(int i4) {
            W1();
            ((i) this.f28695c).w4(i4);
            return this;
        }

        public b G2(int i4) {
            W1();
            ((i) this.f28695c).x4(i4);
            return this;
        }

        public b H2(int i4, p2.b bVar) {
            W1();
            ((i) this.f28695c).y4(i4, bVar);
            return this;
        }

        public b I2(int i4, p2 p2Var) {
            W1();
            ((i) this.f28695c).z4(i4, p2Var);
            return this;
        }

        public b J2(int i4, r2.b bVar) {
            W1();
            ((i) this.f28695c).A4(i4, bVar);
            return this;
        }

        public b K2(int i4, r2 r2Var) {
            W1();
            ((i) this.f28695c).B4(i4, r2Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public w L0() {
            return ((i) this.f28695c).L0();
        }

        public b L2(String str) {
            W1();
            ((i) this.f28695c).C4(str);
            return this;
        }

        public b M2(w wVar) {
            W1();
            ((i) this.f28695c).D4(wVar);
            return this;
        }

        public b N2(int i4, a3.b bVar) {
            W1();
            ((i) this.f28695c).E4(i4, bVar);
            return this;
        }

        public b O2(int i4, a3 a3Var) {
            W1();
            ((i) this.f28695c).F4(i4, a3Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public int P0() {
            return ((i) this.f28695c).P0();
        }

        public b P2(q3.b bVar) {
            W1();
            ((i) this.f28695c).G4(bVar);
            return this;
        }

        public b Q2(q3 q3Var) {
            W1();
            ((i) this.f28695c).H4(q3Var);
            return this;
        }

        public b R2(z3 z3Var) {
            W1();
            ((i) this.f28695c).I4(z3Var);
            return this;
        }

        public b S2(int i4) {
            W1();
            i.o3((i) this.f28695c, i4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public List<r2> T() {
            return Collections.unmodifiableList(((i) this.f28695c).T());
        }

        public b T2(String str) {
            W1();
            ((i) this.f28695c).K4(str);
            return this;
        }

        public b U2(w wVar) {
            W1();
            ((i) this.f28695c).L4(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public p2 a0(int i4) {
            return ((i) this.f28695c).a0(i4);
        }

        @Override // androidx.content.preferences.protobuf.j
        public w c() {
            return ((i) this.f28695c).c();
        }

        @Override // androidx.content.preferences.protobuf.j
        public List<a3> d() {
            return Collections.unmodifiableList(((i) this.f28695c).d());
        }

        @Override // androidx.content.preferences.protobuf.j
        public List<p2> d0() {
            return Collections.unmodifiableList(((i) this.f28695c).d0());
        }

        @Override // androidx.content.preferences.protobuf.j
        public int e() {
            return ((i) this.f28695c).e();
        }

        public b e2(Iterable<? extends p2> iterable) {
            W1();
            ((i) this.f28695c).y3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public a3 f(int i4) {
            return ((i) this.f28695c).f(i4);
        }

        public b f2(Iterable<? extends r2> iterable) {
            W1();
            ((i) this.f28695c).z3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public z3 g() {
            return ((i) this.f28695c).g();
        }

        public b g2(Iterable<? extends a3> iterable) {
            W1();
            ((i) this.f28695c).B3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public String getName() {
            return ((i) this.f28695c).getName();
        }

        @Override // androidx.content.preferences.protobuf.j
        public String getVersion() {
            return ((i) this.f28695c).getVersion();
        }

        public b h2(int i4, p2.b bVar) {
            W1();
            ((i) this.f28695c).C3(i4, bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public int i() {
            return ((i) this.f28695c).i();
        }

        public b i2(int i4, p2 p2Var) {
            W1();
            ((i) this.f28695c).D3(i4, p2Var);
            return this;
        }

        public b j2(p2.b bVar) {
            W1();
            ((i) this.f28695c).E3(bVar);
            return this;
        }

        public b k2(p2 p2Var) {
            W1();
            ((i) this.f28695c).F3(p2Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public int l0() {
            return ((i) this.f28695c).l0();
        }

        public b l2(int i4, r2.b bVar) {
            W1();
            ((i) this.f28695c).G3(i4, bVar);
            return this;
        }

        public b m2(int i4, r2 r2Var) {
            W1();
            ((i) this.f28695c).H3(i4, r2Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public boolean n() {
            return ((i) this.f28695c).n();
        }

        @Override // androidx.content.preferences.protobuf.j
        public q3 o() {
            return ((i) this.f28695c).o();
        }

        public b o2(r2.b bVar) {
            W1();
            ((i) this.f28695c).I3(bVar);
            return this;
        }

        public b p2(r2 r2Var) {
            W1();
            ((i) this.f28695c).J3(r2Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.j
        public r2 r1(int i4) {
            return ((i) this.f28695c).r1(i4);
        }

        public b r2(int i4, a3.b bVar) {
            W1();
            ((i) this.f28695c).K3(i4, bVar);
            return this;
        }

        public b s2(int i4, a3 a3Var) {
            W1();
            ((i) this.f28695c).L3(i4, a3Var);
            return this;
        }

        public b t2(a3.b bVar) {
            W1();
            ((i) this.f28695c).M3(bVar);
            return this;
        }

        public b u2(a3 a3Var) {
            W1();
            ((i) this.f28695c).N3(a3Var);
            return this;
        }

        public b v2() {
            W1();
            ((i) this.f28695c).O3();
            return this;
        }

        public b w2() {
            W1();
            ((i) this.f28695c).P3();
            return this;
        }

        public b x2() {
            W1();
            ((i) this.f28695c).Q3();
            return this;
        }

        public b y2() {
            W1();
            ((i) this.f28695c).R3();
            return this;
        }

        public b z2() {
            W1();
            i.d3((i) this.f28695c);
            return this;
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        i1.G2(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A4(int i4, r2.b bVar) {
        W3();
        this.mixins_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(Iterable<? extends a3> iterable) {
        X3();
        a.AbstractC0471a.y1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4(int i4, r2 r2Var) {
        r2Var.getClass();
        W3();
        this.mixins_.set(i4, r2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i4, p2.b bVar) {
        V3();
        this.methods_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(int i4, p2 p2Var) {
        p2Var.getClass();
        V3();
        this.methods_.add(i4, p2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D4(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.name_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(p2.b bVar) {
        V3();
        this.methods_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E4(int i4, a3.b bVar) {
        X3();
        this.options_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(p2 p2Var) {
        p2Var.getClass();
        V3();
        this.methods_.add(p2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F4(int i4, a3 a3Var) {
        a3Var.getClass();
        X3();
        this.options_.set(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(int i4, r2.b bVar) {
        W3();
        this.mixins_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G4(q3.b bVar) {
        this.sourceContext_ = bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(int i4, r2 r2Var) {
        r2Var.getClass();
        W3();
        this.mixins_.add(i4, r2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H4(q3 q3Var) {
        q3Var.getClass();
        this.sourceContext_ = q3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(r2.b bVar) {
        W3();
        this.mixins_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I4(z3 z3Var) {
        z3Var.getClass();
        this.syntax_ = z3Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(r2 r2Var) {
        r2Var.getClass();
        W3();
        this.mixins_.add(r2Var);
    }

    private void J4(int i4) {
        this.syntax_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(int i4, a3.b bVar) {
        X3();
        this.options_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K4(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(int i4, a3 a3Var) {
        a3Var.getClass();
        X3();
        this.options_.add(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L4(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.version_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(a3.b bVar) {
        X3();
        this.options_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(a3 a3Var) {
        a3Var.getClass();
        X3();
        this.options_.add(a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3() {
        this.methods_ = g3.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3() {
        this.mixins_ = g3.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3() {
        this.options_ = g3.f();
    }

    private void S3() {
        this.sourceContext_ = null;
    }

    private void T3() {
        this.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3() {
        this.version_ = DEFAULT_INSTANCE.version_;
    }

    private void V3() {
        if (this.methods_.S1()) {
            return;
        }
        this.methods_ = i1.g2(this.methods_);
    }

    private void W3() {
        if (this.mixins_.S1()) {
            return;
        }
        this.mixins_ = i1.g2(this.mixins_);
    }

    private void X3() {
        if (this.options_.S1()) {
            return;
        }
        this.options_ = i1.g2(this.options_);
    }

    public static i Y3() {
        return DEFAULT_INSTANCE;
    }

    static void d3(i iVar) {
        iVar.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(q3 q3Var) {
        q3Var.getClass();
        q3 q3Var2 = this.sourceContext_;
        if (q3Var2 == null || q3Var2 == q3.N2()) {
            this.sourceContext_ = q3Var;
        } else {
            this.sourceContext_ = q3.P2(this.sourceContext_).a2(q3Var).l1();
        }
    }

    public static b g4() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b h4(i iVar) {
        return DEFAULT_INSTANCE.G1(iVar);
    }

    public static i i4(InputStream inputStream) throws IOException {
        return (i) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static i j4(InputStream inputStream, s0 s0Var) throws IOException {
        return (i) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static i k4(w wVar) throws InvalidProtocolBufferException {
        return (i) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static i l4(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (i) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static i m4(z zVar) throws IOException {
        return (i) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static i n4(z zVar, s0 s0Var) throws IOException {
        return (i) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    static void o3(i iVar, int i4) {
        iVar.syntax_ = i4;
    }

    public static i o4(InputStream inputStream) throws IOException {
        return (i) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static i p4(InputStream inputStream, s0 s0Var) throws IOException {
        return (i) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static i q4(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (i) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    static void r3(i iVar) {
        iVar.syntax_ = 0;
    }

    public static i r4(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (i) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static i s4(byte[] bArr) throws InvalidProtocolBufferException {
        return (i) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static i t4(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (i) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<i> u4() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v4(int i4) {
        V3();
        this.methods_.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w4(int i4) {
        W3();
        this.mixins_.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x4(int i4) {
        X3();
        this.options_.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(Iterable<? extends p2> iterable) {
        V3();
        a.AbstractC0471a.y1(iterable, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y4(int i4, p2.b bVar) {
        V3();
        this.methods_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(Iterable<? extends r2> iterable) {
        W3();
        a.AbstractC0471a.y1(iterable, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4(int i4, p2 p2Var) {
        p2Var.getClass();
        V3();
        this.methods_.set(i4, p2Var);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28691a[iVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", p2.class, "options_", a3.class, "version_", "sourceContext_", "mixins_", r2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<i> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (i.class) {
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

    @Override // androidx.content.preferences.protobuf.j
    public w L0() {
        return w.A(this.version_);
    }

    @Override // androidx.content.preferences.protobuf.j
    public int P0() {
        return this.methods_.size();
    }

    @Override // androidx.content.preferences.protobuf.j
    public List<r2> T() {
        return this.mixins_;
    }

    public q2 Z3(int i4) {
        return this.methods_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.j
    public p2 a0(int i4) {
        return this.methods_.get(i4);
    }

    public List<? extends q2> a4() {
        return this.methods_;
    }

    public s2 b4(int i4) {
        return this.mixins_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.j
    public w c() {
        return w.A(this.name_);
    }

    public List<? extends s2> c4() {
        return this.mixins_;
    }

    @Override // androidx.content.preferences.protobuf.j
    public List<a3> d() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.j
    public List<p2> d0() {
        return this.methods_;
    }

    public b3 d4(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.j
    public int e() {
        return this.options_.size();
    }

    public List<? extends b3> e4() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.j
    public a3 f(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.j
    public z3 g() {
        z3 forNumber = z3.forNumber(this.syntax_);
        return forNumber == null ? z3.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.j
    public String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.j
    public String getVersion() {
        return this.version_;
    }

    @Override // androidx.content.preferences.protobuf.j
    public int i() {
        return this.syntax_;
    }

    @Override // androidx.content.preferences.protobuf.j
    public int l0() {
        return this.mixins_.size();
    }

    @Override // androidx.content.preferences.protobuf.j
    public boolean n() {
        return this.sourceContext_ != null;
    }

    @Override // androidx.content.preferences.protobuf.j
    public q3 o() {
        q3 q3Var = this.sourceContext_;
        return q3Var == null ? q3.N2() : q3Var;
    }

    @Override // androidx.content.preferences.protobuf.j
    public r2 r1(int i4) {
        return this.mixins_.get(i4);
    }
}

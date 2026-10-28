package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.m2;
import android.content.preferences.protobuf.n3;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.o2;
import android.content.preferences.protobuf.x2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Api.java */
/* loaded from: classes4.dex */
public final class i extends i1<i, b> implements j {
    private static final i DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile z2<i> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private n3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private o1.k<m2> methods_ = d3.g();
    private o1.k<x2> options_ = d3.g();
    private String version_ = "";
    private o1.k<o2> mixins_ = d3.g();

    /* compiled from: Api.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7236a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7236a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7236a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7236a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7236a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7236a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7236a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7236a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Api.java */
    public static final class b extends i1.b<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2() {
            a2();
            ((i) this.f7240p).Q3();
            return this;
        }

        public b B2() {
            a2();
            i.e3((i) this.f7240p);
            return this;
        }

        @Override // android.content.preferences.protobuf.j
        public m2 C0(int i5) {
            return ((i) this.f7240p).C0(i5);
        }

        public b C2() {
            a2();
            i.s3((i) this.f7240p);
            return this;
        }

        public b D2() {
            a2();
            ((i) this.f7240p).T3();
            return this;
        }

        public b E2(n3 n3Var) {
            a2();
            ((i) this.f7240p).e4(n3Var);
            return this;
        }

        public b F2(int i5) {
            a2();
            ((i) this.f7240p).u4(i5);
            return this;
        }

        @Override // android.content.preferences.protobuf.j
        public List<m2> G0() {
            return Collections.unmodifiableList(((i) this.f7240p).G0());
        }

        public b G2(int i5) {
            a2();
            ((i) this.f7240p).v4(i5);
            return this;
        }

        public b H2(int i5) {
            a2();
            ((i) this.f7240p).w4(i5);
            return this;
        }

        public b I2(int i5, m2.b bVar) {
            a2();
            ((i) this.f7240p).x4(i5, bVar);
            return this;
        }

        public b J2(int i5, m2 m2Var) {
            a2();
            ((i) this.f7240p).y4(i5, m2Var);
            return this;
        }

        public b K2(int i5, o2.b bVar) {
            a2();
            ((i) this.f7240p).z4(i5, bVar);
            return this;
        }

        public b L2(int i5, o2 o2Var) {
            a2();
            ((i) this.f7240p).A4(i5, o2Var);
            return this;
        }

        public b M2(String str) {
            a2();
            ((i) this.f7240p).B4(str);
            return this;
        }

        public b N2(w wVar) {
            a2();
            ((i) this.f7240p).C4(wVar);
            return this;
        }

        public b O2(int i5, x2.b bVar) {
            a2();
            ((i) this.f7240p).D4(i5, bVar);
            return this;
        }

        public b P2(int i5, x2 x2Var) {
            a2();
            ((i) this.f7240p).E4(i5, x2Var);
            return this;
        }

        public b Q2(n3.b bVar) {
            a2();
            ((i) this.f7240p).F4(bVar);
            return this;
        }

        public b R2(n3 n3Var) {
            a2();
            ((i) this.f7240p).G4(n3Var);
            return this;
        }

        public b S2(w3 w3Var) {
            a2();
            ((i) this.f7240p).H4(w3Var);
            return this;
        }

        public b T2(int i5) {
            a2();
            i.p3((i) this.f7240p, i5);
            return this;
        }

        public b U2(String str) {
            a2();
            ((i) this.f7240p).J4(str);
            return this;
        }

        public b V2(w wVar) {
            a2();
            ((i) this.f7240p).K4(wVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.j
        public w a() {
            return ((i) this.f7240p).a();
        }

        @Override // android.content.preferences.protobuf.j
        public int a1() {
            return ((i) this.f7240p).a1();
        }

        @Override // android.content.preferences.protobuf.j
        public int b() {
            return ((i) this.f7240p).b();
        }

        @Override // android.content.preferences.protobuf.j
        public List<x2> c() {
            return Collections.unmodifiableList(((i) this.f7240p).c());
        }

        @Override // android.content.preferences.protobuf.j
        public x2 d(int i5) {
            return ((i) this.f7240p).d(i5);
        }

        @Override // android.content.preferences.protobuf.j
        public w3 e() {
            return ((i) this.f7240p).e();
        }

        @Override // android.content.preferences.protobuf.j
        public w e0() {
            return ((i) this.f7240p).e0();
        }

        @Override // android.content.preferences.protobuf.j
        public int f() {
            return ((i) this.f7240p).f();
        }

        @Override // android.content.preferences.protobuf.j
        public String getName() {
            return ((i) this.f7240p).getName();
        }

        @Override // android.content.preferences.protobuf.j
        public n3 i() {
            return ((i) this.f7240p).i();
        }

        public b i2(Iterable<? extends m2> iterable) {
            a2();
            ((i) this.f7240p).y3(iterable);
            return this;
        }

        public b j2(Iterable<? extends o2> iterable) {
            a2();
            ((i) this.f7240p).z3(iterable);
            return this;
        }

        @Override // android.content.preferences.protobuf.j
        public boolean k() {
            return ((i) this.f7240p).k();
        }

        public b k2(Iterable<? extends x2> iterable) {
            a2();
            ((i) this.f7240p).A3(iterable);
            return this;
        }

        @Override // android.content.preferences.protobuf.j
        public int l0() {
            return ((i) this.f7240p).l0();
        }

        public b l2(int i5, m2.b bVar) {
            a2();
            ((i) this.f7240p).B3(i5, bVar);
            return this;
        }

        public b m2(int i5, m2 m2Var) {
            a2();
            ((i) this.f7240p).C3(i5, m2Var);
            return this;
        }

        public b n2(m2.b bVar) {
            a2();
            ((i) this.f7240p).D3(bVar);
            return this;
        }

        public b o2(m2 m2Var) {
            a2();
            ((i) this.f7240p).E3(m2Var);
            return this;
        }

        public b p2(int i5, o2.b bVar) {
            a2();
            ((i) this.f7240p).F3(i5, bVar);
            return this;
        }

        public b q2(int i5, o2 o2Var) {
            a2();
            ((i) this.f7240p).G3(i5, o2Var);
            return this;
        }

        @Override // android.content.preferences.protobuf.j
        public List<o2> r0() {
            return Collections.unmodifiableList(((i) this.f7240p).r0());
        }

        public b r2(o2.b bVar) {
            a2();
            ((i) this.f7240p).H3(bVar);
            return this;
        }

        public b s2(o2 o2Var) {
            a2();
            ((i) this.f7240p).I3(o2Var);
            return this;
        }

        public b t2(int i5, x2.b bVar) {
            a2();
            ((i) this.f7240p).J3(i5, bVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.j
        public String u1() {
            return ((i) this.f7240p).u1();
        }

        public b u2(int i5, x2 x2Var) {
            a2();
            ((i) this.f7240p).K3(i5, x2Var);
            return this;
        }

        @Override // android.content.preferences.protobuf.j
        public o2 v1(int i5) {
            return ((i) this.f7240p).v1(i5);
        }

        public b v2(x2.b bVar) {
            a2();
            ((i) this.f7240p).L3(bVar);
            return this;
        }

        public b w2(x2 x2Var) {
            a2();
            ((i) this.f7240p).M3(x2Var);
            return this;
        }

        public b x2() {
            a2();
            ((i) this.f7240p).N3();
            return this;
        }

        public b y2() {
            a2();
            ((i) this.f7240p).O3();
            return this;
        }

        public b z2() {
            a2();
            ((i) this.f7240p).P3();
            return this;
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        i1.H2(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(Iterable<? extends x2> iterable) {
        W3();
        a.AbstractC0082a.F1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A4(int i5, o2 o2Var) {
        o2Var.getClass();
        V3();
        this.mixins_.set(i5, o2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(int i5, m2.b bVar) {
        U3();
        this.methods_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i5, m2 m2Var) {
        m2Var.getClass();
        U3();
        this.methods_.add(i5, m2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C4(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.name_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(m2.b bVar) {
        U3();
        this.methods_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D4(int i5, x2.b bVar) {
        W3();
        this.options_.set(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(m2 m2Var) {
        m2Var.getClass();
        U3();
        this.methods_.add(m2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E4(int i5, x2 x2Var) {
        x2Var.getClass();
        W3();
        this.options_.set(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(int i5, o2.b bVar) {
        V3();
        this.mixins_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F4(n3.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(int i5, o2 o2Var) {
        o2Var.getClass();
        V3();
        this.mixins_.add(i5, o2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G4(n3 n3Var) {
        n3Var.getClass();
        this.sourceContext_ = n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(o2.b bVar) {
        V3();
        this.mixins_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H4(w3 w3Var) {
        w3Var.getClass();
        this.syntax_ = w3Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(o2 o2Var) {
        o2Var.getClass();
        V3();
        this.mixins_.add(o2Var);
    }

    private void I4(int i5) {
        this.syntax_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(int i5, x2.b bVar) {
        W3();
        this.options_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J4(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(int i5, x2 x2Var) {
        x2Var.getClass();
        W3();
        this.options_.add(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K4(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.version_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(x2.b bVar) {
        W3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(x2 x2Var) {
        x2Var.getClass();
        W3();
        this.options_.add(x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3() {
        this.methods_ = d3.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3() {
        this.mixins_ = d3.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3() {
        this.options_ = d3.g();
    }

    private void R3() {
        this.sourceContext_ = null;
    }

    private void S3() {
        this.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3() {
        this.version_ = DEFAULT_INSTANCE.version_;
    }

    private void U3() {
        if (this.methods_.m1()) {
            return;
        }
        this.methods_ = i1.j2(this.methods_);
    }

    private void V3() {
        if (this.mixins_.m1()) {
            return;
        }
        this.mixins_ = i1.j2(this.mixins_);
    }

    private void W3() {
        if (this.options_.m1()) {
            return;
        }
        this.options_ = i1.j2(this.options_);
    }

    public static i X3() {
        return DEFAULT_INSTANCE;
    }

    static void e3(i iVar) {
        iVar.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(n3 n3Var) {
        n3Var.getClass();
        n3 n3Var2 = this.sourceContext_;
        if (n3Var2 == null || n3Var2 == n3.O2()) {
            this.sourceContext_ = n3Var;
        } else {
            this.sourceContext_ = n3.Q2(this.sourceContext_).e2(n3Var).N0();
        }
    }

    public static b f4() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b g4(i iVar) {
        return DEFAULT_INSTANCE.K1(iVar);
    }

    public static i h4(InputStream inputStream) throws IOException {
        return (i) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static i i4(InputStream inputStream, s0 s0Var) throws IOException {
        return (i) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static i j4(w wVar) throws InvalidProtocolBufferException {
        return (i) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static i k4(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (i) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static i l4(z zVar) throws IOException {
        return (i) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static i m4(z zVar, s0 s0Var) throws IOException {
        return (i) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static i n4(InputStream inputStream) throws IOException {
        return (i) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static i o4(InputStream inputStream, s0 s0Var) throws IOException {
        return (i) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    static void p3(i iVar, int i5) {
        iVar.syntax_ = i5;
    }

    public static i p4(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (i) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i q4(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (i) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static i r4(byte[] bArr) throws InvalidProtocolBufferException {
        return (i) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    static void s3(i iVar) {
        iVar.syntax_ = 0;
    }

    public static i s4(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (i) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<i> t4() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u4(int i5) {
        U3();
        this.methods_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v4(int i5) {
        V3();
        this.mixins_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w4(int i5) {
        W3();
        this.options_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x4(int i5, m2.b bVar) {
        U3();
        this.methods_.set(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(Iterable<? extends m2> iterable) {
        U3();
        a.AbstractC0082a.F1(iterable, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y4(int i5, m2 m2Var) {
        m2Var.getClass();
        U3();
        this.methods_.set(i5, m2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(Iterable<? extends o2> iterable) {
        V3();
        a.AbstractC0082a.F1(iterable, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4(int i5, o2.b bVar) {
        V3();
        this.mixins_.set(i5, bVar.build());
    }

    @Override // android.content.preferences.protobuf.j
    public m2 C0(int i5) {
        return this.methods_.get(i5);
    }

    @Override // android.content.preferences.protobuf.j
    public List<m2> G0() {
        return this.methods_;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7236a[iVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", m2.class, "options_", x2.class, "version_", "sourceContext_", "mixins_", o2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<i> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (i.class) {
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

    public n2 Y3(int i5) {
        return this.methods_.get(i5);
    }

    public List<? extends n2> Z3() {
        return this.methods_;
    }

    @Override // android.content.preferences.protobuf.j
    public w a() {
        return w.z(this.name_);
    }

    @Override // android.content.preferences.protobuf.j
    public int a1() {
        return this.mixins_.size();
    }

    public p2 a4(int i5) {
        return this.mixins_.get(i5);
    }

    @Override // android.content.preferences.protobuf.j
    public int b() {
        return this.options_.size();
    }

    public List<? extends p2> b4() {
        return this.mixins_;
    }

    @Override // android.content.preferences.protobuf.j
    public List<x2> c() {
        return this.options_;
    }

    public y2 c4(int i5) {
        return this.options_.get(i5);
    }

    @Override // android.content.preferences.protobuf.j
    public x2 d(int i5) {
        return this.options_.get(i5);
    }

    public List<? extends y2> d4() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.j
    public w3 e() {
        w3 forNumber = w3.forNumber(this.syntax_);
        return forNumber == null ? w3.UNRECOGNIZED : forNumber;
    }

    @Override // android.content.preferences.protobuf.j
    public w e0() {
        return w.z(this.version_);
    }

    @Override // android.content.preferences.protobuf.j
    public int f() {
        return this.syntax_;
    }

    @Override // android.content.preferences.protobuf.j
    public String getName() {
        return this.name_;
    }

    @Override // android.content.preferences.protobuf.j
    public n3 i() {
        n3 n3Var = this.sourceContext_;
        return n3Var == null ? n3.O2() : n3Var;
    }

    @Override // android.content.preferences.protobuf.j
    public boolean k() {
        return this.sourceContext_ != null;
    }

    @Override // android.content.preferences.protobuf.j
    public int l0() {
        return this.methods_.size();
    }

    @Override // android.content.preferences.protobuf.j
    public List<o2> r0() {
        return this.mixins_;
    }

    @Override // android.content.preferences.protobuf.j
    public String u1() {
        return this.version_;
    }

    @Override // android.content.preferences.protobuf.j
    public o2 v1(int i5) {
        return this.mixins_.get(i5);
    }
}

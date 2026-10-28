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

/* compiled from: Method.java */
/* loaded from: classes3.dex */
public final class p2 extends i1<p2, b> implements q2 {
    private static final p2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile c3<p2> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private p1.k<a3> options_ = g3.f();

    /* compiled from: Method.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28865a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28865a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28865a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28865a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28865a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28865a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28865a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28865a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Method.java */
    public static final class b extends i1.b<p2, b> implements q2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b B2(boolean z4) {
            W1();
            p2.M2((p2) this.f28695c, z4);
            return this;
        }

        public b C2(String str) {
            W1();
            ((p2) this.f28695c).Y3(str);
            return this;
        }

        public b D2(w wVar) {
            W1();
            ((p2) this.f28695c).Z3(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public w E() {
            return ((p2) this.f28695c).E();
        }

        public b E2(z3 z3Var) {
            W1();
            ((p2) this.f28695c).a4(z3Var);
            return this;
        }

        public b F2(int i4) {
            W1();
            p2.Y2((p2) this.f28695c, i4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public boolean b0() {
            return ((p2) this.f28695c).b0();
        }

        @Override // androidx.content.preferences.protobuf.q2
        public w c() {
            return ((p2) this.f28695c).c();
        }

        @Override // androidx.content.preferences.protobuf.q2
        public List<a3> d() {
            return Collections.unmodifiableList(((p2) this.f28695c).d());
        }

        @Override // androidx.content.preferences.protobuf.q2
        public int e() {
            return ((p2) this.f28695c).e();
        }

        public b e2(Iterable<? extends a3> iterable) {
            W1();
            ((p2) this.f28695c).i3(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public a3 f(int i4) {
            return ((p2) this.f28695c).f(i4);
        }

        public b f2(int i4, a3.b bVar) {
            W1();
            ((p2) this.f28695c).j3(i4, bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public z3 g() {
            return ((p2) this.f28695c).g();
        }

        public b g2(int i4, a3 a3Var) {
            W1();
            ((p2) this.f28695c).k3(i4, a3Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public String getName() {
            return ((p2) this.f28695c).getName();
        }

        public b h2(a3.b bVar) {
            W1();
            ((p2) this.f28695c).l3(bVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public int i() {
            return ((p2) this.f28695c).i();
        }

        @Override // androidx.content.preferences.protobuf.q2
        public boolean i1() {
            return ((p2) this.f28695c).i1();
        }

        public b i2(a3 a3Var) {
            W1();
            ((p2) this.f28695c).m3(a3Var);
            return this;
        }

        public b j2() {
            W1();
            ((p2) this.f28695c).n3();
            return this;
        }

        public b k2() {
            W1();
            ((p2) this.f28695c).o3();
            return this;
        }

        public b l2() {
            W1();
            p2.g3((p2) this.f28695c);
            return this;
        }

        public b m2() {
            W1();
            ((p2) this.f28695c).q3();
            return this;
        }

        public b o2() {
            W1();
            p2.N2((p2) this.f28695c);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public String p0() {
            return ((p2) this.f28695c).p0();
        }

        public b p2() {
            W1();
            ((p2) this.f28695c).s3();
            return this;
        }

        public b r2() {
            W1();
            p2.a3((p2) this.f28695c);
            return this;
        }

        public b s2(int i4) {
            W1();
            ((p2) this.f28695c).P3(i4);
            return this;
        }

        public b t2(String str) {
            W1();
            ((p2) this.f28695c).Q3(str);
            return this;
        }

        public b u2(w wVar) {
            W1();
            ((p2) this.f28695c).R3(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public w v1() {
            return ((p2) this.f28695c).v1();
        }

        public b v2(int i4, a3.b bVar) {
            W1();
            ((p2) this.f28695c).S3(i4, bVar);
            return this;
        }

        public b w2(int i4, a3 a3Var) {
            W1();
            ((p2) this.f28695c).T3(i4, a3Var);
            return this;
        }

        public b x2(boolean z4) {
            W1();
            p2.f3((p2) this.f28695c, z4);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.q2
        public String y0() {
            return ((p2) this.f28695c).y0();
        }

        public b y2(String str) {
            W1();
            ((p2) this.f28695c).V3(str);
            return this;
        }

        public b z2(w wVar) {
            W1();
            ((p2) this.f28695c).W3(wVar);
            return this;
        }

        private b() {
            super(p2.DEFAULT_INSTANCE);
        }
    }

    static {
        p2 p2Var = new p2();
        DEFAULT_INSTANCE = p2Var;
        i1.G2(p2.class, p2Var);
    }

    private p2() {
    }

    public static b B3(p2 p2Var) {
        return DEFAULT_INSTANCE.G1(p2Var);
    }

    public static p2 C3(InputStream inputStream) throws IOException {
        return (p2) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static p2 D3(InputStream inputStream, s0 s0Var) throws IOException {
        return (p2) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static p2 E3(w wVar) throws InvalidProtocolBufferException {
        return (p2) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static p2 F3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (p2) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static p2 G3(z zVar) throws IOException {
        return (p2) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static p2 H3(z zVar, s0 s0Var) throws IOException {
        return (p2) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static p2 I3(InputStream inputStream) throws IOException {
        return (p2) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static p2 J3(InputStream inputStream, s0 s0Var) throws IOException {
        return (p2) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static p2 K3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (p2) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p2 L3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (p2) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    static void M2(p2 p2Var, boolean z4) {
        p2Var.responseStreaming_ = z4;
    }

    public static p2 M3(byte[] bArr) throws InvalidProtocolBufferException {
        return (p2) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    static void N2(p2 p2Var) {
        p2Var.responseStreaming_ = false;
    }

    public static p2 N3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (p2) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<p2> O3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(int i4) {
        u3();
        this.options_.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.name_ = wVar.l0(p1.f28847a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(int i4, a3.b bVar) {
        u3();
        this.options_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(int i4, a3 a3Var) {
        a3Var.getClass();
        u3();
        this.options_.set(i4, a3Var);
    }

    private void U3(boolean z4) {
        this.requestStreaming_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.requestTypeUrl_ = wVar.l0(p1.f28847a);
    }

    private void X3(boolean z4) {
        this.responseStreaming_ = z4;
    }

    static void Y2(p2 p2Var, int i4) {
        p2Var.syntax_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.responseTypeUrl_ = wVar.l0(p1.f28847a);
    }

    static void a3(p2 p2Var) {
        p2Var.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(z3 z3Var) {
        z3Var.getClass();
        this.syntax_ = z3Var.getNumber();
    }

    private void b4(int i4) {
        this.syntax_ = i4;
    }

    static void f3(p2 p2Var, boolean z4) {
        p2Var.requestStreaming_ = z4;
    }

    static void g3(p2 p2Var) {
        p2Var.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(Iterable<? extends a3> iterable) {
        u3();
        a.AbstractC0471a.y1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(int i4, a3.b bVar) {
        u3();
        this.options_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(int i4, a3 a3Var) {
        a3Var.getClass();
        u3();
        this.options_.add(i4, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(a3.b bVar) {
        u3();
        this.options_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(a3 a3Var) {
        a3Var.getClass();
        u3();
        this.options_.add(a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        this.options_ = g3.f();
    }

    private void p3() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        this.requestTypeUrl_ = DEFAULT_INSTANCE.requestTypeUrl_;
    }

    private void r3() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        this.responseTypeUrl_ = DEFAULT_INSTANCE.responseTypeUrl_;
    }

    private void t3() {
        this.syntax_ = 0;
    }

    private void u3() {
        if (this.options_.S1()) {
            return;
        }
        this.options_ = i1.g2(this.options_);
    }

    public static p2 w3() {
        return DEFAULT_INSTANCE;
    }

    public static b z3() {
        return DEFAULT_INSTANCE.F1();
    }

    @Override // androidx.content.preferences.protobuf.q2
    public w E() {
        return w.A(this.requestTypeUrl_);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28865a[iVar.ordinal()]) {
            case 1:
                return new p2();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", a3.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<p2> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (p2.class) {
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

    @Override // androidx.content.preferences.protobuf.q2
    public boolean b0() {
        return this.requestStreaming_;
    }

    @Override // androidx.content.preferences.protobuf.q2
    public w c() {
        return w.A(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.q2
    public List<a3> d() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.q2
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.q2
    public a3 f(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.q2
    public z3 g() {
        z3 forNumber = z3.forNumber(this.syntax_);
        return forNumber == null ? z3.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.q2
    public String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.q2
    public int i() {
        return this.syntax_;
    }

    @Override // androidx.content.preferences.protobuf.q2
    public boolean i1() {
        return this.responseStreaming_;
    }

    @Override // androidx.content.preferences.protobuf.q2
    public String p0() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.content.preferences.protobuf.q2
    public w v1() {
        return w.A(this.responseTypeUrl_);
    }

    public b3 x3(int i4) {
        return this.options_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.q2
    public String y0() {
        return this.responseTypeUrl_;
    }

    public List<? extends b3> y3() {
        return this.options_;
    }
}

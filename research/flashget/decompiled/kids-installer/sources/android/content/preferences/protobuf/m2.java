package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.x2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Method.java */
/* loaded from: classes4.dex */
public final class m2 extends i1<m2, b> implements n2 {
    private static final m2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile z2<m2> PARSER = null;
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
    private o1.k<x2> options_ = d3.g();

    /* compiled from: Method.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7348a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7348a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7348a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7348a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7348a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7348a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7348a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7348a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Method.java */
    public static final class b extends i1.b<m2, b> implements n2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.n2
        public String A() {
            return ((m2) this.f7240p).A();
        }

        public b A2(String str) {
            a2();
            ((m2) this.f7240p).U3(str);
            return this;
        }

        public b B2(w wVar) {
            a2();
            ((m2) this.f7240p).V3(wVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.n2
        public w C1() {
            return ((m2) this.f7240p).C1();
        }

        public b C2(boolean z5) {
            a2();
            m2.N2((m2) this.f7240p, z5);
            return this;
        }

        public b D2(String str) {
            a2();
            ((m2) this.f7240p).X3(str);
            return this;
        }

        @Override // android.content.preferences.protobuf.n2
        public boolean E0() {
            return ((m2) this.f7240p).E0();
        }

        public b E2(w wVar) {
            a2();
            ((m2) this.f7240p).Y3(wVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.n2
        public w F() {
            return ((m2) this.f7240p).F();
        }

        public b F2(w3 w3Var) {
            a2();
            ((m2) this.f7240p).Z3(w3Var);
            return this;
        }

        public b G2(int i5) {
            a2();
            m2.Z2((m2) this.f7240p, i5);
            return this;
        }

        @Override // android.content.preferences.protobuf.n2
        public boolean Y0() {
            return ((m2) this.f7240p).Y0();
        }

        @Override // android.content.preferences.protobuf.n2
        public w a() {
            return ((m2) this.f7240p).a();
        }

        @Override // android.content.preferences.protobuf.n2
        public int b() {
            return ((m2) this.f7240p).b();
        }

        @Override // android.content.preferences.protobuf.n2
        public List<x2> c() {
            return Collections.unmodifiableList(((m2) this.f7240p).c());
        }

        @Override // android.content.preferences.protobuf.n2
        public x2 d(int i5) {
            return ((m2) this.f7240p).d(i5);
        }

        @Override // android.content.preferences.protobuf.n2
        public w3 e() {
            return ((m2) this.f7240p).e();
        }

        @Override // android.content.preferences.protobuf.n2
        public String e1() {
            return ((m2) this.f7240p).e1();
        }

        @Override // android.content.preferences.protobuf.n2
        public int f() {
            return ((m2) this.f7240p).f();
        }

        @Override // android.content.preferences.protobuf.n2
        public String getName() {
            return ((m2) this.f7240p).getName();
        }

        public b i2(Iterable<? extends x2> iterable) {
            a2();
            ((m2) this.f7240p).j3(iterable);
            return this;
        }

        public b j2(int i5, x2.b bVar) {
            a2();
            ((m2) this.f7240p).k3(i5, bVar);
            return this;
        }

        public b k2(int i5, x2 x2Var) {
            a2();
            ((m2) this.f7240p).l3(i5, x2Var);
            return this;
        }

        public b l2(x2.b bVar) {
            a2();
            ((m2) this.f7240p).m3(bVar);
            return this;
        }

        public b m2(x2 x2Var) {
            a2();
            ((m2) this.f7240p).n3(x2Var);
            return this;
        }

        public b n2() {
            a2();
            ((m2) this.f7240p).o3();
            return this;
        }

        public b o2() {
            a2();
            ((m2) this.f7240p).p3();
            return this;
        }

        public b p2() {
            a2();
            m2.h3((m2) this.f7240p);
            return this;
        }

        public b q2() {
            a2();
            ((m2) this.f7240p).r3();
            return this;
        }

        public b r2() {
            a2();
            m2.O2((m2) this.f7240p);
            return this;
        }

        public b s2() {
            a2();
            ((m2) this.f7240p).t3();
            return this;
        }

        public b t2() {
            a2();
            m2.b3((m2) this.f7240p);
            return this;
        }

        public b u2(int i5) {
            a2();
            ((m2) this.f7240p).O3(i5);
            return this;
        }

        public b v2(String str) {
            a2();
            ((m2) this.f7240p).P3(str);
            return this;
        }

        public b w2(w wVar) {
            a2();
            ((m2) this.f7240p).Q3(wVar);
            return this;
        }

        public b x2(int i5, x2.b bVar) {
            a2();
            ((m2) this.f7240p).R3(i5, bVar);
            return this;
        }

        public b y2(int i5, x2 x2Var) {
            a2();
            ((m2) this.f7240p).S3(i5, x2Var);
            return this;
        }

        public b z2(boolean z5) {
            a2();
            m2.g3((m2) this.f7240p, z5);
            return this;
        }

        private b() {
            super(m2.DEFAULT_INSTANCE);
        }
    }

    static {
        m2 m2Var = new m2();
        DEFAULT_INSTANCE = m2Var;
        i1.H2(m2.class, m2Var);
    }

    private m2() {
    }

    public static b A3(m2 m2Var) {
        return DEFAULT_INSTANCE.K1(m2Var);
    }

    public static m2 B3(InputStream inputStream) throws IOException {
        return (m2) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static m2 C3(InputStream inputStream, s0 s0Var) throws IOException {
        return (m2) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static m2 D3(w wVar) throws InvalidProtocolBufferException {
        return (m2) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static m2 E3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (m2) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static m2 F3(z zVar) throws IOException {
        return (m2) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static m2 G3(z zVar, s0 s0Var) throws IOException {
        return (m2) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static m2 H3(InputStream inputStream) throws IOException {
        return (m2) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static m2 I3(InputStream inputStream, s0 s0Var) throws IOException {
        return (m2) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static m2 J3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (m2) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 K3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (m2) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static m2 L3(byte[] bArr) throws InvalidProtocolBufferException {
        return (m2) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static m2 M3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (m2) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    static void N2(m2 m2Var, boolean z5) {
        m2Var.responseStreaming_ = z5;
    }

    public static z2<m2> N3() {
        return DEFAULT_INSTANCE.z();
    }

    static void O2(m2 m2Var) {
        m2Var.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(int i5) {
        v3();
        this.options_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.name_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(int i5, x2.b bVar) {
        v3();
        this.options_.set(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(int i5, x2 x2Var) {
        x2Var.getClass();
        v3();
        this.options_.set(i5, x2Var);
    }

    private void T3(boolean z5) {
        this.requestStreaming_ = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.requestTypeUrl_ = wVar.p0();
    }

    private void W3(boolean z5) {
        this.responseStreaming_ = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.responseTypeUrl_ = wVar.p0();
    }

    static void Z2(m2 m2Var, int i5) {
        m2Var.syntax_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(w3 w3Var) {
        w3Var.getClass();
        this.syntax_ = w3Var.getNumber();
    }

    private void a4(int i5) {
        this.syntax_ = i5;
    }

    static void b3(m2 m2Var) {
        m2Var.syntax_ = 0;
    }

    static void g3(m2 m2Var, boolean z5) {
        m2Var.requestStreaming_ = z5;
    }

    static void h3(m2 m2Var) {
        m2Var.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(Iterable<? extends x2> iterable) {
        v3();
        a.AbstractC0082a.F1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(int i5, x2.b bVar) {
        v3();
        this.options_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(int i5, x2 x2Var) {
        x2Var.getClass();
        v3();
        this.options_.add(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(x2.b bVar) {
        v3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3(x2 x2Var) {
        x2Var.getClass();
        v3();
        this.options_.add(x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3() {
        this.options_ = d3.g();
    }

    private void q3() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.requestTypeUrl_ = DEFAULT_INSTANCE.requestTypeUrl_;
    }

    private void s3() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3() {
        this.responseTypeUrl_ = DEFAULT_INSTANCE.responseTypeUrl_;
    }

    private void u3() {
        this.syntax_ = 0;
    }

    private void v3() {
        if (this.options_.m1()) {
            return;
        }
        this.options_ = i1.j2(this.options_);
    }

    public static m2 w3() {
        return DEFAULT_INSTANCE;
    }

    public static b z3() {
        return DEFAULT_INSTANCE.J1();
    }

    @Override // android.content.preferences.protobuf.n2
    public String A() {
        return this.responseTypeUrl_;
    }

    @Override // android.content.preferences.protobuf.n2
    public w C1() {
        return w.z(this.responseTypeUrl_);
    }

    @Override // android.content.preferences.protobuf.n2
    public boolean E0() {
        return this.requestStreaming_;
    }

    @Override // android.content.preferences.protobuf.n2
    public w F() {
        return w.z(this.requestTypeUrl_);
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7348a[iVar.ordinal()]) {
            case 1:
                return new m2();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", x2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<m2> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (m2.class) {
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

    @Override // android.content.preferences.protobuf.n2
    public boolean Y0() {
        return this.responseStreaming_;
    }

    @Override // android.content.preferences.protobuf.n2
    public w a() {
        return w.z(this.name_);
    }

    @Override // android.content.preferences.protobuf.n2
    public int b() {
        return this.options_.size();
    }

    @Override // android.content.preferences.protobuf.n2
    public List<x2> c() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.n2
    public x2 d(int i5) {
        return this.options_.get(i5);
    }

    @Override // android.content.preferences.protobuf.n2
    public w3 e() {
        w3 forNumber = w3.forNumber(this.syntax_);
        return forNumber == null ? w3.UNRECOGNIZED : forNumber;
    }

    @Override // android.content.preferences.protobuf.n2
    public String e1() {
        return this.requestTypeUrl_;
    }

    @Override // android.content.preferences.protobuf.n2
    public int f() {
        return this.syntax_;
    }

    @Override // android.content.preferences.protobuf.n2
    public String getName() {
        return this.name_;
    }

    public y2 x3(int i5) {
        return this.options_.get(i5);
    }

    public List<? extends y2> y3() {
        return this.options_;
    }
}

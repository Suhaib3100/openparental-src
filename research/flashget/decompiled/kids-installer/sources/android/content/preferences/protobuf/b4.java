package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.n3;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.w0;
import android.content.preferences.protobuf.x2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: Type.java */
/* loaded from: classes4.dex */
public final class b4 extends i1<b4, b> implements c4 {
    private static final b4 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile z2<b4> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private n3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private o1.k<w0> fields_ = d3.g();
    private o1.k<String> oneofs_ = d3.g();
    private o1.k<x2> options_ = d3.g();

    /* compiled from: Type.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7186a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7186a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7186a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7186a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7186a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7186a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7186a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7186a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Type.java */
    public static final class b extends i1.b<b4, b> implements c4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2() {
            a2();
            b4.k3((b4) this.f7240p);
            return this;
        }

        public b B2(n3 n3Var) {
            a2();
            ((b4) this.f7240p).S3(n3Var);
            return this;
        }

        @Override // android.content.preferences.protobuf.c4
        public List<String> C() {
            return Collections.unmodifiableList(((b4) this.f7240p).C());
        }

        public b C2(int i5) {
            a2();
            ((b4) this.f7240p).i4(i5);
            return this;
        }

        public b D2(int i5) {
            a2();
            ((b4) this.f7240p).j4(i5);
            return this;
        }

        public b E2(int i5, w0.b bVar) {
            a2();
            ((b4) this.f7240p).k4(i5, bVar);
            return this;
        }

        public b F2(int i5, w0 w0Var) {
            a2();
            ((b4) this.f7240p).l4(i5, w0Var);
            return this;
        }

        public b G2(String str) {
            a2();
            ((b4) this.f7240p).m4(str);
            return this;
        }

        public b H2(w wVar) {
            a2();
            ((b4) this.f7240p).n4(wVar);
            return this;
        }

        public b I2(int i5, String str) {
            a2();
            ((b4) this.f7240p).o4(i5, str);
            return this;
        }

        public b J2(int i5, x2.b bVar) {
            a2();
            ((b4) this.f7240p).p4(i5, bVar);
            return this;
        }

        public b K2(int i5, x2 x2Var) {
            a2();
            ((b4) this.f7240p).q4(i5, x2Var);
            return this;
        }

        public b L2(n3.b bVar) {
            a2();
            ((b4) this.f7240p).r4(bVar);
            return this;
        }

        public b M2(n3 n3Var) {
            a2();
            ((b4) this.f7240p).s4(n3Var);
            return this;
        }

        public b N2(w3 w3Var) {
            a2();
            ((b4) this.f7240p).t4(w3Var);
            return this;
        }

        public b O2(int i5) {
            a2();
            b4.i3((b4) this.f7240p, i5);
            return this;
        }

        @Override // android.content.preferences.protobuf.c4
        public w P0(int i5) {
            return ((b4) this.f7240p).P0(i5);
        }

        @Override // android.content.preferences.protobuf.c4
        public w0 Y(int i5) {
            return ((b4) this.f7240p).Y(i5);
        }

        @Override // android.content.preferences.protobuf.c4
        public int Z0() {
            return ((b4) this.f7240p).Z0();
        }

        @Override // android.content.preferences.protobuf.c4
        public w a() {
            return ((b4) this.f7240p).a();
        }

        @Override // android.content.preferences.protobuf.c4
        public int b() {
            return ((b4) this.f7240p).b();
        }

        @Override // android.content.preferences.protobuf.c4
        public List<x2> c() {
            return Collections.unmodifiableList(((b4) this.f7240p).c());
        }

        @Override // android.content.preferences.protobuf.c4
        public x2 d(int i5) {
            return ((b4) this.f7240p).d(i5);
        }

        @Override // android.content.preferences.protobuf.c4
        public w3 e() {
            return ((b4) this.f7240p).e();
        }

        @Override // android.content.preferences.protobuf.c4
        public int f() {
            return ((b4) this.f7240p).f();
        }

        @Override // android.content.preferences.protobuf.c4
        public List<w0> g0() {
            return Collections.unmodifiableList(((b4) this.f7240p).g0());
        }

        @Override // android.content.preferences.protobuf.c4
        public String getName() {
            return ((b4) this.f7240p).getName();
        }

        @Override // android.content.preferences.protobuf.c4
        public n3 i() {
            return ((b4) this.f7240p).i();
        }

        public b i2(Iterable<? extends w0> iterable) {
            a2();
            ((b4) this.f7240p).r3(iterable);
            return this;
        }

        public b j2(Iterable<String> iterable) {
            a2();
            ((b4) this.f7240p).s3(iterable);
            return this;
        }

        @Override // android.content.preferences.protobuf.c4
        public boolean k() {
            return ((b4) this.f7240p).k();
        }

        public b k2(Iterable<? extends x2> iterable) {
            a2();
            ((b4) this.f7240p).t3(iterable);
            return this;
        }

        public b l2(int i5, w0.b bVar) {
            a2();
            ((b4) this.f7240p).u3(i5, bVar);
            return this;
        }

        public b m2(int i5, w0 w0Var) {
            a2();
            ((b4) this.f7240p).v3(i5, w0Var);
            return this;
        }

        public b n2(w0.b bVar) {
            a2();
            ((b4) this.f7240p).w3(bVar);
            return this;
        }

        public b o2(w0 w0Var) {
            a2();
            ((b4) this.f7240p).x3(w0Var);
            return this;
        }

        public b p2(String str) {
            a2();
            ((b4) this.f7240p).y3(str);
            return this;
        }

        @Override // android.content.preferences.protobuf.c4
        public int q() {
            return ((b4) this.f7240p).q();
        }

        public b q2(w wVar) {
            a2();
            ((b4) this.f7240p).z3(wVar);
            return this;
        }

        public b r2(int i5, x2.b bVar) {
            a2();
            ((b4) this.f7240p).A3(i5, bVar);
            return this;
        }

        public b s2(int i5, x2 x2Var) {
            a2();
            ((b4) this.f7240p).B3(i5, x2Var);
            return this;
        }

        @Override // android.content.preferences.protobuf.c4
        public String t0(int i5) {
            return ((b4) this.f7240p).t0(i5);
        }

        public b t2(x2.b bVar) {
            a2();
            ((b4) this.f7240p).C3(bVar);
            return this;
        }

        public b u2(x2 x2Var) {
            a2();
            ((b4) this.f7240p).D3(x2Var);
            return this;
        }

        public b v2() {
            a2();
            ((b4) this.f7240p).E3();
            return this;
        }

        public b w2() {
            a2();
            ((b4) this.f7240p).F3();
            return this;
        }

        public b x2() {
            a2();
            ((b4) this.f7240p).G3();
            return this;
        }

        public b y2() {
            a2();
            ((b4) this.f7240p).H3();
            return this;
        }

        public b z2() {
            a2();
            b4.h3((b4) this.f7240p);
            return this;
        }

        private b() {
            super(b4.DEFAULT_INSTANCE);
        }
    }

    static {
        b4 b4Var = new b4();
        DEFAULT_INSTANCE = b4Var;
        i1.H2(b4.class, b4Var);
    }

    private b4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(int i5, x2.b bVar) {
        M3();
        this.options_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(int i5, x2 x2Var) {
        x2Var.getClass();
        M3();
        this.options_.add(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(x2.b bVar) {
        M3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(x2 x2Var) {
        x2Var.getClass();
        M3();
        this.options_.add(x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3() {
        this.fields_ = d3.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3() {
        this.oneofs_ = d3.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3() {
        this.options_ = d3.g();
    }

    private void I3() {
        this.sourceContext_ = null;
    }

    private void J3() {
        this.syntax_ = 0;
    }

    private void K3() {
        if (this.fields_.m1()) {
            return;
        }
        this.fields_ = i1.j2(this.fields_);
    }

    private void L3() {
        if (this.oneofs_.m1()) {
            return;
        }
        this.oneofs_ = i1.j2(this.oneofs_);
    }

    private void M3() {
        if (this.options_.m1()) {
            return;
        }
        this.options_ = i1.j2(this.options_);
    }

    public static b4 N3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(n3 n3Var) {
        n3Var.getClass();
        n3 n3Var2 = this.sourceContext_;
        if (n3Var2 == null || n3Var2 == n3.O2()) {
            this.sourceContext_ = n3Var;
        } else {
            this.sourceContext_ = n3.Q2(this.sourceContext_).e2(n3Var).N0();
        }
    }

    public static b T3() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b U3(b4 b4Var) {
        return DEFAULT_INSTANCE.K1(b4Var);
    }

    public static b4 V3(InputStream inputStream) throws IOException {
        return (b4) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static b4 W3(InputStream inputStream, s0 s0Var) throws IOException {
        return (b4) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static b4 X3(w wVar) throws InvalidProtocolBufferException {
        return (b4) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static b4 Y3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (b4) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static b4 Z3(z zVar) throws IOException {
        return (b4) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static b4 a4(z zVar, s0 s0Var) throws IOException {
        return (b4) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static b4 b4(InputStream inputStream) throws IOException {
        return (b4) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static b4 c4(InputStream inputStream, s0 s0Var) throws IOException {
        return (b4) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static b4 d4(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (b4) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b4 e4(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (b4) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static b4 f4(byte[] bArr) throws InvalidProtocolBufferException {
        return (b4) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static b4 g4(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (b4) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    static void h3(b4 b4Var) {
        b4Var.sourceContext_ = null;
    }

    public static z2<b4> h4() {
        return DEFAULT_INSTANCE.z();
    }

    static void i3(b4 b4Var, int i5) {
        b4Var.syntax_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(int i5) {
        K3();
        this.fields_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(int i5) {
        M3();
        this.options_.remove(i5);
    }

    static void k3(b4 b4Var) {
        b4Var.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k4(int i5, w0.b bVar) {
        K3();
        this.fields_.set(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l4(int i5, w0 w0Var) {
        w0Var.getClass();
        K3();
        this.fields_.set(i5, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n4(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.name_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4(int i5, String str) {
        str.getClass();
        L3();
        this.oneofs_.set(i5, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(int i5, x2.b bVar) {
        M3();
        this.options_.set(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q4(int i5, x2 x2Var) {
        x2Var.getClass();
        M3();
        this.options_.set(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(Iterable<? extends w0> iterable) {
        K3();
        a.AbstractC0082a.F1(iterable, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r4(n3.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(Iterable<String> iterable) {
        L3();
        a.AbstractC0082a.F1(iterable, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s4(n3 n3Var) {
        n3Var.getClass();
        this.sourceContext_ = n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(Iterable<? extends x2> iterable) {
        M3();
        a.AbstractC0082a.F1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t4(w3 w3Var) {
        w3Var.getClass();
        this.syntax_ = w3Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(int i5, w0.b bVar) {
        K3();
        this.fields_.add(i5, bVar.build());
    }

    private void u4(int i5) {
        this.syntax_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(int i5, w0 w0Var) {
        w0Var.getClass();
        K3();
        this.fields_.add(i5, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(w0.b bVar) {
        K3();
        this.fields_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(w0 w0Var) {
        w0Var.getClass();
        K3();
        this.fields_.add(w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        str.getClass();
        L3();
        this.oneofs_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        L3();
        this.oneofs_.add(wVar.p0());
    }

    @Override // android.content.preferences.protobuf.c4
    public List<String> C() {
        return this.oneofs_;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7186a[iVar.ordinal()]) {
            case 1:
                return new b4();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", w0.class, "oneofs_", "options_", x2.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<b4> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (b4.class) {
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

    public b1 O3(int i5) {
        return this.fields_.get(i5);
    }

    @Override // android.content.preferences.protobuf.c4
    public w P0(int i5) {
        return w.z(this.oneofs_.get(i5));
    }

    public List<? extends b1> P3() {
        return this.fields_;
    }

    public y2 Q3(int i5) {
        return this.options_.get(i5);
    }

    public List<? extends y2> R3() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.c4
    public w0 Y(int i5) {
        return this.fields_.get(i5);
    }

    @Override // android.content.preferences.protobuf.c4
    public int Z0() {
        return this.oneofs_.size();
    }

    @Override // android.content.preferences.protobuf.c4
    public w a() {
        return w.z(this.name_);
    }

    @Override // android.content.preferences.protobuf.c4
    public int b() {
        return this.options_.size();
    }

    @Override // android.content.preferences.protobuf.c4
    public List<x2> c() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.c4
    public x2 d(int i5) {
        return this.options_.get(i5);
    }

    @Override // android.content.preferences.protobuf.c4
    public w3 e() {
        w3 forNumber = w3.forNumber(this.syntax_);
        return forNumber == null ? w3.UNRECOGNIZED : forNumber;
    }

    @Override // android.content.preferences.protobuf.c4
    public int f() {
        return this.syntax_;
    }

    @Override // android.content.preferences.protobuf.c4
    public List<w0> g0() {
        return this.fields_;
    }

    @Override // android.content.preferences.protobuf.c4
    public String getName() {
        return this.name_;
    }

    @Override // android.content.preferences.protobuf.c4
    public n3 i() {
        n3 n3Var = this.sourceContext_;
        return n3Var == null ? n3.O2() : n3Var;
    }

    @Override // android.content.preferences.protobuf.c4
    public boolean k() {
        return this.sourceContext_ != null;
    }

    @Override // android.content.preferences.protobuf.c4
    public int q() {
        return this.fields_.size();
    }

    @Override // android.content.preferences.protobuf.c4
    public String t0(int i5) {
        return this.oneofs_.get(i5);
    }
}

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

/* compiled from: EnumValue.java */
/* loaded from: classes4.dex */
public final class n0 extends i1<n0, b> implements o0 {
    private static final n0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile z2<n0> PARSER;
    private int number_;
    private String name_ = "";
    private o1.k<x2> options_ = d3.g();

    /* compiled from: EnumValue.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7427a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7427a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7427a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7427a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7427a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7427a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7427a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7427a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: EnumValue.java */
    public static final class b extends i1.b<n0, b> implements o0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.o0
        public w a() {
            return ((n0) this.f7240p).a();
        }

        @Override // android.content.preferences.protobuf.o0
        public int b() {
            return ((n0) this.f7240p).b();
        }

        @Override // android.content.preferences.protobuf.o0
        public List<x2> c() {
            return Collections.unmodifiableList(((n0) this.f7240p).c());
        }

        @Override // android.content.preferences.protobuf.o0
        public x2 d(int i5) {
            return ((n0) this.f7240p).d(i5);
        }

        @Override // android.content.preferences.protobuf.o0
        public String getName() {
            return ((n0) this.f7240p).getName();
        }

        @Override // android.content.preferences.protobuf.o0
        public int getNumber() {
            return ((n0) this.f7240p).getNumber();
        }

        public b i2(Iterable<? extends x2> iterable) {
            a2();
            ((n0) this.f7240p).Y2(iterable);
            return this;
        }

        public b j2(int i5, x2.b bVar) {
            a2();
            ((n0) this.f7240p).Z2(i5, bVar);
            return this;
        }

        public b k2(int i5, x2 x2Var) {
            a2();
            ((n0) this.f7240p).a3(i5, x2Var);
            return this;
        }

        public b l2(x2.b bVar) {
            a2();
            ((n0) this.f7240p).b3(bVar);
            return this;
        }

        public b m2(x2 x2Var) {
            a2();
            ((n0) this.f7240p).c3(x2Var);
            return this;
        }

        public b n2() {
            a2();
            ((n0) this.f7240p).d3();
            return this;
        }

        public b o2() {
            a2();
            n0.T2((n0) this.f7240p);
            return this;
        }

        public b p2() {
            a2();
            ((n0) this.f7240p).f3();
            return this;
        }

        public b q2(int i5) {
            a2();
            ((n0) this.f7240p).z3(i5);
            return this;
        }

        public b r2(String str) {
            a2();
            ((n0) this.f7240p).A3(str);
            return this;
        }

        public b s2(w wVar) {
            a2();
            ((n0) this.f7240p).B3(wVar);
            return this;
        }

        public b t2(int i5) {
            a2();
            n0.S2((n0) this.f7240p, i5);
            return this;
        }

        public b u2(int i5, x2.b bVar) {
            a2();
            ((n0) this.f7240p).D3(i5, bVar);
            return this;
        }

        public b v2(int i5, x2 x2Var) {
            a2();
            ((n0) this.f7240p).E3(i5, x2Var);
            return this;
        }

        private b() {
            super(n0.DEFAULT_INSTANCE);
        }
    }

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        i1.H2(n0.class, n0Var);
    }

    private n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.name_ = wVar.p0();
    }

    private void C3(int i5) {
        this.number_ = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(int i5, x2.b bVar) {
        g3();
        this.options_.set(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(int i5, x2 x2Var) {
        x2Var.getClass();
        g3();
        this.options_.set(i5, x2Var);
    }

    static void S2(n0 n0Var, int i5) {
        n0Var.number_ = i5;
    }

    static void T2(n0 n0Var) {
        n0Var.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2(Iterable<? extends x2> iterable) {
        g3();
        a.AbstractC0082a.F1(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2(int i5, x2.b bVar) {
        g3();
        this.options_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(int i5, x2 x2Var) {
        x2Var.getClass();
        g3();
        this.options_.add(i5, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3(x2.b bVar) {
        g3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(x2 x2Var) {
        x2Var.getClass();
        g3();
        this.options_.add(x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    private void e3() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        this.options_ = d3.g();
    }

    private void g3() {
        if (this.options_.m1()) {
            return;
        }
        this.options_ = i1.j2(this.options_);
    }

    public static n0 h3() {
        return DEFAULT_INSTANCE;
    }

    public static b k3() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b l3(n0 n0Var) {
        return DEFAULT_INSTANCE.K1(n0Var);
    }

    public static n0 m3(InputStream inputStream) throws IOException {
        return (n0) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static n0 n3(InputStream inputStream, s0 s0Var) throws IOException {
        return (n0) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static n0 o3(w wVar) throws InvalidProtocolBufferException {
        return (n0) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static n0 p3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (n0) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static n0 q3(z zVar) throws IOException {
        return (n0) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static n0 r3(z zVar, s0 s0Var) throws IOException {
        return (n0) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static n0 s3(InputStream inputStream) throws IOException {
        return (n0) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static n0 t3(InputStream inputStream, s0 s0Var) throws IOException {
        return (n0) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static n0 u3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (n0) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n0 v3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (n0) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static n0 w3(byte[] bArr) throws InvalidProtocolBufferException {
        return (n0) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static n0 x3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (n0) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<n0> y3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(int i5) {
        g3();
        this.options_.remove(i5);
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7427a[iVar.ordinal()]) {
            case 1:
                return new n0();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", x2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<n0> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (n0.class) {
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

    @Override // android.content.preferences.protobuf.o0
    public w a() {
        return w.z(this.name_);
    }

    @Override // android.content.preferences.protobuf.o0
    public int b() {
        return this.options_.size();
    }

    @Override // android.content.preferences.protobuf.o0
    public List<x2> c() {
        return this.options_;
    }

    @Override // android.content.preferences.protobuf.o0
    public x2 d(int i5) {
        return this.options_.get(i5);
    }

    @Override // android.content.preferences.protobuf.o0
    public String getName() {
        return this.name_;
    }

    @Override // android.content.preferences.protobuf.o0
    public int getNumber() {
        return this.number_;
    }

    public y2 i3(int i5) {
        return this.options_.get(i5);
    }

    public List<? extends y2> j3() {
        return this.options_;
    }
}

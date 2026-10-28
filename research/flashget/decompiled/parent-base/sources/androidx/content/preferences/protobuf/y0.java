package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.p1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: FieldMask.java */
/* loaded from: classes3.dex */
public final class y0 extends i1<y0, b> implements z0 {
    private static final y0 DEFAULT_INSTANCE;
    private static volatile c3<y0> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private p1.k<String> paths_ = g3.f();

    /* compiled from: FieldMask.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29058a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f29058a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29058a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29058a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29058a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29058a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29058a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29058a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: FieldMask.java */
    public static final class b extends i1.b<y0, b> implements z0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.z0
        public List<String> S() {
            return Collections.unmodifiableList(((y0) this.f28695c).S());
        }

        @Override // androidx.content.preferences.protobuf.z0
        public int W() {
            return ((y0) this.f28695c).W();
        }

        @Override // androidx.content.preferences.protobuf.z0
        public w c0(int i4) {
            return ((y0) this.f28695c).c0(i4);
        }

        public b e2(Iterable<String> iterable) {
            W1();
            ((y0) this.f28695c).O2(iterable);
            return this;
        }

        public b f2(String str) {
            W1();
            ((y0) this.f28695c).P2(str);
            return this;
        }

        public b g2(w wVar) {
            W1();
            ((y0) this.f28695c).Q2(wVar);
            return this;
        }

        public b h2() {
            W1();
            ((y0) this.f28695c).R2();
            return this;
        }

        public b i2(int i4, String str) {
            W1();
            ((y0) this.f28695c).j3(i4, str);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.z0
        public String q1(int i4) {
            return ((y0) this.f28695c).q1(i4);
        }

        private b() {
            super(y0.DEFAULT_INSTANCE);
        }
    }

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        i1.G2(y0.class, y0Var);
    }

    private y0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2(Iterable<String> iterable) {
        S2();
        a.AbstractC0471a.y1(iterable, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2(String str) {
        str.getClass();
        S2();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        S2();
        this.paths_.add(wVar.l0(p1.f28847a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2() {
        this.paths_ = g3.f();
    }

    private void S2() {
        if (this.paths_.S1()) {
            return;
        }
        this.paths_ = i1.g2(this.paths_);
    }

    public static y0 T2() {
        return DEFAULT_INSTANCE;
    }

    public static b U2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b V2(y0 y0Var) {
        return DEFAULT_INSTANCE.G1(y0Var);
    }

    public static y0 W2(InputStream inputStream) throws IOException {
        return (y0) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static y0 X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (y0) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static y0 Y2(w wVar) throws InvalidProtocolBufferException {
        return (y0) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static y0 Z2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (y0) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static y0 a3(z zVar) throws IOException {
        return (y0) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static y0 b3(z zVar, s0 s0Var) throws IOException {
        return (y0) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static y0 c3(InputStream inputStream) throws IOException {
        return (y0) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static y0 d3(InputStream inputStream, s0 s0Var) throws IOException {
        return (y0) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static y0 e3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (y0) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y0 f3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (y0) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static y0 g3(byte[] bArr) throws InvalidProtocolBufferException {
        return (y0) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static y0 h3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (y0) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<y0> i3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(int i4, String str) {
        str.getClass();
        S2();
        this.paths_.set(i4, str);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f29058a[iVar.ordinal()]) {
            case 1:
                return new y0();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<y0> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (y0.class) {
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

    @Override // androidx.content.preferences.protobuf.z0
    public List<String> S() {
        return this.paths_;
    }

    @Override // androidx.content.preferences.protobuf.z0
    public int W() {
        return this.paths_.size();
    }

    @Override // androidx.content.preferences.protobuf.z0
    public w c0(int i4) {
        return w.A(this.paths_.get(i4));
    }

    @Override // androidx.content.preferences.protobuf.z0
    public String q1(int i4) {
        return this.paths_.get(i4);
    }
}

package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.r4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: ListValue.java */
/* loaded from: classes3.dex */
public final class x1 extends i1<x1, b> implements y1 {
    private static final x1 DEFAULT_INSTANCE;
    private static volatile c3<x1> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private p1.k<r4> values_ = g3.f();

    /* compiled from: ListValue.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29054a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f29054a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29054a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29054a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29054a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29054a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29054a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29054a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ListValue.java */
    public static final class b extends i1.b<x1, b> implements y1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2(Iterable<? extends r4> iterable) {
            W1();
            ((x1) this.f28695c).S2(iterable);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.y1
        public List<r4> f1() {
            return Collections.unmodifiableList(((x1) this.f28695c).f1());
        }

        public b f2(int i4, r4.b bVar) {
            W1();
            ((x1) this.f28695c).T2(i4, bVar);
            return this;
        }

        public b g2(int i4, r4 r4Var) {
            W1();
            ((x1) this.f28695c).U2(i4, r4Var);
            return this;
        }

        public b h2(r4.b bVar) {
            W1();
            ((x1) this.f28695c).V2(bVar);
            return this;
        }

        public b i2(r4 r4Var) {
            W1();
            ((x1) this.f28695c).W2(r4Var);
            return this;
        }

        public b j2() {
            W1();
            ((x1) this.f28695c).X2();
            return this;
        }

        public b k2(int i4) {
            W1();
            ((x1) this.f28695c).r3(i4);
            return this;
        }

        public b l2(int i4, r4.b bVar) {
            W1();
            ((x1) this.f28695c).s3(i4, bVar);
            return this;
        }

        public b m2(int i4, r4 r4Var) {
            W1();
            ((x1) this.f28695c).t3(i4, r4Var);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.y1
        public r4 p1(int i4) {
            return ((x1) this.f28695c).p1(i4);
        }

        @Override // androidx.content.preferences.protobuf.y1
        public int v0() {
            return ((x1) this.f28695c).v0();
        }

        private b() {
            super(x1.DEFAULT_INSTANCE);
        }
    }

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        i1.G2(x1.class, x1Var);
    }

    private x1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2(Iterable<? extends r4> iterable) {
        Y2();
        a.AbstractC0471a.y1(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2(int i4, r4.b bVar) {
        Y2();
        this.values_.add(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2(int i4, r4 r4Var) {
        r4Var.getClass();
        Y2();
        this.values_.add(i4, r4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V2(r4.b bVar) {
        Y2();
        this.values_.add(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W2(r4 r4Var) {
        r4Var.getClass();
        Y2();
        this.values_.add(r4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X2() {
        this.values_ = g3.f();
    }

    private void Y2() {
        if (this.values_.S1()) {
            return;
        }
        this.values_ = i1.g2(this.values_);
    }

    public static x1 Z2() {
        return DEFAULT_INSTANCE;
    }

    public static b c3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b d3(x1 x1Var) {
        return DEFAULT_INSTANCE.G1(x1Var);
    }

    public static x1 e3(InputStream inputStream) throws IOException {
        return (x1) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static x1 f3(InputStream inputStream, s0 s0Var) throws IOException {
        return (x1) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static x1 g3(w wVar) throws InvalidProtocolBufferException {
        return (x1) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static x1 h3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (x1) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static x1 i3(z zVar) throws IOException {
        return (x1) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static x1 j3(z zVar, s0 s0Var) throws IOException {
        return (x1) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static x1 k3(InputStream inputStream) throws IOException {
        return (x1) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static x1 l3(InputStream inputStream, s0 s0Var) throws IOException {
        return (x1) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static x1 m3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (x1) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x1 n3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (x1) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static x1 o3(byte[] bArr) throws InvalidProtocolBufferException {
        return (x1) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static x1 p3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (x1) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<x1> q3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(int i4) {
        Y2();
        this.values_.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i4, r4.b bVar) {
        Y2();
        this.values_.set(i4, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(int i4, r4 r4Var) {
        r4Var.getClass();
        Y2();
        this.values_.set(i4, r4Var);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f29054a[iVar.ordinal()]) {
            case 1:
                return new x1();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", r4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<x1> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (x1.class) {
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

    public s4 a3(int i4) {
        return this.values_.get(i4);
    }

    public List<? extends s4> b3() {
        return this.values_;
    }

    @Override // androidx.content.preferences.protobuf.y1
    public List<r4> f1() {
        return this.values_;
    }

    @Override // androidx.content.preferences.protobuf.y1
    public r4 p1(int i4) {
        return this.values_.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.y1
    public int v0() {
        return this.values_.size();
    }
}

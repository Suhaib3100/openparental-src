package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.o4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: ListValue.java */
/* loaded from: classes4.dex */
public final class w1 extends i1<w1, b> implements x1 {
    private static final w1 DEFAULT_INSTANCE;
    private static volatile z2<w1> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private o1.k<o4> values_ = d3.g();

    /* compiled from: ListValue.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7576a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7576a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7576a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7576a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7576a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7576a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7576a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7576a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ListValue.java */
    public static final class b extends i1.b<w1, b> implements x1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.x1
        public List<o4> U0() {
            return Collections.unmodifiableList(((w1) this.f7240p).U0());
        }

        public b i2(Iterable<? extends o4> iterable) {
            a2();
            ((w1) this.f7240p).T2(iterable);
            return this;
        }

        public b j2(int i5, o4.b bVar) {
            a2();
            ((w1) this.f7240p).U2(i5, bVar);
            return this;
        }

        public b k2(int i5, o4 o4Var) {
            a2();
            ((w1) this.f7240p).V2(i5, o4Var);
            return this;
        }

        public b l2(o4.b bVar) {
            a2();
            ((w1) this.f7240p).W2(bVar);
            return this;
        }

        public b m2(o4 o4Var) {
            a2();
            ((w1) this.f7240p).X2(o4Var);
            return this;
        }

        public b n2() {
            a2();
            ((w1) this.f7240p).Y2();
            return this;
        }

        public b o2(int i5) {
            a2();
            ((w1) this.f7240p).s3(i5);
            return this;
        }

        @Override // android.content.preferences.protobuf.x1
        public int p1() {
            return ((w1) this.f7240p).p1();
        }

        public b p2(int i5, o4.b bVar) {
            a2();
            ((w1) this.f7240p).t3(i5, bVar);
            return this;
        }

        public b q2(int i5, o4 o4Var) {
            a2();
            ((w1) this.f7240p).u3(i5, o4Var);
            return this;
        }

        @Override // android.content.preferences.protobuf.x1
        public o4 r1(int i5) {
            return ((w1) this.f7240p).r1(i5);
        }

        private b() {
            super(w1.DEFAULT_INSTANCE);
        }
    }

    static {
        w1 w1Var = new w1();
        DEFAULT_INSTANCE = w1Var;
        i1.H2(w1.class, w1Var);
    }

    private w1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2(Iterable<? extends o4> iterable) {
        Z2();
        a.AbstractC0082a.F1(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2(int i5, o4.b bVar) {
        Z2();
        this.values_.add(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V2(int i5, o4 o4Var) {
        o4Var.getClass();
        Z2();
        this.values_.add(i5, o4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W2(o4.b bVar) {
        Z2();
        this.values_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X2(o4 o4Var) {
        o4Var.getClass();
        Z2();
        this.values_.add(o4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2() {
        this.values_ = d3.g();
    }

    private void Z2() {
        if (this.values_.m1()) {
            return;
        }
        this.values_ = i1.j2(this.values_);
    }

    public static w1 a3() {
        return DEFAULT_INSTANCE;
    }

    public static b d3() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b e3(w1 w1Var) {
        return DEFAULT_INSTANCE.K1(w1Var);
    }

    public static w1 f3(InputStream inputStream) throws IOException {
        return (w1) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static w1 g3(InputStream inputStream, s0 s0Var) throws IOException {
        return (w1) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static w1 h3(w wVar) throws InvalidProtocolBufferException {
        return (w1) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static w1 i3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (w1) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static w1 j3(z zVar) throws IOException {
        return (w1) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static w1 k3(z zVar, s0 s0Var) throws IOException {
        return (w1) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static w1 l3(InputStream inputStream) throws IOException {
        return (w1) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static w1 m3(InputStream inputStream, s0 s0Var) throws IOException {
        return (w1) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static w1 n3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (w1) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w1 o3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (w1) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static w1 p3(byte[] bArr) throws InvalidProtocolBufferException {
        return (w1) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static w1 q3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (w1) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<w1> r3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i5) {
        Z2();
        this.values_.remove(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(int i5, o4.b bVar) {
        Z2();
        this.values_.set(i5, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(int i5, o4 o4Var) {
        o4Var.getClass();
        Z2();
        this.values_.set(i5, o4Var);
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7576a[iVar.ordinal()]) {
            case 1:
                return new w1();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", o4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<w1> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (w1.class) {
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

    @Override // android.content.preferences.protobuf.x1
    public List<o4> U0() {
        return this.values_;
    }

    public p4 b3(int i5) {
        return this.values_.get(i5);
    }

    public List<? extends p4> c3() {
        return this.values_;
    }

    @Override // android.content.preferences.protobuf.x1
    public int p1() {
        return this.values_.size();
    }

    @Override // android.content.preferences.protobuf.x1
    public o4 r1(int i5) {
        return this.values_.get(i5);
    }
}

package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.o1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: FieldMask.java */
/* loaded from: classes4.dex */
public final class y0 extends i1<y0, b> implements z0 {
    private static final y0 DEFAULT_INSTANCE;
    private static volatile z2<y0> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private o1.k<String> paths_ = d3.g();

    /* compiled from: FieldMask.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7610a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7610a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7610a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7610a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7610a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7610a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7610a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7610a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: FieldMask.java */
    public static final class b extends i1.b<y0, b> implements z0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.z0
        public w F0(int i5) {
            return ((y0) this.f7240p).F0(i5);
        }

        public b i2(Iterable<String> iterable) {
            a2();
            ((y0) this.f7240p).P2(iterable);
            return this;
        }

        public b j2(String str) {
            a2();
            ((y0) this.f7240p).Q2(str);
            return this;
        }

        public b k2(w wVar) {
            a2();
            ((y0) this.f7240p).R2(wVar);
            return this;
        }

        public b l2() {
            a2();
            ((y0) this.f7240p).S2();
            return this;
        }

        @Override // android.content.preferences.protobuf.z0
        public List<String> m0() {
            return Collections.unmodifiableList(((y0) this.f7240p).m0());
        }

        public b m2(int i5, String str) {
            a2();
            ((y0) this.f7240p).k3(i5, str);
            return this;
        }

        @Override // android.content.preferences.protobuf.z0
        public String t1(int i5) {
            return ((y0) this.f7240p).t1(i5);
        }

        @Override // android.content.preferences.protobuf.z0
        public int x0() {
            return ((y0) this.f7240p).x0();
        }

        private b() {
            super(y0.DEFAULT_INSTANCE);
        }
    }

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        i1.H2(y0.class, y0Var);
    }

    private y0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2(Iterable<String> iterable) {
        T2();
        a.AbstractC0082a.F1(iterable, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2(String str) {
        str.getClass();
        T2();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        T2();
        this.paths_.add(wVar.p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2() {
        this.paths_ = d3.g();
    }

    private void T2() {
        if (this.paths_.m1()) {
            return;
        }
        this.paths_ = i1.j2(this.paths_);
    }

    public static y0 U2() {
        return DEFAULT_INSTANCE;
    }

    public static b V2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b W2(y0 y0Var) {
        return DEFAULT_INSTANCE.K1(y0Var);
    }

    public static y0 X2(InputStream inputStream) throws IOException {
        return (y0) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static y0 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (y0) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static y0 Z2(w wVar) throws InvalidProtocolBufferException {
        return (y0) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static y0 a3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (y0) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static y0 b3(z zVar) throws IOException {
        return (y0) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static y0 c3(z zVar, s0 s0Var) throws IOException {
        return (y0) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static y0 d3(InputStream inputStream) throws IOException {
        return (y0) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static y0 e3(InputStream inputStream, s0 s0Var) throws IOException {
        return (y0) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static y0 f3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (y0) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y0 g3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (y0) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static y0 h3(byte[] bArr) throws InvalidProtocolBufferException {
        return (y0) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static y0 i3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (y0) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<y0> j3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(int i5, String str) {
        str.getClass();
        T2();
        this.paths_.set(i5, str);
    }

    @Override // android.content.preferences.protobuf.z0
    public w F0(int i5) {
        return w.z(this.paths_.get(i5));
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7610a[iVar.ordinal()]) {
            case 1:
                return new y0();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<y0> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (y0.class) {
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

    @Override // android.content.preferences.protobuf.z0
    public List<String> m0() {
        return this.paths_;
    }

    @Override // android.content.preferences.protobuf.z0
    public String t1(int i5) {
        return this.paths_.get(i5);
    }

    @Override // android.content.preferences.protobuf.z0
    public int x0() {
        return this.paths_.size();
    }
}

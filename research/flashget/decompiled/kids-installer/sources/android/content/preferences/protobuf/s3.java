package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.q4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: Struct.java */
/* loaded from: classes4.dex */
public final class s3 extends i1<s3, b> implements t3 {
    private static final s3 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile z2<s3> PARSER;
    private b2<String, o4> fields_ = b2.k();

    /* compiled from: Struct.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7514a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7514a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7514a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7514a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7514a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7514a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7514a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7514a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Struct.java */
    public static final class b extends i1.b<s3, b> implements t3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.t3
        public o4 D1(String str) {
            str.getClass();
            Map<String, o4> n02 = ((s3) this.f7240p).n0();
            if (n02.containsKey(str)) {
                return n02.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // android.content.preferences.protobuf.t3
        public o4 I0(String str, o4 o4Var) {
            str.getClass();
            Map<String, o4> n02 = ((s3) this.f7240p).n0();
            return n02.containsKey(str) ? n02.get(str) : o4Var;
        }

        public b i2() {
            a2();
            s3.K2((s3) this.f7240p).clear();
            return this;
        }

        public b j2(Map<String, o4> map) {
            a2();
            s3.K2((s3) this.f7240p).putAll(map);
            return this;
        }

        public b k2(String str, o4 o4Var) {
            str.getClass();
            o4Var.getClass();
            a2();
            s3.K2((s3) this.f7240p).put(str, o4Var);
            return this;
        }

        public b l2(String str) {
            str.getClass();
            a2();
            s3.K2((s3) this.f7240p).remove(str);
            return this;
        }

        @Override // android.content.preferences.protobuf.t3
        public Map<String, o4> n0() {
            return Collections.unmodifiableMap(((s3) this.f7240p).n0());
        }

        @Override // android.content.preferences.protobuf.t3
        public int q() {
            return ((s3) this.f7240p).n0().size();
        }

        @Override // android.content.preferences.protobuf.t3
        public boolean q0(String str) {
            str.getClass();
            return ((s3) this.f7240p).n0().containsKey(str);
        }

        @Override // android.content.preferences.protobuf.t3
        @Deprecated
        public Map<String, o4> v() {
            return n0();
        }

        private b() {
            super(s3.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Struct.java */
    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final a2<String, o4> f7515a = a2.f(q4.b.STRING, "", q4.b.MESSAGE, o4.k3());

        private c() {
        }
    }

    static {
        s3 s3Var = new s3();
        DEFAULT_INSTANCE = s3Var;
        i1.H2(s3.class, s3Var);
    }

    private s3() {
    }

    static Map K2(s3 s3Var) {
        return s3Var.O2();
    }

    public static s3 L2() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, o4> M2() {
        return O2();
    }

    private b2<String, o4> N2() {
        return this.fields_;
    }

    private b2<String, o4> O2() {
        if (!this.fields_.p()) {
            this.fields_ = this.fields_.u();
        }
        return this.fields_;
    }

    public static b P2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b Q2(s3 s3Var) {
        return DEFAULT_INSTANCE.K1(s3Var);
    }

    public static s3 R2(InputStream inputStream) throws IOException {
        return (s3) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static s3 S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (s3) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static s3 T2(w wVar) throws InvalidProtocolBufferException {
        return (s3) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static s3 U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (s3) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static s3 V2(z zVar) throws IOException {
        return (s3) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static s3 W2(z zVar, s0 s0Var) throws IOException {
        return (s3) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static s3 X2(InputStream inputStream) throws IOException {
        return (s3) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static s3 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (s3) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static s3 Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (s3) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s3 a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (s3) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static s3 b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (s3) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static s3 c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (s3) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<s3> d3() {
        return DEFAULT_INSTANCE.z();
    }

    @Override // android.content.preferences.protobuf.t3
    public o4 D1(String str) {
        str.getClass();
        b2<String, o4> b2Var = this.fields_;
        if (b2Var.containsKey(str)) {
            return b2Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.content.preferences.protobuf.t3
    public o4 I0(String str, o4 o4Var) {
        str.getClass();
        b2<String, o4> b2Var = this.fields_;
        return b2Var.containsKey(str) ? b2Var.get(str) : o4Var;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7514a[iVar.ordinal()]) {
            case 1:
                return new s3();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f7515a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<s3> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (s3.class) {
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

    @Override // android.content.preferences.protobuf.t3
    public Map<String, o4> n0() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override // android.content.preferences.protobuf.t3
    public int q() {
        return this.fields_.size();
    }

    @Override // android.content.preferences.protobuf.t3
    public boolean q0(String str) {
        str.getClass();
        return this.fields_.containsKey(str);
    }

    @Override // android.content.preferences.protobuf.t3
    @Deprecated
    public Map<String, o4> v() {
        return n0();
    }
}

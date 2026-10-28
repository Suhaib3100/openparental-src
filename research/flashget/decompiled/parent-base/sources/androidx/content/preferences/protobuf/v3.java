package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.t4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: Struct.java */
/* loaded from: classes3.dex */
public final class v3 extends i1<v3, b> implements w3 {
    private static final v3 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile c3<v3> PARSER;
    private c2<String, r4> fields_ = c2.i();

    /* compiled from: Struct.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28993a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28993a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28993a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28993a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28993a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28993a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28993a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28993a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Struct.java */
    public static final class b extends i1.b<v3, b> implements w3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.w3
        public Map<String, r4> Q0() {
            return Collections.unmodifiableMap(((v3) this.f28695c).Q0());
        }

        @Override // androidx.content.preferences.protobuf.w3
        public boolean S0(String str) {
            str.getClass();
            return ((v3) this.f28695c).Q0().containsKey(str);
        }

        @Override // androidx.content.preferences.protobuf.w3
        public r4 e0(String str, r4 r4Var) {
            str.getClass();
            Map<String, r4> Q0 = ((v3) this.f28695c).Q0();
            return Q0.containsKey(str) ? Q0.get(str) : r4Var;
        }

        public b e2() {
            W1();
            v3.J2((v3) this.f28695c).clear();
            return this;
        }

        public b f2(Map<String, r4> map) {
            W1();
            v3.J2((v3) this.f28695c).putAll(map);
            return this;
        }

        public b g2(String str, r4 r4Var) {
            str.getClass();
            r4Var.getClass();
            W1();
            v3.J2((v3) this.f28695c).put(str, r4Var);
            return this;
        }

        public b h2(String str) {
            str.getClass();
            W1();
            v3.J2((v3) this.f28695c).remove(str);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.w3
        @Deprecated
        public Map<String, r4> l() {
            return Q0();
        }

        @Override // androidx.content.preferences.protobuf.w3
        public int r() {
            return ((v3) this.f28695c).Q0().size();
        }

        @Override // androidx.content.preferences.protobuf.w3
        public r4 w1(String str) {
            str.getClass();
            Map<String, r4> Q0 = ((v3) this.f28695c).Q0();
            if (Q0.containsKey(str)) {
                return Q0.get(str);
            }
            throw new IllegalArgumentException();
        }

        private b() {
            super(v3.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Struct.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final b2<String, r4> f28994a = b2.f(t4.b.STRING, "", t4.b.MESSAGE, r4.j3());

        private c() {
        }
    }

    static {
        v3 v3Var = new v3();
        DEFAULT_INSTANCE = v3Var;
        i1.G2(v3.class, v3Var);
    }

    private v3() {
    }

    static Map J2(v3 v3Var) {
        return v3Var.N2();
    }

    public static v3 K2() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, r4> L2() {
        return N2();
    }

    private c2<String, r4> M2() {
        return this.fields_;
    }

    private c2<String, r4> N2() {
        if (!this.fields_.n()) {
            this.fields_ = this.fields_.q();
        }
        return this.fields_;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b P2(v3 v3Var) {
        return DEFAULT_INSTANCE.G1(v3Var);
    }

    public static v3 Q2(InputStream inputStream) throws IOException {
        return (v3) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static v3 R2(InputStream inputStream, s0 s0Var) throws IOException {
        return (v3) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static v3 S2(w wVar) throws InvalidProtocolBufferException {
        return (v3) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static v3 T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (v3) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static v3 U2(z zVar) throws IOException {
        return (v3) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static v3 V2(z zVar, s0 s0Var) throws IOException {
        return (v3) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static v3 W2(InputStream inputStream) throws IOException {
        return (v3) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static v3 X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (v3) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static v3 Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (v3) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v3 Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (v3) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static v3 a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (v3) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static v3 b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (v3) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<v3> c3() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28993a[iVar.ordinal()]) {
            case 1:
                return new v3();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f28994a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<v3> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (v3.class) {
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

    @Override // androidx.content.preferences.protobuf.w3
    public Map<String, r4> Q0() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override // androidx.content.preferences.protobuf.w3
    public boolean S0(String str) {
        str.getClass();
        return this.fields_.containsKey(str);
    }

    @Override // androidx.content.preferences.protobuf.w3
    public r4 e0(String str, r4 r4Var) {
        str.getClass();
        c2<String, r4> c2Var = this.fields_;
        return c2Var.containsKey(str) ? c2Var.get(str) : r4Var;
    }

    @Override // androidx.content.preferences.protobuf.w3
    @Deprecated
    public Map<String, r4> l() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override // androidx.content.preferences.protobuf.w3
    public int r() {
        return this.fields_.size();
    }

    @Override // androidx.content.preferences.protobuf.w3
    public r4 w1(String str) {
        str.getClass();
        c2<String, r4> c2Var = this.fields_;
        if (c2Var.containsKey(str)) {
            return c2Var.get(str);
        }
        throw new IllegalArgumentException();
    }
}

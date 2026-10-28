package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: StringValue.java */
/* loaded from: classes3.dex */
public final class t3 extends i1<t3, b> implements u3 {
    private static final t3 DEFAULT_INSTANCE;
    private static volatile c3<t3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* compiled from: StringValue.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28957a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28957a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28957a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28957a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28957a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28957a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28957a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28957a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: StringValue.java */
    public static final class b extends i1.b<t3, b> implements u3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b e2() {
            W1();
            ((t3) this.f28695c).M2();
            return this;
        }

        public b f2(String str) {
            W1();
            ((t3) this.f28695c).e3(str);
            return this;
        }

        public b g2(w wVar) {
            W1();
            ((t3) this.f28695c).f3(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.u3
        public String getValue() {
            return ((t3) this.f28695c).getValue();
        }

        @Override // androidx.content.preferences.protobuf.u3
        public w s1() {
            return ((t3) this.f28695c).s1();
        }

        private b() {
            super(t3.DEFAULT_INSTANCE);
        }
    }

    static {
        t3 t3Var = new t3();
        DEFAULT_INSTANCE = t3Var;
        i1.G2(t3.class, t3Var);
    }

    private t3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        this.value_ = DEFAULT_INSTANCE.value_;
    }

    public static t3 N2() {
        return DEFAULT_INSTANCE;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b P2(t3 t3Var) {
        return DEFAULT_INSTANCE.G1(t3Var);
    }

    public static t3 Q2(String str) {
        return O2().f2(str).a();
    }

    public static t3 R2(InputStream inputStream) throws IOException {
        return (t3) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static t3 S2(InputStream inputStream, s0 s0Var) throws IOException {
        return (t3) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static t3 T2(w wVar) throws InvalidProtocolBufferException {
        return (t3) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static t3 U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (t3) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static t3 V2(z zVar) throws IOException {
        return (t3) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static t3 W2(z zVar, s0 s0Var) throws IOException {
        return (t3) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static t3 X2(InputStream inputStream) throws IOException {
        return (t3) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static t3 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (t3) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static t3 Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (t3) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t3 a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (t3) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static t3 b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (t3) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static t3 c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (t3) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<t3> d3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.value_ = wVar.l0(p1.f28847a);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28957a[iVar.ordinal()]) {
            case 1:
                return new t3();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<t3> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (t3.class) {
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

    @Override // androidx.content.preferences.protobuf.u3
    public String getValue() {
        return this.value_;
    }

    @Override // androidx.content.preferences.protobuf.u3
    public w s1() {
        return w.A(this.value_);
    }
}

package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: SourceContext.java */
/* loaded from: classes3.dex */
public final class q3 extends i1<q3, b> implements r3 {
    private static final q3 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile c3<q3> PARSER;
    private String fileName_ = "";

    /* compiled from: SourceContext.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28924a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28924a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28924a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28924a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28924a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28924a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28924a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28924a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: SourceContext.java */
    public static final class b extends i1.b<q3, b> implements r3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.content.preferences.protobuf.r3
        public w Z0() {
            return ((q3) this.f28695c).Z0();
        }

        public b e2() {
            W1();
            ((q3) this.f28695c).M2();
            return this;
        }

        public b f2(String str) {
            W1();
            ((q3) this.f28695c).d3(str);
            return this;
        }

        public b g2(w wVar) {
            W1();
            ((q3) this.f28695c).e3(wVar);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.r3
        public String u() {
            return ((q3) this.f28695c).u();
        }

        private b() {
            super(q3.DEFAULT_INSTANCE);
        }
    }

    static {
        q3 q3Var = new q3();
        DEFAULT_INSTANCE = q3Var;
        i1.G2(q3.class, q3Var);
    }

    private q3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        this.fileName_ = DEFAULT_INSTANCE.fileName_;
    }

    public static q3 N2() {
        return DEFAULT_INSTANCE;
    }

    public static b O2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b P2(q3 q3Var) {
        return DEFAULT_INSTANCE.G1(q3Var);
    }

    public static q3 Q2(InputStream inputStream) throws IOException {
        return (q3) i1.l2(DEFAULT_INSTANCE, inputStream);
    }

    public static q3 R2(InputStream inputStream, s0 s0Var) throws IOException {
        return (q3) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static q3 S2(w wVar) throws InvalidProtocolBufferException {
        return (q3) i1.n2(DEFAULT_INSTANCE, wVar);
    }

    public static q3 T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (q3) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static q3 U2(z zVar) throws IOException {
        return (q3) i1.p2(DEFAULT_INSTANCE, zVar);
    }

    public static q3 V2(z zVar, s0 s0Var) throws IOException {
        return (q3) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static q3 W2(InputStream inputStream) throws IOException {
        return (q3) i1.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static q3 X2(InputStream inputStream, s0 s0Var) throws IOException {
        return (q3) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static q3 Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (q3) i1.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q3 Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (q3) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static q3 a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (q3) i1.w2(DEFAULT_INSTANCE, bArr);
    }

    public static q3 b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (q3) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static c3<q3> c3() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3(w wVar) {
        wVar.getClass();
        androidx.content.preferences.protobuf.a.x(wVar);
        this.fileName_ = wVar.l0(p1.f28847a);
    }

    @Override // androidx.content.preferences.protobuf.i1
    protected final Object K1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28924a[iVar.ordinal()]) {
            case 1:
                return new q3();
            case 2:
                return new b(aVar);
            case 3:
                return new j3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c3<q3> c3Var = PARSER;
                if (c3Var == null) {
                    synchronized (q3.class) {
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

    @Override // androidx.content.preferences.protobuf.r3
    public w Z0() {
        return w.A(this.fileName_);
    }

    @Override // androidx.content.preferences.protobuf.r3
    public String u() {
        return this.fileName_;
    }
}

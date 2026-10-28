package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: StringValue.java */
/* loaded from: classes4.dex */
public final class q3 extends i1<q3, b> implements r3 {
    private static final q3 DEFAULT_INSTANCE;
    private static volatile z2<q3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* compiled from: StringValue.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7469a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7469a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7469a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7469a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7469a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7469a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7469a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7469a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: StringValue.java */
    public static final class b extends i1.b<q3, b> implements r3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.r3
        public String getValue() {
            return ((q3) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            ((q3) this.f7240p).N2();
            return this;
        }

        public b j2(String str) {
            a2();
            ((q3) this.f7240p).f3(str);
            return this;
        }

        public b k2(w wVar) {
            a2();
            ((q3) this.f7240p).g3(wVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.r3
        public w z1() {
            return ((q3) this.f7240p).z1();
        }

        private b() {
            super(q3.DEFAULT_INSTANCE);
        }
    }

    static {
        q3 q3Var = new q3();
        DEFAULT_INSTANCE = q3Var;
        i1.H2(q3.class, q3Var);
    }

    private q3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.value_ = DEFAULT_INSTANCE.value_;
    }

    public static q3 O2() {
        return DEFAULT_INSTANCE;
    }

    public static b P2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b Q2(q3 q3Var) {
        return DEFAULT_INSTANCE.K1(q3Var);
    }

    public static q3 R2(String str) {
        return P2().j2(str).build();
    }

    public static q3 S2(InputStream inputStream) throws IOException {
        return (q3) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static q3 T2(InputStream inputStream, s0 s0Var) throws IOException {
        return (q3) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static q3 U2(w wVar) throws InvalidProtocolBufferException {
        return (q3) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static q3 V2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (q3) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static q3 W2(z zVar) throws IOException {
        return (q3) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static q3 X2(z zVar, s0 s0Var) throws IOException {
        return (q3) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static q3 Y2(InputStream inputStream) throws IOException {
        return (q3) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static q3 Z2(InputStream inputStream, s0 s0Var) throws IOException {
        return (q3) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static q3 a3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (q3) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q3 b3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (q3) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static q3 c3(byte[] bArr) throws InvalidProtocolBufferException {
        return (q3) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static q3 d3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (q3) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<q3> e3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.value_ = wVar.p0();
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7469a[iVar.ordinal()]) {
            case 1:
                return new q3();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<q3> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (q3.class) {
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

    @Override // android.content.preferences.protobuf.r3
    public String getValue() {
        return this.value_;
    }

    @Override // android.content.preferences.protobuf.r3
    public w z1() {
        return w.z(this.value_);
    }
}

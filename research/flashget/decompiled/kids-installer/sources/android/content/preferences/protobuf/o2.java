package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Mixin.java */
/* loaded from: classes4.dex */
public final class o2 extends i1<o2, b> implements p2 {
    private static final o2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z2<o2> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* compiled from: Mixin.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7457a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7457a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7457a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7457a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7457a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7457a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7457a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7457a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Mixin.java */
    public static final class b extends i1.b<o2, b> implements p2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.p2
        public w B() {
            return ((o2) this.f7240p).B();
        }

        @Override // android.content.preferences.protobuf.p2
        public w a() {
            return ((o2) this.f7240p).a();
        }

        @Override // android.content.preferences.protobuf.p2
        public String getName() {
            return ((o2) this.f7240p).getName();
        }

        @Override // android.content.preferences.protobuf.p2
        public String getRoot() {
            return ((o2) this.f7240p).getRoot();
        }

        public b i2() {
            a2();
            ((o2) this.f7240p).Q2();
            return this;
        }

        public b j2() {
            a2();
            ((o2) this.f7240p).R2();
            return this;
        }

        public b k2(String str) {
            a2();
            ((o2) this.f7240p).i3(str);
            return this;
        }

        public b l2(w wVar) {
            a2();
            ((o2) this.f7240p).j3(wVar);
            return this;
        }

        public b m2(String str) {
            a2();
            ((o2) this.f7240p).k3(str);
            return this;
        }

        public b n2(w wVar) {
            a2();
            ((o2) this.f7240p).l3(wVar);
            return this;
        }

        private b() {
            super(o2.DEFAULT_INSTANCE);
        }
    }

    static {
        o2 o2Var = new o2();
        DEFAULT_INSTANCE = o2Var;
        i1.H2(o2.class, o2Var);
    }

    private o2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2() {
        this.root_ = DEFAULT_INSTANCE.root_;
    }

    public static o2 S2() {
        return DEFAULT_INSTANCE;
    }

    public static b T2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b U2(o2 o2Var) {
        return DEFAULT_INSTANCE.K1(o2Var);
    }

    public static o2 V2(InputStream inputStream) throws IOException {
        return (o2) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static o2 W2(InputStream inputStream, s0 s0Var) throws IOException {
        return (o2) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static o2 X2(w wVar) throws InvalidProtocolBufferException {
        return (o2) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static o2 Y2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (o2) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static o2 Z2(z zVar) throws IOException {
        return (o2) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static o2 a3(z zVar, s0 s0Var) throws IOException {
        return (o2) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static o2 b3(InputStream inputStream) throws IOException {
        return (o2) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static o2 c3(InputStream inputStream, s0 s0Var) throws IOException {
        return (o2) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static o2 d3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (o2) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o2 e3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (o2) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static o2 f3(byte[] bArr) throws InvalidProtocolBufferException {
        return (o2) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static o2 g3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (o2) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<o2> h3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.name_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(String str) {
        str.getClass();
        this.root_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.root_ = wVar.p0();
    }

    @Override // android.content.preferences.protobuf.p2
    public w B() {
        return w.z(this.root_);
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7457a[iVar.ordinal()]) {
            case 1:
                return new o2();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<o2> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (o2.class) {
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

    @Override // android.content.preferences.protobuf.p2
    public w a() {
        return w.z(this.name_);
    }

    @Override // android.content.preferences.protobuf.p2
    public String getName() {
        return this.name_;
    }

    @Override // android.content.preferences.protobuf.p2
    public String getRoot() {
        return this.root_;
    }
}

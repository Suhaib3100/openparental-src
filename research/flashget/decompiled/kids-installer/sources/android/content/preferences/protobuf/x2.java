package android.content.preferences.protobuf;

import android.content.preferences.protobuf.f;
import android.content.preferences.protobuf.i1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Option.java */
/* loaded from: classes4.dex */
public final class x2 extends i1<x2, b> implements y2 {
    private static final x2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z2<x2> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private f value_;

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7607a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7607a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7607a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7607a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7607a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7607a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7607a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7607a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Option.java */
    public static final class b extends i1.b<x2, b> implements y2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.content.preferences.protobuf.y2
        public w a() {
            return ((x2) this.f7240p).a();
        }

        @Override // android.content.preferences.protobuf.y2
        public String getName() {
            return ((x2) this.f7240p).getName();
        }

        @Override // android.content.preferences.protobuf.y2
        public f getValue() {
            return ((x2) this.f7240p).getValue();
        }

        public b i2() {
            a2();
            ((x2) this.f7240p).R2();
            return this;
        }

        public b j2() {
            a2();
            x2.Q2((x2) this.f7240p);
            return this;
        }

        public b k2(f fVar) {
            a2();
            ((x2) this.f7240p).U2(fVar);
            return this;
        }

        public b l2(String str) {
            a2();
            ((x2) this.f7240p).k3(str);
            return this;
        }

        public b m2(w wVar) {
            a2();
            ((x2) this.f7240p).l3(wVar);
            return this;
        }

        public b n2(f.b bVar) {
            a2();
            ((x2) this.f7240p).m3(bVar);
            return this;
        }

        public b o2(f fVar) {
            a2();
            ((x2) this.f7240p).n3(fVar);
            return this;
        }

        @Override // android.content.preferences.protobuf.y2
        public boolean u0() {
            return ((x2) this.f7240p).u0();
        }

        private b() {
            super(x2.DEFAULT_INSTANCE);
        }
    }

    static {
        x2 x2Var = new x2();
        DEFAULT_INSTANCE = x2Var;
        i1.H2(x2.class, x2Var);
    }

    private x2() {
    }

    static void Q2(x2 x2Var) {
        x2Var.value_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    private void S2() {
        this.value_ = null;
    }

    public static x2 T2() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2(f fVar) {
        fVar.getClass();
        f fVar2 = this.value_;
        if (fVar2 == null || fVar2 == f.R2()) {
            this.value_ = fVar;
        } else {
            this.value_ = f.T2(this.value_).e2(fVar).N0();
        }
    }

    public static b V2() {
        return DEFAULT_INSTANCE.J1();
    }

    public static b W2(x2 x2Var) {
        return DEFAULT_INSTANCE.K1(x2Var);
    }

    public static x2 X2(InputStream inputStream) throws IOException {
        return (x2) i1.o2(DEFAULT_INSTANCE, inputStream);
    }

    public static x2 Y2(InputStream inputStream, s0 s0Var) throws IOException {
        return (x2) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static x2 Z2(w wVar) throws InvalidProtocolBufferException {
        return (x2) i1.q2(DEFAULT_INSTANCE, wVar);
    }

    public static x2 a3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (x2) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
    }

    public static x2 b3(z zVar) throws IOException {
        return (x2) i1.s2(DEFAULT_INSTANCE, zVar);
    }

    public static x2 c3(z zVar, s0 s0Var) throws IOException {
        return (x2) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
    }

    public static x2 d3(InputStream inputStream) throws IOException {
        return (x2) i1.u2(DEFAULT_INSTANCE, inputStream);
    }

    public static x2 e3(InputStream inputStream, s0 s0Var) throws IOException {
        return (x2) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
    }

    public static x2 f3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (x2) i1.w2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x2 g3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (x2) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
    }

    public static x2 h3(byte[] bArr) throws InvalidProtocolBufferException {
        return (x2) i1.y2(DEFAULT_INSTANCE, bArr);
    }

    public static x2 i3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (x2) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
    }

    public static z2<x2> j3() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(w wVar) {
        wVar.getClass();
        android.content.preferences.protobuf.a.r(wVar);
        this.name_ = wVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(f.b bVar) {
        this.value_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3(f fVar) {
        fVar.getClass();
        this.value_ = fVar;
    }

    @Override // android.content.preferences.protobuf.i1
    protected final Object N1(i1.i iVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7607a[iVar.ordinal()]) {
            case 1:
                return new x2();
            case 2:
                return new b(aVar);
            case 3:
                return new g3(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z2<x2> z2Var = PARSER;
                if (z2Var == null) {
                    synchronized (x2.class) {
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

    @Override // android.content.preferences.protobuf.y2
    public w a() {
        return w.z(this.name_);
    }

    @Override // android.content.preferences.protobuf.y2
    public String getName() {
        return this.name_;
    }

    @Override // android.content.preferences.protobuf.y2
    public f getValue() {
        f fVar = this.value_;
        return fVar == null ? f.R2() : fVar;
    }

    @Override // android.content.preferences.protobuf.y2
    public boolean u0() {
        return this.value_ != null;
    }
}

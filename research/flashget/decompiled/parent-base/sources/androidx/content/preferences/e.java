package androidx.content.preferences;

import androidx.content.preferences.protobuf.InvalidProtocolBufferException;
import androidx.content.preferences.protobuf.b2;
import androidx.content.preferences.protobuf.c2;
import androidx.content.preferences.protobuf.c3;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.j2;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.s0;
import androidx.content.preferences.protobuf.t4;
import androidx.content.preferences.protobuf.w;
import androidx.content.preferences.protobuf.z;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PreferencesProto.java */
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: PreferencesProto.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28572a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f28572a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28572a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28572a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28572a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28572a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28572a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28572a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PreferencesProto.java */
    public static final class b extends i1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        private static volatile c3<b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private c2<String, f> preferences_ = c2.i();

        /* compiled from: PreferencesProto.java */
        public static final class a extends i1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.e.c
            public int G() {
                return ((b) this.f28695c).t1().size();
            }

            @Override // androidx.datastore.preferences.e.c
            public f N0(String str, f fVar) {
                str.getClass();
                Map<String, f> t12 = ((b) this.f28695c).t1();
                return t12.containsKey(str) ? t12.get(str) : fVar;
            }

            @Override // androidx.datastore.preferences.e.c
            public boolean P(String str) {
                str.getClass();
                return ((b) this.f28695c).t1().containsKey(str);
            }

            @Override // androidx.datastore.preferences.e.c
            @Deprecated
            public Map<String, f> W0() {
                return t1();
            }

            public a e2() {
                W1();
                b.J2((b) this.f28695c).clear();
                return this;
            }

            public a f2(Map<String, f> map) {
                W1();
                b.J2((b) this.f28695c).putAll(map);
                return this;
            }

            public a g2(String str, f fVar) {
                str.getClass();
                fVar.getClass();
                W1();
                b.J2((b) this.f28695c).put(str, fVar);
                return this;
            }

            @Override // androidx.datastore.preferences.e.c
            public f h1(String str) {
                str.getClass();
                Map<String, f> t12 = ((b) this.f28695c).t1();
                if (t12.containsKey(str)) {
                    return t12.get(str);
                }
                throw new IllegalArgumentException();
            }

            public a h2(String str) {
                str.getClass();
                W1();
                b.J2((b) this.f28695c).remove(str);
                return this;
            }

            @Override // androidx.datastore.preferences.e.c
            public Map<String, f> t1() {
                return Collections.unmodifiableMap(((b) this.f28695c).t1());
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: PreferencesProto.java */
        /* renamed from: androidx.datastore.preferences.e$b$b, reason: collision with other inner class name */
        private static final class C0469b {

            /* renamed from: a, reason: collision with root package name */
            static final b2<String, f> f28573a = b2.f(t4.b.STRING, "", t4.b.MESSAGE, f.j3());

            private C0469b() {
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            i1.G2(b.class, bVar);
        }

        private b() {
        }

        static Map J2(b bVar) {
            return bVar.M2();
        }

        public static b K2() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, f> L2() {
            return M2();
        }

        private c2<String, f> M2() {
            if (!this.preferences_.n()) {
                this.preferences_ = this.preferences_.q();
            }
            return this.preferences_;
        }

        private c2<String, f> N2() {
            return this.preferences_;
        }

        public static a O2() {
            return DEFAULT_INSTANCE.F1();
        }

        public static a P2(b bVar) {
            return DEFAULT_INSTANCE.G1(bVar);
        }

        public static b Q2(InputStream inputStream) throws IOException {
            return (b) i1.l2(DEFAULT_INSTANCE, inputStream);
        }

        public static b R2(InputStream inputStream, s0 s0Var) throws IOException {
            return (b) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static b S2(w wVar) throws InvalidProtocolBufferException {
            return (b) i1.n2(DEFAULT_INSTANCE, wVar);
        }

        public static b T2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
            return (b) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
        }

        public static b U2(z zVar) throws IOException {
            return (b) i1.p2(DEFAULT_INSTANCE, zVar);
        }

        public static b V2(z zVar, s0 s0Var) throws IOException {
            return (b) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
        }

        public static b W2(InputStream inputStream) throws IOException {
            return (b) i1.s2(DEFAULT_INSTANCE, inputStream);
        }

        public static b X2(InputStream inputStream, s0 s0Var) throws IOException {
            return (b) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static b Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (b) i1.u2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b Z2(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
            return (b) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
        }

        public static b a3(byte[] bArr) throws InvalidProtocolBufferException {
            return (b) i1.w2(DEFAULT_INSTANCE, bArr);
        }

        public static b b3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
            return (b) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
        }

        public static c3<b> c3() {
            return DEFAULT_INSTANCE.B();
        }

        @Override // androidx.datastore.preferences.e.c
        public int G() {
            return this.preferences_.size();
        }

        @Override // androidx.content.preferences.protobuf.i1
        protected final Object K1(i1.i iVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f28572a[iVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return i1.i2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0469b.f28573a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    c3<b> c3Var = PARSER;
                    if (c3Var == null) {
                        synchronized (b.class) {
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

        @Override // androidx.datastore.preferences.e.c
        public f N0(String str, f fVar) {
            str.getClass();
            c2<String, f> c2Var = this.preferences_;
            return c2Var.containsKey(str) ? c2Var.get(str) : fVar;
        }

        @Override // androidx.datastore.preferences.e.c
        public boolean P(String str) {
            str.getClass();
            return this.preferences_.containsKey(str);
        }

        @Override // androidx.datastore.preferences.e.c
        @Deprecated
        public Map<String, f> W0() {
            return Collections.unmodifiableMap(this.preferences_);
        }

        @Override // androidx.datastore.preferences.e.c
        public f h1(String str) {
            str.getClass();
            c2<String, f> c2Var = this.preferences_;
            if (c2Var.containsKey(str)) {
                return c2Var.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // androidx.datastore.preferences.e.c
        public Map<String, f> t1() {
            return Collections.unmodifiableMap(this.preferences_);
        }
    }

    /* compiled from: PreferencesProto.java */
    public interface c extends j2 {
        int G();

        f N0(String str, f fVar);

        boolean P(String str);

        @Deprecated
        Map<String, f> W0();

        f h1(String str);

        Map<String, f> t1();
    }

    /* compiled from: PreferencesProto.java */
    public static final class d extends i1<d, a> implements InterfaceC0470e {
        private static final d DEFAULT_INSTANCE;
        private static volatile c3<d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private p1.k<String> strings_ = i1.Q1();

        /* compiled from: PreferencesProto.java */
        public static final class a extends i1.b<d, a> implements InterfaceC0470e {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.content.preferences.e.InterfaceC0470e
            public w E0(int i4) {
                return ((d) this.f28695c).E0(i4);
            }

            @Override // androidx.content.preferences.e.InterfaceC0470e
            public int F0() {
                return ((d) this.f28695c).F0();
            }

            @Override // androidx.content.preferences.e.InterfaceC0470e
            public String e1(int i4) {
                return ((d) this.f28695c).e1(i4);
            }

            public a e2(Iterable<String> iterable) {
                W1();
                ((d) this.f28695c).O2(iterable);
                return this;
            }

            public a f2(String str) {
                W1();
                ((d) this.f28695c).P2(str);
                return this;
            }

            @Override // androidx.content.preferences.e.InterfaceC0470e
            public List<String> g1() {
                return Collections.unmodifiableList(((d) this.f28695c).g1());
            }

            public a g2(w wVar) {
                W1();
                ((d) this.f28695c).Q2(wVar);
                return this;
            }

            public a h2() {
                W1();
                ((d) this.f28695c).R2();
                return this;
            }

            public a i2(int i4, String str) {
                W1();
                ((d) this.f28695c).j3(i4, str);
                return this;
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            i1.G2(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O2(Iterable<String> iterable) {
            S2();
            androidx.content.preferences.protobuf.a.j(iterable, this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P2(String str) {
            str.getClass();
            S2();
            this.strings_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q2(w wVar) {
            wVar.getClass();
            S2();
            this.strings_.add(wVar.n0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R2() {
            this.strings_ = i1.Q1();
        }

        private void S2() {
            if (this.strings_.S1()) {
                return;
            }
            this.strings_ = i1.g2(this.strings_);
        }

        public static d T2() {
            return DEFAULT_INSTANCE;
        }

        public static a U2() {
            return DEFAULT_INSTANCE.F1();
        }

        public static a V2(d dVar) {
            return DEFAULT_INSTANCE.G1(dVar);
        }

        public static d W2(InputStream inputStream) throws IOException {
            return (d) i1.l2(DEFAULT_INSTANCE, inputStream);
        }

        public static d X2(InputStream inputStream, s0 s0Var) throws IOException {
            return (d) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static d Y2(w wVar) throws InvalidProtocolBufferException {
            return (d) i1.n2(DEFAULT_INSTANCE, wVar);
        }

        public static d Z2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
            return (d) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
        }

        public static d a3(z zVar) throws IOException {
            return (d) i1.p2(DEFAULT_INSTANCE, zVar);
        }

        public static d b3(z zVar, s0 s0Var) throws IOException {
            return (d) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
        }

        public static d c3(InputStream inputStream) throws IOException {
            return (d) i1.s2(DEFAULT_INSTANCE, inputStream);
        }

        public static d d3(InputStream inputStream, s0 s0Var) throws IOException {
            return (d) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static d e3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (d) i1.u2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d f3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
            return (d) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
        }

        public static d g3(byte[] bArr) throws InvalidProtocolBufferException {
            return (d) i1.w2(DEFAULT_INSTANCE, bArr);
        }

        public static d h3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
            return (d) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
        }

        public static c3<d> i3() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j3(int i4, String str) {
            str.getClass();
            S2();
            this.strings_.set(i4, str);
        }

        @Override // androidx.content.preferences.e.InterfaceC0470e
        public w E0(int i4) {
            return w.A(this.strings_.get(i4));
        }

        @Override // androidx.content.preferences.e.InterfaceC0470e
        public int F0() {
            return this.strings_.size();
        }

        @Override // androidx.content.preferences.protobuf.i1
        protected final Object K1(i1.i iVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f28572a[iVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return i1.i2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    c3<d> c3Var = PARSER;
                    if (c3Var == null) {
                        synchronized (d.class) {
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

        @Override // androidx.content.preferences.e.InterfaceC0470e
        public String e1(int i4) {
            return this.strings_.get(i4);
        }

        @Override // androidx.content.preferences.e.InterfaceC0470e
        public List<String> g1() {
            return this.strings_;
        }
    }

    /* compiled from: PreferencesProto.java */
    /* renamed from: androidx.datastore.preferences.e$e, reason: collision with other inner class name */
    public interface InterfaceC0470e extends j2 {
        w E0(int i4);

        int F0();

        String e1(int i4);

        List<String> g1();
    }

    /* compiled from: PreferencesProto.java */
    public static final class f extends i1<f, a> implements g {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final f DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile c3<f> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        /* compiled from: PreferencesProto.java */
        public static final class a extends i1.b<f, a> implements g {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.e.g
            public d A0() {
                return ((f) this.f28695c).A0();
            }

            @Override // androidx.datastore.preferences.e.g
            public double B0() {
                return ((f) this.f28695c).B0();
            }

            @Override // androidx.datastore.preferences.e.g
            public String D0() {
                return ((f) this.f28695c).D0();
            }

            @Override // androidx.datastore.preferences.e.g
            public w F() {
                return ((f) this.f28695c).F();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean G0() {
                return ((f) this.f28695c).G0();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean H() {
                return ((f) this.f28695c).H();
            }

            @Override // androidx.datastore.preferences.e.g
            public long H0() {
                return ((f) this.f28695c).H0();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean M0() {
                return ((f) this.f28695c).M0();
            }

            @Override // androidx.datastore.preferences.e.g
            public b V() {
                return ((f) this.f28695c).V();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean X0() {
                return ((f) this.f28695c).X0();
            }

            public a e2() {
                W1();
                ((f) this.f28695c).b3();
                return this;
            }

            public a f2() {
                W1();
                ((f) this.f28695c).c3();
                return this;
            }

            public a g2() {
                W1();
                ((f) this.f28695c).d3();
                return this;
            }

            @Override // androidx.datastore.preferences.e.g
            public float h0() {
                return ((f) this.f28695c).h0();
            }

            public a h2() {
                W1();
                ((f) this.f28695c).e3();
                return this;
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean i0() {
                return ((f) this.f28695c).i0();
            }

            public a i2() {
                W1();
                ((f) this.f28695c).f3();
                return this;
            }

            public a j2() {
                W1();
                ((f) this.f28695c).g3();
                return this;
            }

            public a k2() {
                W1();
                ((f) this.f28695c).h3();
                return this;
            }

            public a l2() {
                W1();
                ((f) this.f28695c).i3();
                return this;
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean m0() {
                return ((f) this.f28695c).m0();
            }

            public a m2(d dVar) {
                W1();
                ((f) this.f28695c).k3(dVar);
                return this;
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean o0() {
                return ((f) this.f28695c).o0();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean o1() {
                return ((f) this.f28695c).o1();
            }

            public a o2(boolean z4) {
                W1();
                ((f) this.f28695c).C3(z4);
                return this;
            }

            public a p2(double d5) {
                W1();
                ((f) this.f28695c).D3(d5);
                return this;
            }

            public a r2(float f4) {
                W1();
                ((f) this.f28695c).E3(f4);
                return this;
            }

            public a s2(int i4) {
                W1();
                ((f) this.f28695c).F3(i4);
                return this;
            }

            public a t2(long j4) {
                W1();
                ((f) this.f28695c).G3(j4);
                return this;
            }

            public a u2(String str) {
                W1();
                ((f) this.f28695c).H3(str);
                return this;
            }

            public a v2(w wVar) {
                W1();
                ((f) this.f28695c).I3(wVar);
                return this;
            }

            public a w2(d.a aVar) {
                W1();
                ((f) this.f28695c).J3(aVar);
                return this;
            }

            public a x2(d dVar) {
                W1();
                ((f) this.f28695c).K3(dVar);
                return this;
            }

            @Override // androidx.datastore.preferences.e.g
            public int z0() {
                return ((f) this.f28695c).z0();
            }

            private a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: PreferencesProto.java */
        public enum b {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);

            private final int value;

            b(int i4) {
                this.value = i4;
            }

            public static b forNumber(int i4) {
                switch (i4) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static b valueOf(int i4) {
                return forNumber(i4);
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            i1.G2(f.class, fVar);
        }

        private f() {
        }

        public static c3<f> B3() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C3(boolean z4) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D3(double d5) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E3(float f4) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F3(int i4) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G3(long j4) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H3(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I3(w wVar) {
            wVar.getClass();
            this.valueCase_ = 5;
            this.value_ = wVar.n0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J3(d.a aVar) {
            this.value_ = aVar.a();
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K3(d dVar) {
            dVar.getClass();
            this.value_ = dVar;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b3() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c3() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d3() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e3() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f3() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g3() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h3() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i3() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static f j3() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k3(d dVar) {
            dVar.getClass();
            if (this.valueCase_ != 6 || this.value_ == d.T2()) {
                this.value_ = dVar;
            } else {
                this.value_ = d.V2((d) this.value_).a2(dVar).l1();
            }
            this.valueCase_ = 6;
        }

        public static a l3() {
            return DEFAULT_INSTANCE.F1();
        }

        public static a m3(f fVar) {
            return DEFAULT_INSTANCE.G1(fVar);
        }

        public static f n3(InputStream inputStream) throws IOException {
            return (f) i1.l2(DEFAULT_INSTANCE, inputStream);
        }

        public static f o3(InputStream inputStream, s0 s0Var) throws IOException {
            return (f) i1.m2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static f p3(w wVar) throws InvalidProtocolBufferException {
            return (f) i1.n2(DEFAULT_INSTANCE, wVar);
        }

        public static f q3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
            return (f) i1.o2(DEFAULT_INSTANCE, wVar, s0Var);
        }

        public static f r3(z zVar) throws IOException {
            return (f) i1.p2(DEFAULT_INSTANCE, zVar);
        }

        public static f s3(z zVar, s0 s0Var) throws IOException {
            return (f) i1.r2(DEFAULT_INSTANCE, zVar, s0Var);
        }

        public static f t3(InputStream inputStream) throws IOException {
            return (f) i1.s2(DEFAULT_INSTANCE, inputStream);
        }

        public static f u3(InputStream inputStream, s0 s0Var) throws IOException {
            return (f) i1.t2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static f w3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (f) i1.u2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static f x3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
            return (f) i1.v2(DEFAULT_INSTANCE, byteBuffer, s0Var);
        }

        public static f y3(byte[] bArr) throws InvalidProtocolBufferException {
            return (f) i1.w2(DEFAULT_INSTANCE, bArr);
        }

        public static f z3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
            return (f) i1.x2(DEFAULT_INSTANCE, bArr, s0Var);
        }

        @Override // androidx.datastore.preferences.e.g
        public d A0() {
            return this.valueCase_ == 6 ? (d) this.value_ : d.T2();
        }

        @Override // androidx.datastore.preferences.e.g
        public double B0() {
            return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : p.f60679p;
        }

        @Override // androidx.datastore.preferences.e.g
        public String D0() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        @Override // androidx.datastore.preferences.e.g
        public w F() {
            return w.A(this.valueCase_ == 5 ? (String) this.value_ : "");
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean G0() {
            return this.valueCase_ == 4;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean H() {
            return this.valueCase_ == 1;
        }

        @Override // androidx.datastore.preferences.e.g
        public long H0() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // androidx.content.preferences.protobuf.i1
        protected final Object K1(i1.i iVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f28572a[iVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return i1.i2(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", d.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    c3<f> c3Var = PARSER;
                    if (c3Var == null) {
                        synchronized (f.class) {
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

        @Override // androidx.datastore.preferences.e.g
        public boolean M0() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.e.g
        public b V() {
            return b.forNumber(this.valueCase_);
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean X0() {
            return this.valueCase_ == 7;
        }

        @Override // androidx.datastore.preferences.e.g
        public float h0() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean i0() {
            return this.valueCase_ == 5;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean m0() {
            return this.valueCase_ == 3;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean o0() {
            return this.valueCase_ == 2;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean o1() {
            return this.valueCase_ == 6;
        }

        @Override // androidx.datastore.preferences.e.g
        public int z0() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }
    }

    /* compiled from: PreferencesProto.java */
    public interface g extends j2 {
        d A0();

        double B0();

        String D0();

        w F();

        boolean G0();

        boolean H();

        long H0();

        boolean M0();

        f.b V();

        boolean X0();

        float h0();

        boolean i0();

        boolean m0();

        boolean o0();

        boolean o1();

        int z0();
    }

    private e() {
    }

    public static void a(s0 s0Var) {
    }
}

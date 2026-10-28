package android.content.preferences;

import android.content.preferences.protobuf.InvalidProtocolBufferException;
import android.content.preferences.protobuf.a2;
import android.content.preferences.protobuf.b2;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.i2;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.q4;
import android.content.preferences.protobuf.s0;
import android.content.preferences.protobuf.w;
import android.content.preferences.protobuf.z;
import android.content.preferences.protobuf.z2;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: PreferencesProto.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7118a;

        static {
            int[] iArr = new int[i1.i.values().length];
            f7118a = iArr;
            try {
                iArr[i1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7118a[i1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7118a[i1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7118a[i1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7118a[i1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7118a[i1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7118a[i1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes4.dex */
    public static final class b extends i1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        private static volatile z2<b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private b2<String, f> preferences_ = b2.k();

        /* compiled from: PreferencesProto.java */
        public static final class a extends i1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.e.c
            @Deprecated
            public Map<String, f> A0() {
                return A1();
            }

            @Override // androidx.datastore.preferences.e.c
            public Map<String, f> A1() {
                return Collections.unmodifiableMap(((b) this.f7240p).A1());
            }

            @Override // androidx.datastore.preferences.e.c
            public int I() {
                return ((b) this.f7240p).A1().size();
            }

            @Override // androidx.datastore.preferences.e.c
            public f W0(String str) {
                str.getClass();
                Map<String, f> A1 = ((b) this.f7240p).A1();
                if (A1.containsKey(str)) {
                    return A1.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // androidx.datastore.preferences.e.c
            public boolean i0(String str) {
                str.getClass();
                return ((b) this.f7240p).A1().containsKey(str);
            }

            public a i2() {
                a2();
                b.K2((b) this.f7240p).clear();
                return this;
            }

            public a j2(Map<String, f> map) {
                a2();
                b.K2((b) this.f7240p).putAll(map);
                return this;
            }

            @Override // androidx.datastore.preferences.e.c
            public f k0(String str, f fVar) {
                str.getClass();
                Map<String, f> A1 = ((b) this.f7240p).A1();
                return A1.containsKey(str) ? A1.get(str) : fVar;
            }

            public a k2(String str, f fVar) {
                str.getClass();
                fVar.getClass();
                a2();
                b.K2((b) this.f7240p).put(str, fVar);
                return this;
            }

            public a l2(String str) {
                str.getClass();
                a2();
                b.K2((b) this.f7240p).remove(str);
                return this;
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: PreferencesProto.java */
        /* renamed from: androidx.datastore.preferences.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static final class C0080b {

            /* renamed from: a, reason: collision with root package name */
            static final a2<String, f> f7119a = a2.f(q4.b.STRING, "", q4.b.MESSAGE, f.k3());

            private C0080b() {
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            i1.H2(b.class, bVar);
        }

        private b() {
        }

        static Map K2(b bVar) {
            return bVar.N2();
        }

        public static b L2() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, f> M2() {
            return N2();
        }

        private b2<String, f> N2() {
            if (!this.preferences_.p()) {
                this.preferences_ = this.preferences_.u();
            }
            return this.preferences_;
        }

        private b2<String, f> O2() {
            return this.preferences_;
        }

        public static a P2() {
            return DEFAULT_INSTANCE.J1();
        }

        public static a Q2(b bVar) {
            return DEFAULT_INSTANCE.K1(bVar);
        }

        public static b R2(InputStream inputStream) throws IOException {
            return (b) i1.o2(DEFAULT_INSTANCE, inputStream);
        }

        public static b S2(InputStream inputStream, s0 s0Var) throws IOException {
            return (b) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static b T2(w wVar) throws InvalidProtocolBufferException {
            return (b) i1.q2(DEFAULT_INSTANCE, wVar);
        }

        public static b U2(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
            return (b) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
        }

        public static b V2(z zVar) throws IOException {
            return (b) i1.s2(DEFAULT_INSTANCE, zVar);
        }

        public static b W2(z zVar, s0 s0Var) throws IOException {
            return (b) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
        }

        public static b X2(InputStream inputStream) throws IOException {
            return (b) i1.u2(DEFAULT_INSTANCE, inputStream);
        }

        public static b Y2(InputStream inputStream, s0 s0Var) throws IOException {
            return (b) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static b Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (b) i1.w2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b a3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
            return (b) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
        }

        public static b b3(byte[] bArr) throws InvalidProtocolBufferException {
            return (b) i1.y2(DEFAULT_INSTANCE, bArr);
        }

        public static b c3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
            return (b) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
        }

        public static z2<b> d3() {
            return DEFAULT_INSTANCE.z();
        }

        @Override // androidx.datastore.preferences.e.c
        @Deprecated
        public Map<String, f> A0() {
            return A1();
        }

        @Override // androidx.datastore.preferences.e.c
        public Map<String, f> A1() {
            return Collections.unmodifiableMap(this.preferences_);
        }

        @Override // androidx.datastore.preferences.e.c
        public int I() {
            return this.preferences_.size();
        }

        @Override // android.content.preferences.protobuf.i1
        protected final Object N1(i1.i iVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f7118a[iVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return i1.l2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0080b.f7119a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    z2<b> z2Var = PARSER;
                    if (z2Var == null) {
                        synchronized (b.class) {
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

        @Override // androidx.datastore.preferences.e.c
        public f W0(String str) {
            str.getClass();
            b2<String, f> b2Var = this.preferences_;
            if (b2Var.containsKey(str)) {
                return b2Var.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // androidx.datastore.preferences.e.c
        public boolean i0(String str) {
            str.getClass();
            return this.preferences_.containsKey(str);
        }

        @Override // androidx.datastore.preferences.e.c
        public f k0(String str, f fVar) {
            str.getClass();
            b2<String, f> b2Var = this.preferences_;
            return b2Var.containsKey(str) ? b2Var.get(str) : fVar;
        }
    }

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes3.dex */
    public interface c extends i2 {
        @Deprecated
        Map<String, f> A0();

        Map<String, f> A1();

        int I();

        f W0(String str);

        boolean i0(String str);

        f k0(String str, f fVar);
    }

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes4.dex */
    public static final class d extends i1<d, a> implements InterfaceC0081e {
        private static final d DEFAULT_INSTANCE;
        private static volatile z2<d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private o1.k<String> strings_ = i1.T1();

        /* compiled from: PreferencesProto.java */
        public static final class a extends i1.b<d, a> implements InterfaceC0081e {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // android.content.preferences.e.InterfaceC0081e
            public w Q(int i5) {
                return ((d) this.f7240p).Q(i5);
            }

            @Override // android.content.preferences.e.InterfaceC0081e
            public String R0(int i5) {
                return ((d) this.f7240p).R0(i5);
            }

            @Override // android.content.preferences.e.InterfaceC0081e
            public int S() {
                return ((d) this.f7240p).S();
            }

            @Override // android.content.preferences.e.InterfaceC0081e
            public List<String> V0() {
                return Collections.unmodifiableList(((d) this.f7240p).V0());
            }

            public a i2(Iterable<String> iterable) {
                a2();
                ((d) this.f7240p).P2(iterable);
                return this;
            }

            public a j2(String str) {
                a2();
                ((d) this.f7240p).Q2(str);
                return this;
            }

            public a k2(w wVar) {
                a2();
                ((d) this.f7240p).R2(wVar);
                return this;
            }

            public a l2() {
                a2();
                ((d) this.f7240p).S2();
                return this;
            }

            public a m2(int i5, String str) {
                a2();
                ((d) this.f7240p).k3(i5, str);
                return this;
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            i1.H2(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P2(Iterable<String> iterable) {
            T2();
            android.content.preferences.protobuf.a.h(iterable, this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q2(String str) {
            str.getClass();
            T2();
            this.strings_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R2(w wVar) {
            wVar.getClass();
            T2();
            this.strings_.add(wVar.p0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S2() {
            this.strings_ = i1.T1();
        }

        private void T2() {
            if (this.strings_.m1()) {
                return;
            }
            this.strings_ = i1.j2(this.strings_);
        }

        public static d U2() {
            return DEFAULT_INSTANCE;
        }

        public static a V2() {
            return DEFAULT_INSTANCE.J1();
        }

        public static a W2(d dVar) {
            return DEFAULT_INSTANCE.K1(dVar);
        }

        public static d X2(InputStream inputStream) throws IOException {
            return (d) i1.o2(DEFAULT_INSTANCE, inputStream);
        }

        public static d Y2(InputStream inputStream, s0 s0Var) throws IOException {
            return (d) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static d Z2(w wVar) throws InvalidProtocolBufferException {
            return (d) i1.q2(DEFAULT_INSTANCE, wVar);
        }

        public static d a3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
            return (d) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
        }

        public static d b3(z zVar) throws IOException {
            return (d) i1.s2(DEFAULT_INSTANCE, zVar);
        }

        public static d c3(z zVar, s0 s0Var) throws IOException {
            return (d) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
        }

        public static d d3(InputStream inputStream) throws IOException {
            return (d) i1.u2(DEFAULT_INSTANCE, inputStream);
        }

        public static d e3(InputStream inputStream, s0 s0Var) throws IOException {
            return (d) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static d f3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (d) i1.w2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d g3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
            return (d) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
        }

        public static d h3(byte[] bArr) throws InvalidProtocolBufferException {
            return (d) i1.y2(DEFAULT_INSTANCE, bArr);
        }

        public static d i3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
            return (d) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
        }

        public static z2<d> j3() {
            return DEFAULT_INSTANCE.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k3(int i5, String str) {
            str.getClass();
            T2();
            this.strings_.set(i5, str);
        }

        @Override // android.content.preferences.protobuf.i1
        protected final Object N1(i1.i iVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f7118a[iVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return i1.l2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    z2<d> z2Var = PARSER;
                    if (z2Var == null) {
                        synchronized (d.class) {
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

        @Override // android.content.preferences.e.InterfaceC0081e
        public w Q(int i5) {
            return w.z(this.strings_.get(i5));
        }

        @Override // android.content.preferences.e.InterfaceC0081e
        public String R0(int i5) {
            return this.strings_.get(i5);
        }

        @Override // android.content.preferences.e.InterfaceC0081e
        public int S() {
            return this.strings_.size();
        }

        @Override // android.content.preferences.e.InterfaceC0081e
        public List<String> V0() {
            return this.strings_;
        }
    }

    /* compiled from: PreferencesProto.java */
    /* renamed from: androidx.datastore.preferences.e$e, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0081e extends i2 {
        w Q(int i5);

        String R0(int i5);

        int S();

        List<String> V0();
    }

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes4.dex */
    public static final class f extends i1<f, a> implements g {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final f DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile z2<f> PARSER = null;
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
            public int D() {
                return ((f) this.f7240p).D();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean D0() {
                return ((f) this.f7240p).D0();
            }

            @Override // androidx.datastore.preferences.e.g
            public d E() {
                return ((f) this.f7240p).E();
            }

            @Override // androidx.datastore.preferences.e.g
            public w G() {
                return ((f) this.f7240p).G();
            }

            @Override // androidx.datastore.preferences.e.g
            public double J() {
                return ((f) this.f7240p).J();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean M() {
                return ((f) this.f7240p).M();
            }

            @Override // androidx.datastore.preferences.e.g
            public float S0() {
                return ((f) this.f7240p).S0();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean T() {
                return ((f) this.f7240p).T();
            }

            @Override // androidx.datastore.preferences.e.g
            public long W() {
                return ((f) this.f7240p).W();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean X0() {
                return ((f) this.f7240p).X0();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean c1() {
                return ((f) this.f7240p).c1();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean d1() {
                return ((f) this.f7240p).d1();
            }

            @Override // androidx.datastore.preferences.e.g
            public String getString() {
                return ((f) this.f7240p).getString();
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean h0() {
                return ((f) this.f7240p).h0();
            }

            public a i2() {
                a2();
                ((f) this.f7240p).c3();
                return this;
            }

            public a j2() {
                a2();
                ((f) this.f7240p).d3();
                return this;
            }

            public a k2() {
                a2();
                ((f) this.f7240p).e3();
                return this;
            }

            public a l2() {
                a2();
                ((f) this.f7240p).f3();
                return this;
            }

            @Override // androidx.datastore.preferences.e.g
            public boolean m1() {
                return ((f) this.f7240p).m1();
            }

            public a m2() {
                a2();
                ((f) this.f7240p).g3();
                return this;
            }

            public a n2() {
                a2();
                ((f) this.f7240p).h3();
                return this;
            }

            public a o2() {
                a2();
                ((f) this.f7240p).i3();
                return this;
            }

            public a p2() {
                a2();
                ((f) this.f7240p).j3();
                return this;
            }

            public a q2(d dVar) {
                a2();
                ((f) this.f7240p).l3(dVar);
                return this;
            }

            public a r2(boolean z5) {
                a2();
                ((f) this.f7240p).B3(z5);
                return this;
            }

            public a s2(double d6) {
                a2();
                ((f) this.f7240p).C3(d6);
                return this;
            }

            public a t2(float f6) {
                a2();
                ((f) this.f7240p).D3(f6);
                return this;
            }

            public a u2(int i5) {
                a2();
                ((f) this.f7240p).E3(i5);
                return this;
            }

            @Override // androidx.datastore.preferences.e.g
            public b v0() {
                return ((f) this.f7240p).v0();
            }

            public a v2(long j5) {
                a2();
                ((f) this.f7240p).F3(j5);
                return this;
            }

            public a w2(String str) {
                a2();
                ((f) this.f7240p).G3(str);
                return this;
            }

            public a x2(w wVar) {
                a2();
                ((f) this.f7240p).H3(wVar);
                return this;
            }

            public a y2(d.a aVar) {
                a2();
                ((f) this.f7240p).I3(aVar);
                return this;
            }

            public a z2(d dVar) {
                a2();
                ((f) this.f7240p).J3(dVar);
                return this;
            }

            private a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: PreferencesProto.java */
        /* loaded from: classes.dex */
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

            b(int i5) {
                this.value = i5;
            }

            public static b forNumber(int i5) {
                switch (i5) {
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
            public static b valueOf(int i5) {
                return forNumber(i5);
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            i1.H2(f.class, fVar);
        }

        private f() {
        }

        public static z2<f> A3() {
            return DEFAULT_INSTANCE.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B3(boolean z5) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C3(double d6) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D3(float f6) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E3(int i5) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F3(long j5) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G3(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H3(w wVar) {
            wVar.getClass();
            this.valueCase_ = 5;
            this.value_ = wVar.p0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I3(d.a aVar) {
            this.value_ = aVar.build();
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J3(d dVar) {
            dVar.getClass();
            this.value_ = dVar;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c3() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d3() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e3() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f3() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g3() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h3() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i3() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j3() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static f k3() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l3(d dVar) {
            dVar.getClass();
            if (this.valueCase_ != 6 || this.value_ == d.U2()) {
                this.value_ = dVar;
            } else {
                this.value_ = d.W2((d) this.value_).e2(dVar).N0();
            }
            this.valueCase_ = 6;
        }

        public static a m3() {
            return DEFAULT_INSTANCE.J1();
        }

        public static a n3(f fVar) {
            return DEFAULT_INSTANCE.K1(fVar);
        }

        public static f o3(InputStream inputStream) throws IOException {
            return (f) i1.o2(DEFAULT_INSTANCE, inputStream);
        }

        public static f p3(InputStream inputStream, s0 s0Var) throws IOException {
            return (f) i1.p2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static f q3(w wVar) throws InvalidProtocolBufferException {
            return (f) i1.q2(DEFAULT_INSTANCE, wVar);
        }

        public static f r3(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
            return (f) i1.r2(DEFAULT_INSTANCE, wVar, s0Var);
        }

        public static f s3(z zVar) throws IOException {
            return (f) i1.s2(DEFAULT_INSTANCE, zVar);
        }

        public static f t3(z zVar, s0 s0Var) throws IOException {
            return (f) i1.t2(DEFAULT_INSTANCE, zVar, s0Var);
        }

        public static f u3(InputStream inputStream) throws IOException {
            return (f) i1.u2(DEFAULT_INSTANCE, inputStream);
        }

        public static f v3(InputStream inputStream, s0 s0Var) throws IOException {
            return (f) i1.v2(DEFAULT_INSTANCE, inputStream, s0Var);
        }

        public static f w3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (f) i1.w2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static f x3(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
            return (f) i1.x2(DEFAULT_INSTANCE, byteBuffer, s0Var);
        }

        public static f y3(byte[] bArr) throws InvalidProtocolBufferException {
            return (f) i1.y2(DEFAULT_INSTANCE, bArr);
        }

        public static f z3(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
            return (f) i1.z2(DEFAULT_INSTANCE, bArr, s0Var);
        }

        @Override // androidx.datastore.preferences.e.g
        public int D() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean D0() {
            return this.valueCase_ == 7;
        }

        @Override // androidx.datastore.preferences.e.g
        public d E() {
            return this.valueCase_ == 6 ? (d) this.value_ : d.U2();
        }

        @Override // androidx.datastore.preferences.e.g
        public w G() {
            return w.z(this.valueCase_ == 5 ? (String) this.value_ : "");
        }

        @Override // androidx.datastore.preferences.e.g
        public double J() {
            return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : p.f18289o;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean M() {
            return this.valueCase_ == 1;
        }

        @Override // android.content.preferences.protobuf.i1
        protected final Object N1(i1.i iVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f7118a[iVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return i1.l2(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", d.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    z2<f> z2Var = PARSER;
                    if (z2Var == null) {
                        synchronized (f.class) {
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

        @Override // androidx.datastore.preferences.e.g
        public float S0() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean T() {
            return this.valueCase_ == 4;
        }

        @Override // androidx.datastore.preferences.e.g
        public long W() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean X0() {
            return this.valueCase_ == 5;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean c1() {
            return this.valueCase_ == 3;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean d1() {
            return this.valueCase_ == 2;
        }

        @Override // androidx.datastore.preferences.e.g
        public String getString() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean h0() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.e.g
        public boolean m1() {
            return this.valueCase_ == 6;
        }

        @Override // androidx.datastore.preferences.e.g
        public b v0() {
            return b.forNumber(this.valueCase_);
        }
    }

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes3.dex */
    public interface g extends i2 {
        int D();

        boolean D0();

        d E();

        w G();

        double J();

        boolean M();

        float S0();

        boolean T();

        long W();

        boolean X0();

        boolean c1();

        boolean d1();

        String getString();

        boolean h0();

        boolean m1();

        f.b v0();
    }

    private e() {
    }

    public static void a(s0 s0Var) {
    }
}

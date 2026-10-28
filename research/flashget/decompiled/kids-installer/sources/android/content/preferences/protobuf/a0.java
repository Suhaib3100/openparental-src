package android.content.preferences.protobuf;

import android.content.preferences.protobuf.q4;
import java.io.IOException;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes3.dex */
final class a0 implements h3 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f7163g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7164h = 7;

    /* renamed from: i, reason: collision with root package name */
    private static final int f7165i = 0;

    /* renamed from: c, reason: collision with root package name */
    private final z f7166c;

    /* renamed from: d, reason: collision with root package name */
    private int f7167d;

    /* renamed from: e, reason: collision with root package name */
    private int f7168e;

    /* renamed from: f, reason: collision with root package name */
    private int f7169f = 0;

    /* compiled from: CodedInputStreamReader.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7170a;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7170a = iArr;
            try {
                iArr[q4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7170a[q4.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7170a[q4.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7170a[q4.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7170a[q4.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7170a[q4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7170a[q4.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7170a[q4.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7170a[q4.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7170a[q4.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7170a[q4.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7170a[q4.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7170a[q4.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7170a[q4.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7170a[q4.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7170a[q4.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7170a[q4.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private a0(z zVar) {
        z zVar2 = (z) o1.e(zVar, "input");
        this.f7166c = zVar2;
        zVar2.f7621d = this;
    }

    public static a0 T(z zVar) {
        a0 a0Var = zVar.f7621d;
        return a0Var != null ? a0Var : new a0(zVar);
    }

    private Object U(q4.b bVar, Class<?> cls, s0 s0Var) throws IOException {
        switch (a.f7170a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(l());
            case 2:
                return F();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(w());
            case 5:
                return Integer.valueOf(k());
            case 6:
                return Long.valueOf(e());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(H());
            case 9:
                return Long.valueOf(P());
            case 10:
                return f(cls, s0Var);
            case 11:
                return Integer.valueOf(L());
            case 12:
                return Long.valueOf(m());
            case 13:
                return Integer.valueOf(y());
            case 14:
                return Long.valueOf(z());
            case 15:
                return Q();
            case 16:
                return Integer.valueOf(q());
            case 17:
                return Long.valueOf(d());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T V(j3<T> j3Var, s0 s0Var) throws IOException {
        int i5 = this.f7168e;
        this.f7168e = (q4.a(this.f7167d) << 3) | 4;
        try {
            T h5 = j3Var.h();
            j3Var.b(h5, this, s0Var);
            j3Var.c(h5);
            if (this.f7167d == this.f7168e) {
                return h5;
            }
            throw InvalidProtocolBufferException.h();
        } finally {
            this.f7168e = i5;
        }
    }

    private <T> T W(j3<T> j3Var, s0 s0Var) throws IOException {
        int Z = this.f7166c.Z();
        z zVar = this.f7166c;
        if (zVar.f7618a >= zVar.f7619b) {
            throw InvalidProtocolBufferException.i();
        }
        int t5 = zVar.t(Z);
        T h5 = j3Var.h();
        this.f7166c.f7618a++;
        j3Var.b(h5, this, s0Var);
        j3Var.c(h5);
        this.f7166c.a(0);
        r5.f7618a--;
        this.f7166c.s(t5);
        return h5;
    }

    private void Y(int i5) throws IOException {
        if (this.f7166c.h() != i5) {
            throw InvalidProtocolBufferException.l();
        }
    }

    private void Z(int i5) throws IOException {
        if (q4.b(this.f7167d) != i5) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void a0(int i5) throws IOException {
        if ((i5 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void b0(int i5) throws IOException {
        if ((i5 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // android.content.preferences.protobuf.h3
    public void A(List<Boolean> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof r)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f7166c.u()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h5 = this.f7166c.h() + this.f7166c.Z();
            do {
                list.add(Boolean.valueOf(this.f7166c.u()));
            } while (this.f7166c.h() < h5);
            Y(h5);
            return;
        }
        r rVar = (r) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 0) {
            do {
                rVar.i0(this.f7166c.u());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h6 = this.f7166c.h() + this.f7166c.Z();
        do {
            rVar.i0(this.f7166c.u());
        } while (this.f7166c.h() < h6);
        Y(h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public String B() throws IOException {
        Z(2);
        return this.f7166c.W();
    }

    @Override // android.content.preferences.protobuf.h3
    public int C() throws IOException {
        int i5 = this.f7169f;
        if (i5 != 0) {
            this.f7167d = i5;
            this.f7169f = 0;
        } else {
            this.f7167d = this.f7166c.Y();
        }
        int i6 = this.f7167d;
        if (i6 == 0 || i6 == this.f7168e) {
            return Integer.MAX_VALUE;
        }
        return q4.a(i6);
    }

    @Override // android.content.preferences.protobuf.h3
    public void D(List<String> list) throws IOException {
        X(list, false);
    }

    @Override // android.content.preferences.protobuf.h3
    public void E(List<String> list) throws IOException {
        X(list, true);
    }

    @Override // android.content.preferences.protobuf.h3
    public w F() throws IOException {
        Z(2);
        return this.f7166c.x();
    }

    @Override // android.content.preferences.protobuf.h3
    public void G(List<Float> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof e1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 2) {
                int Z = this.f7166c.Z();
                a0(Z);
                int h5 = this.f7166c.h() + Z;
                do {
                    list.add(Float.valueOf(this.f7166c.C()));
                } while (this.f7166c.h() < h5);
                return;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f7166c.C()));
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y = this.f7166c.Y();
                }
            } while (Y == this.f7167d);
            this.f7169f = Y;
            return;
        }
        e1 e1Var = (e1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 2) {
            int Z2 = this.f7166c.Z();
            a0(Z2);
            int h6 = this.f7166c.h() + Z2;
            do {
                e1Var.m(this.f7166c.C());
            } while (this.f7166c.h() < h6);
            return;
        }
        if (b7 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            e1Var.m(this.f7166c.C());
            if (this.f7166c.i()) {
                return;
            } else {
                Y2 = this.f7166c.Y();
            }
        } while (Y2 == this.f7167d);
        this.f7169f = Y2;
    }

    @Override // android.content.preferences.protobuf.h3
    public int H() throws IOException {
        Z(0);
        return this.f7166c.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.preferences.protobuf.h3
    public <T> void I(List<T> list, j3<T> j3Var, s0 s0Var) throws IOException {
        int Y;
        if (q4.b(this.f7167d) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i5 = this.f7167d;
        do {
            list.add(V(j3Var, s0Var));
            if (this.f7166c.i() || this.f7169f != 0) {
                return;
            } else {
                Y = this.f7166c.Y();
            }
        } while (Y == i5);
        this.f7169f = Y;
    }

    @Override // android.content.preferences.protobuf.h3
    public boolean J() {
        return this.f7166c.f0();
    }

    @Override // android.content.preferences.protobuf.h3
    public boolean K() throws IOException {
        int i5;
        if (this.f7166c.i() || (i5 = this.f7167d) == this.f7168e) {
            return false;
        }
        return this.f7166c.g0(i5);
    }

    @Override // android.content.preferences.protobuf.h3
    public int L() throws IOException {
        Z(5);
        return this.f7166c.S();
    }

    @Override // android.content.preferences.protobuf.h3
    public void M(List<w> list) throws IOException {
        int Y;
        if (q4.b(this.f7167d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(F());
            if (this.f7166c.i()) {
                return;
            } else {
                Y = this.f7166c.Y();
            }
        } while (Y == this.f7167d);
        this.f7169f = Y;
    }

    @Override // android.content.preferences.protobuf.h3
    public void N(List<Double> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof c0)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 1) {
                do {
                    list.add(Double.valueOf(this.f7166c.y()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int Z = this.f7166c.Z();
            b0(Z);
            int h5 = this.f7166c.h() + Z;
            do {
                list.add(Double.valueOf(this.f7166c.y()));
            } while (this.f7166c.h() < h5);
            return;
        }
        c0 c0Var = (c0) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 1) {
            do {
                c0Var.o0(this.f7166c.y());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int Z2 = this.f7166c.Z();
        b0(Z2);
        int h6 = this.f7166c.h() + Z2;
        do {
            c0Var.o0(this.f7166c.y());
        } while (this.f7166c.h() < h6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.preferences.protobuf.h3
    public <T> void O(List<T> list, j3<T> j3Var, s0 s0Var) throws IOException {
        int Y;
        if (q4.b(this.f7167d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i5 = this.f7167d;
        do {
            list.add(W(j3Var, s0Var));
            if (this.f7166c.i() || this.f7169f != 0) {
                return;
            } else {
                Y = this.f7166c.Y();
            }
        } while (Y == i5);
        this.f7169f = Y;
    }

    @Override // android.content.preferences.protobuf.h3
    public long P() throws IOException {
        Z(0);
        return this.f7166c.G();
    }

    @Override // android.content.preferences.protobuf.h3
    public String Q() throws IOException {
        Z(2);
        return this.f7166c.X();
    }

    @Override // android.content.preferences.protobuf.h3
    public void R(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof y1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 1) {
                do {
                    list.add(Long.valueOf(this.f7166c.B()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int Z = this.f7166c.Z();
            b0(Z);
            int h5 = this.f7166c.h() + Z;
            do {
                list.add(Long.valueOf(this.f7166c.B()));
            } while (this.f7166c.h() < h5);
            return;
        }
        y1 y1Var = (y1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 1) {
            do {
                y1Var.e0(this.f7166c.B());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int Z2 = this.f7166c.Z();
        b0(Z2);
        int h6 = this.f7166c.h() + Z2;
        do {
            y1Var.e0(this.f7166c.B());
        } while (this.f7166c.h() < h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public <T> T S(j3<T> j3Var, s0 s0Var) throws IOException {
        Z(3);
        return (T) V(j3Var, s0Var);
    }

    public void X(List<String> list, boolean z5) throws IOException {
        int Y;
        int Y2;
        if (q4.b(this.f7167d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof u1) || z5) {
            do {
                list.add(z5 ? Q() : B());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y = this.f7166c.Y();
                }
            } while (Y == this.f7167d);
            this.f7169f = Y;
            return;
        }
        u1 u1Var = (u1) list;
        do {
            u1Var.F(F());
            if (this.f7166c.i()) {
                return;
            } else {
                Y2 = this.f7166c.Y();
            }
        } while (Y2 == this.f7167d);
        this.f7169f = Y2;
    }

    @Override // android.content.preferences.protobuf.h3
    public int a() {
        return this.f7167d;
    }

    @Override // android.content.preferences.protobuf.h3
    public <T> T b(j3<T> j3Var, s0 s0Var) throws IOException {
        Z(2);
        return (T) W(j3Var, s0Var);
    }

    @Override // android.content.preferences.protobuf.h3
    public void c(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7166c.U()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h5 = this.f7166c.h() + this.f7166c.Z();
            do {
                list.add(Integer.valueOf(this.f7166c.U()));
            } while (this.f7166c.h() < h5);
            Y(h5);
            return;
        }
        n1 n1Var = (n1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 0) {
            do {
                n1Var.D(this.f7166c.U());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h6 = this.f7166c.h() + this.f7166c.Z();
        do {
            n1Var.D(this.f7166c.U());
        } while (this.f7166c.h() < h6);
        Y(h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public long d() throws IOException {
        Z(0);
        return this.f7166c.a0();
    }

    @Override // android.content.preferences.protobuf.h3
    public long e() throws IOException {
        Z(1);
        return this.f7166c.B();
    }

    @Override // android.content.preferences.protobuf.h3
    public <T> T f(Class<T> cls, s0 s0Var) throws IOException {
        Z(2);
        return (T) W(c3.a().i(cls), s0Var);
    }

    @Override // android.content.preferences.protobuf.h3
    public <T> void g(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
        I(list, c3.a().i(cls), s0Var);
    }

    @Override // android.content.preferences.protobuf.h3
    public void h(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 2) {
                int Z = this.f7166c.Z();
                a0(Z);
                int h5 = this.f7166c.h() + Z;
                do {
                    list.add(Integer.valueOf(this.f7166c.S()));
                } while (this.f7166c.h() < h5);
                return;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f7166c.S()));
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y = this.f7166c.Y();
                }
            } while (Y == this.f7167d);
            this.f7169f = Y;
            return;
        }
        n1 n1Var = (n1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 2) {
            int Z2 = this.f7166c.Z();
            a0(Z2);
            int h6 = this.f7166c.h() + Z2;
            do {
                n1Var.D(this.f7166c.S());
            } while (this.f7166c.h() < h6);
            return;
        }
        if (b7 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            n1Var.D(this.f7166c.S());
            if (this.f7166c.i()) {
                return;
            } else {
                Y2 = this.f7166c.Y();
            }
        } while (Y2 == this.f7167d);
        this.f7169f = Y2;
    }

    @Override // android.content.preferences.protobuf.h3
    public void i(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof y1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 0) {
                do {
                    list.add(Long.valueOf(this.f7166c.V()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h5 = this.f7166c.h() + this.f7166c.Z();
            do {
                list.add(Long.valueOf(this.f7166c.V()));
            } while (this.f7166c.h() < h5);
            Y(h5);
            return;
        }
        y1 y1Var = (y1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 0) {
            do {
                y1Var.e0(this.f7166c.V());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h6 = this.f7166c.h() + this.f7166c.Z();
        do {
            y1Var.e0(this.f7166c.V());
        } while (this.f7166c.h() < h6);
        Y(h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public void j(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7166c.Z()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h5 = this.f7166c.h() + this.f7166c.Z();
            do {
                list.add(Integer.valueOf(this.f7166c.Z()));
            } while (this.f7166c.h() < h5);
            Y(h5);
            return;
        }
        n1 n1Var = (n1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 0) {
            do {
                n1Var.D(this.f7166c.Z());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h6 = this.f7166c.h() + this.f7166c.Z();
        do {
            n1Var.D(this.f7166c.Z());
        } while (this.f7166c.h() < h6);
        Y(h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public int k() throws IOException {
        Z(5);
        return this.f7166c.A();
    }

    @Override // android.content.preferences.protobuf.h3
    public boolean l() throws IOException {
        Z(0);
        return this.f7166c.u();
    }

    @Override // android.content.preferences.protobuf.h3
    public long m() throws IOException {
        Z(1);
        return this.f7166c.T();
    }

    @Override // android.content.preferences.protobuf.h3
    public void n(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof y1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 0) {
                do {
                    list.add(Long.valueOf(this.f7166c.a0()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h5 = this.f7166c.h() + this.f7166c.Z();
            do {
                list.add(Long.valueOf(this.f7166c.a0()));
            } while (this.f7166c.h() < h5);
            Y(h5);
            return;
        }
        y1 y1Var = (y1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 0) {
            do {
                y1Var.e0(this.f7166c.a0());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h6 = this.f7166c.h() + this.f7166c.Z();
        do {
            y1Var.e0(this.f7166c.a0());
        } while (this.f7166c.h() < h6);
        Y(h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public <T> T o(Class<T> cls, s0 s0Var) throws IOException {
        Z(3);
        return (T) V(c3.a().i(cls), s0Var);
    }

    @Override // android.content.preferences.protobuf.h3
    public <T> void p(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
        O(list, c3.a().i(cls), s0Var);
    }

    @Override // android.content.preferences.protobuf.h3
    public int q() throws IOException {
        Z(0);
        return this.f7166c.Z();
    }

    @Override // android.content.preferences.protobuf.h3
    public void r(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof y1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 0) {
                do {
                    list.add(Long.valueOf(this.f7166c.G()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h5 = this.f7166c.h() + this.f7166c.Z();
            do {
                list.add(Long.valueOf(this.f7166c.G()));
            } while (this.f7166c.h() < h5);
            Y(h5);
            return;
        }
        y1 y1Var = (y1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 0) {
            do {
                y1Var.e0(this.f7166c.G());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h6 = this.f7166c.h() + this.f7166c.Z();
        do {
            y1Var.e0(this.f7166c.G());
        } while (this.f7166c.h() < h6);
        Y(h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public double readDouble() throws IOException {
        Z(1);
        return this.f7166c.y();
    }

    @Override // android.content.preferences.protobuf.h3
    public float readFloat() throws IOException {
        Z(5);
        return this.f7166c.C();
    }

    @Override // android.content.preferences.protobuf.h3
    public void s(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof y1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 1) {
                do {
                    list.add(Long.valueOf(this.f7166c.T()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int Z = this.f7166c.Z();
            b0(Z);
            int h5 = this.f7166c.h() + Z;
            do {
                list.add(Long.valueOf(this.f7166c.T()));
            } while (this.f7166c.h() < h5);
            return;
        }
        y1 y1Var = (y1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 1) {
            do {
                y1Var.e0(this.f7166c.T());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int Z2 = this.f7166c.Z();
        b0(Z2);
        int h6 = this.f7166c.h() + Z2;
        do {
            y1Var.e0(this.f7166c.T());
        } while (this.f7166c.h() < h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public void t(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7166c.F()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h5 = this.f7166c.h() + this.f7166c.Z();
            do {
                list.add(Integer.valueOf(this.f7166c.F()));
            } while (this.f7166c.h() < h5);
            Y(h5);
            return;
        }
        n1 n1Var = (n1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 0) {
            do {
                n1Var.D(this.f7166c.F());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h6 = this.f7166c.h() + this.f7166c.Z();
        do {
            n1Var.D(this.f7166c.F());
        } while (this.f7166c.h() < h6);
        Y(h6);
    }

    @Override // android.content.preferences.protobuf.h3
    public void u(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7166c.z()));
                    if (this.f7166c.i()) {
                        return;
                    } else {
                        Y = this.f7166c.Y();
                    }
                } while (Y == this.f7167d);
                this.f7169f = Y;
                return;
            }
            if (b6 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h5 = this.f7166c.h() + this.f7166c.Z();
            do {
                list.add(Integer.valueOf(this.f7166c.z()));
            } while (this.f7166c.h() < h5);
            Y(h5);
            return;
        }
        n1 n1Var = (n1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 0) {
            do {
                n1Var.D(this.f7166c.z());
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y2 = this.f7166c.Y();
                }
            } while (Y2 == this.f7167d);
            this.f7169f = Y2;
            return;
        }
        if (b7 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h6 = this.f7166c.h() + this.f7166c.Z();
        do {
            n1Var.D(this.f7166c.z());
        } while (this.f7166c.h() < h6);
        Y(h6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.preferences.protobuf.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void v(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.a2.b<K, V> r9, android.content.preferences.protobuf.s0 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.Z(r0)
            androidx.datastore.preferences.protobuf.z r1 = r7.f7166c
            int r1 = r1.Z()
            androidx.datastore.preferences.protobuf.z r2 = r7.f7166c
            int r1 = r2.t(r1)
            K r2 = r9.f7178b
            V r3 = r9.f7180d
        L14:
            int r4 = r7.C()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            androidx.datastore.preferences.protobuf.z r5 = r7.f7166c     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.i()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.K()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            androidx.datastore.preferences.protobuf.q4$b r4 = r9.f7179c     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.f7180d     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.U(r4, r5, r10)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            androidx.datastore.preferences.protobuf.q4$b r4 = r9.f7177a     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.U(r4, r5, r5)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.K()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            androidx.datastore.preferences.protobuf.z r8 = r7.f7166c
            r8.s(r1)
            return
        L65:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.z r9 = r7.f7166c
            r9.s(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.a0.v(java.util.Map, androidx.datastore.preferences.protobuf.a2$b, androidx.datastore.preferences.protobuf.s0):void");
    }

    @Override // android.content.preferences.protobuf.h3
    public int w() throws IOException {
        Z(0);
        return this.f7166c.z();
    }

    @Override // android.content.preferences.protobuf.h3
    public void x(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b6 = q4.b(this.f7167d);
            if (b6 == 2) {
                int Z = this.f7166c.Z();
                a0(Z);
                int h5 = this.f7166c.h() + Z;
                do {
                    list.add(Integer.valueOf(this.f7166c.A()));
                } while (this.f7166c.h() < h5);
                return;
            }
            if (b6 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f7166c.A()));
                if (this.f7166c.i()) {
                    return;
                } else {
                    Y = this.f7166c.Y();
                }
            } while (Y == this.f7167d);
            this.f7169f = Y;
            return;
        }
        n1 n1Var = (n1) list;
        int b7 = q4.b(this.f7167d);
        if (b7 == 2) {
            int Z2 = this.f7166c.Z();
            a0(Z2);
            int h6 = this.f7166c.h() + Z2;
            do {
                n1Var.D(this.f7166c.A());
            } while (this.f7166c.h() < h6);
            return;
        }
        if (b7 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            n1Var.D(this.f7166c.A());
            if (this.f7166c.i()) {
                return;
            } else {
                Y2 = this.f7166c.Y();
            }
        } while (Y2 == this.f7167d);
        this.f7169f = Y2;
    }

    @Override // android.content.preferences.protobuf.h3
    public int y() throws IOException {
        Z(0);
        return this.f7166c.U();
    }

    @Override // android.content.preferences.protobuf.h3
    public long z() throws IOException {
        Z(0);
        return this.f7166c.V();
    }
}

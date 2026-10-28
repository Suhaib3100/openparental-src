package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.t4;
import java.io.IOException;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes3.dex */
final class a0 implements k3 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f28617g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f28618h = 7;

    /* renamed from: i, reason: collision with root package name */
    private static final int f28619i = 0;

    /* renamed from: c, reason: collision with root package name */
    private final z f28620c;

    /* renamed from: d, reason: collision with root package name */
    private int f28621d;

    /* renamed from: e, reason: collision with root package name */
    private int f28622e;

    /* renamed from: f, reason: collision with root package name */
    private int f28623f = 0;

    /* compiled from: CodedInputStreamReader.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28624a;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28624a = iArr;
            try {
                iArr[t4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28624a[t4.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28624a[t4.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28624a[t4.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28624a[t4.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28624a[t4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28624a[t4.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28624a[t4.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28624a[t4.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28624a[t4.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28624a[t4.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28624a[t4.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28624a[t4.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28624a[t4.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28624a[t4.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28624a[t4.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28624a[t4.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private a0(z zVar) {
        z zVar2 = (z) p1.e(zVar, "input");
        this.f28620c = zVar2;
        zVar2.f29077d = this;
    }

    public static a0 S(z zVar) {
        a0 a0Var = zVar.f29077d;
        return a0Var != null ? a0Var : new a0(zVar);
    }

    private Object T(t4.b bVar, Class<?> cls, s0 s0Var) throws IOException {
        switch (a.f28624a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(y());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(Q());
            case 10:
                return v(cls, s0Var);
            case 11:
                return Integer.valueOf(N());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(F());
            case 15:
                return R();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(u());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T U(m3<T> m3Var, s0 s0Var) throws IOException {
        int i4 = this.f28622e;
        this.f28622e = (t4.a(this.f28621d) << 3) | 4;
        try {
            T f4 = m3Var.f();
            m3Var.b(f4, this, s0Var);
            m3Var.c(f4);
            if (this.f28621d == this.f28622e) {
                return f4;
            }
            throw InvalidProtocolBufferException.h();
        } finally {
            this.f28622e = i4;
        }
    }

    private <T> T V(m3<T> m3Var, s0 s0Var) throws IOException {
        int Z = this.f28620c.Z();
        z zVar = this.f28620c;
        if (zVar.f29074a >= zVar.f29075b) {
            throw InvalidProtocolBufferException.i();
        }
        int t4 = zVar.t(Z);
        T f4 = m3Var.f();
        this.f28620c.f29074a++;
        m3Var.b(f4, this, s0Var);
        m3Var.c(f4);
        this.f28620c.a(0);
        r5.f29074a--;
        this.f28620c.s(t4);
        return f4;
    }

    private void X(int i4) throws IOException {
        if (this.f28620c.h() != i4) {
            throw InvalidProtocolBufferException.l();
        }
    }

    private void Y(int i4) throws IOException {
        if (t4.b(this.f28621d) != i4) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void Z(int i4) throws IOException {
        if ((i4 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void a0(int i4) throws IOException {
        if ((i4 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // androidx.content.preferences.protobuf.k3
    public <T> void A(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
        q(list, f3.a().i(cls), s0Var);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void B(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof z1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 1) {
                do {
                    list.add(Long.valueOf(this.f28620c.T()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int Z = this.f28620c.Z();
            a0(Z);
            int h4 = this.f28620c.h() + Z;
            do {
                list.add(Long.valueOf(this.f28620c.T()));
            } while (this.f28620c.h() < h4);
            return;
        }
        z1 z1Var = (z1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 1) {
            do {
                z1Var.D2(this.f28620c.T());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int Z2 = this.f28620c.Z();
        a0(Z2);
        int h5 = this.f28620c.h() + Z2;
        do {
            z1Var.D2(this.f28620c.T());
        } while (this.f28620c.h() < h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void C(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 0) {
                do {
                    list.add(Integer.valueOf(this.f28620c.F()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h4 = this.f28620c.h() + this.f28620c.Z();
            do {
                list.add(Integer.valueOf(this.f28620c.F()));
            } while (this.f28620c.h() < h4);
            X(h4);
            return;
        }
        n1 n1Var = (n1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 0) {
            do {
                n1Var.o2(this.f28620c.F());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h5 = this.f28620c.h() + this.f28620c.Z();
        do {
            n1Var.o2(this.f28620c.F());
        } while (this.f28620c.h() < h5);
        X(h5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f28620c.s(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.k3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void D(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.b2.b<K, V> r9, androidx.content.preferences.protobuf.s0 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            androidx.datastore.preferences.protobuf.z r1 = r7.f28620c
            int r1 = r1.Z()
            androidx.datastore.preferences.protobuf.z r2 = r7.f28620c
            int r1 = r2.t(r1)
            K r2 = r9.f28641b
            V r3 = r9.f28643d
        L14:
            int r4 = r7.H()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.z r5 = r7.f28620c     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.i()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.M()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.t4$b r4 = r9.f28642c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.f28643d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.t4$b r4 = r9.f28640a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.M()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.z r8 = r7.f28620c
            r8.s(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.z r9 = r7.f28620c
            r9.s(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.a0.D(java.util.Map, androidx.datastore.preferences.protobuf.b2$b, androidx.datastore.preferences.protobuf.s0):void");
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void E(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 2) {
                int Z = this.f28620c.Z();
                Z(Z);
                int h4 = this.f28620c.h() + Z;
                do {
                    list.add(Integer.valueOf(this.f28620c.A()));
                } while (this.f28620c.h() < h4);
                return;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f28620c.A()));
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y = this.f28620c.Y();
                }
            } while (Y == this.f28621d);
            this.f28623f = Y;
            return;
        }
        n1 n1Var = (n1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 2) {
            int Z2 = this.f28620c.Z();
            Z(Z2);
            int h5 = this.f28620c.h() + Z2;
            do {
                n1Var.o2(this.f28620c.A());
            } while (this.f28620c.h() < h5);
            return;
        }
        if (b6 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            n1Var.o2(this.f28620c.A());
            if (this.f28620c.i()) {
                return;
            } else {
                Y2 = this.f28620c.Y();
            }
        } while (Y2 == this.f28621d);
        this.f28623f = Y2;
    }

    @Override // androidx.content.preferences.protobuf.k3
    public long F() throws IOException {
        Y(0);
        return this.f28620c.V();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public String G() throws IOException {
        Y(2);
        return this.f28620c.W();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public int H() throws IOException {
        int i4 = this.f28623f;
        if (i4 != 0) {
            this.f28621d = i4;
            this.f28623f = 0;
        } else {
            this.f28621d = this.f28620c.Y();
        }
        int i5 = this.f28621d;
        if (i5 == 0 || i5 == this.f28622e) {
            return Integer.MAX_VALUE;
        }
        return t4.a(i5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void I(List<String> list) throws IOException {
        W(list, false);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void J(List<Float> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof e1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 2) {
                int Z = this.f28620c.Z();
                Z(Z);
                int h4 = this.f28620c.h() + Z;
                do {
                    list.add(Float.valueOf(this.f28620c.C()));
                } while (this.f28620c.h() < h4);
                return;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f28620c.C()));
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y = this.f28620c.Y();
                }
            } while (Y == this.f28621d);
            this.f28623f = Y;
            return;
        }
        e1 e1Var = (e1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 2) {
            int Z2 = this.f28620c.Z();
            Z(Z2);
            int h5 = this.f28620c.h() + Z2;
            do {
                e1Var.Y(this.f28620c.C());
            } while (this.f28620c.h() < h5);
            return;
        }
        if (b6 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            e1Var.Y(this.f28620c.C());
            if (this.f28620c.i()) {
                return;
            } else {
                Y2 = this.f28620c.Y();
            }
        } while (Y2 == this.f28621d);
        this.f28623f = Y2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.k3
    public <T> void K(List<T> list, m3<T> m3Var, s0 s0Var) throws IOException {
        int Y;
        if (t4.b(this.f28621d) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i4 = this.f28621d;
        do {
            list.add(U(m3Var, s0Var));
            if (this.f28620c.i() || this.f28623f != 0) {
                return;
            } else {
                Y = this.f28620c.Y();
            }
        } while (Y == i4);
        this.f28623f = Y;
    }

    @Override // androidx.content.preferences.protobuf.k3
    public boolean L() {
        return this.f28620c.f0();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public boolean M() throws IOException {
        int i4;
        if (this.f28620c.i() || (i4 = this.f28621d) == this.f28622e) {
            return false;
        }
        return this.f28620c.g0(i4);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public int N() throws IOException {
        Y(5);
        return this.f28620c.S();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void O(List<w> list) throws IOException {
        int Y;
        if (t4.b(this.f28621d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(o());
            if (this.f28620c.i()) {
                return;
            } else {
                Y = this.f28620c.Y();
            }
        } while (Y == this.f28621d);
        this.f28623f = Y;
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void P(List<Double> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof c0)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 1) {
                do {
                    list.add(Double.valueOf(this.f28620c.y()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int Z = this.f28620c.Z();
            a0(Z);
            int h4 = this.f28620c.h() + Z;
            do {
                list.add(Double.valueOf(this.f28620c.y()));
            } while (this.f28620c.h() < h4);
            return;
        }
        c0 c0Var = (c0) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 1) {
            do {
                c0Var.V2(this.f28620c.y());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int Z2 = this.f28620c.Z();
        a0(Z2);
        int h5 = this.f28620c.h() + Z2;
        do {
            c0Var.V2(this.f28620c.y());
        } while (this.f28620c.h() < h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public long Q() throws IOException {
        Y(0);
        return this.f28620c.G();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public String R() throws IOException {
        Y(2);
        return this.f28620c.X();
    }

    public void W(List<String> list, boolean z4) throws IOException {
        int Y;
        int Y2;
        if (t4.b(this.f28621d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof v1) || z4) {
            do {
                list.add(z4 ? R() : G());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y = this.f28620c.Y();
                }
            } while (Y == this.f28621d);
            this.f28623f = Y;
            return;
        }
        v1 v1Var = (v1) list;
        do {
            v1Var.w2(o());
            if (this.f28620c.i()) {
                return;
            } else {
                Y2 = this.f28620c.Y();
            }
        } while (Y2 == this.f28621d);
        this.f28623f = Y2;
    }

    @Override // androidx.content.preferences.protobuf.k3
    public <T> T a(m3<T> m3Var, s0 s0Var) throws IOException {
        Y(2);
        return (T) V(m3Var, s0Var);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public long b() throws IOException {
        Y(1);
        return this.f28620c.B();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void c(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 2) {
                int Z = this.f28620c.Z();
                Z(Z);
                int h4 = this.f28620c.h() + Z;
                do {
                    list.add(Integer.valueOf(this.f28620c.S()));
                } while (this.f28620c.h() < h4);
                return;
            }
            if (b5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f28620c.S()));
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y = this.f28620c.Y();
                }
            } while (Y == this.f28621d);
            this.f28623f = Y;
            return;
        }
        n1 n1Var = (n1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 2) {
            int Z2 = this.f28620c.Z();
            Z(Z2);
            int h5 = this.f28620c.h() + Z2;
            do {
                n1Var.o2(this.f28620c.S());
            } while (this.f28620c.h() < h5);
            return;
        }
        if (b6 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            n1Var.o2(this.f28620c.S());
            if (this.f28620c.i()) {
                return;
            } else {
                Y2 = this.f28620c.Y();
            }
        } while (Y2 == this.f28621d);
        this.f28623f = Y2;
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void d(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof z1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 0) {
                do {
                    list.add(Long.valueOf(this.f28620c.V()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h4 = this.f28620c.h() + this.f28620c.Z();
            do {
                list.add(Long.valueOf(this.f28620c.V()));
            } while (this.f28620c.h() < h4);
            X(h4);
            return;
        }
        z1 z1Var = (z1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 0) {
            do {
                z1Var.D2(this.f28620c.V());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h5 = this.f28620c.h() + this.f28620c.Z();
        do {
            z1Var.D2(this.f28620c.V());
        } while (this.f28620c.h() < h5);
        X(h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public boolean e() throws IOException {
        Y(0);
        return this.f28620c.u();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public long f() throws IOException {
        Y(1);
        return this.f28620c.T();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void g(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof z1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 0) {
                do {
                    list.add(Long.valueOf(this.f28620c.a0()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h4 = this.f28620c.h() + this.f28620c.Z();
            do {
                list.add(Long.valueOf(this.f28620c.a0()));
            } while (this.f28620c.h() < h4);
            X(h4);
            return;
        }
        z1 z1Var = (z1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 0) {
            do {
                z1Var.D2(this.f28620c.a0());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h5 = this.f28620c.h() + this.f28620c.Z();
        do {
            z1Var.D2(this.f28620c.a0());
        } while (this.f28620c.h() < h5);
        X(h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public int getTag() {
        return this.f28621d;
    }

    @Override // androidx.content.preferences.protobuf.k3
    public int h() throws IOException {
        Y(0);
        return this.f28620c.Z();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void i(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof z1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 0) {
                do {
                    list.add(Long.valueOf(this.f28620c.G()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h4 = this.f28620c.h() + this.f28620c.Z();
            do {
                list.add(Long.valueOf(this.f28620c.G()));
            } while (this.f28620c.h() < h4);
            X(h4);
            return;
        }
        z1 z1Var = (z1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 0) {
            do {
                z1Var.D2(this.f28620c.G());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h5 = this.f28620c.h() + this.f28620c.Z();
        do {
            z1Var.D2(this.f28620c.G());
        } while (this.f28620c.h() < h5);
        X(h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void j(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 0) {
                do {
                    list.add(Integer.valueOf(this.f28620c.z()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h4 = this.f28620c.h() + this.f28620c.Z();
            do {
                list.add(Integer.valueOf(this.f28620c.z()));
            } while (this.f28620c.h() < h4);
            X(h4);
            return;
        }
        n1 n1Var = (n1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 0) {
            do {
                n1Var.o2(this.f28620c.z());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h5 = this.f28620c.h() + this.f28620c.Z();
        do {
            n1Var.o2(this.f28620c.z());
        } while (this.f28620c.h() < h5);
        X(h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public int k() throws IOException {
        Y(0);
        return this.f28620c.z();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public int l() throws IOException {
        Y(0);
        return this.f28620c.U();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void m(List<Boolean> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof s)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f28620c.u()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h4 = this.f28620c.h() + this.f28620c.Z();
            do {
                list.add(Boolean.valueOf(this.f28620c.u()));
            } while (this.f28620c.h() < h4);
            X(h4);
            return;
        }
        s sVar = (s) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 0) {
            do {
                sVar.N0(this.f28620c.u());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h5 = this.f28620c.h() + this.f28620c.Z();
        do {
            sVar.N0(this.f28620c.u());
        } while (this.f28620c.h() < h5);
        X(h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void n(List<String> list) throws IOException {
        W(list, true);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public w o() throws IOException {
        Y(2);
        return this.f28620c.x();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public int p() throws IOException {
        Y(0);
        return this.f28620c.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.k3
    public <T> void q(List<T> list, m3<T> m3Var, s0 s0Var) throws IOException {
        int Y;
        if (t4.b(this.f28621d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i4 = this.f28621d;
        do {
            list.add(V(m3Var, s0Var));
            if (this.f28620c.i() || this.f28623f != 0) {
                return;
            } else {
                Y = this.f28620c.Y();
            }
        } while (Y == i4);
        this.f28623f = Y;
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void r(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof z1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 1) {
                do {
                    list.add(Long.valueOf(this.f28620c.B()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int Z = this.f28620c.Z();
            a0(Z);
            int h4 = this.f28620c.h() + Z;
            do {
                list.add(Long.valueOf(this.f28620c.B()));
            } while (this.f28620c.h() < h4);
            return;
        }
        z1 z1Var = (z1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 1) {
            do {
                z1Var.D2(this.f28620c.B());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int Z2 = this.f28620c.Z();
        a0(Z2);
        int h5 = this.f28620c.h() + Z2;
        do {
            z1Var.D2(this.f28620c.B());
        } while (this.f28620c.h() < h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public double readDouble() throws IOException {
        Y(1);
        return this.f28620c.y();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public float readFloat() throws IOException {
        Y(5);
        return this.f28620c.C();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public <T> T s(m3<T> m3Var, s0 s0Var) throws IOException {
        Y(3);
        return (T) U(m3Var, s0Var);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void t(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 0) {
                do {
                    list.add(Integer.valueOf(this.f28620c.U()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h4 = this.f28620c.h() + this.f28620c.Z();
            do {
                list.add(Integer.valueOf(this.f28620c.U()));
            } while (this.f28620c.h() < h4);
            X(h4);
            return;
        }
        n1 n1Var = (n1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 0) {
            do {
                n1Var.o2(this.f28620c.U());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h5 = this.f28620c.h() + this.f28620c.Z();
        do {
            n1Var.o2(this.f28620c.U());
        } while (this.f28620c.h() < h5);
        X(h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public long u() throws IOException {
        Y(0);
        return this.f28620c.a0();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public <T> T v(Class<T> cls, s0 s0Var) throws IOException {
        Y(2);
        return (T) V(f3.a().i(cls), s0Var);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public <T> void w(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
        K(list, f3.a().i(cls), s0Var);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public void x(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (!(list instanceof n1)) {
            int b5 = t4.b(this.f28621d);
            if (b5 == 0) {
                do {
                    list.add(Integer.valueOf(this.f28620c.Z()));
                    if (this.f28620c.i()) {
                        return;
                    } else {
                        Y = this.f28620c.Y();
                    }
                } while (Y == this.f28621d);
                this.f28623f = Y;
                return;
            }
            if (b5 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int h4 = this.f28620c.h() + this.f28620c.Z();
            do {
                list.add(Integer.valueOf(this.f28620c.Z()));
            } while (this.f28620c.h() < h4);
            X(h4);
            return;
        }
        n1 n1Var = (n1) list;
        int b6 = t4.b(this.f28621d);
        if (b6 == 0) {
            do {
                n1Var.o2(this.f28620c.Z());
                if (this.f28620c.i()) {
                    return;
                } else {
                    Y2 = this.f28620c.Y();
                }
            } while (Y2 == this.f28621d);
            this.f28623f = Y2;
            return;
        }
        if (b6 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int h5 = this.f28620c.h() + this.f28620c.Z();
        do {
            n1Var.o2(this.f28620c.Z());
        } while (this.f28620c.h() < h5);
        X(h5);
    }

    @Override // androidx.content.preferences.protobuf.k3
    public int y() throws IOException {
        Y(5);
        return this.f28620c.A();
    }

    @Override // androidx.content.preferences.protobuf.k3
    public <T> T z(Class<T> cls, s0 s0Var) throws IOException {
        Y(3);
        return (T) U(f3.a().i(cls), s0Var);
    }
}

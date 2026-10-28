package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a2;
import android.content.preferences.protobuf.q4;
import android.content.preferences.protobuf.s4;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes3.dex */
final class b0 implements s4 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f7182a;

    /* compiled from: CodedOutputStreamWriter.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7183a;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7183a = iArr;
            try {
                iArr[q4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7183a[q4.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7183a[q4.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7183a[q4.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7183a[q4.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7183a[q4.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7183a[q4.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7183a[q4.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7183a[q4.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7183a[q4.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7183a[q4.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7183a[q4.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private b0(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) o1.e(codedOutputStream, "output");
        this.f7182a = codedOutputStream2;
        codedOutputStream2.f7131a = this;
    }

    public static b0 T(CodedOutputStream codedOutputStream) {
        b0 b0Var = codedOutputStream.f7131a;
        return b0Var != null ? b0Var : new b0(codedOutputStream);
    }

    private <V> void V(int i5, boolean z5, V v5, a2.b<Boolean, V> bVar) throws IOException {
        this.f7182a.g2(i5, 2);
        this.f7182a.h2(a2.b(bVar, Boolean.valueOf(z5), v5));
        a2.l(this.f7182a, bVar, Boolean.valueOf(z5), v5);
    }

    private <V> void W(int i5, a2.b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            iArr[i6] = it.next().intValue();
            i6++;
        }
        Arrays.sort(iArr);
        for (int i7 = 0; i7 < size; i7++) {
            int i8 = iArr[i7];
            V v5 = map.get(Integer.valueOf(i8));
            this.f7182a.g2(i5, 2);
            this.f7182a.h2(a2.b(bVar, Integer.valueOf(i8), v5));
            a2.l(this.f7182a, bVar, Integer.valueOf(i8), v5);
        }
    }

    private <V> void X(int i5, a2.b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            jArr[i6] = it.next().longValue();
            i6++;
        }
        Arrays.sort(jArr);
        for (int i7 = 0; i7 < size; i7++) {
            long j5 = jArr[i7];
            V v5 = map.get(Long.valueOf(j5));
            this.f7182a.g2(i5, 2);
            this.f7182a.h2(a2.b(bVar, Long.valueOf(j5), v5));
            a2.l(this.f7182a, bVar, Long.valueOf(j5), v5);
        }
    }

    private <K, V> void Y(int i5, a2.b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (a.f7183a[bVar.f7177a.ordinal()]) {
            case 1:
                V v5 = map.get(Boolean.FALSE);
                if (v5 != null) {
                    V(i5, false, v5, bVar);
                }
                V v6 = map.get(Boolean.TRUE);
                if (v6 != null) {
                    V(i5, true, v6, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                W(i5, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                X(i5, bVar, map);
                return;
            case 12:
                Z(i5, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f7177a);
        }
    }

    private <V> void Z(int i5, a2.b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            strArr[i6] = it.next();
            i6++;
        }
        Arrays.sort(strArr);
        for (int i7 = 0; i7 < size; i7++) {
            String str = strArr[i7];
            V v5 = map.get(str);
            this.f7182a.g2(i5, 2);
            this.f7182a.h2(a2.b(bVar, str, v5));
            a2.l(this.f7182a, bVar, str, v5);
        }
    }

    private void a0(int i5, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f7182a.o(i5, (String) obj);
        } else {
            this.f7182a.z(i5, (w) obj);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void A(int i5, long j5) throws IOException {
        this.f7182a.A(i5, j5);
    }

    @Override // android.content.preferences.protobuf.s4
    public void B(int i5, List<Integer> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.d(i5, list.get(i6).intValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.get(i8).intValue();
            i7 += 4;
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.C1(list.get(i6).intValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void C(int i5, Object obj, j3 j3Var) throws IOException {
        this.f7182a.M1(i5, (h2) obj, j3Var);
    }

    @Override // android.content.preferences.protobuf.s4
    public void D(int i5, List<Boolean> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.t(i5, list.get(i6).booleanValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.get(i8).booleanValue();
            i7++;
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.t1(list.get(i6).booleanValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void E(int i5, Object obj) throws IOException {
        this.f7182a.F1(i5, (h2) obj);
    }

    @Override // android.content.preferences.protobuf.s4
    public void F(int i5, List<Integer> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.b(i5, list.get(i6).intValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += CodedOutputStream.Z0(list.get(i8).intValue());
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.h2(list.get(i6).intValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void G(int i5, List<Long> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.H(i5, list.get(i6).longValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += CodedOutputStream.U0(list.get(i8).longValue());
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.e2(list.get(i6).longValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void H(int i5, long j5) throws IOException {
        this.f7182a.H(i5, j5);
    }

    @Override // android.content.preferences.protobuf.s4
    public void I(int i5, float f6) throws IOException {
        this.f7182a.I(i5, f6);
    }

    @Override // android.content.preferences.protobuf.s4
    public void J(int i5) throws IOException {
        this.f7182a.g2(i5, 4);
    }

    @Override // android.content.preferences.protobuf.s4
    public void K(int i5, List<Integer> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.Q(i5, list.get(i6).intValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += CodedOutputStream.S0(list.get(i8).intValue());
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.d2(list.get(i6).intValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void L(int i5, int i6) throws IOException {
        this.f7182a.L(i5, i6);
    }

    @Override // android.content.preferences.protobuf.s4
    public void M(int i5, List<Long> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.s(i5, list.get(i6).longValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += CodedOutputStream.b1(list.get(i8).longValue());
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.K1(list.get(i6).longValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void N(int i5, List<Integer> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.L(i5, list.get(i6).intValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += CodedOutputStream.x0(list.get(i8).intValue());
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.B1(list.get(i6).intValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void O(int i5, List<Double> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.e(i5, list.get(i6).doubleValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.get(i8).doubleValue();
            i7 += 8;
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.A1(list.get(i6).doubleValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public <K, V> void P(int i5, a2.b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f7182a.h1()) {
            Y(i5, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f7182a.g2(i5, 2);
            this.f7182a.h2(a2.b(bVar, entry.getKey(), entry.getValue()));
            a2.l(this.f7182a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void Q(int i5, int i6) throws IOException {
        this.f7182a.Q(i5, i6);
    }

    @Override // android.content.preferences.protobuf.s4
    public void R(int i5, List<w> list) throws IOException {
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.f7182a.z(i5, list.get(i6));
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void S(int i5, Object obj, j3 j3Var) throws IOException {
        this.f7182a.G1(i5, (h2) obj, j3Var);
    }

    public int U() {
        return this.f7182a.f1();
    }

    @Override // android.content.preferences.protobuf.s4
    public void a(int i5, List<Float> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.I(i5, list.get(i6).floatValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.get(i8).floatValue();
            i7 += 4;
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.E1(list.get(i6).floatValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void b(int i5, int i6) throws IOException {
        this.f7182a.b(i5, i6);
    }

    @Override // android.content.preferences.protobuf.s4
    public final void c(int i5, Object obj) throws IOException {
        if (obj instanceof w) {
            this.f7182a.Y1(i5, (w) obj);
        } else {
            this.f7182a.P1(i5, (h2) obj);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void d(int i5, int i6) throws IOException {
        this.f7182a.d(i5, i6);
    }

    @Override // android.content.preferences.protobuf.s4
    public void e(int i5, double d6) throws IOException {
        this.f7182a.e(i5, d6);
    }

    @Override // android.content.preferences.protobuf.s4
    public void f(int i5, List<Long> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.A(i5, list.get(i6).longValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.get(i8).longValue();
            i7 += 8;
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.c2(list.get(i6).longValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void g(int i5, List<Long> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.p(i5, list.get(i6).longValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += CodedOutputStream.b1(list.get(i8).longValue());
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.i2(list.get(i6).longValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void h(int i5, List<?> list) throws IOException {
        for (int i6 = 0; i6 < list.size(); i6++) {
            E(i5, list.get(i6));
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void i(int i5, long j5) throws IOException {
        this.f7182a.i(i5, j5);
    }

    @Override // android.content.preferences.protobuf.s4
    public s4.a j() {
        return s4.a.ASCENDING;
    }

    @Override // android.content.preferences.protobuf.s4
    public void k(int i5, List<?> list, j3 j3Var) throws IOException {
        for (int i6 = 0; i6 < list.size(); i6++) {
            C(i5, list.get(i6), j3Var);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void l(int i5, List<String> list) throws IOException {
        int i6 = 0;
        if (!(list instanceof u1)) {
            while (i6 < list.size()) {
                this.f7182a.o(i5, list.get(i6));
                i6++;
            }
        } else {
            u1 u1Var = (u1) list;
            while (i6 < list.size()) {
                a0(i5, u1Var.b1(i6));
                i6++;
            }
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void m(int i5, List<?> list, j3 j3Var) throws IOException {
        for (int i6 = 0; i6 < list.size(); i6++) {
            S(i5, list.get(i6), j3Var);
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void n(int i5, List<?> list) throws IOException {
        for (int i6 = 0; i6 < list.size(); i6++) {
            q(i5, list.get(i6));
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void o(int i5, String str) throws IOException {
        this.f7182a.o(i5, str);
    }

    @Override // android.content.preferences.protobuf.s4
    public void p(int i5, long j5) throws IOException {
        this.f7182a.p(i5, j5);
    }

    @Override // android.content.preferences.protobuf.s4
    public void q(int i5, Object obj) throws IOException {
        this.f7182a.L1(i5, (h2) obj);
    }

    @Override // android.content.preferences.protobuf.s4
    public void r(int i5, List<Integer> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.w(i5, list.get(i6).intValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += CodedOutputStream.x0(list.get(i8).intValue());
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.J1(list.get(i6).intValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void s(int i5, long j5) throws IOException {
        this.f7182a.s(i5, j5);
    }

    @Override // android.content.preferences.protobuf.s4
    public void t(int i5, boolean z5) throws IOException {
        this.f7182a.t(i5, z5);
    }

    @Override // android.content.preferences.protobuf.s4
    public void u(int i5, int i6) throws IOException {
        this.f7182a.u(i5, i6);
    }

    @Override // android.content.preferences.protobuf.s4
    public void v(int i5) throws IOException {
        this.f7182a.g2(i5, 3);
    }

    @Override // android.content.preferences.protobuf.s4
    public void w(int i5, int i6) throws IOException {
        this.f7182a.w(i5, i6);
    }

    @Override // android.content.preferences.protobuf.s4
    public void x(int i5, List<Long> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.i(i5, list.get(i6).longValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.get(i8).longValue();
            i7 += 8;
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.D1(list.get(i6).longValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void y(int i5, List<Integer> list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.f7182a.u(i5, list.get(i6).intValue());
                i6++;
            }
            return;
        }
        this.f7182a.g2(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.get(i8).intValue();
            i7 += 4;
        }
        this.f7182a.h2(i7);
        while (i6 < list.size()) {
            this.f7182a.b2(list.get(i6).intValue());
            i6++;
        }
    }

    @Override // android.content.preferences.protobuf.s4
    public void z(int i5, w wVar) throws IOException {
        this.f7182a.z(i5, wVar);
    }
}

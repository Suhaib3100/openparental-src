package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.b2;
import androidx.content.preferences.protobuf.t4;
import androidx.content.preferences.protobuf.v4;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes3.dex */
final class b0 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f28632a;

    /* compiled from: CodedOutputStreamWriter.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28633a;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28633a = iArr;
            try {
                iArr[t4.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28633a[t4.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28633a[t4.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28633a[t4.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28633a[t4.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28633a[t4.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28633a[t4.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28633a[t4.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28633a[t4.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28633a[t4.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28633a[t4.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28633a[t4.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private b0(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) p1.e(codedOutputStream, "output");
        this.f28632a = codedOutputStream2;
        codedOutputStream2.f28585a = this;
    }

    public static b0 T(CodedOutputStream codedOutputStream) {
        b0 b0Var = codedOutputStream.f28585a;
        return b0Var != null ? b0Var : new b0(codedOutputStream);
    }

    private <V> void V(int i4, boolean z4, V v4, b2.b<Boolean, V> bVar) throws IOException {
        this.f28632a.g2(i4, 2);
        this.f28632a.h2(b2.b(bVar, Boolean.valueOf(z4), v4));
        b2.l(this.f28632a, bVar, Boolean.valueOf(z4), v4);
    }

    private <V> void W(int i4, b2.b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr[i5] = it.next().intValue();
            i5++;
        }
        Arrays.sort(iArr);
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = iArr[i6];
            V v4 = map.get(Integer.valueOf(i7));
            this.f28632a.g2(i4, 2);
            this.f28632a.h2(b2.b(bVar, Integer.valueOf(i7), v4));
            b2.l(this.f28632a, bVar, Integer.valueOf(i7), v4);
        }
    }

    private <V> void X(int i4, b2.b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            jArr[i5] = it.next().longValue();
            i5++;
        }
        Arrays.sort(jArr);
        for (int i6 = 0; i6 < size; i6++) {
            long j4 = jArr[i6];
            V v4 = map.get(Long.valueOf(j4));
            this.f28632a.g2(i4, 2);
            this.f28632a.h2(b2.b(bVar, Long.valueOf(j4), v4));
            b2.l(this.f28632a, bVar, Long.valueOf(j4), v4);
        }
    }

    private <K, V> void Y(int i4, b2.b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (a.f28633a[bVar.f28640a.ordinal()]) {
            case 1:
                V v4 = map.get(Boolean.FALSE);
                if (v4 != null) {
                    V(i4, false, v4, bVar);
                }
                V v5 = map.get(Boolean.TRUE);
                if (v5 != null) {
                    V(i4, true, v5, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                W(i4, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                X(i4, bVar, map);
                return;
            case 12:
                Z(i4, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f28640a);
        }
    }

    private <V> void Z(int i4, b2.b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            strArr[i5] = it.next();
            i5++;
        }
        Arrays.sort(strArr);
        for (int i6 = 0; i6 < size; i6++) {
            String str = strArr[i6];
            V v4 = map.get(str);
            this.f28632a.g2(i4, 2);
            this.f28632a.h2(b2.b(bVar, str, v4));
            b2.l(this.f28632a, bVar, str, v4);
        }
    }

    private void a0(int i4, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f28632a.g(i4, (String) obj);
        } else {
            this.f28632a.k(i4, (w) obj);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void A(int i4, List<?> list, m3 m3Var) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            n(i4, list.get(i5), m3Var);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void B(int i4, List<?> list) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            C(i4, list.get(i5));
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void C(int i4, Object obj) throws IOException {
        this.f28632a.L1(i4, (i2) obj);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void D(int i4, long j4) throws IOException {
        this.f28632a.h(i4, j4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void E(int i4, boolean z4) throws IOException {
        this.f28632a.E(i4, z4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void F(int i4, int i5) throws IOException {
        this.f28632a.c(i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void G(int i4) throws IOException {
        this.f28632a.g2(i4, 3);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void H(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.y(i4, list.get(i5).longValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            list.get(i7).longValue();
            i6 += 8;
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.D1(list.get(i5).longValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void I(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.c(i4, list.get(i5).intValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            list.get(i7).intValue();
            i6 += 4;
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.C1(list.get(i5).intValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void J(int i4, List<Boolean> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.E(i4, list.get(i5).booleanValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            list.get(i7).booleanValue();
            i6++;
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.T(list.get(i5).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void K(int i4, Object obj) throws IOException {
        this.f28632a.F1(i4, (i2) obj);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void L(int i4, float f4) throws IOException {
        this.f28632a.L(i4, f4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void M(int i4) throws IOException {
        this.f28632a.g2(i4, 4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void N(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.R(i4, list.get(i5).intValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += CodedOutputStream.S0(list.get(i7).intValue());
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.d2(list.get(i5).intValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void O(int i4, int i5) throws IOException {
        this.f28632a.j(i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void P(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.h(i4, list.get(i5).longValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += CodedOutputStream.b1(list.get(i7).longValue());
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.i2(list.get(i5).longValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void Q(int i4, List<Double> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.v(i4, list.get(i5).doubleValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            list.get(i7).doubleValue();
            i6 += 8;
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.A1(list.get(i5).doubleValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void R(int i4, int i5) throws IOException {
        this.f28632a.R(i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void S(int i4, List<w> list) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f28632a.k(i4, list.get(i5));
        }
    }

    public int U() {
        return this.f28632a.f1();
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void a(int i4, List<Float> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.L(i4, list.get(i5).floatValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            list.get(i7).floatValue();
            i6 += 4;
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.E1(list.get(i5).floatValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public final void b(int i4, Object obj) throws IOException {
        if (obj instanceof w) {
            this.f28632a.Y1(i4, (w) obj);
        } else {
            this.f28632a.P1(i4, (i2) obj);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void c(int i4, int i5) throws IOException {
        this.f28632a.c(i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void d(int i4, List<?> list) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            K(i4, list.get(i5));
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void e(int i4, List<String> list) throws IOException {
        int i5 = 0;
        if (!(list instanceof v1)) {
            while (i5 < list.size()) {
                this.f28632a.g(i4, list.get(i5));
                i5++;
            }
        } else {
            v1 v1Var = (v1) list;
            while (i5 < list.size()) {
                a0(i4, v1Var.D3(i5));
                i5++;
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void f(int i4, List<?> list, m3 m3Var) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            t(i4, list.get(i5), m3Var);
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void g(int i4, String str) throws IOException {
        this.f28632a.g(i4, str);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void h(int i4, long j4) throws IOException {
        this.f28632a.h(i4, j4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void i(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.j(i4, list.get(i5).intValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += CodedOutputStream.x0(list.get(i7).intValue());
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.J1(list.get(i5).intValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void j(int i4, int i5) throws IOException {
        this.f28632a.j(i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void k(int i4, w wVar) throws IOException {
        this.f28632a.k(i4, wVar);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void l(int i4, long j4) throws IOException {
        this.f28632a.y(i4, j4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void m(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.c(i4, list.get(i5).intValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            list.get(i7).intValue();
            i6 += 4;
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.C1(list.get(i5).intValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void n(int i4, Object obj, m3 m3Var) throws IOException {
        this.f28632a.M1(i4, (i2) obj, m3Var);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void o(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.u(i4, list.get(i5).intValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += CodedOutputStream.Z0(list.get(i7).intValue());
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.h2(list.get(i5).intValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void p(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.q(i4, list.get(i5).longValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += CodedOutputStream.U0(list.get(i7).longValue());
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.e2(list.get(i5).longValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void q(int i4, long j4) throws IOException {
        this.f28632a.q(i4, j4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void r(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.j(i4, list.get(i5).intValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += CodedOutputStream.x0(list.get(i7).intValue());
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.J1(list.get(i5).intValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public <K, V> void s(int i4, b2.b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f28632a.h1()) {
            Y(i4, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f28632a.g2(i4, 2);
            this.f28632a.h2(b2.b(bVar, entry.getKey(), entry.getValue()));
            b2.l(this.f28632a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void t(int i4, Object obj, m3 m3Var) throws IOException {
        this.f28632a.G1(i4, (i2) obj, m3Var);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void u(int i4, int i5) throws IOException {
        this.f28632a.u(i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void v(int i4, double d5) throws IOException {
        this.f28632a.v(i4, d5);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void w(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.y(i4, list.get(i5).longValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            list.get(i7).longValue();
            i6 += 8;
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.D1(list.get(i5).longValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void x(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.f28632a.h(i4, list.get(i5).longValue());
                i5++;
            }
            return;
        }
        this.f28632a.g2(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += CodedOutputStream.b1(list.get(i7).longValue());
        }
        this.f28632a.h2(i6);
        while (i5 < list.size()) {
            this.f28632a.i2(list.get(i5).longValue());
            i5++;
        }
    }

    @Override // androidx.content.preferences.protobuf.v4
    public void y(int i4, long j4) throws IOException {
        this.f28632a.y(i4, j4);
    }

    @Override // androidx.content.preferences.protobuf.v4
    public v4.a z() {
        return v4.a.ASCENDING;
    }
}

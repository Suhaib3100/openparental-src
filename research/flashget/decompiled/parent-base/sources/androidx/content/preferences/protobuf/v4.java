package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.b2;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: Writer.java */
/* loaded from: classes3.dex */
interface v4 {

    /* compiled from: Writer.java */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i4, List<?> list, m3 m3Var) throws IOException;

    void B(int i4, List<?> list) throws IOException;

    void C(int i4, Object obj) throws IOException;

    void D(int i4, long j4) throws IOException;

    void E(int i4, boolean z4) throws IOException;

    void F(int i4, int i5) throws IOException;

    @Deprecated
    void G(int i4) throws IOException;

    void H(int i4, List<Long> list, boolean z4) throws IOException;

    void I(int i4, List<Integer> list, boolean z4) throws IOException;

    void J(int i4, List<Boolean> list, boolean z4) throws IOException;

    @Deprecated
    void K(int i4, Object obj) throws IOException;

    void L(int i4, float f4) throws IOException;

    @Deprecated
    void M(int i4) throws IOException;

    void N(int i4, List<Integer> list, boolean z4) throws IOException;

    void O(int i4, int i5) throws IOException;

    void P(int i4, List<Long> list, boolean z4) throws IOException;

    void Q(int i4, List<Double> list, boolean z4) throws IOException;

    void R(int i4, int i5) throws IOException;

    void S(int i4, List<w> list) throws IOException;

    void a(int i4, List<Float> list, boolean z4) throws IOException;

    void b(int i4, Object obj) throws IOException;

    void c(int i4, int i5) throws IOException;

    @Deprecated
    void d(int i4, List<?> list) throws IOException;

    void e(int i4, List<String> list) throws IOException;

    @Deprecated
    void f(int i4, List<?> list, m3 m3Var) throws IOException;

    void g(int i4, String str) throws IOException;

    void h(int i4, long j4) throws IOException;

    void i(int i4, List<Integer> list, boolean z4) throws IOException;

    void j(int i4, int i5) throws IOException;

    void k(int i4, w wVar) throws IOException;

    void l(int i4, long j4) throws IOException;

    void m(int i4, List<Integer> list, boolean z4) throws IOException;

    void n(int i4, Object obj, m3 m3Var) throws IOException;

    void o(int i4, List<Integer> list, boolean z4) throws IOException;

    void p(int i4, List<Long> list, boolean z4) throws IOException;

    void q(int i4, long j4) throws IOException;

    void r(int i4, List<Integer> list, boolean z4) throws IOException;

    <K, V> void s(int i4, b2.b<K, V> bVar, Map<K, V> map) throws IOException;

    @Deprecated
    void t(int i4, Object obj, m3 m3Var) throws IOException;

    void u(int i4, int i5) throws IOException;

    void v(int i4, double d5) throws IOException;

    void w(int i4, List<Long> list, boolean z4) throws IOException;

    void x(int i4, List<Long> list, boolean z4) throws IOException;

    void y(int i4, long j4) throws IOException;

    a z();
}

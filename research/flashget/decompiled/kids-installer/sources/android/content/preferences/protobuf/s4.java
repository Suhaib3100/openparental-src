package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a2;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: Writer.java */
/* loaded from: classes.dex */
interface s4 {

    /* compiled from: Writer.java */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i5, long j5) throws IOException;

    void B(int i5, List<Integer> list, boolean z5) throws IOException;

    void C(int i5, Object obj, j3 j3Var) throws IOException;

    void D(int i5, List<Boolean> list, boolean z5) throws IOException;

    @Deprecated
    void E(int i5, Object obj) throws IOException;

    void F(int i5, List<Integer> list, boolean z5) throws IOException;

    void G(int i5, List<Long> list, boolean z5) throws IOException;

    void H(int i5, long j5) throws IOException;

    void I(int i5, float f6) throws IOException;

    @Deprecated
    void J(int i5) throws IOException;

    void K(int i5, List<Integer> list, boolean z5) throws IOException;

    void L(int i5, int i6) throws IOException;

    void M(int i5, List<Long> list, boolean z5) throws IOException;

    void N(int i5, List<Integer> list, boolean z5) throws IOException;

    void O(int i5, List<Double> list, boolean z5) throws IOException;

    <K, V> void P(int i5, a2.b<K, V> bVar, Map<K, V> map) throws IOException;

    void Q(int i5, int i6) throws IOException;

    void R(int i5, List<w> list) throws IOException;

    @Deprecated
    void S(int i5, Object obj, j3 j3Var) throws IOException;

    void a(int i5, List<Float> list, boolean z5) throws IOException;

    void b(int i5, int i6) throws IOException;

    void c(int i5, Object obj) throws IOException;

    void d(int i5, int i6) throws IOException;

    void e(int i5, double d6) throws IOException;

    void f(int i5, List<Long> list, boolean z5) throws IOException;

    void g(int i5, List<Long> list, boolean z5) throws IOException;

    @Deprecated
    void h(int i5, List<?> list) throws IOException;

    void i(int i5, long j5) throws IOException;

    a j();

    void k(int i5, List<?> list, j3 j3Var) throws IOException;

    void l(int i5, List<String> list) throws IOException;

    @Deprecated
    void m(int i5, List<?> list, j3 j3Var) throws IOException;

    void n(int i5, List<?> list) throws IOException;

    void o(int i5, String str) throws IOException;

    void p(int i5, long j5) throws IOException;

    void q(int i5, Object obj) throws IOException;

    void r(int i5, List<Integer> list, boolean z5) throws IOException;

    void s(int i5, long j5) throws IOException;

    void t(int i5, boolean z5) throws IOException;

    void u(int i5, int i6) throws IOException;

    @Deprecated
    void v(int i5) throws IOException;

    void w(int i5, int i6) throws IOException;

    void x(int i5, List<Long> list, boolean z5) throws IOException;

    void y(int i5, List<Integer> list, boolean z5) throws IOException;

    void z(int i5, w wVar) throws IOException;
}

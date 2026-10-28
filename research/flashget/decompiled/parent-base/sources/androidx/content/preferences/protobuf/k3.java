package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.b2;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: Reader.java */
/* loaded from: classes3.dex */
interface k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f28725a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static final int f28726b = 0;

    <T> void A(List<T> list, Class<T> cls, s0 s0Var) throws IOException;

    void B(List<Long> list) throws IOException;

    void C(List<Integer> list) throws IOException;

    <K, V> void D(Map<K, V> map, b2.b<K, V> bVar, s0 s0Var) throws IOException;

    void E(List<Integer> list) throws IOException;

    long F() throws IOException;

    String G() throws IOException;

    int H() throws IOException;

    void I(List<String> list) throws IOException;

    void J(List<Float> list) throws IOException;

    @Deprecated
    <T> void K(List<T> list, m3<T> m3Var, s0 s0Var) throws IOException;

    boolean L();

    boolean M() throws IOException;

    int N() throws IOException;

    void O(List<w> list) throws IOException;

    void P(List<Double> list) throws IOException;

    long Q() throws IOException;

    String R() throws IOException;

    <T> T a(m3<T> m3Var, s0 s0Var) throws IOException;

    long b() throws IOException;

    void c(List<Integer> list) throws IOException;

    void d(List<Long> list) throws IOException;

    boolean e() throws IOException;

    long f() throws IOException;

    void g(List<Long> list) throws IOException;

    int getTag();

    int h() throws IOException;

    void i(List<Long> list) throws IOException;

    void j(List<Integer> list) throws IOException;

    int k() throws IOException;

    int l() throws IOException;

    void m(List<Boolean> list) throws IOException;

    void n(List<String> list) throws IOException;

    w o() throws IOException;

    int p() throws IOException;

    <T> void q(List<T> list, m3<T> m3Var, s0 s0Var) throws IOException;

    void r(List<Long> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    @Deprecated
    <T> T s(m3<T> m3Var, s0 s0Var) throws IOException;

    void t(List<Integer> list) throws IOException;

    long u() throws IOException;

    <T> T v(Class<T> cls, s0 s0Var) throws IOException;

    @Deprecated
    <T> void w(List<T> list, Class<T> cls, s0 s0Var) throws IOException;

    void x(List<Integer> list) throws IOException;

    int y() throws IOException;

    @Deprecated
    <T> T z(Class<T> cls, s0 s0Var) throws IOException;
}

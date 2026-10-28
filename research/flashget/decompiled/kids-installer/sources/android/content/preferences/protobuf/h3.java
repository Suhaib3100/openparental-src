package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a2;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: Reader.java */
/* loaded from: classes.dex */
interface h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7234a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7235b = 0;

    void A(List<Boolean> list) throws IOException;

    String B() throws IOException;

    int C() throws IOException;

    void D(List<String> list) throws IOException;

    void E(List<String> list) throws IOException;

    w F() throws IOException;

    void G(List<Float> list) throws IOException;

    int H() throws IOException;

    @Deprecated
    <T> void I(List<T> list, j3<T> j3Var, s0 s0Var) throws IOException;

    boolean J();

    boolean K() throws IOException;

    int L() throws IOException;

    void M(List<w> list) throws IOException;

    void N(List<Double> list) throws IOException;

    <T> void O(List<T> list, j3<T> j3Var, s0 s0Var) throws IOException;

    long P() throws IOException;

    String Q() throws IOException;

    void R(List<Long> list) throws IOException;

    @Deprecated
    <T> T S(j3<T> j3Var, s0 s0Var) throws IOException;

    int a();

    <T> T b(j3<T> j3Var, s0 s0Var) throws IOException;

    void c(List<Integer> list) throws IOException;

    long d() throws IOException;

    long e() throws IOException;

    <T> T f(Class<T> cls, s0 s0Var) throws IOException;

    @Deprecated
    <T> void g(List<T> list, Class<T> cls, s0 s0Var) throws IOException;

    void h(List<Integer> list) throws IOException;

    void i(List<Long> list) throws IOException;

    void j(List<Integer> list) throws IOException;

    int k() throws IOException;

    boolean l() throws IOException;

    long m() throws IOException;

    void n(List<Long> list) throws IOException;

    @Deprecated
    <T> T o(Class<T> cls, s0 s0Var) throws IOException;

    <T> void p(List<T> list, Class<T> cls, s0 s0Var) throws IOException;

    int q() throws IOException;

    void r(List<Long> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    void s(List<Long> list) throws IOException;

    void t(List<Integer> list) throws IOException;

    void u(List<Integer> list) throws IOException;

    <K, V> void v(Map<K, V> map, a2.b<K, V> bVar, s0 s0Var) throws IOException;

    int w() throws IOException;

    void x(List<Integer> list) throws IOException;

    int y() throws IOException;

    long z() throws IOException;
}

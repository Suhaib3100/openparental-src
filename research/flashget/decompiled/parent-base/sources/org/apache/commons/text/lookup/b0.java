package org.apache.commons.text.lookup;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: StringLookupFactory.java */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: g, reason: collision with root package name */
    public static final String f86494g = "base64Decoder";

    /* renamed from: h, reason: collision with root package name */
    public static final String f86495h = "base64Encoder";

    /* renamed from: i, reason: collision with root package name */
    public static final String f86496i = "const";

    /* renamed from: j, reason: collision with root package name */
    public static final String f86497j = "date";

    /* renamed from: k, reason: collision with root package name */
    public static final String f86498k = "dns";

    /* renamed from: l, reason: collision with root package name */
    public static final String f86499l = "env";

    /* renamed from: m, reason: collision with root package name */
    public static final String f86500m = "file";

    /* renamed from: n, reason: collision with root package name */
    public static final String f86501n = "java";

    /* renamed from: o, reason: collision with root package name */
    public static final String f86502o = "localhost";

    /* renamed from: p, reason: collision with root package name */
    public static final String f86503p = "properties";

    /* renamed from: q, reason: collision with root package name */
    public static final String f86504q = "resourceBundle";

    /* renamed from: r, reason: collision with root package name */
    public static final String f86505r = "script";

    /* renamed from: s, reason: collision with root package name */
    public static final String f86506s = "sys";

    /* renamed from: t, reason: collision with root package name */
    public static final String f86507t = "url";

    /* renamed from: u, reason: collision with root package name */
    public static final String f86508u = "urlDecoder";

    /* renamed from: v, reason: collision with root package name */
    public static final String f86509v = "urlEncoder";

    /* renamed from: w, reason: collision with root package name */
    public static final String f86510w = "xml";

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f86488a = new b0();

    /* renamed from: b, reason: collision with root package name */
    static final k<String> f86489b = k.h(new w());

    /* renamed from: c, reason: collision with root package name */
    static final k<String> f86490c = k.h(new x());

    /* renamed from: d, reason: collision with root package name */
    static final k<String> f86491d = k.h(new y());

    /* renamed from: e, reason: collision with root package name */
    static final k<String> f86492e = k.h(new z());

    /* renamed from: f, reason: collision with root package name */
    static final k<String> f86493f = k.h(new a0());

    private b0() {
    }

    public static /* synthetic */ String a(String str) {
        return null;
    }

    public static void i() {
        e.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u(String str) {
        Base64.Decoder decoder;
        byte[] decode;
        decoder = Base64.getDecoder();
        decode = decoder.decode(str);
        return new String(decode, StandardCharsets.ISO_8859_1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v(String str) {
        Base64.Encoder encoder;
        String encodeToString;
        encoder = Base64.getEncoder();
        encodeToString = encoder.encodeToString(str.getBytes(StandardCharsets.ISO_8859_1));
        return encodeToString;
    }

    private static /* synthetic */ String w(String str) {
        return null;
    }

    public t A() {
        return q.f86539c;
    }

    public t B() {
        return r.f86541d;
    }

    public t C(String str) {
        return new r(str);
    }

    public t D() {
        return s.f86543c;
    }

    public t E() {
        return f86493f;
    }

    public t F() {
        return c0.f86512c;
    }

    public t G() {
        return d0.f86513c;
    }

    public t H() {
        return e0.f86517c;
    }

    public t I() {
        return f0.f86519c;
    }

    public void d(Map<String, t> map) {
        if (map != null) {
            map.put("base64", f86489b);
            for (g gVar : g.values()) {
                map.put(n.h(gVar.getKey()), gVar.getStringLookup());
            }
        }
    }

    public t e() {
        return f86489b;
    }

    public t f() {
        return f86490c;
    }

    @Deprecated
    public t g() {
        return f86489b;
    }

    public <R, U> d<U> h(BiFunction<String, U, R> biFunction) {
        return c.e(biFunction);
    }

    public t j() {
        return e.f86516e;
    }

    public t k() {
        return f.f86518c;
    }

    public t l() {
        return h.f86520c;
    }

    public t m() {
        return f86491d;
    }

    public t n() {
        return i.f86521c;
    }

    public <R> t o(Function<String, R> function) {
        return k.h(function);
    }

    public t p() {
        return n.f86527e;
    }

    public <V> t q(Map<String, V> map) {
        return new n(map);
    }

    public t r(Map<String, t> map, t tVar, boolean z4) {
        return new n(map, tVar, z4);
    }

    public t s(t tVar) {
        return new n(tVar);
    }

    public t t() {
        return o.f86531c;
    }

    public t x() {
        return p.f86538c;
    }

    public <V> t y(Map<String, V> map) {
        return k.g(map);
    }

    public t z() {
        return f86492e;
    }
}

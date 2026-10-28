package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import net.time4j.engine.g0;

/* compiled from: Attributes.java */
/* loaded from: classes7.dex */
public final class a implements net.time4j.engine.d {

    /* renamed from: b, reason: collision with root package name */
    public static final net.time4j.engine.c<String> f82780b = q.a(ProtectedSandApp.s("錬\u0001"), String.class);

    /* renamed from: c, reason: collision with root package name */
    public static final net.time4j.engine.c<Locale> f82781c = q.a(ProtectedSandApp.s("錭\u0001"), Locale.class);

    /* renamed from: d, reason: collision with root package name */
    public static final net.time4j.engine.c<net.time4j.tz.k> f82782d = q.a(ProtectedSandApp.s("錮\u0001"), net.time4j.tz.k.class);

    /* renamed from: e, reason: collision with root package name */
    public static final net.time4j.engine.c<net.time4j.tz.o> f82783e = q.a(ProtectedSandApp.s("錯\u0001"), net.time4j.tz.o.class);

    /* renamed from: f, reason: collision with root package name */
    public static final net.time4j.engine.c<g> f82784f = q.a(ProtectedSandApp.s("錰\u0001"), g.class);

    /* renamed from: g, reason: collision with root package name */
    public static final net.time4j.engine.c<x> f82785g = q.a(ProtectedSandApp.s("錱\u0001"), x.class);

    /* renamed from: h, reason: collision with root package name */
    public static final net.time4j.engine.c<m> f82786h = q.a(ProtectedSandApp.s("録\u0001"), m.class);

    /* renamed from: i, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f82787i = q.a(ProtectedSandApp.s("錳\u0001"), Boolean.class);

    /* renamed from: j, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f82788j = q.a(ProtectedSandApp.s("錴\u0001"), Boolean.class);

    /* renamed from: k, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f82789k = q.a(ProtectedSandApp.s("錵\u0001"), Boolean.class);

    /* renamed from: l, reason: collision with root package name */
    public static final net.time4j.engine.c<j> f82790l = q.a(ProtectedSandApp.s("錶\u0001"), j.class);

    /* renamed from: m, reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f82791m = q.a(ProtectedSandApp.s("錷\u0001"), Character.class);

    /* renamed from: n, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f82792n = q.a(ProtectedSandApp.s("錸\u0001"), Boolean.class);

    /* renamed from: o, reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f82793o = q.a(ProtectedSandApp.s("錹\u0001"), Character.class);

    /* renamed from: p, reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f82794p = q.a(ProtectedSandApp.s("錺\u0001"), Character.class);

    /* renamed from: q, reason: collision with root package name */
    public static final net.time4j.engine.c<Integer> f82795q = q.a(ProtectedSandApp.s("錻\u0001"), Integer.class);

    /* renamed from: r, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f82796r = q.a(ProtectedSandApp.s("錼\u0001"), Boolean.class);

    /* renamed from: s, reason: collision with root package name */
    public static final net.time4j.engine.c<Integer> f82797s = q.a(ProtectedSandApp.s("錽\u0001"), Integer.class);

    /* renamed from: t, reason: collision with root package name */
    public static final net.time4j.engine.c<String> f82798t = q.a(ProtectedSandApp.s("錾\u0001"), String.class);

    /* renamed from: u, reason: collision with root package name */
    public static final net.time4j.engine.c<g0> f82799u = q.a(ProtectedSandApp.s("錿\u0001"), g0.class);

    /* renamed from: v, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f82800v = q.a(ProtectedSandApp.s("鍀\u0001"), Boolean.class);

    /* renamed from: w, reason: collision with root package name */
    public static final net.time4j.engine.c<net.time4j.scale.f> f82801w = q.a(ProtectedSandApp.s("鍁\u0001"), net.time4j.scale.f.class);

    /* renamed from: x, reason: collision with root package name */
    public static final net.time4j.engine.c<String> f82802x = q.a(ProtectedSandApp.s("鍂\u0001"), String.class);

    /* renamed from: y, reason: collision with root package name */
    private static final a f82803y = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f82804a;

    /* compiled from: Attributes.java */
    /* renamed from: net.time4j.format.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1292a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82805a;

        static {
            int[] iArr = new int[g.values().length];
            f82805a = iArr;
            try {
                iArr[g.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82805a[g.SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82805a[g.LAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* synthetic */ a(Map map, C1292a c1292a) {
        this(map);
    }

    public static <A> net.time4j.engine.c<A> e(String str, Class<A> cls) {
        return q.a(str, cls);
    }

    public static a f() {
        return f82803y;
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        Object obj = this.f82804a.get(cVar.name());
        if (obj != null) {
            return cVar.type().cast(obj);
        }
        throw new NoSuchElementException(cVar.name());
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a5) {
        Object obj = this.f82804a.get(cVar.name());
        return obj == null ? a5 : cVar.type().cast(obj);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        return this.f82804a.containsKey(cVar.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f82804a.equals(((a) obj).f82804a);
        }
        return false;
    }

    public int hashCode() {
        return this.f82804a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f82804a.size() * 32);
        sb.append(a.class.getName());
        sb.append('[');
        sb.append(this.f82804a);
        sb.append(']');
        return sb.toString();
    }

    /* compiled from: Attributes.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f82806a = new HashMap();

        public b() {
        }

        private <A> void i(net.time4j.engine.c<A> cVar, A a5) {
            if (a5 != null) {
                this.f82806a.put(cVar.name(), a5);
            } else {
                throw new NullPointerException(ProtectedSandApp.s("錪\u0001") + cVar);
            }
        }

        public a a() {
            return new a(this.f82806a, null);
        }

        public b b(net.time4j.engine.c<?> cVar) {
            this.f82806a.remove(cVar.name());
            return this;
        }

        public b c(net.time4j.engine.c<Character> cVar, char c5) {
            this.f82806a.put(cVar.name(), Character.valueOf(c5));
            return this;
        }

        public b d(net.time4j.engine.c<Integer> cVar, int i4) {
            if (cVar == a.f82795q && i4 < 100) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("錫\u0001"), i4));
            }
            this.f82806a.put(cVar.name(), Integer.valueOf(i4));
            return this;
        }

        public <A extends Enum<A>> b e(net.time4j.engine.c<A> cVar, A a5) {
            if (a5 == null) {
                throw new NullPointerException(ProtectedSandApp.s("錪\u0001") + cVar);
            }
            this.f82806a.put(cVar.name(), a5);
            if (cVar == a.f82784f) {
                int i4 = C1292a.f82805a[((g) g.class.cast(a5)).ordinal()];
                if (i4 == 1) {
                    f(a.f82787i, false);
                    f(a.f82788j, false);
                    f(a.f82796r, false);
                    f(a.f82789k, false);
                } else if (i4 == 2) {
                    f(a.f82787i, true);
                    f(a.f82788j, false);
                    f(a.f82796r, false);
                    f(a.f82789k, true);
                } else {
                    if (i4 != 3) {
                        throw new UnsupportedOperationException(a5.name());
                    }
                    f(a.f82787i, true);
                    f(a.f82788j, true);
                    f(a.f82796r, true);
                    f(a.f82789k, true);
                }
            } else if (cVar == a.f82790l) {
                j jVar = (j) j.class.cast(a5);
                if (jVar.isDecimal()) {
                    c(a.f82791m, jVar.getDigits().charAt(0));
                }
            }
            return this;
        }

        public b f(net.time4j.engine.c<Boolean> cVar, boolean z4) {
            this.f82806a.put(cVar.name(), Boolean.valueOf(z4));
            return this;
        }

        public b g(a aVar) {
            this.f82806a.putAll(aVar.f82804a);
            return this;
        }

        public b h(String str) {
            i(a.f82798t, str);
            return this;
        }

        public b j(Locale locale) {
            i(a.f82781c, locale);
            return this;
        }

        public b k() {
            i(a.f82782d, net.time4j.tz.l.e0().G());
            return this;
        }

        public b l(String str) {
            m(net.time4j.tz.l.Z(str).G());
            return this;
        }

        public b m(net.time4j.tz.k kVar) {
            i(a.f82782d, kVar);
            return this;
        }

        public b(net.time4j.engine.x<?> xVar) {
            i(a.f82780b, net.time4j.format.b.b(xVar));
        }
    }

    private a() {
        this.f82804a = Collections.emptyMap();
    }

    private a(Map<String, Object> map) {
        this.f82804a = Collections.unmodifiableMap(new HashMap(map));
    }
}

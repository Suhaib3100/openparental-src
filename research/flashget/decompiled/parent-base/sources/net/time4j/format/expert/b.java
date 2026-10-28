package net.time4j.format.expert;

import androidx.compose.material3.z3;
import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.format.a;

/* compiled from: AttributeSet.java */
/* loaded from: classes7.dex */
final class b implements net.time4j.engine.d {

    /* renamed from: g, reason: collision with root package name */
    static final net.time4j.engine.c<String> f82829g = net.time4j.format.a.e(ProtectedSandApp.s("鏏\u0001"), String.class);

    /* renamed from: h, reason: collision with root package name */
    static final net.time4j.engine.c<String> f82830h = net.time4j.format.a.e(ProtectedSandApp.s("鏐\u0001"), String.class);

    /* renamed from: i, reason: collision with root package name */
    private static final net.time4j.format.i f82831i;

    /* renamed from: j, reason: collision with root package name */
    private static final char f82832j;

    /* renamed from: k, reason: collision with root package name */
    private static final ConcurrentMap<String, a> f82833k;

    /* renamed from: l, reason: collision with root package name */
    private static final a f82834l;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f82835a;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.format.a f82836b;

    /* renamed from: c, reason: collision with root package name */
    private final Locale f82837c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82838d;

    /* renamed from: e, reason: collision with root package name */
    private final int f82839e;

    /* renamed from: f, reason: collision with root package name */
    private final net.time4j.engine.o<net.time4j.engine.p> f82840f;

    /* compiled from: AttributeSet.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final net.time4j.format.j f82841a;

        /* renamed from: b, reason: collision with root package name */
        private final char f82842b;

        /* renamed from: c, reason: collision with root package name */
        private final char f82843c;

        /* renamed from: d, reason: collision with root package name */
        private final String f82844d;

        /* renamed from: e, reason: collision with root package name */
        private final String f82845e;

        a(net.time4j.format.j jVar, char c5, char c6, String str, String str2) {
            this.f82841a = jVar;
            this.f82842b = c5;
            this.f82843c = c6;
            this.f82844d = str;
            this.f82845e = str2;
        }
    }

    static {
        net.time4j.format.i iVar = null;
        int i4 = 0;
        for (net.time4j.format.i iVar2 : net.time4j.base.d.c().g(net.time4j.format.i.class)) {
            int length = iVar2.a().length;
            if (length > i4) {
                iVar = iVar2;
                i4 = length;
            }
        }
        if (iVar == null) {
            iVar = net.time4j.i18n.f.f83288d;
        }
        f82831i = iVar;
        char c5 = Boolean.getBoolean(ProtectedSandApp.s("鏑\u0001")) ? '.' : ',';
        f82832j = c5;
        f82833k = new ConcurrentHashMap();
        f82834l = new a(net.time4j.format.j.ARABIC, '0', c5, ProtectedSandApp.s("鏒\u0001"), ProtectedSandApp.s("鏓\u0001"));
    }

    b(net.time4j.format.a aVar, Locale locale) {
        this(aVar, locale, 0, 0, null);
    }

    static b d(net.time4j.engine.x<?> xVar, net.time4j.format.a aVar, Locale locale) {
        a.b bVar = new a.b(xVar);
        bVar.e(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
        bVar.e(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
        bVar.e(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT);
        bVar.c(net.time4j.format.a.f82794p, ' ');
        bVar.g(aVar);
        return new b(bVar.a(), locale).n(locale);
    }

    private static boolean j(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    static b k(b bVar, b bVar2) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(bVar2.f82835a);
        hashMap.putAll(bVar.f82835a);
        return new b(new a.b().g(bVar2.f82836b).g(bVar.f82836b).a(), Locale.ROOT, 0, 0, null, hashMap).n(bVar.f82837c);
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        return this.f82835a.containsKey(cVar.name()) ? cVar.type().cast(this.f82835a.get(cVar.name())) : (A) this.f82836b.a(cVar);
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a5) {
        return this.f82835a.containsKey(cVar.name()) ? cVar.type().cast(this.f82835a.get(cVar.name())) : (A) this.f82836b.b(cVar, a5);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        if (this.f82835a.containsKey(cVar.name())) {
            return true;
        }
        return this.f82836b.c(cVar);
    }

    net.time4j.format.a e() {
        return this.f82836b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f82836b.equals(bVar.f82836b) && this.f82837c.equals(bVar.f82837c) && this.f82838d == bVar.f82838d && this.f82839e == bVar.f82839e && j(this.f82840f, bVar.f82840f) && this.f82835a.equals(bVar.f82835a);
    }

    net.time4j.engine.o<net.time4j.engine.p> f() {
        return this.f82840f;
    }

    int g() {
        return this.f82838d;
    }

    Locale h() {
        return this.f82837c;
    }

    public int hashCode() {
        return (this.f82835a.hashCode() * 37) + (this.f82836b.hashCode() * 7);
    }

    int i() {
        return this.f82839e;
    }

    b l(net.time4j.format.a aVar) {
        return new b(aVar, this.f82837c, this.f82838d, this.f82839e, this.f82840f, this.f82835a);
    }

    <A> b m(net.time4j.engine.c<A> cVar, A a5) {
        HashMap hashMap = new HashMap(this.f82835a);
        if (a5 == null) {
            hashMap.remove(cVar.name());
        } else {
            hashMap.put(cVar.name(), a5);
        }
        return new b(this.f82836b, this.f82837c, this.f82838d, this.f82839e, this.f82840f, hashMap);
    }

    b n(Locale locale) {
        String str;
        String str2;
        a.b bVar = new a.b();
        bVar.g(this.f82836b);
        String alias = net.time4j.i18n.d.getAlias(locale);
        String country = locale.getCountry();
        if (alias.isEmpty() && country.isEmpty()) {
            locale = Locale.ROOT;
            bVar.e(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
            bVar.c(net.time4j.format.a.f82793o, f82832j);
            str = ProtectedSandApp.s("鏒\u0001");
            str2 = ProtectedSandApp.s("鏓\u0001");
        } else {
            if (!country.isEmpty()) {
                alias = z3.a(alias, ProtectedSandApp.s("鏕\u0001"), country);
            }
            a aVar = f82833k.get(alias);
            if (aVar == null) {
                try {
                    net.time4j.format.i iVar = f82831i;
                    aVar = new a(iVar.d(locale), iVar.f(locale), iVar.b(locale), iVar.c(locale), iVar.e(locale));
                } catch (RuntimeException unused) {
                    aVar = f82834l;
                }
                a putIfAbsent = f82833k.putIfAbsent(alias, aVar);
                if (putIfAbsent != null) {
                    aVar = putIfAbsent;
                }
            }
            bVar.e(net.time4j.format.a.f82790l, aVar.f82841a);
            bVar.c(net.time4j.format.a.f82791m, aVar.f82842b);
            bVar.c(net.time4j.format.a.f82793o, aVar.f82843c);
            str = aVar.f82844d;
            str2 = aVar.f82845e;
        }
        Locale locale2 = locale;
        bVar.j(locale2);
        HashMap hashMap = new HashMap(this.f82835a);
        hashMap.put(f82829g.name(), str);
        hashMap.put(f82830h.name(), str2);
        return new b(bVar.a(), locale2, this.f82838d, this.f82839e, this.f82840f, hashMap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(b.class, sb, ProtectedSandApp.s("鏖\u0001"));
        sb.append(this.f82836b);
        sb.append(ProtectedSandApp.s("鏗\u0001"));
        sb.append(this.f82837c);
        sb.append(ProtectedSandApp.s("鏘\u0001"));
        sb.append(this.f82838d);
        sb.append(ProtectedSandApp.s("鏙\u0001"));
        sb.append(this.f82839e);
        sb.append(ProtectedSandApp.s("鏚\u0001"));
        sb.append(this.f82840f);
        sb.append(ProtectedSandApp.s("鏛\u0001"));
        sb.append(this.f82835a);
        sb.append(']');
        return sb.toString();
    }

    b(net.time4j.format.a aVar, Locale locale, int i4, int i5, net.time4j.engine.o<net.time4j.engine.p> oVar) {
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鏔\u0001"));
        }
        this.f82836b = aVar;
        this.f82837c = locale == null ? Locale.ROOT : locale;
        this.f82838d = i4;
        this.f82839e = i5;
        this.f82840f = oVar;
        this.f82835a = Collections.emptyMap();
    }

    private b(net.time4j.format.a aVar, Locale locale, int i4, int i5, net.time4j.engine.o<net.time4j.engine.p> oVar, Map<String, Object> map) {
        if (aVar != null) {
            this.f82836b = aVar;
            this.f82837c = locale == null ? Locale.ROOT : locale;
            this.f82838d = i4;
            this.f82839e = i5;
            this.f82840f = oVar;
            this.f82835a = Collections.unmodifiableMap(map);
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("鏔\u0001"));
    }
}

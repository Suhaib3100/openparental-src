package net.time4j.android.spi;

import android.content.Context;
import android.text.format.DateFormat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import net.time4j.engine.s;
import net.time4j.format.a0;
import net.time4j.format.o;
import net.time4j.format.w;
import net.time4j.format.z;
import net.time4j.tz.r;

/* loaded from: classes7.dex */
public class AndroidResourceLoader extends net.time4j.base.d {

    /* renamed from: i, reason: collision with root package name */
    private static final Map<Class<?>, Iterable<?>> f81849i;

    /* renamed from: j, reason: collision with root package name */
    private static final Set<String> f81850j;

    /* renamed from: f, reason: collision with root package name */
    private Context f81851f = null;

    /* renamed from: g, reason: collision with root package name */
    private net.time4j.android.b f81852g = null;

    /* renamed from: h, reason: collision with root package name */
    private List<net.time4j.format.f> f81853h = Collections.emptyList();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81854a;

        static {
            int[] iArr = new int[net.time4j.format.e.values().length];
            f81854a = iArr;
            try {
                iArr[net.time4j.format.e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81854a[net.time4j.format.e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81854a[net.time4j.format.e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class b implements pe.c {
        private b() {
        }

        private pe.c a() {
            return c.f81856a;
        }

        private String c(String str) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            int i4 = 0;
            while (i4 < length) {
                char charAt = str.charAt(i4);
                if (charAt == '\'') {
                    sb.append(charAt);
                    while (true) {
                        i4++;
                        if (i4 >= length) {
                            break;
                        }
                        char charAt2 = str.charAt(i4);
                        if (charAt2 == '\'') {
                            sb.append(charAt2);
                            int i5 = i4 + 1;
                            if (i5 < length && str.charAt(i5) == '\'') {
                                i4 = i5;
                            }
                        }
                        sb.append(charAt2);
                    }
                } else if (charAt == 'h') {
                    sb.append('H');
                } else if (charAt != 'a') {
                    sb.append(charAt);
                }
                i4++;
            }
            return sb.toString();
        }

        @Override // net.time4j.format.f
        public String b(net.time4j.format.e eVar, Locale locale) {
            return j(eVar, locale, false);
        }

        @Override // net.time4j.format.f
        public String f(net.time4j.format.e eVar, Locale locale) {
            return c.f81856a.f(eVar, locale);
        }

        @Override // pe.c
        public String j(net.time4j.format.e eVar, Locale locale, boolean z4) {
            String j4 = c.f81856a.j(eVar, locale, z4);
            if (Locale.getDefault().equals(locale)) {
                net.time4j.format.e eVar2 = net.time4j.format.e.SHORT;
                boolean z5 = (eVar != eVar2 ? c.f81856a.j(eVar2, locale, false) : j4).indexOf(97) == -1;
                boolean is24HourFormat = DateFormat.is24HourFormat(AndroidResourceLoader.this.f81851f);
                if (is24HourFormat != z5) {
                    if (is24HourFormat) {
                        return c(j4).replace(ProtectedSandApp.s("覿\u0001"), ProtectedSandApp.s("觀\u0001")).trim();
                    }
                    String s4 = locale.getLanguage().equals(ProtectedSandApp.s("见\u0001")) ? ProtectedSandApp.s("观\u0001") : ProtectedSandApp.s("觃\u0001");
                    int i4 = a.f81854a[eVar.ordinal()];
                    String s5 = ProtectedSandApp.s("规\u0001");
                    return i4 != 1 ? i4 != 2 ? i4 != 3 ? ProtectedSandApp.s("觅\u0001").concat(s4) : s5.concat(s4) : android.support.v4.media.d.a(s5, s4, ProtectedSandApp.s("视\u0001")) : android.support.v4.media.d.a(s5, s4, ProtectedSandApp.s("觇\u0001"));
                }
            }
            return j4;
        }

        @Override // net.time4j.format.f
        public String m(Locale locale) {
            return c.f81856a.m(locale);
        }

        @Override // net.time4j.format.f
        public String n(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
            return c.f81856a.n(eVar, eVar2, locale);
        }

        /* synthetic */ b(AndroidResourceLoader androidResourceLoader, a aVar) {
            this();
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private static final net.time4j.i18n.c f81856a;

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<net.time4j.format.i> f81857b;

        /* renamed from: c, reason: collision with root package name */
        private static final Iterable<a0> f81858c;

        /* renamed from: d, reason: collision with root package name */
        private static final Iterable<w> f81859d;

        static {
            net.time4j.i18n.c cVar = new net.time4j.i18n.c();
            f81856a = cVar;
            f81857b = Collections.singleton(net.time4j.i18n.f.f83288d);
            f81858c = Collections.singletonList(new net.time4j.i18n.i());
            f81859d = Collections.unmodifiableList(Arrays.asList(cVar, new net.time4j.calendar.service.d()));
        }

        private c() {
        }
    }

    private static final class d implements Iterable<s> {
        private d() {
        }

        @Override // java.lang.Iterable
        public Iterator<s> iterator() {
            return l.f81861b.iterator();
        }

        d(a aVar) {
        }
    }

    private static final class e implements Iterable<net.time4j.scale.c> {
        private e() {
        }

        @Override // java.lang.Iterable
        public Iterator<net.time4j.scale.c> iterator() {
            return m.f81864c.iterator();
        }

        e(a aVar) {
        }
    }

    private static final class f implements Iterable<net.time4j.format.i> {
        private f() {
        }

        @Override // java.lang.Iterable
        public Iterator<net.time4j.format.i> iterator() {
            return c.f81857b.iterator();
        }

        f(a aVar) {
        }
    }

    private static final class g implements Iterable<o> {
        private g() {
        }

        @Override // java.lang.Iterable
        public Iterator<o> iterator() {
            return l.f81860a.iterator();
        }

        g(a aVar) {
        }
    }

    private static final class h implements Iterable<w> {
        private h() {
        }

        @Override // java.lang.Iterable
        public Iterator<w> iterator() {
            return c.f81859d.iterator();
        }

        h(a aVar) {
        }
    }

    private static final class i implements Iterable<a0> {
        private i() {
        }

        @Override // java.lang.Iterable
        public Iterator<a0> iterator() {
            return c.f81858c.iterator();
        }

        i(a aVar) {
        }
    }

    private static final class j implements Iterable<net.time4j.tz.s> {
        private j() {
        }

        @Override // java.lang.Iterable
        public Iterator<net.time4j.tz.s> iterator() {
            return m.f81863b.iterator();
        }

        j(a aVar) {
        }
    }

    private static final class k implements Iterable<r> {
        private k() {
        }

        @Override // java.lang.Iterable
        public Iterator<r> iterator() {
            return m.f81862a.iterator();
        }

        k(a aVar) {
        }
    }

    private static final class l {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterable<o> f81860a = Collections.singleton(new net.time4j.i18n.a());

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<s> f81861b = Arrays.asList(new net.time4j.i18n.b(), new net.time4j.calendar.service.f());

        private l() {
        }
    }

    private static final class m {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterable<r> f81862a;

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<net.time4j.tz.s> f81863b;

        /* renamed from: c, reason: collision with root package name */
        private static final Iterable<net.time4j.scale.c> f81864c;

        static {
            net.time4j.scale.c cVar;
            Set singleton = Collections.singleton(new net.time4j.tz.spi.a());
            f81862a = singleton;
            f81863b = Collections.singleton(new net.time4j.tz.spi.d());
            Iterator it = singleton.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                r rVar = (r) it.next();
                if (rVar instanceof net.time4j.scale.c) {
                    cVar = (net.time4j.scale.c) net.time4j.scale.c.class.cast(rVar);
                    break;
                }
            }
            if (cVar == null) {
                f81864c = Collections.emptyList();
            } else {
                f81864c = Collections.singleton(cVar);
            }
        }

        private m() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(w.class, new h());
        hashMap.put(r.class, new k());
        hashMap.put(net.time4j.tz.s.class, new j());
        hashMap.put(net.time4j.scale.c.class, new e());
        hashMap.put(s.class, new d());
        hashMap.put(net.time4j.format.i.class, new f());
        hashMap.put(o.class, new g());
        hashMap.put(z.class, Collections.singleton(new net.time4j.i18n.h()));
        hashMap.put(a0.class, new i());
        hashMap.put(net.time4j.scale.e.class, Collections.singleton(new net.time4j.android.spi.a()));
        f81849i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(ProtectedSandApp.s("觍\u0001"));
        hashSet.add(ProtectedSandApp.s("觎\u0001"));
        hashSet.add(ProtectedSandApp.s("觏\u0001"));
        hashSet.add(ProtectedSandApp.s("觐\u0001"));
        f81850j = Collections.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T i(Object obj) {
        return obj;
    }

    @Override // net.time4j.base.d
    public InputStream e(URI uri, boolean z4) {
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isAbsolute()) {
                URLConnection openConnection = uri.toURL().openConnection();
                openConnection.setUseCaches(false);
                return openConnection.getInputStream();
            }
            net.time4j.android.b bVar = this.f81852g;
            if (bVar != null) {
                return bVar.a(uri.toString());
            }
            Context context = this.f81851f;
            if (context != null) {
                return context.getAssets().open(uri.toString());
            }
            throw new IllegalStateException(ProtectedSandApp.s("觑\u0001"));
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.d
    public URI f(String str, Class<?> cls, String str2) {
        String s4 = ProtectedSandApp.s("角\u0001");
        try {
            if (!f81850j.contains(str)) {
                URL resource = cls.getClassLoader().getResource(str2);
                if (resource != null) {
                    return resource.toURI();
                }
                return null;
            }
            return new URI(s4 + str + '/' + str2);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.d
    public <S> Iterable<S> g(Class<S> cls) {
        Iterable<S> iterable = (Iterable) f81849i.get(cls);
        if (iterable == null) {
            if (cls != net.time4j.format.f.class) {
                return ServiceLoader.load(cls, cls.getClassLoader());
            }
            iterable = this.f81853h;
        }
        return iterable;
    }

    public void j(Context context, net.time4j.android.b bVar) {
        if (context == null) {
            throw new NullPointerException(ProtectedSandApp.s("觓\u0001"));
        }
        this.f81851f = context;
        this.f81852g = bVar;
        this.f81853h = Collections.singletonList(new b(this, null));
    }
}

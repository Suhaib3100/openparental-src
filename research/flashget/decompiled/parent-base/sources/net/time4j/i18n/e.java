package net.time4j.i18n;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PropertyBundle.java */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<b, a> f83277e = new ConcurrentHashMap(32);

    /* renamed from: f, reason: collision with root package name */
    private static final ReferenceQueue<Object> f83278f = new ReferenceQueue<>();

    /* renamed from: a, reason: collision with root package name */
    private final e f83279a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f83280b;

    /* renamed from: c, reason: collision with root package name */
    private final String f83281c;

    /* renamed from: d, reason: collision with root package name */
    private final Locale f83282d;

    /* compiled from: PropertyBundle.java */
    private static class a extends SoftReference<e> {

        /* renamed from: a, reason: collision with root package name */
        private b f83283a;

        a(e eVar, b bVar) {
            super(eVar, e.f83278f);
            this.f83283a = bVar;
        }
    }

    /* compiled from: PropertyBundle.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f83284a;

        /* renamed from: b, reason: collision with root package name */
        private final Locale f83285b;

        b(String str, Locale locale) {
            this.f83284a = str;
            this.f83285b = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f83284a.equals(bVar.f83284a) && this.f83285b.equals(bVar.f83285b);
        }

        public int hashCode() {
            return (this.f83284a.hashCode() << 3) ^ this.f83285b.hashCode();
        }

        public String toString() {
            return this.f83284a + ProtectedSandApp.s("霱\u0001") + this.f83285b;
        }
    }

    private e(g gVar, String str, Locale locale) throws IOException {
        int i4;
        this.f83279a = null;
        this.f83281c = str;
        this.f83282d = locale;
        HashMap hashMap = new HashMap();
        while (true) {
            String b5 = gVar.b();
            if (b5 == null) {
                this.f83280b = Collections.unmodifiableMap(hashMap);
                return;
            }
            String trim = b5.trim();
            if (!trim.isEmpty() && trim.charAt(0) != '#') {
                int length = trim.length();
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (trim.charAt(i5) == '=' && (i4 = i5 + 1) < length) {
                            hashMap.put(trim.substring(0, i5), trim.substring(i4));
                            break;
                        }
                        i5++;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void b() {
        while (f83278f.poll() != null) {
        }
        f83277e.clear();
    }

    public static List<Locale> d(Locale locale) {
        String alias = d.getAlias(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        LinkedList linkedList = new LinkedList();
        if (!variant.isEmpty()) {
            linkedList.add(new Locale(alias, country, variant));
        }
        if (!country.isEmpty()) {
            linkedList.add(new Locale(alias, country, ""));
        }
        if (!alias.isEmpty()) {
            linkedList.add(new Locale(alias, "", ""));
            if (alias.equals(ProtectedSandApp.s("露\u0001"))) {
                linkedList.add(new Locale(ProtectedSandApp.s("霳\u0001"), "", ""));
            }
        }
        linkedList.add(Locale.ROOT);
        return linkedList;
    }

    public static e i(String str, Locale locale) {
        e eVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("霶\u0001"));
        }
        if (locale == null) {
            throw new NullPointerException(ProtectedSandApp.s("霵\u0001"));
        }
        b bVar = new b(str, locale);
        a aVar = f83277e.get(bVar);
        if (aVar != null && (eVar = aVar.get()) != null) {
            return eVar;
        }
        while (true) {
            Reference<? extends Object> poll = f83278f.poll();
            if (poll == null) {
                break;
            }
            f83277e.remove(((a) poll).f83283a);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Locale> it = d(locale).iterator();
        while (it.hasNext()) {
            try {
                e j4 = j(str, it.next());
                if (j4 != null) {
                    arrayList.add(j4);
                }
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }
        if (arrayList.isEmpty()) {
            throw new MissingResourceException(ProtectedSandApp.s("霴\u0001") + k(str, locale), e.class.getName(), "");
        }
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            int i4 = size - 1;
            arrayList.set(i4, ((e) arrayList.get(i4)).l((e) arrayList.get(size)));
        }
        e eVar2 = (e) arrayList.get(0);
        f83277e.putIfAbsent(bVar, new a(eVar2, bVar));
        return eVar2;
    }

    private static e j(String str, Locale locale) throws IOException {
        int indexOf = str.indexOf(47);
        String substring = str.substring(0, indexOf);
        String k4 = k(str.substring(indexOf + 1), locale);
        InputStream e4 = net.time4j.base.d.c().e(net.time4j.base.d.c().f(substring, e.class, k4), true);
        e eVar = null;
        g gVar = null;
        if (e4 == null) {
            try {
                e4 = net.time4j.base.d.c().d(e.class, k4, true);
            } catch (IOException unused) {
                return null;
            }
        }
        if (e4 != null) {
            try {
                g gVar2 = new g(e4);
                try {
                    eVar = new e(gVar2, str, locale);
                    gVar2.close();
                } catch (Throwable th) {
                    th = th;
                    gVar = gVar2;
                    if (gVar != null) {
                        gVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return eVar;
    }

    private static String k(String str, Locale locale) {
        String alias = d.getAlias(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        StringBuilder sb = new StringBuilder(str.length() + 20);
        sb.append(str.replace('.', '/'));
        if (!alias.isEmpty()) {
            sb.append('_');
            sb.append(alias);
            if (!variant.isEmpty()) {
                sb.append('_');
                sb.append(country);
                sb.append('_');
                sb.append(variant);
            } else if (!country.isEmpty()) {
                sb.append('_');
                sb.append(country);
            }
        }
        sb.append(ProtectedSandApp.s("霷\u0001"));
        return sb.toString();
    }

    private e l(e eVar) {
        return eVar == null ? this : new e(this, eVar);
    }

    public boolean c(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("霸\u0001"));
        }
        e eVar = this;
        while (eVar.f83280b.get(str) == null) {
            eVar = eVar.f83279a;
            if (eVar == null) {
                return false;
            }
        }
        return true;
    }

    public Set<String> e() {
        return this.f83280b.keySet();
    }

    public Locale f() {
        return this.f83282d;
    }

    public String g(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("霸\u0001"));
        }
        e eVar = this;
        do {
            String str2 = eVar.f83280b.get(str);
            if (str2 != null) {
                return str2;
            }
            eVar = eVar.f83279a;
        } while (eVar != null);
        throw new MissingResourceException(k0.a(new StringBuilder(ProtectedSandApp.s("霹\u0001")), k(this.f83281c, this.f83282d), ProtectedSandApp.s("霺\u0001"), str), e.class.getName(), str);
    }

    public Set<String> h() {
        HashSet hashSet = new HashSet(this.f83280b.keySet());
        e eVar = this;
        while (true) {
            eVar = eVar.f83279a;
            if (eVar == null) {
                return Collections.unmodifiableSet(hashSet);
            }
            hashSet.addAll(eVar.f83280b.keySet());
        }
    }

    private e(e eVar, e eVar2) {
        this.f83279a = eVar2;
        this.f83281c = eVar.f83281c;
        this.f83282d = eVar.f83282d;
        this.f83280b = eVar.f83280b;
    }
}

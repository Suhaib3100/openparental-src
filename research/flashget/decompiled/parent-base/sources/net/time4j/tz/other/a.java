package net.time4j.tz.other;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.tz.d;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.spi.c;

/* compiled from: WindowsZone.java */
/* loaded from: classes7.dex */
public final class a implements Comparable<a>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final Locale f83640b = new Locale("", ProtectedSandApp.s("鶔\u0001"));

    /* renamed from: c, reason: collision with root package name */
    private static final c f83641c = new c();
    private static final long serialVersionUID = -6071278077083785308L;
    private final String name;

    private a(String str) {
        this.name = str;
    }

    private static void a(String str) {
        if (str.isEmpty() || !c.f83662c.keySet().contains(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鶕\u0001").concat(str));
        }
    }

    public static Set<String> c() {
        return c.f83662c.keySet();
    }

    static String d() {
        return c.f83663d;
    }

    public static a e(String str) {
        a(str);
        return new a(str);
    }

    public static void f() {
        l.f0(f83641c);
    }

    public static String i(String str, Locale locale) {
        String canonical = l.X(str).canonical();
        c cVar = f83641c;
        d dVar = d.LONG_STANDARD_TIME;
        String e4 = cVar.e(canonical, dVar, locale);
        return e4.isEmpty() ? cVar.e(canonical, dVar, f83640b) : e4;
    }

    public static String j(k kVar, Locale locale) {
        return i(kVar.canonical(), locale);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(this.name);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.name.compareTo(aVar.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.name.equals(((a) obj).name);
        }
        return false;
    }

    public Set<k> g(Locale locale) {
        Set<k> set = c.f83662c.get(this.name).get(locale.getCountry());
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public k h(Locale locale) {
        Set<k> g4 = g(locale);
        if (g4.size() != 1) {
            String country = locale.getCountry();
            if (!country.isEmpty()) {
                String s4 = ProtectedSandApp.s("鶔\u0001");
                if (!country.equals(s4)) {
                    g4 = c.f83662c.get(this.name).get(s4);
                }
            }
        }
        if (g4.isEmpty()) {
            return null;
        }
        return g4.iterator().next();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}

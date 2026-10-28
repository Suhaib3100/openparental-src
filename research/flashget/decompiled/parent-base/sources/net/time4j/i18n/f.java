package net.time4j.i18n;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.j;

/* compiled from: SymbolProviderSPI.java */
/* loaded from: classes7.dex */
public final class f implements net.time4j.format.i {

    /* renamed from: b, reason: collision with root package name */
    private static final Locale[] f83286b = new Locale[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Set<String> f83287c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f83288d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, j> f83289e;

    static {
        String[] split = e.i(ProtectedSandApp.s("霻\u0001"), Locale.ROOT).g(ProtectedSandApp.s("霼\u0001")).split(ProtectedSandApp.s("霽\u0001"));
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        f83287c = Collections.unmodifiableSet(hashSet);
        f83288d = new f();
        HashMap hashMap = new HashMap();
        for (j jVar : j.values()) {
            hashMap.put(jVar.getCode(), jVar);
        }
        f83289e = Collections.unmodifiableMap(hashMap);
    }

    private static e g(Locale locale) {
        if (f83287c.contains(d.getAlias(locale))) {
            return e.i(ProtectedSandApp.s("霻\u0001"), locale);
        }
        return null;
    }

    private static char h(Locale locale, String str, char c5) {
        e g4 = g(locale);
        return (g4 == null || !g4.c(str)) ? c5 : g4.g(str).charAt(0);
    }

    private static String i(Locale locale, String str, String str2) {
        e g4 = g(locale);
        return (g4 == null || !g4.c(str)) ? str2 : g4.g(str);
    }

    @Override // net.time4j.format.i
    public Locale[] a() {
        return f83286b;
    }

    @Override // net.time4j.format.i
    public char b(Locale locale) {
        return h(locale, ProtectedSandApp.s("霾\u0001"), net.time4j.format.i.f83083a.b(locale));
    }

    @Override // net.time4j.format.i
    public String c(Locale locale) {
        return i(locale, ProtectedSandApp.s("霿\u0001"), net.time4j.format.i.f83083a.c(locale));
    }

    @Override // net.time4j.format.i
    public j d(Locale locale) {
        String i4 = i(locale, ProtectedSandApp.s("靀\u0001"), j.ARABIC.getCode());
        j jVar = f83289e.get(i4);
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException(ProtectedSandApp.s("靁\u0001") + i4 + ProtectedSandApp.s("靂\u0001") + locale + ')');
    }

    @Override // net.time4j.format.i
    public String e(Locale locale) {
        return i(locale, ProtectedSandApp.s("靃\u0001"), net.time4j.format.i.f83083a.e(locale));
    }

    @Override // net.time4j.format.i
    public char f(Locale locale) {
        return h(locale, ProtectedSandApp.s("靄\u0001"), net.time4j.format.i.f83083a.f(locale));
    }

    public String toString() {
        return ProtectedSandApp.s("靅\u0001");
    }
}

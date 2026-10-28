package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PluralRules.java */
/* loaded from: classes7.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static final p f83084a;

    /* renamed from: b, reason: collision with root package name */
    private static final p f83085b;

    /* renamed from: c, reason: collision with root package name */
    private static final p f83086c;

    /* renamed from: d, reason: collision with root package name */
    private static final p f83087d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, p> f83088e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, p> f83089f;

    /* compiled from: PluralRules.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83090a;

        static {
            int[] iArr = new int[k.values().length];
            f83090a = iArr;
            try {
                iArr[k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83090a[k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: PluralRules.java */
    private static class b implements o {
        private b() {
        }

        @Override // net.time4j.format.o
        public p a(Locale locale, k kVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("闕\u0001"));
            int i4 = a.f83090a[kVar.ordinal()];
            if (i4 == 1) {
                return equals ? p.f83084a : p.f83085b;
            }
            if (i4 == 2) {
                return equals ? p.f83086c : p.f83087d;
            }
            throw new UnsupportedOperationException(kVar.name());
        }

        b(a aVar) {
        }
    }

    /* compiled from: PluralRules.java */
    private static class c extends p {

        /* renamed from: g, reason: collision with root package name */
        private final k f83091g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f83092h;

        /* synthetic */ c(k kVar, boolean z4, a aVar) {
            this(kVar, z4);
        }

        @Override // net.time4j.format.p
        public n e(long j4) {
            int i4 = a.f83090a[this.f83091g.ordinal()];
            if (i4 == 1) {
                return j4 == 1 ? n.ONE : n.OTHER;
            }
            if (i4 != 2) {
                throw new UnsupportedOperationException(this.f83091g.name());
            }
            if (this.f83092h) {
                long j5 = j4 % 10;
                long j6 = j4 % 100;
                if (j5 == 1 && j6 != 11) {
                    return n.ONE;
                }
                if (j5 == 2 && j6 != 12) {
                    return n.TWO;
                }
                if (j5 == 3 && j6 != 13) {
                    return n.FEW;
                }
            }
            return n.OTHER;
        }

        @Override // net.time4j.format.p
        public k f() {
            return this.f83091g;
        }

        private c(k kVar, boolean z4) {
            this.f83091g = kVar;
            this.f83092h = z4;
        }
    }

    /* compiled from: PluralRules.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final o f83093a;

        static {
            Iterator it = net.time4j.base.d.c().g(o.class).iterator();
            o oVar = it.hasNext() ? (o) it.next() : null;
            if (oVar == null) {
                oVar = new b();
            }
            f83093a = oVar;
        }

        private d() {
        }
    }

    static {
        k kVar = k.CARDINALS;
        boolean z4 = true;
        a aVar = null;
        f83084a = new c(kVar, z4, aVar);
        boolean z5 = false;
        f83085b = new c(kVar, z5, aVar);
        k kVar2 = k.ORDINALS;
        f83086c = new c(kVar2, z4, aVar);
        f83087d = new c(kVar2, z5, aVar);
        f83088e = new ConcurrentHashMap();
        f83089f = new ConcurrentHashMap();
    }

    private static Map<String, p> g(k kVar) {
        int i4 = a.f83090a[kVar.ordinal()];
        if (i4 == 1) {
            return f83088e;
        }
        if (i4 == 2) {
            return f83089f;
        }
        throw new UnsupportedOperationException(kVar.name());
    }

    public static p h(Locale locale, k kVar) {
        Map<String, p> g4 = g(kVar);
        if (!g4.isEmpty()) {
            r2 = locale.getCountry().equals("") ? null : g4.get(j(locale));
            if (r2 == null) {
                r2 = g4.get(locale.getLanguage());
            }
        }
        return r2 == null ? d.f83093a.a(locale, kVar) : r2;
    }

    public static void i(Locale locale, p pVar) {
        Map<String, p> g4 = g(pVar.f());
        String language = locale.getLanguage();
        if (!locale.getCountry().equals("")) {
            language = j(locale);
        }
        g4.put(language, pVar);
    }

    private static String j(Locale locale) {
        return locale.getLanguage() + '_' + locale.getCountry();
    }

    public abstract n e(long j4);

    public abstract k f();
}

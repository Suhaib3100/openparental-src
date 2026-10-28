package androidx.core.os;

import androidx.annotation.m1;
import androidx.annotation.x0;
import androidx.collection.r2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes3.dex */
final class q implements r {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f26546c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f26547d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f26548e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f26549f = p.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f26550a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f26551b;

    /* compiled from: LocaleListCompatWrapper.java */
    @x0(21)
    static class a {
        private a() {
        }

        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    q(@androidx.annotation.o0 Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f26550a = f26546c;
            this.f26551b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < localeArr.length; i4++) {
            Locale locale = localeArr[i4];
            if (locale == null) {
                throw new NullPointerException(r2.a("list[", i4, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                k(sb, locale2);
                if (i4 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f26550a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f26551b = sb.toString();
    }

    private Locale e(Collection<String> collection, boolean z4) {
        int f4 = f(collection, z4);
        if (f4 == -1) {
            return null;
        }
        return this.f26550a[f4];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r6 < Integer.MAX_VALUE) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int f(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f26550a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = androidx.core.os.q.f26549f
            int r6 = r4.g(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.os.p.b(r1)
            int r1 = r4.g(r1)
            if (r1 != 0) goto L3a
            return r3
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r3
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.q.f(java.util.Collection, boolean):int");
    }

    private int g(Locale locale) {
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f26550a;
            if (i4 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, localeArr[i4]) > 0) {
                return i4;
            }
            i4++;
        }
    }

    private static String h(Locale locale) {
        String script = locale.getScript();
        return !script.isEmpty() ? script : "";
    }

    private static boolean i(Locale locale) {
        return f26547d.equals(locale) || f26548e.equals(locale);
    }

    @androidx.annotation.g0(from = 0, to = 1)
    private static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String h4 = h(locale);
        if (!h4.isEmpty()) {
            return h4.equals(h(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @m1
    static void k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // androidx.core.os.r
    public int a(Locale locale) {
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f26550a;
            if (i4 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i4].equals(locale)) {
                return i4;
            }
            i4++;
        }
    }

    @Override // androidx.core.os.r
    public String b() {
        return this.f26551b;
    }

    @Override // androidx.core.os.r
    @androidx.annotation.q0
    public Object c() {
        return null;
    }

    @Override // androidx.core.os.r
    public Locale d(@androidx.annotation.o0 String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        Locale[] localeArr = ((q) obj).f26550a;
        if (this.f26550a.length != localeArr.length) {
            return false;
        }
        int i4 = 0;
        while (true) {
            Locale[] localeArr2 = this.f26550a;
            if (i4 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i4].equals(localeArr[i4])) {
                return false;
            }
            i4++;
        }
    }

    @Override // androidx.core.os.r
    public Locale get(int i4) {
        if (i4 >= 0) {
            Locale[] localeArr = this.f26550a;
            if (i4 < localeArr.length) {
                return localeArr[i4];
            }
        }
        return null;
    }

    public int hashCode() {
        int i4 = 1;
        for (Locale locale : this.f26550a) {
            i4 = (i4 * 31) + locale.hashCode();
        }
        return i4;
    }

    @Override // androidx.core.os.r
    public boolean isEmpty() {
        return this.f26550a.length == 0;
    }

    @Override // androidx.core.os.r
    public int size() {
        return this.f26550a.length;
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f26550a;
            if (i4 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i4]);
            if (i4 < this.f26550a.length - 1) {
                sb.append(',');
            }
            i4++;
        }
    }
}

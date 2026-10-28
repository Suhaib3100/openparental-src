package androidx.core.os;

import androidx.annotation.g0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes3.dex */
final class m implements n {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f4980c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f4981d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f4982e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f4983f = l.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f4984a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final String f4985b;

    /* compiled from: LocaleListCompatWrapper.java */
    @x0(21)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    m(@o0 Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f4984a = f4980c;
            this.f4985b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < localeArr.length; i5++) {
            Locale locale = localeArr[i5];
            if (locale == null) {
                throw new NullPointerException(androidx.constraintlayout.solver.f.a("list[", i5, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                k(sb, locale2);
                if (i5 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f4984a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f4985b = sb.toString();
    }

    private Locale e(Collection<String> collection, boolean z5) {
        int f6 = f(collection, z5);
        if (f6 == -1) {
            return null;
        }
        return this.f4984a[f6];
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
            java.util.Locale[] r0 = r4.f4984a
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
            java.util.Locale r6 = androidx.core.os.m.f4983f
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
            java.util.Locale r1 = androidx.core.os.l.b(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.m.f(java.util.Collection, boolean):int");
    }

    private int g(Locale locale) {
        int i5 = 0;
        while (true) {
            Locale[] localeArr = this.f4984a;
            if (i5 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, localeArr[i5]) > 0) {
                return i5;
            }
            i5++;
        }
    }

    private static String h(Locale locale) {
        String a6 = a.a(locale);
        return !a6.isEmpty() ? a6 : "";
    }

    private static boolean i(Locale locale) {
        return f4981d.equals(locale) || f4982e.equals(locale);
    }

    @g0(from = 0, to = 1)
    private static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String h5 = h(locale);
        if (!h5.isEmpty()) {
            return h5.equals(h(locale2)) ? 1 : 0;
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

    @Override // androidx.core.os.n
    public int a(Locale locale) {
        int i5 = 0;
        while (true) {
            Locale[] localeArr = this.f4984a;
            if (i5 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i5].equals(locale)) {
                return i5;
            }
            i5++;
        }
    }

    @Override // androidx.core.os.n
    public String b() {
        return this.f4985b;
    }

    @Override // androidx.core.os.n
    @q0
    public Object c() {
        return null;
    }

    @Override // androidx.core.os.n
    public Locale d(@o0 String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        Locale[] localeArr = ((m) obj).f4984a;
        if (this.f4984a.length != localeArr.length) {
            return false;
        }
        int i5 = 0;
        while (true) {
            Locale[] localeArr2 = this.f4984a;
            if (i5 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i5].equals(localeArr[i5])) {
                return false;
            }
            i5++;
        }
    }

    @Override // androidx.core.os.n
    public Locale get(int i5) {
        if (i5 >= 0) {
            Locale[] localeArr = this.f4984a;
            if (i5 < localeArr.length) {
                return localeArr[i5];
            }
        }
        return null;
    }

    public int hashCode() {
        int i5 = 1;
        for (Locale locale : this.f4984a) {
            i5 = (i5 * 31) + locale.hashCode();
        }
        return i5;
    }

    @Override // androidx.core.os.n
    public boolean isEmpty() {
        return this.f4984a.length == 0;
    }

    @Override // androidx.core.os.n
    public int size() {
        return this.f4984a.length;
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i5 = 0;
        while (true) {
            Locale[] localeArr = this.f4984a;
            if (i5 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i5]);
            if (i5 < this.f4984a.length - 1) {
                sb.append(',');
            }
            i5++;
        }
    }
}

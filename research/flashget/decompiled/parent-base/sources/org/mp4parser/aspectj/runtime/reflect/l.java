package org.mp4parser.aspectj.runtime.reflect;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;

/* compiled from: SignatureImpl.java */
/* loaded from: classes9.dex */
abstract class l implements org.mp4parser.aspectj.lang.e {

    /* renamed from: h, reason: collision with root package name */
    private static boolean f87764h = true;

    /* renamed from: i, reason: collision with root package name */
    static final char f87765i = '-';

    /* renamed from: a, reason: collision with root package name */
    int f87769a;

    /* renamed from: b, reason: collision with root package name */
    String f87770b;

    /* renamed from: c, reason: collision with root package name */
    String f87771c;

    /* renamed from: d, reason: collision with root package name */
    Class f87772d;

    /* renamed from: e, reason: collision with root package name */
    a f87773e;

    /* renamed from: f, reason: collision with root package name */
    private String f87774f;

    /* renamed from: g, reason: collision with root package name */
    ClassLoader f87775g;

    /* renamed from: l, reason: collision with root package name */
    static final String f87768l = ":";

    /* renamed from: j, reason: collision with root package name */
    static String[] f87766j = new String[0];

    /* renamed from: k, reason: collision with root package name */
    static Class[] f87767k = new Class[0];

    /* compiled from: SignatureImpl.java */
    private interface a {
        void a(int i4, String str);

        String get(int i4);
    }

    /* compiled from: SignatureImpl.java */
    private static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private SoftReference f87776a;

        public b() {
            c();
        }

        private String[] b() {
            return (String[]) this.f87776a.get();
        }

        private String[] c() {
            String[] strArr = new String[3];
            this.f87776a = new SoftReference(strArr);
            return strArr;
        }

        @Override // org.mp4parser.aspectj.runtime.reflect.l.a
        public void a(int i4, String str) {
            String[] b5 = b();
            if (b5 == null) {
                b5 = c();
            }
            b5[i4] = str;
        }

        @Override // org.mp4parser.aspectj.runtime.reflect.l.a
        public String get(int i4) {
            String[] b5 = b();
            if (b5 == null) {
                return null;
            }
            return b5[i4];
        }
    }

    l(int i4, String str, Class cls) {
        this.f87775g = null;
        this.f87769a = i4;
        this.f87770b = str;
        this.f87772d = cls;
    }

    static void B(boolean z4) {
        f87764h = z4;
    }

    private ClassLoader y() {
        if (this.f87775g == null) {
            this.f87775g = getClass().getClassLoader();
        }
        return this.f87775g;
    }

    static boolean z() {
        return f87764h;
    }

    public void A(ClassLoader classLoader) {
        this.f87775g = classLoader;
    }

    String C(Class cls) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return D(cls.getName()).replace('$', '.');
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C(cls.getComponentType()));
        stringBuffer.append("[]");
        return stringBuffer.toString();
    }

    String D(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String E(org.mp4parser.aspectj.runtime.reflect.n r3) {
        /*
            r2 = this;
            boolean r0 = org.mp4parser.aspectj.runtime.reflect.l.f87764h
            if (r0 == 0) goto L1b
            org.mp4parser.aspectj.runtime.reflect.l$a r0 = r2.f87773e
            if (r0 != 0) goto L14
            org.mp4parser.aspectj.runtime.reflect.l$b r0 = new org.mp4parser.aspectj.runtime.reflect.l$b     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            r2.f87773e = r0     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r0 = 0
            org.mp4parser.aspectj.runtime.reflect.l.f87764h = r0
            goto L1b
        L14:
            int r1 = r3.f87791i
            java.lang.String r0 = r0.get(r1)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L22
            java.lang.String r0 = r2.r(r3)
        L22:
            boolean r1 = org.mp4parser.aspectj.runtime.reflect.l.f87764h
            if (r1 == 0) goto L2d
            org.mp4parser.aspectj.runtime.reflect.l$a r1 = r2.f87773e
            int r3 = r3.f87791i
            r1.a(r3, r0)
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mp4parser.aspectj.runtime.reflect.l.E(org.mp4parser.aspectj.runtime.reflect.n):java.lang.String");
    }

    @Override // org.mp4parser.aspectj.lang.e
    public Class a() {
        if (this.f87772d == null) {
            this.f87772d = v(2);
        }
        return this.f87772d;
    }

    @Override // org.mp4parser.aspectj.lang.e
    public final String d() {
        return E(n.f87780j);
    }

    @Override // org.mp4parser.aspectj.lang.e
    public final String f() {
        return E(n.f87782l);
    }

    @Override // org.mp4parser.aspectj.lang.e
    public int getModifiers() {
        if (this.f87769a == -1) {
            this.f87769a = s(0);
        }
        return this.f87769a;
    }

    @Override // org.mp4parser.aspectj.lang.e
    public String getName() {
        if (this.f87770b == null) {
            this.f87770b = t(1);
        }
        return this.f87770b;
    }

    @Override // org.mp4parser.aspectj.lang.e
    public String n() {
        if (this.f87771c == null) {
            this.f87771c = a().getName();
        }
        return this.f87771c;
    }

    void o(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(x(clsArr[i4]));
        }
    }

    void p(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(C(clsArr[i4]));
        }
    }

    void q(StringBuffer stringBuffer, Class[] clsArr) {
        o(stringBuffer, clsArr);
    }

    protected abstract String r(n nVar);

    int s(int i4) {
        return Integer.parseInt(t(i4), 16);
    }

    String t(int i4) {
        int indexOf = this.f87774f.indexOf(45);
        int i5 = 0;
        while (true) {
            int i6 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            i5 = indexOf + 1;
            indexOf = this.f87774f.indexOf(45, i5);
            i4 = i6;
        }
        if (indexOf == -1) {
            indexOf = this.f87774f.length();
        }
        return this.f87774f.substring(i5, indexOf);
    }

    @Override // org.mp4parser.aspectj.lang.e
    public final String toString() {
        return E(n.f87781k);
    }

    String[] u(int i4) {
        StringTokenizer stringTokenizer = new StringTokenizer(t(i4), ":");
        int countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i5 = 0; i5 < countTokens; i5++) {
            strArr[i5] = stringTokenizer.nextToken();
        }
        return strArr;
    }

    Class v(int i4) {
        return e.h(t(i4), y());
    }

    Class[] w(int i4) {
        StringTokenizer stringTokenizer = new StringTokenizer(t(i4), ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i5 = 0; i5 < countTokens; i5++) {
            clsArr[i5] = e.h(stringTokenizer.nextToken(), y());
        }
        return clsArr;
    }

    String x(Class cls) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return cls.getName().replace('$', '.');
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(x(cls.getComponentType()));
        stringBuffer.append("[]");
        return stringBuffer.toString();
    }

    public l(String str) {
        this.f87769a = -1;
        this.f87775g = null;
        this.f87774f = str;
    }
}

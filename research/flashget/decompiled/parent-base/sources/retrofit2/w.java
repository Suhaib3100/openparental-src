package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.u;

/* compiled from: RequestFactory.java */
/* loaded from: classes9.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Method f90025a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.v f90026b;

    /* renamed from: c, reason: collision with root package name */
    final String f90027c;

    /* renamed from: d, reason: collision with root package name */
    @zc.h
    private final String f90028d;

    /* renamed from: e, reason: collision with root package name */
    @zc.h
    private final okhttp3.u f90029e;

    /* renamed from: f, reason: collision with root package name */
    @zc.h
    private final okhttp3.x f90030f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f90031g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f90032h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f90033i;

    /* renamed from: j, reason: collision with root package name */
    private final o<?>[] f90034j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f90035k;

    /* compiled from: RequestFactory.java */
    static final class a {

        /* renamed from: x, reason: collision with root package name */
        private static final String f90036x = ProtectedSandApp.s("꘍\u0001");

        /* renamed from: y, reason: collision with root package name */
        private static final Pattern f90037y = Pattern.compile(ProtectedSandApp.s("꘎\u0001"));

        /* renamed from: z, reason: collision with root package name */
        private static final Pattern f90038z = Pattern.compile(ProtectedSandApp.s("꘍\u0001"));

        /* renamed from: a, reason: collision with root package name */
        final y f90039a;

        /* renamed from: b, reason: collision with root package name */
        final Method f90040b;

        /* renamed from: c, reason: collision with root package name */
        final Annotation[] f90041c;

        /* renamed from: d, reason: collision with root package name */
        final Annotation[][] f90042d;

        /* renamed from: e, reason: collision with root package name */
        final Type[] f90043e;

        /* renamed from: f, reason: collision with root package name */
        boolean f90044f;

        /* renamed from: g, reason: collision with root package name */
        boolean f90045g;

        /* renamed from: h, reason: collision with root package name */
        boolean f90046h;

        /* renamed from: i, reason: collision with root package name */
        boolean f90047i;

        /* renamed from: j, reason: collision with root package name */
        boolean f90048j;

        /* renamed from: k, reason: collision with root package name */
        boolean f90049k;

        /* renamed from: l, reason: collision with root package name */
        boolean f90050l;

        /* renamed from: m, reason: collision with root package name */
        boolean f90051m;

        /* renamed from: n, reason: collision with root package name */
        @zc.h
        String f90052n;

        /* renamed from: o, reason: collision with root package name */
        boolean f90053o;

        /* renamed from: p, reason: collision with root package name */
        boolean f90054p;

        /* renamed from: q, reason: collision with root package name */
        boolean f90055q;

        /* renamed from: r, reason: collision with root package name */
        @zc.h
        String f90056r;

        /* renamed from: s, reason: collision with root package name */
        @zc.h
        okhttp3.u f90057s;

        /* renamed from: t, reason: collision with root package name */
        @zc.h
        okhttp3.x f90058t;

        /* renamed from: u, reason: collision with root package name */
        @zc.h
        Set<String> f90059u;

        /* renamed from: v, reason: collision with root package name */
        @zc.h
        o<?>[] f90060v;

        /* renamed from: w, reason: collision with root package name */
        boolean f90061w;

        a(y yVar, Method method) {
            this.f90039a = yVar;
            this.f90040b = method;
            this.f90041c = method.getAnnotations();
            this.f90043e = method.getGenericParameterTypes();
            this.f90042d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private okhttp3.u c(String[] strArr) {
            u.a aVar = new u.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw c0.m(this.f90040b, ProtectedSandApp.s("ꘑ\u0001"), str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (ProtectedSandApp.s("꘏\u0001").equalsIgnoreCase(substring)) {
                    try {
                        this.f90058t = okhttp3.x.h(trim);
                    } catch (IllegalArgumentException e4) {
                        throw c0.n(this.f90040b, e4, ProtectedSandApp.s("ꘐ\u0001"), trim);
                    }
                } else {
                    aVar.b(substring, trim);
                }
            }
            return aVar.i();
        }

        private void d(String str, String str2, boolean z4) {
            String str3 = this.f90052n;
            if (str3 != null) {
                throw c0.m(this.f90040b, ProtectedSandApp.s("ꘓ\u0001"), str3, str);
            }
            this.f90052n = str;
            this.f90053o = z4;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f90037y.matcher(substring).find()) {
                    throw c0.m(this.f90040b, ProtectedSandApp.s("ꘒ\u0001"), substring);
                }
            }
            this.f90056r = str2;
            this.f90059u = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof pg.b) {
                d(ProtectedSandApp.s("ꘔ\u0001"), ((pg.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof pg.f) {
                d(ProtectedSandApp.s("ꘕ\u0001"), ((pg.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof pg.g) {
                d(ProtectedSandApp.s("ꘖ\u0001"), ((pg.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof pg.n) {
                d(ProtectedSandApp.s("ꘗ\u0001"), ((pg.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof pg.o) {
                d(ProtectedSandApp.s("ꘘ\u0001"), ((pg.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof pg.p) {
                d(ProtectedSandApp.s("ꘙ\u0001"), ((pg.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof pg.m) {
                d(ProtectedSandApp.s("ꘚ\u0001"), ((pg.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof pg.h) {
                pg.h hVar = (pg.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof pg.k) {
                String[] value = ((pg.k) annotation).value();
                if (value.length == 0) {
                    throw c0.m(this.f90040b, ProtectedSandApp.s("ꘛ\u0001"), new Object[0]);
                }
                this.f90057s = c(value);
                return;
            }
            boolean z4 = annotation instanceof pg.l;
            String s4 = ProtectedSandApp.s("ꘜ\u0001");
            if (z4) {
                if (this.f90054p) {
                    throw c0.m(this.f90040b, s4, new Object[0]);
                }
                this.f90055q = true;
            } else if (annotation instanceof pg.e) {
                if (this.f90055q) {
                    throw c0.m(this.f90040b, s4, new Object[0]);
                }
                this.f90054p = true;
            }
        }

        @zc.h
        private o<?> f(int i4, Type type, @zc.h Annotation[] annotationArr, boolean z4) {
            o<?> oVar;
            if (annotationArr != null) {
                oVar = null;
                for (Annotation annotation : annotationArr) {
                    o<?> g4 = g(i4, type, annotationArr, annotation);
                    if (g4 != null) {
                        if (oVar != null) {
                            throw c0.o(this.f90040b, i4, ProtectedSandApp.s("ꘝ\u0001"), new Object[0]);
                        }
                        oVar = g4;
                    }
                }
            } else {
                oVar = null;
            }
            if (oVar != null) {
                return oVar;
            }
            if (z4) {
                try {
                    if (c0.h(type) == kotlin.coroutines.d.class) {
                        this.f90061w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw c0.o(this.f90040b, i4, ProtectedSandApp.s("ꘞ\u0001"), new Object[0]);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            if (com.flashget.parentalcontrol.ProtectedSandApp.s("꘠\u0001").equals(((java.lang.Class) r13).getName()) != false) goto L28;
         */
        @zc.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private retrofit2.o<?> g(int r12, java.lang.reflect.Type r13, java.lang.annotation.Annotation[] r14, java.lang.annotation.Annotation r15) {
            /*
                Method dump skipped, instructions count: 2000
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.w.a.g(int, java.lang.reflect.Type, java.lang.annotation.Annotation[], java.lang.annotation.Annotation):retrofit2.o");
        }

        static Set<String> h(String str) {
            Matcher matcher = f90037y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i4, String str) {
            if (!f90038z.matcher(str).matches()) {
                throw c0.o(this.f90040b, i4, ProtectedSandApp.s("Ꙉ\u0001"), f90037y.pattern(), str);
            }
            if (this.f90059u.contains(str)) {
                return;
            }
            throw c0.o(this.f90040b, i4, ProtectedSandApp.s("ꙇ\u0001"), this.f90056r, str);
        }

        private void j(int i4, Type type) {
            if (c0.j(type)) {
                throw c0.o(this.f90040b, i4, ProtectedSandApp.s("ꙉ\u0001"), type);
            }
        }

        w b() {
            for (Annotation annotation : this.f90041c) {
                e(annotation);
            }
            if (this.f90052n == null) {
                throw c0.m(this.f90040b, ProtectedSandApp.s("Ꙑ\u0001"), new Object[0]);
            }
            if (!this.f90053o) {
                if (this.f90055q) {
                    throw c0.m(this.f90040b, ProtectedSandApp.s("ꙋ\u0001"), new Object[0]);
                }
                if (this.f90054p) {
                    throw c0.m(this.f90040b, ProtectedSandApp.s("Ꙋ\u0001"), new Object[0]);
                }
            }
            int length = this.f90042d.length;
            this.f90060v = new o[length];
            int i4 = length - 1;
            int i5 = 0;
            while (i5 < length) {
                this.f90060v[i5] = f(i5, this.f90043e[i5], this.f90042d[i5], i5 == i4);
                i5++;
            }
            if (this.f90056r == null && !this.f90051m) {
                throw c0.m(this.f90040b, ProtectedSandApp.s("Ꙍ\u0001"), this.f90052n);
            }
            boolean z4 = this.f90054p;
            if (!z4 && !this.f90055q && !this.f90053o && this.f90046h) {
                throw c0.m(this.f90040b, ProtectedSandApp.s("ꙍ\u0001"), new Object[0]);
            }
            if (z4 && !this.f90044f) {
                throw c0.m(this.f90040b, ProtectedSandApp.s("Ꙏ\u0001"), new Object[0]);
            }
            if (!this.f90055q || this.f90045g) {
                return new w(this);
            }
            throw c0.m(this.f90040b, ProtectedSandApp.s("ꙏ\u0001"), new Object[0]);
        }
    }

    w(a aVar) {
        this.f90025a = aVar.f90040b;
        this.f90026b = aVar.f90039a.f90067c;
        this.f90027c = aVar.f90052n;
        this.f90028d = aVar.f90056r;
        this.f90029e = aVar.f90057s;
        this.f90030f = aVar.f90058t;
        this.f90031g = aVar.f90053o;
        this.f90032h = aVar.f90054p;
        this.f90033i = aVar.f90055q;
        this.f90034j = aVar.f90060v;
        this.f90035k = aVar.f90061w;
    }

    static w b(y yVar, Method method) {
        return new a(yVar, method).b();
    }

    okhttp3.d0 a(Object[] objArr) throws IOException {
        o<?>[] oVarArr = this.f90034j;
        int length = objArr.length;
        if (length != oVarArr.length) {
            throw new IllegalArgumentException(android.support.v4.media.b.a(androidx.collection.s.a(ProtectedSandApp.s("ꙑ\u0001"), length, ProtectedSandApp.s("Ꙓ\u0001")), oVarArr.length, ProtectedSandApp.s("ꙓ\u0001")));
        }
        v vVar = new v(this.f90027c, this.f90026b, this.f90028d, this.f90029e, this.f90030f, this.f90031g, this.f90032h, this.f90033i);
        if (this.f90035k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(objArr[i4]);
            oVarArr[i4].a(vVar, objArr[i4]);
        }
        return vVar.k().z(k.class, new k(this.f90025a, arrayList)).b();
    }
}

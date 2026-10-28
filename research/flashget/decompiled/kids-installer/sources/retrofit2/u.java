package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import okhttp3.e0;
import okhttp3.v;
import okhttp3.z;
import retrofit2.o;

/* compiled from: RequestFactory.java */
/* loaded from: classes5.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Method f33109a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.w f33110b;

    /* renamed from: c, reason: collision with root package name */
    final String f33111c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f33112d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final okhttp3.v f33113e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final okhttp3.y f33114f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f33115g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f33116h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f33117i;

    /* renamed from: j, reason: collision with root package name */
    private final o<?>[] f33118j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f33119k;

    /* compiled from: RequestFactory.java */
    static final class a {

        /* renamed from: x, reason: collision with root package name */
        private static final String f33120x = ProtectedSandApp.s("楕");

        /* renamed from: y, reason: collision with root package name */
        private static final Pattern f33121y = Pattern.compile(ProtectedSandApp.s("楖"));

        /* renamed from: z, reason: collision with root package name */
        private static final Pattern f33122z = Pattern.compile(ProtectedSandApp.s("楗"));

        /* renamed from: a, reason: collision with root package name */
        final w f33123a;

        /* renamed from: b, reason: collision with root package name */
        final Method f33124b;

        /* renamed from: c, reason: collision with root package name */
        final Annotation[] f33125c;

        /* renamed from: d, reason: collision with root package name */
        final Annotation[][] f33126d;

        /* renamed from: e, reason: collision with root package name */
        final Type[] f33127e;

        /* renamed from: f, reason: collision with root package name */
        boolean f33128f;

        /* renamed from: g, reason: collision with root package name */
        boolean f33129g;

        /* renamed from: h, reason: collision with root package name */
        boolean f33130h;

        /* renamed from: i, reason: collision with root package name */
        boolean f33131i;

        /* renamed from: j, reason: collision with root package name */
        boolean f33132j;

        /* renamed from: k, reason: collision with root package name */
        boolean f33133k;

        /* renamed from: l, reason: collision with root package name */
        boolean f33134l;

        /* renamed from: m, reason: collision with root package name */
        boolean f33135m;

        /* renamed from: n, reason: collision with root package name */
        @Nullable
        String f33136n;

        /* renamed from: o, reason: collision with root package name */
        boolean f33137o;

        /* renamed from: p, reason: collision with root package name */
        boolean f33138p;

        /* renamed from: q, reason: collision with root package name */
        boolean f33139q;

        /* renamed from: r, reason: collision with root package name */
        @Nullable
        String f33140r;

        /* renamed from: s, reason: collision with root package name */
        @Nullable
        okhttp3.v f33141s;

        /* renamed from: t, reason: collision with root package name */
        @Nullable
        okhttp3.y f33142t;

        /* renamed from: u, reason: collision with root package name */
        @Nullable
        Set<String> f33143u;

        /* renamed from: v, reason: collision with root package name */
        @Nullable
        o<?>[] f33144v;

        /* renamed from: w, reason: collision with root package name */
        boolean f33145w;

        a(w wVar, Method method) {
            this.f33123a = wVar;
            this.f33124b = method;
            this.f33125c = method.getAnnotations();
            this.f33127e = method.getGenericParameterTypes();
            this.f33126d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private okhttp3.v c(String[] strArr) {
            v.a aVar = new v.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw a0.m(this.f33124b, ProtectedSandApp.s("楚"), str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (ProtectedSandApp.s("楘").equalsIgnoreCase(substring)) {
                    try {
                        this.f33142t = okhttp3.y.h(trim);
                    } catch (IllegalArgumentException e6) {
                        throw a0.n(this.f33124b, e6, ProtectedSandApp.s("楙"), trim);
                    }
                } else {
                    aVar.b(substring, trim);
                }
            }
            return aVar.i();
        }

        private void d(String str, String str2, boolean z5) {
            String str3 = this.f33136n;
            if (str3 != null) {
                throw a0.m(this.f33124b, ProtectedSandApp.s("楜"), str3, str);
            }
            this.f33136n = str;
            this.f33137o = z5;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f33121y.matcher(substring).find()) {
                    throw a0.m(this.f33124b, ProtectedSandApp.s("楛"), substring);
                }
            }
            this.f33140r = str2;
            this.f33143u = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof e5.b) {
                d(ProtectedSandApp.s("楝"), ((e5.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof e5.f) {
                d(ProtectedSandApp.s("楞"), ((e5.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof e5.g) {
                d(ProtectedSandApp.s("楟"), ((e5.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof e5.n) {
                d(ProtectedSandApp.s("楠"), ((e5.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof e5.o) {
                d(ProtectedSandApp.s("楡"), ((e5.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof e5.p) {
                d(ProtectedSandApp.s("楢"), ((e5.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof e5.m) {
                d(ProtectedSandApp.s("楣"), ((e5.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof e5.h) {
                e5.h hVar = (e5.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof e5.k) {
                String[] value = ((e5.k) annotation).value();
                if (value.length == 0) {
                    throw a0.m(this.f33124b, ProtectedSandApp.s("楤"), new Object[0]);
                }
                this.f33141s = c(value);
                return;
            }
            boolean z5 = annotation instanceof e5.l;
            String s5 = ProtectedSandApp.s("楥");
            if (z5) {
                if (this.f33138p) {
                    throw a0.m(this.f33124b, s5, new Object[0]);
                }
                this.f33139q = true;
            } else if (annotation instanceof e5.e) {
                if (this.f33139q) {
                    throw a0.m(this.f33124b, s5, new Object[0]);
                }
                this.f33138p = true;
            }
        }

        @Nullable
        private o<?> f(int i5, Type type, @Nullable Annotation[] annotationArr, boolean z5) {
            o<?> oVar;
            if (annotationArr != null) {
                oVar = null;
                for (Annotation annotation : annotationArr) {
                    o<?> g5 = g(i5, type, annotationArr, annotation);
                    if (g5 != null) {
                        if (oVar != null) {
                            throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楦"), new Object[0]);
                        }
                        oVar = g5;
                    }
                }
            } else {
                oVar = null;
            }
            if (oVar != null) {
                return oVar;
            }
            if (z5) {
                try {
                    if (a0.h(type) == Continuation.class) {
                        this.f33145w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楧"), new Object[0]);
        }

        @Nullable
        private o<?> g(int i5, Type type, Annotation[] annotationArr, Annotation annotation) {
            boolean z5 = annotation instanceof e5.y;
            String s5 = ProtectedSandApp.s("楨");
            if (z5) {
                j(i5, type);
                if (this.f33135m) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楯"), new Object[0]);
                }
                if (this.f33131i) {
                    throw a0.o(this.f33124b, i5, s5, new Object[0]);
                }
                if (this.f33132j) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楮"), new Object[0]);
                }
                if (this.f33133k) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("業"), new Object[0]);
                }
                if (this.f33134l) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楬"), new Object[0]);
                }
                if (this.f33140r != null) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楫"), this.f33136n);
                }
                this.f33135m = true;
                if (type == okhttp3.w.class || type == String.class || type == URI.class || ((type instanceof Class) && ProtectedSandApp.s("楩").equals(((Class) type).getName()))) {
                    return new o.p(this.f33124b, i5);
                }
                throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楪"), new Object[0]);
            }
            if (annotation instanceof e5.s) {
                j(i5, type);
                if (this.f33132j) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楳"), new Object[0]);
                }
                if (this.f33133k) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楲"), new Object[0]);
                }
                if (this.f33134l) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楱"), new Object[0]);
                }
                if (this.f33135m) {
                    throw a0.o(this.f33124b, i5, s5, new Object[0]);
                }
                if (this.f33140r == null) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楰"), this.f33136n);
                }
                this.f33131i = true;
                e5.s sVar = (e5.s) annotation;
                String value = sVar.value();
                i(i5, value);
                return new o.k(this.f33124b, i5, value, this.f33123a.o(type, annotationArr), sVar.encoded());
            }
            boolean z6 = annotation instanceof e5.t;
            String s6 = ProtectedSandApp.s("楴");
            String s7 = ProtectedSandApp.s("極");
            if (z6) {
                j(i5, type);
                e5.t tVar = (e5.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h5 = a0.h(type);
                this.f33132j = true;
                if (!Iterable.class.isAssignableFrom(h5)) {
                    return h5.isArray() ? new o.b() : new o.l(value2, this.f33123a.o(type, annotationArr), encoded);
                }
                if (type instanceof ParameterizedType) {
                    return new o.a();
                }
                throw a0.o(this.f33124b, i5, h5.getSimpleName() + s7 + h5.getSimpleName() + s6, new Object[0]);
            }
            if (annotation instanceof e5.v) {
                j(i5, type);
                boolean encoded2 = ((e5.v) annotation).encoded();
                Class<?> h6 = a0.h(type);
                this.f33133k = true;
                if (!Iterable.class.isAssignableFrom(h6)) {
                    return h6.isArray() ? new o.b() : new o.n(this.f33123a.o(type, annotationArr), encoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new o.a();
                }
                throw a0.o(this.f33124b, i5, h6.getSimpleName() + s7 + h6.getSimpleName() + s6, new Object[0]);
            }
            boolean z7 = annotation instanceof e5.u;
            String s8 = ProtectedSandApp.s("楶");
            if (z7) {
                j(i5, type);
                Class<?> h7 = a0.h(type);
                this.f33134l = true;
                if (!Map.class.isAssignableFrom(h7)) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楸"), new Object[0]);
                }
                Type i6 = a0.i(type, h7, Map.class);
                if (!(i6 instanceof ParameterizedType)) {
                    throw a0.o(this.f33124b, i5, s8, new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) i6;
                Type g5 = a0.g(0, parameterizedType);
                if (String.class == g5) {
                    return new o.m(this.f33124b, i5, this.f33123a.o(a0.g(1, parameterizedType), annotationArr), ((e5.u) annotation).encoded());
                }
                throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楷") + g5, new Object[0]);
            }
            if (annotation instanceof e5.i) {
                j(i5, type);
                String value3 = ((e5.i) annotation).value();
                Class<?> h8 = a0.h(type);
                if (!Iterable.class.isAssignableFrom(h8)) {
                    return h8.isArray() ? new o.b() : new o.f(value3, this.f33123a.o(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new o.a();
                }
                throw a0.o(this.f33124b, i5, h8.getSimpleName() + s7 + h8.getSimpleName() + s6, new Object[0]);
            }
            if (annotation instanceof e5.j) {
                if (type == okhttp3.v.class) {
                    return new o.h(this.f33124b, i5);
                }
                j(i5, type);
                Class<?> h9 = a0.h(type);
                if (!Map.class.isAssignableFrom(h9)) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楺"), new Object[0]);
                }
                Type i7 = a0.i(type, h9, Map.class);
                if (!(i7 instanceof ParameterizedType)) {
                    throw a0.o(this.f33124b, i5, s8, new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) i7;
                Type g6 = a0.g(0, parameterizedType2);
                if (String.class == g6) {
                    return new o.g(this.f33124b, i5, this.f33123a.o(a0.g(1, parameterizedType2), annotationArr));
                }
                throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楹") + g6, new Object[0]);
            }
            if (annotation instanceof e5.c) {
                j(i5, type);
                if (!this.f33138p) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楻"), new Object[0]);
                }
                e5.c cVar = (e5.c) annotation;
                String value4 = cVar.value();
                boolean encoded3 = cVar.encoded();
                this.f33128f = true;
                Class<?> h10 = a0.h(type);
                if (!Iterable.class.isAssignableFrom(h10)) {
                    return h10.isArray() ? new o.b() : new o.d(value4, this.f33123a.o(type, annotationArr), encoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new o.a();
                }
                throw a0.o(this.f33124b, i5, h10.getSimpleName() + s7 + h10.getSimpleName() + s6, new Object[0]);
            }
            if (annotation instanceof e5.d) {
                j(i5, type);
                if (!this.f33138p) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楾"), new Object[0]);
                }
                Class<?> h11 = a0.h(type);
                if (!Map.class.isAssignableFrom(h11)) {
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楽"), new Object[0]);
                }
                Type i8 = a0.i(type, h11, Map.class);
                if (!(i8 instanceof ParameterizedType)) {
                    throw a0.o(this.f33124b, i5, s8, new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) i8;
                Type g7 = a0.g(0, parameterizedType3);
                if (String.class == g7) {
                    f o5 = this.f33123a.o(a0.g(1, parameterizedType3), annotationArr);
                    this.f33128f = true;
                    return new o.e(this.f33124b, i5, o5, ((e5.d) annotation).encoded());
                }
                throw a0.o(this.f33124b, i5, ProtectedSandApp.s("楼") + g7, new Object[0]);
            }
            if (!(annotation instanceof e5.q)) {
                if (annotation instanceof e5.r) {
                    j(i5, type);
                    if (!this.f33139q) {
                        throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榉"), new Object[0]);
                    }
                    this.f33129g = true;
                    Class<?> h12 = a0.h(type);
                    if (!Map.class.isAssignableFrom(h12)) {
                        throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榈"), new Object[0]);
                    }
                    Type i9 = a0.i(type, h12, Map.class);
                    if (!(i9 instanceof ParameterizedType)) {
                        throw a0.o(this.f33124b, i5, s8, new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) i9;
                    Type g8 = a0.g(0, parameterizedType4);
                    if (String.class == g8) {
                        Type g9 = a0.g(1, parameterizedType4);
                        if (z.c.class.isAssignableFrom(a0.h(g9))) {
                            throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榆"), new Object[0]);
                        }
                        return new o.j(this.f33124b, i5, this.f33123a.k(null, g9, annotationArr, this.f33125c), ((e5.r) annotation).encoding());
                    }
                    throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榇") + g8, new Object[0]);
                }
                if (annotation instanceof e5.a) {
                    j(i5, type);
                    if (this.f33138p || this.f33139q) {
                        throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榌"), new Object[0]);
                    }
                    if (this.f33130h) {
                        throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榋"), new Object[0]);
                    }
                    try {
                        f k5 = this.f33123a.k(null, type, annotationArr, this.f33125c);
                        this.f33130h = true;
                        return new o.c(this.f33124b, i5, k5);
                    } catch (RuntimeException e6) {
                        throw a0.p(this.f33124b, e6, i5, ProtectedSandApp.s("榊"), type);
                    }
                }
                if (!(annotation instanceof e5.x)) {
                    return null;
                }
                j(i5, type);
                Class<?> h13 = a0.h(type);
                for (int i10 = i5 - 1; i10 >= 0; i10--) {
                    o<?> oVar = this.f33144v[i10];
                    if ((oVar instanceof o.q) && ((o.q) oVar).f33089a.equals(h13)) {
                        throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榍") + h13.getName() + ProtectedSandApp.s("榎") + (i10 + 1) + ProtectedSandApp.s("榏"), new Object[0]);
                    }
                }
                return new o.q(h13);
            }
            j(i5, type);
            if (!this.f33139q) {
                throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榅"), new Object[0]);
            }
            e5.q qVar = (e5.q) annotation;
            this.f33129g = true;
            String value5 = qVar.value();
            Class<?> h14 = a0.h(type);
            if (!value5.isEmpty()) {
                okhttp3.v u5 = okhttp3.v.u(ProtectedSandApp.s("榀"), androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("榁"), value5, ProtectedSandApp.s("概")), ProtectedSandApp.s("榃"), qVar.encoding());
                boolean isAssignableFrom = Iterable.class.isAssignableFrom(h14);
                String s9 = ProtectedSandApp.s("榄");
                if (!isAssignableFrom) {
                    if (!h14.isArray()) {
                        if (z.c.class.isAssignableFrom(h14)) {
                            throw a0.o(this.f33124b, i5, s9, new Object[0]);
                        }
                        return new o.i(this.f33124b, i5, u5, this.f33123a.k(null, type, annotationArr, this.f33125c));
                    }
                    Class<?> a6 = a(h14.getComponentType());
                    if (z.c.class.isAssignableFrom(a6)) {
                        throw a0.o(this.f33124b, i5, s9, new Object[0]);
                    }
                    return new o.b();
                }
                if (type instanceof ParameterizedType) {
                    Type g10 = a0.g(0, (ParameterizedType) type);
                    if (z.c.class.isAssignableFrom(a0.h(g10))) {
                        throw a0.o(this.f33124b, i5, s9, new Object[0]);
                    }
                    return new o.a();
                }
                throw a0.o(this.f33124b, i5, h14.getSimpleName() + s7 + h14.getSimpleName() + s6, new Object[0]);
            }
            boolean isAssignableFrom2 = Iterable.class.isAssignableFrom(h14);
            String s10 = ProtectedSandApp.s("楿");
            if (!isAssignableFrom2) {
                if (!h14.isArray()) {
                    if (z.c.class.isAssignableFrom(h14)) {
                        return o.C0508o.f33086a;
                    }
                    throw a0.o(this.f33124b, i5, s10, new Object[0]);
                }
                if (!z.c.class.isAssignableFrom(h14.getComponentType())) {
                    throw a0.o(this.f33124b, i5, s10, new Object[0]);
                }
                o.C0508o c0508o = o.C0508o.f33086a;
                c0508o.getClass();
                return new o.b();
            }
            if (type instanceof ParameterizedType) {
                if (!z.c.class.isAssignableFrom(a0.h(a0.g(0, (ParameterizedType) type)))) {
                    throw a0.o(this.f33124b, i5, s10, new Object[0]);
                }
                o.C0508o c0508o2 = o.C0508o.f33086a;
                c0508o2.getClass();
                return new o.a();
            }
            throw a0.o(this.f33124b, i5, h14.getSimpleName() + s7 + h14.getSimpleName() + s6, new Object[0]);
        }

        static Set<String> h(String str) {
            Matcher matcher = f33121y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i5, String str) {
            if (!f33122z.matcher(str).matches()) {
                throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榑"), f33121y.pattern(), str);
            }
            if (!this.f33143u.contains(str)) {
                throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榐"), this.f33140r, str);
            }
        }

        private void j(int i5, Type type) {
            if (a0.j(type)) {
                throw a0.o(this.f33124b, i5, ProtectedSandApp.s("榒"), type);
            }
        }

        u b() {
            for (Annotation annotation : this.f33125c) {
                e(annotation);
            }
            if (this.f33136n == null) {
                throw a0.m(this.f33124b, ProtectedSandApp.s("榙"), new Object[0]);
            }
            if (!this.f33137o) {
                if (this.f33139q) {
                    throw a0.m(this.f33124b, ProtectedSandApp.s("榔"), new Object[0]);
                }
                if (this.f33138p) {
                    throw a0.m(this.f33124b, ProtectedSandApp.s("榓"), new Object[0]);
                }
            }
            int length = this.f33126d.length;
            this.f33144v = new o[length];
            int i5 = length - 1;
            int i6 = 0;
            while (true) {
                boolean z5 = true;
                if (i6 >= length) {
                    break;
                }
                o<?>[] oVarArr = this.f33144v;
                Type type = this.f33127e[i6];
                Annotation[] annotationArr = this.f33126d[i6];
                if (i6 != i5) {
                    z5 = false;
                }
                oVarArr[i6] = f(i6, type, annotationArr, z5);
                i6++;
            }
            if (this.f33140r == null && !this.f33135m) {
                throw a0.m(this.f33124b, ProtectedSandApp.s("榕"), this.f33136n);
            }
            boolean z6 = this.f33138p;
            if (!z6 && !this.f33139q && !this.f33137o && this.f33130h) {
                throw a0.m(this.f33124b, ProtectedSandApp.s("榖"), new Object[0]);
            }
            if (z6 && !this.f33128f) {
                throw a0.m(this.f33124b, ProtectedSandApp.s("榗"), new Object[0]);
            }
            if (!this.f33139q || this.f33129g) {
                return new u(this);
            }
            throw a0.m(this.f33124b, ProtectedSandApp.s("榘"), new Object[0]);
        }
    }

    u(a aVar) {
        this.f33109a = aVar.f33124b;
        this.f33110b = aVar.f33123a.f33151c;
        this.f33111c = aVar.f33136n;
        this.f33112d = aVar.f33140r;
        this.f33113e = aVar.f33141s;
        this.f33114f = aVar.f33142t;
        this.f33115g = aVar.f33137o;
        this.f33116h = aVar.f33138p;
        this.f33117i = aVar.f33139q;
        this.f33118j = aVar.f33144v;
        this.f33119k = aVar.f33145w;
    }

    static u b(w wVar, Method method) {
        return new a(wVar, method).b();
    }

    e0 a(Object[] objArr) throws IOException {
        o<?>[] oVarArr = this.f33118j;
        int length = objArr.length;
        if (length != oVarArr.length) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.e.a(androidx.core.app.x.a(ProtectedSandApp.s("榚"), length, ProtectedSandApp.s("榛")), oVarArr.length, ProtectedSandApp.s("榜")));
        }
        t tVar = new t(this.f33111c, this.f33110b, this.f33112d, this.f33113e, this.f33114f, this.f33115g, this.f33116h, this.f33117i);
        if (this.f33119k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            arrayList.add(objArr[i5]);
            oVarArr[i5].a(tVar, objArr[i5]);
        }
        return tVar.k().z(k.class, new k(this.f33109a, arrayList)).b();
    }
}

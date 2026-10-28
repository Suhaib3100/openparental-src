package org.mp4parser.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.StringTokenizer;
import lg.c0;
import lg.f0;
import lg.t;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.h;

/* compiled from: Factory.java */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    static Hashtable f87742e;

    /* renamed from: f, reason: collision with root package name */
    private static Object[] f87743f;

    /* renamed from: g, reason: collision with root package name */
    static /* synthetic */ Class f87744g;

    /* renamed from: a, reason: collision with root package name */
    Class f87745a;

    /* renamed from: b, reason: collision with root package name */
    ClassLoader f87746b;

    /* renamed from: c, reason: collision with root package name */
    String f87747c;

    /* renamed from: d, reason: collision with root package name */
    int f87748d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f87742e = hashtable;
        hashtable.put("void", Void.TYPE);
        f87742e.put("boolean", Boolean.TYPE);
        f87742e.put("byte", Byte.TYPE);
        f87742e.put("char", Character.TYPE);
        f87742e.put("short", Short.TYPE);
        f87742e.put("int", Integer.TYPE);
        f87742e.put("long", Long.TYPE);
        f87742e.put("float", Float.TYPE);
        f87742e.put("double", Double.TYPE);
        f87743f = new Object[0];
    }

    public e(String str, Class cls) {
        this.f87747c = str;
        this.f87745a = cls;
        this.f87746b = cls.getClassLoader();
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e4) {
            throw new NoClassDefFoundError(e4.getMessage());
        }
    }

    static Class h(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f87742e.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class cls2 = f87744g;
            if (cls2 != null) {
                return cls2;
            }
            Class a5 = a("java.lang.ClassNotFoundException");
            f87744g = a5;
            return a5;
        }
    }

    public static c.b o(Member member) {
        org.mp4parser.aspectj.lang.e dVar;
        String str;
        if (member instanceof Method) {
            Method method = (Method) member;
            dVar = new k(method.getModifiers(), method.getName(), method.getDeclaringClass(), method.getParameterTypes(), new String[method.getParameterTypes().length], method.getExceptionTypes(), method.getReturnType());
            str = "method-execution";
        } else {
            if (!(member instanceof Constructor)) {
                throw new IllegalArgumentException("member must be either a method or constructor");
            }
            Constructor constructor = (Constructor) member;
            dVar = new d(constructor.getModifiers(), constructor.getDeclaringClass(), constructor.getParameterTypes(), new String[constructor.getParameterTypes().length], constructor.getExceptionTypes());
            str = "constructor-execution";
        }
        return new h.a(-1, str, dVar, null);
    }

    public static org.mp4parser.aspectj.lang.c v(c.b bVar, Object obj, Object obj2) {
        return new h(bVar, obj, obj2, f87743f);
    }

    public static org.mp4parser.aspectj.lang.c w(c.b bVar, Object obj, Object obj2, Object obj3) {
        return new h(bVar, obj, obj2, new Object[]{obj3});
    }

    public static org.mp4parser.aspectj.lang.c x(c.b bVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return new h(bVar, obj, obj2, new Object[]{obj3, obj4});
    }

    public static org.mp4parser.aspectj.lang.c y(c.b bVar, Object obj, Object obj2, Object[] objArr) {
        return new h(bVar, obj, obj2, objArr);
    }

    public t A(Class cls) {
        i iVar = new i(cls);
        iVar.f87775g = this.f87746b;
        return iVar;
    }

    public t B(String str) {
        i iVar = new i(str);
        iVar.f87775g = this.f87746b;
        return iVar;
    }

    public v C(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        k kVar = new k(i4, str, cls, clsArr, strArr, clsArr2, cls2);
        kVar.f87775g = this.f87746b;
        return kVar;
    }

    public v D(String str) {
        k kVar = new k(str);
        kVar.f87775g = this.f87746b;
        return kVar;
    }

    public v E(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int parseInt = Integer.parseInt(str, 16);
        Class h4 = h(str3, this.f87746b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i4 = 0; i4 < countTokens; i4++) {
            clsArr[i4] = h(stringTokenizer.nextToken(), this.f87746b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i5 = 0; i5 < countTokens2; i5++) {
            strArr[i5] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i6 = 0; i6 < countTokens3; i6++) {
            clsArr2[i6] = h(stringTokenizer3.nextToken(), this.f87746b);
        }
        return new k(parseInt, str2, h4, clsArr, strArr, clsArr2, h(str7, this.f87746b));
    }

    public c.b F(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i4) {
        v E = E(str2, str3, str4, str5, str6, "", str7);
        int i5 = this.f87748d;
        this.f87748d = i5 + 1;
        return new h.b(i5, str, E, K(i4, -1));
    }

    public c.b G(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4) {
        v E = E(str2, str3, str4, str5, str6, str7, str8);
        int i5 = this.f87748d;
        this.f87748d = i5 + 1;
        return new h.b(i5, str, E, K(i4, -1));
    }

    public c.b H(String str, org.mp4parser.aspectj.lang.e eVar, int i4) {
        int i5 = this.f87748d;
        this.f87748d = i5 + 1;
        return new h.b(i5, str, eVar, K(i4, -1));
    }

    public c.b I(String str, org.mp4parser.aspectj.lang.e eVar, int i4, int i5) {
        int i6 = this.f87748d;
        this.f87748d = i6 + 1;
        return new h.b(i6, str, eVar, K(i4, i5));
    }

    public c.b J(String str, org.mp4parser.aspectj.lang.e eVar, c0 c0Var) {
        int i4 = this.f87748d;
        this.f87748d = i4 + 1;
        return new h.b(i4, str, eVar, c0Var);
    }

    public c0 K(int i4, int i5) {
        return new m(this.f87745a, this.f87747c, i4);
    }

    public f0 L() {
        o oVar = new o(h("Ljava/lang/Object;", this.f87746b));
        oVar.f87775g = this.f87746b;
        return oVar;
    }

    public f0 M(Class cls) {
        o oVar = new o(cls);
        oVar.f87775g = this.f87746b;
        return oVar;
    }

    public f0 N(String str) {
        o oVar = new o(str);
        oVar.f87775g = this.f87746b;
        return oVar;
    }

    public lg.c b(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        a aVar = new a(i4, str, cls, clsArr, strArr, clsArr2, cls2);
        aVar.f87775g = this.f87746b;
        return aVar;
    }

    public lg.c c(String str) {
        a aVar = new a(str);
        aVar.f87775g = this.f87746b;
        return aVar;
    }

    public lg.c d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int parseInt = Integer.parseInt(str, 16);
        Class h4 = h(str3, this.f87746b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i4 = 0; i4 < countTokens; i4++) {
            clsArr[i4] = h(stringTokenizer.nextToken(), this.f87746b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i5 = 0; i5 < countTokens2; i5++) {
            strArr[i5] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i6 = 0; i6 < countTokens3; i6++) {
            clsArr2[i6] = h(stringTokenizer3.nextToken(), this.f87746b);
        }
        a aVar = new a(parseInt, str2, h4, clsArr, strArr, clsArr2, h(str7, this.f87746b));
        aVar.f87775g = this.f87746b;
        return aVar;
    }

    public lg.f e(Class cls, Class cls2, String str) {
        b bVar = new b(cls, cls2, str);
        bVar.f87775g = this.f87746b;
        return bVar;
    }

    public lg.f f(String str) {
        b bVar = new b(str);
        bVar.f87775g = this.f87746b;
        return bVar;
    }

    public lg.f g(String str, String str2, String str3) {
        b bVar = new b(h(str, this.f87746b), h(new StringTokenizer(str2, ":").nextToken(), this.f87746b), new StringTokenizer(str3, ":").nextToken());
        bVar.f87775g = this.f87746b;
        return bVar;
    }

    public lg.h i(int i4, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        d dVar = new d(i4, cls, clsArr, strArr, clsArr2);
        dVar.f87775g = this.f87746b;
        return dVar;
    }

    public lg.h j(String str) {
        d dVar = new d(str);
        dVar.f87775g = this.f87746b;
        return dVar;
    }

    public lg.h k(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt(str, 16);
        Class h4 = h(str2, this.f87746b);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i4 = 0; i4 < countTokens; i4++) {
            clsArr[i4] = h(stringTokenizer.nextToken(), this.f87746b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i5 = 0; i5 < countTokens2; i5++) {
            strArr[i5] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i6 = 0; i6 < countTokens3; i6++) {
            clsArr2[i6] = h(stringTokenizer3.nextToken(), this.f87746b);
        }
        d dVar = new d(parseInt, h4, clsArr, strArr, clsArr2);
        dVar.f87775g = this.f87746b;
        return dVar;
    }

    public c.a l(String str, org.mp4parser.aspectj.lang.e eVar, int i4) {
        int i5 = this.f87748d;
        this.f87748d = i5 + 1;
        return new h.a(i5, str, eVar, K(i4, -1));
    }

    public c.a m(String str, org.mp4parser.aspectj.lang.e eVar, int i4, int i5) {
        int i6 = this.f87748d;
        this.f87748d = i6 + 1;
        return new h.a(i6, str, eVar, K(i4, i5));
    }

    public c.a n(String str, org.mp4parser.aspectj.lang.e eVar, c0 c0Var) {
        int i4 = this.f87748d;
        this.f87748d = i4 + 1;
        return new h.a(i4, str, eVar, c0Var);
    }

    public lg.n p(int i4, String str, Class cls, Class cls2) {
        f fVar = new f(i4, str, cls, cls2);
        fVar.f87775g = this.f87746b;
        return fVar;
    }

    public lg.n q(String str) {
        f fVar = new f(str);
        fVar.f87775g = this.f87746b;
        return fVar;
    }

    public lg.n r(String str, String str2, String str3, String str4) {
        f fVar = new f(Integer.parseInt(str, 16), str2, h(str3, this.f87746b), h(str4, this.f87746b));
        fVar.f87775g = this.f87746b;
        return fVar;
    }

    public lg.o s(int i4, Class cls) {
        g gVar = new g(i4, cls);
        gVar.f87775g = this.f87746b;
        return gVar;
    }

    public lg.o t(String str) {
        g gVar = new g(str);
        gVar.f87775g = this.f87746b;
        return gVar;
    }

    public lg.o u(String str, String str2) {
        g gVar = new g(Integer.parseInt(str, 16), h(str2, this.f87746b));
        gVar.f87775g = this.f87746b;
        return gVar;
    }

    public t z() {
        i iVar = new i(h("Ljava/lang/Object;", this.f87746b));
        iVar.f87775g = this.f87746b;
        return iVar;
    }
}

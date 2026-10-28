package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.g0;
import retrofit2.a;
import retrofit2.c;
import retrofit2.f;

/* compiled from: Retrofit.java */
/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Method, z<?>> f90065a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final e.a f90066b;

    /* renamed from: c, reason: collision with root package name */
    final okhttp3.v f90067c;

    /* renamed from: d, reason: collision with root package name */
    final List<f.a> f90068d;

    /* renamed from: e, reason: collision with root package name */
    final List<c.a> f90069e;

    /* renamed from: f, reason: collision with root package name */
    @zc.h
    final Executor f90070f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f90071g;

    /* compiled from: Retrofit.java */
    class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final u f90072a = u.g();

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f90073b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f90074c;

        a(Class cls) {
            this.f90074c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @zc.h
        public Object invoke(Object obj, Method method, @zc.h Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f90072a.i(method)) {
                return this.f90072a.h(method, this.f90074c, obj, objArr);
            }
            z<?> h4 = y.this.h(method);
            if (objArr == null) {
                objArr = this.f90073b;
            }
            return h4.a(objArr);
        }
    }

    y(e.a aVar, okhttp3.v vVar, List<f.a> list, List<c.a> list2, @zc.h Executor executor, boolean z4) {
        this.f90066b = aVar;
        this.f90067c = vVar;
        this.f90068d = list;
        this.f90069e = list2;
        this.f90070f = executor;
        this.f90071g = z4;
    }

    private void p(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ꙧ\u0001"));
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꙥ\u0001"));
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(ProtectedSandApp.s("Ꙧ\u0001"));
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f90071g) {
            u g4 = u.g();
            for (Method method : cls.getDeclaredMethods()) {
                if (!g4.i(method) && !Modifier.isStatic(method.getModifiers())) {
                    h(method);
                }
            }
        }
    }

    public okhttp3.v a() {
        return this.f90067c;
    }

    public c<?, ?> b(Type type, Annotation[] annotationArr) {
        return j(null, type, annotationArr);
    }

    public List<c.a> c() {
        return this.f90069e;
    }

    public e.a d() {
        return this.f90066b;
    }

    @zc.h
    public Executor e() {
        return this.f90070f;
    }

    public List<f.a> f() {
        return this.f90068d;
    }

    public <T> T g(Class<T> cls) {
        p(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    z<?> h(Method method) {
        z<?> zVar;
        z<?> zVar2 = this.f90065a.get(method);
        if (zVar2 != null) {
            return zVar2;
        }
        synchronized (this.f90065a) {
            try {
                zVar = this.f90065a.get(method);
                if (zVar == null) {
                    zVar = z.b(this, method);
                    this.f90065a.put(method, zVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    public b i() {
        return new b(this);
    }

    public c<?, ?> j(@zc.h c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, ProtectedSandApp.s("Ꙩ\u0001"));
        Objects.requireNonNull(annotationArr, ProtectedSandApp.s("ꙩ\u0001"));
        int indexOf = this.f90069e.indexOf(aVar) + 1;
        int size = this.f90069e.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            c<?, ?> a5 = this.f90069e.get(i4).a(type, annotationArr, this);
            if (a5 != null) {
                return a5;
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ꙫ\u0001"));
        sb.append(type);
        sb.append(ProtectedSandApp.s("ꙫ\u0001"));
        String s4 = ProtectedSandApp.s("Ꙭ\u0001");
        if (aVar != null) {
            sb.append(ProtectedSandApp.s("ꙭ\u0001"));
            for (int i5 = 0; i5 < indexOf; i5++) {
                sb.append(s4);
                sb.append(this.f90069e.get(i5).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append(ProtectedSandApp.s("ꙮ\u0001"));
        int size2 = this.f90069e.size();
        while (indexOf < size2) {
            sb.append(s4);
            sb.append(this.f90069e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<T, e0> k(@zc.h f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, ProtectedSandApp.s("꙯\u0001"));
        Objects.requireNonNull(annotationArr, ProtectedSandApp.s("꙰\u0001"));
        Objects.requireNonNull(annotationArr2, ProtectedSandApp.s("꙱\u0001"));
        int indexOf = this.f90068d.indexOf(aVar) + 1;
        int size = this.f90068d.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            f<T, e0> fVar = (f<T, e0>) this.f90068d.get(i4).c(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("꙲\u0001"));
        sb.append(type);
        sb.append(ProtectedSandApp.s("ꙫ\u0001"));
        String s4 = ProtectedSandApp.s("Ꙭ\u0001");
        if (aVar != null) {
            sb.append(ProtectedSandApp.s("ꙭ\u0001"));
            for (int i5 = 0; i5 < indexOf; i5++) {
                sb.append(s4);
                sb.append(this.f90068d.get(i5).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append(ProtectedSandApp.s("ꙮ\u0001"));
        int size2 = this.f90068d.size();
        while (indexOf < size2) {
            sb.append(s4);
            sb.append(this.f90068d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<g0, T> l(@zc.h f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, ProtectedSandApp.s("꙯\u0001"));
        Objects.requireNonNull(annotationArr, ProtectedSandApp.s("ꙩ\u0001"));
        int indexOf = this.f90068d.indexOf(aVar) + 1;
        int size = this.f90068d.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            f<g0, T> fVar = (f<g0, T>) this.f90068d.get(i4).d(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("꙳\u0001"));
        sb.append(type);
        sb.append(ProtectedSandApp.s("ꙫ\u0001"));
        String s4 = ProtectedSandApp.s("Ꙭ\u0001");
        if (aVar != null) {
            sb.append(ProtectedSandApp.s("ꙭ\u0001"));
            for (int i5 = 0; i5 < indexOf; i5++) {
                sb.append(s4);
                sb.append(this.f90068d.get(i5).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append(ProtectedSandApp.s("ꙮ\u0001"));
        int size2 = this.f90068d.size();
        while (indexOf < size2) {
            sb.append(s4);
            sb.append(this.f90068d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<T, e0> m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return k(null, type, annotationArr, annotationArr2);
    }

    public <T> f<g0, T> n(Type type, Annotation[] annotationArr) {
        return l(null, type, annotationArr);
    }

    public <T> f<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, ProtectedSandApp.s("꙯\u0001"));
        Objects.requireNonNull(annotationArr, ProtectedSandApp.s("ꙩ\u0001"));
        int size = this.f90068d.size();
        for (int i4 = 0; i4 < size; i4++) {
            f<T, String> fVar = (f<T, String>) this.f90068d.get(i4).e(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return a.d.f89881a;
    }

    /* compiled from: Retrofit.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final u f90076a;

        /* renamed from: b, reason: collision with root package name */
        @zc.h
        private e.a f90077b;

        /* renamed from: c, reason: collision with root package name */
        @zc.h
        private okhttp3.v f90078c;

        /* renamed from: d, reason: collision with root package name */
        private final List<f.a> f90079d;

        /* renamed from: e, reason: collision with root package name */
        private final List<c.a> f90080e;

        /* renamed from: f, reason: collision with root package name */
        @zc.h
        private Executor f90081f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f90082g;

        b(u uVar) {
            this.f90079d = new ArrayList();
            this.f90080e = new ArrayList();
            this.f90076a = uVar;
        }

        public b a(c.a aVar) {
            List<c.a> list = this.f90080e;
            Objects.requireNonNull(aVar, ProtectedSandApp.s("ꙟ\u0001"));
            list.add(aVar);
            return this;
        }

        public b b(f.a aVar) {
            List<f.a> list = this.f90079d;
            Objects.requireNonNull(aVar, ProtectedSandApp.s("ꙟ\u0001"));
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, ProtectedSandApp.s("Ꙡ\u0001"));
            return e(okhttp3.v.C(str));
        }

        public b d(URL url) {
            Objects.requireNonNull(url, ProtectedSandApp.s("Ꙡ\u0001"));
            return e(okhttp3.v.C(url.toString()));
        }

        public b e(okhttp3.v vVar) {
            Objects.requireNonNull(vVar, ProtectedSandApp.s("Ꙡ\u0001"));
            if ("".equals(vVar.L().get(r0.size() - 1))) {
                this.f90078c = vVar;
                return this;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ꙡ\u0001") + vVar);
        }

        public y f() {
            if (this.f90078c == null) {
                throw new IllegalStateException(ProtectedSandApp.s("Ꙣ\u0001"));
            }
            e.a aVar = this.f90077b;
            if (aVar == null) {
                aVar = new okhttp3.b0();
            }
            e.a aVar2 = aVar;
            Executor executor = this.f90081f;
            if (executor == null) {
                executor = this.f90076a.c();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.f90080e);
            arrayList.addAll(this.f90076a.a(executor2));
            ArrayList arrayList2 = new ArrayList(this.f90079d.size() + 1 + this.f90076a.e());
            arrayList2.add(new retrofit2.a());
            arrayList2.addAll(this.f90079d);
            arrayList2.addAll(this.f90076a.d());
            return new y(aVar2, this.f90078c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f90082g);
        }

        public List<c.a> g() {
            return this.f90080e;
        }

        public b h(e.a aVar) {
            Objects.requireNonNull(aVar, ProtectedSandApp.s("ꙟ\u0001"));
            this.f90077b = aVar;
            return this;
        }

        public b i(Executor executor) {
            Objects.requireNonNull(executor, ProtectedSandApp.s("ꙣ\u0001"));
            this.f90081f = executor;
            return this;
        }

        public b j(okhttp3.b0 b0Var) {
            Objects.requireNonNull(b0Var, ProtectedSandApp.s("Ꙥ\u0001"));
            return h(b0Var);
        }

        public List<f.a> k() {
            return this.f90079d;
        }

        public b l(boolean z4) {
            this.f90082g = z4;
            return this;
        }

        public b() {
            this(u.g());
        }

        b(y yVar) {
            this.f90079d = new ArrayList();
            this.f90080e = new ArrayList();
            u g4 = u.g();
            this.f90076a = g4;
            this.f90077b = yVar.f90066b;
            this.f90078c = yVar.f90067c;
            int size = yVar.f90068d.size() - g4.e();
            for (int i4 = 1; i4 < size; i4++) {
                this.f90079d.add(yVar.f90068d.get(i4));
            }
            int size2 = yVar.f90069e.size() - this.f90076a.b();
            for (int i5 = 0; i5 < size2; i5++) {
                this.f90080e.add(yVar.f90069e.get(i5));
            }
            this.f90081f = yVar.f90070f;
            this.f90082g = yVar.f90071g;
        }
    }
}

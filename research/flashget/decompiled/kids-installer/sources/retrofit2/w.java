package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import javax.annotation.Nullable;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.h0;
import retrofit2.a;
import retrofit2.c;
import retrofit2.f;

/* compiled from: Retrofit.java */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Method, x<?>> f33149a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final e.a f33150b;

    /* renamed from: c, reason: collision with root package name */
    final okhttp3.w f33151c;

    /* renamed from: d, reason: collision with root package name */
    final List<f.a> f33152d;

    /* renamed from: e, reason: collision with root package name */
    final List<c.a> f33153e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    final Executor f33154f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f33155g;

    /* compiled from: Retrofit.java */
    class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final s f33156a = s.g();

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f33157b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f33158c;

        a(Class cls) {
            this.f33158c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f33156a.i(method)) {
                return this.f33156a.h(method, this.f33158c, obj, objArr);
            }
            x<?> h5 = w.this.h(method);
            if (objArr == null) {
                objArr = this.f33157b;
            }
            return h5.a(objArr);
        }
    }

    w(e.a aVar, okhttp3.w wVar, List<f.a> list, List<c.a> list2, @Nullable Executor executor, boolean z5) {
        this.f33150b = aVar;
        this.f33151c = wVar;
        this.f33152d = list;
        this.f33153e = list2;
        this.f33154f = executor;
        this.f33155g = z5;
    }

    private void p(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("榺"));
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("榸"));
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(ProtectedSandApp.s("榹"));
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f33155g) {
            s g5 = s.g();
            for (Method method : cls.getDeclaredMethods()) {
                if (!g5.i(method) && !Modifier.isStatic(method.getModifiers())) {
                    h(method);
                }
            }
        }
    }

    public okhttp3.w a() {
        return this.f33151c;
    }

    public c<?, ?> b(Type type, Annotation[] annotationArr) {
        return j(null, type, annotationArr);
    }

    public List<c.a> c() {
        return this.f33153e;
    }

    public e.a d() {
        return this.f33150b;
    }

    @Nullable
    public Executor e() {
        return this.f33154f;
    }

    public List<f.a> f() {
        return this.f33152d;
    }

    public <T> T g(Class<T> cls) {
        p(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    x<?> h(Method method) {
        x<?> xVar;
        x<?> xVar2 = this.f33149a.get(method);
        if (xVar2 != null) {
            return xVar2;
        }
        synchronized (this.f33149a) {
            xVar = this.f33149a.get(method);
            if (xVar == null) {
                xVar = x.b(this, method);
                this.f33149a.put(method, xVar);
            }
        }
        return xVar;
    }

    public b i() {
        return new b(this);
    }

    public c<?, ?> j(@Nullable c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, ProtectedSandApp.s("榻"));
        Objects.requireNonNull(annotationArr, ProtectedSandApp.s("榼"));
        int indexOf = this.f33153e.indexOf(aVar) + 1;
        int size = this.f33153e.size();
        for (int i5 = indexOf; i5 < size; i5++) {
            c<?, ?> a6 = this.f33153e.get(i5).a(type, annotationArr, this);
            if (a6 != null) {
                return a6;
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("榽"));
        sb.append(type);
        sb.append(ProtectedSandApp.s("榾"));
        String s5 = ProtectedSandApp.s("榿");
        if (aVar != null) {
            sb.append(ProtectedSandApp.s("槀"));
            for (int i6 = 0; i6 < indexOf; i6++) {
                sb.append(s5);
                sb.append(this.f33153e.get(i6).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append(ProtectedSandApp.s("槁"));
        int size2 = this.f33153e.size();
        while (indexOf < size2) {
            sb.append(s5);
            sb.append(this.f33153e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<T, f0> k(@Nullable f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, ProtectedSandApp.s("槂"));
        Objects.requireNonNull(annotationArr, ProtectedSandApp.s("槃"));
        Objects.requireNonNull(annotationArr2, ProtectedSandApp.s("槄"));
        int indexOf = this.f33152d.indexOf(aVar) + 1;
        int size = this.f33152d.size();
        for (int i5 = indexOf; i5 < size; i5++) {
            f<T, f0> fVar = (f<T, f0>) this.f33152d.get(i5).c(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("槅"));
        sb.append(type);
        sb.append(ProtectedSandApp.s("槆"));
        String s5 = ProtectedSandApp.s("槇");
        if (aVar != null) {
            sb.append(ProtectedSandApp.s("槈"));
            for (int i6 = 0; i6 < indexOf; i6++) {
                sb.append(s5);
                sb.append(this.f33152d.get(i6).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append(ProtectedSandApp.s("槉"));
        int size2 = this.f33152d.size();
        while (indexOf < size2) {
            sb.append(s5);
            sb.append(this.f33152d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<h0, T> l(@Nullable f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, ProtectedSandApp.s("槊"));
        Objects.requireNonNull(annotationArr, ProtectedSandApp.s("構"));
        int indexOf = this.f33152d.indexOf(aVar) + 1;
        int size = this.f33152d.size();
        for (int i5 = indexOf; i5 < size; i5++) {
            f<h0, T> fVar = (f<h0, T>) this.f33152d.get(i5).d(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("槌"));
        sb.append(type);
        sb.append(ProtectedSandApp.s("槍"));
        String s5 = ProtectedSandApp.s("槎");
        if (aVar != null) {
            sb.append(ProtectedSandApp.s("槏"));
            for (int i6 = 0; i6 < indexOf; i6++) {
                sb.append(s5);
                sb.append(this.f33152d.get(i6).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append(ProtectedSandApp.s("槐"));
        int size2 = this.f33152d.size();
        while (indexOf < size2) {
            sb.append(s5);
            sb.append(this.f33152d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<T, f0> m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return k(null, type, annotationArr, annotationArr2);
    }

    public <T> f<h0, T> n(Type type, Annotation[] annotationArr) {
        return l(null, type, annotationArr);
    }

    public <T> f<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, ProtectedSandApp.s("槑"));
        Objects.requireNonNull(annotationArr, ProtectedSandApp.s("槒"));
        int size = this.f33152d.size();
        for (int i5 = 0; i5 < size; i5++) {
            f<T, String> fVar = (f<T, String>) this.f33152d.get(i5).e(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return a.d.f32965a;
    }

    /* compiled from: Retrofit.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final s f33160a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private e.a f33161b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private okhttp3.w f33162c;

        /* renamed from: d, reason: collision with root package name */
        private final List<f.a> f33163d;

        /* renamed from: e, reason: collision with root package name */
        private final List<c.a> f33164e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private Executor f33165f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f33166g;

        b(s sVar) {
            this.f33163d = new ArrayList();
            this.f33164e = new ArrayList();
            this.f33160a = sVar;
        }

        public b a(c.a aVar) {
            List<c.a> list = this.f33164e;
            Objects.requireNonNull(aVar, ProtectedSandApp.s("榮"));
            list.add(aVar);
            return this;
        }

        public b b(f.a aVar) {
            List<f.a> list = this.f33163d;
            Objects.requireNonNull(aVar, ProtectedSandApp.s("榯"));
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, ProtectedSandApp.s("榰"));
            return e(okhttp3.w.C(str));
        }

        public b d(URL url) {
            Objects.requireNonNull(url, ProtectedSandApp.s("榱"));
            return e(okhttp3.w.C(url.toString()));
        }

        public b e(okhttp3.w wVar) {
            Objects.requireNonNull(wVar, ProtectedSandApp.s("榲"));
            if ("".equals(wVar.L().get(r0.size() - 1))) {
                this.f33162c = wVar;
                return this;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("榳") + wVar);
        }

        public w f() {
            if (this.f33162c == null) {
                throw new IllegalStateException(ProtectedSandApp.s("榴"));
            }
            e.a aVar = this.f33161b;
            if (aVar == null) {
                aVar = new c0();
            }
            e.a aVar2 = aVar;
            Executor executor = this.f33165f;
            if (executor == null) {
                executor = this.f33160a.c();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.f33164e);
            arrayList.addAll(this.f33160a.a(executor2));
            ArrayList arrayList2 = new ArrayList(this.f33163d.size() + 1 + this.f33160a.e());
            arrayList2.add(new retrofit2.a());
            arrayList2.addAll(this.f33163d);
            arrayList2.addAll(this.f33160a.d());
            return new w(aVar2, this.f33162c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f33166g);
        }

        public List<c.a> g() {
            return this.f33164e;
        }

        public b h(e.a aVar) {
            Objects.requireNonNull(aVar, ProtectedSandApp.s("榵"));
            this.f33161b = aVar;
            return this;
        }

        public b i(Executor executor) {
            Objects.requireNonNull(executor, ProtectedSandApp.s("榶"));
            this.f33165f = executor;
            return this;
        }

        public b j(c0 c0Var) {
            Objects.requireNonNull(c0Var, ProtectedSandApp.s("榷"));
            return h(c0Var);
        }

        public List<f.a> k() {
            return this.f33163d;
        }

        public b l(boolean z5) {
            this.f33166g = z5;
            return this;
        }

        public b() {
            this(s.g());
        }

        b(w wVar) {
            this.f33163d = new ArrayList();
            this.f33164e = new ArrayList();
            s g5 = s.g();
            this.f33160a = g5;
            this.f33161b = wVar.f33150b;
            this.f33162c = wVar.f33151c;
            int size = wVar.f33152d.size() - g5.e();
            for (int i5 = 1; i5 < size; i5++) {
                this.f33163d.add(wVar.f33152d.get(i5));
            }
            int size2 = wVar.f33153e.size() - this.f33160a.b();
            for (int i6 = 0; i6 < size2; i6++) {
                this.f33164e.add(wVar.f33153e.get(i6));
            }
            this.f33165f = wVar.f33154f;
            this.f33166g = wVar.f33155g;
        }
    }
}

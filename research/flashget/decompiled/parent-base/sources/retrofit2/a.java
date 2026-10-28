package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.k2;
import okhttp3.e0;
import okhttp3.g0;
import retrofit2.f;

/* compiled from: BuiltInConverters.java */
/* loaded from: classes9.dex */
final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f89877a = true;

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$a, reason: collision with other inner class name */
    static final class C1387a implements retrofit2.f<g0, g0> {

        /* renamed from: a, reason: collision with root package name */
        static final C1387a f89878a = new C1387a();

        C1387a() {
        }

        @Override // retrofit2.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 a(g0 g0Var) throws IOException {
            try {
                return c0.a(g0Var);
            } finally {
                g0Var.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class b implements retrofit2.f<e0, e0> {

        /* renamed from: a, reason: collision with root package name */
        static final b f89879a = new b();

        b() {
        }

        @Override // retrofit2.f
        public e0 a(e0 e0Var) throws IOException {
            return e0Var;
        }

        public e0 b(e0 e0Var) {
            return e0Var;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class c implements retrofit2.f<g0, g0> {

        /* renamed from: a, reason: collision with root package name */
        static final c f89880a = new c();

        c() {
        }

        @Override // retrofit2.f
        public g0 a(g0 g0Var) throws IOException {
            return g0Var;
        }

        public g0 b(g0 g0Var) {
            return g0Var;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class d implements retrofit2.f<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        static final d f89881a = new d();

        d() {
        }

        @Override // retrofit2.f
        public String a(Object obj) throws IOException {
            return obj.toString();
        }

        public String b(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class e implements retrofit2.f<g0, k2> {

        /* renamed from: a, reason: collision with root package name */
        static final e f89882a = new e();

        e() {
        }

        @Override // retrofit2.f
        public k2 a(g0 g0Var) throws IOException {
            g0Var.close();
            return k2.f75408a;
        }

        public k2 b(g0 g0Var) {
            g0Var.close();
            return k2.f75408a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class f implements retrofit2.f<g0, Void> {

        /* renamed from: a, reason: collision with root package name */
        static final f f89883a = new f();

        f() {
        }

        @Override // retrofit2.f
        public Void a(g0 g0Var) throws IOException {
            g0Var.close();
            return null;
        }

        public Void b(g0 g0Var) {
            g0Var.close();
            return null;
        }
    }

    a() {
    }

    @Override // retrofit2.f.a
    @zc.h
    public retrofit2.f<?, e0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (e0.class.isAssignableFrom(c0.h(type))) {
            return b.f89879a;
        }
        return null;
    }

    @Override // retrofit2.f.a
    @zc.h
    public retrofit2.f<g0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == g0.class) {
            return c0.l(annotationArr, pg.w.class) ? c.f89880a : C1387a.f89878a;
        }
        if (type == Void.class) {
            return f.f89883a;
        }
        if (!this.f89877a || type != k2.class) {
            return null;
        }
        try {
            return e.f89882a;
        } catch (NoClassDefFoundError unused) {
            this.f89877a = false;
            return null;
        }
    }
}

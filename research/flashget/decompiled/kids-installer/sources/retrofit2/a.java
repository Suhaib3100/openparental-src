package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.m2;
import okhttp3.f0;
import okhttp3.h0;
import retrofit2.f;

/* compiled from: BuiltInConverters.java */
/* loaded from: classes6.dex */
final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f32961a = true;

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$a, reason: collision with other inner class name */
    static final class C0505a implements retrofit2.f<h0, h0> {

        /* renamed from: a, reason: collision with root package name */
        static final C0505a f32962a = new C0505a();

        C0505a() {
        }

        @Override // retrofit2.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0 a(h0 h0Var) throws IOException {
            try {
                return a0.a(h0Var);
            } finally {
                h0Var.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class b implements retrofit2.f<f0, f0> {

        /* renamed from: a, reason: collision with root package name */
        static final b f32963a = new b();

        b() {
        }

        @Override // retrofit2.f
        public f0 a(f0 f0Var) throws IOException {
            return f0Var;
        }

        public f0 b(f0 f0Var) {
            return f0Var;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class c implements retrofit2.f<h0, h0> {

        /* renamed from: a, reason: collision with root package name */
        static final c f32964a = new c();

        c() {
        }

        @Override // retrofit2.f
        public h0 a(h0 h0Var) throws IOException {
            return h0Var;
        }

        public h0 b(h0 h0Var) {
            return h0Var;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class d implements retrofit2.f<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        static final d f32965a = new d();

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
    static final class e implements retrofit2.f<h0, m2> {

        /* renamed from: a, reason: collision with root package name */
        static final e f32966a = new e();

        e() {
        }

        @Override // retrofit2.f
        public m2 a(h0 h0Var) throws IOException {
            h0Var.close();
            return m2.f23662a;
        }

        public m2 b(h0 h0Var) {
            h0Var.close();
            return m2.f23662a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class f implements retrofit2.f<h0, Void> {

        /* renamed from: a, reason: collision with root package name */
        static final f f32967a = new f();

        f() {
        }

        @Override // retrofit2.f
        public Void a(h0 h0Var) throws IOException {
            h0Var.close();
            return null;
        }

        public Void b(h0 h0Var) {
            h0Var.close();
            return null;
        }
    }

    a() {
    }

    @Override // retrofit2.f.a
    @Nullable
    public retrofit2.f<?, f0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        if (f0.class.isAssignableFrom(a0.h(type))) {
            return b.f32963a;
        }
        return null;
    }

    @Override // retrofit2.f.a
    @Nullable
    public retrofit2.f<h0, ?> d(Type type, Annotation[] annotationArr, w wVar) {
        if (type == h0.class) {
            return a0.l(annotationArr, e5.w.class) ? c.f32964a : C0505a.f32962a;
        }
        if (type == Void.class) {
            return f.f32967a;
        }
        if (!this.f32961a || type != m2.class) {
            return null;
        }
        try {
            return e.f32966a;
        } catch (NoClassDefFoundError unused) {
            this.f32961a = false;
            return null;
        }
    }
}

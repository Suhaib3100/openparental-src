package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.f0;
import okhttp3.z;

/* compiled from: ParameterHandler.java */
/* loaded from: classes5.dex */
abstract class o<T> {

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    class a extends o<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                o.this.a(tVar, it.next());
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    class b extends o<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.o
        void a(t tVar, @Nullable Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i5 = 0; i5 < length; i5++) {
                o.this.a(tVar, Array.get(obj, i5));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class c<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33047a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33048b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, f0> f33049c;

        c(Method method, int i5, retrofit2.f<T, f0> fVar) {
            this.f33047a = method;
            this.f33048b = i5;
            this.f33049c = fVar;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable T t5) {
            if (t5 == null) {
                throw a0.o(this.f33047a, this.f33048b, ProtectedSandApp.s("鐴"), new Object[0]);
            }
            try {
                tVar.l(this.f33049c.a(t5));
            } catch (IOException e6) {
                throw a0.p(this.f33047a, e6, this.f33048b, ProtectedSandApp.s("鐲") + t5 + ProtectedSandApp.s("鐳"), new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class d<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f33050a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f33051b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f33052c;

        d(String str, retrofit2.f<T, String> fVar, boolean z5) {
            Objects.requireNonNull(str, ProtectedSandApp.s("鐵"));
            this.f33050a = str;
            this.f33051b = fVar;
            this.f33052c = z5;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable T t5) throws IOException {
            String a6;
            if (t5 == null || (a6 = this.f33051b.a(t5)) == null) {
                return;
            }
            tVar.a(this.f33050a, a6, this.f33052c);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class e<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33053a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33054b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f33055c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f33056d;

        e(Method method, int i5, retrofit2.f<T, String> fVar, boolean z5) {
            this.f33053a = method;
            this.f33054b = i5;
            this.f33055c = fVar;
            this.f33056d = z5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw a0.o(this.f33053a, this.f33054b, ProtectedSandApp.s("鐼"), new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw a0.o(this.f33053a, this.f33054b, ProtectedSandApp.s("鐻"), new Object[0]);
                }
                T value = entry.getValue();
                String s5 = ProtectedSandApp.s("鐶");
                if (value == null) {
                    throw a0.o(this.f33053a, this.f33054b, androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("鐺"), key, s5), new Object[0]);
                }
                String a6 = this.f33055c.a(value);
                if (a6 == null) {
                    throw a0.o(this.f33053a, this.f33054b, ProtectedSandApp.s("鐷") + value + ProtectedSandApp.s("鐸") + this.f33055c.getClass().getName() + ProtectedSandApp.s("鐹") + key + s5, new Object[0]);
                }
                tVar.a(key, a6, this.f33056d);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class f<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f33057a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f33058b;

        f(String str, retrofit2.f<T, String> fVar) {
            Objects.requireNonNull(str, ProtectedSandApp.s("鐽"));
            this.f33057a = str;
            this.f33058b = fVar;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable T t5) throws IOException {
            String a6;
            if (t5 == null || (a6 = this.f33058b.a(t5)) == null) {
                return;
            }
            tVar.b(this.f33057a, a6);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class g<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33059a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33060b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f33061c;

        g(Method method, int i5, retrofit2.f<T, String> fVar) {
            this.f33059a = method;
            this.f33060b = i5;
            this.f33061c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw a0.o(this.f33059a, this.f33060b, ProtectedSandApp.s("鑁"), new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw a0.o(this.f33059a, this.f33060b, ProtectedSandApp.s("鑀"), new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw a0.o(this.f33059a, this.f33060b, androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("鐾"), key, ProtectedSandApp.s("鐿")), new Object[0]);
                }
                tVar.b(key, this.f33061c.a(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class h extends o<okhttp3.v> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33062a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33063b;

        h(Method method, int i5) {
            this.f33062a = method;
            this.f33063b = i5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, @Nullable okhttp3.v vVar) {
            if (vVar != null) {
                tVar.c(vVar);
            } else {
                throw a0.o(this.f33062a, this.f33063b, ProtectedSandApp.s("鑂"), new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class i<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33064a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33065b;

        /* renamed from: c, reason: collision with root package name */
        private final okhttp3.v f33066c;

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.f<T, f0> f33067d;

        i(Method method, int i5, okhttp3.v vVar, retrofit2.f<T, f0> fVar) {
            this.f33064a = method;
            this.f33065b = i5;
            this.f33066c = vVar;
            this.f33067d = fVar;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable T t5) {
            if (t5 == null) {
                return;
            }
            try {
                tVar.d(this.f33066c, this.f33067d.a(t5));
            } catch (IOException e6) {
                throw a0.o(this.f33064a, this.f33065b, ProtectedSandApp.s("鑃") + t5 + ProtectedSandApp.s("鑄"), e6);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class j<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33068a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33069b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, f0> f33070c;

        /* renamed from: d, reason: collision with root package name */
        private final String f33071d;

        j(Method method, int i5, retrofit2.f<T, f0> fVar, String str) {
            this.f33068a = method;
            this.f33069b = i5;
            this.f33070c = fVar;
            this.f33071d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw a0.o(this.f33068a, this.f33069b, ProtectedSandApp.s("鑌"), new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw a0.o(this.f33068a, this.f33069b, ProtectedSandApp.s("鑋"), new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw a0.o(this.f33068a, this.f33069b, androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("鑉"), key, ProtectedSandApp.s("鑊")), new Object[0]);
                }
                tVar.d(okhttp3.v.u(ProtectedSandApp.s("鑅"), androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("鑆"), key, ProtectedSandApp.s("鑇")), ProtectedSandApp.s("鑈"), this.f33071d), this.f33070c.a(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class k<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33072a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33073b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33074c;

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.f<T, String> f33075d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f33076e;

        k(Method method, int i5, String str, retrofit2.f<T, String> fVar, boolean z5) {
            this.f33072a = method;
            this.f33073b = i5;
            Objects.requireNonNull(str, ProtectedSandApp.s("鑍"));
            this.f33074c = str;
            this.f33075d = fVar;
            this.f33076e = z5;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable T t5) throws IOException {
            if (t5 == null) {
                throw a0.o(this.f33072a, this.f33073b, androidx.concurrent.futures.a.a(new StringBuilder(ProtectedSandApp.s("鑎")), this.f33074c, ProtectedSandApp.s("鑏")), new Object[0]);
            }
            tVar.f(this.f33074c, this.f33075d.a(t5), this.f33076e);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class l<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f33077a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f33078b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f33079c;

        l(String str, retrofit2.f<T, String> fVar, boolean z5) {
            Objects.requireNonNull(str, ProtectedSandApp.s("鑐"));
            this.f33077a = str;
            this.f33078b = fVar;
            this.f33079c = z5;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable T t5) throws IOException {
            String a6;
            if (t5 == null || (a6 = this.f33078b.a(t5)) == null) {
                return;
            }
            tVar.g(this.f33077a, a6, this.f33079c);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class m<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33080a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33081b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f33082c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f33083d;

        m(Method method, int i5, retrofit2.f<T, String> fVar, boolean z5) {
            this.f33080a = method;
            this.f33081b = i5;
            this.f33082c = fVar;
            this.f33083d = z5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw a0.o(this.f33080a, this.f33081b, ProtectedSandApp.s("鑗"), new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw a0.o(this.f33080a, this.f33081b, ProtectedSandApp.s("鑖"), new Object[0]);
                }
                T value = entry.getValue();
                String s5 = ProtectedSandApp.s("鑑");
                if (value == null) {
                    throw a0.o(this.f33080a, this.f33081b, androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("鑕"), key, s5), new Object[0]);
                }
                String a6 = this.f33082c.a(value);
                if (a6 == null) {
                    throw a0.o(this.f33080a, this.f33081b, ProtectedSandApp.s("鑒") + value + ProtectedSandApp.s("鑓") + this.f33082c.getClass().getName() + ProtectedSandApp.s("鑔") + key + s5, new Object[0]);
                }
                tVar.g(key, a6, this.f33083d);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class n<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final retrofit2.f<T, String> f33084a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f33085b;

        n(retrofit2.f<T, String> fVar, boolean z5) {
            this.f33084a = fVar;
            this.f33085b = z5;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable T t5) throws IOException {
            if (t5 == null) {
                return;
            }
            tVar.g(this.f33084a.a(t5), null, this.f33085b);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.o$o, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0508o extends o<z.c> {

        /* renamed from: a, reason: collision with root package name */
        static final C0508o f33086a = new C0508o();

        private C0508o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, @Nullable z.c cVar) {
            if (cVar != null) {
                tVar.e(cVar);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class p extends o<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f33087a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33088b;

        p(Method method, int i5) {
            this.f33087a = method;
            this.f33088b = i5;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable Object obj) {
            if (obj != null) {
                tVar.m(obj);
            } else {
                throw a0.o(this.f33087a, this.f33088b, ProtectedSandApp.s("鑘"), new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes6.dex */
    static final class q<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        final Class<T> f33089a;

        q(Class<T> cls) {
            this.f33089a = cls;
        }

        @Override // retrofit2.o
        void a(t tVar, @Nullable T t5) {
            tVar.h(this.f33089a, t5);
        }
    }

    o() {
    }

    abstract void a(t tVar, @Nullable T t5) throws IOException;

    final o<Object> b() {
        return new b();
    }

    final o<Iterable<T>> c() {
        return new a();
    }
}

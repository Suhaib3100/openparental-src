package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.e0;
import okhttp3.y;

/* compiled from: ParameterHandler.java */
/* loaded from: classes9.dex */
abstract class o<T> {

    /* compiled from: ParameterHandler.java */
    class a extends o<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, @zc.h Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                o.this.a(vVar, it.next());
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    class b extends o<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.o
        void a(v vVar, @zc.h Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i4 = 0; i4 < length; i4++) {
                o.this.a(vVar, Array.get(obj, i4));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class c<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f89963a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89964b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, e0> f89965c;

        c(Method method, int i4, retrofit2.f<T, e0> fVar) {
            this.f89963a = method;
            this.f89964b = i4;
            this.f89965c = fVar;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h T t4) {
            if (t4 == null) {
                throw c0.o(this.f89963a, this.f89964b, ProtectedSandApp.s("ꗞ\u0001"), new Object[0]);
            }
            try {
                vVar.l(this.f89965c.a(t4));
            } catch (IOException e4) {
                throw c0.p(this.f89963a, e4, this.f89964b, ProtectedSandApp.s("ꗜ\u0001") + t4 + ProtectedSandApp.s("ꗝ\u0001"), new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class d<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f89966a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f89967b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f89968c;

        d(String str, retrofit2.f<T, String> fVar, boolean z4) {
            Objects.requireNonNull(str, ProtectedSandApp.s("ꗟ\u0001"));
            this.f89966a = str;
            this.f89967b = fVar;
            this.f89968c = z4;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h T t4) throws IOException {
            String a5;
            if (t4 == null || (a5 = this.f89967b.a(t4)) == null) {
                return;
            }
            vVar.a(this.f89966a, a5, this.f89968c);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class e<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f89969a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89970b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f89971c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f89972d;

        e(Method method, int i4, retrofit2.f<T, String> fVar, boolean z4) {
            this.f89969a = method;
            this.f89970b = i4;
            this.f89971c = fVar;
            this.f89972d = z4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, @zc.h Map<String, T> map) throws IOException {
            if (map == null) {
                throw c0.o(this.f89969a, this.f89970b, ProtectedSandApp.s("ꗦ\u0001"), new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.o(this.f89969a, this.f89970b, ProtectedSandApp.s("ꗥ\u0001"), new Object[0]);
                }
                T value = entry.getValue();
                String s4 = ProtectedSandApp.s("ꗠ\u0001");
                if (value == null) {
                    throw c0.o(this.f89969a, this.f89970b, android.support.v4.media.d.a(ProtectedSandApp.s("ꗤ\u0001"), key, s4), new Object[0]);
                }
                String a5 = this.f89971c.a(value);
                if (a5 == null) {
                    throw c0.o(this.f89969a, this.f89970b, ProtectedSandApp.s("ꗡ\u0001") + value + ProtectedSandApp.s("ꗢ\u0001") + this.f89971c.getClass().getName() + ProtectedSandApp.s("ꗣ\u0001") + key + s4, new Object[0]);
                }
                vVar.a(key, a5, this.f89972d);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class f<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f89973a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f89974b;

        f(String str, retrofit2.f<T, String> fVar) {
            Objects.requireNonNull(str, ProtectedSandApp.s("ꗧ\u0001"));
            this.f89973a = str;
            this.f89974b = fVar;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h T t4) throws IOException {
            String a5;
            if (t4 == null || (a5 = this.f89974b.a(t4)) == null) {
                return;
            }
            vVar.b(this.f89973a, a5);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class g<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f89975a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89976b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f89977c;

        g(Method method, int i4, retrofit2.f<T, String> fVar) {
            this.f89975a = method;
            this.f89976b = i4;
            this.f89977c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, @zc.h Map<String, T> map) throws IOException {
            if (map == null) {
                throw c0.o(this.f89975a, this.f89976b, ProtectedSandApp.s("ꗫ\u0001"), new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.o(this.f89975a, this.f89976b, ProtectedSandApp.s("ꗪ\u0001"), new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.o(this.f89975a, this.f89976b, android.support.v4.media.d.a(ProtectedSandApp.s("ꗨ\u0001"), key, ProtectedSandApp.s("ꗩ\u0001")), new Object[0]);
                }
                vVar.b(key, this.f89977c.a(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class h extends o<okhttp3.u> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f89978a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89979b;

        h(Method method, int i4) {
            this.f89978a = method;
            this.f89979b = i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, @zc.h okhttp3.u uVar) {
            if (uVar != null) {
                vVar.c(uVar);
            } else {
                throw c0.o(this.f89978a, this.f89979b, ProtectedSandApp.s("ꗬ\u0001"), new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class i<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f89980a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89981b;

        /* renamed from: c, reason: collision with root package name */
        private final okhttp3.u f89982c;

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.f<T, e0> f89983d;

        i(Method method, int i4, okhttp3.u uVar, retrofit2.f<T, e0> fVar) {
            this.f89980a = method;
            this.f89981b = i4;
            this.f89982c = uVar;
            this.f89983d = fVar;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h T t4) {
            if (t4 == null) {
                return;
            }
            try {
                vVar.d(this.f89982c, this.f89983d.a(t4));
            } catch (IOException e4) {
                throw c0.o(this.f89980a, this.f89981b, ProtectedSandApp.s("ꗭ\u0001") + t4 + ProtectedSandApp.s("ꗮ\u0001"), e4);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class j<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f89984a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89985b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, e0> f89986c;

        /* renamed from: d, reason: collision with root package name */
        private final String f89987d;

        j(Method method, int i4, retrofit2.f<T, e0> fVar, String str) {
            this.f89984a = method;
            this.f89985b = i4;
            this.f89986c = fVar;
            this.f89987d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, @zc.h Map<String, T> map) throws IOException {
            if (map == null) {
                throw c0.o(this.f89984a, this.f89985b, ProtectedSandApp.s("ꗶ\u0001"), new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.o(this.f89984a, this.f89985b, ProtectedSandApp.s("ꗵ\u0001"), new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.o(this.f89984a, this.f89985b, android.support.v4.media.d.a(ProtectedSandApp.s("ꗳ\u0001"), key, ProtectedSandApp.s("ꗴ\u0001")), new Object[0]);
                }
                vVar.d(okhttp3.u.q(ProtectedSandApp.s("ꗲ\u0001"), android.support.v4.media.d.a(ProtectedSandApp.s("ꗯ\u0001"), key, ProtectedSandApp.s("ꗰ\u0001")), ProtectedSandApp.s("ꗱ\u0001"), this.f89987d), this.f89986c.a(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class k<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f89988a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89989b;

        /* renamed from: c, reason: collision with root package name */
        private final String f89990c;

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.f<T, String> f89991d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f89992e;

        k(Method method, int i4, String str, retrofit2.f<T, String> fVar, boolean z4) {
            this.f89988a = method;
            this.f89989b = i4;
            Objects.requireNonNull(str, ProtectedSandApp.s("ꗷ\u0001"));
            this.f89990c = str;
            this.f89991d = fVar;
            this.f89992e = z4;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h T t4) throws IOException {
            if (t4 == null) {
                throw c0.o(this.f89988a, this.f89989b, android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("ꗸ\u0001")), this.f89990c, ProtectedSandApp.s("ꗹ\u0001")), new Object[0]);
            }
            vVar.f(this.f89990c, this.f89991d.a(t4), this.f89992e);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class l<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f89993a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f<T, String> f89994b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f89995c;

        l(String str, retrofit2.f<T, String> fVar, boolean z4) {
            Objects.requireNonNull(str, ProtectedSandApp.s("ꗺ\u0001"));
            this.f89993a = str;
            this.f89994b = fVar;
            this.f89995c = z4;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h T t4) throws IOException {
            String a5;
            if (t4 == null || (a5 = this.f89994b.a(t4)) == null) {
                return;
            }
            vVar.g(this.f89993a, a5, this.f89995c);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class m<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f89996a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89997b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f<T, String> f89998c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f89999d;

        m(Method method, int i4, retrofit2.f<T, String> fVar, boolean z4) {
            this.f89996a = method;
            this.f89997b = i4;
            this.f89998c = fVar;
            this.f89999d = z4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, @zc.h Map<String, T> map) throws IOException {
            if (map == null) {
                throw c0.o(this.f89996a, this.f89997b, ProtectedSandApp.s("ꘁ\u0001"), new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.o(this.f89996a, this.f89997b, ProtectedSandApp.s("ꘀ\u0001"), new Object[0]);
                }
                T value = entry.getValue();
                String s4 = ProtectedSandApp.s("ꗻ\u0001");
                if (value == null) {
                    throw c0.o(this.f89996a, this.f89997b, android.support.v4.media.d.a(ProtectedSandApp.s("ꗿ\u0001"), key, s4), new Object[0]);
                }
                String a5 = this.f89998c.a(value);
                if (a5 == null) {
                    throw c0.o(this.f89996a, this.f89997b, ProtectedSandApp.s("ꗼ\u0001") + value + ProtectedSandApp.s("ꗽ\u0001") + this.f89998c.getClass().getName() + ProtectedSandApp.s("ꗾ\u0001") + key + s4, new Object[0]);
                }
                vVar.g(key, a5, this.f89999d);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class n<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final retrofit2.f<T, String> f90000a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f90001b;

        n(retrofit2.f<T, String> fVar, boolean z4) {
            this.f90000a = fVar;
            this.f90001b = z4;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h T t4) throws IOException {
            if (t4 == null) {
                return;
            }
            vVar.g(this.f90000a.a(t4), null, this.f90001b);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.o$o, reason: collision with other inner class name */
    static final class C1390o extends o<y.c> {

        /* renamed from: a, reason: collision with root package name */
        static final C1390o f90002a = new C1390o();

        private C1390o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, @zc.h y.c cVar) {
            if (cVar != null) {
                vVar.e(cVar);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class p extends o<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f90003a;

        /* renamed from: b, reason: collision with root package name */
        private final int f90004b;

        p(Method method, int i4) {
            this.f90003a = method;
            this.f90004b = i4;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h Object obj) {
            if (obj != null) {
                vVar.m(obj);
            } else {
                throw c0.o(this.f90003a, this.f90004b, ProtectedSandApp.s("ꘂ\u0001"), new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class q<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        final Class<T> f90005a;

        q(Class<T> cls) {
            this.f90005a = cls;
        }

        @Override // retrofit2.o
        void a(v vVar, @zc.h T t4) {
            vVar.h(this.f90005a, t4);
        }
    }

    o() {
    }

    abstract void a(v vVar, @zc.h T t4) throws IOException;

    final o<Object> b() {
        return new b();
    }

    final o<Iterable<T>> c() {
        return new a();
    }
}

package kotlin.reflect.jvm.internal.impl.storage;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.h0;

/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes5.dex */
public class f implements kotlin.reflect.jvm.internal.impl.storage.n {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26299d;

    /* renamed from: e, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.storage.n f26300e;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f26301f = false;

    /* renamed from: a, reason: collision with root package name */
    protected final kotlin.reflect.jvm.internal.impl.storage.k f26302a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0385f f26303b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26304c;

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    static class a extends f {
        a(String str, InterfaceC0385f interfaceC0385f, kotlin.reflect.jvm.internal.impl.storage.k kVar) {
            super(str, interfaceC0385f, kVar, null);
        }

        private static /* synthetic */ void j(int i5) {
            String s5 = i5 != 1 ? ProtectedSandApp.s("蠪") : ProtectedSandApp.s("蠫");
            Object[] objArr = new Object[i5 != 1 ? 3 : 2];
            String s6 = ProtectedSandApp.s("蠬");
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("蠭");
            } else {
                objArr[0] = s6;
            }
            String s7 = ProtectedSandApp.s("蠮");
            if (i5 != 1) {
                objArr[1] = s6;
            } else {
                objArr[1] = s7;
            }
            if (i5 != 1) {
                objArr[2] = s7;
            }
            String format = String.format(s5, objArr);
            if (i5 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f
        @d5.d
        protected <K, V> o<V> p(@d5.d String str, K k5) {
            if (str == null) {
                j(0);
            }
            o<V> a6 = o.a();
            if (a6 == null) {
                j(1);
            }
            return a6;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    class b<T> extends j<T> {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f26305s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, q3.a aVar, Object obj) {
            super(fVar, aVar);
            this.f26305s = obj;
        }

        private static /* synthetic */ void a(int i5) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("衁"), ProtectedSandApp.s("蠿"), ProtectedSandApp.s("血")));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        @d5.d
        protected o<T> c(boolean z5) {
            o<T> d6 = o.d(this.f26305s);
            if (d6 == null) {
                a(0);
            }
            return d6;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    class c<T> extends k<T> {

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ q3.l f26307t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ q3.l f26308u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, q3.a aVar, q3.l lVar, q3.l lVar2) {
            super(fVar, aVar);
            this.f26307t = lVar;
            this.f26308u = lVar2;
        }

        private static /* synthetic */ void a(int i5) {
            String s5 = i5 != 2 ? ProtectedSandApp.s("衎") : ProtectedSandApp.s("衏");
            Object[] objArr = new Object[i5 != 2 ? 2 : 3];
            String s6 = ProtectedSandApp.s("衐");
            if (i5 != 2) {
                objArr[0] = s6;
            } else {
                objArr[0] = ProtectedSandApp.s("衑");
            }
            if (i5 != 2) {
                objArr[1] = ProtectedSandApp.s("衒");
            } else {
                objArr[1] = s6;
            }
            if (i5 == 2) {
                objArr[2] = ProtectedSandApp.s("術");
            }
            String format = String.format(s5, objArr);
            if (i5 == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        @d5.d
        protected o<T> c(boolean z5) {
            q3.l lVar = this.f26307t;
            if (lVar == null) {
                o<T> c6 = super.c(z5);
                if (c6 == null) {
                    a(0);
                }
                return c6;
            }
            o<T> d6 = o.d(lVar.N(Boolean.valueOf(z5)));
            if (d6 == null) {
                a(1);
            }
            return d6;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.i
        protected void d(@d5.d T t5) {
            if (t5 == null) {
                a(2);
            }
            this.f26308u.N(t5);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    private static class d<K, V> extends e<K, V> implements kotlin.reflect.jvm.internal.impl.storage.a<K, V> {

        /* renamed from: r, reason: collision with root package name */
        static final /* synthetic */ boolean f26310r = false;

        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i5) {
            String s5 = i5 != 3 ? ProtectedSandApp.s("衧") : ProtectedSandApp.s("表");
            Object[] objArr = new Object[i5 != 3 ? 3 : 2];
            String s6 = ProtectedSandApp.s("衩");
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("衬");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("衫");
            } else if (i5 != 3) {
                objArr[0] = ProtectedSandApp.s("衪");
            } else {
                objArr[0] = s6;
            }
            String s7 = ProtectedSandApp.s("衭");
            if (i5 != 3) {
                objArr[1] = s6;
            } else {
                objArr[1] = s7;
            }
            if (i5 == 2) {
                objArr[2] = s7;
            } else if (i5 != 3) {
                objArr[2] = ProtectedSandApp.s("衮");
            }
            String format = String.format(s5, objArr);
            if (i5 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.e, kotlin.reflect.jvm.internal.impl.storage.a
        @d5.d
        public V a(K k5, @d5.d q3.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            V v5 = (V) super.a(k5, aVar);
            if (v5 == null) {
                b(3);
            }
            return v5;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(@d5.d f fVar, @d5.d ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    private static class e<K, V> extends l<g<K, V>, V> implements kotlin.reflect.jvm.internal.impl.storage.b<K, V> {

        /* compiled from: LockBasedStorageManager.java */
        class a implements q3.l<g<K, V>, V> {
            a() {
            }

            @Override // q3.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public V N(g<K, V> gVar) {
                return (V) ((g) gVar).f26313b.n();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("衢");
            } else if (i5 != 2) {
                objArr[0] = ProtectedSandApp.s("衠");
            } else {
                objArr[0] = ProtectedSandApp.s("衡");
            }
            objArr[1] = ProtectedSandApp.s("衣");
            if (i5 != 2) {
                objArr[2] = ProtectedSandApp.s("衤");
            } else {
                objArr[2] = ProtectedSandApp.s("补");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("衦"), objArr));
        }

        @d5.e
        public V a(K k5, @d5.d q3.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            return N(new g(k5, aVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(@d5.d f fVar, @d5.d ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.f$f, reason: collision with other inner class name */
    public interface InterfaceC0385f {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC0385f f26311a = new a();

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.f$f$a */
        static class a implements InterfaceC0385f {
            a() {
            }

            private static /* synthetic */ void b(int i5) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("咏"), ProtectedSandApp.s("和"), ProtectedSandApp.s("咍"), ProtectedSandApp.s("咎")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0385f
            @d5.d
            public RuntimeException a(@d5.d Throwable th) {
                if (th == null) {
                    b(0);
                }
                l0.p(th, ProtectedSandApp.s("咐"));
                throw th;
            }
        }

        @d5.d
        RuntimeException a(@d5.d Throwable th);
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f26312a;

        /* renamed from: b, reason: collision with root package name */
        private final q3.a<? extends V> f26313b;

        public g(K k5, q3.a<? extends V> aVar) {
            this.f26312a = k5;
            this.f26313b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f26312a.equals(((g) obj).f26312a);
        }

        public int hashCode() {
            return this.f26312a.hashCode();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    private static class h<T> implements kotlin.reflect.jvm.internal.impl.storage.j<T> {

        /* renamed from: o, reason: collision with root package name */
        private final f f26314o;

        /* renamed from: p, reason: collision with root package name */
        private final q3.a<? extends T> f26315p;

        /* renamed from: q, reason: collision with root package name */
        @d5.e
        private volatile Object f26316q;

        public h(@d5.d f fVar, @d5.d q3.a<? extends T> aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f26316q = n.NOT_COMPUTED;
            this.f26314o = fVar;
            this.f26315p = aVar;
        }

        private static /* synthetic */ void a(int i5) {
            String s5 = (i5 == 2 || i5 == 3) ? ProtectedSandApp.s("蠰") : ProtectedSandApp.s("蠯");
            Object[] objArr = new Object[(i5 == 2 || i5 == 3) ? 2 : 3];
            String s6 = ProtectedSandApp.s("蠱");
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("蠳");
            } else if (i5 == 2 || i5 == 3) {
                objArr[0] = s6;
            } else {
                objArr[0] = ProtectedSandApp.s("蠲");
            }
            if (i5 == 2) {
                objArr[1] = ProtectedSandApp.s("蠵");
            } else if (i5 != 3) {
                objArr[1] = s6;
            } else {
                objArr[1] = ProtectedSandApp.s("蠴");
            }
            if (i5 != 2 && i5 != 3) {
                objArr[2] = ProtectedSandApp.s("蠶");
            }
            String format = String.format(s5, objArr);
            if (i5 != 2 && i5 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public boolean F() {
            return (this.f26316q == n.NOT_COMPUTED || this.f26316q == n.COMPUTING) ? false : true;
        }

        protected void b(T t5) {
        }

        @d5.d
        protected o<T> c(boolean z5) {
            o<T> p5 = this.f26314o.p(ProtectedSandApp.s("蠷"), null);
            if (p5 == null) {
                a(2);
            }
            return p5;
        }

        @Override // q3.a
        public T n() {
            T n5;
            Object obj = this.f26316q;
            if (!(obj instanceof n)) {
                return (T) WrappedValues.f(obj);
            }
            this.f26314o.f26302a.lock();
            try {
                Object obj2 = this.f26316q;
                if (obj2 instanceof n) {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f26316q = n.RECURSION_WAS_DETECTED;
                        o<T> c6 = c(true);
                        if (!c6.c()) {
                            n5 = c6.b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o<T> c7 = c(false);
                        if (!c7.c()) {
                            n5 = c7.b();
                        }
                    }
                    this.f26316q = nVar;
                    try {
                        n5 = this.f26315p.n();
                        b(n5);
                        this.f26316q = n5;
                    } catch (Throwable th) {
                        if (kotlin.reflect.jvm.internal.impl.utils.c.a(th)) {
                            this.f26316q = n.NOT_COMPUTED;
                            throw th;
                        }
                        if (this.f26316q == n.COMPUTING) {
                            this.f26316q = WrappedValues.c(th);
                        }
                        throw this.f26314o.f26303b.a(th);
                    }
                } else {
                    n5 = (T) WrappedValues.f(obj2);
                }
                return n5;
            } finally {
                this.f26314o.f26302a.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    private static abstract class i<T> extends h<T> {

        /* renamed from: r, reason: collision with root package name */
        @d5.e
        private volatile kotlin.reflect.jvm.internal.impl.storage.l<T> f26317r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@d5.d f fVar, @d5.d q3.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f26317r = null;
        }

        private static /* synthetic */ void a(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("衂");
            } else {
                objArr[0] = ProtectedSandApp.s("衃");
            }
            objArr[1] = ProtectedSandApp.s("衄");
            objArr[2] = ProtectedSandApp.s("衅");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("衆"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        protected final void b(T t5) {
            this.f26317r = new kotlin.reflect.jvm.internal.impl.storage.l<>(t5);
            try {
                d(t5);
            } finally {
                this.f26317r = null;
            }
        }

        protected abstract void d(T t5);

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h, q3.a
        public T n() {
            kotlin.reflect.jvm.internal.impl.storage.l<T> lVar = this.f26317r;
            return (lVar == null || !lVar.b()) ? (T) super.n() : lVar.a();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    private static class j<T> extends h<T> implements kotlin.reflect.jvm.internal.impl.storage.i<T> {

        /* renamed from: r, reason: collision with root package name */
        static final /* synthetic */ boolean f26318r = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@d5.d f fVar, @d5.d q3.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i5) {
            String s5 = i5 != 2 ? ProtectedSandApp.s("蠸") : ProtectedSandApp.s("蠹");
            Object[] objArr = new Object[i5 != 2 ? 3 : 2];
            String s6 = ProtectedSandApp.s("蠺");
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("蠼");
            } else if (i5 != 2) {
                objArr[0] = ProtectedSandApp.s("蠻");
            } else {
                objArr[0] = s6;
            }
            if (i5 != 2) {
                objArr[1] = s6;
            } else {
                objArr[1] = ProtectedSandApp.s("蠽");
            }
            if (i5 != 2) {
                objArr[2] = ProtectedSandApp.s("蠾");
            }
            String format = String.format(s5, objArr);
            if (i5 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h, q3.a
        @d5.d
        public T n() {
            T t5 = (T) super.n();
            if (t5 == null) {
                a(2);
            }
            return t5;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    private static abstract class k<T> extends i<T> implements kotlin.reflect.jvm.internal.impl.storage.i<T> {

        /* renamed from: s, reason: collision with root package name */
        static final /* synthetic */ boolean f26319s = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@d5.d f fVar, @d5.d q3.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i5) {
            String s5 = i5 != 2 ? ProtectedSandApp.s("衇") : ProtectedSandApp.s("衈");
            Object[] objArr = new Object[i5 != 2 ? 3 : 2];
            String s6 = ProtectedSandApp.s("衉");
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("衋");
            } else if (i5 != 2) {
                objArr[0] = ProtectedSandApp.s("衊");
            } else {
                objArr[0] = s6;
            }
            if (i5 != 2) {
                objArr[1] = s6;
            } else {
                objArr[1] = ProtectedSandApp.s("行");
            }
            if (i5 != 2) {
                objArr[2] = ProtectedSandApp.s("衍");
            }
            String format = String.format(s5, objArr);
            if (i5 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.i, kotlin.reflect.jvm.internal.impl.storage.f.h, q3.a
        @d5.d
        public T n() {
            T t5 = (T) super.n();
            if (t5 == null) {
                a(2);
            }
            return t5;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    private static class l<K, V> implements kotlin.reflect.jvm.internal.impl.storage.h<K, V> {

        /* renamed from: o, reason: collision with root package name */
        private final f f26320o;

        /* renamed from: p, reason: collision with root package name */
        private final ConcurrentMap<K, Object> f26321p;

        /* renamed from: q, reason: collision with root package name */
        private final q3.l<? super K, ? extends V> f26322q;

        public l(@d5.d f fVar, @d5.d ConcurrentMap<K, Object> concurrentMap, @d5.d q3.l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f26320o = fVar;
            this.f26321p = concurrentMap;
            this.f26322q = lVar;
        }

        private static /* synthetic */ void b(int i5) {
            String s5 = (i5 == 3 || i5 == 4) ? ProtectedSandApp.s("衕") : ProtectedSandApp.s("衔");
            Object[] objArr = new Object[(i5 == 3 || i5 == 4) ? 2 : 3];
            String s6 = ProtectedSandApp.s("衖");
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("衙");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("衘");
            } else if (i5 == 3 || i5 == 4) {
                objArr[0] = s6;
            } else {
                objArr[0] = ProtectedSandApp.s("街");
            }
            if (i5 == 3) {
                objArr[1] = ProtectedSandApp.s("衛");
            } else if (i5 != 4) {
                objArr[1] = s6;
            } else {
                objArr[1] = ProtectedSandApp.s("衚");
            }
            if (i5 != 3 && i5 != 4) {
                objArr[2] = ProtectedSandApp.s("衜");
            }
            String format = String.format(s5, objArr);
            if (i5 != 3 && i5 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @d5.d
        private AssertionError d(K k5, Object obj) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError(ProtectedSandApp.s("衝") + k5 + ProtectedSandApp.s("衞") + obj + ProtectedSandApp.s("衟") + this.f26320o));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        @Override // q3.l
        @d5.e
        public V N(K k5) {
            V v5;
            Object obj = this.f26321p.get(k5);
            if (obj != null && obj != n.COMPUTING) {
                return (V) WrappedValues.d(obj);
            }
            this.f26320o.f26302a.lock();
            try {
                Object obj2 = this.f26321p.get(k5);
                n nVar = n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = n.RECURSION_WAS_DETECTED;
                    o<V> g5 = g(k5, true);
                    if (!g5.c()) {
                        v5 = g5.b();
                        return v5;
                    }
                }
                if (obj2 == n.RECURSION_WAS_DETECTED) {
                    o<V> g6 = g(k5, false);
                    if (!g6.c()) {
                        v5 = g6.b();
                        return v5;
                    }
                }
                if (obj2 != null) {
                    v5 = (V) WrappedValues.d(obj2);
                    return v5;
                }
                AssertionError assertionError = null;
                try {
                    this.f26321p.put(k5, nVar);
                    V N = this.f26322q.N(k5);
                    Object put = this.f26321p.put(k5, WrappedValues.b(N));
                    if (put == nVar) {
                        return N;
                    }
                    assertionError = d(k5, put);
                    throw assertionError;
                } catch (Throwable th) {
                    if (kotlin.reflect.jvm.internal.impl.utils.c.a(th)) {
                        this.f26321p.remove(k5);
                        throw th;
                    }
                    if (th == assertionError) {
                        throw this.f26320o.f26303b.a(th);
                    }
                    Object put2 = this.f26321p.put(k5, WrappedValues.c(th));
                    if (put2 != n.COMPUTING) {
                        throw d(k5, put2);
                    }
                    throw this.f26320o.f26303b.a(th);
                }
            } finally {
                this.f26320o.f26302a.unlock();
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.h
        public boolean V(K k5) {
            Object obj = this.f26321p.get(k5);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }

        protected f c() {
            return this.f26320o;
        }

        @d5.d
        protected o<V> g(K k5, boolean z5) {
            o<V> p5 = this.f26320o.p("", k5);
            if (p5 == null) {
                b(3);
            }
            return p5;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes6.dex */
    private static class m<K, V> extends l<K, V> implements kotlin.reflect.jvm.internal.impl.storage.g<K, V> {

        /* renamed from: r, reason: collision with root package name */
        static final /* synthetic */ boolean f26323r = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@d5.d f fVar, @d5.d ConcurrentMap<K, Object> concurrentMap, @d5.d q3.l<? super K, ? extends V> lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i5) {
            String s5 = i5 != 3 ? ProtectedSandApp.s("衯") : ProtectedSandApp.s("衰");
            Object[] objArr = new Object[i5 != 3 ? 3 : 2];
            String s6 = ProtectedSandApp.s("衱");
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("衴");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("衳");
            } else if (i5 != 3) {
                objArr[0] = ProtectedSandApp.s("衲");
            } else {
                objArr[0] = s6;
            }
            if (i5 != 3) {
                objArr[1] = s6;
            } else {
                objArr[1] = ProtectedSandApp.s("衵");
            }
            if (i5 != 3) {
                objArr[2] = ProtectedSandApp.s("衶");
            }
            String format = String.format(s5, objArr);
            if (i5 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.l, q3.l
        @d5.d
        public V N(K k5) {
            V v5 = (V) super.N(k5);
            if (v5 == null) {
                b(3);
            }
            return v5;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class o<T> {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f26324c = false;

        /* renamed from: a, reason: collision with root package name */
        private final T f26325a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26326b;

        private o(T t5, boolean z5) {
            this.f26325a = t5;
            this.f26326b = z5;
        }

        @d5.d
        public static <T> o<T> a() {
            return new o<>(null, true);
        }

        @d5.d
        public static <T> o<T> d(T t5) {
            return new o<>(t5, false);
        }

        public T b() {
            return this.f26325a;
        }

        public boolean c() {
            return this.f26326b;
        }

        public String toString() {
            return c() ? ProtectedSandApp.s("咔") : String.valueOf(this.f26325a);
        }
    }

    static {
        String x5;
        x5 = h0.x5(f.class.getCanonicalName(), ProtectedSandApp.s("咕"), "");
        f26299d = x5;
        f26300e = new a(ProtectedSandApp.s("咖"), InterfaceC0385f.f26311a, kotlin.reflect.jvm.internal.impl.storage.e.f26298b);
    }

    /* synthetic */ f(String str, InterfaceC0385f interfaceC0385f, kotlin.reflect.jvm.internal.impl.storage.k kVar, a aVar) {
        this(str, interfaceC0385f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.f.j(int):void");
    }

    @d5.d
    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @d5.d
    public static <T extends Throwable> T q(@d5.d T t5) {
        if (t5 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t5.getStackTrace();
        int length = stackTrace.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (!stackTrace[i5].getClassName().startsWith(f26299d)) {
                break;
            }
            i5++;
        }
        List subList = Arrays.asList(stackTrace).subList(i5, length);
        t5.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    public <T> T a(@d5.d q3.a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f26302a.lock();
        try {
            return aVar.n();
        } finally {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @d5.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.b<K, V> b() {
        return new e(this, m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @d5.d
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> c(@d5.d q3.a<? extends T> aVar, q3.l<? super Boolean, ? extends T> lVar, @d5.d q3.l<? super T, m2> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @d5.d
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> d(@d5.d q3.a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @d5.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.a<K, V> e() {
        return new d(this, m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @d5.d
    public <T> kotlin.reflect.jvm.internal.impl.storage.j<T> f(@d5.d q3.a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @d5.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> g(@d5.d q3.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        kotlin.reflect.jvm.internal.impl.storage.g<K, V> n5 = n(lVar, m());
        if (n5 == null) {
            j(10);
        }
        return n5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @d5.d
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> h(@d5.d q3.a<? extends T> aVar, @d5.d T t5) {
        if (aVar == null) {
            j(26);
        }
        if (t5 == null) {
            j(27);
        }
        return new b(this, aVar, t5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @d5.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.h<K, V> i(@d5.d q3.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        kotlin.reflect.jvm.internal.impl.storage.h<K, V> o5 = o(lVar, m());
        if (o5 == null) {
            j(20);
        }
        return o5;
    }

    @d5.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> n(@d5.d q3.l<? super K, ? extends V> lVar, @d5.d ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    @d5.d
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.h<K, V> o(@d5.d q3.l<? super K, ? extends V> lVar, @d5.d ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    @d5.d
    protected <K, V> o<V> p(@d5.d String str, K k5) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("咱"));
        sb.append(str);
        if (k5 == null) {
            str2 = "";
        } else {
            str2 = ProtectedSandApp.s("咲") + k5;
        }
        sb.append(str2);
        sb.append(ProtectedSandApp.s("咳"));
        sb.append(this);
        throw ((AssertionError) q(new AssertionError(sb.toString())));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(ProtectedSandApp.s("咴"));
        sb.append(Integer.toHexString(hashCode()));
        sb.append(ProtectedSandApp.s("咵"));
        return androidx.concurrent.futures.a.a(sb, this.f26304c, ProtectedSandApp.s("咶"));
    }

    private f(@d5.d String str, @d5.d InterfaceC0385f interfaceC0385f, @d5.d kotlin.reflect.jvm.internal.impl.storage.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0385f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f26302a = kVar;
        this.f26303b = interfaceC0385f;
        this.f26304c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (q3.l<InterruptedException, m2>) null);
    }

    public f(String str, @d5.e Runnable runnable, @d5.e q3.l<InterruptedException, m2> lVar) {
        this(str, InterfaceC0385f.f26311a, kotlin.reflect.jvm.internal.impl.storage.k.f26327a.a(runnable, lVar));
    }
}

package kotlin.reflect.jvm.internal.impl.storage;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.v;

/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes7.dex */
public class f implements kotlin.reflect.jvm.internal.impl.storage.n {

    /* renamed from: d, reason: collision with root package name */
    private static final String f78307d = v.x5(f.class.getCanonicalName(), ProtectedSandApp.s("粮\u0001"), "");

    /* renamed from: e, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.storage.n f78308e = new a(ProtectedSandApp.s("粯\u0001"), InterfaceC1189f.f78319a, kotlin.reflect.jvm.internal.impl.storage.e.f78306b, null);

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f78309f = false;

    /* renamed from: a, reason: collision with root package name */
    protected final kotlin.reflect.jvm.internal.impl.storage.k f78310a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1189f f78311b;

    /* renamed from: c, reason: collision with root package name */
    private final String f78312c;

    /* compiled from: LockBasedStorageManager.java */
    static class a extends f {
        a(String str, InterfaceC1189f interfaceC1189f, kotlin.reflect.jvm.internal.impl.storage.k kVar) {
            super(str, interfaceC1189f, kVar, null);
        }

        private static /* synthetic */ void j(int i4) {
            String s4 = i4 != 1 ? ProtectedSandApp.s("糐\u0001") : ProtectedSandApp.s("糑\u0001");
            Object[] objArr = new Object[i4 != 1 ? 3 : 2];
            String s5 = ProtectedSandApp.s("糒\u0001");
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("糓\u0001");
            } else {
                objArr[0] = s5;
            }
            String s6 = ProtectedSandApp.s("糔\u0001");
            if (i4 != 1) {
                objArr[1] = s5;
            } else {
                objArr[1] = s6;
            }
            if (i4 != 1) {
                objArr[2] = s6;
            }
            String format = String.format(s4, objArr);
            if (i4 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f
        @fg.l
        protected <K, V> o<V> p(@fg.l String str, K k4) {
            if (str == null) {
                j(0);
            }
            o<V> a5 = o.a();
            if (a5 == null) {
                j(1);
            }
            return a5;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    class b<T> extends j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f78313f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, ld.a aVar, Object obj) {
            super(fVar, aVar);
            this.f78313f = obj;
        }

        private static /* synthetic */ void a(int i4) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("糧\u0001"), ProtectedSandApp.s("糥\u0001"), ProtectedSandApp.s("糦\u0001")));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        @fg.l
        protected o<T> c(boolean z4) {
            o<T> d5 = o.d(this.f78313f);
            if (d5 == null) {
                a(0);
            }
            return d5;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    class c<T> extends k<T> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l f78315g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l f78316h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, ld.a aVar, ld.l lVar, ld.l lVar2) {
            super(fVar, aVar);
            this.f78315g = lVar;
            this.f78316h = lVar2;
        }

        private static /* synthetic */ void a(int i4) {
            String s4 = i4 != 2 ? ProtectedSandApp.s("糴\u0001") : ProtectedSandApp.s("糵\u0001");
            Object[] objArr = new Object[i4 != 2 ? 2 : 3];
            String s5 = ProtectedSandApp.s("糶\u0001");
            if (i4 != 2) {
                objArr[0] = s5;
            } else {
                objArr[0] = ProtectedSandApp.s("糷\u0001");
            }
            if (i4 != 2) {
                objArr[1] = ProtectedSandApp.s("糸\u0001");
            } else {
                objArr[1] = s5;
            }
            if (i4 == 2) {
                objArr[2] = ProtectedSandApp.s("糹\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        @fg.l
        protected o<T> c(boolean z4) {
            ld.l lVar = this.f78315g;
            if (lVar == null) {
                o<T> c5 = super.c(z4);
                if (c5 == null) {
                    a(0);
                }
                return c5;
            }
            o<T> d5 = o.d(lVar.invoke(Boolean.valueOf(z4)));
            if (d5 == null) {
                a(1);
            }
            return d5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.i
        protected void d(@fg.l T t4) {
            if (t4 == null) {
                a(2);
            }
            this.f78316h.invoke(t4);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class d<K, V> extends e<K, V> implements kotlin.reflect.jvm.internal.impl.storage.a<K, V> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f78318e = false;

        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i4) {
            String s4 = i4 != 3 ? ProtectedSandApp.s("紑\u0001") : ProtectedSandApp.s("紒\u0001");
            Object[] objArr = new Object[i4 != 3 ? 3 : 2];
            String s5 = ProtectedSandApp.s("紓\u0001");
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("紖\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("紕\u0001");
            } else if (i4 != 3) {
                objArr[0] = ProtectedSandApp.s("純\u0001");
            } else {
                objArr[0] = s5;
            }
            String s6 = ProtectedSandApp.s("紗\u0001");
            if (i4 != 3) {
                objArr[1] = s5;
            } else {
                objArr[1] = s6;
            }
            if (i4 == 2) {
                objArr[2] = s6;
            } else if (i4 != 3) {
                objArr[2] = ProtectedSandApp.s("紘\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.e, kotlin.reflect.jvm.internal.impl.storage.a
        @fg.l
        public V a(K k4, @fg.l ld.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            V v4 = (V) super.a(k4, aVar);
            if (v4 == null) {
                b(3);
            }
            return v4;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(@fg.l f fVar, @fg.l ConcurrentMap<g<K, V>, Object> concurrentMap) {
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
    private static class e<K, V> extends l<g<K, V>, V> implements kotlin.reflect.jvm.internal.impl.storage.b<K, V> {

        /* compiled from: LockBasedStorageManager.java */
        class a implements ld.l<g<K, V>, V> {
            a() {
            }

            @Override // ld.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(g<K, V> gVar) {
                return (V) ((g) gVar).f78321b.invoke();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("紌\u0001");
            } else if (i4 != 2) {
                objArr[0] = ProtectedSandApp.s("紊\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("紋\u0001");
            }
            objArr[1] = ProtectedSandApp.s("納\u0001");
            if (i4 != 2) {
                objArr[2] = ProtectedSandApp.s("紎\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("紏\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("紐\u0001"), objArr));
        }

        @fg.m
        public V a(K k4, @fg.l ld.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            return invoke(new g(k4, aVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(@fg.l f fVar, @fg.l ConcurrentMap<g<K, V>, Object> concurrentMap) {
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
    public interface InterfaceC1189f {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC1189f f78319a = new a();

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.f$f$a */
        static class a implements InterfaceC1189f {
            a() {
            }

            private static /* synthetic */ void b(int i4) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("紜\u0001"), ProtectedSandApp.s("紛\u0001"), ProtectedSandApp.s("紙\u0001"), ProtectedSandApp.s("級\u0001")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC1189f
            @fg.l
            public RuntimeException a(@fg.l Throwable th) {
                if (th == null) {
                    b(0);
                }
                l0.p(th, ProtectedSandApp.s("紝\u0001"));
                throw th;
            }
        }

        @fg.l
        RuntimeException a(@fg.l Throwable th);
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f78320a;

        /* renamed from: b, reason: collision with root package name */
        private final ld.a<? extends V> f78321b;

        public g(K k4, ld.a<? extends V> aVar) {
            this.f78320a = k4;
            this.f78321b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f78320a.equals(((g) obj).f78320a);
        }

        public int hashCode() {
            return this.f78320a.hashCode();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class h<T> implements kotlin.reflect.jvm.internal.impl.storage.j<T> {

        /* renamed from: b, reason: collision with root package name */
        private final f f78322b;

        /* renamed from: c, reason: collision with root package name */
        private final ld.a<? extends T> f78323c;

        /* renamed from: d, reason: collision with root package name */
        @fg.m
        private volatile Object f78324d;

        public h(@fg.l f fVar, @fg.l ld.a<? extends T> aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f78324d = n.NOT_COMPUTED;
            this.f78322b = fVar;
            this.f78323c = aVar;
        }

        private static /* synthetic */ void a(int i4) {
            String s4 = (i4 == 2 || i4 == 3) ? ProtectedSandApp.s("糖\u0001") : ProtectedSandApp.s("糕\u0001");
            Object[] objArr = new Object[(i4 == 2 || i4 == 3) ? 2 : 3];
            String s5 = ProtectedSandApp.s("糗\u0001");
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("糙\u0001");
            } else if (i4 == 2 || i4 == 3) {
                objArr[0] = s5;
            } else {
                objArr[0] = ProtectedSandApp.s("糘\u0001");
            }
            if (i4 == 2) {
                objArr[1] = ProtectedSandApp.s("糛\u0001");
            } else if (i4 != 3) {
                objArr[1] = s5;
            } else {
                objArr[1] = ProtectedSandApp.s("糚\u0001");
            }
            if (i4 != 2 && i4 != 3) {
                objArr[2] = ProtectedSandApp.s("糜\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 != 2 && i4 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public boolean Q() {
            return (this.f78324d == n.NOT_COMPUTED || this.f78324d == n.COMPUTING) ? false : true;
        }

        protected void b(T t4) {
        }

        @fg.l
        protected o<T> c(boolean z4) {
            o<T> p4 = this.f78322b.p(ProtectedSandApp.s("糝\u0001"), null);
            if (p4 == null) {
                a(2);
            }
            return p4;
        }

        @Override // ld.a
        public T invoke() {
            T invoke;
            Object obj = this.f78324d;
            if (!(obj instanceof n)) {
                return (T) WrappedValues.f(obj);
            }
            this.f78322b.f78310a.lock();
            try {
                Object obj2 = this.f78324d;
                if (obj2 instanceof n) {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f78324d = n.RECURSION_WAS_DETECTED;
                        o<T> c5 = c(true);
                        if (!c5.c()) {
                            invoke = c5.b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o<T> c6 = c(false);
                        if (!c6.c()) {
                            invoke = c6.b();
                        }
                    }
                    this.f78324d = nVar;
                    try {
                        invoke = this.f78323c.invoke();
                        b(invoke);
                        this.f78324d = invoke;
                    } catch (Throwable th) {
                        if (kotlin.reflect.jvm.internal.impl.utils.d.a(th)) {
                            this.f78324d = n.NOT_COMPUTED;
                            throw th;
                        }
                        if (this.f78324d == n.COMPUTING) {
                            this.f78324d = WrappedValues.c(th);
                        }
                        throw this.f78322b.f78311b.a(th);
                    }
                } else {
                    invoke = (T) WrappedValues.f(obj2);
                }
                return invoke;
            } finally {
                this.f78322b.f78310a.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static abstract class i<T> extends h<T> {

        /* renamed from: e, reason: collision with root package name */
        @fg.m
        private volatile kotlin.reflect.jvm.internal.impl.storage.l<T> f78325e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@fg.l f fVar, @fg.l ld.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f78325e = null;
        }

        private static /* synthetic */ void a(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("糨\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("糩\u0001");
            }
            objArr[1] = ProtectedSandApp.s("糪\u0001");
            objArr[2] = ProtectedSandApp.s("糫\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("糬\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        protected final void b(T t4) {
            this.f78325e = new kotlin.reflect.jvm.internal.impl.storage.l<>(t4);
            try {
                d(t4);
            } finally {
                this.f78325e = null;
            }
        }

        protected abstract void d(T t4);

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h, ld.a
        public T invoke() {
            kotlin.reflect.jvm.internal.impl.storage.l<T> lVar = this.f78325e;
            return (lVar == null || !lVar.b()) ? (T) super.invoke() : lVar.a();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class j<T> extends h<T> implements kotlin.reflect.jvm.internal.impl.storage.i<T> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f78326e = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@fg.l f fVar, @fg.l ld.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i4) {
            String s4 = i4 != 2 ? ProtectedSandApp.s("糞\u0001") : ProtectedSandApp.s("糟\u0001");
            Object[] objArr = new Object[i4 != 2 ? 3 : 2];
            String s5 = ProtectedSandApp.s("糠\u0001");
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("糢\u0001");
            } else if (i4 != 2) {
                objArr[0] = ProtectedSandApp.s("糡\u0001");
            } else {
                objArr[0] = s5;
            }
            if (i4 != 2) {
                objArr[1] = s5;
            } else {
                objArr[1] = ProtectedSandApp.s("糣\u0001");
            }
            if (i4 != 2) {
                objArr[2] = ProtectedSandApp.s("糤\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h, ld.a
        @fg.l
        public T invoke() {
            T t4 = (T) super.invoke();
            if (t4 == null) {
                a(2);
            }
            return t4;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static abstract class k<T> extends i<T> implements kotlin.reflect.jvm.internal.impl.storage.i<T> {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f78327f = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@fg.l f fVar, @fg.l ld.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i4) {
            String s4 = i4 != 2 ? ProtectedSandApp.s("糭\u0001") : ProtectedSandApp.s("糮\u0001");
            Object[] objArr = new Object[i4 != 2 ? 3 : 2];
            String s5 = ProtectedSandApp.s("糯\u0001");
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("糱\u0001");
            } else if (i4 != 2) {
                objArr[0] = ProtectedSandApp.s("糰\u0001");
            } else {
                objArr[0] = s5;
            }
            if (i4 != 2) {
                objArr[1] = s5;
            } else {
                objArr[1] = ProtectedSandApp.s("糲\u0001");
            }
            if (i4 != 2) {
                objArr[2] = ProtectedSandApp.s("糳\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.i, kotlin.reflect.jvm.internal.impl.storage.f.h, ld.a
        @fg.l
        public T invoke() {
            T t4 = (T) super.invoke();
            if (t4 == null) {
                a(2);
            }
            return t4;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class l<K, V> implements kotlin.reflect.jvm.internal.impl.storage.h<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final f f78328b;

        /* renamed from: c, reason: collision with root package name */
        private final ConcurrentMap<K, Object> f78329c;

        /* renamed from: d, reason: collision with root package name */
        private final ld.l<? super K, ? extends V> f78330d;

        public l(@fg.l f fVar, @fg.l ConcurrentMap<K, Object> concurrentMap, @fg.l ld.l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f78328b = fVar;
            this.f78329c = concurrentMap;
            this.f78330d = lVar;
        }

        private static /* synthetic */ void b(int i4) {
            String s4 = (i4 == 3 || i4 == 4) ? ProtectedSandApp.s("系\u0001") : ProtectedSandApp.s("糺\u0001");
            Object[] objArr = new Object[(i4 == 3 || i4 == 4) ? 2 : 3];
            String s5 = ProtectedSandApp.s("糼\u0001");
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("糿\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("糾\u0001");
            } else if (i4 == 3 || i4 == 4) {
                objArr[0] = s5;
            } else {
                objArr[0] = ProtectedSandApp.s("糽\u0001");
            }
            if (i4 == 3) {
                objArr[1] = ProtectedSandApp.s("紁\u0001");
            } else if (i4 != 4) {
                objArr[1] = s5;
            } else {
                objArr[1] = ProtectedSandApp.s("紀\u0001");
            }
            if (i4 != 3 && i4 != 4) {
                objArr[2] = ProtectedSandApp.s("紂\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 != 3 && i4 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        private AssertionError d(K k4, Object obj) {
            return (AssertionError) f.q(new AssertionError(ProtectedSandApp.s("紃\u0001") + n.COMPUTING + ProtectedSandApp.s("約\u0001") + obj + ProtectedSandApp.s("紅\u0001") + k4 + ProtectedSandApp.s("紆\u0001") + this.f78328b));
        }

        @fg.l
        private AssertionError f(K k4, Object obj) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError(ProtectedSandApp.s("紇\u0001") + k4 + ProtectedSandApp.s("紈\u0001") + obj + ProtectedSandApp.s("紆\u0001") + this.f78328b));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        private AssertionError j(K k4, Throwable th) {
            return (AssertionError) f.q(new AssertionError(ProtectedSandApp.s("紉\u0001") + k4 + ProtectedSandApp.s("紆\u0001") + this.f78328b, th));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.h
        public boolean X(K k4) {
            Object obj = this.f78329c.get(k4);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }

        protected f c() {
            return this.f78328b;
        }

        @fg.l
        protected o<V> h(K k4, boolean z4) {
            o<V> p4 = this.f78328b.p("", k4);
            if (p4 == null) {
                b(3);
            }
            return p4;
        }

        @Override // ld.l
        @fg.m
        public V invoke(K k4) {
            AssertionError j4;
            AssertionError j5;
            V v4;
            Object obj = this.f78329c.get(k4);
            if (obj != null && obj != n.COMPUTING) {
                return (V) WrappedValues.d(obj);
            }
            this.f78328b.f78310a.lock();
            try {
                Object obj2 = this.f78329c.get(k4);
                n nVar = n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = n.RECURSION_WAS_DETECTED;
                    o<V> h4 = h(k4, true);
                    if (!h4.c()) {
                        v4 = h4.b();
                        return v4;
                    }
                }
                if (obj2 == n.RECURSION_WAS_DETECTED) {
                    o<V> h5 = h(k4, false);
                    if (!h5.c()) {
                        v4 = h5.b();
                        return v4;
                    }
                }
                if (obj2 != null) {
                    v4 = (V) WrappedValues.d(obj2);
                    return v4;
                }
                AssertionError assertionError = null;
                try {
                    this.f78329c.put(k4, nVar);
                    V invoke = this.f78330d.invoke(k4);
                    Object put = this.f78329c.put(k4, WrappedValues.b(invoke));
                    if (put == nVar) {
                        return invoke;
                    }
                    assertionError = f(k4, put);
                    throw assertionError;
                } catch (Throwable th) {
                    if (kotlin.reflect.jvm.internal.impl.utils.d.a(th)) {
                        try {
                            Object remove = this.f78329c.remove(k4);
                            if (remove != n.COMPUTING) {
                                throw d(k4, remove);
                            }
                            throw th;
                        } finally {
                        }
                    }
                    if (th == assertionError) {
                        try {
                            this.f78329c.remove(k4);
                            throw this.f78328b.f78311b.a(th);
                        } finally {
                        }
                    }
                    Object put2 = this.f78329c.put(k4, WrappedValues.c(th));
                    if (put2 != n.COMPUTING) {
                        throw f(k4, put2);
                    }
                    throw this.f78328b.f78311b.a(th);
                }
            } finally {
                this.f78328b.f78310a.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class m<K, V> extends l<K, V> implements kotlin.reflect.jvm.internal.impl.storage.g<K, V> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f78331e = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@fg.l f fVar, @fg.l ConcurrentMap<K, Object> concurrentMap, @fg.l ld.l<? super K, ? extends V> lVar) {
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

        private static /* synthetic */ void b(int i4) {
            String s4 = i4 != 3 ? ProtectedSandApp.s("紞\u0001") : ProtectedSandApp.s("紟\u0001");
            Object[] objArr = new Object[i4 != 3 ? 3 : 2];
            String s5 = ProtectedSandApp.s("素\u0001");
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("紣\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("索\u0001");
            } else if (i4 != 3) {
                objArr[0] = ProtectedSandApp.s("紡\u0001");
            } else {
                objArr[0] = s5;
            }
            if (i4 != 3) {
                objArr[1] = s5;
            } else {
                objArr[1] = ProtectedSandApp.s("紤\u0001");
            }
            if (i4 != 3) {
                objArr[2] = ProtectedSandApp.s("紥\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.l, ld.l
        @fg.l
        public V invoke(K k4) {
            V v4 = (V) super.invoke(k4);
            if (v4 == null) {
                b(3);
            }
            return v4;
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
        static final /* synthetic */ boolean f78332c = false;

        /* renamed from: a, reason: collision with root package name */
        private final T f78333a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f78334b;

        private o(T t4, boolean z4) {
            this.f78333a = t4;
            this.f78334b = z4;
        }

        @fg.l
        public static <T> o<T> a() {
            return new o<>(null, true);
        }

        @fg.l
        public static <T> o<T> d(T t4) {
            return new o<>(t4, false);
        }

        public T b() {
            return this.f78333a;
        }

        public boolean c() {
            return this.f78334b;
        }

        public String toString() {
            return c() ? ProtectedSandApp.s("紩\u0001") : String.valueOf(this.f78333a);
        }
    }

    /* synthetic */ f(String str, InterfaceC1189f interfaceC1189f, kotlin.reflect.jvm.internal.impl.storage.k kVar, a aVar) {
        this(str, interfaceC1189f, kVar);
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

    @fg.l
    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fg.l
    public static <T extends Throwable> T q(@fg.l T t4) {
        if (t4 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t4.getStackTrace();
        int length = stackTrace.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (!stackTrace[i4].getClassName().startsWith(f78307d)) {
                break;
            }
            i4++;
        }
        List subList = Arrays.asList(stackTrace).subList(i4, length);
        t4.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @fg.l
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.a<K, V> a() {
        return new d(this, m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @fg.l
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.h<K, V> b(@fg.l ld.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        kotlin.reflect.jvm.internal.impl.storage.h<K, V> o4 = o(lVar, m());
        if (o4 == null) {
            j(20);
        }
        return o4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    public <T> T c(@fg.l ld.a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f78310a.lock();
        try {
            return aVar.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @fg.l
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> d(@fg.l ld.a<? extends T> aVar, @fg.l T t4) {
        if (aVar == null) {
            j(26);
        }
        if (t4 == null) {
            j(27);
        }
        return new b(this, aVar, t4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @fg.l
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> e(@fg.l ld.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        kotlin.reflect.jvm.internal.impl.storage.g<K, V> n4 = n(lVar, m());
        if (n4 == null) {
            j(10);
        }
        return n4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @fg.l
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.b<K, V> f() {
        return new e(this, m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @fg.l
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> g(@fg.l ld.a<? extends T> aVar, ld.l<? super Boolean, ? extends T> lVar, @fg.l ld.l<? super T, k2> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @fg.l
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> h(@fg.l ld.a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @fg.l
    public <T> kotlin.reflect.jvm.internal.impl.storage.j<T> i(@fg.l ld.a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    @fg.l
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> n(@fg.l ld.l<? super K, ? extends V> lVar, @fg.l ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    @fg.l
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.h<K, V> o(@fg.l ld.l<? super K, ? extends V> lVar, @fg.l ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    @fg.l
    protected <K, V> o<V> p(@fg.l String str, K k4) {
        if (str == null) {
            j(35);
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("糊\u0001"));
        sb.append(str);
        sb.append(k4 == null ? "" : androidx.databinding.a.a(ProtectedSandApp.s("糋\u0001"), k4));
        sb.append(ProtectedSandApp.s("糌\u0001"));
        sb.append(this);
        throw ((AssertionError) q(new AssertionError(sb.toString())));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(ProtectedSandApp.s("糍\u0001"));
        sb.append(Integer.toHexString(hashCode()));
        sb.append(ProtectedSandApp.s("糎\u0001"));
        return android.support.v4.media.c.a(sb, this.f78312c, ProtectedSandApp.s("糏\u0001"));
    }

    private f(@fg.l String str, @fg.l InterfaceC1189f interfaceC1189f, @fg.l kotlin.reflect.jvm.internal.impl.storage.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC1189f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f78310a = kVar;
        this.f78311b = interfaceC1189f;
        this.f78312c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (ld.l<InterruptedException, k2>) null);
    }

    public f(String str, @fg.m Runnable runnable, @fg.m ld.l<InterruptedException, k2> lVar) {
        this(str, InterfaceC1189f.f78319a, kotlin.reflect.jvm.internal.impl.storage.k.f78335a.a(runnable, lVar));
    }
}

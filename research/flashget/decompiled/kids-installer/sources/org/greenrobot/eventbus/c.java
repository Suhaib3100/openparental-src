package org.greenrobot.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* compiled from: EventBus.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: t, reason: collision with root package name */
    static volatile c f32127t;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<p>> f32130a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f32131b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f32132c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<d> f32133d;

    /* renamed from: e, reason: collision with root package name */
    private final g f32134e;

    /* renamed from: f, reason: collision with root package name */
    private final k f32135f;

    /* renamed from: g, reason: collision with root package name */
    private final org.greenrobot.eventbus.b f32136g;

    /* renamed from: h, reason: collision with root package name */
    private final org.greenrobot.eventbus.a f32137h;

    /* renamed from: i, reason: collision with root package name */
    private final o f32138i;

    /* renamed from: j, reason: collision with root package name */
    private final ExecutorService f32139j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f32140k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f32141l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f32142m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f32143n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f32144o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f32145p;

    /* renamed from: q, reason: collision with root package name */
    private final int f32146q;

    /* renamed from: r, reason: collision with root package name */
    private final f f32147r;

    /* renamed from: s, reason: collision with root package name */
    public static String f32126s = "EventBus";

    /* renamed from: u, reason: collision with root package name */
    private static final org.greenrobot.eventbus.d f32128u = new org.greenrobot.eventbus.d();

    /* renamed from: v, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f32129v = new HashMap();

    /* compiled from: EventBus.java */
    class a extends ThreadLocal<d> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d initialValue() {
            return new d();
        }
    }

    /* compiled from: EventBus.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32149a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f32149a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32149a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32149a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32149a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32149a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: EventBus.java */
    /* renamed from: org.greenrobot.eventbus.c$c, reason: collision with other inner class name */
    interface InterfaceC0495c {
        void a(List<m> list);
    }

    /* compiled from: EventBus.java */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final List<Object> f32150a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        boolean f32151b;

        /* renamed from: c, reason: collision with root package name */
        boolean f32152c;

        /* renamed from: d, reason: collision with root package name */
        p f32153d;

        /* renamed from: e, reason: collision with root package name */
        Object f32154e;

        /* renamed from: f, reason: collision with root package name */
        boolean f32155f;

        d() {
        }
    }

    public c() {
        this(f32128u);
    }

    private void B(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f32130a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i5 = 0;
            while (i5 < size) {
                p pVar = copyOnWriteArrayList.get(i5);
                if (pVar.f32219a == obj) {
                    pVar.f32221c = false;
                    copyOnWriteArrayList.remove(i5);
                    i5--;
                    size--;
                }
                i5++;
            }
        }
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static org.greenrobot.eventbus.d b() {
        return new org.greenrobot.eventbus.d();
    }

    private void d(p pVar, Object obj) {
        if (obj != null) {
            u(pVar, obj, n());
        }
    }

    public static void e() {
        o.a();
        f32129v.clear();
    }

    public static c f() {
        c cVar = f32127t;
        if (cVar == null) {
            synchronized (c.class) {
                cVar = f32127t;
                if (cVar == null) {
                    cVar = new c();
                    f32127t = cVar;
                }
            }
        }
        return cVar;
    }

    private void j(p pVar, Object obj, Throwable th) {
        if (!(obj instanceof m)) {
            if (this.f32140k) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.f32141l) {
                this.f32147r.b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f32219a.getClass(), th);
            }
            if (this.f32143n) {
                q(new m(this, th, obj, pVar.f32219a));
                return;
            }
            return;
        }
        if (this.f32141l) {
            f fVar = this.f32147r;
            Level level = Level.SEVERE;
            fVar.b(level, "SubscriberExceptionEvent subscriber " + pVar.f32219a.getClass() + " threw an exception", th);
            m mVar = (m) obj;
            this.f32147r.b(level, "Initial event " + mVar.f32185c + " caused exception in " + mVar.f32186d, mVar.f32184b);
        }
    }

    private boolean n() {
        g gVar = this.f32134e;
        return gVar == null || gVar.b();
    }

    private static List<Class<?>> p(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f32129v;
        synchronized (map) {
            List<Class<?>> list2 = map.get(cls);
            list = list2;
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    arrayList.add(cls2);
                    a(arrayList, cls2.getInterfaces());
                }
                f32129v.put(cls, arrayList);
                list = arrayList;
            }
        }
        return list;
    }

    private void r(Object obj, d dVar) throws Error {
        boolean s5;
        Class<?> cls = obj.getClass();
        if (this.f32145p) {
            List<Class<?>> p5 = p(cls);
            int size = p5.size();
            s5 = false;
            for (int i5 = 0; i5 < size; i5++) {
                s5 |= s(obj, dVar, p5.get(i5));
            }
        } else {
            s5 = s(obj, dVar, cls);
        }
        if (s5) {
            return;
        }
        if (this.f32142m) {
            this.f32147r.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f32144o || cls == h.class || cls == m.class) {
            return;
        }
        q(new h(this, obj));
    }

    private boolean s(Object obj, d dVar, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f32130a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<p> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            dVar.f32154e = obj;
            dVar.f32153d = next;
            try {
                u(next, obj, dVar.f32152c);
                if (dVar.f32155f) {
                    return true;
                }
            } finally {
                dVar.f32154e = null;
                dVar.f32153d = null;
                dVar.f32155f = false;
            }
        }
        return true;
    }

    private void u(p pVar, Object obj, boolean z5) {
        int i5 = b.f32149a[pVar.f32220b.f32197b.ordinal()];
        if (i5 == 1) {
            m(pVar, obj);
            return;
        }
        if (i5 == 2) {
            if (z5) {
                m(pVar, obj);
                return;
            } else {
                this.f32135f.a(pVar, obj);
                return;
            }
        }
        if (i5 == 3) {
            k kVar = this.f32135f;
            if (kVar != null) {
                kVar.a(pVar, obj);
                return;
            } else {
                m(pVar, obj);
                return;
            }
        }
        if (i5 == 4) {
            if (z5) {
                this.f32136g.a(pVar, obj);
                return;
            } else {
                m(pVar, obj);
                return;
            }
        }
        if (i5 == 5) {
            this.f32137h.a(pVar, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + pVar.f32220b.f32197b);
        }
    }

    private void z(Object obj, n nVar) {
        Class<?> cls = nVar.f32198c;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f32130a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f32130a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i5 = 0; i5 <= size; i5++) {
            if (i5 == size || nVar.f32199d > copyOnWriteArrayList.get(i5).f32220b.f32199d) {
                copyOnWriteArrayList.add(i5, pVar);
                break;
            }
        }
        List<Class<?>> list = this.f32131b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f32131b.put(obj, list);
        }
        list.add(cls);
        if (nVar.f32200e) {
            if (!this.f32145p) {
                d(pVar, this.f32132c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f32132c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    d(pVar, entry.getValue());
                }
            }
        }
    }

    public synchronized void A(Object obj) {
        List<Class<?>> list = this.f32131b.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                B(obj, it.next());
            }
            this.f32131b.remove(obj);
        } else {
            this.f32147r.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public void c(Object obj) {
        d dVar = this.f32133d.get();
        if (!dVar.f32151b) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new EventBusException("Event may not be null");
        }
        if (dVar.f32154e != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (dVar.f32153d.f32220b.f32197b != ThreadMode.POSTING) {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
        dVar.f32155f = true;
    }

    ExecutorService g() {
        return this.f32139j;
    }

    public f h() {
        return this.f32147r;
    }

    public <T> T i(Class<T> cls) {
        T cast;
        synchronized (this.f32132c) {
            cast = cls.cast(this.f32132c.get(cls));
        }
        return cast;
    }

    public boolean k(Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        List<Class<?>> p5 = p(cls);
        if (p5 != null) {
            int size = p5.size();
            for (int i5 = 0; i5 < size; i5++) {
                Class<?> cls2 = p5.get(i5);
                synchronized (this) {
                    copyOnWriteArrayList = this.f32130a.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    void l(i iVar) {
        Object obj = iVar.f32178a;
        p pVar = iVar.f32179b;
        i.b(iVar);
        if (pVar.f32221c) {
            m(pVar, obj);
        }
    }

    void m(p pVar, Object obj) {
        try {
            pVar.f32220b.f32196a.invoke(pVar.f32219a, obj);
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Unexpected exception", e6);
        } catch (InvocationTargetException e7) {
            j(pVar, obj, e7.getCause());
        }
    }

    public synchronized boolean o(Object obj) {
        return this.f32131b.containsKey(obj);
    }

    public void q(Object obj) {
        d dVar = this.f32133d.get();
        List<Object> list = dVar.f32150a;
        list.add(obj);
        if (dVar.f32151b) {
            return;
        }
        dVar.f32152c = n();
        dVar.f32151b = true;
        if (dVar.f32155f) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                } else {
                    r(list.remove(0), dVar);
                }
            } finally {
                dVar.f32151b = false;
                dVar.f32152c = false;
            }
        }
    }

    public void t(Object obj) {
        synchronized (this.f32132c) {
            this.f32132c.put(obj.getClass(), obj);
        }
        q(obj);
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f32146q + ", eventInheritance=" + this.f32145p + "]";
    }

    public void v(Object obj) {
        if (c5.b.c() && !c5.b.a()) {
            throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
        }
        List<n> b6 = this.f32138i.b(obj.getClass());
        synchronized (this) {
            Iterator<n> it = b6.iterator();
            while (it.hasNext()) {
                z(obj, it.next());
            }
        }
    }

    public void w() {
        synchronized (this.f32132c) {
            this.f32132c.clear();
        }
    }

    public <T> T x(Class<T> cls) {
        T cast;
        synchronized (this.f32132c) {
            cast = cls.cast(this.f32132c.remove(cls));
        }
        return cast;
    }

    public boolean y(Object obj) {
        synchronized (this.f32132c) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.f32132c.get(cls))) {
                return false;
            }
            this.f32132c.remove(cls);
            return true;
        }
    }

    c(org.greenrobot.eventbus.d dVar) {
        this.f32133d = new a();
        this.f32147r = dVar.e();
        this.f32130a = new HashMap();
        this.f32131b = new HashMap();
        this.f32132c = new ConcurrentHashMap();
        g f6 = dVar.f();
        this.f32134e = f6;
        this.f32135f = f6 != null ? f6.a(this) : null;
        this.f32136g = new org.greenrobot.eventbus.b(this);
        this.f32137h = new org.greenrobot.eventbus.a(this);
        List<org.greenrobot.eventbus.meta.d> list = dVar.f32167k;
        this.f32146q = list != null ? list.size() : 0;
        this.f32138i = new o(dVar.f32167k, dVar.f32164h, dVar.f32163g);
        this.f32141l = dVar.f32157a;
        this.f32142m = dVar.f32158b;
        this.f32143n = dVar.f32159c;
        this.f32144o = dVar.f32160d;
        this.f32140k = dVar.f32161e;
        this.f32145p = dVar.f32162f;
        this.f32139j = dVar.f32165i;
    }
}

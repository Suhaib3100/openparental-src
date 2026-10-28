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
/* loaded from: classes6.dex */
public class c {

    /* renamed from: t, reason: collision with root package name */
    static volatile c f86800t;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<p>> f86803a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f86804b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f86805c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<d> f86806d;

    /* renamed from: e, reason: collision with root package name */
    private final g f86807e;

    /* renamed from: f, reason: collision with root package name */
    private final k f86808f;

    /* renamed from: g, reason: collision with root package name */
    private final org.greenrobot.eventbus.b f86809g;

    /* renamed from: h, reason: collision with root package name */
    private final org.greenrobot.eventbus.a f86810h;

    /* renamed from: i, reason: collision with root package name */
    private final o f86811i;

    /* renamed from: j, reason: collision with root package name */
    private final ExecutorService f86812j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f86813k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f86814l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f86815m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f86816n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f86817o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f86818p;

    /* renamed from: q, reason: collision with root package name */
    private final int f86819q;

    /* renamed from: r, reason: collision with root package name */
    private final f f86820r;

    /* renamed from: s, reason: collision with root package name */
    public static String f86799s = "EventBus";

    /* renamed from: u, reason: collision with root package name */
    private static final org.greenrobot.eventbus.d f86801u = new org.greenrobot.eventbus.d();

    /* renamed from: v, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f86802v = new HashMap();

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
        static final /* synthetic */ int[] f86822a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f86822a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86822a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86822a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f86822a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f86822a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: EventBus.java */
    /* renamed from: org.greenrobot.eventbus.c$c, reason: collision with other inner class name */
    interface InterfaceC1344c {
        void a(List<m> list);
    }

    /* compiled from: EventBus.java */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final List<Object> f86823a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        boolean f86824b;

        /* renamed from: c, reason: collision with root package name */
        boolean f86825c;

        /* renamed from: d, reason: collision with root package name */
        p f86826d;

        /* renamed from: e, reason: collision with root package name */
        Object f86827e;

        /* renamed from: f, reason: collision with root package name */
        boolean f86828f;

        d() {
        }
    }

    public c() {
        this(f86801u);
    }

    private void B(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f86803a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i4 = 0;
            while (i4 < size) {
                p pVar = copyOnWriteArrayList.get(i4);
                if (pVar.f86892a == obj) {
                    pVar.f86894c = false;
                    copyOnWriteArrayList.remove(i4);
                    i4--;
                    size--;
                }
                i4++;
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
        f86802v.clear();
    }

    public static c f() {
        c cVar = f86800t;
        if (cVar == null) {
            synchronized (c.class) {
                try {
                    cVar = f86800t;
                    if (cVar == null) {
                        cVar = new c();
                        f86800t = cVar;
                    }
                } finally {
                }
            }
        }
        return cVar;
    }

    private void j(p pVar, Object obj, Throwable th) {
        if (!(obj instanceof m)) {
            if (this.f86813k) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.f86814l) {
                this.f86820r.a(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f86892a.getClass(), th);
            }
            if (this.f86816n) {
                q(new m(this, th, obj, pVar.f86892a));
                return;
            }
            return;
        }
        if (this.f86814l) {
            f fVar = this.f86820r;
            Level level = Level.SEVERE;
            fVar.a(level, "SubscriberExceptionEvent subscriber " + pVar.f86892a.getClass() + " threw an exception", th);
            m mVar = (m) obj;
            this.f86820r.a(level, "Initial event " + mVar.f86858c + " caused exception in " + mVar.f86859d, mVar.f86857b);
        }
    }

    private boolean n() {
        g gVar = this.f86807e;
        return gVar == null || gVar.b();
    }

    private static List<Class<?>> p(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f86802v;
        synchronized (map) {
            try {
                List<Class<?>> list2 = map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList.add(cls2);
                        a(arrayList, cls2.getInterfaces());
                    }
                    f86802v.put(cls, arrayList);
                    list = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    private void r(Object obj, d dVar) throws Error {
        boolean s4;
        Class<?> cls = obj.getClass();
        if (this.f86818p) {
            List<Class<?>> p4 = p(cls);
            int size = p4.size();
            s4 = false;
            for (int i4 = 0; i4 < size; i4++) {
                s4 |= s(obj, dVar, p4.get(i4));
            }
        } else {
            s4 = s(obj, dVar, cls);
        }
        if (s4) {
            return;
        }
        if (this.f86815m) {
            this.f86820r.b(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f86817o || cls == h.class || cls == m.class) {
            return;
        }
        q(new h(this, obj));
    }

    private boolean s(Object obj, d dVar, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f86803a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<p> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            dVar.f86827e = obj;
            dVar.f86826d = next;
            try {
                u(next, obj, dVar.f86825c);
                if (dVar.f86828f) {
                    return true;
                }
            } finally {
                dVar.f86827e = null;
                dVar.f86826d = null;
                dVar.f86828f = false;
            }
        }
        return true;
    }

    private void u(p pVar, Object obj, boolean z4) {
        int i4 = b.f86822a[pVar.f86893b.f86870b.ordinal()];
        if (i4 == 1) {
            m(pVar, obj);
            return;
        }
        if (i4 == 2) {
            if (z4) {
                m(pVar, obj);
                return;
            } else {
                this.f86808f.a(pVar, obj);
                return;
            }
        }
        if (i4 == 3) {
            k kVar = this.f86808f;
            if (kVar != null) {
                kVar.a(pVar, obj);
                return;
            } else {
                m(pVar, obj);
                return;
            }
        }
        if (i4 == 4) {
            if (z4) {
                this.f86809g.a(pVar, obj);
                return;
            } else {
                m(pVar, obj);
                return;
            }
        }
        if (i4 == 5) {
            this.f86810h.a(pVar, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + pVar.f86893b.f86870b);
        }
    }

    private void z(Object obj, n nVar) {
        Class<?> cls = nVar.f86871c;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f86803a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f86803a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i4 = 0; i4 <= size; i4++) {
            if (i4 == size || nVar.f86872d > copyOnWriteArrayList.get(i4).f86893b.f86872d) {
                copyOnWriteArrayList.add(i4, pVar);
                break;
            }
        }
        List<Class<?>> list = this.f86804b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f86804b.put(obj, list);
        }
        list.add(cls);
        if (nVar.f86873e) {
            if (!this.f86818p) {
                d(pVar, this.f86805c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f86805c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    d(pVar, entry.getValue());
                }
            }
        }
    }

    public synchronized void A(Object obj) {
        try {
            List<Class<?>> list = this.f86804b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    B(obj, it.next());
                }
                this.f86804b.remove(obj);
            } else {
                this.f86820r.b(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(Object obj) {
        d dVar = this.f86806d.get();
        if (!dVar.f86824b) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new EventBusException("Event may not be null");
        }
        if (dVar.f86827e != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (dVar.f86826d.f86893b.f86870b != ThreadMode.POSTING) {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
        dVar.f86828f = true;
    }

    ExecutorService g() {
        return this.f86812j;
    }

    public f h() {
        return this.f86820r;
    }

    public <T> T i(Class<T> cls) {
        T cast;
        synchronized (this.f86805c) {
            cast = cls.cast(this.f86805c.get(cls));
        }
        return cast;
    }

    public boolean k(Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        List<Class<?>> p4 = p(cls);
        if (p4 != null) {
            int size = p4.size();
            for (int i4 = 0; i4 < size; i4++) {
                Class<?> cls2 = p4.get(i4);
                synchronized (this) {
                    copyOnWriteArrayList = this.f86803a.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    void l(i iVar) {
        Object obj = iVar.f86851a;
        p pVar = iVar.f86852b;
        i.b(iVar);
        if (pVar.f86894c) {
            m(pVar, obj);
        }
    }

    void m(p pVar, Object obj) {
        try {
            pVar.f86893b.f86869a.invoke(pVar.f86892a, obj);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException("Unexpected exception", e4);
        } catch (InvocationTargetException e5) {
            j(pVar, obj, e5.getCause());
        }
    }

    public synchronized boolean o(Object obj) {
        return this.f86804b.containsKey(obj);
    }

    public void q(Object obj) {
        d dVar = this.f86806d.get();
        List<Object> list = dVar.f86823a;
        list.add(obj);
        if (dVar.f86824b) {
            return;
        }
        dVar.f86825c = n();
        dVar.f86824b = true;
        if (dVar.f86828f) {
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
                dVar.f86824b = false;
                dVar.f86825c = false;
            }
        }
    }

    public void t(Object obj) {
        synchronized (this.f86805c) {
            this.f86805c.put(obj.getClass(), obj);
        }
        q(obj);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventBus[indexCount=");
        sb.append(this.f86819q);
        sb.append(", eventInheritance=");
        return androidx.appcompat.app.h.a(sb, this.f86818p, "]");
    }

    public void v(Object obj) {
        if (dg.b.c() && !dg.b.a()) {
            throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
        }
        List<n> b5 = this.f86811i.b(obj.getClass());
        synchronized (this) {
            try {
                Iterator<n> it = b5.iterator();
                while (it.hasNext()) {
                    z(obj, it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w() {
        synchronized (this.f86805c) {
            this.f86805c.clear();
        }
    }

    public <T> T x(Class<T> cls) {
        T cast;
        synchronized (this.f86805c) {
            cast = cls.cast(this.f86805c.remove(cls));
        }
        return cast;
    }

    public boolean y(Object obj) {
        synchronized (this.f86805c) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.f86805c.get(cls))) {
                    return false;
                }
                this.f86805c.remove(cls);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    c(org.greenrobot.eventbus.d dVar) {
        this.f86806d = new a();
        this.f86820r = dVar.e();
        this.f86803a = new HashMap();
        this.f86804b = new HashMap();
        this.f86805c = new ConcurrentHashMap();
        g f4 = dVar.f();
        this.f86807e = f4;
        this.f86808f = f4 != null ? f4.a(this) : null;
        this.f86809g = new org.greenrobot.eventbus.b(this);
        this.f86810h = new org.greenrobot.eventbus.a(this);
        List<org.greenrobot.eventbus.meta.d> list = dVar.f86840k;
        this.f86819q = list != null ? list.size() : 0;
        this.f86811i = new o(dVar.f86840k, dVar.f86837h, dVar.f86836g);
        this.f86814l = dVar.f86830a;
        this.f86815m = dVar.f86831b;
        this.f86816n = dVar.f86832c;
        this.f86817o = dVar.f86833d;
        this.f86813k = dVar.f86834e;
        this.f86818p = dVar.f86835f;
        this.f86812j = dVar.f86838i;
    }
}

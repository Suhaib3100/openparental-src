package com.tencent.liteav.videobase.frame;

import android.os.SystemClock;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.i;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class a<T extends i> {

    /* renamed from: a, reason: collision with root package name */
    private static final long f72250a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    private final Map<InterfaceC1003a, Deque<T>> f72252c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f72253d = false;

    /* renamed from: e, reason: collision with root package name */
    private final com.tencent.liteav.base.b.a f72254e = new com.tencent.liteav.base.b.a(f72250a);

    /* renamed from: f, reason: collision with root package name */
    private final g<T> f72255f = new g(this) { // from class: com.tencent.liteav.videobase.frame.b

        /* renamed from: a, reason: collision with root package name */
        private final a f72256a;

        {
            this.f72256a = this;
        }

        @Override // com.tencent.liteav.videobase.frame.g
        public final void a(i iVar) {
            a.a(this.f72256a, iVar);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final String f72251b = null;

    /* renamed from: com.tencent.liteav.videobase.frame.a$a, reason: collision with other inner class name */
    public interface InterfaceC1003a {
    }

    protected a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(a aVar, i iVar) {
        if (iVar == 0) {
            return;
        }
        synchronized (aVar.f72252c) {
            try {
                if (aVar.f72253d) {
                    aVar.a((a) iVar);
                    return;
                }
                Deque<T> b5 = aVar.b(aVar.b((a) iVar));
                iVar.updateLastUsedTimestamp(SystemClock.elapsedRealtime());
                b5.addFirst(iVar);
                aVar.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c() {
        T peekLast;
        if (this.f72254e.a()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            synchronized (this.f72252c) {
                try {
                    for (Deque<T> deque : this.f72252c.values()) {
                        while (!deque.isEmpty() && ((peekLast = deque.peekLast()) == null || elapsedRealtime - peekLast.getLastUsedTimestamp() >= f72250a)) {
                            deque.pollLast();
                            arrayList.add(peekLast);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((a<T>) it.next());
            }
        }
    }

    protected abstract T a(g<T> gVar, InterfaceC1003a interfaceC1003a);

    protected abstract void a(T t4);

    protected abstract InterfaceC1003a b(T t4);

    public void b() {
        this.f72253d = true;
        a();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f72253d) {
            return;
        }
        LiteavLog.e(ProtectedSandApp.s("唡\u0001"), ProtectedSandApp.s("唣\u0001"), getClass().getName(), this.f72251b);
    }

    private Deque<T> b(InterfaceC1003a interfaceC1003a) {
        Deque<T> deque = this.f72252c.get(interfaceC1003a);
        if (deque != null) {
            return deque;
        }
        LinkedList linkedList = new LinkedList();
        this.f72252c.put(interfaceC1003a, linkedList);
        return linkedList;
    }

    protected final T a(InterfaceC1003a interfaceC1003a) {
        T removeFirst;
        synchronized (this.f72252c) {
            try {
                Deque<T> b5 = b(interfaceC1003a);
                removeFirst = !b5.isEmpty() ? b5.removeFirst() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        c();
        if (removeFirst == null) {
            removeFirst = a(this.f72255f, interfaceC1003a);
        }
        if (removeFirst.retain() != 1) {
            LiteavLog.e(ProtectedSandApp.s("唡\u0001"), ProtectedSandApp.s("唢\u0001"), removeFirst);
        }
        return removeFirst;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f72252c) {
            try {
                Iterator<Deque<T>> it = this.f72252c.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next());
                }
                this.f72252c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((a<T>) it2.next());
        }
    }
}

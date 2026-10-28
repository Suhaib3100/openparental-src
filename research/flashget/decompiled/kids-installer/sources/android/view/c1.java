package android.view;

import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Map<String, Object> f8511a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final Set<Closeable> f8512b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f8513c;

    public c1() {
        this.f8511a = new HashMap();
        this.f8512b = new LinkedHashSet();
        this.f8513c = false;
    }

    private static void c(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public void a(@o0 Closeable closeable) {
        Set<Closeable> set = this.f8512b;
        if (set != null) {
            synchronized (set) {
                this.f8512b.add(closeable);
            }
        }
    }

    @l0
    final void b() {
        this.f8513c = true;
        Map<String, Object> map = this.f8511a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f8511a.values().iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
        }
        Set<Closeable> set = this.f8512b;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f8512b.iterator();
                while (it2.hasNext()) {
                    c(it2.next());
                }
            }
        }
        e();
    }

    <T> T d(String str) {
        T t5;
        Map<String, Object> map = this.f8511a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t5 = (T) this.f8511a.get(str);
        }
        return t5;
    }

    protected void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T f(String str, T t5) {
        Object obj;
        synchronized (this.f8511a) {
            obj = this.f8511a.get(str);
            if (obj == 0) {
                this.f8511a.put(str, t5);
            }
        }
        if (obj != 0) {
            t5 = obj;
        }
        if (this.f8513c) {
            c(t5);
        }
        return t5;
    }

    public c1(@o0 Closeable... closeableArr) {
        this.f8511a = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f8512b = linkedHashSet;
        this.f8513c = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }
}

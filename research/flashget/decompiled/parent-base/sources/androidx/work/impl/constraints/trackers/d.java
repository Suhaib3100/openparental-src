package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class d<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f36132f = s.f("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    protected final androidx.work.impl.utils.taskexecutor.a f36133a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f36134b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f36135c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Set<androidx.work.impl.constraints.a<T>> f36136d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    T f36137e;

    /* compiled from: ConstraintTracker.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f36138b;

        a(final List val$listenersList) {
            this.f36138b = val$listenersList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f36138b.iterator();
            while (it.hasNext()) {
                ((androidx.work.impl.constraints.a) it.next()).a(d.this.f36137e);
            }
        }
    }

    d(@o0 Context context, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        this.f36134b = context.getApplicationContext();
        this.f36133a = taskExecutor;
    }

    public void a(androidx.work.impl.constraints.a<T> listener) {
        synchronized (this.f36135c) {
            try {
                if (this.f36136d.add(listener)) {
                    if (this.f36136d.size() == 1) {
                        this.f36137e = b();
                        s.c().a(f36132f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f36137e), new Throwable[0]);
                        e();
                    }
                    listener.a(this.f36137e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract T b();

    public void c(androidx.work.impl.constraints.a<T> listener) {
        synchronized (this.f36135c) {
            try {
                if (this.f36136d.remove(listener) && this.f36136d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(T newState) {
        synchronized (this.f36135c) {
            try {
                T t4 = this.f36137e;
                if (t4 != newState && (t4 == null || !t4.equals(newState))) {
                    this.f36137e = newState;
                    this.f36133a.a().execute(new a(new ArrayList(this.f36136d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}

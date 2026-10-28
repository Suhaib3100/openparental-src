package androidx.work;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DelegatingWorkerFactory.java */
/* loaded from: classes3.dex */
public class h extends j0 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f35979c = s.f("DelegatingWkrFctry");

    /* renamed from: b, reason: collision with root package name */
    private final List<j0> f35980b = new CopyOnWriteArrayList();

    @Override // androidx.work.j0
    @q0
    public final ListenableWorker a(@o0 Context appContext, @o0 String workerClassName, @o0 WorkerParameters workerParameters) {
        Iterator<j0> it = this.f35980b.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker a5 = it.next().a(appContext, workerClassName, workerParameters);
                if (a5 != null) {
                    return a5;
                }
            } catch (Throwable th) {
                s.c().b(f35979c, String.format("Unable to instantiate a ListenableWorker (%s)", workerClassName), th);
                throw th;
            }
        }
        return null;
    }

    public final void d(@o0 j0 workerFactory) {
        this.f35980b.add(workerFactory);
    }

    @o0
    @m1
    List<j0> e() {
        return this.f35980b;
    }
}

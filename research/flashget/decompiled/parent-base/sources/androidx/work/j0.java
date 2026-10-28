package androidx.work;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: WorkerFactory.java */
/* loaded from: classes3.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36577a = s.f("WorkerFactory");

    /* compiled from: WorkerFactory.java */
    class a extends j0 {
        a() {
        }

        @Override // androidx.work.j0
        @q0
        public ListenableWorker a(@o0 Context appContext, @o0 String workerClassName, @o0 WorkerParameters workerParameters) {
            return null;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static j0 c() {
        return new a();
    }

    @q0
    public abstract ListenableWorker a(@o0 Context appContext, @o0 String workerClassName, @o0 WorkerParameters workerParameters);

    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public final ListenableWorker b(@o0 Context appContext, @o0 String workerClassName, @o0 WorkerParameters workerParameters) {
        Class cls;
        ListenableWorker a5 = a(appContext, workerClassName, workerParameters);
        if (a5 == null) {
            try {
                cls = Class.forName(workerClassName).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                s.c().b(f36577a, androidx.constraintlayout.core.motion.key.c.a("Invalid class: ", workerClassName), th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a5 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                } catch (Throwable th2) {
                    s.c().b(f36577a, androidx.constraintlayout.core.motion.key.c.a("Could not instantiate ", workerClassName), th2);
                }
            }
        }
        if (a5 == null || !a5.q()) {
            return a5;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), workerClassName));
    }
}

package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.impl.utils.n;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerTaskExecutor.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b implements androidx.work.impl.utils.taskexecutor.a {

    /* renamed from: a, reason: collision with root package name */
    private final n f36535a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f36536b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f36537c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable command) {
            b.this.c(command);
        }
    }

    public b(@o0 Executor backgroundExecutor) {
        this.f36535a = new n(backgroundExecutor);
    }

    @Override // androidx.work.impl.utils.taskexecutor.a
    public Executor a() {
        return this.f36537c;
    }

    @Override // androidx.work.impl.utils.taskexecutor.a
    public void b(Runnable runnable) {
        this.f36535a.execute(runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.a
    public void c(Runnable runnable) {
        this.f36536b.post(runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.a
    @o0
    public n d() {
        return this.f36535a;
    }
}

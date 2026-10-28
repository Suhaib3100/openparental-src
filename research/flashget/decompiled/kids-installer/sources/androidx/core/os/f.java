package androidx.core.os;

import android.os.Handler;
import androidx.annotation.o0;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ExecutorCompat.java */
    private static class a implements Executor {

        /* renamed from: o, reason: collision with root package name */
        private final Handler f4974o;

        a(@o0 Handler handler) {
            handler.getClass();
            this.f4974o = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            Handler handler = this.f4974o;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f4974o + " is shutting down");
        }
    }

    private f() {
    }

    @o0
    public static Executor a(@o0 Handler handler) {
        return new a(handler);
    }
}

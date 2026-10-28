package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat.java */
/* loaded from: classes3.dex */
public final class j {

    /* compiled from: ExecutorCompat.java */
    private static class a implements Executor {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f26510b;

        a(@androidx.annotation.o0 Handler handler) {
            handler.getClass();
            this.f26510b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.o0 Runnable runnable) {
            Handler handler = this.f26510b;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f26510b + " is shutting down");
        }
    }

    private j() {
    }

    @androidx.annotation.o0
    public static Executor a(@androidx.annotation.o0 Handler handler) {
        return new a(handler);
    }
}

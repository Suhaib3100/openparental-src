package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.o0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ProfileInstallerInitializer implements androidx.startup.b<c> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f32728a = 5000;

    @x0(16)
    private static class a {
        private a() {
        }

        @u
        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.m
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j4) {
                    runnable.run();
                }
            });
        }
    }

    @x0(28)
    private static class b {
        private b() {
        }

        @u
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    public static class c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(@o0 final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.l
            @Override // java.lang.Runnable
            public final void run() {
                i.l(context);
            }
        });
    }

    @Override // androidx.startup.b
    @o0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c create(@o0 Context context) {
        e(context.getApplicationContext());
        return new c();
    }

    @Override // androidx.startup.b
    @o0
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.emptyList();
    }

    @x0(16)
    void e(@o0 final Context context) {
        a.c(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.g(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void g(@o0 final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: androidx.profileinstaller.j
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.j(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}

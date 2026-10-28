package bolts;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: BoltsExecutors.java */
/* loaded from: classes3.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final b f36858d = new b();

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f36859a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f36860b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f36861c;

    /* compiled from: BoltsExecutors.java */
    /* renamed from: bolts.b$b, reason: collision with other inner class name */
    private static class ExecutorC0657b implements Executor {

        /* renamed from: c, reason: collision with root package name */
        private static final int f36862c = 15;

        /* renamed from: b, reason: collision with root package name */
        private ThreadLocal<Integer> f36863b;

        private ExecutorC0657b() {
            this.f36863b = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f36863b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f36863b.remove();
            } else {
                this.f36863b.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = this.f36863b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f36863b.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    private b() {
        this.f36859a = !c() ? Executors.newCachedThreadPool() : bolts.a.b();
        this.f36860b = Executors.newSingleThreadScheduledExecutor();
        this.f36861c = new ExecutorC0657b();
    }

    public static ExecutorService a() {
        return f36858d.f36859a;
    }

    static Executor b() {
        return f36858d.f36861c;
    }

    private static boolean c() {
        String property = System.getProperty(ProtectedSandApp.s("Ø"));
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(ProtectedSandApp.s("Ù"));
    }

    static ScheduledExecutorService d() {
        return f36858d.f36860b;
    }
}

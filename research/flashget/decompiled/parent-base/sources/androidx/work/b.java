package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.material3.j4;
import androidx.work.p;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f35917m = 20;

    /* renamed from: a, reason: collision with root package name */
    @o0
    final Executor f35918a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    final Executor f35919b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    final j0 f35920c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    final p f35921d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    final d0 f35922e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    final n f35923f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    final String f35924g;

    /* renamed from: h, reason: collision with root package name */
    final int f35925h;

    /* renamed from: i, reason: collision with root package name */
    final int f35926i;

    /* renamed from: j, reason: collision with root package name */
    final int f35927j;

    /* renamed from: k, reason: collision with root package name */
    final int f35928k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35929l;

    /* compiled from: Configuration.java */
    class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f35930b = new AtomicInteger(0);

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35931c;

        a(final boolean val$isTaskExecutor) {
            this.f35931c = val$isTaskExecutor;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder a5 = j4.a(this.f35931c ? "WM.task-" : "androidx.work-");
            a5.append(this.f35930b.incrementAndGet());
            return new Thread(runnable, a5.toString());
        }
    }

    /* compiled from: Configuration.java */
    public interface c {
        @o0
        b a();
    }

    b(@o0 C0639b builder) {
        Executor executor = builder.f35933a;
        if (executor == null) {
            this.f35918a = a(false);
        } else {
            this.f35918a = executor;
        }
        Executor executor2 = builder.f35936d;
        if (executor2 == null) {
            this.f35929l = true;
            this.f35919b = a(true);
        } else {
            this.f35929l = false;
            this.f35919b = executor2;
        }
        j0 j0Var = builder.f35934b;
        if (j0Var == null) {
            this.f35920c = j0.c();
        } else {
            this.f35920c = j0Var;
        }
        p pVar = builder.f35935c;
        if (pVar == null) {
            this.f35921d = new p.a();
        } else {
            this.f35921d = pVar;
        }
        d0 d0Var = builder.f35937e;
        if (d0Var == null) {
            this.f35922e = new androidx.work.impl.a();
        } else {
            this.f35922e = d0Var;
        }
        this.f35925h = builder.f35940h;
        this.f35926i = builder.f35941i;
        this.f35927j = builder.f35942j;
        this.f35928k = builder.f35943k;
        this.f35923f = builder.f35938f;
        this.f35924g = builder.f35939g;
    }

    @o0
    private Executor a(boolean isTaskExecutor) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(isTaskExecutor));
    }

    @o0
    private ThreadFactory b(boolean isTaskExecutor) {
        return new a(isTaskExecutor);
    }

    @q0
    public String c() {
        return this.f35924g;
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public n d() {
        return this.f35923f;
    }

    @o0
    public Executor e() {
        return this.f35918a;
    }

    @o0
    public p f() {
        return this.f35921d;
    }

    public int g() {
        return this.f35927j;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.g0(from = 20, to = 50)
    public int h() {
        return this.f35928k;
    }

    public int i() {
        return this.f35926i;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public int j() {
        return this.f35925h;
    }

    @o0
    public d0 k() {
        return this.f35922e;
    }

    @o0
    public Executor l() {
        return this.f35919b;
    }

    @o0
    public j0 m() {
        return this.f35920c;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean n() {
        return this.f35929l;
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public static final class C0639b {

        /* renamed from: a, reason: collision with root package name */
        Executor f35933a;

        /* renamed from: b, reason: collision with root package name */
        j0 f35934b;

        /* renamed from: c, reason: collision with root package name */
        p f35935c;

        /* renamed from: d, reason: collision with root package name */
        Executor f35936d;

        /* renamed from: e, reason: collision with root package name */
        d0 f35937e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        n f35938f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        String f35939g;

        /* renamed from: h, reason: collision with root package name */
        int f35940h;

        /* renamed from: i, reason: collision with root package name */
        int f35941i;

        /* renamed from: j, reason: collision with root package name */
        int f35942j;

        /* renamed from: k, reason: collision with root package name */
        int f35943k;

        public C0639b() {
            this.f35940h = 4;
            this.f35941i = 0;
            this.f35942j = Integer.MAX_VALUE;
            this.f35943k = 20;
        }

        @o0
        public b a() {
            return new b(this);
        }

        @o0
        public C0639b b(@o0 String processName) {
            this.f35939g = processName;
            return this;
        }

        @o0
        public C0639b c(@o0 Executor executor) {
            this.f35933a = executor;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP})
        @o0
        public C0639b d(@o0 n exceptionHandler) {
            this.f35938f = exceptionHandler;
            return this;
        }

        @o0
        public C0639b e(@o0 p inputMergerFactory) {
            this.f35935c = inputMergerFactory;
            return this;
        }

        @o0
        public C0639b f(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.f35941i = minJobSchedulerId;
            this.f35942j = maxJobSchedulerId;
            return this;
        }

        @o0
        public C0639b g(int maxSchedulerLimit) {
            if (maxSchedulerLimit < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.f35943k = Math.min(maxSchedulerLimit, 50);
            return this;
        }

        @o0
        public C0639b h(int loggingLevel) {
            this.f35940h = loggingLevel;
            return this;
        }

        @o0
        public C0639b i(@o0 d0 runnableScheduler) {
            this.f35937e = runnableScheduler;
            return this;
        }

        @o0
        public C0639b j(@o0 Executor taskExecutor) {
            this.f35936d = taskExecutor;
            return this;
        }

        @o0
        public C0639b k(@o0 j0 workerFactory) {
            this.f35934b = workerFactory;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP})
        public C0639b(@o0 b configuration) {
            this.f35933a = configuration.f35918a;
            this.f35934b = configuration.f35920c;
            this.f35935c = configuration.f35921d;
            this.f35936d = configuration.f35919b;
            this.f35940h = configuration.f35925h;
            this.f35941i = configuration.f35926i;
            this.f35942j = configuration.f35927j;
            this.f35943k = configuration.f35928k;
            this.f35937e = configuration.f35922e;
            this.f35938f = configuration.f35923f;
            this.f35939g = configuration.f35924g;
        }
    }
}

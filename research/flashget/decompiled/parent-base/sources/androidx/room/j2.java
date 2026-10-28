package androidx.room;

import android.annotation.SuppressLint;
import androidx.room.m0;
import androidx.view.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: RoomTrackingLiveData.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u00101\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\b4\u00105R\u0017\u00108\u001a\u0002028\u0006¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b7\u00105R\u0011\u0010<\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Landroidx/room/j2;", "T", "Landroidx/lifecycle/LiveData;", "Landroidx/room/c2;", "database", "Landroidx/room/j0;", "container", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "", "", "tableNames", "<init>", "(Landroidx/room/c2;Landroidx/room/j0;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "Lkotlin/k2;", "m", "()V", "n", "Landroidx/room/c2;", "w", "()Landroidx/room/c2;", "Landroidx/room/j0;", "o", "Z", "x", "()Z", "p", "Ljava/util/concurrent/Callable;", "u", "()Ljava/util/concurrent/Callable;", "Landroidx/room/m0$c;", "q", "Landroidx/room/m0$c;", "A", "()Landroidx/room/m0$c;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "r", "Ljava/util/concurrent/atomic/AtomicBoolean;", "y", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "s", "v", "computing", "t", "D", "registeredObserver", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "C", "()Ljava/lang/Runnable;", "refreshRunnable", "z", "invalidationRunnable", "Ljava/util/concurrent/Executor;", "B", "()Ljava/util/concurrent/Executor;", "queryExecutor", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class j2<T> extends LiveData<T> {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2 database;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 container;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean inTransaction;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Callable<T> computeFunction;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0.c observer;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicBoolean invalid;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicBoolean computing;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicBoolean registeredObserver;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Runnable refreshRunnable;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Runnable invalidationRunnable;

    /* compiled from: RoomTrackingLiveData.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/j2$a", "Landroidx/room/m0$c;", "", "", "tables", "Lkotlin/k2;", "c", "(Ljava/util/Set;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends m0.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j2<T> f33781b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, j2<T> j2Var) {
            super(strArr);
            this.f33781b = j2Var;
        }

        @Override // androidx.room.m0.c
        public void c(@fg.l Set<String> tables) {
            kotlin.jvm.internal.l0.p(tables, "tables");
            androidx.arch.core.executor.c.h().b(this.f33781b.getInvalidationRunnable());
        }
    }

    public j2(@fg.l c2 database, @fg.l j0 container, boolean z4, @fg.l Callable<T> computeFunction, @fg.l String[] tableNames) {
        kotlin.jvm.internal.l0.p(database, "database");
        kotlin.jvm.internal.l0.p(container, "container");
        kotlin.jvm.internal.l0.p(computeFunction, "computeFunction");
        kotlin.jvm.internal.l0.p(tableNames, "tableNames");
        this.database = database;
        this.container = container;
        this.inTransaction = z4;
        this.computeFunction = computeFunction;
        this.observer = new a(tableNames, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.room.h2
            @Override // java.lang.Runnable
            public final void run() {
                j2.F(j2.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.room.i2
            @Override // java.lang.Runnable
            public final void run() {
                j2.E(j2.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(j2 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        boolean h4 = this$0.h();
        if (this$0.invalid.compareAndSet(false, true) && h4) {
            this$0.B().execute(this$0.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(j2 this$0) {
        boolean z4;
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        if (this$0.registeredObserver.compareAndSet(false, true)) {
            this$0.database.getInvalidationTracker().d(this$0.observer);
        }
        do {
            if (this$0.computing.compareAndSet(false, true)) {
                T t4 = null;
                z4 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        try {
                            t4 = this$0.computeFunction.call();
                            z4 = true;
                        } catch (Exception e4) {
                            throw new RuntimeException("Exception while computing database live data.", e4);
                        }
                    } finally {
                        this$0.computing.set(false);
                    }
                }
                if (z4) {
                    this$0.o(t4);
                }
            } else {
                z4 = false;
            }
            if (!z4) {
                return;
            }
        } while (this$0.invalid.get());
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final m0.c getObserver() {
        return this.observer;
    }

    @fg.l
    public final Executor B() {
        return this.inTransaction ? this.database.getTransactionExecutor() : this.database.getQueryExecutor();
    }

    @fg.l
    /* renamed from: C, reason: from getter */
    public final Runnable getRefreshRunnable() {
        return this.refreshRunnable;
    }

    @fg.l
    /* renamed from: D, reason: from getter */
    public final AtomicBoolean getRegisteredObserver() {
        return this.registeredObserver;
    }

    @Override // androidx.view.LiveData
    protected void m() {
        j0 j0Var = this.container;
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        j0Var.c(this);
        B().execute(this.refreshRunnable);
    }

    @Override // androidx.view.LiveData
    protected void n() {
        j0 j0Var = this.container;
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        j0Var.d(this);
    }

    @fg.l
    public final Callable<T> u() {
        return this.computeFunction;
    }

    @fg.l
    /* renamed from: v, reason: from getter */
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @fg.l
    /* renamed from: w, reason: from getter */
    public final c2 getDatabase() {
        return this.database;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    @fg.l
    /* renamed from: y, reason: from getter */
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @fg.l
    /* renamed from: z, reason: from getter */
    public final Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }
}

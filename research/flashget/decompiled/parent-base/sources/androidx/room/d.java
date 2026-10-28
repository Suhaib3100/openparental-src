package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: AutoCloser.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u000eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001dR\u0014\u0010.\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010/\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b \u0010A\u001a\u0004\b;\u0010\u0016\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010FR\u0014\u0010H\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010I\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010(R\u0011\u0010L\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u0002048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u00107¨\u0006O"}, d2 = {"Landroidx/room/d;", "", "", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Lf3/e;", "delegateOpenHelper", "Lkotlin/k2;", "o", "(Lf3/e;)V", "V", "Lkotlin/Function1;", "Lf3/d;", "block", "g", "(Lld/l;)Ljava/lang/Object;", "n", "()Lf3/d;", "e", "()V", "d", "Ljava/lang/Runnable;", "onAutoClose", "q", "(Ljava/lang/Runnable;)V", "a", "Lf3/e;", "i", "()Lf3/e;", "s", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "c", "Ljava/lang/Runnable;", "k", "()Ljava/lang/Runnable;", "u", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "J", "autoCloseTimeoutInMs", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "l", "()I", "v", "(I)V", "refCount", "h", "j", "()J", "t", "(J)V", "lastDecrementRefCountTimeStamp", "Lf3/d;", "r", "(Lf3/d;)V", "delegateDatabase", "", "Z", "manuallyClosed", "executeAutoCloser", "autoCloser", "p", "()Z", "isActive", "m", "refCountForTest", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAutoCloser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.kt\nandroidx/room/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public f3.e delegateOpenHelper;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Runnable onAutoCloseCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object lock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long autoCloseTimeoutInMs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Executor executor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @androidx.annotation.b0("lock")
    private int refCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @androidx.annotation.b0("lock")
    private long lastDecrementRefCountTimeStamp;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @androidx.annotation.b0("lock")
    private f3.d delegateDatabase;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean manuallyClosed;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Runnable executeAutoCloser;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Runnable autoCloser;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    public static final String f33559n = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    public d(long j4, @fg.l TimeUnit autoCloseTimeUnit, @fg.l Executor autoCloseExecutor) {
        kotlin.jvm.internal.l0.p(autoCloseTimeUnit, "autoCloseTimeUnit");
        kotlin.jvm.internal.l0.p(autoCloseExecutor, "autoCloseExecutor");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = autoCloseTimeUnit.toMillis(j4);
        this.executor = autoCloseExecutor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                d.f(d.this);
            }
        };
        this.autoCloser = new Runnable() { // from class: androidx.room.c
            @Override // java.lang.Runnable
            public final void run() {
                d.c(d.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(d this$0) {
        kotlin.k2 k2Var;
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                if (SystemClock.uptimeMillis() - this$0.lastDecrementRefCountTimeStamp < this$0.autoCloseTimeoutInMs) {
                    return;
                }
                if (this$0.refCount != 0) {
                    return;
                }
                Runnable runnable = this$0.onAutoCloseCallback;
                if (runnable != null) {
                    runnable.run();
                    k2Var = kotlin.k2.f75408a;
                } else {
                    k2Var = null;
                }
                if (k2Var == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                f3.d dVar = this$0.delegateDatabase;
                if (dVar != null && dVar.isOpen()) {
                    dVar.close();
                }
                this$0.delegateDatabase = null;
                kotlin.k2 k2Var2 = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.executor.execute(this$0.autoCloser);
    }

    public final void d() throws IOException {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                f3.d dVar = this.delegateDatabase;
                if (dVar != null) {
                    dVar.close();
                }
                this.delegateDatabase = null;
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.lock) {
            try {
                int i4 = this.refCount;
                if (i4 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i5 = i4 - 1;
                this.refCount = i5;
                if (i5 == 0) {
                    if (this.delegateDatabase == null) {
                        return;
                    } else {
                        this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                    }
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> V g(@fg.l ld.l<? super f3.d, ? extends V> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        try {
            return block.invoke(n());
        } finally {
            e();
        }
    }

    @fg.m
    /* renamed from: h, reason: from getter */
    public final f3.d getDelegateDatabase() {
        return this.delegateDatabase;
    }

    @fg.l
    public final f3.e i() {
        f3.e eVar = this.delegateOpenHelper;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.l0.S("delegateOpenHelper");
        return null;
    }

    /* renamed from: j, reason: from getter */
    public final long getLastDecrementRefCountTimeStamp() {
        return this.lastDecrementRefCountTimeStamp;
    }

    @fg.m
    /* renamed from: k, reason: from getter */
    public final Runnable getOnAutoCloseCallback() {
        return this.onAutoCloseCallback;
    }

    /* renamed from: l, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    @androidx.annotation.m1
    public final int m() {
        int i4;
        synchronized (this.lock) {
            i4 = this.refCount;
        }
        return i4;
    }

    @fg.l
    public final f3.d n() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (this.manuallyClosed) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            f3.d dVar = this.delegateDatabase;
            if (dVar != null && dVar.isOpen()) {
                return dVar;
            }
            f3.d O2 = i().O2();
            this.delegateDatabase = O2;
            return O2;
        }
    }

    public final void o(@fg.l f3.e delegateOpenHelper) {
        kotlin.jvm.internal.l0.p(delegateOpenHelper, "delegateOpenHelper");
        s(delegateOpenHelper);
    }

    public final boolean p() {
        return !this.manuallyClosed;
    }

    public final void q(@fg.l Runnable onAutoClose) {
        kotlin.jvm.internal.l0.p(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void r(@fg.m f3.d dVar) {
        this.delegateDatabase = dVar;
    }

    public final void s(@fg.l f3.e eVar) {
        kotlin.jvm.internal.l0.p(eVar, "<set-?>");
        this.delegateOpenHelper = eVar;
    }

    public final void t(long j4) {
        this.lastDecrementRefCountTimeStamp = j4;
    }

    public final void u(@fg.m Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final void v(int i4) {
        this.refCount = i4;
    }
}

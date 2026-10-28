package androidx.view;

import androidx.annotation.b0;
import androidx.annotation.c1;
import fg.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.a;

/* compiled from: FullyDrawnReporter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0011\u0010&\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Landroidx/activity/z;", "", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "Lkotlin/k2;", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;Lld/a;)V", "f", "()V", "c", "h", "callback", "b", "(Lld/a;)V", "g", "d", "a", "Ljava/util/concurrent/Executor;", "Lld/a;", "Ljava/lang/Object;", "lock", "", "I", "reporterCount", "", "e", "Z", "reportPosted", "reportedFullyDrawn", "", "Ljava/util/List;", "onReportCallbacks", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "reportRunnable", "()Z", "isFullyDrawnReported", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Executor executor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final a<k2> reportFullyDrawn;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Object lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @b0("lock")
    private int reporterCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @b0("lock")
    private boolean reportPosted;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @b0("lock")
    private boolean reportedFullyDrawn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    @b0("lock")
    private final List<a<k2>> onReportCallbacks;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final Runnable reportRunnable;

    public z(@l Executor executor, @l a<k2> reportFullyDrawn) {
        l0.p(executor, "executor");
        l0.p(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.y
            @Override // java.lang.Runnable
            public final void run() {
                z.i(z.this);
            }
        };
    }

    private final void f() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(z this$0) {
        l0.p(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                this$0.reportPosted = false;
                if (this$0.reporterCount == 0 && !this$0.reportedFullyDrawn) {
                    this$0.reportFullyDrawn.invoke();
                    this$0.d();
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(@l a<k2> callback) {
        boolean z4;
        l0.p(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z4 = true;
            } else {
                this.onReportCallbacks.add(callback);
                z4 = false;
            }
        }
        if (z4) {
            callback.invoke();
        }
    }

    public final void c() {
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn) {
                    this.reporterCount++;
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void d() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        boolean z4;
        synchronized (this.lock) {
            z4 = this.reportedFullyDrawn;
        }
        return z4;
    }

    public final void g(@l a<k2> callback) {
        l0.p(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
            k2 k2Var = k2.f75408a;
        }
    }

    public final void h() {
        int i4;
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn && (i4 = this.reporterCount) > 0) {
                    this.reporterCount = i4 - 1;
                    f();
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

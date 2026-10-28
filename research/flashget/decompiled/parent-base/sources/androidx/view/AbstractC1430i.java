package androidx.view;

import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.arch.core.executor.c;
import fg.l;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.f;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ComputableLiveData.kt */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H%¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001a\u0010!\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u0012\u0004\b \u0010\tR\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u0012\u0004\b\"\u0010\t¨\u0006$"}, d2 = {"Landroidx/lifecycle/i;", "T", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/k2;", "j", "()V", "c", "()Ljava/lang/Object;", "a", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "_liveData", "h", "()Landroidx/lifecycle/LiveData;", "liveData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "computing", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "i", "refreshRunnable", "g", "invalidationRunnable", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1430i<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Executor executor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final LiveData<T> _liveData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final LiveData<T> liveData;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicBoolean invalid;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicBoolean computing;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    @f
    public final Runnable refreshRunnable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    @f
    public final Runnable invalidationRunnable;

    /* compiled from: ComputableLiveData.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/lifecycle/i$a", "Landroidx/lifecycle/LiveData;", "Lkotlin/k2;", "m", "()V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.i$a */
    public static final class a extends LiveData<T> {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ AbstractC1430i<T> f30334m;

        a(AbstractC1430i<T> abstractC1430i) {
            this.f30334m = abstractC1430i;
        }

        @Override // androidx.view.LiveData
        protected void m() {
            this.f30334m.getExecutor().execute(this.f30334m.refreshRunnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public AbstractC1430i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @m1
    public static /* synthetic */ void g() {
    }

    @m1
    public static /* synthetic */ void i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(AbstractC1430i this$0) {
        l0.p(this$0, "this$0");
        boolean h4 = this$0.h().h();
        if (this$0.invalid.compareAndSet(false, true) && h4) {
            this$0.executor.execute(this$0.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(AbstractC1430i this$0) {
        l0.p(this$0, "this$0");
        do {
            boolean z4 = false;
            if (this$0.computing.compareAndSet(false, true)) {
                Object obj = null;
                boolean z5 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        obj = this$0.c();
                        z5 = true;
                    } catch (Throwable th) {
                        this$0.computing.set(false);
                        throw th;
                    }
                }
                if (z5) {
                    this$0.h().o(obj);
                }
                this$0.computing.set(false);
                z4 = z5;
            }
            if (!z4) {
                return;
            }
        } while (this$0.invalid.get());
    }

    @n1
    protected abstract T c();

    @l
    /* renamed from: d, reason: from getter */
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @l
    public LiveData<T> h() {
        return this.liveData;
    }

    public void j() {
        c.h().b(this.invalidationRunnable);
    }

    @j
    public AbstractC1430i(@l Executor executor) {
        l0.p(executor, "executor");
        this.executor = executor;
        a aVar = new a(this);
        this._liveData = aVar;
        this.liveData = aVar;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.lifecycle.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1430i.l(AbstractC1430i.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.lifecycle.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1430i.k(AbstractC1430i.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AbstractC1430i(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.w r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.c.g()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.l0.o(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.AbstractC1430i.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.w):void");
    }
}

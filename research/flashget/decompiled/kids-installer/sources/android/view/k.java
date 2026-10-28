package android.view;

import android.annotation.SuppressLint;
import androidx.annotation.l0;
import d5.d;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.y2;

/* compiled from: DispatchQueue.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/k;", "", "Ljava/lang/Runnable;", "runnable", "Lkotlin/m2;", "e", "g", "h", "f", "d", "", "b", "Lkotlin/coroutines/g;", "context", "c", "a", "Z", "paused", "finished", "isDraining", "Ljava/util/Queue;", "Ljava/util/Queue;", "queue", "<init>", "()V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean finished;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isDraining;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean paused = true;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final Queue<Runnable> queue = new ArrayDeque();

    /* compiled from: DispatchQueue.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class a implements Runnable {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Runnable f8593p;

        a(Runnable runnable) {
            this.f8593p = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            k.this.e(this.f8593p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @l0
    public final void e(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        d();
    }

    @l0
    public final boolean b() {
        return this.finished || !this.paused;
    }

    @androidx.annotation.d
    @SuppressLint({"WrongThread"})
    public final void c(@d CoroutineContext context, @d Runnable runnable) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(runnable, "runnable");
        y2 J0 = m1.e().J0();
        if (J0.B0(context) || b()) {
            J0.y0(context, new a(runnable));
        } else {
            e(runnable);
        }
    }

    @l0
    public final void d() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && b()) {
                Runnable poll = this.queue.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    @l0
    public final void f() {
        this.finished = true;
        d();
    }

    @l0
    public final void g() {
        this.paused = true;
    }

    @l0
    public final void h() {
        if (this.paused) {
            if (!(!this.finished)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.paused = false;
            d();
        }
    }
}

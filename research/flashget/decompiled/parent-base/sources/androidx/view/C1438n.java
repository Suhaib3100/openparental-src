package androidx.view;

import androidx.annotation.d;
import fg.l;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.v2;

/* compiled from: DispatchQueue.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/n;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "Lkotlin/k2;", "f", "(Ljava/lang/Runnable;)V", "h", "i", "g", "e", "", "b", "()Z", "Lkotlin/coroutines/g;", "context", "c", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "a", "Z", "paused", "finished", "isDraining", "Ljava/util/Queue;", "d", "Ljava/util/Queue;", "queue", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1438n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean finished;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isDraining;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean paused = true;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final Queue<Runnable> queue = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1438n this$0, Runnable runnable) {
        l0.p(this$0, "this$0");
        l0.p(runnable, "$runnable");
        this$0.f(runnable);
    }

    @androidx.annotation.l0
    private final void f(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        e();
    }

    @androidx.annotation.l0
    public final boolean b() {
        return this.finished || !this.paused;
    }

    @d
    public final void c(@l g context, @l final Runnable runnable) {
        l0.p(context, "context");
        l0.p(runnable, "runnable");
        v2 j12 = j1.e().j1();
        if (j12.c1(context) || b()) {
            j12.S0(context, new Runnable() { // from class: androidx.lifecycle.m
                @Override // java.lang.Runnable
                public final void run() {
                    C1438n.d(C1438n.this, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    @androidx.annotation.l0
    public final void e() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!this.queue.isEmpty() && b()) {
                Runnable poll = this.queue.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    @androidx.annotation.l0
    public final void g() {
        this.finished = true;
        e();
    }

    @androidx.annotation.l0
    public final void h() {
        this.paused = true;
    }

    @androidx.annotation.l0
    public final void i() {
        if (this.paused) {
            if (this.finished) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.paused = false;
            e();
        }
    }
}

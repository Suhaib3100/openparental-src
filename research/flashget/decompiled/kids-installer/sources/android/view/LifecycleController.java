package android.view;

import android.view.t;
import androidx.annotation.l0;
import d5.d;
import kotlin.Metadata;
import kotlinx.coroutines.n2;

/* compiled from: LifecycleController.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\bJ\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "Lkotlinx/coroutines/n2;", "parentJob", "Lkotlin/m2;", "d", "c", "Landroidx/lifecycle/t;", "a", "Landroidx/lifecycle/t;", "lifecycle", "Landroidx/lifecycle/t$c;", "b", "Landroidx/lifecycle/t$c;", "minState", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/k;", "dispatchQueue", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/w;", "observer", "<init>", "(Landroidx/lifecycle/t;Landroidx/lifecycle/t$c;Landroidx/lifecycle/k;Lkotlinx/coroutines/n2;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
@l0
/* loaded from: classes.dex */
public final class LifecycleController {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final t lifecycle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final t.c minState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final k dispatchQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final w observer;

    public LifecycleController(@d t lifecycle, @d t.c minState, @d k dispatchQueue, @d final n2 parentJob) {
        kotlin.jvm.internal.l0.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.l0.p(minState, "minState");
        kotlin.jvm.internal.l0.p(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.l0.p(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        w wVar = new w() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // android.view.w
            public final void h(@d a0 source, @d t.b noName_1) {
                t.c cVar;
                k kVar;
                k kVar2;
                kotlin.jvm.internal.l0.p(source, "source");
                kotlin.jvm.internal.l0.p(noName_1, "$noName_1");
                if (source.getLifecycle().b() == t.c.DESTROYED) {
                    LifecycleController lifecycleController = LifecycleController.this;
                    n2.a.b(parentJob, null, 1, null);
                    lifecycleController.c();
                    return;
                }
                t.c b6 = source.getLifecycle().b();
                cVar = LifecycleController.this.minState;
                if (b6.compareTo(cVar) < 0) {
                    kVar2 = LifecycleController.this.dispatchQueue;
                    kVar2.g();
                } else {
                    kVar = LifecycleController.this.dispatchQueue;
                    kVar.h();
                }
            }
        };
        this.observer = wVar;
        if (lifecycle.b() != t.c.DESTROYED) {
            lifecycle.a(wVar);
        } else {
            n2.a.b(parentJob, null, 1, null);
            c();
        }
    }

    private final void d(n2 n2Var) {
        n2.a.b(n2Var, null, 1, null);
        c();
    }

    @l0
    public final void c() {
        this.lifecycle.c(this.observer);
        this.dispatchQueue.f();
    }
}

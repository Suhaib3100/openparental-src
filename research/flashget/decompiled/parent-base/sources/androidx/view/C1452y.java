package androidx.view;

import androidx.annotation.l0;
import androidx.view.AbstractC1450w;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.k2;

/* compiled from: LifecycleController.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/y;", "", "Landroidx/lifecycle/w;", "lifecycle", "Landroidx/lifecycle/w$b;", "minState", "Landroidx/lifecycle/n;", "dispatchQueue", "Lkotlinx/coroutines/k2;", "parentJob", "<init>", "(Landroidx/lifecycle/w;Landroidx/lifecycle/w$b;Landroidx/lifecycle/n;Lkotlinx/coroutines/k2;)V", "Lkotlin/k2;", "c", "(Lkotlinx/coroutines/k2;)V", "b", "()V", "a", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/w$b;", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/b0;", "d", "Landroidx/lifecycle/b0;", "observer", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@l0
@r1({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1452y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final AbstractC1450w lifecycle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final AbstractC1450w.b minState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final C1438n dispatchQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final InterfaceC1416b0 observer;

    public C1452y(@l AbstractC1450w lifecycle, @l AbstractC1450w.b minState, @l C1438n dispatchQueue, @l final k2 parentJob) {
        kotlin.jvm.internal.l0.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.l0.p(minState, "minState");
        kotlin.jvm.internal.l0.p(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.l0.p(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        InterfaceC1416b0 interfaceC1416b0 = new InterfaceC1416b0() { // from class: androidx.lifecycle.x
            @Override // androidx.view.InterfaceC1416b0
            public final void f(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
                C1452y.d(C1452y.this, parentJob, interfaceC1423e0, aVar);
            }
        };
        this.observer = interfaceC1416b0;
        if (lifecycle.getState() != AbstractC1450w.b.DESTROYED) {
            lifecycle.a(interfaceC1416b0);
        } else {
            k2.a.b(parentJob, null, 1, null);
            b();
        }
    }

    private final void c(k2 parentJob) {
        k2.a.b(parentJob, null, 1, null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1452y this$0, k2 parentJob, InterfaceC1423e0 source, AbstractC1450w.a aVar) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(parentJob, "$parentJob");
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(aVar, "<anonymous parameter 1>");
        if (source.getLifecycle().getState() == AbstractC1450w.b.DESTROYED) {
            k2.a.b(parentJob, null, 1, null);
            this$0.b();
        } else if (source.getLifecycle().getState().compareTo(this$0.minState) < 0) {
            this$0.dispatchQueue.h();
        } else {
            this$0.dispatchQueue.i();
        }
    }

    @l0
    public final void b() {
        this.lifecycle.d(this.observer);
        this.dispatchQueue.g();
    }
}

package androidx.compose.animation.core;

import androidx.compose.runtime.t4;
import kotlin.Metadata;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H ¢\u0006\u0004\b\b\u0010\tR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/g2;", "S", "", "<init>", "()V", "Landroidx/compose/animation/core/e2;", "transition", "Lkotlin/k2;", "e", "(Landroidx/compose/animation/core/e2;)V", "", "<set-?>", "a", "Landroidx/compose/runtime/k2;", "c", "()Z", "d", "(Z)V", "isRunning", "()Ljava/lang/Object;", "currentState", "b", "targetState", "Landroidx/compose/animation/core/h1;", "Landroidx/compose/animation/core/o1;", "Landroidx/compose/animation/core/s1;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 2)
@kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n*L\n107#1:1383\n107#1:1384,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class g2<S> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2728b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isRunning;

    public /* synthetic */ g2(kotlin.jvm.internal.w wVar) {
        this();
    }

    public abstract S a();

    public abstract S b();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void d(boolean z4) {
        this.isRunning.setValue(Boolean.valueOf(z4));
    }

    public abstract void e(@fg.l e2<S> transition);

    private g2() {
        androidx.compose.runtime.k2 g4;
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        this.isRunning = g4;
    }
}

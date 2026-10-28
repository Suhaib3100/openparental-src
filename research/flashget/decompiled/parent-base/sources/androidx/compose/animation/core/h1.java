package androidx.compose.animation.core;

import androidx.compose.runtime.t4;
import kotlin.Metadata;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\t\u0010\nR+\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005R+\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/h1;", "S", "Landroidx/compose/animation/core/g2;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/e2;", "transition", "Lkotlin/k2;", "e", "(Landroidx/compose/animation/core/e2;)V", "<set-?>", "c", "Landroidx/compose/runtime/k2;", "a", "()Ljava/lang/Object;", "g", "currentState", "d", "b", "h", "targetState", "", "f", "()Z", "isIdle", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 2)
@kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n81#2:1386\n107#2,2:1387\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n145#1:1383\n145#1:1384,2\n157#1:1386\n157#1:1387,2\n*E\n"})
/* loaded from: classes.dex */
public final class h1<S> extends g2<S> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2734e = 0;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 currentState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 targetState;

    public h1(S s4) {
        super(null);
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        g4 = t4.g(s4, null, 2, null);
        this.currentState = g4;
        g5 = t4.g(s4, null, 2, null);
        this.targetState = g5;
    }

    @Override // androidx.compose.animation.core.g2
    public S a() {
        return (S) this.currentState.getValue();
    }

    @Override // androidx.compose.animation.core.g2
    public S b() {
        return (S) this.targetState.getValue();
    }

    @Override // androidx.compose.animation.core.g2
    public void e(@fg.l e2<S> transition) {
    }

    public final boolean f() {
        return kotlin.jvm.internal.l0.g(this.currentState.getValue(), this.targetState.getValue()) && !c();
    }

    public void g(S s4) {
        this.currentState.setValue(s4);
    }

    public void h(S s4) {
        this.targetState.setValue(s4);
    }
}

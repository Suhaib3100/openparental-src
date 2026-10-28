package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SwipeToDismissBox.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\r*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/SwipeToDismissAnchorsElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/material3/y9;", "Landroidx/compose/material3/ba;", "state", "", "enableDismissFromStartToEnd", "enableDismissFromEndToStart", "<init>", "(Landroidx/compose/material3/ba;ZZ)V", "s", "()Landroidx/compose/material3/y9;", "node", "Lkotlin/k2;", "u", "(Landroidx/compose/material3/y9;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/material3/ba;", "e", "Z", "f", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissAnchorsElement\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,480:1\n135#2:481\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissAnchorsElement\n*L\n427#1:481\n*E\n"})
/* loaded from: classes.dex */
final class SwipeToDismissAnchorsElement extends androidx.compose.ui.node.y0<y9> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ba state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enableDismissFromStartToEnd;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enableDismissFromEndToStart;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissAnchorsElement\n*L\n1#1,170:1\n428#2,4:171\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {
        public a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.getProperties().c("state", SwipeToDismissAnchorsElement.this.state);
            androidx.compose.foundation.h0.a(SwipeToDismissAnchorsElement.this.enableDismissFromStartToEnd, a2Var.getProperties(), "enableDismissFromStartToEnd", a2Var).c("enableDismissFromEndToStart", Boolean.valueOf(SwipeToDismissAnchorsElement.this.enableDismissFromEndToStart));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    public SwipeToDismissAnchorsElement(@fg.l ba baVar, boolean z4, boolean z5) {
        this.state = baVar;
        this.enableDismissFromStartToEnd = z4;
        this.enableDismissFromEndToStart = z5;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        kotlin.jvm.internal.l0.n(other, "null cannot be cast to non-null type androidx.compose.material3.SwipeToDismissAnchorsElement");
        SwipeToDismissAnchorsElement swipeToDismissAnchorsElement = (SwipeToDismissAnchorsElement) other;
        return kotlin.jvm.internal.l0.g(this.state, swipeToDismissAnchorsElement.state) && this.enableDismissFromStartToEnd == swipeToDismissAnchorsElement.enableDismissFromStartToEnd && this.enableDismissFromEndToStart == swipeToDismissAnchorsElement.enableDismissFromEndToStart;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.enableDismissFromEndToStart) + androidx.compose.animation.d1.a(this.enableDismissFromStartToEnd, this.state.hashCode() * 31, 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        if (androidx.compose.ui.platform.y1.e()) {
            new a();
        } else {
            androidx.compose.ui.platform.y1.b();
        }
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public y9 i() {
        return new y9(this.state, this.enableDismissFromStartToEnd, this.enableDismissFromEndToStart);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l y9 node) {
        node.D7(this.state);
        node.C7(this.enableDismissFromStartToEnd);
        node.B7(this.enableDismissFromEndToStart);
    }
}

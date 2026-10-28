package androidx.compose.animation;

import kotlin.Metadata;

/* compiled from: AnimationModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ!\u0010\r\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\nJ!\u0010\u000e\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/compose/animation/q0;", "Landroidx/compose/ui/layout/b0;", "<init>", "()V", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "measurable", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "width", "G", "V", "p", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class q0 implements androidx.compose.ui.layout.b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f3350b = 0;

    @Override // androidx.compose.ui.layout.b0
    public final int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return pVar.Z(i4);
    }

    @Override // androidx.compose.ui.layout.b0
    public final int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return pVar.k0(i4);
    }

    @Override // androidx.compose.ui.layout.b0
    public final int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return pVar.l0(i4);
    }

    @Override // androidx.compose.ui.layout.b0
    public final int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return pVar.t(i4);
    }
}

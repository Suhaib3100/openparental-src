package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/q1;", "Landroidx/compose/ui/draw/k;", "Landroidx/compose/foundation/o1;", "indicationInstance", "<init>", "(Landroidx/compose/foundation/o1;)V", "Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "b", "Landroidx/compose/foundation/o1;", "()Landroidx/compose/foundation/o1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class q1 implements androidx.compose.ui.draw.k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o1 indicationInstance;

    public q1(@fg.l o1 o1Var) {
        this.indicationInstance = o1Var;
    }

    @Override // androidx.compose.ui.draw.k
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        this.indicationInstance.a(cVar);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final o1 getIndicationInstance() {
        return this.indicationInstance;
    }
}

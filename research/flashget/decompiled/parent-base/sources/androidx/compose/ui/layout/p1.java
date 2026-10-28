package androidx.compose.ui.layout;

import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: MeasureScope.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/p1;", "Landroidx/compose/ui/layout/i1$a;", "", "parentWidth", "Landroidx/compose/ui/unit/w;", "parentLayoutDirection", "<init>", "(ILandroidx/compose/ui/unit/w;)V", "b", "I", "e", "()I", "c", "Landroidx/compose/ui/unit/w;", "d", "()Landroidx/compose/ui/unit/w;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class p1 extends i1.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parentWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.w parentLayoutDirection;

    public p1(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
        this.parentWidth = i4;
        this.parentLayoutDirection = wVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i1.a
    @fg.l
    /* renamed from: d, reason: from getter */
    public androidx.compose.ui.unit.w getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i1.a
    /* renamed from: e, reason: from getter */
    public int getParentWidth() {
        return this.parentWidth;
    }
}

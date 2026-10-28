package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;

/* compiled from: DrawContext.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\"\u0010\u0007\u001a\u00020\u00028&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "", "Li0/n;", "e", "()J", "j", "(J)V", "size", "Landroidx/compose/ui/graphics/v1;", "<anonymous parameter 0>", "i", "()Landroidx/compose/ui/graphics/v1;", "k", "(Landroidx/compose/ui/graphics/v1;)V", "canvas", "Landroidx/compose/ui/graphics/drawscope/j;", "h", "()Landroidx/compose/ui/graphics/drawscope/j;", "transform", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "a", "(Landroidx/compose/ui/unit/w;)V", "layoutDirection", "Landroidx/compose/ui/unit/d;", "b", "()Landroidx/compose/ui/unit/d;", "g", "(Landroidx/compose/ui/unit/d;)V", "density", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d {
    default void a(@fg.l w wVar) {
    }

    @fg.l
    default androidx.compose.ui.unit.d b() {
        return e.a();
    }

    long e();

    default void g(@fg.l androidx.compose.ui.unit.d dVar) {
    }

    @fg.l
    default w getLayoutDirection() {
        return w.Ltr;
    }

    @fg.l
    /* renamed from: h */
    j getTransform();

    @fg.l
    default v1 i() {
        return new l();
    }

    void j(long j4);

    default void k(@fg.l v1 v1Var) {
    }
}

package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.u;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DrawModifier.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\"\b\u0000\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR3\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/draw/m;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "Lkotlin/u;", "block", "<init>", "(Lld/l;)V", "a", "Lld/l;", "()Lld/l;", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final int f17447b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> block;

    public m(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> lVar) {
        this.block = lVar;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.graphics.drawscope.c, k2> a() {
        return this.block;
    }

    public final void b(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> lVar) {
        this.block = lVar;
    }
}

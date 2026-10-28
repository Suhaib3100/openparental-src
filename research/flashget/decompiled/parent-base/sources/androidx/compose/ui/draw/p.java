package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.e2;
import kotlin.Metadata;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/graphics/painter/e;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/layout/f;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/painter/e;ZLandroidx/compose/ui/c;Landroidx/compose/ui/layout/f;FLandroidx/compose/ui/graphics/e2;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.graphics.painter.e eVar, boolean z4, @fg.l androidx.compose.ui.c cVar, @fg.l androidx.compose.ui.layout.f fVar, float f4, @fg.m e2 e2Var) {
        return qVar.w3(new PainterElement(eVar, z4, cVar, fVar, f4, e2Var));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.painter.e eVar, boolean z4, androidx.compose.ui.c cVar, androidx.compose.ui.layout.f fVar, float f4, e2 e2Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        boolean z5 = z4;
        if ((i4 & 4) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.i();
        }
        androidx.compose.ui.c cVar2 = cVar;
        if ((i4 & 8) != 0) {
            fVar = androidx.compose.ui.layout.f.INSTANCE.k();
        }
        androidx.compose.ui.layout.f fVar2 = fVar;
        if ((i4 & 16) != 0) {
            f4 = 1.0f;
        }
        float f5 = f4;
        if ((i4 & 32) != 0) {
            e2Var = null;
        }
        return a(qVar, eVar, z5, cVar2, fVar2, f5, e2Var);
    }
}

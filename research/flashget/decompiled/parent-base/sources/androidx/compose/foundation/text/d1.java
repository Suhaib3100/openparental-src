package androidx.compose.foundation.text;

import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TextLayoutHelper.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ar\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/n0;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/t;", "overflow", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/b;", "constraints", "a", "(Landroidx/compose/ui/text/n0;Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Ljava/util/List;IZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/font/y$b;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d1 {
    public static final boolean a(@fg.l androidx.compose.ui.text.n0 n0Var, @fg.l androidx.compose.ui.text.e eVar, @fg.l androidx.compose.ui.text.v0 v0Var, @fg.l List<e.b<androidx.compose.ui.text.a0>> list, int i4, boolean z4, int i5, @fg.l androidx.compose.ui.unit.d dVar, @fg.l androidx.compose.ui.unit.w wVar, @fg.l y.b bVar, long j4) {
        androidx.compose.ui.text.m0 layoutInput = n0Var.getLayoutInput();
        if (n0Var.getMultiParagraph().getIntrinsics().c() || !kotlin.jvm.internal.l0.g(layoutInput.getText(), eVar) || !layoutInput.getStyle().a0(v0Var) || !kotlin.jvm.internal.l0.g(layoutInput.i(), list) || layoutInput.getMaxLines() != i4 || layoutInput.getSoftWrap() != z4 || !androidx.compose.ui.text.style.t.g(layoutInput.getOverflow(), i5) || !kotlin.jvm.internal.l0.g(layoutInput.getDensity(), dVar) || layoutInput.getLayoutDirection() != wVar || !kotlin.jvm.internal.l0.g(layoutInput.getFontFamilyResolver(), bVar) || androidx.compose.ui.unit.b.r(j4) != androidx.compose.ui.unit.b.r(layoutInput.getConstraints())) {
            return false;
        }
        if (!z4) {
            androidx.compose.ui.text.style.t.INSTANCE.getClass();
            if (!androidx.compose.ui.text.style.t.g(i5, androidx.compose.ui.text.style.t.f21405d)) {
                return true;
            }
        }
        return androidx.compose.ui.unit.b.p(j4) == androidx.compose.ui.unit.b.p(layoutInput.getConstraints()) && androidx.compose.ui.unit.b.o(j4) == androidx.compose.ui.unit.b.o(layoutInput.getConstraints());
    }
}

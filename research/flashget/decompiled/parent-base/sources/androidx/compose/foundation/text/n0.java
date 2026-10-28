package androidx.compose.foundation.text;

import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TextDelegate.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001av\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", "", "a", "(F)I", "Landroidx/compose/foundation/text/m0;", "current", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "", "softWrap", "Landroidx/compose/ui/text/style/t;", "overflow", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "b", "(Landroidx/compose/foundation/text/m0;Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;ZIIILjava/util/List;)Landroidx/compose/foundation/text/m0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {
    public static final int a(float f4) {
        return kotlin.math.b.L0((float) Math.ceil(f4));
    }

    @fg.l
    public static final m0 b(@fg.l m0 m0Var, @fg.l androidx.compose.ui.text.e eVar, @fg.l androidx.compose.ui.text.v0 v0Var, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar, boolean z4, int i4, int i5, int i6, @fg.l List<e.b<androidx.compose.ui.text.a0>> list) {
        if (kotlin.jvm.internal.l0.g(m0Var.getText(), eVar) && kotlin.jvm.internal.l0.g(m0Var.getStyle(), v0Var)) {
            if (m0Var.getSoftWrap() != z4) {
                return new m0(eVar, v0Var, i5, i6, z4, i4, dVar, bVar, list, null);
            }
            if (!androidx.compose.ui.text.style.t.g(m0Var.getOverflow(), i4)) {
                return new m0(eVar, v0Var, i5, i6, z4, i4, dVar, bVar, list, null);
            }
            if (m0Var.getMaxLines() != i5) {
                return new m0(eVar, v0Var, i5, i6, z4, i4, dVar, bVar, list, null);
            }
            if (m0Var.getMinLines() == i6 && kotlin.jvm.internal.l0.g(m0Var.getDensity(), dVar)) {
                if (kotlin.jvm.internal.l0.g(m0Var.k(), list) && m0Var.getFontFamilyResolver() == bVar) {
                    return m0Var;
                }
                return new m0(eVar, v0Var, i5, i6, z4, i4, dVar, bVar, list, null);
            }
            return new m0(eVar, v0Var, i5, i6, z4, i4, dVar, bVar, list, null);
        }
        return new m0(eVar, v0Var, i5, i6, z4, i4, dVar, bVar, list, null);
    }

    public static m0 c(m0 m0Var, androidx.compose.ui.text.e eVar, androidx.compose.ui.text.v0 v0Var, androidx.compose.ui.unit.d dVar, y.b bVar, boolean z4, int i4, int i5, int i6, List list, int i7, Object obj) {
        int i10;
        boolean z5 = (i7 & 32) != 0 ? true : z4;
        if ((i7 & 64) != 0) {
            androidx.compose.ui.text.style.t.INSTANCE.getClass();
            i10 = androidx.compose.ui.text.style.t.f21404c;
        } else {
            i10 = i4;
        }
        return b(m0Var, eVar, v0Var, dVar, bVar, z5, i10, (i7 & 128) != 0 ? Integer.MAX_VALUE : i5, (i7 & 256) != 0 ? 1 : i6, list);
    }
}

package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.text.j0;
import kotlin.Metadata;

/* compiled from: TextForegroundStyle.kt */
@kd.i(name = "TextDrawStyleKt")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/n;", "start", "stop", "", "fraction", "b", "(Landroidx/compose/ui/text/style/n;Landroidx/compose/ui/text/style/n;F)Landroidx/compose/ui/text/style/n;", "Landroidx/compose/ui/graphics/d2;", "alpha", "c", "(JF)J", "Lkotlin/Function0;", "block", "d", "(FLld/a;)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {
    @fg.l
    public static final n b(@fg.l n nVar, @fg.l n nVar2, float f4) {
        boolean z4 = nVar instanceof c;
        return (z4 || (nVar2 instanceof c)) ? (z4 && (nVar2 instanceof c)) ? n.INSTANCE.a((t1) j0.d(((c) nVar).d(), ((c) nVar2).d(), f4), androidx.compose.ui.util.d.a(((c) nVar).g(), ((c) nVar2).g(), f4)) : (n) j0.d(nVar, nVar2, f4) : n.INSTANCE.b(f2.n(nVar.getValue(), nVar2.getValue(), f4));
    }

    public static final long c(long j4, float f4) {
        return (Float.isNaN(f4) || f4 >= 1.0f) ? j4 : d2.w(j4, d2.A(j4) * f4, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f4, ld.a<Float> aVar) {
        return Float.isNaN(f4) ? aVar.invoke().floatValue() : f4;
    }
}

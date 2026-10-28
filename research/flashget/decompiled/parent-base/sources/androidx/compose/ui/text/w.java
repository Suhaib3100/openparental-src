package androidx.compose.ui.text;

import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aY\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "text", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStyles", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/x$b;", "resourceLoader", "Landroidx/compose/ui/text/v;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/x$b;)Landroidx/compose/ui/text/v;", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "b", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;)Landroidx/compose/ui/text/v;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {
    @fg.l
    @kotlin.k(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @kotlin.x0(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    public static final v a(@fg.l String str, @fg.l v0 v0Var, @fg.l List<e.b<i0>> list, @fg.l List<e.b<a0>> list2, @fg.l androidx.compose.ui.unit.d dVar, @fg.l x.b bVar) {
        return new androidx.compose.ui.text.platform.g(str, v0Var, list, list2, androidx.compose.ui.text.font.s.a(bVar), dVar);
    }

    @fg.l
    public static final v b(@fg.l String str, @fg.l v0 v0Var, @fg.l List<e.b<i0>> list, @fg.l List<e.b<a0>> list2, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar) {
        return new androidx.compose.ui.text.platform.g(str, v0Var, list, list2, bVar, dVar);
    }

    public static v c(String str, v0 v0Var, List list, List list2, androidx.compose.ui.unit.d dVar, x.b bVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = kotlin.collections.j0.f74919b;
        }
        List list3 = list;
        if ((i4 & 8) != 0) {
            list2 = kotlin.collections.j0.f74919b;
        }
        return a(str, v0Var, list3, list2, dVar, bVar);
    }

    public static v d(String str, v0 v0Var, List list, List list2, androidx.compose.ui.unit.d dVar, y.b bVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = kotlin.collections.j0.f74919b;
        }
        List list3 = list;
        if ((i4 & 8) != 0) {
            list2 = kotlin.collections.j0.f74919b;
        }
        return new androidx.compose.ui.text.platform.g(str, v0Var, list3, list2, bVar, dVar);
    }
}

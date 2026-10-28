package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.v0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;

/* compiled from: ActualParagraph.android.kt.kt */
@kd.i(name = "AndroidParagraph_androidKt")
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ar\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"", "text", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStyles", "Landroidx/compose/ui/text/a0;", "placeholders", "", "maxLines", "", "ellipsis", "", "width", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/x$b;", "resourceLoader", "Landroidx/compose/ui/text/s;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;IZFLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/x$b;)Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "c", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;)Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/text/v;", "paragraphIntrinsics", "b", "(Landroidx/compose/ui/text/v;IZJ)Landroidx/compose/ui/text/s;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    @fg.l
    @kotlin.k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @x0(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final androidx.compose.ui.text.s a(@fg.l String str, @fg.l v0 v0Var, @fg.l List<e.b<i0>> list, @fg.l List<e.b<androidx.compose.ui.text.a0>> list2, int i4, boolean z4, float f4, @fg.l androidx.compose.ui.unit.d dVar, @fg.l x.b bVar) {
        return new androidx.compose.ui.text.b(new g(str, v0Var, list, list2, androidx.compose.ui.text.font.s.a(bVar), dVar), i4, z4, androidx.compose.ui.unit.c.b(0, androidx.compose.ui.text.x.k(f4), 0, 0, 13, null), null);
    }

    @fg.l
    public static final androidx.compose.ui.text.s b(@fg.l androidx.compose.ui.text.v vVar, int i4, boolean z4, long j4) {
        l0.n(vVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new androidx.compose.ui.text.b((g) vVar, i4, z4, j4, null);
    }

    @fg.l
    public static final androidx.compose.ui.text.s c(@fg.l String str, @fg.l v0 v0Var, @fg.l List<e.b<i0>> list, @fg.l List<e.b<androidx.compose.ui.text.a0>> list2, int i4, boolean z4, long j4, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar) {
        return new androidx.compose.ui.text.b(new g(str, v0Var, list, list2, bVar, dVar), i4, z4, j4, null);
    }
}

package androidx.compose.ui.text;

import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Paragraph.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001aw\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aw\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001ax\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\"\u001a4\u0010#\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010%\u001a\u00020\n*\u00020\u000eH\u0000¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"", "text", "Landroidx/compose/ui/text/v0;", "style", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStyles", "Landroidx/compose/ui/text/a0;", "placeholders", "", "maxLines", "", "ellipsis", "", "width", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/x$b;", "resourceLoader", "Landroidx/compose/ui/text/s;", "c", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;IZFLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/x$b;)Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "b", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;FLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/unit/b;", "constraints", "g", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;JLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/text/v;", "paragraphIntrinsics", "a", "(Landroidx/compose/ui/text/v;IZF)Landroidx/compose/ui/text/s;", "i", "(Landroidx/compose/ui/text/v;JIZ)Landroidx/compose/ui/text/s;", "k", "(F)I", "I", "DefaultMaxLines", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21430a = Integer.MAX_VALUE;

    @fg.l
    @kotlin.k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.x0(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final s a(@fg.l v vVar, int i4, boolean z4, float f4) {
        return androidx.compose.ui.text.platform.i.b(vVar, i4, z4, androidx.compose.ui.unit.c.b(0, k(f4), 0, 0, 13, null));
    }

    @fg.l
    @kotlin.k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.x0(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final s b(@fg.l String str, @fg.l v0 v0Var, float f4, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar, @fg.l List<e.b<i0>> list, @fg.l List<e.b<a0>> list2, int i4, boolean z4) {
        return androidx.compose.ui.text.platform.i.c(str, v0Var, list, list2, i4, z4, androidx.compose.ui.unit.c.b(0, k(f4), 0, 0, 13, null), dVar, bVar);
    }

    @fg.l
    @kotlin.k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @kotlin.x0(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final s c(@fg.l String str, @fg.l v0 v0Var, @fg.l List<e.b<i0>> list, @fg.l List<e.b<a0>> list2, int i4, boolean z4, float f4, @fg.l androidx.compose.ui.unit.d dVar, @fg.l x.b bVar) {
        return androidx.compose.ui.text.platform.i.a(str, v0Var, list, list2, i4, z4, f4, dVar, bVar);
    }

    public static /* synthetic */ s d(v vVar, int i4, boolean z4, float f4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return a(vVar, i4, z4, f4);
    }

    public static s e(String str, v0 v0Var, float f4, androidx.compose.ui.unit.d dVar, y.b bVar, List list, List list2, int i4, boolean z4, int i5, Object obj) {
        return b(str, v0Var, f4, dVar, bVar, (i5 & 32) != 0 ? kotlin.collections.j0.f74919b : list, (i5 & 64) != 0 ? kotlin.collections.j0.f74919b : list2, (i5 & 128) != 0 ? Integer.MAX_VALUE : i4, (i5 & 256) != 0 ? false : z4);
    }

    public static s f(String str, v0 v0Var, List list, List list2, int i4, boolean z4, float f4, androidx.compose.ui.unit.d dVar, x.b bVar, int i5, Object obj) {
        return androidx.compose.ui.text.platform.i.a(str, v0Var, (i5 & 4) != 0 ? kotlin.collections.j0.f74919b : list, (i5 & 8) != 0 ? kotlin.collections.j0.f74919b : list2, (i5 & 16) != 0 ? Integer.MAX_VALUE : i4, (i5 & 32) != 0 ? false : z4, f4, dVar, bVar);
    }

    @fg.l
    public static final s g(@fg.l String str, @fg.l v0 v0Var, long j4, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar, @fg.l List<e.b<i0>> list, @fg.l List<e.b<a0>> list2, int i4, boolean z4) {
        return androidx.compose.ui.text.platform.i.c(str, v0Var, list, list2, i4, z4, j4, dVar, bVar);
    }

    public static s h(String str, v0 v0Var, long j4, androidx.compose.ui.unit.d dVar, y.b bVar, List list, List list2, int i4, boolean z4, int i5, Object obj) {
        return androidx.compose.ui.text.platform.i.c(str, v0Var, (i5 & 32) != 0 ? kotlin.collections.j0.f74919b : list, (i5 & 64) != 0 ? kotlin.collections.j0.f74919b : list2, (i5 & 128) != 0 ? Integer.MAX_VALUE : i4, (i5 & 256) != 0 ? false : z4, j4, dVar, bVar);
    }

    @fg.l
    public static final s i(@fg.l v vVar, long j4, int i4, boolean z4) {
        return androidx.compose.ui.text.platform.i.b(vVar, i4, z4, j4);
    }

    public static s j(v vVar, long j4, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i5 & 8) != 0) {
            z4 = false;
        }
        return androidx.compose.ui.text.platform.i.b(vVar, i4, z4, j4);
    }

    public static final int k(float f4) {
        return (int) Math.ceil(f4);
    }
}

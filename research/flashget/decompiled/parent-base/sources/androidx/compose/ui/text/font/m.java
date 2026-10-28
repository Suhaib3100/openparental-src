package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AndroidTypeface.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/y;", "fontFamily", "", "Lkotlin/q0;", "Landroidx/compose/ui/text/font/o0;", "Landroidx/compose/ui/text/font/k0;", "styles", "Landroidx/compose/ui/text/font/d1;", "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/y;Ljava/util/List;)Landroidx/compose/ui/text/font/d1;", "Landroid/graphics/Typeface;", "typeface", "c", "(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/d1;", "a", "(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/y;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {
    @fg.l
    public static final y a(@fg.l Typeface typeface) {
        return new r0(new androidx.compose.ui.text.platform.q(typeface));
    }

    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @kotlin.x0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final d1 b(@fg.l Context context, @fg.l y yVar, @fg.m List<kotlin.q0<o0, k0>> list) {
        if (yVar instanceof f0) {
            return new androidx.compose.ui.text.platform.c((f0) yVar, context, list, null, 8, null);
        }
        if (yVar instanceof q0) {
            return new androidx.compose.ui.text.platform.d((q0) yVar);
        }
        if (yVar instanceof p) {
            return new androidx.compose.ui.text.platform.b();
        }
        if (yVar instanceof r0) {
            return ((r0) yVar).getTypeface();
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    public static final d1 c(@fg.l Typeface typeface) {
        return new androidx.compose.ui.text.platform.q(typeface);
    }

    public static /* synthetic */ d1 d(Context context, y yVar, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = null;
        }
        return b(context, yVar, list);
    }
}

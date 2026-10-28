package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;

/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/font/x$b;", "fontResourceLoader", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/y$b;", "b", "(Landroidx/compose/ui/text/font/x$b;Landroid/content/Context;)Landroidx/compose/ui/text/font/y$b;", "a", "(Landroidx/compose/ui/text/font/x$b;)Landroidx/compose/ui/text/font/y$b;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {
    @fg.l
    @kotlin.k(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @kotlin.x0(expression = "createFontFamilyResolver()", imports = {}))
    public static final y.b a(@fg.l x.b bVar) {
        return new a0(new r(bVar), null, null, null, null, 30, null);
    }

    @fg.l
    @kotlin.k(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @kotlin.x0(expression = "createFontFamilyResolver()", imports = {}))
    public static final y.b b(@fg.l x.b bVar, @fg.l Context context) {
        return new a0(new q(bVar, context.getApplicationContext()), null, null, null, null, 30, null);
    }
}

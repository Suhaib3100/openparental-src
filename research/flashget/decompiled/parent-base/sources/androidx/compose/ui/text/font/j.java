package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.o0;
import kotlin.Metadata;

/* compiled from: AndroidFontUtils.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0000*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "", "c", "(Landroidx/compose/ui/text/font/o0;I)I", "", "isBold", "isItalic", "b", "(ZZ)I", "Landroidx/compose/ui/text/font/o0$a;", "a", "(Landroidx/compose/ui/text/font/o0$a;)Landroidx/compose/ui/text/font/o0;", "AndroidBold", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {
    @fg.l
    public static final o0 a(@fg.l o0.Companion companion) {
        companion.getClass();
        return o0.f20827j;
    }

    public static final int b(boolean z4, boolean z5) {
        if (z5 && z4) {
            return 3;
        }
        if (z4) {
            return 1;
        }
        return z5 ? 2 : 0;
    }

    public static final int c(@fg.l o0 o0Var, int i4) {
        boolean z4 = o0Var.compareTo(a(o0.INSTANCE)) >= 0;
        k0.INSTANCE.getClass();
        return b(z4, k0.f(i4, k0.f20755d));
    }
}

package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: DeviceFontFamilyNameFont.android.kt */
@kd.i(name = "DeviceFontFamilyNameFontKt")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/t;", "familyName", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "Landroidx/compose/ui/text/font/x;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;)Landroidx/compose/ui/text/font/x;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {
    @fg.l
    public static final x a(@fg.l String str, @fg.l o0 o0Var, int i4, @fg.l n0.e eVar) {
        return new u(str, o0Var, i4, eVar, null);
    }

    public static x b(String str, o0 o0Var, int i4, n0.e eVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i5 & 4) != 0) {
            k0.INSTANCE.getClass();
            i4 = k0.f20754c;
        }
        if ((i5 & 8) != 0) {
            eVar = new n0.e(new n0.a[0]);
        }
        return a(str, o0Var, i4, eVar);
    }
}

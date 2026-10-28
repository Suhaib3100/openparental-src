package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: PlatformTypefaces.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/w0;", "a", "()Landroidx/compose/ui/text/font/w0;", "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "Landroid/content/Context;", "context", "c", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/n0$e;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "name", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "b", "(Ljava/lang/String;Landroidx/compose/ui/text/font/o0;)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a1 {
    @fg.l
    public static final w0 a() {
        return Build.VERSION.SDK_INT >= 28 ? new y0() : new z0();
    }

    @fg.l
    @androidx.annotation.m1
    public static final String b(@fg.l String str, @fg.l o0 o0Var) {
        int u4 = o0Var.u() / 100;
        return (u4 < 0 || u4 >= 2) ? (2 > u4 || u4 >= 4) ? u4 == 4 ? str : u4 == 5 ? androidx.compose.runtime.changelist.j.a(str, "-medium") : ((6 > u4 || u4 >= 8) && 8 <= u4 && u4 < 11) ? androidx.compose.runtime.changelist.j.a(str, "-black") : str : androidx.compose.runtime.changelist.j.a(str, "-light") : androidx.compose.runtime.changelist.j.a(str, "-thin");
    }

    @fg.m
    @androidx.compose.ui.text.k
    public static final Typeface c(@fg.m Typeface typeface, @fg.l n0.e eVar, @fg.l Context context) {
        return Build.VERSION.SDK_INT >= 26 ? o1.f20842a.a(typeface, eVar, context) : typeface;
    }
}

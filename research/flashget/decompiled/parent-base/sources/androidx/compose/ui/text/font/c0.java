package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.b5;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;

/* compiled from: FontFamilyResolver.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0004\u001aD\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/y$b;", "a", "(Landroid/content/Context;)Landroidx/compose/ui/text/font/y$b;", "Lkotlin/coroutines/g;", "coroutineContext", "b", "(Landroid/content/Context;Lkotlin/coroutines/g;)Landroidx/compose/ui/text/font/y$b;", "c", "Landroidx/compose/ui/text/font/y;", "fontFamily", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "Landroidx/compose/runtime/b5;", "Landroid/graphics/Typeface;", "d", "(Landroidx/compose/ui/text/font/y$b;Landroidx/compose/ui/text/font/y;Landroidx/compose/ui/text/font/o0;II)Landroidx/compose/runtime/b5;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 {
    @fg.l
    public static final y.b a(@fg.l Context context) {
        return new a0(new f(context), i.a(context), null, null, null, 28, null);
    }

    @fg.l
    public static final y.b b(@fg.l Context context, @fg.l kotlin.coroutines.g gVar) {
        return new a0(new f(context), i.a(context), b0.b(), new g0(b0.a(), gVar), null, 16, null);
    }

    @androidx.compose.ui.text.l
    @fg.l
    public static final y.b c(@fg.l Context context) {
        return new a0(new f(context), null, new r1(), new g0(new o(), null, 2, null), null, 18, null);
    }

    @fg.l
    public static final b5<Typeface> d(@fg.l y.b bVar, @fg.m y yVar, @fg.l o0 o0Var, int i4, int i5) {
        b5 b5 = bVar.b(yVar, o0Var, i4, i5);
        kotlin.jvm.internal.l0.n(b5, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return b5;
    }

    public static b5 e(y.b bVar, y yVar, o0 o0Var, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            yVar = null;
        }
        if ((i6 & 2) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i6 & 4) != 0) {
            k0.INSTANCE.getClass();
            i4 = k0.f20754c;
        }
        if ((i6 & 8) != 0) {
            l0.INSTANCE.getClass();
            i5 = l0.f20760d;
        }
        return d(bVar, yVar, o0Var, i4, i5);
    }
}

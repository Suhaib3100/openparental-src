package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.font.p1;
import kotlin.Metadata;

/* compiled from: AndroidDefaultTypeface.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@kotlin.k(message = "This path for preloading fonts is not supported")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/platform/b;", "Landroidx/compose/ui/text/platform/o;", "<init>", "()V", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "synthesis", "Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/o0;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/y;", "a", "Landroidx/compose/ui/text/font/y;", "()Landroidx/compose/ui/text/font/y;", "fontFamily", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21230b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.font.y fontFamily;

    public b() {
        androidx.compose.ui.text.font.y.INSTANCE.getClass();
        this.fontFamily = androidx.compose.ui.text.font.y.f20893e;
    }

    @Override // androidx.compose.ui.text.font.d1
    @fg.l
    /* renamed from: a, reason: from getter */
    public androidx.compose.ui.text.font.y getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.o
    @fg.l
    public Typeface b(@fg.l o0 fontWeight, int fontStyle, int synthesis) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.defaultFromStyle(androidx.compose.ui.text.font.j.c(fontWeight, fontStyle));
        }
        p1 p1Var = p1.f20846a;
        Typeface typeface = Typeface.DEFAULT;
        int u4 = fontWeight.u();
        k0.INSTANCE.getClass();
        return p1Var.a(typeface, u4, k0.f(fontStyle, k0.f20755d));
    }
}

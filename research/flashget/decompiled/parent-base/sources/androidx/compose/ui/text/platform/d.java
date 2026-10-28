package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.font.p1;
import androidx.compose.ui.text.font.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AndroidGenericFontFamilyTypeface.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.k(message = "This path for preloading loading fonts is not supported.")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/platform/d;", "Landroidx/compose/ui/text/platform/o;", "Landroidx/compose/ui/text/font/q0;", "fontFamily", "<init>", "(Landroidx/compose/ui/text/font/q0;)V", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "c", "(Landroidx/compose/ui/text/font/o0;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/l0;", "synthesis", "b", "(Landroidx/compose/ui/text/font/o0;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/y;", "a", "Landroidx/compose/ui/text/font/y;", "()Landroidx/compose/ui/text/font/y;", "Landroid/graphics/Typeface;", "nativeTypeface", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21240c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.font.y fontFamily;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Typeface nativeTypeface;

    public d(@fg.l q0 q0Var) {
        this.fontFamily = q0Var;
        Typeface create = Typeface.create(q0Var.getName(), 0);
        l0.m(create);
        this.nativeTypeface = create;
    }

    private final Typeface c(o0 fontWeight, int fontStyle) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(this.nativeTypeface, androidx.compose.ui.text.font.j.c(fontWeight, fontStyle));
        }
        p1 p1Var = p1.f20846a;
        Typeface typeface = this.nativeTypeface;
        int u4 = fontWeight.u();
        k0.INSTANCE.getClass();
        return p1Var.a(typeface, u4, k0.f(fontStyle, k0.f20755d));
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
        return c(fontWeight, fontStyle);
    }
}

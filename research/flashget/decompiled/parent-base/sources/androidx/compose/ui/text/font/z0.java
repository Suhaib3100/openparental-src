package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.n0;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;

/* compiled from: PlatformTypefaces.android.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/font/z0;", "Landroidx/compose/ui/text/font/w0;", "<init>", "()V", "", "familyName", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "Landroid/graphics/Typeface;", "f", "(Ljava/lang/String;Landroidx/compose/ui/text/font/o0;I)Landroid/graphics/Typeface;", "genericFontFamily", "fontWeight", "fontStyle", "d", "b", "(Landroidx/compose/ui/text/font/o0;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/q0;", "name", "a", "(Landroidx/compose/ui/text/font/q0;Landroidx/compose/ui/text/font/o0;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "Landroid/content/Context;", "context", "c", "(Ljava/lang/String;Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.m1
/* loaded from: classes.dex */
final class z0 implements w0 {
    private final Typeface d(String genericFontFamily, o0 fontWeight, int fontStyle) {
        k0.INSTANCE.getClass();
        if (k0.f(fontStyle, k0.f20754c)) {
            o0.INSTANCE.getClass();
            if (kotlin.jvm.internal.l0.g(fontWeight, o0.f20834q) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
                return Typeface.DEFAULT;
            }
        }
        int c5 = j.c(fontWeight, fontStyle);
        return (genericFontFamily == null || genericFontFamily.length() == 0) ? Typeface.defaultFromStyle(c5) : Typeface.create(genericFontFamily, c5);
    }

    static Typeface e(z0 z0Var, String str, o0 o0Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i5 & 4) != 0) {
            k0.INSTANCE.getClass();
            i4 = k0.f20754c;
        }
        return z0Var.d(str, o0Var, i4);
    }

    private final Typeface f(String familyName, o0 weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface d5 = d(familyName, weight, style);
        if (kotlin.jvm.internal.l0.g(d5, Typeface.create(Typeface.DEFAULT, j.c(weight, style))) || kotlin.jvm.internal.l0.g(d5, d(null, weight, style))) {
            return null;
        }
        return d5;
    }

    @Override // androidx.compose.ui.text.font.w0
    @fg.l
    public Typeface a(@fg.l q0 name, @fg.l o0 fontWeight, int fontStyle) {
        Typeface f4 = f(a1.b(name.getName(), fontWeight), fontWeight, fontStyle);
        return f4 == null ? d(name.getName(), fontWeight, fontStyle) : f4;
    }

    @Override // androidx.compose.ui.text.font.w0
    @fg.l
    public Typeface b(@fg.l o0 fontWeight, int fontStyle) {
        return d(null, fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.w0
    @fg.m
    public Typeface c(@fg.l String familyName, @fg.l o0 weight, int style, @fg.l n0.e variationSettings, @fg.l Context context) {
        Typeface f4;
        y.Companion companion = y.INSTANCE;
        companion.getClass();
        if (kotlin.jvm.internal.l0.g(familyName, y.f20894f.getName())) {
            companion.getClass();
            f4 = a(y.f20894f, weight, style);
        } else {
            companion.getClass();
            if (kotlin.jvm.internal.l0.g(familyName, y.f20895g.getName())) {
                companion.getClass();
                f4 = a(y.f20895g, weight, style);
            } else {
                companion.getClass();
                if (kotlin.jvm.internal.l0.g(familyName, y.f20896h.getName())) {
                    companion.getClass();
                    f4 = a(y.f20896h, weight, style);
                } else {
                    companion.getClass();
                    if (kotlin.jvm.internal.l0.g(familyName, y.f20897i.getName())) {
                        companion.getClass();
                        f4 = a(y.f20897i, weight, style);
                    } else {
                        f4 = f(familyName, weight, style);
                    }
                }
            }
        }
        return a1.c(f4, variationSettings, context);
    }
}

package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.c1;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.l0;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.text.y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/e;", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/platform/b0;", "urlSpanCache", "Landroid/text/SpannableString;", "b", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Landroidx/compose/ui/text/platform/b0;)Landroid/text/SpannableString;", "Landroidx/compose/ui/text/i0;", "spanStyle", "", "start", "end", "Lkotlin/k2;", "a", "(Landroid/text/SpannableString;Landroidx/compose/ui/text/i0;IILandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;)V", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,182:1\n33#2,6:183\n33#2,6:189\n33#2,6:195\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n59#1:183,6\n66#1:189,6\n75#1:195,6\n*E\n"})
/* loaded from: classes.dex */
public final class a {
    private static final void a(SpannableString spannableString, i0 i0Var, int i4, int i5, androidx.compose.ui.unit.d dVar, y.b bVar) {
        int i6;
        int i7;
        androidx.compose.ui.text.platform.extensions.d.k(spannableString, i0Var.m(), i4, i5);
        androidx.compose.ui.text.platform.extensions.d.o(spannableString, i0Var.getFontSize(), dVar, i4, i5);
        if (i0Var.getFontWeight() != null || i0Var.getFontStyle() != null) {
            o0 fontWeight = i0Var.getFontWeight();
            if (fontWeight == null) {
                o0.INSTANCE.getClass();
                fontWeight = o0.f20834q;
            }
            k0 fontStyle = i0Var.getFontStyle();
            if (fontStyle != null) {
                i6 = fontStyle.j();
            } else {
                k0.INSTANCE.getClass();
                i6 = k0.f20754c;
            }
            spannableString.setSpan(new StyleSpan(androidx.compose.ui.text.font.j.c(fontWeight, i6)), i4, i5, 33);
        }
        if (i0Var.getFontFamily() != null) {
            if (i0Var.getFontFamily() instanceof q0) {
                spannableString.setSpan(new TypefaceSpan(((q0) i0Var.getFontFamily()).getName()), i4, i5, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                androidx.compose.ui.text.font.y fontFamily = i0Var.getFontFamily();
                l0 fontSynthesis = i0Var.getFontSynthesis();
                if (fontSynthesis != null) {
                    i7 = fontSynthesis.getValue();
                } else {
                    l0.INSTANCE.getClass();
                    i7 = l0.f20760d;
                }
                Object value = y.b.c(bVar, fontFamily, null, 0, i7, 6, null).getValue();
                kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(r.f21275a.a((Typeface) value), i4, i5, 33);
            }
        }
        if (i0Var.getBackground() != null) {
            androidx.compose.ui.text.style.k background = i0Var.getBackground();
            k.Companion companion = androidx.compose.ui.text.style.k.INSTANCE;
            companion.getClass();
            if (background.d(androidx.compose.ui.text.style.k.f21365e)) {
                spannableString.setSpan(new UnderlineSpan(), i4, i5, 33);
            }
            androidx.compose.ui.text.style.k background2 = i0Var.getBackground();
            companion.getClass();
            if (background2.d(androidx.compose.ui.text.style.k.f21366f)) {
                spannableString.setSpan(new StrikethroughSpan(), i4, i5, 33);
            }
        }
        if (i0Var.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(i0Var.getTextGeometricTransform().getScaleX()), i4, i5, 33);
        }
        androidx.compose.ui.text.platform.extensions.d.s(spannableString, i0Var.getLocaleList(), i4, i5);
        androidx.compose.ui.text.platform.extensions.d.h(spannableString, i0Var.getBackground(), i4, i5);
    }

    @androidx.compose.ui.text.l
    @fg.l
    @c1({c1.a.LIBRARY_GROUP})
    public static final SpannableString b(@fg.l androidx.compose.ui.text.e eVar, @fg.l androidx.compose.ui.unit.d dVar, @fg.l y.b bVar, @fg.l b0 b0Var) {
        SpannableString spannableString = new SpannableString(eVar.getText());
        List<e.b<i0>> j4 = eVar.j();
        if (j4 != null) {
            int size = j4.size();
            for (int i4 = 0; i4 < size; i4++) {
                e.b<i0> bVar2 = j4.get(i4);
                a(spannableString, i0.d(bVar2.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), bVar2.getStart(), bVar2.getEnd(), dVar, bVar);
            }
        }
        List<e.b<x0>> n4 = eVar.n(0, eVar.length());
        int size2 = n4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            e.b<x0> bVar3 = n4.get(i5);
            spannableString.setSpan(androidx.compose.ui.text.platform.extensions.f.a(bVar3.a()), bVar3.getStart(), bVar3.getEnd(), 33);
        }
        List<e.b<y0>> o4 = eVar.o(0, eVar.length());
        int size3 = o4.size();
        for (int i6 = 0; i6 < size3; i6++) {
            e.b<y0> bVar4 = o4.get(i6);
            spannableString.setSpan(b0Var.a(bVar4.a()), bVar4.getStart(), bVar4.getEnd(), 33);
        }
        return spannableString;
    }
}

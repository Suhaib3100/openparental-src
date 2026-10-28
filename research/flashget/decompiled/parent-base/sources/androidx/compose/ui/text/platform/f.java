package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.c0;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.f0;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.l0;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.v0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidParagraphHelper.android.kt */
@Metadata(d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001c\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"", "text", "", "contextFontSize", "Landroidx/compose/ui/text/v0;", "contextTextStyle", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStyles", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/unit/d;", "density", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/y;", "Landroidx/compose/ui/text/font/o0;", "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/l0;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "a", "(Ljava/lang/String;FLandroidx/compose/ui/text/v0;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/d;Lld/r;Z)Ljava/lang/CharSequence;", "b", "(Landroidx/compose/ui/text/v0;)Z", "androidx/compose/ui/text/platform/f$a", "Landroidx/compose/ui/text/platform/f$a;", "NoopSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final a f21247a = new a();

    /* compiled from: AndroidParagraphHelper.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/text/platform/f$a", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "Lkotlin/k2;", "updateDrawState", "(Landroid/text/TextPaint;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@fg.m TextPaint p02) {
        }
    }

    @fg.l
    public static final CharSequence a(@fg.l String str, float f4, @fg.l v0 v0Var, @fg.l List<e.b<i0>> list, @fg.l List<e.b<androidx.compose.ui.text.a0>> list2, @fg.l androidx.compose.ui.unit.d dVar, @fg.l ld.r<? super androidx.compose.ui.text.font.y, ? super o0, ? super k0, ? super l0, ? extends Typeface> rVar, boolean z4) {
        CharSequence charSequence;
        if (z4 && androidx.emoji2.text.g.q()) {
            charSequence = androidx.emoji2.text.g.c().x(str);
            kotlin.jvm.internal.l0.m(charSequence);
        } else {
            charSequence = str;
        }
        if (list.isEmpty() && list2.isEmpty()) {
            androidx.compose.ui.text.style.q X = v0Var.X();
            androidx.compose.ui.text.style.q.INSTANCE.getClass();
            if (kotlin.jvm.internal.l0.g(X, androidx.compose.ui.text.style.q.f21389e) && androidx.compose.ui.unit.a0.s(v0Var.I())) {
                return charSequence;
            }
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        androidx.compose.ui.text.style.k S = v0Var.S();
        androidx.compose.ui.text.style.k.INSTANCE.getClass();
        if (kotlin.jvm.internal.l0.g(S, androidx.compose.ui.text.style.k.f21365e)) {
            androidx.compose.ui.text.platform.extensions.d.u(spannableString, f21247a, 0, str.length());
        }
        if (b(v0Var) && v0Var.J() == null) {
            androidx.compose.ui.text.platform.extensions.d.r(spannableString, v0Var.I(), f4, dVar);
        } else {
            androidx.compose.ui.text.style.h J = v0Var.J();
            if (J == null) {
                androidx.compose.ui.text.style.h.INSTANCE.getClass();
                J = androidx.compose.ui.text.style.h.f21336e;
            }
            androidx.compose.ui.text.platform.extensions.d.q(spannableString, v0Var.I(), f4, dVar, J);
        }
        androidx.compose.ui.text.platform.extensions.d.y(spannableString, v0Var.X(), f4, dVar);
        androidx.compose.ui.text.platform.extensions.d.w(spannableString, v0Var, list, dVar, rVar);
        androidx.compose.ui.text.platform.extensions.c.f(spannableString, list2, dVar);
        return spannableString;
    }

    public static final boolean b(@fg.l v0 v0Var) {
        c0 paragraphStyle;
        f0 platformStyle = v0Var.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return false;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}

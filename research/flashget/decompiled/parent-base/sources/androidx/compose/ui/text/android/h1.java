package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextLayout.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0010\u001a\u00020\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 \"\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "j", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Landroidx/compose/ui/text/android/i1;", "a", "(II)J", "Landroidx/compose/ui/text/android/g1;", "k", "(Landroidx/compose/ui/text/android/g1;)J", "", "Ls0/h;", "lineHeightSpans", "h", "(Landroidx/compose/ui/text/android/g1;[Ls0/h;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "Landroid/graphics/Paint$FontMetricsInt;", "g", "(Landroidx/compose/ui/text/android/g1;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Ls0/h;)Landroid/graphics/Paint$FontMetricsInt;", "i", "(Landroidx/compose/ui/text/android/g1;)[Ls0/h;", "Landroid/text/Layout;", "lineIndex", "", "l", "(Landroid/text/Layout;I)Z", "Landroidx/compose/ui/text/android/f1;", "Landroidx/compose/ui/text/android/f1;", "SharedTextAndroidCanvas", "b", "J", "ZeroVerticalPadding", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n+ 2 InlineClassUtils.kt\nandroidx/compose/ui/text/android/InlineClassUtilsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,1031:1\n25#2:1032\n26#3:1033\n26#3:1034\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n*L\n884#1:1032\n1022#1:1033\n1026#1:1034\n*E\n"})
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final f1 f20502a = new f1();

    /* renamed from: b, reason: collision with root package name */
    private static final long f20503b = a(0, 0);

    public static final long a(int i4, int i5) {
        return (i5 & 4294967295L) | (i4 << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt g(g1 g1Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, s0.h[] hVarArr) {
        StaticLayout a5;
        int q4 = g1Var.q() - 1;
        if (g1Var.j().getLineStart(q4) != g1Var.j().getLineEnd(q4)) {
            return null;
        }
        if (hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        s0.h hVar = (s0.h) kotlin.collections.l.Rb(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (q4 == 0 || !hVar.getTrimLastLineBottom()) ? hVar.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        a5 = i0.f20504a.a(spannableString, textPaint, Integer.MAX_VALUE, (r47 & 8) != 0 ? 0 : 0, (r47 & 16) != 0 ? spannableString.length() : spannableString.length(), (r47 & 32) != 0 ? k.f20511a.b() : textDirectionHeuristic, (r47 & 64) != 0 ? k.f20511a.a() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & 256) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & 1024) != 0 ? 1.0f : 0.0f, (r47 & 2048) != 0 ? 0.0f : 0.0f, (r47 & 4096) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : g1Var.i(), (r47 & 16384) != 0 ? true : g1Var.f(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = a5.getLineAscent(0);
        fontMetricsInt.descent = a5.getLineDescent(0);
        fontMetricsInt.top = a5.getLineTop(0);
        fontMetricsInt.bottom = a5.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(g1 g1Var, s0.h[] hVarArr) {
        int i4 = 0;
        int i5 = 0;
        for (s0.h hVar : hVarArr) {
            if (hVar.getFirstAscentDiff() < 0) {
                i4 = Math.max(i4, Math.abs(hVar.getFirstAscentDiff()));
            }
            if (hVar.getLastDescentDiff() < 0) {
                i5 = Math.max(i4, Math.abs(hVar.getLastDescentDiff()));
            }
        }
        return (i4 == 0 && i5 == 0) ? f20503b : a(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0.h[] i(g1 g1Var) {
        if (!(g1Var.N() instanceof Spanned)) {
            return new s0.h[0];
        }
        CharSequence N = g1Var.N();
        kotlin.jvm.internal.l0.n(N, "null cannot be cast to non-null type android.text.Spanned");
        s0.h[] hVarArr = (s0.h[]) ((Spanned) N).getSpans(0, g1Var.N().length(), s0.h.class);
        return hVarArr.length == 0 ? new s0.h[0] : hVarArr;
    }

    @fg.l
    public static final TextDirectionHeuristic j(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(g1 g1Var) {
        if (g1Var.i() || g1Var.Q()) {
            return f20503b;
        }
        TextPaint paint = g1Var.j().getPaint();
        CharSequence text = g1Var.j().getText();
        Rect c5 = u.c(paint, text, g1Var.j().getLineStart(0), g1Var.j().getLineEnd(0));
        int lineAscent = g1Var.j().getLineAscent(0);
        int i4 = c5.top;
        int topPadding = i4 < lineAscent ? lineAscent - i4 : g1Var.j().getTopPadding();
        if (g1Var.q() != 1) {
            int q4 = g1Var.q() - 1;
            c5 = u.c(paint, text, g1Var.j().getLineStart(q4), g1Var.j().getLineEnd(q4));
        }
        int lineDescent = g1Var.j().getLineDescent(g1Var.q() - 1);
        int i5 = c5.bottom;
        int bottomPadding = i5 > lineDescent ? i5 - lineDescent : g1Var.j().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f20503b : a(topPadding, bottomPadding);
    }

    public static final boolean l(@fg.l Layout layout, int i4) {
        return layout.getEllipsisCount(i4) > 0;
    }
}

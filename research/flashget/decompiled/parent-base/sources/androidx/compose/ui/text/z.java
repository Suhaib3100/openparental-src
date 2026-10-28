package androidx.compose.ui.text;

import androidx.compose.runtime.x4;
import androidx.compose.ui.text.style.e;
import androidx.compose.ui.text.style.f;
import androidx.compose.ui.text.style.j;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ParagraphStyle.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001af\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/y;", "start", "stop", "", "fraction", "b", "(Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/y;F)Landroidx/compose/ui/text/y;", "Landroidx/compose/ui/text/c0;", "c", "(Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/c0;F)Landroidx/compose/ui/text/c0;", "style", "Landroidx/compose/ui/unit/w;", "direction", "e", "(Landroidx/compose/ui/text/y;Landroidx/compose/ui/unit/w;)Landroidx/compose/ui/text/y;", "Landroidx/compose/ui/text/style/j;", "textAlign", "Landroidx/compose/ui/text/style/l;", "textDirection", "Landroidx/compose/ui/unit/z;", "lineHeight", "Landroidx/compose/ui/text/style/q;", "textIndent", "platformStyle", "Landroidx/compose/ui/text/style/h;", "lineHeightStyle", "Landroidx/compose/ui/text/style/f;", "lineBreak", "Landroidx/compose/ui/text/style/e;", "hyphens", "Landroidx/compose/ui/text/style/s;", "textMotion", "a", "(Landroidx/compose/ui/text/y;IIJLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/y;", "other", "d", "(Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/c0;)Landroidx/compose/ui/text/c0;", "J", "DefaultLineHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,538:1\n250#2:539\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n500#1:539\n*E\n"})
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final long f21444a;

    static {
        androidx.compose.ui.unit.z.INSTANCE.getClass();
        f21444a = androidx.compose.ui.unit.z.f21534d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0040, code lost:
    
        if (androidx.compose.ui.unit.z.j(r12, r24.getLineHeight()) != false) goto L14;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.y a(@fg.l androidx.compose.ui.text.y r24, int r25, int r26, long r27, @fg.m androidx.compose.ui.text.style.q r29, @fg.m androidx.compose.ui.text.c0 r30, @fg.m androidx.compose.ui.text.style.h r31, int r32, int r33, @fg.m androidx.compose.ui.text.style.s r34) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.z.a(androidx.compose.ui.text.y, int, int, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.c0, androidx.compose.ui.text.style.h, int, int, androidx.compose.ui.text.style.s):androidx.compose.ui.text.y");
    }

    @x4
    @fg.l
    public static final y b(@fg.l y yVar, @fg.l y yVar2, float f4) {
        int value = ((androidx.compose.ui.text.style.j) j0.d(androidx.compose.ui.text.style.j.h(yVar.getTextAlign()), androidx.compose.ui.text.style.j.h(yVar2.getTextAlign()), f4)).getValue();
        int value2 = ((androidx.compose.ui.text.style.l) j0.d(androidx.compose.ui.text.style.l.g(yVar.getTextDirection()), androidx.compose.ui.text.style.l.g(yVar2.getTextDirection()), f4)).getValue();
        long f5 = j0.f(yVar.getLineHeight(), yVar2.getLineHeight(), f4);
        androidx.compose.ui.text.style.q textIndent = yVar.getTextIndent();
        if (textIndent == null) {
            androidx.compose.ui.text.style.q.INSTANCE.getClass();
            textIndent = androidx.compose.ui.text.style.q.f21389e;
        }
        androidx.compose.ui.text.style.q textIndent2 = yVar2.getTextIndent();
        if (textIndent2 == null) {
            androidx.compose.ui.text.style.q.INSTANCE.getClass();
            textIndent2 = androidx.compose.ui.text.style.q.f21389e;
        }
        return new y(value, value2, f5, androidx.compose.ui.text.style.r.a(textIndent, textIndent2, f4), c(yVar.getPlatformStyle(), yVar2.getPlatformStyle(), f4), (androidx.compose.ui.text.style.h) j0.d(yVar.getLineHeightStyle(), yVar2.getLineHeightStyle(), f4), ((androidx.compose.ui.text.style.f) j0.d(androidx.compose.ui.text.style.f.e(yVar.getLineBreak()), androidx.compose.ui.text.style.f.e(yVar2.getLineBreak()), f4)).getMask(), ((androidx.compose.ui.text.style.e) j0.d(androidx.compose.ui.text.style.e.d(yVar.getHyphens()), androidx.compose.ui.text.style.e.d(yVar2.getHyphens()), f4)).getValue(), (androidx.compose.ui.text.style.s) j0.d(yVar.getTextMotion(), yVar2.getTextMotion(), f4), (kotlin.jvm.internal.w) null);
    }

    private static final c0 c(c0 c0Var, c0 c0Var2, float f4) {
        if (c0Var == null && c0Var2 == null) {
            return null;
        }
        if (c0Var == null) {
            c0.INSTANCE.getClass();
            c0Var = c0.f20606e;
        }
        if (c0Var2 == null) {
            c0.INSTANCE.getClass();
            c0Var2 = c0.f20606e;
        }
        return d.b(c0Var, c0Var2, f4);
    }

    private static final c0 d(y yVar, c0 c0Var) {
        if (yVar.getPlatformStyle() == null) {
            return c0Var;
        }
        if (c0Var == null) {
            return yVar.getPlatformStyle();
        }
        yVar.getPlatformStyle().getClass();
        return c0Var;
    }

    @fg.l
    public static final y e(@fg.l y yVar, @fg.l androidx.compose.ui.unit.w wVar) {
        int textAlign;
        int lineBreak;
        int hyphens;
        int textAlign2 = yVar.getTextAlign();
        j.Companion companion = androidx.compose.ui.text.style.j.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.text.style.j.k(textAlign2, androidx.compose.ui.text.style.j.f21360i)) {
            companion.getClass();
            textAlign = androidx.compose.ui.text.style.j.f21358g;
        } else {
            textAlign = yVar.getTextAlign();
        }
        int i4 = textAlign;
        int e4 = w0.e(wVar, yVar.getTextDirection());
        long lineHeight = androidx.compose.ui.unit.a0.s(yVar.getLineHeight()) ? f21444a : yVar.getLineHeight();
        androidx.compose.ui.text.style.q textIndent = yVar.getTextIndent();
        if (textIndent == null) {
            androidx.compose.ui.text.style.q.INSTANCE.getClass();
            textIndent = androidx.compose.ui.text.style.q.f21389e;
        }
        androidx.compose.ui.text.style.q qVar = textIndent;
        c0 platformStyle = yVar.getPlatformStyle();
        androidx.compose.ui.text.style.h lineHeightStyle = yVar.getLineHeightStyle();
        int lineBreak2 = yVar.getLineBreak();
        f.Companion companion2 = androidx.compose.ui.text.style.f.INSTANCE;
        companion2.getClass();
        if (androidx.compose.ui.text.style.f.k(lineBreak2, androidx.compose.ui.text.style.f.f21314f)) {
            companion2.getClass();
            lineBreak = androidx.compose.ui.text.style.f.f21311c;
        } else {
            lineBreak = yVar.getLineBreak();
        }
        int i5 = lineBreak;
        int hyphens2 = yVar.getHyphens();
        e.Companion companion3 = androidx.compose.ui.text.style.e.INSTANCE;
        companion3.getClass();
        if (androidx.compose.ui.text.style.e.g(hyphens2, androidx.compose.ui.text.style.e.f21308e)) {
            companion3.getClass();
            hyphens = androidx.compose.ui.text.style.e.f21306c;
        } else {
            hyphens = yVar.getHyphens();
        }
        int i6 = hyphens;
        androidx.compose.ui.text.style.s textMotion = yVar.getTextMotion();
        if (textMotion == null) {
            androidx.compose.ui.text.style.s.INSTANCE.getClass();
            textMotion = androidx.compose.ui.text.style.s.f21394e;
        }
        return new y(i4, e4, lineHeight, qVar, platformStyle, lineHeightStyle, i5, i6, textMotion, (kotlin.jvm.internal.w) null);
    }
}

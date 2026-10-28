package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.l0;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.style.o;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import fg.l;
import fg.m;
import i0.n;
import kotlin.Metadata;
import ld.r;

/* compiled from: TextPaintExtensions.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/platform/m;", "Landroidx/compose/ui/text/i0;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/y;", "Landroidx/compose/ui/text/font/o0;", "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/l0;", "Landroid/graphics/Typeface;", "resolveTypeface", "Landroidx/compose/ui/unit/d;", "density", "", "requiresLetterSpacing", "a", "(Landroidx/compose/ui/text/platform/m;Landroidx/compose/ui/text/i0;Lld/r;Landroidx/compose/ui/unit/d;Z)Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/unit/z;", "letterSpacing", "Landroidx/compose/ui/graphics/d2;", "background", "Landroidx/compose/ui/text/style/a;", "baselineShift", "d", "(JZJLandroidx/compose/ui/text/style/a;)Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/text/style/s;", "textMotion", "Lkotlin/k2;", "f", "(Landroidx/compose/ui/text/platform/m;Landroidx/compose/ui/text/style/s;)V", "e", "(Landroidx/compose/ui/text/i0;)Z", "", "blurRadius", "c", "(F)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    @m
    public static final i0 a(@l androidx.compose.ui.text.platform.m mVar, @l i0 i0Var, @l r<? super y, ? super o0, ? super k0, ? super l0, ? extends Typeface> rVar, @l androidx.compose.ui.unit.d dVar, boolean z4) {
        int i4;
        int i5;
        long m4 = z.m(i0Var.getFontSize());
        b0.Companion companion = b0.INSTANCE;
        companion.getClass();
        if (b0.g(m4, b0.f21487d)) {
            mVar.setTextSize(dVar.J2(i0Var.getFontSize()));
        } else {
            companion.getClass();
            if (b0.g(m4, b0.f21488e)) {
                mVar.setTextSize(z.n(i0Var.getFontSize()) * mVar.getTextSize());
            }
        }
        if (e(i0Var)) {
            y fontFamily = i0Var.getFontFamily();
            o0 fontWeight = i0Var.getFontWeight();
            if (fontWeight == null) {
                o0.INSTANCE.getClass();
                fontWeight = o0.f20834q;
            }
            k0 fontStyle = i0Var.getFontStyle();
            if (fontStyle != null) {
                i4 = fontStyle.j();
            } else {
                k0.INSTANCE.getClass();
                i4 = k0.f20754c;
            }
            k0 c5 = k0.c(i4);
            l0 fontSynthesis = i0Var.getFontSynthesis();
            if (fontSynthesis != null) {
                i5 = fontSynthesis.getValue();
            } else {
                l0.INSTANCE.getClass();
                i5 = l0.f20760d;
            }
            mVar.setTypeface(rVar.i(fontFamily, fontWeight, c5, l0.e(i5)));
        }
        if (i0Var.getLocaleList() != null && !kotlin.jvm.internal.l0.g(i0Var.getLocaleList(), u0.f.INSTANCE.a())) {
            b.f21243a.b(mVar, i0Var.getLocaleList());
        }
        if (i0Var.getFontFeatureSettings() != null && !kotlin.jvm.internal.l0.g(i0Var.getFontFeatureSettings(), "")) {
            mVar.setFontFeatureSettings(i0Var.getFontFeatureSettings());
        }
        if (i0Var.getTextGeometricTransform() != null) {
            o textGeometricTransform = i0Var.getTextGeometricTransform();
            o.INSTANCE.getClass();
            if (!kotlin.jvm.internal.l0.g(textGeometricTransform, o.f21384e)) {
                mVar.setTextScaleX(i0Var.getTextGeometricTransform().getScaleX() * mVar.getTextScaleX());
                mVar.setTextSkewX(i0Var.getTextGeometricTransform().getSkewX() + mVar.getTextSkewX());
            }
        }
        mVar.h(i0Var.m());
        t1 l4 = i0Var.l();
        n.INSTANCE.getClass();
        mVar.f(l4, n.f74172d, i0Var.i());
        mVar.j(i0Var.getShadow());
        mVar.l(i0Var.getBackground());
        mVar.i(i0Var.getDrawStyle());
        long m5 = z.m(i0Var.getLetterSpacing());
        companion.getClass();
        if (!b0.g(m5, b0.f21487d) || z.n(i0Var.getLetterSpacing()) == 0.0f) {
            long m6 = z.m(i0Var.getLetterSpacing());
            companion.getClass();
            if (b0.g(m6, b0.f21488e)) {
                mVar.setLetterSpacing(z.n(i0Var.getLetterSpacing()));
            }
        } else {
            float textScaleX = mVar.getTextScaleX() * mVar.getTextSize();
            float J2 = dVar.J2(i0Var.getLetterSpacing());
            if (textScaleX != 0.0f) {
                mVar.setLetterSpacing(J2 / textScaleX);
            }
        }
        return d(i0Var.getLetterSpacing(), z4, i0Var.getBackground(), i0Var.getBaselineShift());
    }

    public static /* synthetic */ i0 b(androidx.compose.ui.text.platform.m mVar, i0 i0Var, r rVar, androidx.compose.ui.unit.d dVar, boolean z4, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        return a(mVar, i0Var, rVar, dVar, z4);
    }

    public static final float c(float f4) {
        if (f4 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.ui.text.i0 d(long r32, boolean r34, long r35, androidx.compose.ui.text.style.a r37) {
        /*
            r0 = r35
            r2 = 0
            r3 = 1
            if (r34 == 0) goto L25
            long r4 = androidx.compose.ui.unit.z.m(r32)
            androidx.compose.ui.unit.b0$a r6 = androidx.compose.ui.unit.b0.INSTANCE
            r6.getClass()
            long r6 = androidx.compose.ui.unit.b0.b()
            boolean r4 = androidx.compose.ui.unit.b0.g(r4, r6)
            if (r4 == 0) goto L25
            float r4 = androidx.compose.ui.unit.z.n(r32)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L23
            goto L25
        L23:
            r4 = r3
            goto L26
        L25:
            r4 = r2
        L26:
            androidx.compose.ui.graphics.d2$a r5 = androidx.compose.ui.graphics.d2.INSTANCE
            r5.getClass()
            long r6 = androidx.compose.ui.graphics.d2.k()
            boolean r6 = kotlin.a2.o(r0, r6)
            if (r6 != 0) goto L44
            r5.getClass()
            long r6 = androidx.compose.ui.graphics.d2.j()
            boolean r6 = kotlin.a2.o(r0, r6)
            if (r6 != 0) goto L44
            r6 = r3
            goto L45
        L44:
            r6 = r2
        L45:
            if (r37 == 0) goto L5b
            androidx.compose.ui.text.style.a$a r7 = androidx.compose.ui.text.style.a.INSTANCE
            r7.getClass()
            float r7 = androidx.compose.ui.text.style.a.a()
            float r8 = r37.k()
            boolean r7 = androidx.compose.ui.text.style.a.g(r8, r7)
            if (r7 != 0) goto L5b
            r2 = r3
        L5b:
            r3 = 0
            if (r4 != 0) goto L63
            if (r6 != 0) goto L63
            if (r2 != 0) goto L63
            goto Laa
        L63:
            if (r4 == 0) goto L68
            r19 = r32
            goto L73
        L68:
            androidx.compose.ui.unit.z$a r4 = androidx.compose.ui.unit.z.INSTANCE
            r4.getClass()
            long r7 = androidx.compose.ui.unit.z.b()
            r19 = r7
        L73:
            if (r6 == 0) goto L78
        L75:
            r24 = r0
            goto L80
        L78:
            r5.getClass()
            long r0 = androidx.compose.ui.graphics.d2.k()
            goto L75
        L80:
            if (r2 == 0) goto L85
            r21 = r37
            goto L87
        L85:
            r21 = r3
        L87:
            androidx.compose.ui.text.i0 r3 = new androidx.compose.ui.text.i0
            r9 = r3
            r30 = 63103(0xf67f, float:8.8426E-41)
            r31 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31)
        Laa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.extensions.e.d(long, boolean, long, androidx.compose.ui.text.style.a):androidx.compose.ui.text.i0");
    }

    public static final boolean e(@l i0 i0Var) {
        return (i0Var.getFontFamily() == null && i0Var.getFontStyle() == null && i0Var.getFontWeight() == null) ? false : true;
    }

    public static final void f(@l androidx.compose.ui.text.platform.m mVar, @m s sVar) {
        if (sVar == null) {
            s.INSTANCE.getClass();
            sVar = s.f21394e;
        }
        mVar.setFlags(sVar.getSubpixelTextPositioning() ? mVar.getFlags() | 128 : mVar.getFlags() & (-129));
        int linearity = sVar.getLinearity();
        s.b.Companion companion = s.b.INSTANCE;
        companion.getClass();
        if (s.b.g(linearity, s.b.f21399c)) {
            mVar.setFlags(mVar.getFlags() | 64);
            mVar.setHinting(0);
            return;
        }
        companion.getClass();
        if (s.b.g(linearity, s.b.f21400d)) {
            mVar.getFlags();
            mVar.setHinting(1);
            return;
        }
        companion.getClass();
        if (!s.b.g(linearity, s.b.f21401e)) {
            mVar.getFlags();
        } else {
            mVar.getFlags();
            mVar.setHinting(0);
        }
    }
}

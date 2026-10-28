package androidx.compose.ui.text;

import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.d6;
import androidx.compose.ui.graphics.f2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: SpanStyle.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a*\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aÀ\u0001\u0010\u0002\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u00010\u00102\b\u00104\u001a\u0004\u0018\u000103H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u00105\u001a\u001f\u00107\u001a\u0004\u0018\u00010\u0010*\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u00109\"\u0014\u0010;\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u00109\"\u0014\u0010<\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109\"\u0014\u0010=\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/ui/unit/z;", "a", "b", "", "t", "f", "(JJF)J", "T", "fraction", "d", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/text/i0;", "start", "stop", "c", "(Landroidx/compose/ui/text/i0;Landroidx/compose/ui/text/i0;F)Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/text/d0;", "e", "(Landroidx/compose/ui/text/d0;Landroidx/compose/ui/text/d0;F)Landroidx/compose/ui/text/d0;", "style", "h", "(Landroidx/compose/ui/text/i0;)Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/t1;", "brush", "alpha", "fontSize", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "Landroidx/compose/ui/text/font/y;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/a;", "baselineShift", "Landroidx/compose/ui/text/style/o;", "textGeometricTransform", "Lu0/f;", "localeList", "background", "Landroidx/compose/ui/text/style/k;", "textDecoration", "Landroidx/compose/ui/graphics/c6;", "shadow", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "(Landroidx/compose/ui/text/i0;JLandroidx/compose/ui/graphics/t1;FJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/d0;Landroidx/compose/ui/graphics/drawscope/i;)Landroidx/compose/ui/text/i0;", "other", "g", "(Landroidx/compose/ui/text/i0;Landroidx/compose/ui/text/d0;)Landroidx/compose/ui/text/d0;", "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,951:1\n658#2:952\n646#2:953\n646#2:955\n646#2:957\n658#2:958\n646#2:959\n250#3:954\n250#3:956\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n849#1:952\n849#1:953\n891#1:955\n906#1:957\n938#1:958\n938#1:959\n890#1:954\n896#1:956\n*E\n"})
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f21164a = androidx.compose.ui.unit.a0.m(14);

    /* renamed from: b, reason: collision with root package name */
    private static final long f21165b = androidx.compose.ui.unit.a0.m(0);

    /* renamed from: c, reason: collision with root package name */
    private static final long f21166c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f21167d;

    /* compiled from: SpanStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/style/n;", "a", "()Landroidx/compose/ui/text/style/n;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.text.style.n> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21168b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.style.n invoke() {
            return androidx.compose.ui.text.style.n.INSTANCE.b(j0.f21167d);
        }
    }

    static {
        d2.Companion companion = d2.INSTANCE;
        companion.getClass();
        f21166c = d2.f17777n;
        companion.getClass();
        f21167d = d2.f17766c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (androidx.compose.ui.unit.z.j(r26, r21.getFontSize()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005a, code lost:
    
        if (kotlin.a2.o(r22, r21.getTextForegroundStyle().getValue()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0066, code lost:
    
        if (kotlin.jvm.internal.l0.g(r6, r21.getFontStyle()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0072, code lost:
    
        if (kotlin.jvm.internal.l0.g(r5, r21.getFontWeight()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x007a, code lost:
    
        if (r31 != r21.getFontFamily()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x008c, code lost:
    
        if (androidx.compose.ui.unit.z.j(r33, r21.getLetterSpacing()) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.i0 b(@fg.l androidx.compose.ui.text.i0 r21, long r22, @fg.m androidx.compose.ui.graphics.t1 r24, float r25, long r26, @fg.m androidx.compose.ui.text.font.o0 r28, @fg.m androidx.compose.ui.text.font.k0 r29, @fg.m androidx.compose.ui.text.font.l0 r30, @fg.m androidx.compose.ui.text.font.y r31, @fg.m java.lang.String r32, long r33, @fg.m androidx.compose.ui.text.style.a r35, @fg.m androidx.compose.ui.text.style.o r36, @fg.m u0.f r37, long r38, @fg.m androidx.compose.ui.text.style.k r40, @fg.m androidx.compose.ui.graphics.c6 r41, @fg.m androidx.compose.ui.text.d0 r42, @fg.m androidx.compose.ui.graphics.drawscope.i r43) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.j0.b(androidx.compose.ui.text.i0, long, androidx.compose.ui.graphics.t1, float, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.d0, androidx.compose.ui.graphics.drawscope.i):androidx.compose.ui.text.i0");
    }

    @fg.l
    public static final i0 c(@fg.l i0 i0Var, @fg.l i0 i0Var2, float f4) {
        androidx.compose.ui.text.style.n b5 = androidx.compose.ui.text.style.m.b(i0Var.getTextForegroundStyle(), i0Var2.getTextForegroundStyle(), f4);
        androidx.compose.ui.text.font.y yVar = (androidx.compose.ui.text.font.y) d(i0Var.getFontFamily(), i0Var2.getFontFamily(), f4);
        long f5 = f(i0Var.getFontSize(), i0Var2.getFontSize(), f4);
        androidx.compose.ui.text.font.o0 fontWeight = i0Var.getFontWeight();
        if (fontWeight == null) {
            androidx.compose.ui.text.font.o0.INSTANCE.getClass();
            fontWeight = androidx.compose.ui.text.font.o0.f20834q;
        }
        androidx.compose.ui.text.font.o0 fontWeight2 = i0Var2.getFontWeight();
        if (fontWeight2 == null) {
            androidx.compose.ui.text.font.o0.INSTANCE.getClass();
            fontWeight2 = androidx.compose.ui.text.font.o0.f20834q;
        }
        androidx.compose.ui.text.font.o0 a5 = androidx.compose.ui.text.font.p0.a(fontWeight, fontWeight2, f4);
        androidx.compose.ui.text.font.k0 k0Var = (androidx.compose.ui.text.font.k0) d(i0Var.getFontStyle(), i0Var2.getFontStyle(), f4);
        androidx.compose.ui.text.font.l0 l0Var = (androidx.compose.ui.text.font.l0) d(i0Var.getFontSynthesis(), i0Var2.getFontSynthesis(), f4);
        String str = (String) d(i0Var.getFontFeatureSettings(), i0Var2.getFontFeatureSettings(), f4);
        long f6 = f(i0Var.getLetterSpacing(), i0Var2.getLetterSpacing(), f4);
        androidx.compose.ui.text.style.a baselineShift = i0Var.getBaselineShift();
        float k4 = baselineShift != null ? baselineShift.k() : androidx.compose.ui.text.style.a.e(0.0f);
        androidx.compose.ui.text.style.a baselineShift2 = i0Var2.getBaselineShift();
        float a6 = androidx.compose.ui.text.style.b.a(k4, baselineShift2 != null ? baselineShift2.k() : androidx.compose.ui.text.style.a.e(0.0f), f4);
        androidx.compose.ui.text.style.o textGeometricTransform = i0Var.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            androidx.compose.ui.text.style.o.INSTANCE.getClass();
            textGeometricTransform = androidx.compose.ui.text.style.o.f21384e;
        }
        androidx.compose.ui.text.style.o textGeometricTransform2 = i0Var2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            androidx.compose.ui.text.style.o.INSTANCE.getClass();
            textGeometricTransform2 = androidx.compose.ui.text.style.o.f21384e;
        }
        androidx.compose.ui.text.style.o a7 = androidx.compose.ui.text.style.p.a(textGeometricTransform, textGeometricTransform2, f4);
        u0.f fVar = (u0.f) d(i0Var.getLocaleList(), i0Var2.getLocaleList(), f4);
        long n4 = f2.n(i0Var.getBackground(), i0Var2.getBackground(), f4);
        androidx.compose.ui.text.style.k kVar = (androidx.compose.ui.text.style.k) d(i0Var.getBackground(), i0Var2.getBackground(), f4);
        c6 shadow = i0Var.getShadow();
        if (shadow == null) {
            shadow = new c6(0L, 0L, 0.0f, 7, null);
        }
        c6 shadow2 = i0Var2.getShadow();
        if (shadow2 == null) {
            shadow2 = new c6(0L, 0L, 0.0f, 7, null);
        }
        return new i0(b5, f5, a5, k0Var, l0Var, yVar, str, f6, androidx.compose.ui.text.style.a.d(a6), a7, fVar, n4, kVar, d6.a(shadow, shadow2, f4), e(i0Var.getPlatformStyle(), i0Var2.getPlatformStyle(), f4), (androidx.compose.ui.graphics.drawscope.i) d(i0Var.getDrawStyle(), i0Var2.getDrawStyle(), f4), (kotlin.jvm.internal.w) null);
    }

    public static final <T> T d(T t4, T t5, float f4) {
        return ((double) f4) < 0.5d ? t4 : t5;
    }

    private static final d0 e(d0 d0Var, d0 d0Var2, float f4) {
        if (d0Var == null && d0Var2 == null) {
            return null;
        }
        if (d0Var == null) {
            d0.INSTANCE.getClass();
            d0Var = d0.f20633c;
        }
        if (d0Var2 == null) {
            d0.INSTANCE.getClass();
            d0 unused = d0.f20633c;
        }
        return d0Var;
    }

    public static final long f(long j4, long j5, float f4) {
        return (androidx.compose.ui.unit.a0.s(j4) || androidx.compose.ui.unit.a0.s(j5)) ? ((androidx.compose.ui.unit.z) d(androidx.compose.ui.unit.z.c(j4), androidx.compose.ui.unit.z.c(j5), f4)).getPackedValue() : androidx.compose.ui.unit.a0.u(j4, j5, f4);
    }

    private static final d0 g(i0 i0Var, d0 d0Var) {
        if (i0Var.getPlatformStyle() == null) {
            return d0Var;
        }
        if (d0Var == null) {
            return i0Var.getPlatformStyle();
        }
        d0 platformStyle = i0Var.getPlatformStyle();
        platformStyle.getClass();
        return platformStyle;
    }

    @fg.l
    public static final i0 h(@fg.l i0 i0Var) {
        int i4;
        int i5;
        float f4;
        androidx.compose.ui.text.style.n b5 = i0Var.getTextForegroundStyle().b(a.f21168b);
        long fontSize = androidx.compose.ui.unit.a0.s(i0Var.getFontSize()) ? f21164a : i0Var.getFontSize();
        androidx.compose.ui.text.font.o0 fontWeight = i0Var.getFontWeight();
        if (fontWeight == null) {
            androidx.compose.ui.text.font.o0.INSTANCE.getClass();
            fontWeight = androidx.compose.ui.text.font.o0.f20834q;
        }
        androidx.compose.ui.text.font.o0 o0Var = fontWeight;
        androidx.compose.ui.text.font.k0 fontStyle = i0Var.getFontStyle();
        if (fontStyle != null) {
            i4 = fontStyle.j();
        } else {
            androidx.compose.ui.text.font.k0.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.font.k0.f20754c;
        }
        androidx.compose.ui.text.font.k0 c5 = androidx.compose.ui.text.font.k0.c(i4);
        androidx.compose.ui.text.font.l0 fontSynthesis = i0Var.getFontSynthesis();
        if (fontSynthesis != null) {
            i5 = fontSynthesis.getValue();
        } else {
            androidx.compose.ui.text.font.l0.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.font.l0.f20760d;
        }
        androidx.compose.ui.text.font.l0 e4 = androidx.compose.ui.text.font.l0.e(i5);
        androidx.compose.ui.text.font.y fontFamily = i0Var.getFontFamily();
        if (fontFamily == null) {
            androidx.compose.ui.text.font.y.INSTANCE.getClass();
            fontFamily = androidx.compose.ui.text.font.y.f20893e;
        }
        androidx.compose.ui.text.font.y yVar = fontFamily;
        String fontFeatureSettings = i0Var.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = androidx.compose.ui.unit.a0.s(i0Var.getLetterSpacing()) ? f21165b : i0Var.getLetterSpacing();
        androidx.compose.ui.text.style.a baselineShift = i0Var.getBaselineShift();
        if (baselineShift != null) {
            f4 = baselineShift.k();
        } else {
            androidx.compose.ui.text.style.a.INSTANCE.getClass();
            f4 = androidx.compose.ui.text.style.a.f21300e;
        }
        androidx.compose.ui.text.style.a d5 = androidx.compose.ui.text.style.a.d(f4);
        androidx.compose.ui.text.style.o textGeometricTransform = i0Var.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            androidx.compose.ui.text.style.o.INSTANCE.getClass();
            textGeometricTransform = androidx.compose.ui.text.style.o.f21384e;
        }
        androidx.compose.ui.text.style.o oVar = textGeometricTransform;
        u0.f localeList = i0Var.getLocaleList();
        if (localeList == null) {
            localeList = u0.f.INSTANCE.a();
        }
        u0.f fVar = localeList;
        long background = i0Var.getBackground();
        d2.INSTANCE.getClass();
        if (background == d2.f17778o) {
            background = f21166c;
        }
        long j4 = background;
        androidx.compose.ui.text.style.k background2 = i0Var.getBackground();
        if (background2 == null) {
            androidx.compose.ui.text.style.k.INSTANCE.getClass();
            background2 = androidx.compose.ui.text.style.k.f21364d;
        }
        androidx.compose.ui.text.style.k kVar = background2;
        c6 shadow = i0Var.getShadow();
        if (shadow == null) {
            c6.INSTANCE.getClass();
            shadow = c6.f17640e;
        }
        c6 c6Var = shadow;
        d0 platformStyle = i0Var.getPlatformStyle();
        androidx.compose.ui.graphics.drawscope.i drawStyle = i0Var.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = androidx.compose.ui.graphics.drawscope.m.f17797a;
        }
        return new i0(b5, fontSize, o0Var, c5, e4, yVar, str, letterSpacing, d5, oVar, fVar, j4, kVar, c6Var, platformStyle, drawStyle, (kotlin.jvm.internal.w) null);
    }
}

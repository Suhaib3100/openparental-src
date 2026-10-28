package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b@\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010;\u001a\u0004\b/\u0010<\"\u0004\b=\u0010>R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010?\u001a\u0004\b5\u0010@\"\u0004\bA\u0010BR(\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b7\u0010\"\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b+\u0010E\u001a\u0004\b'\u0010F\"\u0004\bG\u0010HR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bN\u0010P\"\u0004\bQ\u0010RR(\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bS\u0010\"\u001a\u0004\b!\u0010$\"\u0004\bT\u0010&R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bU\u0010W\"\u0004\bX\u0010YR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010Z\u001a\u0004\bS\u0010[\"\u0004\b\\\u0010]\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/platform/h2;", "", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/unit/z;", "fontSize", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "Landroidx/compose/ui/text/font/y;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/a;", "baselineShift", "Landroidx/compose/ui/text/style/o;", "textGeometricTransform", "Lu0/f;", "localeList", "background", "Landroidx/compose/ui/text/style/k;", "textDecoration", "Landroidx/compose/ui/graphics/c6;", "shadow", "<init>", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/text/i0;", "C", "()Landroidx/compose/ui/text/i0;", "a", "J", "c", "()J", "q", "(J)V", "b", "f", "t", "Landroidx/compose/ui/text/font/o0;", "i", "()Landroidx/compose/ui/text/font/o0;", "w", "(Landroidx/compose/ui/text/font/o0;)V", "d", "Landroidx/compose/ui/text/font/k0;", "g", "()Landroidx/compose/ui/text/font/k0;", "u", "(Landroidx/compose/ui/text/font/k0;)V", "e", "Landroidx/compose/ui/text/font/l0;", "h", "()Landroidx/compose/ui/text/font/l0;", "v", "(Landroidx/compose/ui/text/font/l0;)V", "Landroidx/compose/ui/text/font/y;", "()Landroidx/compose/ui/text/font/y;", "r", "(Landroidx/compose/ui/text/font/y;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "j", "x", "Landroidx/compose/ui/text/style/a;", "()Landroidx/compose/ui/text/style/a;", "p", "(Landroidx/compose/ui/text/style/a;)V", "Landroidx/compose/ui/text/style/o;", "n", "()Landroidx/compose/ui/text/style/o;", "B", "(Landroidx/compose/ui/text/style/o;)V", "k", "Lu0/f;", "()Lu0/f;", "y", "(Lu0/f;)V", "l", "o", "m", "Landroidx/compose/ui/text/style/k;", "()Landroidx/compose/ui/text/style/k;", "A", "(Landroidx/compose/ui/text/style/k;)V", "Landroidx/compose/ui/graphics/c6;", "()Landroidx/compose/ui/graphics/c6;", "z", "(Landroidx/compose/ui/graphics/c6;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long fontSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.font.o0 fontWeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.font.k0 fontStyle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.font.l0 fontSynthesis;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.font.y fontFamily;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String fontFeatureSettings;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long letterSpacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.style.a baselineShift;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.style.o textGeometricTransform;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private u0.f localeList;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long background;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.style.k textDecoration;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.c6 shadow;

    public /* synthetic */ h2(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.c6 c6Var, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var);
    }

    public final void A(@fg.m androidx.compose.ui.text.style.k kVar) {
        this.textDecoration = kVar;
    }

    public final void B(@fg.m androidx.compose.ui.text.style.o oVar) {
        this.textGeometricTransform = oVar;
    }

    @fg.l
    public final androidx.compose.ui.text.i0 C() {
        return new androidx.compose.ui.text.i0(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, (androidx.compose.ui.text.d0) null, (androidx.compose.ui.graphics.drawscope.i) null, 49152, (kotlin.jvm.internal.w) null);
    }

    /* renamed from: a, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.text.style.a getBaselineShift() {
        return this.baselineShift;
    }

    /* renamed from: c, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final androidx.compose.ui.text.font.y getFontFamily() {
        return this.fontFamily;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: f, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final androidx.compose.ui.text.font.k0 getFontStyle() {
        return this.fontStyle;
    }

    @fg.m
    /* renamed from: h, reason: from getter */
    public final androidx.compose.ui.text.font.l0 getFontSynthesis() {
        return this.fontSynthesis;
    }

    @fg.m
    /* renamed from: i, reason: from getter */
    public final androidx.compose.ui.text.font.o0 getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: j, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    @fg.m
    /* renamed from: k, reason: from getter */
    public final u0.f getLocaleList() {
        return this.localeList;
    }

    @fg.m
    /* renamed from: l, reason: from getter */
    public final androidx.compose.ui.graphics.c6 getShadow() {
        return this.shadow;
    }

    @fg.m
    /* renamed from: m, reason: from getter */
    public final androidx.compose.ui.text.style.k getTextDecoration() {
        return this.textDecoration;
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final androidx.compose.ui.text.style.o getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final void o(long j4) {
        this.background = j4;
    }

    public final void p(@fg.m androidx.compose.ui.text.style.a aVar) {
        this.baselineShift = aVar;
    }

    public final void q(long j4) {
        this.color = j4;
    }

    public final void r(@fg.m androidx.compose.ui.text.font.y yVar) {
        this.fontFamily = yVar;
    }

    public final void s(@fg.m String str) {
        this.fontFeatureSettings = str;
    }

    public final void t(long j4) {
        this.fontSize = j4;
    }

    public final void u(@fg.m androidx.compose.ui.text.font.k0 k0Var) {
        this.fontStyle = k0Var;
    }

    public final void v(@fg.m androidx.compose.ui.text.font.l0 l0Var) {
        this.fontSynthesis = l0Var;
    }

    public final void w(@fg.m androidx.compose.ui.text.font.o0 o0Var) {
        this.fontWeight = o0Var;
    }

    public final void x(long j4) {
        this.letterSpacing = j4;
    }

    public final void y(@fg.m u0.f fVar) {
        this.localeList = fVar;
    }

    public final void z(@fg.m androidx.compose.ui.graphics.c6 c6Var) {
        this.shadow = c6Var;
    }

    private h2(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.c6 c6Var) {
        this.color = j4;
        this.fontSize = j5;
        this.fontWeight = o0Var;
        this.fontStyle = k0Var;
        this.fontSynthesis = l0Var;
        this.fontFamily = yVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j6;
        this.baselineShift = aVar;
        this.textGeometricTransform = oVar;
        this.localeList = fVar;
        this.background = j7;
        this.textDecoration = kVar;
        this.shadow = c6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h2(long r19, long r21, androidx.compose.ui.text.font.o0 r23, androidx.compose.ui.text.font.k0 r24, androidx.compose.ui.text.font.l0 r25, androidx.compose.ui.text.font.y r26, java.lang.String r27, long r28, androidx.compose.ui.text.style.a r30, androidx.compose.ui.text.style.o r31, u0.f r32, long r33, androidx.compose.ui.text.style.k r35, androidx.compose.ui.graphics.c6 r36, int r37, kotlin.jvm.internal.w r38) {
        /*
            r18 = this;
            r0 = r37
            r1 = r0 & 1
            if (r1 == 0) goto L10
            androidx.compose.ui.graphics.d2$a r1 = androidx.compose.ui.graphics.d2.INSTANCE
            r1.getClass()
            long r1 = androidx.compose.ui.graphics.d2.k()
            goto L12
        L10:
            r1 = r19
        L12:
            r3 = r0 & 2
            if (r3 == 0) goto L20
            androidx.compose.ui.unit.z$a r3 = androidx.compose.ui.unit.z.INSTANCE
            r3.getClass()
            long r3 = androidx.compose.ui.unit.z.b()
            goto L22
        L20:
            r3 = r21
        L22:
            r5 = r0 & 4
            if (r5 == 0) goto L28
            r5 = 0
            goto L2a
        L28:
            r5 = r23
        L2a:
            r7 = r0 & 8
            if (r7 == 0) goto L30
            r7 = 0
            goto L32
        L30:
            r7 = r24
        L32:
            r8 = r0 & 16
            if (r8 == 0) goto L38
            r8 = 0
            goto L3a
        L38:
            r8 = r25
        L3a:
            r9 = r0 & 32
            if (r9 == 0) goto L40
            r9 = 0
            goto L42
        L40:
            r9 = r26
        L42:
            r10 = r0 & 64
            if (r10 == 0) goto L48
            r10 = 0
            goto L4a
        L48:
            r10 = r27
        L4a:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L58
            androidx.compose.ui.unit.z$a r11 = androidx.compose.ui.unit.z.INSTANCE
            r11.getClass()
            long r11 = androidx.compose.ui.unit.z.b()
            goto L5a
        L58:
            r11 = r28
        L5a:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L60
            r13 = 0
            goto L62
        L60:
            r13 = r30
        L62:
            r14 = r0 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L68
            r14 = 0
            goto L6a
        L68:
            r14 = r31
        L6a:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L70
            r15 = 0
            goto L72
        L70:
            r15 = r32
        L72:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L80
            androidx.compose.ui.graphics.d2$a r6 = androidx.compose.ui.graphics.d2.INSTANCE
            r6.getClass()
            long r16 = androidx.compose.ui.graphics.d2.k()
            goto L82
        L80:
            r16 = r33
        L82:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L88
            r6 = 0
            goto L8a
        L88:
            r6 = r35
        L8a:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L90
            r0 = 0
            goto L92
        L90:
            r0 = r36
        L92:
            r19 = r18
            r20 = r1
            r22 = r3
            r24 = r5
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r16
            r36 = r6
            r37 = r0
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.h2.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, int, kotlin.jvm.internal.w):void");
    }
}

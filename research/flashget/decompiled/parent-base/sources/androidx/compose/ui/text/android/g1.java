package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextLayout.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b)\u0010!J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b*\u0010!J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010!J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b/\u0010-J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b2\u0010-J\u0015\u00103\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b3\u0010-J\u0015\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b5\u0010-J\u001d\u00107\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b=\u0010<J\u0015\u0010>\u001a\u00020\b2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\b>\u0010-J\u0015\u0010?\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\b?\u00101J\u0015\u0010@\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b@\u0010-J%\u0010F\u001a\u00020E2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bF\u0010GJ-\u0010M\u001a\u00020E2\u0006\u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020\b2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\b¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u00020O2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020E2\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u000fH\u0000¢\u0006\u0004\bV\u0010WR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bM\u0010X\u001a\u0004\bY\u0010WR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bZ\u0010X\u001a\u0004\b[\u0010WR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bP\u0010X\u001a\u0004\b`\u0010WR \u0010h\u001a\u00020b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010c\u0012\u0004\bf\u0010g\u001a\u0004\bd\u0010eR\u0017\u0010k\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b[\u0010;\u001a\u0004\bi\u0010jR \u0010o\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bl\u0010;\u0012\u0004\bn\u0010g\u001a\u0004\bm\u0010jR \u0010p\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b \u0010;\u0012\u0004\b\\\u0010g\u001a\u0004\bZ\u0010jR\u0014\u0010r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010qR\u0014\u0010s\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010qR\u0014\u0010t\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010XR\u0016\u0010x\u001a\u0004\u0018\u00010u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010;R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020{0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u007fR\u001f\u0010\u0084\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b&\u0010\u0082\u0001\u001a\u0005\bv\u0010\u0083\u0001R\u0014\u0010\u0087\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0013\u0010\u0088\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bq\u0010\u0086\u0001R\u0014\u0010\u008b\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0012\u0010\u008c\u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bl\u0010j¨\u0006\u008d\u0001"}, d2 = {"Landroidx/compose/ui/text/android/g1;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Landroidx/compose/ui/text/android/o;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/o;)V", "line", "h", "(I)F", "lineIndex", "y", "z", "B", "p", "n", "o", "r", "x", "D", "A", "(I)I", "u", "C", "R", "(I)Z", "t", "s", "vertical", "w", "horizontal", "G", "(IF)I", "offset", "upstream", "I", "(IZ)F", "K", "v", "S", "H", "start", "end", "Landroid/graphics/Path;", "dest", "Lkotlin/k2;", "M", "(IILandroid/graphics/Path;)V", "startOffset", "endOffset", "", "array", "arrayStart", "a", "(II[FI)V", "Landroid/graphics/RectF;", "d", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "T", "(Landroid/graphics/Canvas;)V", "Q", "()Z", "Z", "i", "b", "f", "c", "Landroidx/compose/ui/text/android/o;", "m", "()Landroidx/compose/ui/text/android/o;", "e", "didExceedMaxLines", "Landroid/text/Layout;", "Landroid/text/Layout;", "j", "()Landroid/text/Layout;", "k", "()V", "layout", "q", "()I", "lineCount", "g", "O", "P", "topPadding", "bottomPadding", "F", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "l", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "Ls0/h;", "[Ls0/h;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "rect", "Landroidx/compose/ui/text/android/m;", "Lkotlin/b0;", "()Landroidx/compose/ui/text/android/m;", "layoutHelper", "E", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "N", "()Ljava/lang/CharSequence;", "text", "height", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1031:1\n1#2:1032\n*E\n"})
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f20480q = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean fallbackLineSpacing;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o layoutIntrinsics;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Layout layout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int topPadding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int bottomPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float leftPadding;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float rightPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean isBoringLayout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Paint.FontMetricsInt lastLineFontMetrics;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int lastLineExtra;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s0.h[] lineHeightSpans;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Rect rect;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 layoutHelper;

    /* compiled from: TextLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/android/m;", "a", "()Landroidx/compose/ui/text/android/m;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<m> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return new m(g1.this.getLayout());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    public g1(@fg.l CharSequence charSequence, float f4, @fg.l TextPaint textPaint, int i4, @fg.m TextUtils.TruncateAt truncateAt, int i5, float f5, @androidx.annotation.u0 float f6, boolean z4, boolean z5, int i6, int i7, int i10, int i11, int i12, int i13, @fg.m int[] iArr, @fg.m int[] iArr2, @fg.l o oVar) {
        boolean z6;
        boolean z7;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout a5;
        long k4;
        s0.h[] i14;
        long h4;
        Paint.FontMetricsInt g4;
        this.includePadding = z4;
        this.fallbackLineSpacing = z5;
        this.layoutIntrinsics = oVar;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic j4 = h1.j(i5);
        Layout.Alignment a6 = n0.f20570a.a(i4);
        boolean z10 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, s0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a7 = oVar.a();
            double d5 = f4;
            int ceil = (int) Math.ceil(d5);
            if (a7 == null || oVar.b() > f4 || z10) {
                z6 = true;
                this.isBoringLayout = false;
                z7 = false;
                textDirectionHeuristic = j4;
                a5 = i0.f20504a.a(charSequence, textPaint, ceil, 0, charSequence.length(), j4, a6, i6, truncateAt, (int) Math.ceil(d5), f5, f6, i13, z4, z5, i7, i10, i11, i12, iArr, iArr2);
            } else {
                this.isBoringLayout = true;
                z6 = true;
                a5 = e.f20470a.a(charSequence, textPaint, ceil, a7, a6, z4, z5, truncateAt, ceil);
                textDirectionHeuristic = j4;
                z7 = false;
            }
            this.layout = a5;
            Trace.endSection();
            int min = Math.min(a5.getLineCount(), i6);
            this.lineCount = min;
            int i15 = min - 1;
            this.didExceedMaxLines = (min >= i6 && (a5.getEllipsisCount(i15) > 0 || a5.getLineEnd(i15) != charSequence.length())) ? z6 : z7;
            k4 = h1.k(this);
            i14 = h1.i(this);
            this.lineHeightSpans = i14;
            h4 = h1.h(this, i14);
            this.topPadding = Math.max((int) (k4 >> 32), (int) (h4 >> 32));
            this.bottomPadding = Math.max((int) (k4 & 4294967295L), (int) (h4 & 4294967295L));
            g4 = h1.g(this, textPaint, textDirectionHeuristic, i14);
            this.lastLineExtra = g4 != null ? g4.bottom - ((int) x(i15)) : z7;
            this.lastLineFontMetrics = g4;
            this.leftPadding = s0.d.b(a5, i15, null, 2, null);
            this.rightPadding = s0.d.d(a5, i15, null, 2, null);
            this.layoutHelper = kotlin.c0.b(kotlin.f0.NONE, new a());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float J(g1 g1Var, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return g1Var.I(i4, z4);
    }

    public static /* synthetic */ float L(g1 g1Var, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return g1Var.K(i4, z4);
    }

    @m1
    public static /* synthetic */ void P() {
    }

    @m1
    public static /* synthetic */ void c() {
    }

    private final float h(int line) {
        if (line == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    @m1
    public static /* synthetic */ void k() {
    }

    private final m l() {
        return (m) this.layoutHelper.getValue();
    }

    public final int A(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float B(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int C(int lineIndex) {
        if (this.layout.getEllipsisStart(lineIndex) == 0) {
            return l().e(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final float D(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final float E() {
        return this.layoutIntrinsics.b();
    }

    public final float F() {
        return this.layoutIntrinsics.c();
    }

    public final int G(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, ((-1) * h(line)) + horizontal);
    }

    public final int H(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float I(int offset, boolean upstream) {
        return l().c(offset, true, upstream) + h(this.layout.getLineForOffset(offset));
    }

    public final float K(int offset, boolean upstream) {
        return l().c(offset, false, upstream) + h(this.layout.getLineForOffset(offset));
    }

    public final void M(int start, int end, @fg.l Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    @fg.l
    public final CharSequence N() {
        return this.layout.getText();
    }

    /* renamed from: O, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    public final boolean Q() {
        if (this.isBoringLayout) {
            e eVar = e.f20470a;
            Layout layout = this.layout;
            kotlin.jvm.internal.l0.n(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return eVar.c((BoringLayout) layout);
        }
        i0 i0Var = i0.f20504a;
        Layout layout2 = this.layout;
        kotlin.jvm.internal.l0.n(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return i0Var.c((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean R(int lineIndex) {
        return h1.l(this.layout, lineIndex);
    }

    public final boolean S(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void T(@fg.l Canvas canvas) {
        f1 f1Var;
        if (canvas.getClipBounds(this.rect)) {
            int i4 = this.topPadding;
            if (i4 != 0) {
                canvas.translate(0.0f, i4);
            }
            f1Var = h1.f20502a;
            f1Var.a(canvas);
            this.layout.draw(f1Var);
            int i5 = this.topPadding;
            if (i5 != 0) {
                canvas.translate(0.0f, (-1) * i5);
            }
        }
    }

    public final void a(int startOffset, int endOffset, @fg.l float[] array, int arrayStart) {
        float e4;
        float f4;
        int length = this.layout.getText().length();
        if (startOffset < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (startOffset >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (endOffset <= startOffset) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (endOffset > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (array.length - arrayStart < (endOffset - startOffset) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = this.layout.getLineForOffset(startOffset);
        int lineForOffset2 = this.layout.getLineForOffset(endOffset - 1);
        h hVar = new h(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = this.layout.getLineStart(lineForOffset);
            int u4 = u(lineForOffset);
            int min = Math.min(endOffset, u4);
            float B = B(lineForOffset);
            float p4 = p(lineForOffset);
            boolean z4 = this.layout.getParagraphDirection(lineForOffset) == 1;
            for (int max = Math.max(startOffset, lineStart); max < min; max++) {
                boolean isRtlCharAt = this.layout.isRtlCharAt(max);
                if (z4 && !isRtlCharAt) {
                    e4 = hVar.c(max);
                    f4 = hVar.d(max + 1);
                } else if (z4 && isRtlCharAt) {
                    f4 = hVar.e(max);
                    e4 = hVar.f(max + 1);
                } else if (z4 || !isRtlCharAt) {
                    e4 = hVar.e(max);
                    f4 = hVar.f(max + 1);
                } else {
                    f4 = hVar.c(max);
                    e4 = hVar.d(max + 1);
                }
                array[arrayStart] = e4;
                array[arrayStart + 1] = B;
                array[arrayStart + 2] = f4;
                array[arrayStart + 3] = p4;
                arrayStart += 4;
            }
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    /* renamed from: b, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @fg.l
    public final RectF d(int offset) {
        float K;
        float K2;
        float I;
        float I2;
        int lineForOffset = this.layout.getLineForOffset(offset);
        float B = B(lineForOffset);
        float p4 = p(lineForOffset);
        boolean z4 = this.layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z4 || isRtlCharAt) {
            if (z4 && isRtlCharAt) {
                I = K(offset, false);
                I2 = K(offset + 1, true);
            } else if (isRtlCharAt) {
                I = I(offset, false);
                I2 = I(offset + 1, true);
            } else {
                K = K(offset, false);
                K2 = K(offset + 1, true);
            }
            float f4 = I;
            K = I2;
            K2 = f4;
        } else {
            K = I(offset, false);
            K2 = I(offset + 1, true);
        }
        return new RectF(K, B, K2, p4);
    }

    /* renamed from: e, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int g() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final o getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float n(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(line) : fontMetricsInt.ascent;
    }

    public final float o(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : B(line) - this.lastLineFontMetrics.ascent);
    }

    public final float p(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    /* renamed from: q, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final float r(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(line) : fontMetricsInt.descent;
    }

    public final int s(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int t(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int u(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) == 0 ? this.layout.getLineEnd(lineIndex) : this.layout.getText().length();
    }

    public final int v(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int w(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float x(int lineIndex) {
        return p(lineIndex) - B(lineIndex);
    }

    public final float y(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float z(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ g1(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.ui.text.android.o r42, int r43, kotlin.jvm.internal.w r44) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.g1.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.o, int, kotlin.jvm.internal.w):void");
    }
}

package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b,\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\"\u00107R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010<R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\b8\u0010)R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\b5\u0010DR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bE\u0010DR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\b&\u0010)R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b=\u0010)R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b>\u0010)R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b1\u0010)R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bE\u0010G\u001a\u0004\b:\u0010HR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b0\u0010G\u001a\u0004\bF\u0010H¨\u0006I"}, d2 = {"Landroidx/compose/ui/text/android/m0;", "", "", "text", "", "start", "end", "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "a", "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "b", "I", "q", "()I", "c", "e", "d", "Landroid/text/TextPaint;", "o", "()Landroid/text/TextPaint;", "u", "f", "Landroid/text/TextDirectionHeuristic;", "s", "()Landroid/text/TextDirectionHeuristic;", "g", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "h", "n", "i", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "j", "k", "F", "m", "()F", "l", "Z", "()Z", "t", "p", "[I", "()[I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStaticLayoutFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticLayoutFactory.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
/* loaded from: classes.dex */
final class m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final TextPaint paint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final TextDirectionHeuristic textDir;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Layout.Alignment alignment;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final TextUtils.TruncateAt ellipsize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int ellipsizedWidth;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float lineSpacingMultiplier;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float lineSpacingExtra;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int justificationMode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean useFallbackLineSpacing;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int breakStrategy;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int lineBreakStyle;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int lineBreakWordStyle;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int hyphenationFrequency;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final int[] leftIndents;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final int[] rightIndents;

    public m0(@fg.l CharSequence charSequence, int i4, int i5, @fg.l TextPaint textPaint, int i6, @fg.l TextDirectionHeuristic textDirectionHeuristic, @fg.l Layout.Alignment alignment, int i7, @fg.m TextUtils.TruncateAt truncateAt, int i10, float f4, float f5, int i11, boolean z4, boolean z5, int i12, int i13, int i14, int i15, @fg.m int[] iArr, @fg.m int[] iArr2) {
        this.text = charSequence;
        this.start = i4;
        this.end = i5;
        this.paint = textPaint;
        this.width = i6;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i7;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i10;
        this.lineSpacingMultiplier = f4;
        this.lineSpacingExtra = f5;
        this.justificationMode = i11;
        this.includePadding = z4;
        this.useFallbackLineSpacing = z5;
        this.breakStrategy = i12;
        this.lineBreakStyle = i13;
        this.lineBreakWordStyle = i14;
        this.hyphenationFrequency = i15;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (i4 < 0 || i4 > i5) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i5 < 0 || i5 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: b, reason: from getter */
    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    /* renamed from: d, reason: from getter */
    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    /* renamed from: e, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: f, reason: from getter */
    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* renamed from: h, reason: from getter */
    public final int getJustificationMode() {
        return this.justificationMode;
    }

    @fg.m
    /* renamed from: i, reason: from getter */
    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    /* renamed from: j, reason: from getter */
    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    /* renamed from: k, reason: from getter */
    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    /* renamed from: l, reason: from getter */
    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    /* renamed from: m, reason: from getter */
    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    /* renamed from: n, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final TextPaint getPaint() {
        return this.paint;
    }

    @fg.m
    /* renamed from: p, reason: from getter */
    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    /* renamed from: q, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    /* renamed from: u, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ m0(CharSequence charSequence, int i4, int i5, TextPaint textPaint, int i6, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i7, TextUtils.TruncateAt truncateAt, int i10, float f4, float f5, int i11, boolean z4, boolean z5, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int i16, kotlin.jvm.internal.w wVar) {
        this(charSequence, (i16 & 2) != 0 ? 0 : i4, i5, textPaint, i6, textDirectionHeuristic, alignment, i7, truncateAt, i10, f4, f5, i11, z4, z5, i12, i13, i14, i15, iArr, iArr2);
    }
}

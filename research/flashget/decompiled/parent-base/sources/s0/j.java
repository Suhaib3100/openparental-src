package s0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: PlaceholderSpan.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 52\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b#\u0010'R$\u0010,\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00128\u0006@BX\u0086.¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010+R$\u0010.\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b$\u0010'R$\u00100\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b!\u0010'R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Ls0/j;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "pxPerSp", "verticalAlign", "<init>", "(FIFIFI)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "Lkotlin/k2;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "a", "F", "b", "I", "c", "d", "e", "f", "()I", "<set-?>", "g", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "h", "widthPx", "i", "heightPx", "", "j", "Z", "isLaidOut", "k", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nPlaceholderSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
/* loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* renamed from: l, reason: collision with root package name */
    public static final int f90117l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f90118m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f90119n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f90120o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f90121p = 3;

    /* renamed from: q, reason: collision with root package name */
    public static final int f90122q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f90123r = 5;

    /* renamed from: s, reason: collision with root package name */
    public static final int f90124s = 6;

    /* renamed from: t, reason: collision with root package name */
    public static final int f90125t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f90126u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f90127v = 2;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int widthUnit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int heightUnit;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float pxPerSp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int verticalAlign;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Paint.FontMetricsInt fontMetrics;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int widthPx;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int heightPx;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isLaidOut;

    public j(float f4, int i4, float f5, int i5, float f6, int i6) {
        this.width = f4;
        this.widthUnit = i4;
        this.height = f5;
        this.heightUnit = i5;
        this.pxPerSp = f6;
        this.verticalAlign = i6;
    }

    @fg.l
    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l0.S("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.isLaidOut) {
            return this.heightPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    /* renamed from: c, reason: from getter */
    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int d() {
        if (this.isLaidOut) {
            return this.widthPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@fg.l Canvas canvas, @fg.m CharSequence text, int start, int end, float x4, int top2, int y4, int bottom, @fg.l Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@fg.l Paint paint, @fg.m CharSequence text, int start, int end, @fg.m Paint.FontMetricsInt fm) {
        float f4;
        int a5;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i4 = this.widthUnit;
        if (i4 == 0) {
            f4 = this.width * this.pxPerSp;
        } else {
            if (i4 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f4 = this.width * textSize;
        }
        this.widthPx = k.a(f4);
        int i5 = this.heightUnit;
        if (i5 == 0) {
            a5 = k.a(this.height * this.pxPerSp);
        } else {
            if (i5 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            a5 = k.a(this.height * textSize);
        }
        this.heightPx = a5;
        if (fm != null) {
            fm.ascent = a().ascent;
            fm.descent = a().descent;
            fm.leading = a().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm.ascent > (-b())) {
                        fm.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fm.ascent > fm.descent) {
                        fm.descent = b() + fm.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fm.ascent > fm.descent - b()) {
                        fm.ascent = fm.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fm.descent - fm.ascent < b()) {
                        int b5 = fm.ascent - ((b() - (fm.descent - fm.ascent)) / 2);
                        fm.ascent = b5;
                        fm.descent = b() + b5;
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fm.top = Math.min(a().top, fm.ascent);
            fm.bottom = Math.max(a().bottom, fm.descent);
        }
        return d();
    }
}

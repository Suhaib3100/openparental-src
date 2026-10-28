package s0;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.ui.text.android.h1;
import kotlin.Metadata;

/* compiled from: IndentationFixSpan.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", "a", "(Landroid/text/Layout;ILandroid/graphics/Paint;)F", "c", "", "Ljava/lang/String;", "EllipsisChar", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f90095a = "…";

    /* compiled from: IndentationFixSpan.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90096a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f90096a = iArr;
        }
    }

    public static final float a(@fg.l Layout layout, int i4, @fg.l Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i4);
        if (!h1.l(layout, i4) || layout.getParagraphDirection(i4) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i4) + layout.getLineStart(i4)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i4);
        if ((paragraphAlignment == null ? -1 : a.f90096a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static /* synthetic */ float b(Layout layout, int i4, Paint paint, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i4, paint);
    }

    public static final float c(@fg.l Layout layout, int i4, @fg.l Paint paint) {
        float width;
        float width2;
        if (!h1.l(layout, i4)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i4) != -1 || layout.getWidth() >= layout.getLineRight(i4)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i4) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i4) + layout.getLineStart(i4)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i4);
        if ((paragraphAlignment != null ? a.f90096a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i4);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i4);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(Layout layout, int i4, Paint paint, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i4, paint);
    }
}

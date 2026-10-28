package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.Metadata;

/* compiled from: Rect.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0086\n\u001a\u0015\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010\u001b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0086\n\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u001f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010!\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\f\u001a\u0015\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010#\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010$\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010%\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\f\u001a\u0015\u0010'\u001a\u00020&*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010(\u001a\u00020&*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0014H\u0086\n\u001a\r\u0010)\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010*\u001a\u00020\u0000*\u00020\u0006H\u0086\b\u001a\r\u0010+\u001a\u00020\u0016*\u00020\u0000H\u0086\b\u001a\r\u0010,\u001a\u00020\u0016*\u00020\u0006H\u0086\b\u001a\u0015\u0010.\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020-H\u0086\b¨\u0006/"}, d2 = {"Landroid/graphics/Rect;", "", "d", "f", "h", "j", "Landroid/graphics/RectF;", "", "c", "e", "g", "i", "r", "w", "z", "xy", "u", "x", "Landroid/graphics/Point;", "v", "Landroid/graphics/PointF;", "y", "Landroid/graphics/Region;", "q", "m", "o", "n", "p", "factor", "A", "C", "B", "s", "t", "a", "b", "I", "J", "", "k", "l", "E", "D", "F", "G", "Landroid/graphics/Matrix;", "H", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class i2 {
    @d5.d
    public static final Rect A(@d5.d Rect rect, int i5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i5;
        rect2.left *= i5;
        rect2.right *= i5;
        rect2.bottom *= i5;
        return rect2;
    }

    @d5.d
    public static final RectF B(@d5.d RectF rectF, float f6) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f6;
        rectF2.left *= f6;
        rectF2.right *= f6;
        rectF2.bottom *= f6;
        return rectF2;
    }

    @d5.d
    public static final RectF C(@d5.d RectF rectF, int i5) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        float f6 = i5;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f6;
        rectF2.left *= f6;
        rectF2.right *= f6;
        rectF2.bottom *= f6;
        return rectF2;
    }

    @d5.d
    public static final Rect D(@d5.d RectF rectF) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @d5.d
    public static final RectF E(@d5.d Rect rect) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        return new RectF(rect);
    }

    @d5.d
    public static final Region F(@d5.d Rect rect) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        return new Region(rect);
    }

    @d5.d
    public static final Region G(@d5.d RectF rectF) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @d5.d
    public static final RectF H(@d5.d RectF rectF, @d5.d Matrix m5) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(m5, "m");
        m5.mapRect(rectF);
        return rectF;
    }

    @d5.d
    public static final Region I(@d5.d Rect rect, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region = new Region(rect);
        region.op(r5, Region.Op.XOR);
        return region;
    }

    @d5.d
    public static final Region J(@d5.d RectF rectF, @d5.d RectF r5) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r5.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @SuppressLint({"CheckResult"})
    @d5.d
    public static final Rect a(@d5.d Rect rect, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Rect rect2 = new Rect(rect);
        rect2.intersect(r5);
        return rect2;
    }

    @SuppressLint({"CheckResult"})
    @d5.d
    public static final RectF b(@d5.d RectF rectF, @d5.d RectF r5) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.intersect(r5);
        return rectF2;
    }

    public static final float c(@d5.d RectF rectF) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        return rectF.left;
    }

    public static final int d(@d5.d Rect rect) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        return rect.left;
    }

    public static final float e(@d5.d RectF rectF) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        return rectF.top;
    }

    public static final int f(@d5.d Rect rect) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        return rect.top;
    }

    public static final float g(@d5.d RectF rectF) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        return rectF.right;
    }

    public static final int h(@d5.d Rect rect) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        return rect.right;
    }

    public static final float i(@d5.d RectF rectF) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        return rectF.bottom;
    }

    public static final int j(@d5.d Rect rect) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean k(@d5.d Rect rect, @d5.d Point p5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        return rect.contains(p5.x, p5.y);
    }

    public static final boolean l(@d5.d RectF rectF, @d5.d PointF p5) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        return rectF.contains(p5.x, p5.y);
    }

    @d5.d
    public static final Rect m(@d5.d Rect rect, int i5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i6 = -i5;
        rect2.offset(i6, i6);
        return rect2;
    }

    @d5.d
    public static final Rect n(@d5.d Rect rect, @d5.d Point xy) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        kotlin.jvm.internal.l0.p(xy, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-xy.x, -xy.y);
        return rect2;
    }

    @d5.d
    public static final RectF o(@d5.d RectF rectF, float f6) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f7 = -f6;
        rectF2.offset(f7, f7);
        return rectF2;
    }

    @d5.d
    public static final RectF p(@d5.d RectF rectF, @d5.d PointF xy) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-xy.x, -xy.y);
        return rectF2;
    }

    @d5.d
    public static final Region q(@d5.d Rect rect, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region = new Region(rect);
        region.op(r5, Region.Op.DIFFERENCE);
        return region;
    }

    @d5.d
    public static final Region r(@d5.d RectF rectF, @d5.d RectF r5) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r5.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @d5.d
    public static final Rect s(@d5.d Rect rect, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Rect rect2 = new Rect(rect);
        rect2.union(r5);
        return rect2;
    }

    @d5.d
    public static final RectF t(@d5.d RectF rectF, @d5.d RectF r5) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r5);
        return rectF2;
    }

    @d5.d
    public static final Rect u(@d5.d Rect rect, int i5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i5, i5);
        return rect2;
    }

    @d5.d
    public static final Rect v(@d5.d Rect rect, @d5.d Point xy) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        kotlin.jvm.internal.l0.p(xy, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(xy.x, xy.y);
        return rect2;
    }

    @d5.d
    public static final Rect w(@d5.d Rect rect, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(rect, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Rect rect2 = new Rect(rect);
        rect2.union(r5);
        return rect2;
    }

    @d5.d
    public static final RectF x(@d5.d RectF rectF, float f6) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f6, f6);
        return rectF2;
    }

    @d5.d
    public static final RectF y(@d5.d RectF rectF, @d5.d PointF xy) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(xy.x, xy.y);
        return rectF2;
    }

    @d5.d
    public static final RectF z(@d5.d RectF rectF, @d5.d RectF r5) {
        kotlin.jvm.internal.l0.p(rectF, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r5);
        return rectF2;
    }
}

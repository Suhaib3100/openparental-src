package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Rect.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0007H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\u0007H\u0086\n¢\u0006\u0004\b\u000b\u0010\n\u001a\u0014\u0010\f\u001a\u00020\b*\u00020\u0007H\u0086\n¢\u0006\u0004\b\f\u0010\n\u001a\u0014\u0010\r\u001a\u00020\b*\u00020\u0007H\u0086\n¢\u0006\u0004\b\r\u0010\n\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0086\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0018H\u0086\n¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u001bH\u0086\n¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u001f\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\u000e\u001a\u00020\u001e*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0086\n¢\u0006\u0004\b\u000e\u0010!\u001a\u001c\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\"\u0010\u0015\u001a\u001c\u0010#\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\bH\u0086\n¢\u0006\u0004\b#\u0010\u0017\u001a\u001c\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0018H\u0086\n¢\u0006\u0004\b$\u0010\u001a\u001a\u001c\u0010%\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u001bH\u0086\n¢\u0006\u0004\b%\u0010\u001d\u001a\u001c\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010&\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b'\u0010\u0015\u001a\u001c\u0010(\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010*\u001a\u00020\u0007*\u00020\u00072\u0006\u0010&\u001a\u00020\bH\u0086\n¢\u0006\u0004\b*\u0010\u0017\u001a\u001c\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b+\u0010\u0010\u001a\u001c\u0010,\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0086\f¢\u0006\u0004\b,\u0010\u0012\u001a\u001c\u0010-\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b-\u0010\u0010\u001a\u001c\u0010.\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0087\f¢\u0006\u0004\b.\u0010\u0012\u001a\u001c\u0010/\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b/\u0010 \u001a\u001c\u00100\u001a\u00020\u001e*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0086\f¢\u0006\u0004\b0\u0010!\u001a\u001c\u00102\u001a\u000201*\u00020\u00002\u0006\u0010%\u001a\u00020\u0018H\u0086\n¢\u0006\u0004\b2\u00103\u001a\u001c\u00104\u001a\u000201*\u00020\u00072\u0006\u0010%\u001a\u00020\u001bH\u0086\n¢\u0006\u0004\b4\u00105\u001a\u0014\u00106\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u00020\u0000*\u00020\u0007H\u0086\b¢\u0006\u0004\b8\u00109\u001a\u0014\u0010:\u001a\u00020\u001e*\u00020\u0000H\u0086\b¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\u001e*\u00020\u0007H\u0086\b¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010?\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\"\u001a\u00020>H\u0086\b¢\u0006\u0004\b?\u0010@¨\u0006A"}, d2 = {"Landroid/graphics/Rect;", "", "d", "(Landroid/graphics/Rect;)I", "f", "h", "j", "Landroid/graphics/RectF;", "", "c", "(Landroid/graphics/RectF;)F", "e", "g", "i", "r", "w", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Rect;", "z", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/RectF;", "xy", "u", "(Landroid/graphics/Rect;I)Landroid/graphics/Rect;", "x", "(Landroid/graphics/RectF;F)Landroid/graphics/RectF;", "Landroid/graphics/Point;", "v", "(Landroid/graphics/Rect;Landroid/graphics/Point;)Landroid/graphics/Rect;", "Landroid/graphics/PointF;", "y", "(Landroid/graphics/RectF;Landroid/graphics/PointF;)Landroid/graphics/RectF;", "Landroid/graphics/Region;", "q", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Region;", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/Region;", "m", "o", "n", "p", "factor", "A", "C", "(Landroid/graphics/RectF;I)Landroid/graphics/RectF;", "B", "s", "t", "a", "b", "I", "J", "", "k", "(Landroid/graphics/Rect;Landroid/graphics/Point;)Z", "l", "(Landroid/graphics/RectF;Landroid/graphics/PointF;)Z", "E", "(Landroid/graphics/Rect;)Landroid/graphics/RectF;", "D", "(Landroid/graphics/RectF;)Landroid/graphics/Rect;", "F", "(Landroid/graphics/Rect;)Landroid/graphics/Region;", "G", "(Landroid/graphics/RectF;)Landroid/graphics/Region;", "Landroid/graphics/Matrix;", "H", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/RectF;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n278#1,3:296\n211#1,6:299\n114#1:305\n122#1:307\n278#1,3:309\n278#1,3:312\n1#2:295\n1#2:306\n1#2:308\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n161#1:296,3\n207#1:299,6\n220#1:305\n223#1:307\n253#1:309,3\n290#1:312,3\n220#1:306\n223#1:308\n*E\n"})
/* loaded from: classes3.dex */
public final class p0 {
    @fg.l
    public static final Rect A(@fg.l Rect rect, int i4) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i4;
        rect2.left *= i4;
        rect2.right *= i4;
        rect2.bottom *= i4;
        return rect2;
    }

    @fg.l
    public static final RectF B(@fg.l RectF rectF, float f4) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f4;
        rectF2.left *= f4;
        rectF2.right *= f4;
        rectF2.bottom *= f4;
        return rectF2;
    }

    @fg.l
    public static final RectF C(@fg.l RectF rectF, int i4) {
        float f4 = i4;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f4;
        rectF2.left *= f4;
        rectF2.right *= f4;
        rectF2.bottom *= f4;
        return rectF2;
    }

    @fg.l
    public static final Rect D(@fg.l RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @fg.l
    public static final RectF E(@fg.l Rect rect) {
        return new RectF(rect);
    }

    @fg.l
    public static final Region F(@fg.l Rect rect) {
        return new Region(rect);
    }

    @fg.l
    public static final Region G(@fg.l RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @fg.l
    public static final RectF H(@fg.l RectF rectF, @fg.l Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    @fg.l
    public static final Region I(@fg.l Rect rect, @fg.l Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @fg.l
    public static final Region J(@fg.l RectF rectF, @fg.l RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @fg.l
    @SuppressLint({"CheckResult"})
    public static final Rect a(@fg.l Rect rect, @fg.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @fg.l
    @SuppressLint({"CheckResult"})
    public static final RectF b(@fg.l RectF rectF, @fg.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float c(@fg.l RectF rectF) {
        return rectF.left;
    }

    public static final int d(@fg.l Rect rect) {
        return rect.left;
    }

    public static final float e(@fg.l RectF rectF) {
        return rectF.top;
    }

    public static final int f(@fg.l Rect rect) {
        return rect.top;
    }

    public static final float g(@fg.l RectF rectF) {
        return rectF.right;
    }

    public static final int h(@fg.l Rect rect) {
        return rect.right;
    }

    public static final float i(@fg.l RectF rectF) {
        return rectF.bottom;
    }

    public static final int j(@fg.l Rect rect) {
        return rect.bottom;
    }

    public static final boolean k(@fg.l Rect rect, @fg.l Point point) {
        return rect.contains(point.x, point.y);
    }

    public static final boolean l(@fg.l RectF rectF, @fg.l PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    @fg.l
    public static final Rect m(@fg.l Rect rect, int i4) {
        Rect rect2 = new Rect(rect);
        int i5 = -i4;
        rect2.offset(i5, i5);
        return rect2;
    }

    @fg.l
    public static final Rect n(@fg.l Rect rect, @fg.l Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @fg.l
    public static final RectF o(@fg.l RectF rectF, float f4) {
        RectF rectF2 = new RectF(rectF);
        float f5 = -f4;
        rectF2.offset(f5, f5);
        return rectF2;
    }

    @fg.l
    public static final RectF p(@fg.l RectF rectF, @fg.l PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @fg.l
    public static final Region q(@fg.l Rect rect, @fg.l Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @fg.l
    public static final Region r(@fg.l RectF rectF, @fg.l RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @fg.l
    public static final Rect s(@fg.l Rect rect, @fg.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @fg.l
    public static final RectF t(@fg.l RectF rectF, @fg.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @fg.l
    public static final Rect u(@fg.l Rect rect, int i4) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i4, i4);
        return rect2;
    }

    @fg.l
    public static final Rect v(@fg.l Rect rect, @fg.l Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @fg.l
    public static final Rect w(@fg.l Rect rect, @fg.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @fg.l
    public static final RectF x(@fg.l RectF rectF, float f4) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f4, f4);
        return rectF2;
    }

    @fg.l
    public static final RectF y(@fg.l RectF rectF, @fg.l PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @fg.l
    public static final RectF z(@fg.l RectF rectF, @fg.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}

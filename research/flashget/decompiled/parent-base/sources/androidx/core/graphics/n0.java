package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Point.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0086\n¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0086\n¢\u0006\u0004\b\t\u0010\b\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0014\u0010\f\u001a\u001c\u0010\u0015\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\u0015\u0010\u000e\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0011\u001a\u001c\u0010\u0017\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0014\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0005*\u00020\u0005H\u0086\n¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\u0013\u001a\u001c\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u001c\u0010 \u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b \u0010\u0013\u001a\u0014\u0010!\u001a\u00020\u0005*\u00020\u0000H\u0086\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010#\u001a\u00020\u0000*\u00020\u0005H\u0086\b¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroid/graphics/Point;", "", "b", "(Landroid/graphics/Point;)I", "d", "Landroid/graphics/PointF;", "", "a", "(Landroid/graphics/PointF;)F", "c", "p", "l", "(Landroid/graphics/Point;Landroid/graphics/Point;)Landroid/graphics/Point;", "n", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "xy", "k", "(Landroid/graphics/Point;I)Landroid/graphics/Point;", "m", "(Landroid/graphics/PointF;F)Landroid/graphics/PointF;", "h", "j", "g", "i", "s", "(Landroid/graphics/Point;)Landroid/graphics/Point;", "t", "(Landroid/graphics/PointF;)Landroid/graphics/PointF;", "scalar", "o", "(Landroid/graphics/Point;F)Landroid/graphics/Point;", "e", "f", "r", "(Landroid/graphics/Point;)Landroid/graphics/PointF;", "q", "(Landroid/graphics/PointF;)Landroid/graphics/Point;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Point.kt\nandroidx/core/graphics/PointKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* loaded from: classes3.dex */
public final class n0 {
    public static final float a(@fg.l PointF pointF) {
        return pointF.x;
    }

    public static final int b(@fg.l Point point) {
        return point.x;
    }

    public static final float c(@fg.l PointF pointF) {
        return pointF.y;
    }

    public static final int d(@fg.l Point point) {
        return point.y;
    }

    @fg.l
    public static final Point e(@fg.l Point point, float f4) {
        return new Point(Math.round(point.x / f4), Math.round(point.y / f4));
    }

    @fg.l
    public static final PointF f(@fg.l PointF pointF, float f4) {
        return new PointF(pointF.x / f4, pointF.y / f4);
    }

    @fg.l
    public static final Point g(@fg.l Point point, int i4) {
        Point point2 = new Point(point.x, point.y);
        int i5 = -i4;
        point2.offset(i5, i5);
        return point2;
    }

    @fg.l
    public static final Point h(@fg.l Point point, @fg.l Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @fg.l
    public static final PointF i(@fg.l PointF pointF, float f4) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f5 = -f4;
        pointF2.offset(f5, f5);
        return pointF2;
    }

    @fg.l
    public static final PointF j(@fg.l PointF pointF, @fg.l PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @fg.l
    public static final Point k(@fg.l Point point, int i4) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i4, i4);
        return point2;
    }

    @fg.l
    public static final Point l(@fg.l Point point, @fg.l Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @fg.l
    public static final PointF m(@fg.l PointF pointF, float f4) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f4, f4);
        return pointF2;
    }

    @fg.l
    public static final PointF n(@fg.l PointF pointF, @fg.l PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @fg.l
    public static final Point o(@fg.l Point point, float f4) {
        return new Point(Math.round(point.x * f4), Math.round(point.y * f4));
    }

    @fg.l
    public static final PointF p(@fg.l PointF pointF, float f4) {
        return new PointF(pointF.x * f4, pointF.y * f4);
    }

    @fg.l
    public static final Point q(@fg.l PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @fg.l
    public static final PointF r(@fg.l Point point) {
        return new PointF(point);
    }

    @fg.l
    public static final Point s(@fg.l Point point) {
        return new Point(-point.x, -point.y);
    }

    @fg.l
    public static final PointF t(@fg.l PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }
}

package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;

/* compiled from: Point.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\n\u001a\r\u0010\u0012\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0004*\u00020\u0004H\u0086\n\u001a\r\u0010\u0013\u001a\u00020\u0004*\u00020\u0000H\u0086\b\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0004H\u0086\b¨\u0006\u0015"}, d2 = {"Landroid/graphics/Point;", "", "b", "d", "Landroid/graphics/PointF;", "", "a", "c", "p", "j", "l", "xy", "i", "k", "f", "h", "e", "g", "o", "n", "m", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class g2 {
    public static final float a(@d5.d PointF pointF) {
        kotlin.jvm.internal.l0.p(pointF, "<this>");
        return pointF.x;
    }

    public static final int b(@d5.d Point point) {
        kotlin.jvm.internal.l0.p(point, "<this>");
        return point.x;
    }

    public static final float c(@d5.d PointF pointF) {
        kotlin.jvm.internal.l0.p(pointF, "<this>");
        return pointF.y;
    }

    public static final int d(@d5.d Point point) {
        kotlin.jvm.internal.l0.p(point, "<this>");
        return point.y;
    }

    @d5.d
    public static final Point e(@d5.d Point point, int i5) {
        kotlin.jvm.internal.l0.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i6 = -i5;
        point2.offset(i6, i6);
        return point2;
    }

    @d5.d
    public static final Point f(@d5.d Point point, @d5.d Point p5) {
        kotlin.jvm.internal.l0.p(point, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        Point point2 = new Point(point.x, point.y);
        point2.offset(-p5.x, -p5.y);
        return point2;
    }

    @d5.d
    public static final PointF g(@d5.d PointF pointF, float f6) {
        kotlin.jvm.internal.l0.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f7 = -f6;
        pointF2.offset(f7, f7);
        return pointF2;
    }

    @d5.d
    public static final PointF h(@d5.d PointF pointF, @d5.d PointF p5) {
        kotlin.jvm.internal.l0.p(pointF, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(-p5.x, -p5.y);
        return pointF2;
    }

    @d5.d
    public static final Point i(@d5.d Point point, int i5) {
        kotlin.jvm.internal.l0.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i5, i5);
        return point2;
    }

    @d5.d
    public static final Point j(@d5.d Point point, @d5.d Point p5) {
        kotlin.jvm.internal.l0.p(point, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        Point point2 = new Point(point.x, point.y);
        point2.offset(p5.x, p5.y);
        return point2;
    }

    @d5.d
    public static final PointF k(@d5.d PointF pointF, float f6) {
        kotlin.jvm.internal.l0.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f6, f6);
        return pointF2;
    }

    @d5.d
    public static final PointF l(@d5.d PointF pointF, @d5.d PointF p5) {
        kotlin.jvm.internal.l0.p(pointF, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(p5.x, p5.y);
        return pointF2;
    }

    @d5.d
    public static final Point m(@d5.d PointF pointF) {
        kotlin.jvm.internal.l0.p(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @d5.d
    public static final PointF n(@d5.d Point point) {
        kotlin.jvm.internal.l0.p(point, "<this>");
        return new PointF(point);
    }

    @d5.d
    public static final Point o(@d5.d Point point) {
        kotlin.jvm.internal.l0.p(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    @d5.d
    public static final PointF p(@d5.d PointF pointF) {
        kotlin.jvm.internal.l0.p(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}

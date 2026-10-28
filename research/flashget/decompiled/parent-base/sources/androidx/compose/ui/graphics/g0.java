package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.graphics.n5;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010\u001eJ\u001a\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J:\u00100\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101J\"\u00104\u001a\u00020\t2\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0014\u00107\u001a\u000206*\u00020.ø\u0001\u0000¢\u0006\u0004\b7\u00108J*\u0010;\u001a\u00020\t2\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b;\u0010<J7\u0010=\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b=\u0010>JG\u0010A\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bA\u0010BJ7\u0010C\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010>J*\u0010F\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJO\u0010L\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020J2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\t2\u0006\u00103\u001a\u0002022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010OJ*\u0010S\u001a\u00020\t2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bS\u0010TJB\u0010[\u001a\u00020\t2\u0006\u0010Q\u001a\u00020P2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020U2\u0006\u0010Z\u001a\u00020W2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J0\u0010_\u001a\u00020\t2\u0006\u0010^\u001a\u00020]2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\tH\u0016¢\u0006\u0004\ba\u0010\u0003J\u000f\u0010b\u001a\u00020\tH\u0016¢\u0006\u0004\bb\u0010\u0003J*\u0010c\u001a\u00020\t2\u0006\u0010^\u001a\u00020]2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ*\u0010i\u001a\u00020\t2\u0006\u0010f\u001a\u00020e2\u0006\u0010h\u001a\u00020g2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bi\u0010jR,\u0010s\u001a\u00060kj\u0002`l8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010m\u0012\u0004\br\u0010\u0003\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010u\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006x"}, d2 = {"Landroidx/compose/ui/graphics/g0;", "Landroidx/compose/ui/graphics/v1;", "<init>", "()V", "", "Li0/f;", "points", "Landroidx/compose/ui/graphics/d5;", "paint", "Lkotlin/k2;", "P", "(Ljava/util/List;Landroidx/compose/ui/graphics/d5;)V", "", "stepBy", "a", "(Ljava/util/List;Landroidx/compose/ui/graphics/d5;I)V", "", "R", "([FLandroidx/compose/ui/graphics/d5;I)V", "Q", "C", "o", "Li0/i;", "bounds", "z", "(Li0/i;Landroidx/compose/ui/graphics/d5;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "d", "degrees", "y", "(F)V", "B", "Landroidx/compose/ui/graphics/y4;", "matrix", "E", "([F)V", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/c2;", "clipOp", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/g5;", "path", "c", "(Landroidx/compose/ui/graphics/g5;I)V", "Landroid/graphics/Region$Op;", "V", "(I)Landroid/graphics/Region$Op;", "p1", "p2", "w", "(JJLandroidx/compose/ui/graphics/d5;)V", "e", "(FFFFLandroidx/compose/ui/graphics/d5;)V", "radiusX", "radiusY", "O", "(FFFFFFLandroidx/compose/ui/graphics/d5;)V", "f", "center", "radius", "K", "(JFLandroidx/compose/ui/graphics/d5;)V", "startAngle", "sweepAngle", "", "useCenter", "r", "(FFFFFFZLandroidx/compose/ui/graphics/d5;)V", "J", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/s4;", "image", "topLeftOffset", "i", "(Landroidx/compose/ui/graphics/s4;JLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "dstOffset", "dstSize", "h", "(Landroidx/compose/ui/graphics/s4;JJJJLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/n5;", "pointMode", "g", "(ILjava/util/List;Landroidx/compose/ui/graphics/d5;)V", "t", "D", "j", "(I[FLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/s6;", "vertices", "Landroidx/compose/ui/graphics/k1;", "blendMode", "k", "(Landroidx/compose/ui/graphics/s6;ILandroidx/compose/ui/graphics/d5;)V", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "S", "()Landroid/graphics/Canvas;", "U", "(Landroid/graphics/Canvas;)V", "T", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
@kotlin.jvm.internal.r1({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,435:1\n35#2,5:436\n35#2,5:441\n33#3,6:446\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:436,5\n242#1:441,5\n319#1:446,6\n*E\n"})
/* loaded from: classes.dex */
public final class g0 implements v1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Canvas internalCanvas;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Rect srcRect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Rect dstRect;

    public g0() {
        Canvas canvas;
        canvas = h0.f17841a;
        this.internalCanvas = canvas;
    }

    private final void P(List<i0.f> points, d5 paint) {
        int size = points.size();
        for (int i4 = 0; i4 < size; i4++) {
            long packedValue = points.get(i4).getPackedValue();
            this.internalCanvas.drawPoint(i0.f.p(packedValue), i0.f.r(packedValue), paint.getInternalPaint());
        }
    }

    private final void Q(float[] points, d5 paint, int stepBy) {
        if (points.length < 4 || points.length % 2 != 0) {
            return;
        }
        Paint internalPaint = paint.getInternalPaint();
        int i4 = 0;
        while (i4 < points.length - 3) {
            this.internalCanvas.drawLine(points[i4], points[i4 + 1], points[i4 + 2], points[i4 + 3], internalPaint);
            i4 += stepBy * 2;
        }
    }

    private final void R(float[] points, d5 paint, int stepBy) {
        if (points.length % 2 == 0) {
            Paint internalPaint = paint.getInternalPaint();
            int i4 = 0;
            while (i4 < points.length - 1) {
                this.internalCanvas.drawPoint(points[i4], points[i4 + 1], internalPaint);
                i4 += stepBy;
            }
        }
    }

    @kotlin.w0
    public static /* synthetic */ void T() {
    }

    private final void a(List<i0.f> points, d5 paint, int stepBy) {
        if (points.size() >= 2) {
            Paint internalPaint = paint.getInternalPaint();
            int i4 = 0;
            while (i4 < points.size() - 1) {
                long packedValue = points.get(i4).getPackedValue();
                long packedValue2 = points.get(i4 + 1).getPackedValue();
                this.internalCanvas.drawLine(i0.f.p(packedValue), i0.f.r(packedValue), i0.f.p(packedValue2), i0.f.r(packedValue2), internalPaint);
                i4 += stepBy;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.v1
    public void B(float sx, float sy) {
        this.internalCanvas.skew(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.v1
    public void C() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void D() {
        y1.f18465a.a(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.v1
    public void E(@fg.l float[] matrix) {
        if (z4.c(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        s0.a(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.v1
    public void J(@fg.l g5 path, @fg.l d5 paint) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof v0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((v0) path).getInternalPath(), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void K(long center, float radius, @fg.l d5 paint) {
        this.internalCanvas.drawCircle(i0.f.p(center), i0.f.r(center), radius, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void O(float left, float top2, float right, float bottom, float radiusX, float radiusY, @fg.l d5 paint) {
        this.internalCanvas.drawRoundRect(left, top2, right, bottom, radiusX, radiusY, paint.getInternalPaint());
    }

    @fg.l
    /* renamed from: S, reason: from getter */
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void U(@fg.l Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @fg.l
    public final Region.Op V(int i4) {
        c2.INSTANCE.getClass();
        return c2.f(i4, c2.f17636c) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.v1
    public void b(float left, float top2, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top2, right, bottom, V(clipOp));
    }

    @Override // androidx.compose.ui.graphics.v1
    public void c(@fg.l g5 path, int clipOp) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof v0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((v0) path).getInternalPath(), V(clipOp));
    }

    @Override // androidx.compose.ui.graphics.v1
    public void d(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.v1
    public void e(float left, float top2, float right, float bottom, @fg.l d5 paint) {
        this.internalCanvas.drawRect(left, top2, right, bottom, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void f(float left, float top2, float right, float bottom, @fg.l d5 paint) {
        this.internalCanvas.drawOval(left, top2, right, bottom, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void g(int pointMode, @fg.l List<i0.f> points, @fg.l d5 paint) {
        n5.Companion companion = n5.INSTANCE;
        companion.getClass();
        if (n5.g(pointMode, n5.f17969d)) {
            a(points, paint, 2);
            return;
        }
        companion.getClass();
        if (n5.g(pointMode, n5.f17970e)) {
            a(points, paint, 1);
            return;
        }
        companion.getClass();
        if (n5.g(pointMode, n5.f17968c)) {
            P(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.v1
    public void h(@fg.l s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @fg.l d5 paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        Canvas canvas = this.internalCanvas;
        Bitmap b5 = r0.b(image);
        Rect rect = this.srcRect;
        kotlin.jvm.internal.l0.m(rect);
        rect.left = androidx.compose.ui.unit.q.m(srcOffset);
        int i4 = (int) (srcOffset & 4294967295L);
        rect.top = i4;
        rect.right = androidx.compose.ui.unit.u.m(srcSize) + ((int) (srcOffset >> 32));
        rect.bottom = i4 + ((int) (srcSize & 4294967295L));
        kotlin.k2 k2Var = kotlin.k2.f75408a;
        Rect rect2 = this.dstRect;
        kotlin.jvm.internal.l0.m(rect2);
        int i5 = (int) (dstOffset >> 32);
        rect2.left = i5;
        int i6 = (int) (dstOffset & 4294967295L);
        rect2.top = i6;
        rect2.right = i5 + ((int) (dstSize >> 32));
        rect2.bottom = i6 + ((int) (dstSize & 4294967295L));
        canvas.drawBitmap(b5, rect, rect2, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void i(@fg.l s4 image, long topLeftOffset, @fg.l d5 paint) {
        this.internalCanvas.drawBitmap(r0.b(image), i0.f.p(topLeftOffset), i0.f.r(topLeftOffset), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void j(int pointMode, @fg.l float[] points, @fg.l d5 paint) {
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        n5.Companion companion = n5.INSTANCE;
        companion.getClass();
        if (n5.g(pointMode, n5.f17969d)) {
            Q(points, paint, 2);
            return;
        }
        companion.getClass();
        if (n5.g(pointMode, n5.f17970e)) {
            Q(points, paint, 1);
            return;
        }
        companion.getClass();
        if (n5.g(pointMode, n5.f17968c)) {
            R(points, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.v1
    public void k(@fg.l s6 vertices, int blendMode, @fg.l d5 paint) {
        this.internalCanvas.drawVertices(g1.a(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void o() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void r(float left, float top2, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @fg.l d5 paint) {
        this.internalCanvas.drawArc(left, top2, right, bottom, startAngle, sweepAngle, useCenter, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void t() {
        y1.f18465a.a(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.v1
    public void translate(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.v1
    public void w(long p12, long p22, @fg.l d5 paint) {
        this.internalCanvas.drawLine(i0.f.p(p12), i0.f.r(p12), i0.f.p(p22), i0.f.r(p22), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.v1
    public void y(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.v1
    public void z(@fg.l i0.i bounds, @fg.l d5 paint) {
        this.internalCanvas.saveLayer(bounds.t(), bounds.getTop(), bounds.x(), bounds.j(), paint.getInternalPaint(), 31);
    }
}

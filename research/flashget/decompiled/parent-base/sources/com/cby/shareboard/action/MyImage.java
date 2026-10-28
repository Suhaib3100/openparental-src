package com.cby.shareboard.action;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.v;

/* compiled from: MyImage.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010 J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017¢\u0006\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/cby/shareboard/action/MyImage;", "Lcom/cby/shareboard/action/Action;", "<init>", "()V", "Landroid/graphics/Rect;", "getSrc", "()Landroid/graphics/Rect;", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "getDst", "(Landroid/graphics/Canvas;)Landroid/graphics/RectF;", "Landroid/graphics/Matrix;", "matrix", "()Landroid/graphics/Matrix;", "", "id", "Landroid/graphics/Bitmap;", "bitmap", "", "x", "y", "scale", "", "color", "size", "build", "(JLandroid/graphics/Bitmap;FFFIF)Lcom/cby/shareboard/action/Action;", "sx", "sy", "Lkotlin/k2;", "onStart", "(FF)V", "mx", "my", "onMove", "onDraw", "(Landroid/graphics/Canvas;)V", "", "isStarted", "()Z", "width", "height", "setSize", "(II)V", "mBitmap", "Landroid/graphics/Bitmap;", "mMatrix", "Landroid/graphics/Matrix;", "mBitmapWidth", "I", "mBitmapHeight", "mSrc", "Landroid/graphics/Rect;", "mDst", "Landroid/graphics/RectF;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MyImage extends Action {

    @m
    private Bitmap mBitmap;
    private int mBitmapHeight;
    private int mBitmapWidth;

    @m
    private RectF mDst;

    @m
    private Matrix mMatrix;

    @m
    private Rect mSrc;

    private final RectF getDst(Canvas canvas) {
        int i4;
        float f4;
        int i5;
        if (this.mDst == null) {
            float scale = this.mBitmapWidth * getScale();
            float scale2 = this.mBitmapHeight * getScale();
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            float f5 = width;
            float f6 = 0.0f;
            if (f5 > scale) {
                f4 = Math.abs(f5 - scale) / 2;
                i4 = (int) (f4 + scale);
            } else {
                i4 = width;
                f4 = 0.0f;
            }
            float f7 = height;
            if (f7 > scale2) {
                f6 = Math.abs(f7 - scale2) / 2;
                i5 = (int) (f6 + scale2);
            } else {
                i5 = height;
            }
            this.mDst = new RectF(f4, f6, i4, i5);
            float scale3 = getScale();
            RectF rectF = this.mDst;
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ବ"));
            sb.append(scale3);
            sb.append(ProtectedSandApp.s("ଭ"));
            sb.append(width);
            String s4 = ProtectedSandApp.s("ମ");
            sb.append(s4);
            sb.append(height);
            sb.append(ProtectedSandApp.s("ଯ"));
            sb.append(scale);
            sb.append(s4);
            sb.append(scale2);
            sb.append(ProtectedSandApp.s("ର"));
            sb.append(rectF);
            sb.append(ProtectedSandApp.s("\u0b31"));
            getLogger().debug(v.p(sb.toString()));
        }
        RectF rectF2 = this.mDst;
        l0.m(rectF2);
        return rectF2;
    }

    private final Rect getSrc() {
        if (this.mSrc == null) {
            this.mSrc = new Rect(0, 0, this.mBitmapWidth, this.mBitmapHeight);
            getLogger().debug(ProtectedSandApp.s("ଲ") + this.mSrc);
        }
        Rect rect = this.mSrc;
        l0.m(rect);
        return rect;
    }

    private final Matrix matrix() {
        if (this.mMatrix == null) {
            this.mMatrix = new Matrix();
        }
        Matrix matrix = this.mMatrix;
        l0.m(matrix);
        matrix.reset();
        Matrix matrix2 = this.mMatrix;
        l0.m(matrix2);
        matrix2.postScale(getScale(), getScale());
        Matrix matrix3 = this.mMatrix;
        l0.m(matrix3);
        matrix3.postTranslate(getStartX(), getStartY());
        Matrix matrix4 = this.mMatrix;
        l0.m(matrix4);
        return matrix4;
    }

    @l
    public final Action build(long id2, @m Bitmap bitmap, float x4, float y4, float scale, int color, float size) {
        super.build(id2, x4, y4, scale, color, size);
        Bitmap bitmap2 = this.mBitmap;
        if (bitmap2 != null) {
            bitmap2.eraseColor(0);
        }
        this.mBitmap = bitmap;
        if (bitmap != null) {
            l0.m(bitmap);
            this.mBitmapWidth = bitmap.getWidth();
            Bitmap bitmap3 = this.mBitmap;
            l0.m(bitmap3);
            this.mBitmapHeight = bitmap3.getHeight();
            this.mSrc = new Rect(0, 0, this.mBitmapWidth, this.mBitmapHeight);
        }
        this.mMatrix = new Matrix();
        return this;
    }

    @Override // com.cby.shareboard.action.Action
    public boolean isStarted() {
        return true;
    }

    @Override // com.cby.shareboard.action.Action
    public void onDraw(@l Canvas canvas) {
        l0.p(canvas, ProtectedSandApp.s("ଳ"));
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null) {
            log(ProtectedSandApp.s("\u0b34"));
            return;
        }
        if (this.mBitmapWidth == 0 || this.mBitmapHeight == 0) {
            l0.m(bitmap);
            canvas.drawBitmap(bitmap, matrix(), null);
        } else {
            l0.m(bitmap);
            canvas.drawBitmap(bitmap, getSrc(), getDst(canvas), (Paint) null);
        }
    }

    @Override // com.cby.shareboard.action.Action
    public void onMove(float mx, float my) {
    }

    @Override // com.cby.shareboard.action.Action
    public void onStart(float sx, float sy) {
    }

    public final void setSize(int width, int height) {
        this.mBitmapWidth = width;
        this.mBitmapHeight = height;
    }
}

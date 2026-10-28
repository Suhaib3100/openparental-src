package com.cby.shareboard.action;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MyEraser.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006#"}, d2 = {"Lcom/cby/shareboard/action/MyEraser;", "Lcom/cby/shareboard/action/Action;", "<init>", "()V", "", "id", "", "x", "y", "scale", "", "color", "size", "build", "(JFFFIF)Lcom/cby/shareboard/action/Action;", "sx", "sy", "Lkotlin/k2;", "onStart", "(FF)V", "mx", "my", "onMove", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "isStarted", "()Z", "clear", "Landroid/graphics/Path;", "mPath", "Landroid/graphics/Path;", "F", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MyEraser extends Action {

    @m
    private Path mPath;
    private float sx;
    private float sy;

    @Override // com.cby.shareboard.action.Action
    @l
    public Action build(long id2, float x4, float y4, float scale, int color, float size) {
        super.build(id2, x4, y4, scale, color, size);
        this.mPath = new Path();
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            mPaint.setColor(0);
            mPaint.setDither(true);
            mPaint.setStrokeJoin(Paint.Join.ROUND);
            mPaint.setStrokeCap(Paint.Cap.ROUND);
            mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        return this;
    }

    @Override // com.cby.shareboard.action.Action
    public void clear() {
        super.clear();
        this.mPath = null;
    }

    @Override // com.cby.shareboard.action.Action
    public boolean isStarted() {
        return true;
    }

    @Override // com.cby.shareboard.action.Action
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@l Canvas canvas) {
        l0.p(canvas, ProtectedSandApp.s("ଥ"));
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            Path path = this.mPath;
            l0.m(path);
            canvas.drawPath(path, mPaint);
            log(ProtectedSandApp.s("ଦ") + getStartX() + ProtectedSandApp.s("ଧ") + getStartY() + ProtectedSandApp.s("ନ") + getEndX() + ProtectedSandApp.s("\u0b29") + getEndY() + ProtectedSandApp.s("ପ") + mPaint.getColor() + ProtectedSandApp.s("ଫ") + mPaint.getStrokeWidth());
        }
    }

    @Override // com.cby.shareboard.action.Action
    public void onMove(float mx, float my) {
        this.sx = mx * getScale();
        this.sy = my * getScale();
        if (getSmooth()) {
            Path path = this.mPath;
            if (path != null) {
                float f4 = 2;
                path.quadTo(getEndX(), getEndY(), (getEndX() + this.sx) / f4, (getEndY() + this.sy) / f4);
            }
        } else {
            Path path2 = this.mPath;
            if (path2 != null) {
                path2.lineTo(this.sx, this.sy);
            }
        }
        setEndX(this.sx);
        setEndY(this.sy);
    }

    @Override // com.cby.shareboard.action.Action
    public void onStart(float sx, float sy) {
        setStartX(sx * getScale());
        setStartY(sy * getScale());
        Path path = this.mPath;
        if (path != null) {
            path.moveTo(getStartX(), getStartY());
        }
        setEndX(getStartX());
        setEndY(getStartY());
    }
}

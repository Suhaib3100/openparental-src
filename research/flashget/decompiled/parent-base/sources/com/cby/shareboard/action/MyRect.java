package com.cby.shareboard.action;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MyRect.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/cby/shareboard/action/MyRect;", "Lcom/cby/shareboard/action/Action;", "<init>", "()V", "", "isFill", "", "id", "", "x", "y", "scale", "", "color", "size", "build", "(ZJFFFIF)Lcom/cby/shareboard/action/Action;", "sx", "sy", "Lkotlin/k2;", "onStart", "(FF)V", "mx", "my", "onMove", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "isStarted", "()Z", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MyRect extends Action {
    @l
    public final Action build(boolean isFill, long id2, float x4, float y4, float scale, int color, float size) {
        super.build(id2, x4, y4, scale, color, size);
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            mPaint.setStyle(isFill ? Paint.Style.FILL : Paint.Style.STROKE);
        }
        return this;
    }

    @Override // com.cby.shareboard.action.Action
    public boolean isStarted() {
        return !isPoint();
    }

    @Override // com.cby.shareboard.action.Action
    public void onDraw(@l Canvas canvas) {
        l0.p(canvas, ProtectedSandApp.s("ୈ"));
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            canvas.drawRect(getStartX(), getStartY(), getEndX(), getEndY(), mPaint);
            log(ProtectedSandApp.s("\u0b49") + getStartX() + ProtectedSandApp.s("\u0b4a") + getStartY() + ProtectedSandApp.s("ୋ") + getEndX() + ProtectedSandApp.s("ୌ") + getEndY() + ProtectedSandApp.s("୍") + mPaint.getColor() + ProtectedSandApp.s("\u0b4e") + mPaint.getStrokeWidth());
        }
    }

    @Override // com.cby.shareboard.action.Action
    public void onMove(float mx, float my) {
        setEndX(mx * getScale());
        setEndY(my * getScale());
    }

    @Override // com.cby.shareboard.action.Action
    public void onStart(float sx, float sy) {
        setStartX(sx * getScale());
        setStartY(sy * getScale());
    }
}

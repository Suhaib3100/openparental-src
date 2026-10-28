package com.cby.shareboard.action;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MyPoint.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/cby/shareboard/action/MyPoint;", "Lcom/cby/shareboard/action/Action;", "<init>", "()V", "", "sx", "sy", "Lkotlin/k2;", "onStart", "(FF)V", "mx", "my", "onMove", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "isStarted", "()Z", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MyPoint extends Action {
    @Override // com.cby.shareboard.action.Action
    public boolean isStarted() {
        return isPoint();
    }

    @Override // com.cby.shareboard.action.Action
    public void onDraw(@l Canvas canvas) {
        l0.p(canvas, ProtectedSandApp.s("ୃ"));
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            canvas.drawPoint(getStartX(), getStartY(), mPaint);
            log(ProtectedSandApp.s("ୄ") + getStartX() + ProtectedSandApp.s("\u0b45") + getStartY() + ProtectedSandApp.s("\u0b46") + mPaint.getColor() + ProtectedSandApp.s("େ") + mPaint.getStrokeWidth());
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

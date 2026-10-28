package com.yalantis.ucrop.util;

import android.view.MotionEvent;
import androidx.annotation.o0;

/* loaded from: classes7.dex */
public class RotationGestureDetector {
    private static final int INVALID_POINTER_INDEX = -1;
    private float fX;
    private float fY;
    private float mAngle;
    private boolean mIsFirstTouch;
    private OnRotationGestureListener mListener;
    private int mPointerIndex1 = -1;
    private int mPointerIndex2 = -1;
    private float sX;
    private float sY;

    public interface OnRotationGestureListener {
        boolean onRotation(RotationGestureDetector rotationGestureDetector);
    }

    public static class SimpleOnRotationGestureListener implements OnRotationGestureListener {
        @Override // com.yalantis.ucrop.util.RotationGestureDetector.OnRotationGestureListener
        public boolean onRotation(RotationGestureDetector rotationGestureDetector) {
            return false;
        }
    }

    public RotationGestureDetector(OnRotationGestureListener onRotationGestureListener) {
        this.mListener = onRotationGestureListener;
    }

    private float calculateAngleBetweenLines(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13) {
        return calculateAngleDelta((float) Math.toDegrees((float) Math.atan2(f5 - f7, f4 - f6)), (float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)));
    }

    private float calculateAngleDelta(float f4, float f5) {
        float f6 = (f5 % 360.0f) - (f4 % 360.0f);
        this.mAngle = f6;
        if (f6 < -180.0f) {
            this.mAngle = f6 + 360.0f;
        } else if (f6 > 180.0f) {
            this.mAngle = f6 - 360.0f;
        }
        return this.mAngle;
    }

    public float getAngle() {
        return this.mAngle;
    }

    public boolean onTouchEvent(@o0 MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.sX = motionEvent.getX();
            this.sY = motionEvent.getY();
            this.mPointerIndex1 = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.mAngle = 0.0f;
            this.mIsFirstTouch = true;
        } else if (actionMasked == 1) {
            this.mPointerIndex1 = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.fX = motionEvent.getX();
                this.fY = motionEvent.getY();
                this.mPointerIndex2 = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.mAngle = 0.0f;
                this.mIsFirstTouch = true;
            } else if (actionMasked == 6) {
                this.mPointerIndex2 = -1;
            }
        } else if (this.mPointerIndex1 != -1 && this.mPointerIndex2 != -1 && motionEvent.getPointerCount() > this.mPointerIndex2) {
            float x4 = motionEvent.getX(this.mPointerIndex1);
            float y4 = motionEvent.getY(this.mPointerIndex1);
            float x5 = motionEvent.getX(this.mPointerIndex2);
            float y5 = motionEvent.getY(this.mPointerIndex2);
            if (this.mIsFirstTouch) {
                this.mAngle = 0.0f;
                this.mIsFirstTouch = false;
            } else {
                calculateAngleBetweenLines(this.fX, this.fY, this.sX, this.sY, x5, y5, x4, y4);
            }
            OnRotationGestureListener onRotationGestureListener = this.mListener;
            if (onRotationGestureListener != null) {
                onRotationGestureListener.onRotation(this);
            }
            this.fX = x5;
            this.fY = y5;
            this.sX = x4;
            this.sY = y4;
        }
        return true;
    }
}

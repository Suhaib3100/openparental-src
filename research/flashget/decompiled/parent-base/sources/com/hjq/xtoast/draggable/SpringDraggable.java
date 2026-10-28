package com.hjq.xtoast.draggable;

import android.animation.ValueAnimator;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class SpringDraggable extends BaseDraggable {
    private boolean mMoveTouch;
    private final int mOrientation;
    private float mViewDownX;
    private float mViewDownY;

    public SpringDraggable() {
        this(0);
    }

    private void startHorizontalAnimation(float f4, float f5, final float f6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f5);
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.hjq.xtoast.draggable.SpringDraggable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SpringDraggable.this.updateLocation(((Float) valueAnimator.getAnimatedValue()).floatValue(), f6);
            }
        });
        ofFloat.start();
    }

    private void startVerticalAnimation(final float f4, float f5, float f6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f6);
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.hjq.xtoast.draggable.SpringDraggable.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SpringDraggable.this.updateLocation(f4, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r5 != 3) goto L33;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            int r5 = r6.getAction()
            r0 = 0
            if (r5 == 0) goto L97
            r1 = 1
            if (r5 == r1) goto L48
            r2 = 2
            if (r5 == r2) goto L12
            r2 = 3
            if (r5 == r2) goto L48
            goto La5
        L12:
            float r5 = r6.getRawX()
            int r2 = r4.getWindowInvisibleWidth()
            float r2 = (float) r2
            float r5 = r5 - r2
            float r2 = r6.getRawY()
            int r3 = r4.getWindowInvisibleHeight()
            float r3 = (float) r3
            float r2 = r2 - r3
            float r3 = r4.mViewDownX
            float r5 = r5 - r3
            float r3 = r4.mViewDownY
            float r2 = r2 - r3
            r4.updateLocation(r5, r2)
            boolean r5 = r4.mMoveTouch
            if (r5 != 0) goto La5
            float r5 = r4.mViewDownX
            float r2 = r6.getX()
            float r3 = r4.mViewDownY
            float r6 = r6.getY()
            boolean r5 = r4.isTouchMove(r5, r2, r3, r6)
            if (r5 == 0) goto La5
            r4.mMoveTouch = r1
            goto La5
        L48:
            float r5 = r6.getRawX()
            int r0 = r4.getWindowInvisibleWidth()
            float r0 = (float) r0
            float r5 = r5 - r0
            float r6 = r6.getRawY()
            int r0 = r4.getWindowInvisibleHeight()
            float r0 = (float) r0
            float r6 = r6 - r0
            int r0 = r4.mOrientation
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L7d
            if (r0 == r1) goto L66
            goto L94
        L66:
            int r0 = r4.getWindowHeight()
            float r0 = (float) r0
            float r1 = r0 / r3
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L72
            goto L73
        L72:
            r2 = r0
        L73:
            float r0 = r4.mViewDownX
            float r5 = r5 - r0
            float r0 = r4.mViewDownY
            float r6 = r6 - r0
            r4.startVerticalAnimation(r5, r6, r2)
            goto L94
        L7d:
            int r0 = r4.getWindowWidth()
            float r0 = (float) r0
            float r1 = r0 / r3
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L89
            goto L8a
        L89:
            r2 = r0
        L8a:
            float r0 = r4.mViewDownX
            float r5 = r5 - r0
            float r2 = r2 - r0
            float r0 = r4.mViewDownY
            float r6 = r6 - r0
            r4.startHorizontalAnimation(r5, r2, r6)
        L94:
            boolean r5 = r4.mMoveTouch
            return r5
        L97:
            float r5 = r6.getX()
            r4.mViewDownX = r5
            float r5 = r6.getY()
            r4.mViewDownY = r5
            r4.mMoveTouch = r0
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hjq.xtoast.draggable.SpringDraggable.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public SpringDraggable(int i4) {
        this.mOrientation = i4;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᑣ\u0001"));
        }
    }
}

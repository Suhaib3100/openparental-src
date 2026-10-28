package com.hjq.xtoast.draggable;

/* loaded from: classes6.dex */
public class MovingDraggable extends BaseDraggable {
    private boolean mMoveTouch;
    private float mViewDownX;
    private float mViewDownY;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r5 != 3) goto L19;
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
            if (r5 == 0) goto L4a
            r1 = 1
            if (r5 == r1) goto L47
            r2 = 2
            if (r5 == r2) goto L11
            r6 = 3
            if (r5 == r6) goto L47
            goto L58
        L11:
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
            if (r5 != 0) goto L58
            float r5 = r4.mViewDownX
            float r2 = r6.getX()
            float r3 = r4.mViewDownY
            float r6 = r6.getY()
            boolean r5 = r4.isTouchMove(r5, r2, r3, r6)
            if (r5 == 0) goto L58
            r4.mMoveTouch = r1
            goto L58
        L47:
            boolean r5 = r4.mMoveTouch
            return r5
        L4a:
            float r5 = r6.getX()
            r4.mViewDownX = r5
            float r5 = r6.getY()
            r4.mViewDownY = r5
            r4.mMoveTouch = r0
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hjq.xtoast.draggable.MovingDraggable.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

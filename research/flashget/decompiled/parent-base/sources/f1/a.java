package f1;

import android.text.method.LinkMovementMethod;
import androidx.annotation.o0;

/* compiled from: LinkMovementMethodCompat.java */
/* loaded from: classes3.dex */
public class a extends LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    private static a f73853a;

    private a() {
    }

    @o0
    public static a a() {
        if (f73853a == null) {
            f73853a = new a();
        }
        return f73853a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r2 <= r1.getLineRight(r0)) goto L18;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    @androidx.annotation.s0(markerClass = {androidx.core.os.b.InterfaceC0422b.class})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.q0 android.widget.TextView r5, @androidx.annotation.q0 android.text.Spannable r6, @androidx.annotation.q0 android.view.MotionEvent r7) {
        /*
            r4 = this;
            boolean r0 = androidx.core.os.b.m()
            if (r0 != 0) goto L57
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == r1) goto Lf
            if (r0 != 0) goto L57
        Lf:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r5.getTotalPaddingLeft()
            int r0 = r0 - r2
            int r2 = r5.getTotalPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.getScrollX()
            int r2 = r2 + r0
            int r0 = r5.getScrollY()
            int r0 = r0 + r1
            android.text.Layout r1 = r5.getLayout()
            if (r0 < 0) goto L4f
            int r3 = r1.getHeight()
            if (r0 <= r3) goto L3a
            goto L4f
        L3a:
            int r0 = r1.getLineForVertical(r0)
            float r2 = (float) r2
            float r3 = r1.getLineLeft(r0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L4f
            float r0 = r1.getLineRight(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L57
        L4f:
            android.text.Selection.removeSelection(r6)
            boolean r5 = android.text.method.Touch.onTouchEvent(r5, r6, r7)
            return r5
        L57:
            boolean r5 = super.onTouchEvent(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.a.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}

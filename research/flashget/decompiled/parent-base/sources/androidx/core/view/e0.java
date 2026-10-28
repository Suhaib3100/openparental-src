package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: GestureDetectorCompat.java */
@Deprecated
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final GestureDetector f27126a;

    public e0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.f27126a.isLongpressEnabled();
    }

    public boolean b(@androidx.annotation.o0 MotionEvent motionEvent) {
        return this.f27126a.onTouchEvent(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z4) {
        this.f27126a.setIsLongpressEnabled(z4);
    }

    public void d(@androidx.annotation.q0 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f27126a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public e0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 GestureDetector.OnGestureListener onGestureListener, @androidx.annotation.q0 Handler handler) {
        this.f27126a = new GestureDetector(context, onGestureListener, handler);
    }
}

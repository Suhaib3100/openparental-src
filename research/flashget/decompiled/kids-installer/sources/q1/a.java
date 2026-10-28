package q1;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: InsetDialogOnTouchListener.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final Dialog f32524o;

    /* renamed from: p, reason: collision with root package name */
    private final int f32525p;

    /* renamed from: q, reason: collision with root package name */
    private final int f32526q;

    /* renamed from: r, reason: collision with root package name */
    private final int f32527r;

    public a(@o0 Dialog dialog, @o0 Rect rect) {
        this.f32524o = dialog;
        this.f32525p = rect.left;
        this.f32526q = rect.top;
        this.f32527r = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@o0 View view, @o0 MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f32525p;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f32526q, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i5 = this.f32527r;
            obtain.setLocation((-i5) - 1, (-i5) - 1);
        }
        view.performClick();
        return this.f32524o.onTouchEvent(obtain);
    }
}

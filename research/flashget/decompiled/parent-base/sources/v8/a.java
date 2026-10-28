package v8;

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
/* loaded from: classes6.dex */
public class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Dialog f92832b;

    /* renamed from: c, reason: collision with root package name */
    private final int f92833c;

    /* renamed from: d, reason: collision with root package name */
    private final int f92834d;

    /* renamed from: e, reason: collision with root package name */
    private final int f92835e;

    public a(@o0 Dialog dialog, @o0 Rect rect) {
        this.f92832b = dialog;
        this.f92833c = rect.left;
        this.f92834d = rect.top;
        this.f92835e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@o0 View view, @o0 MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f92833c;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f92834d, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i4 = this.f92835e;
            obtain.setLocation((-i4) - 1, (-i4) - 1);
        }
        view.performClick();
        return this.f92832b.onTouchEvent(obtain);
    }
}

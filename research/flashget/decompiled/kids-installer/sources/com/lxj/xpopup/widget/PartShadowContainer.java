package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import c3.b;
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.util.h;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class PartShadowContainer extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<Rect> f21398o;

    /* renamed from: p, reason: collision with root package name */
    public BasePopupView f21399p;

    /* renamed from: q, reason: collision with root package name */
    private float f21400q;

    /* renamed from: r, reason: collision with root package name */
    private float f21401r;

    /* renamed from: s, reason: collision with root package name */
    private b f21402s;

    public PartShadowContainer(@o0 Context context) {
        super(context);
    }

    public void a(b listener) {
        this.f21402s = listener;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        b bVar;
        boolean z5 = false;
        View childAt = getChildAt(0);
        int[] iArr = new int[2];
        childAt.getLocationInWindow(iArr);
        int i5 = iArr[0];
        if (!h.F(event.getRawX(), event.getRawY(), new Rect(i5, iArr[1], childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + iArr[1]))) {
            int action = event.getAction();
            if (action == 0) {
                this.f21400q = event.getX();
                this.f21401r = event.getY();
            } else if (action == 1 || action == 2 || action == 3) {
                if (((float) Math.sqrt(Math.pow(event.getY() - this.f21401r, 2.0d) + Math.pow(event.getX() - this.f21400q, 2.0d))) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    ArrayList<Rect> arrayList = this.f21398o;
                    if (arrayList == null || arrayList.isEmpty()) {
                        b bVar2 = this.f21402s;
                        if (bVar2 != null) {
                            bVar2.a();
                        }
                    } else {
                        Iterator<Rect> it = this.f21398o.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (h.F(event.getRawX(), event.getRawY(), it.next())) {
                                z5 = true;
                                break;
                            }
                        }
                        if (!z5 && (bVar = this.f21402s) != null) {
                            bVar.a();
                        }
                    }
                }
                this.f21400q = 0.0f;
                this.f21401r = 0.0f;
            }
        }
        return true;
    }

    public PartShadowContainer(@o0 Context context, @q0 AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PartShadowContainer(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

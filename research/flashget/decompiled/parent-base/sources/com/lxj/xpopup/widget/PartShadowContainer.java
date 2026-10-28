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
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.util.h;
import gb.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class PartShadowContainer extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<Rect> f69888b;

    /* renamed from: c, reason: collision with root package name */
    public BasePopupView f69889c;

    /* renamed from: d, reason: collision with root package name */
    private float f69890d;

    /* renamed from: e, reason: collision with root package name */
    private float f69891e;

    /* renamed from: f, reason: collision with root package name */
    private b f69892f;

    public PartShadowContainer(@o0 Context context) {
        super(context);
    }

    public void a(b listener) {
        this.f69892f = listener;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        View childAt = getChildAt(0);
        int[] iArr = new int[2];
        childAt.getLocationInWindow(iArr);
        int i4 = iArr[0];
        if (!h.F(event.getRawX(), event.getRawY(), new Rect(i4, iArr[1], childAt.getMeasuredWidth() + i4, childAt.getMeasuredHeight() + iArr[1]))) {
            int action = event.getAction();
            if (action == 0) {
                this.f69890d = event.getX();
                this.f69891e = event.getY();
            } else if (action == 1 || action == 2 || action == 3) {
                float x4 = event.getX() - this.f69890d;
                if (((float) Math.sqrt(Math.pow(event.getY() - this.f69891e, 2.0d) + Math.pow(x4, 2.0d))) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    ArrayList<Rect> arrayList = this.f69888b;
                    if (arrayList == null || arrayList.isEmpty()) {
                        b bVar = this.f69892f;
                        if (bVar != null) {
                            bVar.a();
                        }
                    } else {
                        Iterator<Rect> it = this.f69888b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (h.F(event.getRawX(), event.getRawY(), it.next())) {
                                    break;
                                }
                            } else {
                                b bVar2 = this.f69892f;
                                if (bVar2 != null) {
                                    bVar2.a();
                                }
                            }
                        }
                    }
                }
                this.f69890d = 0.0f;
                this.f69891e = 0.0f;
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

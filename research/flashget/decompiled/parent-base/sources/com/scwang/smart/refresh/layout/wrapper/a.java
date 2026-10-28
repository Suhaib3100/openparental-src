package com.scwang.smart.refresh.layout.wrapper;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.annotation.o0;
import androidx.core.view.b1;
import androidx.core.view.x0;
import androidx.viewpager.widget.ViewPager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.LinkedList;
import qc.e;
import rc.b;
import sc.j;

/* compiled from: RefreshContentWrapper.java */
/* loaded from: classes6.dex */
public class a implements qc.b, sc.a, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    protected View f70708b;

    /* renamed from: c, reason: collision with root package name */
    protected View f70709c;

    /* renamed from: d, reason: collision with root package name */
    protected View f70710d;

    /* renamed from: e, reason: collision with root package name */
    protected View f70711e;

    /* renamed from: f, reason: collision with root package name */
    protected View f70712f;

    /* renamed from: g, reason: collision with root package name */
    protected int f70713g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f70714h = true;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f70715i = true;

    /* renamed from: j, reason: collision with root package name */
    protected com.scwang.smart.refresh.layout.simple.a f70716j = new com.scwang.smart.refresh.layout.simple.a();

    public a(@o0 View view) {
        this.f70710d = view;
        this.f70709c = view;
        this.f70708b = view;
    }

    @Override // sc.a
    public void a(boolean z4, boolean z5) {
        this.f70714h = z4;
        this.f70715i = z5;
    }

    @Override // qc.b
    public void b(boolean z4) {
        this.f70716j.f70696c = z4;
    }

    protected void c(View view, e eVar) {
        boolean isInEditMode = this.f70708b.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof b1) || (view2 instanceof x0))) {
                break;
            }
            view = e(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!isInEditMode) {
                com.scwang.smart.refresh.layout.util.a.a(view, eVar, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f70710d = view2;
        }
    }

    protected View d(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (com.scwang.smart.refresh.layout.util.b.g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && com.scwang.smart.refresh.layout.util.b.e(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View d5 = d(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return d5;
                }
            }
        }
        return view2;
    }

    protected View e(View view, boolean z4) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z4 || view3 != view) && com.scwang.smart.refresh.layout.util.b.e(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        linkedList.add(viewGroup.getChildAt(i4));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    @Override // qc.b
    public void f(j jVar) {
        if (jVar instanceof com.scwang.smart.refresh.layout.simple.a) {
            this.f70716j = (com.scwang.smart.refresh.layout.simple.a) jVar;
        } else {
            this.f70716j.f70695b = jVar;
        }
    }

    @Override // qc.b
    public void g(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f70708b.getLeft(), -this.f70708b.getTop());
        View view = this.f70710d;
        View view2 = this.f70708b;
        if (view != view2) {
            this.f70710d = d(view2, pointF, view);
        }
        if (this.f70710d == this.f70708b) {
            this.f70716j.f70694a = null;
        } else {
            this.f70716j.f70694a = pointF;
        }
    }

    @Override // qc.b
    @o0
    public View getView() {
        return this.f70708b;
    }

    @Override // qc.b
    public ValueAnimator.AnimatorUpdateListener h(int i4) {
        View view = this.f70710d;
        if (view == null || i4 == 0) {
            return null;
        }
        if ((i4 >= 0 || !view.canScrollVertically(1)) && (i4 <= 0 || !this.f70710d.canScrollVertically(-1))) {
            return null;
        }
        this.f70713g = i4;
        return this;
    }

    @Override // qc.b
    public void i(e eVar, View view, View view2) {
        c(this.f70708b, eVar);
        if (view == null && view2 == null) {
            return;
        }
        this.f70711e = view;
        this.f70712f = view2;
        FrameLayout frameLayout = new FrameLayout(this.f70708b.getContext());
        int indexOfChild = eVar.n().getLayout().indexOfChild(this.f70708b);
        eVar.n().getLayout().removeView(this.f70708b);
        frameLayout.addView(this.f70708b, 0, new ViewGroup.LayoutParams(-1, -1));
        eVar.n().getLayout().addView(frameLayout, indexOfChild, this.f70708b.getLayoutParams());
        this.f70708b = frameLayout;
        if (view != null) {
            view.setTag(b.C1383b.f89834f, ProtectedSandApp.s("\u2fe4\u0001"));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int indexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = com.scwang.smart.refresh.layout.util.b.h(view);
            viewGroup.addView(new Space(this.f70708b.getContext()), indexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(b.C1383b.f89834f, ProtectedSandApp.s("\u2fe5\u0001"));
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int indexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = com.scwang.smart.refresh.layout.util.b.h(view2);
            viewGroup2.addView(new Space(this.f70708b.getContext()), indexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    @Override // qc.b
    @o0
    public View j() {
        return this.f70710d;
    }

    @Override // qc.b
    public boolean k() {
        return this.f70714h && this.f70716j.a(this.f70708b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    @Override // qc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3 = -1
            if (r7 == r3) goto L21
            android.view.View r4 = r5.f70709c
            android.view.View r7 = r4.findViewById(r7)
            if (r7 == 0) goto L21
            if (r6 <= 0) goto L16
            float r4 = (float) r6
            r7.setTranslationY(r4)
            r7 = r0
            goto L22
        L16:
            float r4 = r7.getTranslationY()
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L21
            r7.setTranslationY(r1)
        L21:
            r7 = r2
        L22:
            if (r8 == r3) goto L3e
            android.view.View r3 = r5.f70709c
            android.view.View r8 = r3.findViewById(r8)
            if (r8 == 0) goto L3e
            if (r6 >= 0) goto L33
            float r7 = (float) r6
            r8.setTranslationY(r7)
            goto L3f
        L33:
            float r0 = r8.getTranslationY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3e
            r8.setTranslationY(r1)
        L3e:
            r0 = r7
        L3f:
            if (r0 != 0) goto L48
            android.view.View r7 = r5.f70709c
            float r8 = (float) r6
            r7.setTranslationY(r8)
            goto L4d
        L48:
            android.view.View r7 = r5.f70709c
            r7.setTranslationY(r1)
        L4d:
            android.view.View r7 = r5.f70711e
            if (r7 == 0) goto L59
            int r8 = java.lang.Math.max(r2, r6)
            float r8 = (float) r8
            r7.setTranslationY(r8)
        L59:
            android.view.View r7 = r5.f70712f
            if (r7 == 0) goto L65
            int r6 = java.lang.Math.min(r2, r6)
            float r6 = (float) r6
            r7.setTranslationY(r6)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.wrapper.a.l(int, int, int):void");
    }

    @Override // qc.b
    public boolean m() {
        return this.f70715i && this.f70716j.b(this.f70708b);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (intValue - this.f70713g) * this.f70710d.getScaleY();
            View view = this.f70710d;
            if (view instanceof AbsListView) {
                com.scwang.smart.refresh.layout.util.b.j((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f70713g = intValue;
    }
}

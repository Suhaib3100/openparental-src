package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.y1;
import java.util.Map;

/* loaded from: classes3.dex */
public class ChangeBounds extends Transition {

    /* renamed from: k0, reason: collision with root package name */
    private int[] f9678k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f9679l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f9680m0;

    /* renamed from: p0, reason: collision with root package name */
    private static final String f9667p0 = "android:changeBounds:parent";

    /* renamed from: o0, reason: collision with root package name */
    private static final String f9666o0 = "android:changeBounds:clip";

    /* renamed from: n0, reason: collision with root package name */
    private static final String f9665n0 = "android:changeBounds:bounds";

    /* renamed from: r0, reason: collision with root package name */
    private static final String f9669r0 = "android:changeBounds:windowY";

    /* renamed from: q0, reason: collision with root package name */
    private static final String f9668q0 = "android:changeBounds:windowX";

    /* renamed from: s0, reason: collision with root package name */
    private static final String[] f9670s0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: t0, reason: collision with root package name */
    private static final Property<Drawable, PointF> f9671t0 = new b(PointF.class, "boundsOrigin");

    /* renamed from: u0, reason: collision with root package name */
    private static final Property<k, PointF> f9672u0 = new c(PointF.class, "topLeft");

    /* renamed from: v0, reason: collision with root package name */
    private static final Property<k, PointF> f9673v0 = new d(PointF.class, "bottomRight");

    /* renamed from: w0, reason: collision with root package name */
    private static final Property<View, PointF> f9674w0 = new e(PointF.class, "bottomRight");

    /* renamed from: x0, reason: collision with root package name */
    private static final Property<View, PointF> f9675x0 = new f(PointF.class, "topLeft");

    /* renamed from: y0, reason: collision with root package name */
    private static final Property<View, PointF> f9676y0 = new g(PointF.class, "position");

    /* renamed from: z0, reason: collision with root package name */
    private static t f9677z0 = new t();

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9681a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f9682b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9683c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f9684d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f6) {
            this.f9681a = viewGroup;
            this.f9682b = bitmapDrawable;
            this.f9683c = view;
            this.f9684d = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q0.b(this.f9681a).b(this.f9682b);
            q0.h(this.f9683c, this.f9684d);
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f9686a;

        b(Class cls, String str) {
            super(cls, str);
            this.f9686a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f9686a);
            Rect rect = this.f9686a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f9686a);
            this.f9686a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f9686a);
        }
    }

    /* loaded from: classes.dex */
    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(k kVar) {
            return null;
        }

        public void b(k kVar, PointF pointF) {
            kVar.c(pointF);
        }

        @Override // android.util.Property
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* loaded from: classes.dex */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(k kVar) {
            return null;
        }

        public void b(k kVar, PointF pointF) {
            kVar.a(pointF);
        }

        @Override // android.util.Property
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            q0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }

        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            q0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }

        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            q0.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }

        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f9687a;
        private k mViewBounds;

        h(k kVar) {
            this.f9687a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f9691c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9692d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9693e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9694f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f9695g;

        i(View view, Rect rect, int i5, int i6, int i7, int i8) {
            this.f9690b = view;
            this.f9691c = rect;
            this.f9692d = i5;
            this.f9693e = i6;
            this.f9694f = i7;
            this.f9695g = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9689a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f9689a) {
                return;
            }
            y1.M1(this.f9690b, this.f9691c);
            q0.g(this.f9690b, this.f9692d, this.f9693e, this.f9694f, this.f9695g);
        }
    }

    class j extends y {

        /* renamed from: a, reason: collision with root package name */
        boolean f9697a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9698b;

        j(ViewGroup viewGroup) {
            this.f9698b = viewGroup;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
            l0.d(this.f9698b, false);
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            if (!this.f9697a) {
                l0.d(this.f9698b, false);
            }
            transition.u0(this);
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            l0.d(this.f9698b, false);
            this.f9697a = true;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
            l0.d(this.f9698b, true);
        }
    }

    /* loaded from: classes.dex */
    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f9700a;

        /* renamed from: b, reason: collision with root package name */
        private int f9701b;

        /* renamed from: c, reason: collision with root package name */
        private int f9702c;

        /* renamed from: d, reason: collision with root package name */
        private int f9703d;

        /* renamed from: e, reason: collision with root package name */
        private View f9704e;

        /* renamed from: f, reason: collision with root package name */
        private int f9705f;

        /* renamed from: g, reason: collision with root package name */
        private int f9706g;

        k(View view) {
            this.f9704e = view;
        }

        private void b() {
            q0.g(this.f9704e, this.f9700a, this.f9701b, this.f9702c, this.f9703d);
            this.f9705f = 0;
            this.f9706g = 0;
        }

        void a(PointF pointF) {
            this.f9702c = Math.round(pointF.x);
            this.f9703d = Math.round(pointF.y);
            int i5 = this.f9706g + 1;
            this.f9706g = i5;
            if (this.f9705f == i5) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f9700a = Math.round(pointF.x);
            this.f9701b = Math.round(pointF.y);
            int i5 = this.f9705f + 1;
            this.f9705f = i5;
            if (i5 == this.f9706g) {
                b();
            }
        }
    }

    public ChangeBounds() {
        this.f9678k0 = new int[2];
        this.f9679l0 = false;
        this.f9680m0 = false;
    }

    private void P0(d0 d0Var) {
        View view = d0Var.f9860b;
        if (!y1.U0(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        d0Var.f9859a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        d0Var.f9859a.put("android:changeBounds:parent", d0Var.f9860b.getParent());
        if (this.f9680m0) {
            d0Var.f9860b.getLocationInWindow(this.f9678k0);
            d0Var.f9859a.put("android:changeBounds:windowX", Integer.valueOf(this.f9678k0[0]));
            d0Var.f9859a.put("android:changeBounds:windowY", Integer.valueOf(this.f9678k0[1]));
        }
        if (this.f9679l0) {
            d0Var.f9859a.put("android:changeBounds:clip", y1.P(view));
        }
    }

    private boolean R0(View view, View view2) {
        if (!this.f9680m0) {
            return true;
        }
        d0 Q = Q(view, true);
        if (Q == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == Q.f9860b) {
            return true;
        }
        return false;
    }

    public boolean Q0() {
        return this.f9679l0;
    }

    public void S0(boolean z5) {
        this.f9679l0 = z5;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public String[] e0() {
        return f9670s0;
    }

    @Override // androidx.transition.Transition
    public void l(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    public void o(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public Animator u(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 d0 d0Var, @androidx.annotation.q0 d0 d0Var2) {
        int i5;
        View view;
        int i6;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c6;
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Map<String, Object> map = d0Var.f9859a;
        Map<String, Object> map2 = d0Var2.f9859a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = d0Var2.f9860b;
        if (!R0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) d0Var.f9859a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) d0Var.f9859a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) d0Var2.f9859a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) d0Var2.f9859a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f9678k0);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c7 = q0.c(view2);
            q0.h(view2, 0.0f);
            new o0(viewGroup).a(bitmapDrawable);
            PathMotion T = T();
            int[] iArr = this.f9678k0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, PropertyValuesHolder.ofObject(f9671t0, (TypeConverter) null, T.a(intValue - i7, intValue2 - i8, intValue3 - i7, intValue4 - i8)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c7));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) d0Var.f9859a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) d0Var2.f9859a.get("android:changeBounds:bounds");
        int i9 = rect2.left;
        int i10 = rect3.left;
        int i11 = rect2.top;
        int i12 = rect3.top;
        int i13 = rect2.right;
        int i14 = rect3.right;
        int i15 = rect2.bottom;
        int i16 = rect3.bottom;
        int i17 = i13 - i9;
        int i18 = i15 - i11;
        int i19 = i14 - i10;
        int i20 = i16 - i12;
        Rect rect4 = (Rect) d0Var.f9859a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) d0Var2.f9859a.get("android:changeBounds:clip");
        if ((i17 == 0 || i18 == 0) && (i19 == 0 || i20 == 0)) {
            i5 = 0;
        } else {
            i5 = (i9 == i10 && i11 == i12) ? 0 : 1;
            if (i13 != i14 || i15 != i16) {
                i5++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i5++;
        }
        if (i5 <= 0) {
            return null;
        }
        if (this.f9679l0) {
            view = view2;
            q0.g(view, i9, i11, Math.max(i17, i19) + i9, Math.max(i18, i20) + i11);
            ObjectAnimator ofObject = (i9 == i10 && i11 == i12) ? null : ObjectAnimator.ofObject(view, (Property<View, V>) f9676y0, (TypeConverter) null, T().a(i9, i11, i10, i12));
            if (rect4 == null) {
                i6 = 0;
                rect = new Rect(0, 0, i17, i18);
            } else {
                i6 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i6, i6, i19, i20) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                y1.M1(view, rect);
                t tVar = f9677z0;
                Object[] objArr = new Object[2];
                objArr[i6] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject2 = ObjectAnimator.ofObject(view, "clipBounds", tVar, objArr);
                ofObject2.addListener(new i(view, rect5, i10, i12, i14, i16));
                objectAnimator = ofObject2;
            }
            c6 = c0.c(ofObject, objectAnimator);
        } else {
            view = view2;
            q0.g(view, i9, i11, i13, i15);
            if (i5 != 2) {
                c6 = (i9 == i10 && i11 == i12) ? ObjectAnimator.ofObject(view, (Property<View, V>) f9674w0, (TypeConverter) null, T().a(i13, i15, i14, i16)) : ObjectAnimator.ofObject(view, (Property<View, V>) f9675x0, (TypeConverter) null, T().a(i9, i11, i10, i12));
            } else if (i17 == i19 && i18 == i20) {
                c6 = ObjectAnimator.ofObject(view, (Property<View, V>) f9676y0, (TypeConverter) null, T().a(i9, i11, i10, i12));
            } else {
                k kVar = new k(view);
                ObjectAnimator ofObject3 = ObjectAnimator.ofObject(kVar, (Property<k, V>) f9672u0, (TypeConverter) null, T().a(i9, i11, i10, i12));
                ObjectAnimator ofObject4 = ObjectAnimator.ofObject(kVar, (Property<k, V>) f9673v0, (TypeConverter) null, T().a(i13, i15, i14, i16));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject3, ofObject4);
                animatorSet.addListener(new h(kVar));
                c6 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            l0.d(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return c6;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9678k0 = new int[2];
        this.f9679l0 = false;
        this.f9680m0 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10083d);
        boolean e6 = androidx.core.content.res.p.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        S0(e6);
    }
}

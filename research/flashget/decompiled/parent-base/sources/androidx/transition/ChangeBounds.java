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
import androidx.core.view.x1;
import java.util.Map;

/* loaded from: classes3.dex */
public class ChangeBounds extends Transition {
    private boolean L2;
    private boolean M2;
    private int[] V1;
    private static final String R2 = "android:changeBounds:windowY";
    private static final String Q2 = "android:changeBounds:windowX";
    private static final String P2 = "android:changeBounds:parent";
    private static final String O2 = "android:changeBounds:clip";
    private static final String N2 = "android:changeBounds:bounds";
    private static final String[] S2 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> T2 = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> U2 = new c(PointF.class, "topLeft");
    private static final Property<k, PointF> V2 = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> W2 = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> X2 = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> Y2 = new g(PointF.class, "position");
    private static r Z2 = new r();

    class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f34233b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f34234c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f34235d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f34236e;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f4) {
            this.f34233b = viewGroup;
            this.f34234c = bitmapDrawable;
            this.f34235d = view;
            this.f34236e = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o0.b(this.f34233b).b(this.f34234c);
            o0.h(this.f34235d, this.f34236e);
        }
    }

    class b extends Property<Drawable, PointF> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f34238a;

        b(Class cls, String str) {
            super(cls, str);
            this.f34238a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f34238a);
            Rect rect = this.f34238a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f34238a);
            this.f34238a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f34238a);
        }
    }

    class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            o0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            o0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            o0.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f34239b;
        private k mViewBounds;

        h(k kVar) {
            this.f34239b = kVar;
            this.mViewBounds = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private boolean f34241b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f34242c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f34243d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f34244e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f34245f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f34246g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f34247h;

        i(View view, Rect rect, int i4, int i5, int i6, int i7) {
            this.f34242c = view;
            this.f34243d = rect;
            this.f34244e = i4;
            this.f34245f = i5;
            this.f34246g = i6;
            this.f34247h = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f34241b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f34241b) {
                return;
            }
            x1.T1(this.f34242c, this.f34243d);
            o0.g(this.f34242c, this.f34244e, this.f34245f, this.f34246g, this.f34247h);
        }
    }

    class j extends w {

        /* renamed from: b, reason: collision with root package name */
        boolean f34249b = false;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f34250c;

        j(ViewGroup viewGroup) {
            this.f34250c = viewGroup;
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
            j0.d(this.f34250c, true);
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            j0.d(this.f34250c, false);
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            if (!this.f34249b) {
                j0.d(this.f34250c, false);
            }
            transition.q0(this);
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
            j0.d(this.f34250c, false);
            this.f34249b = true;
        }
    }

    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f34252a;

        /* renamed from: b, reason: collision with root package name */
        private int f34253b;

        /* renamed from: c, reason: collision with root package name */
        private int f34254c;

        /* renamed from: d, reason: collision with root package name */
        private int f34255d;

        /* renamed from: e, reason: collision with root package name */
        private View f34256e;

        /* renamed from: f, reason: collision with root package name */
        private int f34257f;

        /* renamed from: g, reason: collision with root package name */
        private int f34258g;

        k(View view) {
            this.f34256e = view;
        }

        private void b() {
            o0.g(this.f34256e, this.f34252a, this.f34253b, this.f34254c, this.f34255d);
            this.f34257f = 0;
            this.f34258g = 0;
        }

        void a(PointF pointF) {
            this.f34254c = Math.round(pointF.x);
            this.f34255d = Math.round(pointF.y);
            int i4 = this.f34258g + 1;
            this.f34258g = i4;
            if (this.f34257f == i4) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f34252a = Math.round(pointF.x);
            this.f34253b = Math.round(pointF.y);
            int i4 = this.f34257f + 1;
            this.f34257f = i4;
            if (i4 == this.f34258g) {
                b();
            }
        }
    }

    public ChangeBounds() {
        this.V1 = new int[2];
        this.L2 = false;
        this.M2 = false;
    }

    private void J0(b0 b0Var) {
        View view = b0Var.f34364b;
        if (!x1.Y0(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        b0Var.f34363a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        b0Var.f34363a.put("android:changeBounds:parent", b0Var.f34364b.getParent());
        if (this.M2) {
            b0Var.f34364b.getLocationInWindow(this.V1);
            b0Var.f34363a.put("android:changeBounds:windowX", Integer.valueOf(this.V1[0]));
            b0Var.f34363a.put("android:changeBounds:windowY", Integer.valueOf(this.V1[1]));
        }
        if (this.L2) {
            b0Var.f34363a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    private boolean M0(View view, View view2) {
        if (!this.M2) {
            return true;
        }
        b0 O = O(view, true);
        if (O == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == O.f34364b) {
            return true;
        }
        return false;
    }

    public boolean L0() {
        return this.L2;
    }

    public void N0(boolean z4) {
        this.L2 = z4;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public String[] a0() {
        return S2;
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public Animator t(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 b0 b0Var, @androidx.annotation.q0 b0 b0Var2) {
        int i4;
        View view;
        int i5;
        ObjectAnimator objectAnimator;
        Animator c5;
        if (b0Var == null || b0Var2 == null) {
            return null;
        }
        Map<String, Object> map = b0Var.f34363a;
        Map<String, Object> map2 = b0Var2.f34363a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = b0Var2.f34364b;
        if (!M0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) b0Var.f34363a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) b0Var.f34363a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) b0Var2.f34363a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) b0Var2.f34363a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.V1);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c6 = o0.c(view2);
            o0.h(view2, 0.0f);
            new m0(viewGroup).a(bitmapDrawable);
            PathMotion R = R();
            int[] iArr = this.V1;
            int i6 = iArr[0];
            int i7 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, PropertyValuesHolder.ofObject(T2, (TypeConverter) null, R.a(intValue - i6, intValue2 - i7, intValue3 - i6, intValue4 - i7)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c6));
            return ofPropertyValuesHolder;
        }
        Rect rect = (Rect) b0Var.f34363a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) b0Var2.f34363a.get("android:changeBounds:bounds");
        int i10 = rect.left;
        int i11 = rect2.left;
        int i12 = rect.top;
        int i13 = rect2.top;
        int i14 = rect.right;
        int i15 = rect2.right;
        int i16 = rect.bottom;
        int i17 = rect2.bottom;
        int i18 = i14 - i10;
        int i19 = i16 - i12;
        int i20 = i15 - i11;
        int i21 = i17 - i13;
        Rect rect3 = (Rect) b0Var.f34363a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) b0Var2.f34363a.get("android:changeBounds:clip");
        if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
            i4 = 0;
        } else {
            i4 = (i10 == i11 && i12 == i13) ? 0 : 1;
            if (i14 != i15 || i16 != i17) {
                i4++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i4++;
        }
        if (i4 <= 0) {
            return null;
        }
        if (this.L2) {
            view = view2;
            o0.g(view, i10, i12, Math.max(i18, i20) + i10, Math.max(i19, i21) + i12);
            ObjectAnimator ofObject = (i10 == i11 && i12 == i13) ? null : ObjectAnimator.ofObject(view, (Property<View, V>) Y2, (TypeConverter) null, R().a(i10, i12, i11, i13));
            if (rect3 == null) {
                i5 = 0;
                rect3 = new Rect(0, 0, i18, i19);
            } else {
                i5 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i5, i5, i20, i21) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                x1.T1(view, rect3);
                ObjectAnimator ofObject2 = ObjectAnimator.ofObject(view, "clipBounds", Z2, rect3, rect5);
                ofObject2.addListener(new i(view, rect4, i11, i13, i15, i17));
                objectAnimator = ofObject2;
            }
            c5 = a0.c(ofObject, objectAnimator);
        } else {
            view = view2;
            o0.g(view, i10, i12, i14, i16);
            if (i4 != 2) {
                c5 = (i10 == i11 && i12 == i13) ? ObjectAnimator.ofObject(view, (Property<View, V>) W2, (TypeConverter) null, R().a(i14, i16, i15, i17)) : ObjectAnimator.ofObject(view, (Property<View, V>) X2, (TypeConverter) null, R().a(i10, i12, i11, i13));
            } else if (i18 == i20 && i19 == i21) {
                c5 = ObjectAnimator.ofObject(view, (Property<View, V>) Y2, (TypeConverter) null, R().a(i10, i12, i11, i13));
            } else {
                k kVar = new k(view);
                ObjectAnimator ofObject3 = ObjectAnimator.ofObject(kVar, (Property<k, V>) U2, (TypeConverter) null, R().a(i10, i12, i11, i13));
                ObjectAnimator ofObject4 = ObjectAnimator.ofObject(kVar, (Property<k, V>) V2, (TypeConverter) null, R().a(i14, i16, i15, i17));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject3, ofObject4);
                animatorSet.addListener(new h(kVar));
                c5 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            j0.d(viewGroup4, true);
            b(new j(viewGroup4));
        }
        return c5;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = new int[2];
        this.L2 = false;
        this.M2 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35208d);
        boolean e4 = androidx.core.content.res.n.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        N0(e4);
    }
}

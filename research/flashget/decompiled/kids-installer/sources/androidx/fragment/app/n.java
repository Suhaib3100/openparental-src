package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.q0;
import z.a;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
class n implements LayoutInflater.Factory2 {

    /* renamed from: p, reason: collision with root package name */
    private static final String f8345p = "FragmentManager";

    /* renamed from: o, reason: collision with root package name */
    final FragmentManager f8346o;

    /* compiled from: FragmentLayoutInflaterFactory.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ b0 f8347o;

        a(b0 b0Var) {
            this.f8347o = b0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k5 = this.f8347o.k();
            this.f8347o.m();
            m0.n((ViewGroup) k5.mView.getParent(), n.this.f8346o).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    n(FragmentManager fragmentManager) {
        this.f8346o = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @q0
    public View onCreateView(@androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @q0
    public View onCreateView(@q0 View view, @androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        b0 D;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f8346o);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d.f34378a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(a.d.f34379b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(a.d.f34380c, -1);
        String string = obtainStyledAttributes.getString(a.d.f34381d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !l.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment r02 = resourceId != -1 ? this.f8346o.r0(resourceId) : null;
        if (r02 == null && string != null) {
            r02 = this.f8346o.s0(string);
        }
        if (r02 == null && id != -1) {
            r02 = this.f8346o.r0(id);
        }
        if (r02 == null) {
            r02 = this.f8346o.G0().a(context.getClassLoader(), attributeValue);
            r02.mFromLayout = true;
            r02.mFragmentId = resourceId != 0 ? resourceId : id;
            r02.mContainerId = id;
            r02.mTag = string;
            r02.mInLayout = true;
            FragmentManager fragmentManager = this.f8346o;
            r02.mFragmentManager = fragmentManager;
            r02.mHost = fragmentManager.J0();
            r02.onInflate(this.f8346o.J0().j(), attributeSet, r02.mSavedFragmentState);
            D = this.f8346o.n(r02);
            if (FragmentManager.W0(2)) {
                r02.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (r02.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            r02.mInLayout = true;
            FragmentManager fragmentManager2 = this.f8346o;
            r02.mFragmentManager = fragmentManager2;
            r02.mHost = fragmentManager2.J0();
            r02.onInflate(this.f8346o.J0().j(), attributeSet, r02.mSavedFragmentState);
            D = this.f8346o.D(r02);
            if (FragmentManager.W0(2)) {
                r02.toString();
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        a0.c.j(r02, viewGroup);
        r02.mContainer = viewGroup;
        D.m();
        D.j();
        View view2 = r02.mView;
        if (view2 == null) {
            throw new IllegalStateException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Fragment ", attributeValue, " did not create a view."));
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (r02.mView.getTag() == null) {
            r02.mView.setTag(string);
        }
        r02.mView.addOnAttachStateChangeListener(new a(D));
        return r02.mView;
    }
}

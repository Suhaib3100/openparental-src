package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import v1.a;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes3.dex */
class r implements LayoutInflater.Factory2 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f30055c = "FragmentManager";

    /* renamed from: b, reason: collision with root package name */
    final FragmentManager f30056b;

    /* compiled from: FragmentLayoutInflaterFactory.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f30057b;

        a(h0 h0Var) {
            this.f30057b = h0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k4 = this.f30057b.k();
            this.f30057b.m();
            u0.n((ViewGroup) k4.mView.getParent(), r.this.f30056b).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    r(FragmentManager fragmentManager) {
        this.f30056b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @androidx.annotation.q0
    public View onCreateView(@androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @androidx.annotation.q0
    public View onCreateView(@androidx.annotation.q0 View view, @androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        h0 D;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f30056b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d.f92822a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(a.d.f92823b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(a.d.f92824c, -1);
        String string = obtainStyledAttributes.getString(a.d.f92825d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !n.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment r02 = resourceId != -1 ? this.f30056b.r0(resourceId) : null;
        if (r02 == null && string != null) {
            r02 = this.f30056b.s0(string);
        }
        if (r02 == null && id2 != -1) {
            r02 = this.f30056b.r0(id2);
        }
        if (r02 == null) {
            r02 = this.f30056b.G0().instantiate(context.getClassLoader(), attributeValue);
            r02.mFromLayout = true;
            r02.mFragmentId = resourceId != 0 ? resourceId : id2;
            r02.mContainerId = id2;
            r02.mTag = string;
            r02.mInLayout = true;
            FragmentManager fragmentManager = this.f30056b;
            r02.mFragmentManager = fragmentManager;
            r02.mHost = fragmentManager.J0();
            r02.onInflate(this.f30056b.J0().f(), attributeSet, r02.mSavedFragmentState);
            D = this.f30056b.n(r02);
            if (FragmentManager.W0(2)) {
                r02.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (r02.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            r02.mInLayout = true;
            FragmentManager fragmentManager2 = this.f30056b;
            r02.mFragmentManager = fragmentManager2;
            r02.mHost = fragmentManager2.J0();
            r02.onInflate(this.f30056b.J0().f(), attributeSet, r02.mSavedFragmentState);
            D = this.f30056b.D(r02);
            if (FragmentManager.W0(2)) {
                r02.toString();
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        w1.c.j(r02, viewGroup);
        r02.mContainer = viewGroup;
        D.m();
        D.j();
        View view2 = r02.mView;
        if (view2 == null) {
            throw new IllegalStateException(android.support.v4.media.d.a("Fragment ", attributeValue, " did not create a view."));
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

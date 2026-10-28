package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.x1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u0;
import androidx.view.AbstractC1450w;
import androidx.view.o1;
import java.util.Objects;
import v1.a;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes3.dex */
class h0 {

    /* renamed from: f, reason: collision with root package name */
    private static final String f29945f = "FragmentManager";

    /* renamed from: g, reason: collision with root package name */
    private static final String f29946g = "android:target_req_state";

    /* renamed from: h, reason: collision with root package name */
    private static final String f29947h = "android:target_state";

    /* renamed from: i, reason: collision with root package name */
    private static final String f29948i = "android:view_state";

    /* renamed from: j, reason: collision with root package name */
    private static final String f29949j = "android:view_registry_state";

    /* renamed from: k, reason: collision with root package name */
    private static final String f29950k = "android:user_visible_hint";

    /* renamed from: a, reason: collision with root package name */
    private final s f29951a;

    /* renamed from: b, reason: collision with root package name */
    private final j0 f29952b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    private final Fragment f29953c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29954d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f29955e = -1;

    /* compiled from: FragmentStateManager.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f29956b;

        a(View view) {
            this.f29956b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f29956b.removeOnAttachStateChangeListener(this);
            x1.B1(this.f29956b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: FragmentStateManager.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29958a;

        static {
            int[] iArr = new int[AbstractC1450w.b.values().length];
            f29958a = iArr;
            try {
                iArr[AbstractC1450w.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29958a[AbstractC1450w.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29958a[AbstractC1450w.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29958a[AbstractC1450w.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    h0(@androidx.annotation.o0 s sVar, @androidx.annotation.o0 j0 j0Var, @androidx.annotation.o0 Fragment fragment) {
        this.f29951a = sVar;
        this.f29952b = j0Var;
        this.f29953c = fragment;
    }

    private boolean l(@androidx.annotation.o0 View view) {
        if (view == this.f29953c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f29953c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f29953c.performSaveInstanceState(bundle);
        this.f29951a.j(this.f29953c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f29953c.mView != null) {
            t();
        }
        if (this.f29953c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f29953c.mSavedViewState);
        }
        if (this.f29953c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f29953c.mSavedViewRegistryState);
        }
        if (!this.f29953c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f29953c.mUserVisibleHint);
        }
        return bundle;
    }

    void a() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        Fragment fragment = this.f29953c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        s sVar = this.f29951a;
        Fragment fragment2 = this.f29953c;
        sVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    void b() {
        int j4 = this.f29952b.j(this.f29953c);
        Fragment fragment = this.f29953c;
        fragment.mContainer.addView(fragment.mView, j4);
    }

    void c() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        Fragment fragment = this.f29953c;
        Fragment fragment2 = fragment.mTarget;
        h0 h0Var = null;
        if (fragment2 != null) {
            h0 o4 = this.f29952b.o(fragment2.mWho);
            if (o4 == null) {
                throw new IllegalStateException("Fragment " + this.f29953c + " declared target fragment " + this.f29953c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f29953c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            h0Var = o4;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (h0Var = this.f29952b.o(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(this.f29953c);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(android.support.v4.media.c.a(sb, this.f29953c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (h0Var != null) {
            h0Var.m();
        }
        Fragment fragment4 = this.f29953c;
        fragment4.mHost = fragment4.mFragmentManager.J0();
        Fragment fragment5 = this.f29953c;
        fragment5.mParentFragment = fragment5.mFragmentManager.M0();
        this.f29951a.g(this.f29953c, false);
        this.f29953c.performAttach();
        this.f29951a.b(this.f29953c, false);
    }

    int d() {
        Fragment fragment = this.f29953c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i4 = this.f29955e;
        int i5 = b.f29958a[fragment.mMaxState.ordinal()];
        if (i5 != 1) {
            i4 = i5 != 2 ? i5 != 3 ? i5 != 4 ? Math.min(i4, -1) : Math.min(i4, 0) : Math.min(i4, 1) : Math.min(i4, 5);
        }
        Fragment fragment2 = this.f29953c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i4 = Math.max(this.f29955e, 2);
                View view = this.f29953c.mView;
                if (view != null && view.getParent() == null) {
                    i4 = Math.min(i4, 2);
                }
            } else {
                i4 = this.f29955e < 4 ? Math.min(i4, fragment2.mState) : Math.min(i4, 1);
            }
        }
        if (!this.f29953c.mAdded) {
            i4 = Math.min(i4, 1);
        }
        Fragment fragment3 = this.f29953c;
        ViewGroup viewGroup = fragment3.mContainer;
        u0.e.b l4 = viewGroup != null ? u0.n(viewGroup, fragment3.getParentFragmentManager()).l(this) : null;
        if (l4 == u0.e.b.ADDING) {
            i4 = Math.min(i4, 6);
        } else if (l4 == u0.e.b.REMOVING) {
            i4 = Math.max(i4, 3);
        } else {
            Fragment fragment4 = this.f29953c;
            if (fragment4.mRemoving) {
                i4 = fragment4.isInBackStack() ? Math.min(i4, 1) : Math.min(i4, -1);
            }
        }
        Fragment fragment5 = this.f29953c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i4 = Math.min(i4, 4);
        }
        if (FragmentManager.W0(2)) {
            Objects.toString(this.f29953c);
        }
        return i4;
    }

    void e() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        Fragment fragment = this.f29953c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f29953c.mState = 1;
            return;
        }
        this.f29951a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f29953c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        s sVar = this.f29951a;
        Fragment fragment3 = this.f29953c;
        sVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    void f() {
        String str;
        if (this.f29953c.mFromLayout) {
            return;
        }
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        Fragment fragment = this.f29953c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f29953c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i4 = fragment2.mContainerId;
            if (i4 == 0) {
                viewGroup = null;
            } else {
                if (i4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f29953c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.D0().c(this.f29953c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f29953c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f29953c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f29953c.mContainerId) + " (" + str + ") for fragment " + this.f29953c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    w1.c.r(this.f29953c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f29953c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f29953c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f29953c;
            fragment5.mView.setTag(a.c.f92819a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f29953c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (x1.R0(this.f29953c.mView)) {
                x1.B1(this.f29953c.mView);
            } else {
                View view2 = this.f29953c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f29953c.performViewCreated();
            s sVar = this.f29951a;
            Fragment fragment7 = this.f29953c;
            sVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f29953c.mView.getVisibility();
            this.f29953c.setPostOnViewCreatedAlpha(this.f29953c.mView.getAlpha());
            Fragment fragment8 = this.f29953c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.f29953c.setFocusedView(findFocus);
                    if (FragmentManager.W0(2)) {
                        findFocus.toString();
                        Objects.toString(this.f29953c);
                    }
                }
                this.f29953c.mView.setAlpha(0.0f);
            }
        }
        this.f29953c.mState = 2;
    }

    void g() {
        Fragment f4;
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        Fragment fragment = this.f29953c;
        boolean z4 = true;
        boolean z5 = fragment.mRemoving && !fragment.isInBackStack();
        if (z5) {
            Fragment fragment2 = this.f29953c;
            if (!fragment2.mBeingSaved) {
                this.f29952b.C(fragment2.mWho, null);
            }
        }
        if (!z5 && !this.f29952b.q().p(this.f29953c)) {
            String str = this.f29953c.mTargetWho;
            if (str != null && (f4 = this.f29952b.f(str)) != null && f4.mRetainInstance) {
                this.f29953c.mTarget = f4;
            }
            this.f29953c.mState = 0;
            return;
        }
        o<?> oVar = this.f29953c.mHost;
        if (oVar instanceof o1) {
            z4 = this.f29952b.q().l();
        } else if (oVar.f() instanceof Activity) {
            z4 = true ^ ((Activity) oVar.f()).isChangingConfigurations();
        }
        if ((z5 && !this.f29953c.mBeingSaved) || z4) {
            this.f29952b.q().c(this.f29953c);
        }
        this.f29953c.performDestroy();
        this.f29951a.d(this.f29953c, false);
        for (h0 h0Var : this.f29952b.l()) {
            if (h0Var != null) {
                Fragment k4 = h0Var.k();
                if (this.f29953c.mWho.equals(k4.mTargetWho)) {
                    k4.mTarget = this.f29953c;
                    k4.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f29953c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f29952b.f(str2);
        }
        this.f29952b.t(this);
    }

    void h() {
        View view;
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        Fragment fragment = this.f29953c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f29953c.performDestroyView();
        this.f29951a.n(this.f29953c, false);
        Fragment fragment2 = this.f29953c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.r(null);
        this.f29953c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        this.f29953c.performDetach();
        this.f29951a.e(this.f29953c, false);
        Fragment fragment = this.f29953c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f29952b.q().p(this.f29953c)) {
            return;
        }
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        this.f29953c.initState();
    }

    void j() {
        Fragment fragment = this.f29953c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.W0(3)) {
                Objects.toString(this.f29953c);
            }
            Fragment fragment2 = this.f29953c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f29953c.mSavedFragmentState);
            View view = this.f29953c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f29953c;
                fragment3.mView.setTag(a.c.f92819a, fragment3);
                Fragment fragment4 = this.f29953c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f29953c.performViewCreated();
                s sVar = this.f29951a;
                Fragment fragment5 = this.f29953c;
                sVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f29953c.mState = 2;
            }
        }
    }

    @androidx.annotation.o0
    Fragment k() {
        return this.f29953c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f29954d) {
            if (FragmentManager.W0(2)) {
                Objects.toString(k());
                return;
            }
            return;
        }
        try {
            this.f29954d = true;
            boolean z4 = false;
            while (true) {
                int d5 = d();
                Fragment fragment = this.f29953c;
                int i4 = fragment.mState;
                if (d5 == i4) {
                    if (!z4 && i4 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f29953c.mBeingSaved) {
                        if (FragmentManager.W0(3)) {
                            Objects.toString(this.f29953c);
                        }
                        this.f29952b.q().c(this.f29953c);
                        this.f29952b.t(this);
                        if (FragmentManager.W0(3)) {
                            Objects.toString(this.f29953c);
                        }
                        this.f29953c.initState();
                    }
                    Fragment fragment2 = this.f29953c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            u0 n4 = u0.n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f29953c.mHidden) {
                                n4.c(this);
                            } else {
                                n4.e(this);
                            }
                        }
                        Fragment fragment3 = this.f29953c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.U0(fragment3);
                        }
                        Fragment fragment4 = this.f29953c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f29953c.mChildFragmentManager.Q();
                    }
                    this.f29954d = false;
                    return;
                }
                if (d5 <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f29952b.r(fragment.mWho) == null) {
                                s();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f29953c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.W0(3)) {
                                Objects.toString(this.f29953c);
                            }
                            Fragment fragment5 = this.f29953c;
                            if (fragment5.mBeingSaved) {
                                s();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment6 = this.f29953c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                u0.n(viewGroup2, fragment6.getParentFragmentManager()).d(this);
                            }
                            this.f29953c.mState = 3;
                            break;
                        case 4:
                            w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                u0.n(viewGroup3, fragment.getParentFragmentManager()).b(u0.e.c.from(this.f29953c.mView.getVisibility()), this);
                            }
                            this.f29953c.mState = 4;
                            break;
                        case 5:
                            v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z4 = true;
            }
        } catch (Throwable th) {
            this.f29954d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        this.f29953c.performPause();
        this.f29951a.f(this.f29953c, false);
    }

    void o(@androidx.annotation.o0 ClassLoader classLoader) {
        Bundle bundle = this.f29953c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f29953c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f29953c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f29953c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f29953c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f29953c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f29953c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f29953c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    void p() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        View focusedView = this.f29953c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.W0(2)) {
                focusedView.toString();
                Objects.toString(this.f29953c);
                Objects.toString(this.f29953c.mView.findFocus());
            }
        }
        this.f29953c.setFocusedView(null);
        this.f29953c.performResume();
        this.f29951a.i(this.f29953c, false);
        Fragment fragment = this.f29953c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @androidx.annotation.q0
    Fragment.SavedState r() {
        Bundle q4;
        if (this.f29953c.mState <= -1 || (q4 = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q4);
    }

    void s() {
        FragmentState fragmentState = new FragmentState(this.f29953c);
        Fragment fragment = this.f29953c;
        if (fragment.mState <= -1 || fragmentState.f29855n != null) {
            fragmentState.f29855n = fragment.mSavedFragmentState;
        } else {
            Bundle q4 = q();
            fragmentState.f29855n = q4;
            if (this.f29953c.mTargetWho != null) {
                if (q4 == null) {
                    fragmentState.f29855n = new Bundle();
                }
                fragmentState.f29855n.putString("android:target_state", this.f29953c.mTargetWho);
                int i4 = this.f29953c.mTargetRequestCode;
                if (i4 != 0) {
                    fragmentState.f29855n.putInt("android:target_req_state", i4);
                }
            }
        }
        this.f29952b.C(this.f29953c.mWho, fragmentState);
    }

    void t() {
        if (this.f29953c.mView == null) {
            return;
        }
        if (FragmentManager.W0(2)) {
            Objects.toString(this.f29953c);
            Objects.toString(this.f29953c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f29953c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f29953c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f29953c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f29953c.mSavedViewRegistryState = bundle;
    }

    void u(int i4) {
        this.f29955e = i4;
    }

    void v() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        this.f29953c.performStart();
        this.f29951a.k(this.f29953c, false);
    }

    void w() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f29953c);
        }
        this.f29953c.performStop();
        this.f29951a.l(this.f29953c, false);
    }

    h0(@androidx.annotation.o0 s sVar, @androidx.annotation.o0 j0 j0Var, @androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 n nVar, @androidx.annotation.o0 FragmentState fragmentState) {
        this.f29951a = sVar;
        this.f29952b = j0Var;
        Fragment a5 = fragmentState.a(nVar, classLoader);
        this.f29953c = a5;
        if (FragmentManager.W0(2)) {
            Objects.toString(a5);
        }
    }

    h0(@androidx.annotation.o0 s sVar, @androidx.annotation.o0 j0 j0Var, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 FragmentState fragmentState) {
        this.f29951a = sVar;
        this.f29952b = j0Var;
        this.f29953c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f29855n;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}

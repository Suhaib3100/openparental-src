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
import android.view.i1;
import android.view.t;
import androidx.annotation.q0;
import androidx.core.view.y1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import java.util.Objects;
import z.a;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
class b0 {

    /* renamed from: f, reason: collision with root package name */
    private static final String f8191f = "FragmentManager";

    /* renamed from: g, reason: collision with root package name */
    private static final String f8192g = "android:target_req_state";

    /* renamed from: h, reason: collision with root package name */
    private static final String f8193h = "android:target_state";

    /* renamed from: i, reason: collision with root package name */
    private static final String f8194i = "android:view_state";

    /* renamed from: j, reason: collision with root package name */
    private static final String f8195j = "android:view_registry_state";

    /* renamed from: k, reason: collision with root package name */
    private static final String f8196k = "android:user_visible_hint";

    /* renamed from: a, reason: collision with root package name */
    private final o f8197a;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f8198b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    private final Fragment f8199c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8200d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f8201e = -1;

    /* compiled from: FragmentStateManager.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f8202o;

        a(View view) {
            this.f8202o = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f8202o.removeOnAttachStateChangeListener(this);
            y1.v1(this.f8202o);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: FragmentStateManager.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8204a;

        static {
            int[] iArr = new int[t.c.values().length];
            f8204a = iArr;
            try {
                iArr[t.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8204a[t.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8204a[t.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8204a[t.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    b0(@androidx.annotation.o0 o oVar, @androidx.annotation.o0 d0 d0Var, @androidx.annotation.o0 Fragment fragment) {
        this.f8197a = oVar;
        this.f8198b = d0Var;
        this.f8199c = fragment;
    }

    private boolean l(@androidx.annotation.o0 View view) {
        if (view == this.f8199c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f8199c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f8199c.performSaveInstanceState(bundle);
        this.f8197a.j(this.f8199c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f8199c.mView != null) {
            t();
        }
        if (this.f8199c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f8199c.mSavedViewState);
        }
        if (this.f8199c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f8199c.mSavedViewRegistryState);
        }
        if (!this.f8199c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f8199c.mUserVisibleHint);
        }
        return bundle;
    }

    void a() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        Fragment fragment = this.f8199c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        o oVar = this.f8197a;
        Fragment fragment2 = this.f8199c;
        oVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    void b() {
        int j5 = this.f8198b.j(this.f8199c);
        Fragment fragment = this.f8199c;
        fragment.mContainer.addView(fragment.mView, j5);
    }

    void c() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        Fragment fragment = this.f8199c;
        Fragment fragment2 = fragment.mTarget;
        b0 b0Var = null;
        if (fragment2 != null) {
            b0 o5 = this.f8198b.o(fragment2.mWho);
            if (o5 == null) {
                throw new IllegalStateException("Fragment " + this.f8199c + " declared target fragment " + this.f8199c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f8199c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            b0Var = o5;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (b0Var = this.f8198b.o(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(this.f8199c);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(androidx.concurrent.futures.a.a(sb, this.f8199c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (b0Var != null) {
            b0Var.m();
        }
        Fragment fragment4 = this.f8199c;
        fragment4.mHost = fragment4.mFragmentManager.J0();
        Fragment fragment5 = this.f8199c;
        fragment5.mParentFragment = fragment5.mFragmentManager.M0();
        this.f8197a.g(this.f8199c, false);
        this.f8199c.performAttach();
        this.f8197a.b(this.f8199c, false);
    }

    int d() {
        Fragment fragment = this.f8199c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i5 = this.f8201e;
        int i6 = b.f8204a[fragment.mMaxState.ordinal()];
        if (i6 != 1) {
            i5 = i6 != 2 ? i6 != 3 ? i6 != 4 ? Math.min(i5, -1) : Math.min(i5, 0) : Math.min(i5, 1) : Math.min(i5, 5);
        }
        Fragment fragment2 = this.f8199c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i5 = Math.max(this.f8201e, 2);
                View view = this.f8199c.mView;
                if (view != null && view.getParent() == null) {
                    i5 = Math.min(i5, 2);
                }
            } else {
                i5 = this.f8201e < 4 ? Math.min(i5, fragment2.mState) : Math.min(i5, 1);
            }
        }
        if (!this.f8199c.mAdded) {
            i5 = Math.min(i5, 1);
        }
        Fragment fragment3 = this.f8199c;
        ViewGroup viewGroup = fragment3.mContainer;
        m0.e.b l5 = viewGroup != null ? m0.n(viewGroup, fragment3.getParentFragmentManager()).l(this) : null;
        if (l5 == m0.e.b.ADDING) {
            i5 = Math.min(i5, 6);
        } else if (l5 == m0.e.b.REMOVING) {
            i5 = Math.max(i5, 3);
        } else {
            Fragment fragment4 = this.f8199c;
            if (fragment4.mRemoving) {
                i5 = fragment4.isInBackStack() ? Math.min(i5, 1) : Math.min(i5, -1);
            }
        }
        Fragment fragment5 = this.f8199c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i5 = Math.min(i5, 4);
        }
        if (FragmentManager.W0(2)) {
            Objects.toString(this.f8199c);
        }
        return i5;
    }

    void e() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        Fragment fragment = this.f8199c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f8199c.mState = 1;
            return;
        }
        this.f8197a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f8199c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        o oVar = this.f8197a;
        Fragment fragment3 = this.f8199c;
        oVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    void f() {
        String str;
        if (this.f8199c.mFromLayout) {
            return;
        }
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        Fragment fragment = this.f8199c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f8199c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i5 = fragment2.mContainerId;
            if (i5 == 0) {
                viewGroup = null;
            } else {
                if (i5 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f8199c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.D0().d(this.f8199c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f8199c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f8199c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f8199c.mContainerId) + " (" + str + ") for fragment " + this.f8199c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    a0.c.r(this.f8199c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f8199c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f8199c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f8199c;
            fragment5.mView.setTag(a.c.f34375a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f8199c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (y1.O0(this.f8199c.mView)) {
                y1.v1(this.f8199c.mView);
            } else {
                View view2 = this.f8199c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f8199c.performViewCreated();
            o oVar = this.f8197a;
            Fragment fragment7 = this.f8199c;
            oVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f8199c.mView.getVisibility();
            this.f8199c.setPostOnViewCreatedAlpha(this.f8199c.mView.getAlpha());
            Fragment fragment8 = this.f8199c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.f8199c.setFocusedView(findFocus);
                    if (FragmentManager.W0(2)) {
                        findFocus.toString();
                        Objects.toString(this.f8199c);
                    }
                }
                this.f8199c.mView.setAlpha(0.0f);
            }
        }
        this.f8199c.mState = 2;
    }

    void g() {
        Fragment f6;
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        Fragment fragment = this.f8199c;
        boolean z5 = true;
        boolean z6 = fragment.mRemoving && !fragment.isInBackStack();
        if (z6) {
            Fragment fragment2 = this.f8199c;
            if (!fragment2.mBeingSaved) {
                this.f8198b.C(fragment2.mWho, null);
            }
        }
        if (!(z6 || this.f8198b.q().u(this.f8199c))) {
            String str = this.f8199c.mTargetWho;
            if (str != null && (f6 = this.f8198b.f(str)) != null && f6.mRetainInstance) {
                this.f8199c.mTarget = f6;
            }
            this.f8199c.mState = 0;
            return;
        }
        m<?> mVar = this.f8199c.mHost;
        if (mVar instanceof i1) {
            z5 = this.f8198b.q().q();
        } else if (mVar.j() instanceof Activity) {
            z5 = true ^ ((Activity) mVar.j()).isChangingConfigurations();
        }
        if ((z6 && !this.f8199c.mBeingSaved) || z5) {
            this.f8198b.q().h(this.f8199c);
        }
        this.f8199c.performDestroy();
        this.f8197a.d(this.f8199c, false);
        for (b0 b0Var : this.f8198b.l()) {
            if (b0Var != null) {
                Fragment k5 = b0Var.k();
                if (this.f8199c.mWho.equals(k5.mTargetWho)) {
                    k5.mTarget = this.f8199c;
                    k5.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f8199c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f8198b.f(str2);
        }
        this.f8198b.t(this);
    }

    void h() {
        View view;
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        Fragment fragment = this.f8199c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f8199c.performDestroyView();
        this.f8197a.n(this.f8199c, false);
        Fragment fragment2 = this.f8199c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.q(null);
        this.f8199c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        this.f8199c.performDetach();
        boolean z5 = false;
        this.f8197a.e(this.f8199c, false);
        Fragment fragment = this.f8199c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z5 = true;
        }
        if (z5 || this.f8198b.q().u(this.f8199c)) {
            if (FragmentManager.W0(3)) {
                Objects.toString(this.f8199c);
            }
            this.f8199c.initState();
        }
    }

    void j() {
        Fragment fragment = this.f8199c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.W0(3)) {
                Objects.toString(this.f8199c);
            }
            Fragment fragment2 = this.f8199c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f8199c.mSavedFragmentState);
            View view = this.f8199c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f8199c;
                fragment3.mView.setTag(a.c.f34375a, fragment3);
                Fragment fragment4 = this.f8199c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f8199c.performViewCreated();
                o oVar = this.f8197a;
                Fragment fragment5 = this.f8199c;
                oVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f8199c.mState = 2;
            }
        }
    }

    @androidx.annotation.o0
    Fragment k() {
        return this.f8199c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f8200d) {
            if (FragmentManager.W0(2)) {
                Objects.toString(k());
                return;
            }
            return;
        }
        try {
            this.f8200d = true;
            boolean z5 = false;
            while (true) {
                int d6 = d();
                Fragment fragment = this.f8199c;
                int i5 = fragment.mState;
                if (d6 == i5) {
                    if (!z5 && i5 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f8199c.mBeingSaved) {
                        if (FragmentManager.W0(3)) {
                            Objects.toString(this.f8199c);
                        }
                        this.f8198b.q().h(this.f8199c);
                        this.f8198b.t(this);
                        if (FragmentManager.W0(3)) {
                            Objects.toString(this.f8199c);
                        }
                        this.f8199c.initState();
                    }
                    Fragment fragment2 = this.f8199c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            m0 n5 = m0.n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f8199c.mHidden) {
                                n5.c(this);
                            } else {
                                n5.e(this);
                            }
                        }
                        Fragment fragment3 = this.f8199c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.U0(fragment3);
                        }
                        Fragment fragment4 = this.f8199c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f8199c.mChildFragmentManager.Q();
                    }
                    return;
                }
                if (d6 <= i5) {
                    switch (i5 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f8198b.r(fragment.mWho) == null) {
                                s();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f8199c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.W0(3)) {
                                Objects.toString(this.f8199c);
                            }
                            Fragment fragment5 = this.f8199c;
                            if (fragment5.mBeingSaved) {
                                s();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment6 = this.f8199c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                m0.n(viewGroup2, fragment6.getParentFragmentManager()).d(this);
                            }
                            this.f8199c.mState = 3;
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
                    switch (i5 + 1) {
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
                                m0.n(viewGroup3, fragment.getParentFragmentManager()).b(m0.e.c.from(this.f8199c.mView.getVisibility()), this);
                            }
                            this.f8199c.mState = 4;
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
                z5 = true;
            }
        } finally {
            this.f8200d = false;
        }
    }

    void n() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        this.f8199c.performPause();
        this.f8197a.f(this.f8199c, false);
    }

    void o(@androidx.annotation.o0 ClassLoader classLoader) {
        Bundle bundle = this.f8199c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f8199c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f8199c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f8199c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f8199c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f8199c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f8199c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f8199c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    void p() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        View focusedView = this.f8199c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.W0(2)) {
                focusedView.toString();
                Objects.toString(this.f8199c);
                Objects.toString(this.f8199c.mView.findFocus());
            }
        }
        this.f8199c.setFocusedView(null);
        this.f8199c.performResume();
        this.f8197a.i(this.f8199c, false);
        Fragment fragment = this.f8199c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @q0
    Fragment.SavedState r() {
        Bundle q5;
        if (this.f8199c.mState <= -1 || (q5 = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q5);
    }

    void s() {
        FragmentState fragmentState = new FragmentState(this.f8199c);
        Fragment fragment = this.f8199c;
        if (fragment.mState <= -1 || fragmentState.A != null) {
            fragmentState.A = fragment.mSavedFragmentState;
        } else {
            Bundle q5 = q();
            fragmentState.A = q5;
            if (this.f8199c.mTargetWho != null) {
                if (q5 == null) {
                    fragmentState.A = new Bundle();
                }
                fragmentState.A.putString("android:target_state", this.f8199c.mTargetWho);
                int i5 = this.f8199c.mTargetRequestCode;
                if (i5 != 0) {
                    fragmentState.A.putInt("android:target_req_state", i5);
                }
            }
        }
        this.f8198b.C(this.f8199c.mWho, fragmentState);
    }

    void t() {
        if (this.f8199c.mView == null) {
            return;
        }
        if (FragmentManager.W0(2)) {
            Objects.toString(this.f8199c);
            Objects.toString(this.f8199c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f8199c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f8199c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f8199c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f8199c.mSavedViewRegistryState = bundle;
    }

    void u(int i5) {
        this.f8201e = i5;
    }

    void v() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        this.f8199c.performStart();
        this.f8197a.k(this.f8199c, false);
    }

    void w() {
        if (FragmentManager.W0(3)) {
            Objects.toString(this.f8199c);
        }
        this.f8199c.performStop();
        this.f8197a.l(this.f8199c, false);
    }

    b0(@androidx.annotation.o0 o oVar, @androidx.annotation.o0 d0 d0Var, @androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 l lVar, @androidx.annotation.o0 FragmentState fragmentState) {
        this.f8197a = oVar;
        this.f8198b = d0Var;
        Fragment a6 = fragmentState.a(lVar, classLoader);
        this.f8199c = a6;
        if (FragmentManager.W0(2)) {
            Objects.toString(a6);
        }
    }

    b0(@androidx.annotation.o0 o oVar, @androidx.annotation.o0 d0 d0Var, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 FragmentState fragmentState) {
        this.f8197a = oVar;
        this.f8198b = d0Var;
        this.f8199c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.A;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}

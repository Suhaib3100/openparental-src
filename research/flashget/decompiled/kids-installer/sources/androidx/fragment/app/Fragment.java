package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.C0536c;
import android.view.C0537d;
import android.view.C0539f;
import android.view.ContextMenu;
import android.view.InterfaceC0538e;
import android.view.LayoutInflater;
import android.view.LiveData;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.f1;
import android.view.h1;
import android.view.i1;
import android.view.j1;
import android.view.result.ActivityResultRegistry;
import android.view.t;
import android.view.t0;
import android.view.w0;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.app.f5;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC0540a;
import kotlin.C0542e;

/* loaded from: classes3.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, android.view.a0, i1, android.view.s, InterfaceC0538e, android.view.result.b {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @androidx.annotation.o0
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @androidx.annotation.j0
    private int mContentLayoutId;
    f1.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    m<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    android.view.c0 mLifecycleRegistry;
    t.c mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;

    @q0
    @c1({c1.a.LIBRARY})
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final l mSavedStateAttachListener;
    C0537d mSavedStateRegistryController;

    @q0
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @q0
    j0 mViewLifecycleOwner;
    android.view.j0<android.view.a0> mViewLifecycleOwnerLiveData;

    @androidx.annotation.o0
    String mWho;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@androidx.annotation.o0 String str, @q0 Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends android.view.result.c<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f8010a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f8011b;

        a(AtomicReference atomicReference, b.a aVar) {
            this.f8010a = atomicReference;
            this.f8011b = aVar;
        }

        @Override // android.view.result.c
        @androidx.annotation.o0
        public b.a<I, ?> a() {
            return this.f8011b;
        }

        @Override // android.view.result.c
        public void c(I i5, @q0 androidx.core.app.i iVar) {
            android.view.result.c cVar = (android.view.result.c) this.f8010a.get();
            if (cVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar.c(i5, iVar);
        }

        @Override // android.view.result.c
        public void d() {
            android.view.result.c cVar = (android.view.result.c) this.f8010a.getAndSet(null);
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    class c extends l {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            Fragment.this.mSavedStateRegistryController.c();
            t0.c(Fragment.this);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ m0 f8016o;

        e(m0 m0Var) {
            this.f8016o = m0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8016o.g();
        }
    }

    class f extends androidx.fragment.app.j {
        f() {
        }

        @Override // androidx.fragment.app.j
        @q0
        public View d(int i5) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i5);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.j
        public boolean f() {
            return Fragment.this.mView != null;
        }
    }

    class g implements h.a<Void, ActivityResultRegistry> {
        g() {
        }

        @Override // h.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof android.view.result.d ? ((android.view.result.d) obj).r() : fragment.requireActivity().r();
        }
    }

    class h implements h.a<Void, ActivityResultRegistry> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f8020a;

        h(ActivityResultRegistry activityResultRegistry) {
            this.f8020a = activityResultRegistry;
        }

        @Override // h.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r12) {
            return this.f8020a;
        }
    }

    class i extends l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.a f8022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f8023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.a f8024c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.view.result.a f8025d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(h.a aVar, AtomicReference atomicReference, b.a aVar2, android.view.result.a aVar3) {
            super(null);
            this.f8022a = aVar;
            this.f8023b = atomicReference;
            this.f8024c = aVar2;
            this.f8025d = aVar3;
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            String generateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f8023b.set(((ActivityResultRegistry) this.f8022a.apply(null)).i(generateActivityResultKey, Fragment.this, this.f8024c, this.f8025d));
        }
    }

    /* loaded from: classes.dex */
    static class j {

        /* renamed from: a, reason: collision with root package name */
        View f8027a;

        /* renamed from: b, reason: collision with root package name */
        boolean f8028b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.a
        int f8029c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.a
        int f8030d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.a
        int f8031e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.a
        int f8032f;

        /* renamed from: g, reason: collision with root package name */
        int f8033g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList<String> f8034h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList<String> f8035i;

        /* renamed from: j, reason: collision with root package name */
        Object f8036j = null;

        /* renamed from: k, reason: collision with root package name */
        Object f8037k;

        /* renamed from: l, reason: collision with root package name */
        Object f8038l;

        /* renamed from: m, reason: collision with root package name */
        Object f8039m;

        /* renamed from: n, reason: collision with root package name */
        Object f8040n;

        /* renamed from: o, reason: collision with root package name */
        Object f8041o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f8042p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f8043q;

        /* renamed from: r, reason: collision with root package name */
        f5 f8044r;

        /* renamed from: s, reason: collision with root package name */
        f5 f8045s;

        /* renamed from: t, reason: collision with root package name */
        float f8046t;

        /* renamed from: u, reason: collision with root package name */
        View f8047u;

        /* renamed from: v, reason: collision with root package name */
        boolean f8048v;

        j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f8037k = obj;
            this.f8038l = null;
            this.f8039m = obj;
            this.f8040n = null;
            this.f8041o = obj;
            this.f8044r = null;
            this.f8045s = null;
            this.f8046t = 1.0f;
            this.f8047u = null;
        }
    }

    @x0(19)
    /* loaded from: classes.dex */
    static class k {
        private k() {
        }

        static void a(@androidx.annotation.o0 View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class l {
        private l() {
        }

        abstract void a();

        /* synthetic */ l(b bVar) {
            this();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new u();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = t.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new android.view.j0<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        t.c cVar = this.mMaxState;
        return (cVar == t.c.INITIALIZED || this.mParentFragment == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new android.view.c0(this);
        this.mSavedStateRegistryController = C0537d.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @androidx.annotation.o0
    @Deprecated
    public static Fragment instantiate(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str) {
        return instantiate(context, str, null);
    }

    @androidx.annotation.o0
    private <I, O> android.view.result.c<I> prepareCallInternal(@androidx.annotation.o0 b.a<I, O> aVar, @androidx.annotation.o0 h.a<Void, ActivityResultRegistry> aVar2, @androidx.annotation.o0 android.view.result.a<O> aVar3) {
        if (this.mState > 1) {
            throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new i(aVar2, atomicReference, aVar, aVar3));
        return new a(atomicReference, aVar);
    }

    private void registerOnPreAttachListener(@androidx.annotation.o0 l lVar) {
        if (this.mState >= 0) {
            lVar.a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    void callStartTransitionListener(boolean z5) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f8048v = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        m0 n5 = m0.n(viewGroup, fragmentManager);
        n5.p();
        if (z5) {
            this.mHost.k().post(new e(n5));
        } else {
            n5.g();
        }
    }

    @androidx.annotation.o0
    androidx.fragment.app.j createFragmentContainer() {
        return new f();
    }

    public void dump(@androidx.annotation.o0 String str, @q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @q0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.e0(androidx.concurrent.futures.b.a(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@q0 Object obj) {
        return super.equals(obj);
    }

    @q0
    Fragment findFragmentByWho(@androidx.annotation.o0 String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.t0(str);
    }

    @androidx.annotation.o0
    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @q0
    public final FragmentActivity getActivity() {
        m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return (FragmentActivity) mVar.i();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f8043q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f8042p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8027a;
    }

    @q0
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @androidx.annotation.o0
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " has not been attached yet."));
    }

    @q0
    public Context getContext() {
        m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.j();
    }

    @Override // android.view.s
    @androidx.annotation.i
    @androidx.annotation.o0
    public AbstractC0540a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.W0(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        C0542e c0542e = new C0542e();
        if (application != null) {
            c0542e.c(f1.a.f8548i, application);
        }
        c0542e.c(t0.f8663c, this);
        c0542e.c(t0.f8664d, this);
        if (getArguments() != null) {
            c0542e.c(t0.f8665e, getArguments());
        }
        return c0542e;
    }

    @Override // android.view.s
    @androidx.annotation.o0
    public f1.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.W0(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new w0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @androidx.annotation.a
    int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8029c;
    }

    @q0
    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8036j;
    }

    f5 getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8044r;
    }

    @androidx.annotation.a
    int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8030d;
    }

    @q0
    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8038l;
    }

    f5 getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8045s;
    }

    View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8047u;
    }

    @q0
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @q0
    public final Object getHost() {
        m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.o();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @androidx.annotation.o0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // android.view.a0
    @androidx.annotation.o0
    public android.view.t getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.d(this);
    }

    int getNextTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8033g;
    }

    @q0
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @androidx.annotation.o0
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " not associated with a fragment manager."));
    }

    boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f8028b;
    }

    @androidx.annotation.a
    int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8031e;
    }

    @androidx.annotation.a
    int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8032f;
    }

    float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f8046t;
    }

    @q0
    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f8039m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @androidx.annotation.o0
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        a0.c.k(this);
        return this.mRetainInstance;
    }

    @q0
    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f8037k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // android.view.InterfaceC0538e
    @androidx.annotation.o0
    public final C0536c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @q0
    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8040n;
    }

    @q0
    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f8041o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @androidx.annotation.o0
    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f8034h) == null) ? new ArrayList<>() : arrayList;
    }

    @androidx.annotation.o0
    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f8035i) == null) ? new ArrayList<>() : arrayList;
    }

    @androidx.annotation.o0
    public final String getString(@g1 int i5) {
        return getResources().getString(i5);
    }

    @q0
    public final String getTag() {
        return this.mTag;
    }

    @q0
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        a0.c.l(this);
        return this.mTargetRequestCode;
    }

    @androidx.annotation.o0
    public final CharSequence getText(@g1 int i5) {
        return getResources().getText(i5);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @q0
    public View getView() {
        return this.mView;
    }

    @androidx.annotation.o0
    @androidx.annotation.l0
    public android.view.a0 getViewLifecycleOwner() {
        j0 j0Var = this.mViewLifecycleOwner;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @androidx.annotation.o0
    public LiveData<android.view.a0> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // android.view.i1
    @androidx.annotation.o0
    public h1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != t.c.INITIALIZED.ordinal()) {
            return this.mFragmentManager.R0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new u();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.Y0(this.mParentFragment));
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.Z0(this.mParentFragment));
    }

    boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f8048v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.c1();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.m1();
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    @Deprecated
    public void onActivityCreated(@q0 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i5, int i6, @q0 Intent intent) {
        if (FragmentManager.W0(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onAttach(@androidx.annotation.o0 Context context) {
        this.mCalled = true;
        m<?> mVar = this.mHost;
        Activity i5 = mVar == null ? null : mVar.i();
        if (i5 != null) {
            this.mCalled = false;
            onAttach(i5);
        }
    }

    @androidx.annotation.l0
    @Deprecated
    public void onAttachFragment(@androidx.annotation.o0 Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    public void onConfigurationChanged(@androidx.annotation.o0 Configuration configuration) {
        this.mCalled = true;
    }

    @androidx.annotation.l0
    public boolean onContextItemSelected(@androidx.annotation.o0 MenuItem menuItem) {
        return false;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onCreate(@q0 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.b1(1)) {
            return;
        }
        this.mChildFragmentManager.J();
    }

    @q0
    @androidx.annotation.l0
    public Animation onCreateAnimation(int i5, boolean z5, int i6) {
        return null;
    }

    @q0
    @androidx.annotation.l0
    public Animator onCreateAnimator(int i5, boolean z5, int i6) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @androidx.annotation.l0
    public void onCreateContextMenu(@androidx.annotation.o0 ContextMenu contextMenu, @androidx.annotation.o0 View view, @q0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @androidx.annotation.l0
    @Deprecated
    public void onCreateOptionsMenu(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
    }

    @q0
    @androidx.annotation.l0
    public View onCreateView(@androidx.annotation.o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        int i5 = this.mContentLayoutId;
        if (i5 != 0) {
            return layoutInflater.inflate(i5, viewGroup, false);
        }
        return null;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onDestroy() {
        this.mCalled = true;
    }

    @androidx.annotation.l0
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onDestroyView() {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onDetach() {
        this.mCalled = true;
    }

    @androidx.annotation.o0
    public LayoutInflater onGetLayoutInflater(@q0 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @androidx.annotation.l0
    public void onHiddenChanged(boolean z5) {
    }

    @androidx.annotation.i
    @l1
    public void onInflate(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet, @q0 Bundle bundle) {
        this.mCalled = true;
        m<?> mVar = this.mHost;
        Activity i5 = mVar == null ? null : mVar.i();
        if (i5 != null) {
            this.mCalled = false;
            onInflate(i5, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    @androidx.annotation.l0
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z5) {
    }

    @androidx.annotation.l0
    @Deprecated
    public boolean onOptionsItemSelected(@androidx.annotation.o0 MenuItem menuItem) {
        return false;
    }

    @androidx.annotation.l0
    @Deprecated
    public void onOptionsMenuClosed(@androidx.annotation.o0 Menu menu) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z5) {
    }

    @androidx.annotation.l0
    @Deprecated
    public void onPrepareOptionsMenu(@androidx.annotation.o0 Menu menu) {
    }

    @androidx.annotation.l0
    public void onPrimaryNavigationFragmentChanged(boolean z5) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i5, @androidx.annotation.o0 String[] strArr, @androidx.annotation.o0 int[] iArr) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onResume() {
        this.mCalled = true;
    }

    @androidx.annotation.l0
    public void onSaveInstanceState(@androidx.annotation.o0 Bundle bundle) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onStart() {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onStop() {
        this.mCalled = true;
    }

    @androidx.annotation.l0
    public void onViewCreated(@androidx.annotation.o0 View view, @q0 Bundle bundle) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onViewStateRestored(@q0 Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        this.mChildFragmentManager.F();
    }

    void performAttach() {
        Iterator<l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.s(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.j());
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.P(this);
        this.mChildFragmentManager.G();
    }

    void performConfigurationChanged(@androidx.annotation.o0 Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.e1(configuration);
    }

    boolean performContextItemSelected(@androidx.annotation.o0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.I(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new android.view.w() { // from class: androidx.fragment.app.Fragment.6
            @Override // android.view.w
            public void h(@androidx.annotation.o0 android.view.a0 a0Var, @androidx.annotation.o0 t.b bVar) {
                View view;
                if (bVar != t.b.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.j(t.b.ON_CREATE);
    }

    boolean performCreateOptionsMenu(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
        boolean z5 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z5 = true;
        }
        return z5 | this.mChildFragmentManager.K(menu, menuInflater);
    }

    void performCreateView(@androidx.annotation.o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        this.mChildFragmentManager.m1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new j0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.b();
            j1.b(this.mView, this.mViewLifecycleOwner);
            android.view.l1.b(this.mView, this.mViewLifecycleOwner);
            C0539f.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.q(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.L();
        this.mLifecycleRegistry.j(t.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    void performDestroyView() {
        this.mChildFragmentManager.M();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().isAtLeast(t.c.CREATED)) {
            this.mViewLifecycleOwner.a(t.b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        androidx.loader.app.a.d(this).h();
        this.mPerformedCreateView = false;
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.V0()) {
            return;
        }
        this.mChildFragmentManager.L();
        this.mChildFragmentManager = new u();
    }

    @androidx.annotation.o0
    LayoutInflater performGetLayoutInflater(@q0 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.N();
    }

    void performMultiWindowModeChanged(boolean z5) {
        onMultiWindowModeChanged(z5);
        this.mChildFragmentManager.O(z5);
    }

    boolean performOptionsItemSelected(@androidx.annotation.o0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.R(menuItem);
    }

    void performOptionsMenuClosed(@androidx.annotation.o0 Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.S(menu);
    }

    void performPause() {
        this.mChildFragmentManager.U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(t.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.j(t.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    void performPictureInPictureModeChanged(boolean z5) {
        onPictureInPictureModeChanged(z5);
        this.mChildFragmentManager.V(z5);
    }

    boolean performPrepareOptionsMenu(@androidx.annotation.o0 Menu menu) {
        boolean z5 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z5 = true;
        }
        return z5 | this.mChildFragmentManager.W(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean a12 = this.mFragmentManager.a1(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != a12) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(a12);
            onPrimaryNavigationFragmentChanged(a12);
            this.mChildFragmentManager.X();
        }
    }

    void performResume() {
        this.mChildFragmentManager.m1();
        this.mChildFragmentManager.j0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onResume()"));
        }
        android.view.c0 c0Var = this.mLifecycleRegistry;
        t.b bVar = t.b.ON_RESUME;
        c0Var.j(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(bVar);
        }
        this.mChildFragmentManager.Y();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
        Bundle d12 = this.mChildFragmentManager.d1();
        if (d12 != null) {
            bundle.putParcelable("android:support:fragments", d12);
        }
    }

    void performStart() {
        this.mChildFragmentManager.m1();
        this.mChildFragmentManager.j0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onStart()"));
        }
        android.view.c0 c0Var = this.mLifecycleRegistry;
        t.b bVar = t.b.ON_START;
        c0Var.j(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(bVar);
        }
        this.mChildFragmentManager.Z();
    }

    void performStop() {
        this.mChildFragmentManager.b0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(t.b.ON_STOP);
        }
        this.mLifecycleRegistry.j(t.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.c0();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f8048v = true;
    }

    @Override // android.view.result.b
    @androidx.annotation.o0
    @androidx.annotation.l0
    public final <I, O> android.view.result.c<I> registerForActivityResult(@androidx.annotation.o0 b.a<I, O> aVar, @androidx.annotation.o0 android.view.result.a<O> aVar2) {
        return prepareCallInternal(aVar, new g(), aVar2);
    }

    public void registerForContextMenu(@androidx.annotation.o0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@androidx.annotation.o0 String[] strArr, int i5) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().i1(this, strArr, i5);
    }

    @androidx.annotation.o0
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " not attached to an activity."));
    }

    @androidx.annotation.o0
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " does not have any arguments."));
    }

    @androidx.annotation.o0
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " not attached to a context."));
    }

    @androidx.annotation.o0
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @androidx.annotation.o0
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " not attached to a host."));
    }

    @androidx.annotation.o0
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @androidx.annotation.o0
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    void restoreChildFragmentState(@q0 Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.L1(parcelable);
        this.mChildFragmentManager.J();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new o0(androidx.fragment.app.d.a("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(t.b.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z5) {
        ensureAnimationInfo().f8043q = Boolean.valueOf(z5);
    }

    public void setAllowReturnTransitionOverlap(boolean z5) {
        ensureAnimationInfo().f8042p = Boolean.valueOf(z5);
    }

    void setAnimations(@androidx.annotation.a int i5, @androidx.annotation.a int i6, @androidx.annotation.a int i7, @androidx.annotation.a int i8) {
        if (this.mAnimationInfo == null && i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
            return;
        }
        ensureAnimationInfo().f8029c = i5;
        ensureAnimationInfo().f8030d = i6;
        ensureAnimationInfo().f8031e = i7;
        ensureAnimationInfo().f8032f = i8;
    }

    public void setArguments(@q0 Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@q0 f5 f5Var) {
        ensureAnimationInfo().f8044r = f5Var;
    }

    public void setEnterTransition(@q0 Object obj) {
        ensureAnimationInfo().f8036j = obj;
    }

    public void setExitSharedElementCallback(@q0 f5 f5Var) {
        ensureAnimationInfo().f8045s = f5Var;
    }

    public void setExitTransition(@q0 Object obj) {
        ensureAnimationInfo().f8038l = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f8047u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z5) {
        if (this.mHasMenu != z5) {
            this.mHasMenu = z5;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.H();
        }
    }

    public void setInitialSavedState(@q0 SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f8009o) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z5) {
        if (this.mMenuVisible != z5) {
            this.mMenuVisible = z5;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.H();
            }
        }
    }

    void setNextTransition(int i5) {
        if (this.mAnimationInfo == null && i5 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f8033g = i5;
    }

    void setPopDirection(boolean z5) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f8028b = z5;
    }

    void setPostOnViewCreatedAlpha(float f6) {
        ensureAnimationInfo().f8046t = f6;
    }

    public void setReenterTransition(@q0 Object obj) {
        ensureAnimationInfo().f8039m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z5) {
        a0.c.o(this);
        this.mRetainInstance = z5;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z5) {
            fragmentManager.q(this);
        } else {
            fragmentManager.F1(this);
        }
    }

    public void setReturnTransition(@q0 Object obj) {
        ensureAnimationInfo().f8037k = obj;
    }

    public void setSharedElementEnterTransition(@q0 Object obj) {
        ensureAnimationInfo().f8040n = obj;
    }

    void setSharedElementNames(@q0 ArrayList<String> arrayList, @q0 ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        j jVar = this.mAnimationInfo;
        jVar.f8034h = arrayList;
        jVar.f8035i = arrayList2;
    }

    public void setSharedElementReturnTransition(@q0 Object obj) {
        ensureAnimationInfo().f8041o = obj;
    }

    @Deprecated
    public void setTargetFragment(@q0 Fragment fragment, int i5) {
        if (fragment != null) {
            a0.c.p(this, fragment, i5);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(androidx.fragment.app.d.a("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i5;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z5) {
        a0.c.q(this, z5);
        if (!this.mUserVisibleHint && z5 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.p1(fragmentManager.D(this));
        }
        this.mUserVisibleHint = z5;
        this.mDeferStart = this.mState < 5 && !z5;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z5);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@androidx.annotation.o0 String str) {
        m<?> mVar = this.mHost;
        if (mVar != null) {
            return mVar.y(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i5) {
        startActivityForResult(intent, i5, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, @q0 Intent intent, int i6, int i7, int i8, @q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.W0(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        getParentFragmentManager().k1(this, intentSender, i5, intent, i6, i7, i8, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f8048v) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f8048v = false;
        } else if (Looper.myLooper() != this.mHost.k().getLooper()) {
            this.mHost.k().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@androidx.annotation.o0 View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {

        @androidx.annotation.o0
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        final Bundle f8009o;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        SavedState(Bundle bundle) {
            this.f8009o = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@androidx.annotation.o0 Parcel parcel, int i5) {
            parcel.writeBundle(this.f8009o);
        }

        SavedState(@androidx.annotation.o0 Parcel parcel, @q0 ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f8009o = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @q0
    private Fragment getTargetFragment(boolean z5) {
        String str;
        if (z5) {
            a0.c.m(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.o0(str);
    }

    @androidx.annotation.o0
    @Deprecated
    public static Fragment instantiate(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, @q0 Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.l.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e6) {
            throw new InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (java.lang.InstantiationException e7) {
            throw new InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e8) {
            throw new InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e8);
        } catch (InvocationTargetException e9) {
            throw new InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e9);
        }
    }

    @androidx.annotation.o0
    public final String getString(@g1 int i5, @q0 Object... objArr) {
        return getResources().getString(i5, objArr);
    }

    public final void postponeEnterTransition(long j5, @androidx.annotation.o0 TimeUnit timeUnit) {
        ensureAnimationInfo().f8048v = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler k5 = fragmentManager != null ? fragmentManager.J0().k() : new Handler(Looper.getMainLooper());
        k5.removeCallbacks(this.mPostponedDurationRunnable);
        k5.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j5));
    }

    @Override // android.view.result.b
    @androidx.annotation.o0
    @androidx.annotation.l0
    public final <I, O> android.view.result.c<I> registerForActivityResult(@androidx.annotation.o0 b.a<I, O> aVar, @androidx.annotation.o0 ActivityResultRegistry activityResultRegistry, @androidx.annotation.o0 android.view.result.a<O> aVar2) {
        return prepareCallInternal(aVar, new h(activityResultRegistry), aVar2);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @q0 Bundle bundle) {
        m<?> mVar = this.mHost;
        if (mVar == null) {
            throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " not attached to Activity"));
        }
        mVar.B(this, intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i5, @q0 Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.d.a("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().j1(this, intent, i5, bundle);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @Deprecated
    public LayoutInflater getLayoutInflater(@q0 Bundle bundle) {
        m<?> mVar = this.mHost;
        if (mVar != null) {
            LayoutInflater p5 = mVar.p();
            p5.setFactory2(this.mChildFragmentManager.K0());
            return p5;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    @Deprecated
    public void onAttach(@androidx.annotation.o0 Activity activity) {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @l1
    @Deprecated
    public void onInflate(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 AttributeSet attributeSet, @q0 Bundle bundle) {
        this.mCalled = true;
    }

    @androidx.annotation.o
    public Fragment(@androidx.annotation.j0 int i5) {
        this();
        this.mContentLayoutId = i5;
    }

    private void restoreViewState() {
        if (FragmentManager.W0(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
}

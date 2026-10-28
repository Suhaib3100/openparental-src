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
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.view.AbstractC1450w;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1459c;
import androidx.view.C1460d;
import androidx.view.C1463g;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1449v;
import androidx.view.InterfaceC1461e;
import androidx.view.LiveData;
import androidx.view.k1;
import androidx.view.n1;
import androidx.view.o1;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.z0;
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
import kotlin.AbstractC1477a;
import kotlin.C1481e;

/* loaded from: classes3.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1423e0, o1, InterfaceC1449v, InterfaceC1461e, androidx.view.result.b {
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
    k1.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    o<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.view.g0 mLifecycleRegistry;
    AbstractC1450w.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @androidx.annotation.q0
    @c1({c1.a.LIBRARY})
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final l mSavedStateAttachListener;
    C1460d mSavedStateRegistryController;

    @androidx.annotation.q0
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

    @androidx.annotation.q0
    q0 mViewLifecycleOwner;
    androidx.view.o0<InterfaceC1423e0> mViewLifecycleOwnerLiveData;

    @androidx.annotation.o0
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@androidx.annotation.o0 String str, @androidx.annotation.q0 Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends androidx.view.result.h<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f29734a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f29735b;

        a(AtomicReference atomicReference, b.a aVar) {
            this.f29734a = atomicReference;
            this.f29735b = aVar;
        }

        @Override // androidx.view.result.h
        @androidx.annotation.o0
        public b.a<I, ?> a() {
            return this.f29735b;
        }

        @Override // androidx.view.result.h
        public void c(I i4, @androidx.annotation.q0 androidx.core.app.e eVar) {
            androidx.view.result.h hVar = (androidx.view.result.h) this.f29734a.get();
            if (hVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            hVar.c(i4, eVar);
        }

        @Override // androidx.view.result.h
        public void d() {
            androidx.view.result.h hVar = (androidx.view.result.h) this.f29734a.getAndSet(null);
            if (hVar != null) {
                hVar.d();
            }
        }
    }

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
            z0.c(Fragment.this);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f29740b;

        e(u0 u0Var) {
            this.f29740b = u0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29740b.g();
        }
    }

    class f extends androidx.fragment.app.l {
        f() {
        }

        @Override // androidx.fragment.app.l
        @androidx.annotation.q0
        public View c(int i4) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i4);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.l
        public boolean d() {
            return Fragment.this.mView != null;
        }
    }

    class g implements i.a<Void, ActivityResultRegistry> {
        g() {
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof androidx.view.result.j ? ((androidx.view.result.j) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    class h implements i.a<Void, ActivityResultRegistry> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f29744a;

        h(ActivityResultRegistry activityResultRegistry) {
            this.f29744a = activityResultRegistry;
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r12) {
            return this.f29744a;
        }
    }

    class i extends l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.a f29746a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f29747b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.a f29748c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.view.result.a f29749d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(i.a aVar, AtomicReference atomicReference, b.a aVar2, androidx.view.result.a aVar3) {
            super(null);
            this.f29746a = aVar;
            this.f29747b = atomicReference;
            this.f29748c = aVar2;
            this.f29749d = aVar3;
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            String generateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f29747b.set(((ActivityResultRegistry) this.f29746a.apply(null)).i(generateActivityResultKey, Fragment.this, this.f29748c, this.f29749d));
        }
    }

    static class j {

        /* renamed from: a, reason: collision with root package name */
        View f29751a;

        /* renamed from: b, reason: collision with root package name */
        boolean f29752b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.a
        int f29753c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.a
        int f29754d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.a
        int f29755e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.a
        int f29756f;

        /* renamed from: g, reason: collision with root package name */
        int f29757g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList<String> f29758h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList<String> f29759i;

        /* renamed from: j, reason: collision with root package name */
        Object f29760j = null;

        /* renamed from: k, reason: collision with root package name */
        Object f29761k;

        /* renamed from: l, reason: collision with root package name */
        Object f29762l;

        /* renamed from: m, reason: collision with root package name */
        Object f29763m;

        /* renamed from: n, reason: collision with root package name */
        Object f29764n;

        /* renamed from: o, reason: collision with root package name */
        Object f29765o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f29766p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f29767q;

        /* renamed from: r, reason: collision with root package name */
        androidx.core.app.w0 f29768r;

        /* renamed from: s, reason: collision with root package name */
        androidx.core.app.w0 f29769s;

        /* renamed from: t, reason: collision with root package name */
        float f29770t;

        /* renamed from: u, reason: collision with root package name */
        View f29771u;

        /* renamed from: v, reason: collision with root package name */
        boolean f29772v;

        j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f29761k = obj;
            this.f29762l = null;
            this.f29763m = obj;
            this.f29764n = null;
            this.f29765o = obj;
            this.f29768r = null;
            this.f29769s = null;
            this.f29770t = 1.0f;
            this.f29771u = null;
        }
    }

    @androidx.annotation.x0(19)
    static class k {
        private k() {
        }

        static void a(@androidx.annotation.o0 View view) {
            view.cancelPendingInputEvents();
        }
    }

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
        this.mChildFragmentManager = new z();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = AbstractC1450w.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.view.o0<>();
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
        AbstractC1450w.b bVar = this.mMaxState;
        return (bVar == AbstractC1450w.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.view.g0(this);
        this.mSavedStateRegistryController = C1460d.a(this);
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
    private <I, O> androidx.view.result.h<I> prepareCallInternal(@androidx.annotation.o0 b.a<I, O> aVar, @androidx.annotation.o0 i.a<Void, ActivityResultRegistry> aVar2, @androidx.annotation.o0 androidx.view.result.a<O> aVar3) {
        if (this.mState > 1) {
            throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
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

    void callStartTransitionListener(boolean z4) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f29772v = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        u0 n4 = u0.n(viewGroup, fragmentManager);
        n4.p();
        if (z4) {
            this.mHost.g().post(new e(n4));
        } else {
            n4.g();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @androidx.annotation.o0
    androidx.fragment.app.l createFragmentContainer() {
        return new f();
    }

    public void dump(@androidx.annotation.o0 String str, @androidx.annotation.q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @androidx.annotation.q0 String[] strArr) {
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
        this.mChildFragmentManager.e0(androidx.compose.runtime.changelist.j.a(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@androidx.annotation.q0 Object obj) {
        return super.equals(obj);
    }

    @androidx.annotation.q0
    Fragment findFragmentByWho(@androidx.annotation.o0 String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.t0(str);
    }

    @androidx.annotation.o0
    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @androidx.annotation.q0
    public final FragmentActivity getActivity() {
        o<?> oVar = this.mHost;
        if (oVar == null) {
            return null;
        }
        return (FragmentActivity) oVar.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f29767q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f29766p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f29751a;
    }

    @androidx.annotation.q0
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @androidx.annotation.o0
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " has not been attached yet."));
    }

    @androidx.annotation.q0
    public Context getContext() {
        o<?> oVar = this.mHost;
        if (oVar == null) {
            return null;
        }
        return oVar.f();
    }

    @Override // androidx.view.InterfaceC1449v
    @androidx.annotation.i
    @androidx.annotation.o0
    public AbstractC1477a getDefaultViewModelCreationExtras() {
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
        C1481e c1481e = new C1481e();
        if (application != null) {
            c1481e.c(k1.a.f30372i, application);
        }
        c1481e.c(z0.f30493c, this);
        c1481e.c(z0.f30494d, this);
        if (getArguments() != null) {
            c1481e.c(z0.f30495e, getArguments());
        }
        return c1481e;
    }

    @Override // androidx.view.InterfaceC1449v
    @androidx.annotation.o0
    public k1.b getDefaultViewModelProviderFactory() {
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
            this.mDefaultFactory = new androidx.view.c1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @androidx.annotation.a
    int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f29753c;
    }

    @androidx.annotation.q0
    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f29760j;
    }

    androidx.core.app.w0 getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f29768r;
    }

    @androidx.annotation.a
    int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f29754d;
    }

    @androidx.annotation.q0
    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f29762l;
    }

    androidx.core.app.w0 getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f29769s;
    }

    View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f29771u;
    }

    @androidx.annotation.q0
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @androidx.annotation.q0
    public final Object getHost() {
        o<?> oVar = this.mHost;
        if (oVar == null) {
            return null;
        }
        return oVar.i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @androidx.annotation.o0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.view.InterfaceC1423e0
    @androidx.annotation.o0
    public AbstractC1450w getLifecycle() {
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
        return jVar.f29757g;
    }

    @androidx.annotation.q0
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @androidx.annotation.o0
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " not associated with a fragment manager."));
    }

    boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f29752b;
    }

    @androidx.annotation.a
    int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f29755e;
    }

    @androidx.annotation.a
    int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f29756f;
    }

    float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f29770t;
    }

    @androidx.annotation.q0
    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f29763m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @androidx.annotation.o0
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        w1.c.k(this);
        return this.mRetainInstance;
    }

    @androidx.annotation.q0
    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f29761k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.view.InterfaceC1461e
    @androidx.annotation.o0
    public final C1459c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @androidx.annotation.q0
    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f29764n;
    }

    @androidx.annotation.q0
    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f29765o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @androidx.annotation.o0
    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f29758h) == null) ? new ArrayList<>() : arrayList;
    }

    @androidx.annotation.o0
    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f29759i) == null) ? new ArrayList<>() : arrayList;
    }

    @androidx.annotation.o0
    public final String getString(@g1 int i4) {
        return getResources().getString(i4);
    }

    @androidx.annotation.q0
    public final String getTag() {
        return this.mTag;
    }

    @androidx.annotation.q0
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        w1.c.l(this);
        return this.mTargetRequestCode;
    }

    @androidx.annotation.o0
    public final CharSequence getText(@g1 int i4) {
        return getResources().getText(i4);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @androidx.annotation.q0
    public View getView() {
        return this.mView;
    }

    @androidx.annotation.o0
    @androidx.annotation.l0
    public InterfaceC1423e0 getViewLifecycleOwner() {
        q0 q0Var = this.mViewLifecycleOwner;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @androidx.annotation.o0
    public LiveData<InterfaceC1423e0> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.view.o1
    @androidx.annotation.o0
    public n1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != AbstractC1450w.b.INITIALIZED.ordinal()) {
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
        this.mChildFragmentManager = new z();
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
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.Z0(this.mParentFragment));
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
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.a1(this.mParentFragment));
    }

    boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f29772v;
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
        return fragmentManager.d1();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.n1();
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    @Deprecated
    public void onActivityCreated(@androidx.annotation.q0 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i4, int i5, @androidx.annotation.q0 Intent intent) {
        if (FragmentManager.W0(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onAttach(@androidx.annotation.o0 Context context) {
        this.mCalled = true;
        o<?> oVar = this.mHost;
        Activity e4 = oVar == null ? null : oVar.e();
        if (e4 != null) {
            this.mCalled = false;
            onAttach(e4);
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
    public void onCreate(@androidx.annotation.q0 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.c1(1)) {
            return;
        }
        this.mChildFragmentManager.J();
    }

    @androidx.annotation.q0
    @androidx.annotation.l0
    public Animation onCreateAnimation(int i4, boolean z4, int i5) {
        return null;
    }

    @androidx.annotation.q0
    @androidx.annotation.l0
    public Animator onCreateAnimator(int i4, boolean z4, int i5) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @androidx.annotation.l0
    public void onCreateContextMenu(@androidx.annotation.o0 ContextMenu contextMenu, @androidx.annotation.o0 View view, @androidx.annotation.q0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @androidx.annotation.l0
    @Deprecated
    public void onCreateOptionsMenu(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
    }

    @androidx.annotation.q0
    @androidx.annotation.l0
    public View onCreateView(@androidx.annotation.o0 LayoutInflater layoutInflater, @androidx.annotation.q0 ViewGroup viewGroup, @androidx.annotation.q0 Bundle bundle) {
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
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
    public LayoutInflater onGetLayoutInflater(@androidx.annotation.q0 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @androidx.annotation.l0
    public void onHiddenChanged(boolean z4) {
    }

    @androidx.annotation.i
    @l1
    public void onInflate(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Bundle bundle) {
        this.mCalled = true;
        o<?> oVar = this.mHost;
        Activity e4 = oVar == null ? null : oVar.e();
        if (e4 != null) {
            this.mCalled = false;
            onInflate(e4, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    @androidx.annotation.l0
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z4) {
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

    public void onPictureInPictureModeChanged(boolean z4) {
    }

    @androidx.annotation.l0
    @Deprecated
    public void onPrepareOptionsMenu(@androidx.annotation.o0 Menu menu) {
    }

    @androidx.annotation.l0
    public void onPrimaryNavigationFragmentChanged(boolean z4) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i4, @androidx.annotation.o0 String[] strArr, @androidx.annotation.o0 int[] iArr) {
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
    public void onViewCreated(@androidx.annotation.o0 View view, @androidx.annotation.q0 Bundle bundle) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onViewStateRestored(@androidx.annotation.q0 Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.n1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onActivityCreated()"));
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
        onAttach(this.mHost.f());
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.P(this);
        this.mChildFragmentManager.G();
    }

    void performConfigurationChanged(@androidx.annotation.o0 Configuration configuration) {
        onConfigurationChanged(configuration);
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
        this.mChildFragmentManager.n1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new InterfaceC1416b0() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.view.InterfaceC1416b0
            public void f(@androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0, @androidx.annotation.o0 AbstractC1450w.a aVar) {
                View view;
                if (aVar != AbstractC1450w.a.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.l(AbstractC1450w.a.ON_CREATE);
    }

    boolean performCreateOptionsMenu(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
        boolean z4 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z4 = true;
        }
        return z4 | this.mChildFragmentManager.K(menu, menuInflater);
    }

    void performCreateView(@androidx.annotation.o0 LayoutInflater layoutInflater, @androidx.annotation.q0 ViewGroup viewGroup, @androidx.annotation.q0 Bundle bundle) {
        this.mChildFragmentManager.n1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new q0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.b();
            C1442q1.b(this.mView, this.mViewLifecycleOwner);
            C1446s1.b(this.mView, this.mViewLifecycleOwner);
            C1463g.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.r(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.L();
        this.mLifecycleRegistry.l(AbstractC1450w.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    void performDestroyView() {
        this.mChildFragmentManager.M();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getState().isAtLeast(AbstractC1450w.b.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC1450w.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onDestroyView()"));
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
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.V0()) {
            return;
        }
        this.mChildFragmentManager.L();
        this.mChildFragmentManager = new z();
    }

    @androidx.annotation.o0
    LayoutInflater performGetLayoutInflater(@androidx.annotation.q0 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z4) {
        onMultiWindowModeChanged(z4);
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
            this.mViewLifecycleOwner.a(AbstractC1450w.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.l(AbstractC1450w.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    void performPictureInPictureModeChanged(boolean z4) {
        onPictureInPictureModeChanged(z4);
    }

    boolean performPrepareOptionsMenu(@androidx.annotation.o0 Menu menu) {
        boolean z4 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z4 = true;
        }
        return z4 | this.mChildFragmentManager.W(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean b12 = this.mFragmentManager.b1(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != b12) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(b12);
            onPrimaryNavigationFragmentChanged(b12);
            this.mChildFragmentManager.X();
        }
    }

    void performResume() {
        this.mChildFragmentManager.n1();
        this.mChildFragmentManager.j0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.view.g0 g0Var = this.mLifecycleRegistry;
        AbstractC1450w.a aVar = AbstractC1450w.a.ON_RESUME;
        g0Var.l(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Y();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
        Bundle e12 = this.mChildFragmentManager.e1();
        if (e12 != null) {
            bundle.putParcelable("android:support:fragments", e12);
        }
    }

    void performStart() {
        this.mChildFragmentManager.n1();
        this.mChildFragmentManager.j0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.view.g0 g0Var = this.mLifecycleRegistry;
        AbstractC1450w.a aVar = AbstractC1450w.a.ON_START;
        g0Var.l(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Z();
    }

    void performStop() {
        this.mChildFragmentManager.b0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1450w.a.ON_STOP);
        }
        this.mLifecycleRegistry.l(AbstractC1450w.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.c0();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f29772v = true;
    }

    @Override // androidx.view.result.b
    @androidx.annotation.o0
    @androidx.annotation.l0
    public final <I, O> androidx.view.result.h<I> registerForActivityResult(@androidx.annotation.o0 b.a<I, O> aVar, @androidx.annotation.o0 androidx.view.result.a<O> aVar2) {
        return prepareCallInternal(aVar, new g(), aVar2);
    }

    public void registerForContextMenu(@androidx.annotation.o0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@androidx.annotation.o0 String[] strArr, int i4) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().j1(this, strArr, i4);
    }

    @androidx.annotation.o0
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " not attached to an activity."));
    }

    @androidx.annotation.o0
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " does not have any arguments."));
    }

    @androidx.annotation.o0
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " not attached to a context."));
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
        throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " not attached to a host."));
    }

    @androidx.annotation.o0
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @androidx.annotation.o0
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    void restoreChildFragmentState(@androidx.annotation.q0 Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.M1(parcelable);
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
            throw new w0(androidx.fragment.app.f.a("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1450w.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z4) {
        ensureAnimationInfo().f29767q = Boolean.valueOf(z4);
    }

    public void setAllowReturnTransitionOverlap(boolean z4) {
        ensureAnimationInfo().f29766p = Boolean.valueOf(z4);
    }

    void setAnimations(@androidx.annotation.a int i4, @androidx.annotation.a int i5, @androidx.annotation.a int i6, @androidx.annotation.a int i7) {
        if (this.mAnimationInfo == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        ensureAnimationInfo().f29753c = i4;
        ensureAnimationInfo().f29754d = i5;
        ensureAnimationInfo().f29755e = i6;
        ensureAnimationInfo().f29756f = i7;
    }

    public void setArguments(@androidx.annotation.q0 Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@androidx.annotation.q0 androidx.core.app.w0 w0Var) {
        ensureAnimationInfo().f29768r = w0Var;
    }

    public void setEnterTransition(@androidx.annotation.q0 Object obj) {
        ensureAnimationInfo().f29760j = obj;
    }

    public void setExitSharedElementCallback(@androidx.annotation.q0 androidx.core.app.w0 w0Var) {
        ensureAnimationInfo().f29769s = w0Var;
    }

    public void setExitTransition(@androidx.annotation.q0 Object obj) {
        ensureAnimationInfo().f29762l = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f29771u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z4) {
        if (this.mHasMenu != z4) {
            this.mHasMenu = z4;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.s();
        }
    }

    public void setInitialSavedState(@androidx.annotation.q0 SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f29733b) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z4) {
        if (this.mMenuVisible != z4) {
            this.mMenuVisible = z4;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.s();
            }
        }
    }

    void setNextTransition(int i4) {
        if (this.mAnimationInfo == null && i4 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f29757g = i4;
    }

    void setPopDirection(boolean z4) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f29752b = z4;
    }

    void setPostOnViewCreatedAlpha(float f4) {
        ensureAnimationInfo().f29770t = f4;
    }

    public void setReenterTransition(@androidx.annotation.q0 Object obj) {
        ensureAnimationInfo().f29763m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z4) {
        w1.c.o(this);
        this.mRetainInstance = z4;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z4) {
            fragmentManager.q(this);
        } else {
            fragmentManager.G1(this);
        }
    }

    public void setReturnTransition(@androidx.annotation.q0 Object obj) {
        ensureAnimationInfo().f29761k = obj;
    }

    public void setSharedElementEnterTransition(@androidx.annotation.q0 Object obj) {
        ensureAnimationInfo().f29764n = obj;
    }

    void setSharedElementNames(@androidx.annotation.q0 ArrayList<String> arrayList, @androidx.annotation.q0 ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        j jVar = this.mAnimationInfo;
        jVar.f29758h = arrayList;
        jVar.f29759i = arrayList2;
    }

    public void setSharedElementReturnTransition(@androidx.annotation.q0 Object obj) {
        ensureAnimationInfo().f29765o = obj;
    }

    @Deprecated
    public void setTargetFragment(@androidx.annotation.q0 Fragment fragment, int i4) {
        if (fragment != null) {
            w1.c.p(this, fragment, i4);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(androidx.fragment.app.f.a("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
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
        this.mTargetRequestCode = i4;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z4) {
        w1.c.q(this, z4);
        if (!this.mUserVisibleHint && z4 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.q1(fragmentManager.D(this));
        }
        this.mUserVisibleHint = z4;
        this.mDeferStart = this.mState < 5 && !z4;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z4);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@androidx.annotation.o0 String str) {
        o<?> oVar = this.mHost;
        if (oVar != null) {
            return oVar.o(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        startActivityForResult(intent, i4, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @androidx.annotation.q0 Intent intent, int i5, int i6, int i7, @androidx.annotation.q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.W0(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        getParentFragmentManager().l1(this, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f29772v) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f29772v = false;
        } else if (Looper.myLooper() != this.mHost.g().getLooper()) {
            this.mHost.g().postAtFrontOfQueue(new d());
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
    public static class SavedState implements Parcelable {

        @androidx.annotation.o0
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        final Bundle f29733b;

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
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Bundle bundle) {
            this.f29733b = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@androidx.annotation.o0 Parcel parcel, int i4) {
            parcel.writeBundle(this.f29733b);
        }

        SavedState(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f29733b = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @androidx.annotation.q0
    private Fragment getTargetFragment(boolean z4) {
        String str;
        if (z4) {
            w1.c.m(this);
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
    public static Fragment instantiate(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, @androidx.annotation.q0 Bundle bundle) {
        try {
            Fragment newInstance = n.loadFragmentClass(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e4) {
            throw new InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e4);
        } catch (java.lang.InstantiationException e5) {
            throw new InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e5);
        } catch (NoSuchMethodException e6) {
            throw new InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), (Throwable) e6);
        } catch (InvocationTargetException e7) {
            throw new InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), (Throwable) e7);
        }
    }

    @androidx.annotation.o0
    public final String getString(@g1 int i4, @androidx.annotation.q0 Object... objArr) {
        return getResources().getString(i4, objArr);
    }

    public final void postponeEnterTransition(long j4, @androidx.annotation.o0 TimeUnit timeUnit) {
        ensureAnimationInfo().f29772v = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.J0().g();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j4));
    }

    @Override // androidx.view.result.b
    @androidx.annotation.o0
    @androidx.annotation.l0
    public final <I, O> androidx.view.result.h<I> registerForActivityResult(@androidx.annotation.o0 b.a<I, O> aVar, @androidx.annotation.o0 ActivityResultRegistry activityResultRegistry, @androidx.annotation.o0 androidx.view.result.a<O> aVar2) {
        return prepareCallInternal(aVar, new h(activityResultRegistry), aVar2);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @androidx.annotation.q0 Bundle bundle) {
        o<?> oVar = this.mHost;
        if (oVar == null) {
            throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " not attached to Activity"));
        }
        oVar.q(this, intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4, @androidx.annotation.q0 Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.f.a("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().k1(this, intent, i4, bundle);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @Deprecated
    public LayoutInflater getLayoutInflater(@androidx.annotation.q0 Bundle bundle) {
        o<?> oVar = this.mHost;
        if (oVar != null) {
            LayoutInflater j4 = oVar.j();
            j4.setFactory2(this.mChildFragmentManager.K0());
            return j4;
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
    public void onInflate(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Bundle bundle) {
        this.mCalled = true;
    }

    @androidx.annotation.o
    public Fragment(@androidx.annotation.j0 int i4) {
        this();
        this.mContentLayoutId = i4;
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

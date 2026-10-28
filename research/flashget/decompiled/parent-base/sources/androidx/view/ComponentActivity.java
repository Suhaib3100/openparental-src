package androidx.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.i;
import androidx.annotation.j0;
import androidx.annotation.o;
import androidx.annotation.o0;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.core.app.l0;
import androidx.core.app.m0;
import androidx.core.app.n0;
import androidx.core.app.s0;
import androidx.core.app.w;
import androidx.core.content.c0;
import androidx.core.content.d0;
import androidx.core.view.q0;
import androidx.core.view.t0;
import androidx.view.AbstractC1450w;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1459c;
import androidx.view.C1460d;
import androidx.view.C1463g;
import androidx.view.ComponentActivity;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1449v;
import androidx.view.InterfaceC1461e;
import androidx.view.c1;
import androidx.view.g0;
import androidx.view.k1;
import androidx.view.n1;
import androidx.view.o1;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.j;
import androidx.view.v0;
import androidx.view.z0;
import androidx.work.i0;
import b.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC1477a;
import kotlin.C1481e;
import kotlin.k2;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.view.contextaware.a, InterfaceC1423e0, o1, InterfaceC1449v, InterfaceC1461e, f0, j, androidx.view.result.b, c0, d0, m0, l0, n0, androidx.core.view.n0, b0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;

    @j0
    private int mContentLayoutId;
    final androidx.view.contextaware.b mContextAwareHelper;
    private k1.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @o0
    final z mFullyDrawnReporter;
    private final g0 mLifecycleRegistry;
    private final q0 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<androidx.core.util.e<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.e<w>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.e<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<androidx.core.util.e<s0>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.e<Integer>> mOnTrimMemoryListeners;
    final f mReportFullyDrawnExecutor;
    final C1460d mSavedStateRegistryController;
    private n1 mViewModelStore;

    class a extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$a$a, reason: collision with other inner class name */
        class RunnableC0002a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f376b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a.C0651a f377c;

            RunnableC0002a(int i4, a.C0651a c0651a) {
                this.f376b = i4;
                this.f377c = c0651a;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.f376b, this.f377c.a());
            }
        }

        class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f379b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f380c;

            b(int i4, IntentSender.SendIntentException sendIntentException) {
                this.f379b = i4;
                this.f380c = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.f379b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f380c));
            }
        }

        a() {
        }

        @Override // androidx.view.result.ActivityResultRegistry
        public <I, O> void f(int i4, @o0 b.a<I, O> aVar, I i5, @androidx.annotation.q0 androidx.core.app.e eVar) {
            Bundle n4;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0651a<O> synchronousResult = aVar.getSynchronousResult(componentActivity, i5);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0002a(i4, synchronousResult));
                return;
            }
            Intent createIntent = aVar.createIntent(componentActivity, i5);
            if (createIntent.getExtras() != null && createIntent.getExtras().getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                n4 = bundleExtra;
            } else {
                n4 = eVar != null ? eVar.n() : null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
                String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.l(componentActivity, stringArrayExtra, i4);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                androidx.core.app.b.s(componentActivity, createIntent, i4, n4);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.b.t(componentActivity, intentSenderRequest.getIntentSender(), i4, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, n4);
            } catch (IntentSender.SendIntentException e4) {
                new Handler(Looper.getMainLooper()).post(new b(i4, e4));
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e4) {
                if (!TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e4;
                }
            } catch (NullPointerException e5) {
                if (!TextUtils.equals(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e5;
                }
            }
        }
    }

    @x0(19)
    static class c {
        private c() {
        }

        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    @x0(33)
    static class d {
        private d() {
        }

        @u
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        Object f383a;

        /* renamed from: b, reason: collision with root package name */
        n1 f384b;

        e() {
        }
    }

    private interface f extends Executor {
        void O0(@o0 View view);

        void Q();
    }

    @x0(16)
    class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: c, reason: collision with root package name */
        Runnable f386c;

        /* renamed from: b, reason: collision with root package name */
        final long f385b = SystemClock.uptimeMillis() + i0.f35991f;

        /* renamed from: d, reason: collision with root package name */
        boolean f387d = false;

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f386c;
            if (runnable != null) {
                runnable.run();
                this.f386c = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.f
        public void O0(@o0 View view) {
            if (this.f387d) {
                return;
            }
            this.f387d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void Q() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f386c = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f387d) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.g.this.b();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f386c;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f385b) {
                    this.f387d = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f386c = null;
            if (ComponentActivity.this.mFullyDrawnReporter.e()) {
                this.f387d = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    static class h implements f {

        /* renamed from: b, reason: collision with root package name */
        final Handler f389b = a();

        h() {
        }

        @o0
        private Handler a() {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = Looper.getMainLooper();
            }
            return new Handler(myLooper);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void O0(@o0 View view) {
        }

        @Override // androidx.activity.ComponentActivity.f
        public void Q() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f389b.postAtFrontOfQueue(runnable);
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new androidx.view.contextaware.b();
        this.mMenuHostHelper = new q0(new Runnable() { // from class: androidx.activity.h
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new g0(this);
        C1460d a5 = C1460d.a(this);
        this.mSavedStateRegistryController = a5;
        this.mOnBackPressedDispatcher = null;
        f createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new z(createFullyDrawnExecutor, new ld.a() { // from class: androidx.activity.i
            @Override // ld.a
            public final Object invoke() {
                k2 lambda$new$0;
                lambda$new$0 = ComponentActivity.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC1416b0() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.view.InterfaceC1416b0
            public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar) {
                if (aVar == AbstractC1450w.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().a(new InterfaceC1416b0() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.view.InterfaceC1416b0
            public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar) {
                if (aVar == AbstractC1450w.a.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.b();
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.Q();
                }
            }
        });
        getLifecycle().a(new InterfaceC1416b0() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.view.InterfaceC1416b0
            public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().d(this);
            }
        });
        a5.c();
        z0.c(this);
        getSavedStateRegistry().j("android:support:activity-result", new C1459c.InterfaceC0615c() { // from class: androidx.activity.j
            @Override // androidx.view.C1459c.InterfaceC0615c
            public final Bundle a() {
                Bundle lambda$new$1;
                lambda$new$1 = ComponentActivity.this.lambda$new$1();
                return lambda$new$1;
            }
        });
        addOnContextAvailableListener(new androidx.view.contextaware.d() { // from class: androidx.activity.k
            @Override // androidx.view.contextaware.d
            public final void a(Context context) {
                ComponentActivity.this.lambda$new$2(context);
            }
        });
    }

    private f createFullyDrawnExecutor() {
        return new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ k2 lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle b5 = getSavedStateRegistry().b("android:support:activity-result");
        if (b5 != null) {
            this.mActivityResultRegistry.g(b5);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.O0(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.n0
    public void addMenuProvider(@o0 t0 t0Var) {
        this.mMenuHostHelper.c(t0Var);
    }

    @Override // androidx.core.content.c0
    public final void addOnConfigurationChangedListener(@o0 androidx.core.util.e<Configuration> eVar) {
        this.mOnConfigurationChangedListeners.add(eVar);
    }

    @Override // androidx.view.contextaware.a
    public final void addOnContextAvailableListener(@o0 androidx.view.contextaware.d dVar) {
        this.mContextAwareHelper.a(dVar);
    }

    @Override // androidx.core.app.l0
    public final void addOnMultiWindowModeChangedListener(@o0 androidx.core.util.e<w> eVar) {
        this.mOnMultiWindowModeChangedListeners.add(eVar);
    }

    @Override // androidx.core.app.m0
    public final void addOnNewIntentListener(@o0 androidx.core.util.e<Intent> eVar) {
        this.mOnNewIntentListeners.add(eVar);
    }

    @Override // androidx.core.app.n0
    public final void addOnPictureInPictureModeChangedListener(@o0 androidx.core.util.e<s0> eVar) {
        this.mOnPictureInPictureModeChangedListeners.add(eVar);
    }

    @Override // androidx.core.content.d0
    public final void addOnTrimMemoryListener(@o0 androidx.core.util.e<Integer> eVar) {
        this.mOnTrimMemoryListeners.add(eVar);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f384b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new n1();
            }
        }
    }

    @Override // androidx.view.result.j
    @o0
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.view.InterfaceC1449v
    @i
    @o0
    public AbstractC1477a getDefaultViewModelCreationExtras() {
        C1481e c1481e = new C1481e();
        if (getApplication() != null) {
            c1481e.c(k1.a.f30372i, getApplication());
        }
        c1481e.c(z0.f30493c, this);
        c1481e.c(z0.f30494d, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c1481e.c(z0.f30495e, getIntent().getExtras());
        }
        return c1481e;
    }

    @Override // androidx.view.InterfaceC1449v
    @o0
    public k1.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new c1(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.view.b0
    @o0
    public z getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @androidx.annotation.q0
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f383a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.view.InterfaceC1423e0
    @o0
    public AbstractC1450w getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.view.f0
    @o0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new b(), null);
            getLifecycle().a(new InterfaceC1416b0() { // from class: androidx.activity.ComponentActivity.6
                @Override // androidx.view.InterfaceC1416b0
                public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar) {
                    if (aVar != AbstractC1450w.a.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    ComponentActivity.this.mOnBackPressedDispatcher.s(d.a((ComponentActivity) interfaceC1423e0));
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.view.InterfaceC1461e
    @o0
    public final C1459c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.view.o1
    @o0
    public n1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @i
    public void initializeViewTreeOwners() {
        C1442q1.b(getWindow().getDecorView(), this);
        C1446s1.b(getWindow().getDecorView(), this);
        C1463g.b(getWindow().getDecorView(), this);
        C1412m0.b(getWindow().getDecorView(), this);
        View.b(getWindow().getDecorView(), this);
    }

    @Override // androidx.core.view.n0
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @i
    @Deprecated
    protected void onActivityResult(int i4, int i5, @androidx.annotation.q0 Intent intent) {
        if (this.mActivityResultRegistry.b(i4, i5, intent)) {
            return;
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    @i
    @androidx.annotation.l0
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().p();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @i
    public void onConfigurationChanged(@o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.e<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@androidx.annotation.q0 Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        v0.g(this);
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, @o0 Menu menu) {
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, @o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @i
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<androidx.core.util.e<w>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new w(z4));
        }
    }

    @Override // android.app.Activity
    @i
    protected void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.e<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, @o0 Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    @i
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<androidx.core.util.e<s0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new s0(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i4, @androidx.annotation.q0 View view, @o0 Menu menu) {
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    @Override // android.app.Activity
    @i
    @Deprecated
    public void onRequestPermissionsResult(int i4, @o0 String[] strArr, @o0 int[] iArr) {
        if (this.mActivityResultRegistry.b(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @androidx.annotation.q0
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @androidx.annotation.q0
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        n1 n1Var = this.mViewModelStore;
        if (n1Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            n1Var = eVar.f384b;
        }
        if (n1Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f383a = onRetainCustomNonConfigurationInstance;
        eVar2.f384b = n1Var;
        return eVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @i
    protected void onSaveInstanceState(@o0 Bundle bundle) {
        AbstractC1450w lifecycle = getLifecycle();
        if (lifecycle instanceof g0) {
            ((g0) lifecycle).s(AbstractC1450w.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @i
    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator<androidx.core.util.e<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i4));
        }
    }

    @Override // androidx.view.contextaware.a
    @androidx.annotation.q0
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.getContext();
    }

    @Override // androidx.view.result.b
    @o0
    public final <I, O> androidx.view.result.h<I> registerForActivityResult(@o0 b.a<I, O> aVar, @o0 ActivityResultRegistry activityResultRegistry, @o0 androidx.view.result.a<O> aVar2) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    @Override // androidx.core.view.n0
    public void removeMenuProvider(@o0 t0 t0Var) {
        this.mMenuHostHelper.l(t0Var);
    }

    @Override // androidx.core.content.c0
    public final void removeOnConfigurationChangedListener(@o0 androidx.core.util.e<Configuration> eVar) {
        this.mOnConfigurationChangedListeners.remove(eVar);
    }

    @Override // androidx.view.contextaware.a
    public final void removeOnContextAvailableListener(@o0 androidx.view.contextaware.d dVar) {
        this.mContextAwareHelper.e(dVar);
    }

    @Override // androidx.core.app.l0
    public final void removeOnMultiWindowModeChangedListener(@o0 androidx.core.util.e<w> eVar) {
        this.mOnMultiWindowModeChangedListeners.remove(eVar);
    }

    @Override // androidx.core.app.m0
    public final void removeOnNewIntentListener(@o0 androidx.core.util.e<Intent> eVar) {
        this.mOnNewIntentListeners.remove(eVar);
    }

    @Override // androidx.core.app.n0
    public final void removeOnPictureInPictureModeChangedListener(@o0 androidx.core.util.e<s0> eVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(eVar);
    }

    @Override // androidx.core.content.d0
    public final void removeOnTrimMemoryListener(@o0 androidx.core.util.e<Integer> eVar) {
        this.mOnTrimMemoryListeners.remove(eVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.b.i()) {
                androidx.tracing.b.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.d();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@j0 int i4) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.O0(getWindow().getDecorView());
        super.setContentView(i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@o0 Intent intent, int i4) {
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@o0 IntentSender intentSender, int i4, @androidx.annotation.q0 Intent intent, int i5, int i6, int i7) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    @Override // androidx.core.view.n0
    public void addMenuProvider(@o0 t0 t0Var, @o0 InterfaceC1423e0 interfaceC1423e0) {
        this.mMenuHostHelper.d(t0Var, interfaceC1423e0);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@o0 Intent intent, int i4, @androidx.annotation.q0 Bundle bundle) {
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@o0 IntentSender intentSender, int i4, @androidx.annotation.q0 Intent intent, int i5, int i6, int i7, @androidx.annotation.q0 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    @Override // androidx.core.view.n0
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@o0 t0 t0Var, @o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.b bVar) {
        this.mMenuHostHelper.e(t0Var, interfaceC1423e0, bVar);
    }

    @Override // android.app.Activity
    @i
    @x0(api = 26)
    public void onMultiWindowModeChanged(boolean z4, @o0 Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<androidx.core.util.e<w>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new w(z4, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @i
    @x0(api = 26)
    public void onPictureInPictureModeChanged(boolean z4, @o0 Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<androidx.core.util.e<s0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new s0(z4, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // androidx.view.result.b
    @o0
    public final <I, O> androidx.view.result.h<I> registerForActivityResult(@o0 b.a<I, O> aVar, @o0 androidx.view.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.O0(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.O0(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @o
    public ComponentActivity(@j0 int i4) {
        this();
        this.mContentLayoutId = i4;
    }
}

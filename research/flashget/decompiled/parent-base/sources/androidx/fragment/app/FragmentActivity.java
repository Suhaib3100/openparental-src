package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.b;
import androidx.view.AbstractC1450w;
import androidx.view.C1459c;
import androidx.view.ComponentActivity;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1461e;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.n1;
import androidx.view.o1;
import androidx.view.result.ActivityResultRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class FragmentActivity extends ComponentActivity implements b.i, b.k {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.view.g0 mFragmentLifecycleRegistry;
    final m mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends o<FragmentActivity> implements androidx.core.content.c0, androidx.core.content.d0, androidx.core.app.l0, androidx.core.app.n0, o1, androidx.view.f0, androidx.view.result.j, InterfaceC1461e, d0, androidx.core.view.n0 {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.d0
        public void a(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.n0
        public void addMenuProvider(@androidx.annotation.o0 androidx.core.view.t0 t0Var) {
            FragmentActivity.this.addMenuProvider(t0Var);
        }

        @Override // androidx.core.content.c0
        public void addOnConfigurationChangedListener(@androidx.annotation.o0 androidx.core.util.e<Configuration> eVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(eVar);
        }

        @Override // androidx.core.app.l0
        public void addOnMultiWindowModeChangedListener(@androidx.annotation.o0 androidx.core.util.e<androidx.core.app.w> eVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(eVar);
        }

        @Override // androidx.core.app.n0
        public void addOnPictureInPictureModeChangedListener(@androidx.annotation.o0 androidx.core.util.e<androidx.core.app.s0> eVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(eVar);
        }

        @Override // androidx.core.content.d0
        public void addOnTrimMemoryListener(@androidx.annotation.o0 androidx.core.util.e<Integer> eVar) {
            FragmentActivity.this.addOnTrimMemoryListener(eVar);
        }

        @Override // androidx.fragment.app.o, androidx.fragment.app.l
        @androidx.annotation.q0
        public View c(int i4) {
            return FragmentActivity.this.findViewById(i4);
        }

        @Override // androidx.fragment.app.o, androidx.fragment.app.l
        public boolean d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.view.result.j
        @androidx.annotation.o0
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.view.InterfaceC1423e0
        @androidx.annotation.o0
        public AbstractC1450w getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.view.f0
        @androidx.annotation.o0
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.view.InterfaceC1461e
        @androidx.annotation.o0
        public C1459c getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.view.o1
        @androidx.annotation.o0
        public n1 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.o
        public void h(@androidx.annotation.o0 String str, @androidx.annotation.q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @androidx.annotation.q0 String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.view.n0
        public void invalidateMenu() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.o
        @androidx.annotation.o0
        public LayoutInflater j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.o
        public int k() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.o
        public boolean l() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.o
        public boolean n(@androidx.annotation.o0 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.o
        public boolean o(@androidx.annotation.o0 String str) {
            return androidx.core.app.b.r(FragmentActivity.this, str);
        }

        @Override // androidx.core.view.n0
        public void removeMenuProvider(@androidx.annotation.o0 androidx.core.view.t0 t0Var) {
            FragmentActivity.this.removeMenuProvider(t0Var);
        }

        @Override // androidx.core.content.c0
        public void removeOnConfigurationChangedListener(@androidx.annotation.o0 androidx.core.util.e<Configuration> eVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(eVar);
        }

        @Override // androidx.core.app.l0
        public void removeOnMultiWindowModeChangedListener(@androidx.annotation.o0 androidx.core.util.e<androidx.core.app.w> eVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(eVar);
        }

        @Override // androidx.core.app.n0
        public void removeOnPictureInPictureModeChangedListener(@androidx.annotation.o0 androidx.core.util.e<androidx.core.app.s0> eVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(eVar);
        }

        @Override // androidx.core.content.d0
        public void removeOnTrimMemoryListener(@androidx.annotation.o0 androidx.core.util.e<Integer> eVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(eVar);
        }

        @Override // androidx.fragment.app.o
        public void s() {
            invalidateMenu();
        }

        @Override // androidx.fragment.app.o
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public FragmentActivity i() {
            return FragmentActivity.this;
        }

        @Override // androidx.core.view.n0
        public void addMenuProvider(@androidx.annotation.o0 androidx.core.view.t0 t0Var, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0) {
            FragmentActivity.this.addMenuProvider(t0Var, interfaceC1423e0);
        }

        @Override // androidx.core.view.n0
        public void addMenuProvider(@androidx.annotation.o0 androidx.core.view.t0 t0Var, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0, @androidx.annotation.o0 AbstractC1450w.b bVar) {
            FragmentActivity.this.addMenuProvider(t0Var, interfaceC1423e0, bVar);
        }
    }

    public FragmentActivity() {
        this.mFragments = m.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.view.g0(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().j("android:support:lifecycle", new C1459c.InterfaceC0615c() { // from class: androidx.fragment.app.g
            @Override // androidx.view.C1459c.InterfaceC0615c
            public final Bundle a() {
                Bundle lambda$init$0;
                lambda$init$0 = FragmentActivity.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new androidx.core.util.e() { // from class: androidx.fragment.app.h
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                FragmentActivity.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new androidx.core.util.e() { // from class: androidx.fragment.app.i
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                FragmentActivity.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new androidx.view.contextaware.d() { // from class: androidx.fragment.app.j
            @Override // androidx.view.contextaware.d
            public final void a(Context context) {
                FragmentActivity.this.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.l(AbstractC1450w.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.a(null);
    }

    private static boolean markState(FragmentManager fragmentManager, AbstractC1450w.b bVar) {
        boolean z4 = false;
        for (Fragment fragment : fragmentManager.I0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z4 |= markState(fragment.getChildFragmentManager(), bVar);
                }
                q0 q0Var = fragment.mViewLifecycleOwner;
                if (q0Var != null && q0Var.getLifecycle().getState().isAtLeast(AbstractC1450w.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    z4 = true;
                }
                if (fragment.mLifecycleRegistry.getState().isAtLeast(AbstractC1450w.b.STARTED)) {
                    fragment.mLifecycleRegistry.s(bVar);
                    z4 = true;
                }
            }
        }
        return z4;
    }

    @androidx.annotation.q0
    final View dispatchFragmentsOnCreateView(@androidx.annotation.q0 View view, @androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        return this.mFragments.G(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@androidx.annotation.o0 String str, @androidx.annotation.q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @androidx.annotation.q0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.D().e0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @androidx.annotation.o0
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.D();
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.d(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC1450w.b.CREATED)) {
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @androidx.annotation.i
    protected void onActivityResult(int i4, int i5, @androidx.annotation.q0 Intent intent) {
        this.mFragments.F();
        super.onActivityResult(i4, i5, intent);
    }

    @androidx.annotation.l0
    @Deprecated
    public void onAttachFragment(@androidx.annotation.o0 Fragment fragment) {
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@androidx.annotation.q0 Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.l(AbstractC1450w.a.ON_CREATE);
        this.mFragments.f();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @androidx.annotation.q0
    public View onCreateView(@androidx.annotation.q0 View view, @androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.l(AbstractC1450w.a.ON_DESTROY);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, @androidx.annotation.o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 6) {
            return this.mFragments.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.n();
        this.mFragmentLifecycleRegistry.l(AbstractC1450w.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @androidx.annotation.i
    public void onRequestPermissionsResult(int i4, @androidx.annotation.o0 String[] strArr, @androidx.annotation.o0 int[] iArr) {
        this.mFragments.F();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.F();
        super.onResume();
        this.mResumed = true;
        this.mFragments.z();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.l(AbstractC1450w.a.ON_RESUME);
        this.mFragments.r();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.F();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.z();
        this.mFragmentLifecycleRegistry.l(AbstractC1450w.a.ON_START);
        this.mFragments.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.F();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.t();
        this.mFragmentLifecycleRegistry.l(AbstractC1450w.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(@androidx.annotation.q0 androidx.core.app.w0 w0Var) {
        androidx.core.app.b.n(this, w0Var);
    }

    public void setExitSharedElementCallback(@androidx.annotation.q0 androidx.core.app.w0 w0Var) {
        androidx.core.app.b.o(this, w0Var);
    }

    public void startActivityFromFragment(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        startActivityFromFragment(fragment, intent, i4, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @androidx.annotation.q0 Intent intent, int i5, int i6, int i7, @androidx.annotation.q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i4 == -1) {
            androidx.core.app.b.t(this, intentSender, i4, intent, i5, i6, i7, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.i(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.u(this);
    }

    @Override // androidx.core.app.b.k
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i4) {
    }

    public void startActivityFromFragment(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, @androidx.annotation.q0 Bundle bundle) {
        if (i4 == -1) {
            androidx.core.app.b.s(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i4, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @androidx.annotation.q0
    public View onCreateView(@androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @androidx.annotation.o
    public FragmentActivity(@androidx.annotation.j0 int i4) {
        super(i4);
        this.mFragments = m.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.view.g0(this);
        this.mStopped = true;
        init();
    }
}

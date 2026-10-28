package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.C0539f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.j1;
import android.view.l1;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.q0;
import java.util.Objects;

/* compiled from: DialogFragment.java */
/* loaded from: classes3.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @q0
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private android.view.k0<android.view.a0> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    private static final String SAVED_CANCELABLE = "android:cancelable";

    /* compiled from: DialogFragment.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            c.this.mOnDismissListener.onDismiss(c.this.mDialog);
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@q0 DialogInterface dialogInterface) {
            if (c.this.mDialog != null) {
                c cVar = c.this;
                cVar.onCancel(cVar.mDialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class DialogInterfaceOnDismissListenerC0091c implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC0091c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@q0 DialogInterface dialogInterface) {
            if (c.this.mDialog != null) {
                c cVar = c.this;
                cVar.onDismiss(cVar.mDialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class d implements android.view.k0<android.view.a0> {
        d() {
        }

        @Override // android.view.k0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(android.view.a0 a0Var) {
            if (a0Var == null || !c.this.mShowsDialog) {
                return;
            }
            View requireView = c.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (c.this.mDialog != null) {
                if (FragmentManager.W0(3)) {
                    toString();
                    Objects.toString(c.this.mDialog);
                }
                c.this.mDialog.setContentView(requireView);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class e extends j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ j f8209o;

        e(j jVar) {
            this.f8209o = jVar;
        }

        @Override // androidx.fragment.app.j
        @q0
        public View d(int i5) {
            return this.f8209o.f() ? this.f8209o.d(i5) : c.this.onFindViewById(i5);
        }

        @Override // androidx.fragment.app.j
        public boolean f() {
            return this.f8209o.f() || c.this.onHasView();
        }
    }

    public c() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC0091c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z5, boolean z6, boolean z7) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z6) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z7) {
                getParentFragmentManager().v1(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().s1(this.mBackStackId, 1, z5);
            }
            this.mBackStackId = -1;
            return;
        }
        f0 u5 = getParentFragmentManager().u();
        u5.M(true);
        u5.x(this);
        if (z7) {
            u5.o();
        } else if (z5) {
            u5.n();
        } else {
            u5.m();
        }
    }

    private void prepareDialog(@q0 Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.o0
    j createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    @androidx.annotation.l0
    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    @q0
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @h1
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    @Deprecated
    public void onActivityCreated(@q0 Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onAttach(@androidx.annotation.o0 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().k(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.o0 DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt("android:style", 0);
            this.mTheme = bundle.getInt("android:theme", 0);
            this.mCancelable = bundle.getBoolean("android:cancelable", true);
            this.mShowsDialog = bundle.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = bundle.getInt("android:backStackId", -1);
        }
    }

    @androidx.annotation.o0
    @androidx.annotation.l0
    public Dialog onCreateDialog(@q0 Bundle bundle) {
        if (FragmentManager.W0(3)) {
            toString();
        }
        return new android.view.f(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().o(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@androidx.annotation.o0 DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.W0(3)) {
            toString();
        }
        dismissInternal(true, true, false);
    }

    @q0
    View onFindViewById(int i5) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i5);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.o0
    public LayoutInflater onGetLayoutInflater(@q0 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (FragmentManager.W0(2)) {
                new StringBuilder("getting layout inflater for DialogFragment ").append(this);
            }
            return onGetLayoutInflater;
        }
        prepareDialog(bundle);
        if (FragmentManager.W0(2)) {
            toString();
        }
        Dialog dialog = this.mDialog;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onSaveInstanceState(@androidx.annotation.o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i5 = this.mStyle;
        if (i5 != 0) {
            bundle.putInt("android:style", i5);
        }
        int i6 = this.mTheme;
        if (i6 != 0) {
            bundle.putInt("android:theme", i6);
        }
        boolean z5 = this.mCancelable;
        if (!z5) {
            bundle.putBoolean("android:cancelable", z5);
        }
        boolean z6 = this.mShowsDialog;
        if (!z6) {
            bundle.putBoolean("android:showsDialog", z6);
        }
        int i7 = this.mBackStackId;
        if (i7 != -1) {
            bundle.putInt("android:backStackId", i7);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            j1.b(decorView, this);
            l1.b(decorView, this);
            C0539f.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onViewStateRestored(@q0 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(@androidx.annotation.o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @androidx.annotation.o0
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z5) {
        this.mCancelable = z5;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z5);
        }
    }

    public void setShowsDialog(boolean z5) {
        this.mShowsDialog = z5;
    }

    public void setStyle(int i5, @h1 int i6) {
        if (FragmentManager.W0(2)) {
            toString();
        }
        this.mStyle = i5;
        if (i5 == 2 || i5 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i6 != 0) {
            this.mTheme = i6;
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@androidx.annotation.o0 Dialog dialog, int i5) {
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@androidx.annotation.o0 FragmentManager fragmentManager, @q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        f0 u5 = fragmentManager.u();
        u5.M(true);
        u5.g(this, str);
        u5.m();
    }

    public void showNow(@androidx.annotation.o0 FragmentManager fragmentManager, @q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        f0 u5 = fragmentManager.u();
        u5.M(true);
        u5.g(this, str);
        u5.o();
    }

    public int show(@androidx.annotation.o0 f0 f0Var, @q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        f0Var.g(this, str);
        this.mViewDestroyed = false;
        int m5 = f0Var.m();
        this.mBackStackId = m5;
        return m5;
    }

    public c(@androidx.annotation.j0 int i5) {
        super(i5);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC0091c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }
}

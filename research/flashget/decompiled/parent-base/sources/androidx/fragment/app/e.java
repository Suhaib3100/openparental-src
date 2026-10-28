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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1463g;
import androidx.view.InterfaceC1423e0;
import java.util.Objects;

/* compiled from: DialogFragment.java */
/* loaded from: classes3.dex */
public class e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @androidx.annotation.q0
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private androidx.view.p0<InterfaceC1423e0> mObserver;
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
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            e.this.mOnDismissListener.onDismiss(e.this.mDialog);
        }
    }

    /* compiled from: DialogFragment.java */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@androidx.annotation.q0 DialogInterface dialogInterface) {
            if (e.this.mDialog != null) {
                e eVar = e.this;
                eVar.onCancel(eVar.mDialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@androidx.annotation.q0 DialogInterface dialogInterface) {
            if (e.this.mDialog != null) {
                e eVar = e.this;
                eVar.onDismiss(eVar.mDialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class d implements androidx.view.p0<InterfaceC1423e0> {
        d() {
        }

        @Override // androidx.view.p0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(InterfaceC1423e0 interfaceC1423e0) {
            if (interfaceC1423e0 == null || !e.this.mShowsDialog) {
                return;
            }
            View requireView = e.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (e.this.mDialog != null) {
                if (FragmentManager.W0(3)) {
                    toString();
                    Objects.toString(e.this.mDialog);
                }
                e.this.mDialog.setContentView(requireView);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    class C0483e extends l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f29932b;

        C0483e(l lVar) {
            this.f29932b = lVar;
        }

        @Override // androidx.fragment.app.l
        @androidx.annotation.q0
        public View c(int i4) {
            return this.f29932b.d() ? this.f29932b.c(i4) : e.this.onFindViewById(i4);
        }

        @Override // androidx.fragment.app.l
        public boolean d() {
            return this.f29932b.d() || e.this.onHasView();
        }
    }

    public e() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z4, boolean z5, boolean z6) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z5) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z6) {
                getParentFragmentManager().w1(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().t1(this.mBackStackId, 1, z4);
            }
            this.mBackStackId = -1;
            return;
        }
        l0 u4 = getParentFragmentManager().u();
        u4.R(true);
        u4.C(this);
        if (z6) {
            u4.t();
        } else if (z4) {
            u4.s();
        } else {
            u4.r();
        }
    }

    private void prepareDialog(@androidx.annotation.q0 Bundle bundle) {
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
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.o0
    l createFragmentContainer() {
        return new C0483e(super.createFragmentContainer());
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

    @androidx.annotation.q0
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
    public void onActivityCreated(@androidx.annotation.q0 Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onAttach(@androidx.annotation.o0 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().l(this.mObserver);
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
    public void onCreate(@androidx.annotation.q0 Bundle bundle) {
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
    public Dialog onCreateDialog(@androidx.annotation.q0 Bundle bundle) {
        if (FragmentManager.W0(3)) {
            toString();
        }
        return new androidx.view.o(requireContext(), getTheme());
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
        getViewLifecycleOwnerLiveData().p(this.mObserver);
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

    @androidx.annotation.q0
    View onFindViewById(int i4) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.o0
    public LayoutInflater onGetLayoutInflater(@androidx.annotation.q0 Bundle bundle) {
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
        int i4 = this.mStyle;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i5 = this.mTheme;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z4 = this.mCancelable;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z5 = this.mShowsDialog;
        if (!z5) {
            bundle.putBoolean("android:showsDialog", z5);
        }
        int i6 = this.mBackStackId;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
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
            C1442q1.b(decorView, this);
            C1446s1.b(decorView, this);
            C1463g.b(decorView, this);
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
    public void onViewStateRestored(@androidx.annotation.q0 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(@androidx.annotation.o0 LayoutInflater layoutInflater, @androidx.annotation.q0 ViewGroup viewGroup, @androidx.annotation.q0 Bundle bundle) {
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

    public void setCancelable(boolean z4) {
        this.mCancelable = z4;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z4);
        }
    }

    public void setShowsDialog(boolean z4) {
        this.mShowsDialog = z4;
    }

    public void setStyle(int i4, @h1 int i5) {
        if (FragmentManager.W0(2)) {
            toString();
        }
        this.mStyle = i4;
        if (i4 == 2 || i4 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i5 != 0) {
            this.mTheme = i5;
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@androidx.annotation.o0 Dialog dialog, int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        l0 u4 = fragmentManager.u();
        u4.R(true);
        u4.l(this, str);
        u4.r();
    }

    public void showNow(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        l0 u4 = fragmentManager.u();
        u4.R(true);
        u4.l(this, str);
        u4.t();
    }

    public int show(@androidx.annotation.o0 l0 l0Var, @androidx.annotation.q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        l0Var.l(this, str);
        this.mViewDestroyed = false;
        int r4 = l0Var.r();
        this.mBackStackId = r4;
        return r4;
    }

    public e(@androidx.annotation.j0 int i4) {
        super(i4);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }
}

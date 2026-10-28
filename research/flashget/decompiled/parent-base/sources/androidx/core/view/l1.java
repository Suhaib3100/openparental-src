package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.l1;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final c f27318a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SoftwareKeyboardControllerCompat.java */
    @androidx.annotation.x0(20)
    static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        private final View f27319a;

        a(@androidx.annotation.q0 View view) {
            this.f27319a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.core.view.l1.c
        void a() {
            View view = this.f27319a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f27319a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.l1.c
        void b() {
            final View view = this.f27319a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.f27319a.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.k1
                @Override // java.lang.Runnable
                public final void run() {
                    l1.a.d(view);
                }
            });
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    private static class c {
        c() {
        }

        void a() {
        }

        void b() {
        }
    }

    public l1(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f27318a = new b(view);
        } else {
            this.f27318a = new a(view);
        }
    }

    public void a() {
        this.f27318a.a();
    }

    public void b() {
        this.f27318a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SoftwareKeyboardControllerCompat.java */
    @androidx.annotation.x0(30)
    static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.q0
        private View f27320b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private WindowInsetsController f27321c;

        b(@androidx.annotation.o0 View view) {
            super(view);
            this.f27320b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i4) {
            atomicBoolean.set((i4 & 8) != 0);
        }

        @Override // androidx.core.view.l1.a, androidx.core.view.l1.c
        void a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.f27321c;
            if (windowInsetsController == null) {
                View view2 = this.f27320b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.r1
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i4) {
                    l1.b.f(atomicBoolean, windowInsetsController2, i4);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f27320b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f27320b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // androidx.core.view.l1.a, androidx.core.view.l1.c
        void b() {
            int ime;
            View view = this.f27320b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f27321c;
            if (windowInsetsController == null) {
                View view2 = this.f27320b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }

        b(@androidx.annotation.q0 WindowInsetsController windowInsetsController) {
            super(null);
            this.f27321c = windowInsetsController;
        }
    }

    @androidx.annotation.x0(30)
    @Deprecated
    l1(@androidx.annotation.o0 WindowInsetsController windowInsetsController) {
        this.f27318a = new b(windowInsetsController);
    }
}

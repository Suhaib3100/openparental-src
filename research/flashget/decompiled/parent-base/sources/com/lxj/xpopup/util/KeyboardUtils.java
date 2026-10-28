package com.lxj.xpopup.util;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.core.BasePopupView;

/* loaded from: classes6.dex */
public final class KeyboardUtils {

    /* renamed from: a, reason: collision with root package name */
    public static int f69735a;

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray<ViewTreeObserver.OnGlobalLayoutListener> f69736b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private static int f69737c = 0;

    private static class SoftInputReceiver extends ResultReceiver {

        /* renamed from: b, reason: collision with root package name */
        private Context f69738b;

        public SoftInputReceiver(Context context) {
            super(new Handler());
            this.f69738b = context;
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int resultCode, Bundle resultData) {
            super.onReceiveResult(resultCode, resultData);
            if (resultCode == 1 || resultCode == 3) {
                KeyboardUtils.h(this.f69738b);
            }
            this.f69738b = null;
        }
    }

    static class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Window f69739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int[] f69740c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f69741d;

        a(final Window val$listener, final int[] val$decorViewInvisibleHeightPre, final b val$window) {
            this.f69739b = val$listener;
            this.f69740c = val$decorViewInvisibleHeightPre;
            this.f69741d = val$window;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int b5 = KeyboardUtils.b(this.f69739b);
            if (this.f69740c[0] != b5) {
                this.f69741d.a(b5);
                this.f69740c[0] = b5;
            }
        }
    }

    public interface b {
        void a(int height);
    }

    private KeyboardUtils() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ឤ\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(final Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        decorView.getBottom();
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs > h.C(window) + h.y(window)) {
            return abs - f69737c;
        }
        f69737c = abs;
        return 0;
    }

    public static void c(View view) {
        ((InputMethodManager) view.getContext().getSystemService(ProtectedSandApp.s("ឥ\u0001"))).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void d(@o0 final Window window) {
        View currentFocus = window.getCurrentFocus();
        if (currentFocus == null) {
            View decorView = window.getDecorView();
            String s4 = ProtectedSandApp.s("ឦ\u0001");
            View findViewWithTag = decorView.findViewWithTag(s4);
            if (findViewWithTag == null) {
                findViewWithTag = new EditText(window.getContext());
                findViewWithTag.setTag(s4);
                ((ViewGroup) decorView).addView(findViewWithTag, 0, 0);
            }
            currentFocus = findViewWithTag;
            currentFocus.requestFocus();
        }
        c(currentFocus);
    }

    public static void e(final Window window, final BasePopupView popupView, final b listener) {
        if (popupView == null) {
            return;
        }
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        a aVar = new a(window, new int[]{b(window)}, listener);
        frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        f69736b.append(popupView.getId(), aVar);
    }

    public static void f(Window window, BasePopupView popupView) {
        View findViewById;
        SparseArray<ViewTreeObserver.OnGlobalLayoutListener> sparseArray;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        if (popupView == null || (findViewById = window.findViewById(R.id.content)) == null || (onGlobalLayoutListener = (sparseArray = f69736b).get(popupView.getId())) == null) {
            return;
        }
        findViewById.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        sparseArray.remove(popupView.getId());
    }

    public static void g(final View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService(ProtectedSandApp.s("ឥ\u0001"))) == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0, new SoftInputReceiver(view.getContext()));
        inputMethodManager.toggleSoftInput(2, 1);
    }

    public static void h(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService(ProtectedSandApp.s("ឥ\u0001"))) == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }
}

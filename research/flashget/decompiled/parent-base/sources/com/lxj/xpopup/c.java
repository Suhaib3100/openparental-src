package com.lxj.xpopup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.x0;
import androidx.view.AbstractC1450w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.core.ImageViewerPopupView;
import com.lxj.xpopup.impl.AttachListPopupView;
import com.lxj.xpopup.impl.BottomListPopupView;
import com.lxj.xpopup.impl.CenterListPopupView;
import com.lxj.xpopup.impl.ConfirmPopupView;
import com.lxj.xpopup.impl.InputConfirmPopupView;
import com.lxj.xpopup.impl.LoadingPopupView;
import com.lxj.xpopup.util.XPermission;
import com.lxj.xpopup.util.h;
import fb.d;
import gb.e;
import gb.f;
import gb.g;
import gb.j;
import gb.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: XPopup.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static int f69504a = Color.parseColor(ProtectedSandApp.s("ដ\u0001"));

    /* renamed from: b, reason: collision with root package name */
    private static int f69505b = 300;

    /* renamed from: c, reason: collision with root package name */
    private static int f69506c = Color.parseColor(ProtectedSandApp.s("ឋ\u0001"));

    /* renamed from: d, reason: collision with root package name */
    private static int f69507d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f69508e = Color.parseColor(ProtectedSandApp.s("ឌ\u0001"));

    /* renamed from: f, reason: collision with root package name */
    public static int f69509f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f69510g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static PointF f69511h = null;

    /* compiled from: XPopup.java */
    static class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v4, MotionEvent event) {
            if (event.getAction() == 0) {
                c.f69511h = new PointF(event.getRawX(), event.getRawY());
            }
            if (ProtectedSandApp.s("ញ\u0001").equals(v4.getTag()) && event.getAction() == 2) {
                v4.getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (event.getAction() == 1) {
                v4.getParent().requestDisallowInterceptTouchEvent(false);
                v4.setTag(null);
            }
            return false;
        }
    }

    /* compiled from: XPopup.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.lxj.xpopup.core.b f69512a = new com.lxj.xpopup.core.b();

        /* renamed from: b, reason: collision with root package name */
        private Context f69513b;

        /* compiled from: XPopup.java */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View v4, MotionEvent event) {
                if (event.getAction() != 0) {
                    return false;
                }
                b.this.f69512a.f69631i = new PointF(event.getRawX(), event.getRawY());
                return false;
            }
        }

        public b(Context context) {
            this.f69513b = context;
        }

        public LoadingPopupView A() {
            return B(null);
        }

        public LoadingPopupView B(CharSequence title) {
            return C(title, 0, LoadingPopupView.b.Spinner);
        }

        public LoadingPopupView C(CharSequence title, int bindLayoutId, LoadingPopupView.b style) {
            LoadingPopupView x02 = new LoadingPopupView(this.f69513b, bindLayoutId).y0(title).x0(style);
            x02.f69527b = this.f69512a;
            return x02;
        }

        public LoadingPopupView D(CharSequence title, LoadingPopupView.b style) {
            return C(title, 0, style);
        }

        public b E(PointF point) {
            this.f69512a.f69631i = point;
            return this;
        }

        public b F(View atView) {
            this.f69512a.f69628f = atView;
            return this;
        }

        public b G(Boolean autoDismiss) {
            this.f69512a.f69625c = autoDismiss;
            return this;
        }

        public b H(boolean autoFocusEditText) {
            this.f69512a.D = autoFocusEditText;
            return this;
        }

        public b I(Boolean autoOpenSoftInput) {
            this.f69512a.f69637o = autoOpenSoftInput;
            return this;
        }

        public b J(float borderRadius) {
            this.f69512a.f69636n = borderRadius;
            return this;
        }

        public b K(com.lxj.xpopup.animator.c customAnimator) {
            this.f69512a.f69630h = customAnimator;
            return this;
        }

        public b L(AbstractC1450w lifecycle) {
            this.f69512a.R = lifecycle;
            return this;
        }

        public b M(Boolean isDismissOnBackPressed) {
            this.f69512a.f69623a = isDismissOnBackPressed;
            return this;
        }

        public b N(Boolean isDismissOnTouchOutside) {
            this.f69512a.f69624b = isDismissOnTouchOutside;
            return this;
        }

        public b O(boolean enableDrag) {
            this.f69512a.A = enableDrag;
            return this;
        }

        public b P(boolean enableShowWhenAppBackground) {
            this.f69512a.H = enableShowWhenAppBackground;
            return this;
        }

        public b Q(boolean hasBlurBg) {
            this.f69512a.f69627e = Boolean.valueOf(hasBlurBg);
            return this;
        }

        public b R(boolean hasNavigationBar) {
            this.f69512a.f69643u = Boolean.valueOf(hasNavigationBar);
            return this;
        }

        public b S(Boolean hasShadowBg) {
            this.f69512a.f69626d = hasShadowBg;
            return this;
        }

        public b T(boolean hasStatusBar) {
            this.f69512a.f69642t = Boolean.valueOf(hasStatusBar);
            return this;
        }

        public b U(boolean hasStatusBarShadow) {
            this.f69512a.f69641s = Boolean.valueOf(hasStatusBarShadow);
            return this;
        }

        public b V(boolean isCenterHorizontal) {
            this.f69512a.B = isCenterHorizontal;
            return this;
        }

        public b W(boolean isClickThrough) {
            this.f69512a.E = isClickThrough;
            return this;
        }

        public b X(Boolean isCoverSoftInput) {
            this.f69512a.S = isCoverSoftInput;
            return this;
        }

        public b Y(boolean isDarkTheme) {
            this.f69512a.G = isDarkTheme;
            return this;
        }

        public b Z(boolean isDestroyOnDismiss) {
            this.f69512a.J = isDestroyOnDismiss;
            return this;
        }

        public b a0(boolean isLightNavigationBar) {
            this.f69512a.f69645w = isLightNavigationBar ? 1 : -1;
            return this;
        }

        public b b(int animationDuration) {
            this.f69512a.O = animationDuration;
            return this;
        }

        public b b0(boolean isLightStatusBar) {
            this.f69512a.f69646x = isLightStatusBar ? 1 : -1;
            return this;
        }

        public AttachListPopupView c(String[] data, int[] iconIds, g selectListener) {
            return e(data, iconIds, selectListener, 0, 0, 17);
        }

        public b c0(boolean isRequestFocus) {
            this.f69512a.C = isRequestFocus;
            return this;
        }

        public AttachListPopupView d(String[] data, int[] iconIds, g selectListener, int bindLayoutId, int bindItemLayoutId) {
            return e(data, iconIds, selectListener, bindLayoutId, bindItemLayoutId, 17);
        }

        public b d0(boolean isThreeDrag) {
            this.f69512a.I = isThreeDrag;
            return this;
        }

        public AttachListPopupView e(String[] data, int[] iconIds, g selectListener, int bindLayoutId, int bindItemLayoutId, int contentGravity) {
            AttachListPopupView w02 = new AttachListPopupView(this.f69513b, bindLayoutId, bindItemLayoutId).x0(data, iconIds).v0(contentGravity).w0(selectListener);
            w02.f69527b = this.f69512a;
            return w02;
        }

        public b e0(boolean isTouchThrough) {
            this.f69512a.F = isTouchThrough;
            return this;
        }

        public BottomListPopupView f(CharSequence title, String[] data, g selectListener) {
            return g(title, data, null, -1, selectListener);
        }

        public b f0(boolean viewMode) {
            this.f69512a.L = viewMode;
            return this;
        }

        public BottomListPopupView g(CharSequence title, String[] data, int[] iconIds, int checkedPosition, g selectListener) {
            return h(title, data, iconIds, checkedPosition, selectListener, 0, 0);
        }

        public b g0(boolean keepScreenOn) {
            this.f69512a.M = keepScreenOn;
            return this;
        }

        public BottomListPopupView h(CharSequence title, String[] data, int[] iconIds, int checkedPosition, g selectListener, int bindLayoutId, int bindItemLayoutId) {
            BottomListPopupView s02 = new BottomListPopupView(this.f69513b, bindLayoutId, bindItemLayoutId).t0(title, data, iconIds).r0(checkedPosition).s0(selectListener);
            s02.f69527b = this.f69512a;
            return s02;
        }

        public b h0(int maxHeight) {
            this.f69512a.f69633k = maxHeight;
            return this;
        }

        public BottomListPopupView i(CharSequence title, String[] data, int[] iconIds, g selectListener) {
            return g(title, data, iconIds, -1, selectListener);
        }

        public b i0(int maxWidth) {
            this.f69512a.f69632j = maxWidth;
            return this;
        }

        public CenterListPopupView j(CharSequence title, String[] data, g selectListener) {
            return k(title, data, null, -1, selectListener);
        }

        public b j0(Boolean isMoveUpToKeyboard) {
            this.f69512a.f69639q = isMoveUpToKeyboard;
            return this;
        }

        public CenterListPopupView k(CharSequence title, String[] data, int[] iconIds, int checkedPosition, g selectListener) {
            return l(title, data, iconIds, checkedPosition, selectListener, 0, 0);
        }

        public b k0(int navigationBarColor) {
            this.f69512a.f69644v = navigationBarColor;
            return this;
        }

        public CenterListPopupView l(CharSequence title, String[] data, int[] iconIds, int checkedPosition, g selectListener, int bindLayoutId, int bindItemLayoutId) {
            CenterListPopupView t02 = new CenterListPopupView(this.f69513b, bindLayoutId, bindItemLayoutId).u0(title, data, iconIds).s0(checkedPosition).t0(selectListener);
            t02.f69527b = this.f69512a;
            return t02;
        }

        public b l0(View view) {
            com.lxj.xpopup.core.b bVar = this.f69512a;
            if (bVar.Q == null) {
                bVar.Q = new ArrayList<>();
            }
            this.f69512a.Q.add(h.D(view));
            return this;
        }

        public CenterListPopupView m(CharSequence title, String[] data, int[] iconIds, g selectListener) {
            return k(title, data, iconIds, -1, selectListener);
        }

        public b m0(int offsetX) {
            this.f69512a.f69647y = offsetX;
            return this;
        }

        public ConfirmPopupView n(CharSequence title, CharSequence content, gb.c confirmListener) {
            return q(title, content, null, null, confirmListener, null, false, 0);
        }

        public b n0(int offsetY) {
            this.f69512a.f69648z = offsetY;
            return this;
        }

        public ConfirmPopupView o(CharSequence title, CharSequence content, gb.c confirmListener, gb.a cancelListener) {
            return q(title, content, null, null, confirmListener, cancelListener, false, 0);
        }

        public b o0(fb.c popupAnimation) {
            this.f69512a.f69629g = popupAnimation;
            return this;
        }

        public ConfirmPopupView p(CharSequence title, CharSequence content, CharSequence cancelBtnText, CharSequence confirmBtnText, gb.c confirmListener, gb.a cancelListener, boolean isHideCancel) {
            return q(title, content, cancelBtnText, confirmBtnText, confirmListener, cancelListener, isHideCancel, 0);
        }

        public b p0(int height) {
            this.f69512a.f69635m = height;
            return this;
        }

        public ConfirmPopupView q(CharSequence title, CharSequence content, CharSequence cancelBtnText, CharSequence confirmBtnText, gb.c confirmListener, gb.a cancelListener, boolean isHideCancel, int bindLayoutId) {
            ConfirmPopupView confirmPopupView = new ConfirmPopupView(this.f69513b, bindLayoutId);
            confirmPopupView.x0(title, content, null);
            confirmPopupView.u0(cancelBtnText);
            confirmPopupView.v0(confirmBtnText);
            confirmPopupView.w0(confirmListener, cancelListener);
            confirmPopupView.N = isHideCancel;
            confirmPopupView.f69527b = this.f69512a;
            return confirmPopupView;
        }

        public b q0(d popupPosition) {
            this.f69512a.f69640r = popupPosition;
            return this;
        }

        public BasePopupView r(BasePopupView popupView) {
            popupView.f69527b = this.f69512a;
            return popupView;
        }

        public b r0(int width) {
            this.f69512a.f69634l = width;
            return this;
        }

        public ImageViewerPopupView s(ImageView srcView, int currentPosition, List<Object> urls, gb.h srcViewUpdateListener, k imageLoader) {
            return t(srcView, currentPosition, urls, false, true, -1, -1, -1, true, Color.rgb(32, 36, 46), srcViewUpdateListener, imageLoader, null);
        }

        public b s0(boolean positionByWindowCenter) {
            this.f69512a.K = positionByWindowCenter;
            return this;
        }

        public ImageViewerPopupView t(ImageView srcView, int currentPosition, List<Object> urls, boolean isInfinite, boolean isShowPlaceHolder, int placeholderColor, int placeholderStroke, int placeholderRadius, boolean isShowSaveBtn, int bgColor, gb.h srcViewUpdateListener, k imageLoader, e longPressListener) {
            ImageViewerPopupView A0 = new ImageViewerPopupView(this.f69513b).F0(srcView, currentPosition).z0(urls).t0(isInfinite).v0(isShowPlaceHolder).B0(placeholderColor).D0(placeholderStroke).C0(placeholderRadius).w0(isShowSaveBtn).y0(bgColor).G0(srcViewUpdateListener).H0(imageLoader).A0(longPressListener);
            A0.f69527b = this.f69512a;
            return A0;
        }

        public b t0(j xPopupCallback) {
            this.f69512a.f69638p = xPopupCallback;
            return this;
        }

        public ImageViewerPopupView u(ImageView srcView, Object url, k imageLoader) {
            ImageViewerPopupView H0 = new ImageViewerPopupView(this.f69513b).E0(srcView, url).H0(imageLoader);
            H0.f69527b = this.f69512a;
            return H0;
        }

        public b u0(int shadowBgColor) {
            this.f69512a.N = shadowBgColor;
            return this;
        }

        public ImageViewerPopupView v(ImageView srcView, Object url, boolean isInfinite, int placeholderColor, int placeholderStroke, int placeholderRadius, boolean isShowSaveBtn, int bgColor, k imageLoader, e longPressListener) {
            ImageViewerPopupView A0 = new ImageViewerPopupView(this.f69513b).E0(srcView, url).t0(isInfinite).B0(placeholderColor).D0(placeholderStroke).C0(placeholderRadius).w0(isShowSaveBtn).y0(bgColor).H0(imageLoader).A0(longPressListener);
            A0.f69527b = this.f69512a;
            return A0;
        }

        public b v0(int statusBarBgColor) {
            this.f69512a.P = statusBarBgColor;
            return this;
        }

        public InputConfirmPopupView w(CharSequence title, CharSequence content, f confirmListener) {
            return z(title, content, null, null, confirmListener, null, 0);
        }

        public b w0(View watchView) {
            watchView.setOnTouchListener(new a());
            return this;
        }

        public InputConfirmPopupView x(CharSequence title, CharSequence content, CharSequence hint, f confirmListener) {
            return z(title, content, null, hint, confirmListener, null, 0);
        }

        public InputConfirmPopupView y(CharSequence title, CharSequence content, CharSequence inputContent, CharSequence hint, f confirmListener) {
            return z(title, content, inputContent, hint, confirmListener, null, 0);
        }

        public InputConfirmPopupView z(CharSequence title, CharSequence content, CharSequence inputContent, CharSequence hint, f confirmListener, gb.a cancelListener, int bindLayoutId) {
            InputConfirmPopupView inputConfirmPopupView = new InputConfirmPopupView(this.f69513b, bindLayoutId);
            inputConfirmPopupView.x0(title, content, hint);
            inputConfirmPopupView.O = inputContent;
            inputConfirmPopupView.B0(confirmListener, cancelListener);
            inputConfirmPopupView.f69527b = this.f69512a;
            return inputConfirmPopupView;
        }
    }

    private c() {
    }

    public static void a(View v4) {
        v4.setOnTouchListener(new a());
        v4.setTag(ProtectedSandApp.s("ឍ\u0001"));
    }

    public static int b() {
        return f69505b;
    }

    public static int c() {
        return f69507d;
    }

    public static int d() {
        return f69504a;
    }

    public static int e() {
        return f69508e;
    }

    public static int f() {
        return f69506c;
    }

    @x0(api = 23)
    public static void g(Context context, XPermission.d callback) {
        XPermission.p(context, new String[0]).H(callback);
    }

    public static void h(int duration) {
        if (duration >= 0) {
            f69505b = duration;
        }
    }

    public static void i(boolean isLight) {
        f69510g = isLight ? 1 : -1;
    }

    public static void j(boolean isLight) {
        f69509f = isLight ? 1 : -1;
    }

    public static void k(int color) {
        f69507d = color;
    }

    public static void l(int color) {
        f69504a = color;
    }

    public static void m(int color) {
        f69508e = color;
    }

    public static void n(int color) {
        f69506c = color;
    }
}

package com.lxj.xpopup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.t;
import android.widget.ImageView;
import androidx.annotation.x0;
import b3.d;
import c3.e;
import c3.f;
import c3.g;
import c3.j;
import c3.k;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
import java.util.ArrayList;
import java.util.List;

/* compiled from: XPopup.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static int f21056a = Color.parseColor(ProtectedSandApp.s("㓿"));

    /* renamed from: b, reason: collision with root package name */
    private static int f21057b = 300;

    /* renamed from: c, reason: collision with root package name */
    private static int f21058c = Color.parseColor(ProtectedSandApp.s("㔀"));

    /* renamed from: d, reason: collision with root package name */
    private static int f21059d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f21060e = Color.parseColor(ProtectedSandApp.s("㔁"));

    /* renamed from: f, reason: collision with root package name */
    public static int f21061f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f21062g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static PointF f21063h = null;

    /* compiled from: XPopup.java */
    static class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v5, MotionEvent event) {
            if (event.getAction() == 0) {
                c.f21063h = new PointF(event.getRawX(), event.getRawY());
            }
            if (ProtectedSandApp.s("㓾").equals(v5.getTag()) && event.getAction() == 2) {
                v5.getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (event.getAction() == 1) {
                v5.getParent().requestDisallowInterceptTouchEvent(false);
                v5.setTag(null);
            }
            return false;
        }
    }

    /* compiled from: XPopup.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.lxj.xpopup.core.b f21064a = new com.lxj.xpopup.core.b();

        /* renamed from: b, reason: collision with root package name */
        private Context f21065b;

        /* compiled from: XPopup.java */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View v5, MotionEvent event) {
                if (event.getAction() != 0) {
                    return false;
                }
                b.this.f21064a.f21157i = new PointF(event.getRawX(), event.getRawY());
                return false;
            }
        }

        public b(Context context) {
            this.f21065b = context;
        }

        public LoadingPopupView A() {
            return B(null);
        }

        public LoadingPopupView B(CharSequence title) {
            return C(title, 0, LoadingPopupView.b.Spinner);
        }

        public LoadingPopupView C(CharSequence title, int bindLayoutId, LoadingPopupView.b style) {
            LoadingPopupView B0 = new LoadingPopupView(this.f21065b, bindLayoutId).C0(title).B0(style);
            B0.f21074o = this.f21064a;
            return B0;
        }

        public LoadingPopupView D(CharSequence title, LoadingPopupView.b style) {
            return C(title, 0, style);
        }

        public b E(PointF point) {
            this.f21064a.f21157i = point;
            return this;
        }

        public b F(View atView) {
            this.f21064a.f21154f = atView;
            return this;
        }

        public b G(Boolean autoDismiss) {
            this.f21064a.f21151c = autoDismiss;
            return this;
        }

        public b H(boolean autoFocusEditText) {
            this.f21064a.D = autoFocusEditText;
            return this;
        }

        public b I(Boolean autoOpenSoftInput) {
            this.f21064a.f21163o = autoOpenSoftInput;
            return this;
        }

        public b J(float borderRadius) {
            this.f21064a.f21162n = borderRadius;
            return this;
        }

        public b K(com.lxj.xpopup.animator.c customAnimator) {
            this.f21064a.f21156h = customAnimator;
            return this;
        }

        public b L(t lifecycle) {
            this.f21064a.R = lifecycle;
            return this;
        }

        public b M(Boolean isDismissOnBackPressed) {
            this.f21064a.f21149a = isDismissOnBackPressed;
            return this;
        }

        public b N(Boolean isDismissOnTouchOutside) {
            this.f21064a.f21150b = isDismissOnTouchOutside;
            return this;
        }

        public b O(boolean enableDrag) {
            this.f21064a.A = enableDrag;
            return this;
        }

        public b P(boolean enableShowWhenAppBackground) {
            this.f21064a.H = enableShowWhenAppBackground;
            return this;
        }

        public b Q(boolean hasBlurBg) {
            this.f21064a.f21153e = Boolean.valueOf(hasBlurBg);
            return this;
        }

        public b R(boolean hasNavigationBar) {
            this.f21064a.f21169u = Boolean.valueOf(hasNavigationBar);
            return this;
        }

        public b S(Boolean hasShadowBg) {
            this.f21064a.f21152d = hasShadowBg;
            return this;
        }

        public b T(boolean hasStatusBar) {
            this.f21064a.f21168t = Boolean.valueOf(hasStatusBar);
            return this;
        }

        public b U(boolean hasStatusBarShadow) {
            this.f21064a.f21167s = Boolean.valueOf(hasStatusBarShadow);
            return this;
        }

        public b V(boolean isCenterHorizontal) {
            this.f21064a.B = isCenterHorizontal;
            return this;
        }

        public b W(boolean isClickThrough) {
            this.f21064a.E = isClickThrough;
            return this;
        }

        public b X(Boolean isCoverSoftInput) {
            this.f21064a.S = isCoverSoftInput;
            return this;
        }

        public b Y(boolean isDarkTheme) {
            this.f21064a.G = isDarkTheme;
            return this;
        }

        public b Z(boolean isDestroyOnDismiss) {
            this.f21064a.J = isDestroyOnDismiss;
            return this;
        }

        public b a0(boolean isLightNavigationBar) {
            this.f21064a.f21171w = isLightNavigationBar ? 1 : -1;
            return this;
        }

        public b b(int animationDuration) {
            this.f21064a.O = animationDuration;
            return this;
        }

        public b b0(boolean isLightStatusBar) {
            this.f21064a.f21172x = isLightStatusBar ? 1 : -1;
            return this;
        }

        public AttachListPopupView c(String[] data, int[] iconIds, g selectListener) {
            return e(data, iconIds, selectListener, 0, 0, 17);
        }

        public b c0(boolean isRequestFocus) {
            this.f21064a.C = isRequestFocus;
            return this;
        }

        public AttachListPopupView d(String[] data, int[] iconIds, g selectListener, int bindLayoutId, int bindItemLayoutId) {
            return e(data, iconIds, selectListener, bindLayoutId, bindItemLayoutId, 17);
        }

        public b d0(boolean isThreeDrag) {
            this.f21064a.I = isThreeDrag;
            return this;
        }

        public AttachListPopupView e(String[] data, int[] iconIds, g selectListener, int bindLayoutId, int bindItemLayoutId, int contentGravity) {
            AttachListPopupView A0 = new AttachListPopupView(this.f21065b, bindLayoutId, bindItemLayoutId).B0(data, iconIds).z0(contentGravity).A0(selectListener);
            A0.f21074o = this.f21064a;
            return A0;
        }

        public b e0(boolean isTouchThrough) {
            this.f21064a.F = isTouchThrough;
            return this;
        }

        public BottomListPopupView f(CharSequence title, String[] data, g selectListener) {
            return g(title, data, null, -1, selectListener);
        }

        public b f0(boolean viewMode) {
            this.f21064a.L = viewMode;
            return this;
        }

        public BottomListPopupView g(CharSequence title, String[] data, int[] iconIds, int checkedPosition, g selectListener) {
            return h(title, data, iconIds, checkedPosition, selectListener, 0, 0);
        }

        public b g0(boolean keepScreenOn) {
            this.f21064a.M = keepScreenOn;
            return this;
        }

        public BottomListPopupView h(CharSequence title, String[] data, int[] iconIds, int checkedPosition, g selectListener, int bindLayoutId, int bindItemLayoutId) {
            BottomListPopupView w02 = new BottomListPopupView(this.f21065b, bindLayoutId, bindItemLayoutId).x0(title, data, iconIds).v0(checkedPosition).w0(selectListener);
            w02.f21074o = this.f21064a;
            return w02;
        }

        public b h0(int maxHeight) {
            this.f21064a.f21159k = maxHeight;
            return this;
        }

        public BottomListPopupView i(CharSequence title, String[] data, int[] iconIds, g selectListener) {
            return g(title, data, iconIds, -1, selectListener);
        }

        public b i0(int maxWidth) {
            this.f21064a.f21158j = maxWidth;
            return this;
        }

        public CenterListPopupView j(CharSequence title, String[] data, g selectListener) {
            return k(title, data, null, -1, selectListener);
        }

        public b j0(Boolean isMoveUpToKeyboard) {
            this.f21064a.f21165q = isMoveUpToKeyboard;
            return this;
        }

        public CenterListPopupView k(CharSequence title, String[] data, int[] iconIds, int checkedPosition, g selectListener) {
            return l(title, data, iconIds, checkedPosition, selectListener, 0, 0);
        }

        public b k0(int navigationBarColor) {
            this.f21064a.f21170v = navigationBarColor;
            return this;
        }

        public CenterListPopupView l(CharSequence title, String[] data, int[] iconIds, int checkedPosition, g selectListener, int bindLayoutId, int bindItemLayoutId) {
            CenterListPopupView x02 = new CenterListPopupView(this.f21065b, bindLayoutId, bindItemLayoutId).y0(title, data, iconIds).w0(checkedPosition).x0(selectListener);
            x02.f21074o = this.f21064a;
            return x02;
        }

        public b l0(View view) {
            com.lxj.xpopup.core.b bVar = this.f21064a;
            if (bVar.Q == null) {
                bVar.Q = new ArrayList<>();
            }
            this.f21064a.Q.add(h.D(view));
            return this;
        }

        public CenterListPopupView m(CharSequence title, String[] data, int[] iconIds, g selectListener) {
            return k(title, data, iconIds, -1, selectListener);
        }

        public b m0(int offsetX) {
            this.f21064a.f21173y = offsetX;
            return this;
        }

        public ConfirmPopupView n(CharSequence title, CharSequence content, c3.c confirmListener) {
            return q(title, content, null, null, confirmListener, null, false, 0);
        }

        public b n0(int offsetY) {
            this.f21064a.f21174z = offsetY;
            return this;
        }

        public ConfirmPopupView o(CharSequence title, CharSequence content, c3.c confirmListener, c3.a cancelListener) {
            return q(title, content, null, null, confirmListener, cancelListener, false, 0);
        }

        public b o0(b3.c popupAnimation) {
            this.f21064a.f21155g = popupAnimation;
            return this;
        }

        public ConfirmPopupView p(CharSequence title, CharSequence content, CharSequence cancelBtnText, CharSequence confirmBtnText, c3.c confirmListener, c3.a cancelListener, boolean isHideCancel) {
            return q(title, content, cancelBtnText, confirmBtnText, confirmListener, cancelListener, isHideCancel, 0);
        }

        public b p0(int height) {
            this.f21064a.f21161m = height;
            return this;
        }

        public ConfirmPopupView q(CharSequence title, CharSequence content, CharSequence cancelBtnText, CharSequence confirmBtnText, c3.c confirmListener, c3.a cancelListener, boolean isHideCancel, int bindLayoutId) {
            ConfirmPopupView confirmPopupView = new ConfirmPopupView(this.f21065b, bindLayoutId);
            confirmPopupView.B0(title, content, null);
            confirmPopupView.y0(cancelBtnText);
            confirmPopupView.z0(confirmBtnText);
            confirmPopupView.A0(confirmListener, cancelListener);
            confirmPopupView.f21190d0 = isHideCancel;
            confirmPopupView.f21074o = this.f21064a;
            return confirmPopupView;
        }

        public b q0(d popupPosition) {
            this.f21064a.f21166r = popupPosition;
            return this;
        }

        public BasePopupView r(BasePopupView popupView) {
            popupView.f21074o = this.f21064a;
            return popupView;
        }

        public b r0(int width) {
            this.f21064a.f21160l = width;
            return this;
        }

        public ImageViewerPopupView s(ImageView srcView, int currentPosition, List<Object> urls, c3.h srcViewUpdateListener, k imageLoader) {
            return t(srcView, currentPosition, urls, false, true, -1, -1, -1, true, Color.rgb(32, 36, 46), srcViewUpdateListener, imageLoader, null);
        }

        public b s0(boolean positionByWindowCenter) {
            this.f21064a.K = positionByWindowCenter;
            return this;
        }

        public ImageViewerPopupView t(ImageView srcView, int currentPosition, List<Object> urls, boolean isInfinite, boolean isShowPlaceHolder, int placeholderColor, int placeholderStroke, int placeholderRadius, boolean isShowSaveBtn, int bgColor, c3.h srcViewUpdateListener, k imageLoader, e longPressListener) {
            ImageViewerPopupView E0 = new ImageViewerPopupView(this.f21065b).J0(srcView, currentPosition).D0(urls).x0(isInfinite).z0(isShowPlaceHolder).F0(placeholderColor).H0(placeholderStroke).G0(placeholderRadius).A0(isShowSaveBtn).C0(bgColor).K0(srcViewUpdateListener).L0(imageLoader).E0(longPressListener);
            E0.f21074o = this.f21064a;
            return E0;
        }

        public b t0(j xPopupCallback) {
            this.f21064a.f21164p = xPopupCallback;
            return this;
        }

        public ImageViewerPopupView u(ImageView srcView, Object url, k imageLoader) {
            ImageViewerPopupView L0 = new ImageViewerPopupView(this.f21065b).I0(srcView, url).L0(imageLoader);
            L0.f21074o = this.f21064a;
            return L0;
        }

        public b u0(int shadowBgColor) {
            this.f21064a.N = shadowBgColor;
            return this;
        }

        public ImageViewerPopupView v(ImageView srcView, Object url, boolean isInfinite, int placeholderColor, int placeholderStroke, int placeholderRadius, boolean isShowSaveBtn, int bgColor, k imageLoader, e longPressListener) {
            ImageViewerPopupView E0 = new ImageViewerPopupView(this.f21065b).I0(srcView, url).x0(isInfinite).F0(placeholderColor).H0(placeholderStroke).G0(placeholderRadius).A0(isShowSaveBtn).C0(bgColor).L0(imageLoader).E0(longPressListener);
            E0.f21074o = this.f21064a;
            return E0;
        }

        public b v0(int statusBarBgColor) {
            this.f21064a.P = statusBarBgColor;
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

        public InputConfirmPopupView z(CharSequence title, CharSequence content, CharSequence inputContent, CharSequence hint, f confirmListener, c3.a cancelListener, int bindLayoutId) {
            InputConfirmPopupView inputConfirmPopupView = new InputConfirmPopupView(this.f21065b, bindLayoutId);
            inputConfirmPopupView.B0(title, content, hint);
            inputConfirmPopupView.f21192e0 = inputContent;
            inputConfirmPopupView.F0(confirmListener, cancelListener);
            inputConfirmPopupView.f21074o = this.f21064a;
            return inputConfirmPopupView;
        }
    }

    private c() {
    }

    public static void a(View v5) {
        v5.setOnTouchListener(new a());
        v5.setTag(ProtectedSandApp.s("㔂"));
    }

    public static int b() {
        return f21057b;
    }

    public static int c() {
        return f21059d;
    }

    public static int d() {
        return f21056a;
    }

    public static int e() {
        return f21060e;
    }

    public static int f() {
        return f21058c;
    }

    @x0(api = 23)
    public static void g(Context context, XPermission.d callback) {
        XPermission.p(context, new String[0]).H(callback);
    }

    public static void h(int duration) {
        if (duration >= 0) {
            f21057b = duration;
        }
    }

    public static void i(boolean isLight) {
        f21062g = isLight ? 1 : -1;
    }

    public static void j(boolean isLight) {
        f21061f = isLight ? 1 : -1;
    }

    public static void k(int color) {
        f21059d = color;
    }

    public static void l(int color) {
        f21056a = color;
    }

    public static void m(int color) {
        f21060e = color;
    }

    public static void n(int color) {
        f21058c = color;
    }
}

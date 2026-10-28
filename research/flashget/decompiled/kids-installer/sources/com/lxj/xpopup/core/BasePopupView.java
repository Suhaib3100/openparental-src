package com.lxj.xpopup.core;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.a0;
import android.view.c0;
import android.view.l0;
import android.view.t;
import android.view.z;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.core.view.y1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.impl.FullScreenPopupView;
import com.lxj.xpopup.impl.PartShadowPopupView;
import com.lxj.xpopup.util.KeyboardUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BasePopupView extends FrameLayout implements z, a0, y1.z {
    public com.lxj.xpopup.core.a A;
    private final Runnable B;
    protected Runnable C;
    private l D;
    protected Runnable E;
    Runnable F;
    private float G;
    private float H;

    /* renamed from: o, reason: collision with root package name */
    public com.lxj.xpopup.core.b f21074o;

    /* renamed from: p, reason: collision with root package name */
    protected com.lxj.xpopup.animator.c f21075p;

    /* renamed from: q, reason: collision with root package name */
    protected com.lxj.xpopup.animator.f f21076q;

    /* renamed from: r, reason: collision with root package name */
    protected com.lxj.xpopup.animator.a f21077r;

    /* renamed from: s, reason: collision with root package name */
    private final int f21078s;

    /* renamed from: t, reason: collision with root package name */
    public b3.e f21079t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f21080u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21081v;

    /* renamed from: w, reason: collision with root package name */
    private int f21082w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21083x;

    /* renamed from: y, reason: collision with root package name */
    protected Handler f21084y;

    /* renamed from: z, reason: collision with root package name */
    protected c0 f21085z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21086a;

        static {
            int[] iArr = new int[b3.c.values().length];
            f21086a = iArr;
            try {
                iArr[b3.c.ScaleAlphaFromCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21086a[b3.c.ScaleAlphaFromLeftTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21086a[b3.c.ScaleAlphaFromRightTop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21086a[b3.c.ScaleAlphaFromLeftBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21086a[b3.c.ScaleAlphaFromRightBottom.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21086a[b3.c.TranslateAlphaFromLeft.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21086a[b3.c.TranslateAlphaFromTop.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21086a[b3.c.TranslateAlphaFromRight.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21086a[b3.c.TranslateAlphaFromBottom.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21086a[b3.c.TranslateFromLeft.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21086a[b3.c.TranslateFromTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21086a[b3.c.TranslateFromRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21086a[b3.c.TranslateFromBottom.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21086a[b3.c.ScrollAlphaFromLeft.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21086a[b3.c.ScrollAlphaFromLeftTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21086a[b3.c.ScrollAlphaFromTop.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21086a[b3.c.ScrollAlphaFromRightTop.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21086a[b3.c.ScrollAlphaFromRight.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21086a[b3.c.ScrollAlphaFromRightBottom.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21086a[b3.c.ScrollAlphaFromBottom.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21086a[b3.c.ScrollAlphaFromLeftBottom.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21086a[b3.c.NoAnimation.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.p();
        }
    }

    class c implements KeyboardUtils.b {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.lxj.xpopup.util.h.M(BasePopupView.this);
            }
        }

        c() {
        }

        @Override // com.lxj.xpopup.util.KeyboardUtils.b
        public void a(int height) {
            c3.j jVar;
            BasePopupView.this.j0(height);
            BasePopupView basePopupView = BasePopupView.this;
            com.lxj.xpopup.core.b bVar = basePopupView.f21074o;
            if (bVar != null && (jVar = bVar.f21164p) != null) {
                jVar.e(basePopupView, height);
            }
            if (height == 0) {
                BasePopupView.this.post(new a());
                BasePopupView.this.f21083x = false;
                return;
            }
            BasePopupView basePopupView2 = BasePopupView.this;
            if ((basePopupView2 instanceof PartShadowPopupView) && basePopupView2.f21079t == b3.e.Showing) {
                return;
            }
            com.lxj.xpopup.util.h.N(height, basePopupView2);
            BasePopupView.this.f21083x = true;
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.D();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.D();
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c3.j jVar;
            if (BasePopupView.this.L() == null) {
                return;
            }
            BasePopupView basePopupView = BasePopupView.this;
            com.lxj.xpopup.core.b bVar = basePopupView.f21074o;
            if (bVar != null && (jVar = bVar.f21164p) != null) {
                jVar.h(basePopupView);
            }
            BasePopupView.this.r();
            BasePopupView.this.f21085z.j(t.b.ON_START);
            BasePopupView basePopupView2 = BasePopupView.this;
            if (!(basePopupView2 instanceof FullScreenPopupView)) {
                basePopupView2.F();
            }
            BasePopupView basePopupView3 = BasePopupView.this;
            if ((basePopupView3 instanceof AttachPopupView) || (basePopupView3 instanceof BubbleAttachPopupView) || (basePopupView3 instanceof PositionPopupView) || (basePopupView3 instanceof PartShadowPopupView)) {
                return;
            }
            basePopupView3.c0();
            BasePopupView.this.E();
            BasePopupView.this.B();
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c3.j jVar;
            BasePopupView basePopupView = BasePopupView.this;
            basePopupView.f21079t = b3.e.Show;
            basePopupView.f21085z.j(t.b.ON_RESUME);
            BasePopupView.this.k0();
            BasePopupView basePopupView2 = BasePopupView.this;
            if (basePopupView2 instanceof FullScreenPopupView) {
                basePopupView2.F();
            }
            BasePopupView basePopupView3 = BasePopupView.this;
            com.lxj.xpopup.core.b bVar = basePopupView3.f21074o;
            if (bVar != null && (jVar = bVar.f21164p) != null) {
                jVar.c(basePopupView3);
            }
            if (BasePopupView.this.L() == null || com.lxj.xpopup.util.h.v(BasePopupView.this.L()) <= 0) {
                return;
            }
            BasePopupView basePopupView4 = BasePopupView.this;
            if (basePopupView4.f21083x) {
                return;
            }
            com.lxj.xpopup.util.h.N(com.lxj.xpopup.util.h.v(basePopupView4.L()), BasePopupView.this);
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.t(r0.K() + 50);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.x();
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View findViewById;
            BasePopupView basePopupView = BasePopupView.this;
            basePopupView.f21079t = b3.e.Dismiss;
            basePopupView.f21085z.j(t.b.ON_STOP);
            com.lxj.xpopup.core.b bVar = BasePopupView.this.f21074o;
            if (bVar == null) {
                return;
            }
            if (bVar.f21163o.booleanValue()) {
                BasePopupView basePopupView2 = BasePopupView.this;
                if (basePopupView2 instanceof PartShadowPopupView) {
                    KeyboardUtils.c(basePopupView2);
                }
            }
            BasePopupView.this.i0();
            com.lxj.xpopup.c.f21063h = null;
            BasePopupView basePopupView3 = BasePopupView.this;
            c3.j jVar = basePopupView3.f21074o.f21164p;
            if (jVar != null) {
                jVar.g(basePopupView3);
            }
            Runnable runnable = BasePopupView.this.F;
            if (runnable != null) {
                runnable.run();
                BasePopupView.this.F = null;
            }
            BasePopupView basePopupView4 = BasePopupView.this;
            com.lxj.xpopup.core.b bVar2 = basePopupView4.f21074o;
            if (bVar2.C && bVar2.L && basePopupView4.a0() != null && (findViewById = BasePopupView.this.a0().findViewById(R.id.content)) != null) {
                findViewById.setFocusable(true);
                findViewById.setFocusableInTouchMode(true);
            }
            BasePopupView.this.w();
        }
    }

    class k implements View.OnKeyListener {
        k() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View v5, int keyCode, KeyEvent event) {
            return BasePopupView.this.m0(keyCode, event);
        }
    }

    static class l implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        View f21098o;

        public l(View focusView) {
            this.f21098o = focusView;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f21098o;
            if (view != null) {
                KeyboardUtils.g(view);
            }
        }
    }

    public BasePopupView(@o0 Context context) {
        super(context);
        this.f21079t = b3.e.Dismiss;
        this.f21080u = false;
        this.f21081v = false;
        this.f21082w = -1;
        this.f21083x = false;
        this.f21084y = new Handler(Looper.getMainLooper());
        this.B = new f();
        this.C = new g();
        this.E = new j();
        if (context instanceof Application) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㔃"));
        }
        this.f21085z = new c0(this);
        this.f21078s = ViewConfiguration.get(context).getScaledTouchSlop();
        setId(View.generateViewId());
        View inflate = LayoutInflater.from(context).inflate(N(), (ViewGroup) this, false);
        inflate.setAlpha(0.0f);
        addView(inflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㔄"));
        }
        t tVar = bVar.R;
        if (tVar != null) {
            tVar.a(this);
        } else if (getContext() instanceof FragmentActivity) {
            ((FragmentActivity) getContext()).getLifecycle().a(this);
        }
        D();
        if (this.f21074o.L) {
            ViewGroup viewGroup = (ViewGroup) H().getWindow().getDecorView();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            viewGroup.addView(this, getLayoutParams());
        } else {
            if (this.A == null) {
                this.A = new com.lxj.xpopup.core.a(getContext()).d(this);
            }
            Activity H = H();
            if (H != null && !H.isFinishing() && !this.A.isShowing()) {
                this.A.show();
            }
        }
        KeyboardUtils.e(L(), this, new c());
    }

    private void s(MotionEvent event) {
        boolean z5;
        ArrayList<Rect> arrayList = this.f21074o.Q;
        if (arrayList == null || arrayList.size() <= 0) {
            x();
            return;
        }
        Iterator<Rect> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z5 = false;
                break;
            }
            if (com.lxj.xpopup.util.h.F(event.getX(), event.getY(), it.next())) {
                z5 = true;
                break;
            }
        }
        if (z5) {
            return;
        }
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || !bVar.L) {
            com.lxj.xpopup.core.a aVar = this.A;
            if (aVar != null) {
                aVar.dismiss();
                return;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    protected void A() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar != null && bVar.f21163o.booleanValue() && !(this instanceof PartShadowPopupView)) {
            KeyboardUtils.c(this);
        }
        this.f21084y.removeCallbacks(this.E);
        this.f21084y.postDelayed(this.E, K());
    }

    protected void B() {
        this.f21084y.removeCallbacks(this.C);
        this.f21084y.postDelayed(this.C, K());
    }

    protected void C() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.animator.f fVar;
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return;
        }
        if (bVar.f21152d.booleanValue() && !this.f21074o.f21153e.booleanValue() && (fVar = this.f21076q) != null) {
            fVar.a();
        } else if (this.f21074o.f21153e.booleanValue() && (aVar = this.f21077r) != null) {
            aVar.a();
        }
        com.lxj.xpopup.animator.c cVar = this.f21075p;
        if (cVar != null) {
            cVar.a();
        }
    }

    protected void D() {
        if (H() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        View J = J();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(J.getWidth(), J.getHeight());
        } else {
            marginLayoutParams.width = J.getWidth();
            marginLayoutParams.height = J.getHeight();
        }
        com.lxj.xpopup.core.b bVar = this.f21074o;
        marginLayoutParams.leftMargin = (bVar == null || !bVar.L) ? 0 : J.getLeft();
        marginLayoutParams.topMargin = J.getTop();
        setLayoutParams(marginLayoutParams);
    }

    protected void E() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.animator.f fVar;
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return;
        }
        if (bVar.f21152d.booleanValue() && !this.f21074o.f21153e.booleanValue() && (fVar = this.f21076q) != null) {
            fVar.b();
        } else if (this.f21074o.f21153e.booleanValue() && (aVar = this.f21077r) != null) {
            aVar.b();
        }
        com.lxj.xpopup.animator.c cVar = this.f21075p;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void F() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || !bVar.C) {
            return;
        }
        setFocusableInTouchMode(true);
        setFocusable(true);
        if (Build.VERSION.SDK_INT >= 28) {
            m(this);
        } else {
            setOnKeyListener(new k());
        }
        ArrayList arrayList = new ArrayList();
        com.lxj.xpopup.util.h.q(arrayList, (ViewGroup) T());
        if (arrayList.size() <= 0) {
            if (this.f21074o.f21163o.booleanValue()) {
                o0(this);
                return;
            }
            return;
        }
        this.f21082w = L().getAttributes().softInputMode;
        if (this.f21074o.L) {
            L().setSoftInputMode(16);
            this.f21081v = true;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            EditText editText = (EditText) arrayList.get(i5);
            if (Build.VERSION.SDK_INT >= 28) {
                m(editText);
            } else if (!com.lxj.xpopup.util.h.E(editText)) {
                editText.setOnKeyListener(new k());
            }
            if (i5 == 0) {
                com.lxj.xpopup.core.b bVar2 = this.f21074o;
                if (bVar2.D) {
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                    if (this.f21074o.f21163o.booleanValue()) {
                        o0(editText);
                    }
                } else if (bVar2.f21163o.booleanValue()) {
                    o0(this);
                }
            }
        }
    }

    protected com.lxj.xpopup.animator.c G() {
        b3.c cVar;
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || (cVar = bVar.f21155g) == null) {
            return null;
        }
        switch (a.f21086a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return new com.lxj.xpopup.animator.d(T(), K(), this.f21074o.f21155g);
            case 6:
            case 7:
            case 8:
            case 9:
                return new com.lxj.xpopup.animator.g(T(), K(), this.f21074o.f21155g);
            case 10:
            case 11:
            case 12:
            case 13:
                return new com.lxj.xpopup.animator.h(T(), K(), this.f21074o.f21155g);
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return new com.lxj.xpopup.animator.e(T(), K(), this.f21074o.f21155g);
            case 22:
                return new com.lxj.xpopup.animator.b(T(), K());
            default:
                return null;
        }
    }

    protected Activity H() {
        return com.lxj.xpopup.util.h.j(getContext());
    }

    protected int I() {
        return 0;
    }

    public View J() {
        return ((ViewGroup) H().getWindow().getDecorView()).getChildAt(0);
    }

    public int K() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return 0;
        }
        if (bVar.f21155g == b3.c.NoAnimation) {
            return 1;
        }
        int i5 = bVar.O;
        return i5 >= 0 ? i5 : com.lxj.xpopup.c.b() + 1;
    }

    public Window L() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || !bVar.L) {
            com.lxj.xpopup.core.a aVar = this.A;
            if (aVar == null) {
                return null;
            }
            return aVar.getWindow();
        }
        Activity H = H();
        if (H == null) {
            return null;
        }
        return H.getWindow();
    }

    protected int M() {
        return -1;
    }

    protected abstract int N();

    protected List<String> O() {
        return null;
    }

    protected int P() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return 0;
        }
        return bVar.f21159k;
    }

    protected int Q() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return 0;
        }
        return bVar.f21158j;
    }

    protected int R() {
        return com.lxj.xpopup.util.h.y(L());
    }

    protected com.lxj.xpopup.animator.c S() {
        return null;
    }

    public View T() {
        return getChildAt(0);
    }

    protected int U() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return 0;
        }
        return bVar.f21161m;
    }

    public View V() {
        return ((ViewGroup) T()).getChildAt(0);
    }

    protected int W() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return 0;
        }
        return bVar.f21160l;
    }

    public int X() {
        int i5;
        com.lxj.xpopup.core.b bVar = this.f21074o;
        return (bVar == null || (i5 = bVar.N) == 0) ? com.lxj.xpopup.c.e() : i5;
    }

    public int Y() {
        int i5;
        com.lxj.xpopup.core.b bVar = this.f21074o;
        return (bVar == null || (i5 = bVar.P) == 0) ? com.lxj.xpopup.c.f() : i5;
    }

    protected int Z() {
        return com.lxj.xpopup.util.h.C(L());
    }

    protected View a0() {
        if (L() == null) {
            return null;
        }
        return (ViewGroup) L().getDecorView();
    }

    protected void b0() {
        if (this.f21076q == null) {
            this.f21076q = new com.lxj.xpopup.animator.f(this, K(), X());
        }
        if (this.f21074o.f21153e.booleanValue()) {
            com.lxj.xpopup.animator.a aVar = new com.lxj.xpopup.animator.a(this, X());
            this.f21077r = aVar;
            aVar.f19785i = this.f21074o.f21152d.booleanValue();
            this.f21077r.f19784h = com.lxj.xpopup.util.h.X(H().getWindow().getDecorView(), J().getHeight(), 5);
        }
        if ((this instanceof AttachPopupView) || (this instanceof BubbleAttachPopupView) || (this instanceof PartShadowPopupView) || (this instanceof PositionPopupView)) {
            d0();
        } else if (!this.f21080u) {
            d0();
        }
        if (!this.f21080u) {
            this.f21080u = true;
            h0();
            this.f21085z.j(t.b.ON_CREATE);
            c3.j jVar = this.f21074o.f21164p;
            if (jVar != null) {
                jVar.a(this);
            }
        }
        this.f21084y.post(this.B);
    }

    protected void c0() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.animator.c cVar;
        T().setAlpha(1.0f);
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || (cVar = bVar.f21156h) == null) {
            com.lxj.xpopup.animator.c G = G();
            this.f21075p = G;
            if (G == null) {
                this.f21075p = S();
            }
        } else {
            this.f21075p = cVar;
            if (cVar.f19788c == null) {
                cVar.f19788c = T();
            }
        }
        com.lxj.xpopup.core.b bVar2 = this.f21074o;
        if (bVar2 != null && bVar2.f21152d.booleanValue()) {
            this.f21076q.d();
        }
        com.lxj.xpopup.core.b bVar3 = this.f21074o;
        if (bVar3 != null && bVar3.f21153e.booleanValue() && (aVar = this.f21077r) != null) {
            aVar.d();
        }
        com.lxj.xpopup.animator.c cVar2 = this.f21075p;
        if (cVar2 != null) {
            cVar2.d();
        }
    }

    protected void d0() {
    }

    public boolean e0() {
        return this.f21079t == b3.e.Dismiss;
    }

    public boolean f0() {
        return this.f21079t != b3.e.Dismiss;
    }

    protected boolean g0() {
        return false;
    }

    @Override // android.view.a0
    @o0
    public t getLifecycle() {
        return this.f21085z;
    }

    protected void h0() {
    }

    protected void i0() {
    }

    protected void j0(int height) {
    }

    protected void k0() {
    }

    public void l0(MotionEvent event) {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar != null) {
            if (bVar.E || bVar.F) {
                if (!bVar.L) {
                    H().dispatchTouchEvent(event);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) H().getWindow().getDecorView();
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (!(childAt instanceof BasePopupView)) {
                        childAt.dispatchTouchEvent(event);
                    }
                }
            }
        }
    }

    protected void m(View view) {
        y1.t1(view, this);
        y1.f(view, this);
    }

    protected boolean m0(int keyCode, KeyEvent event) {
        c3.j jVar;
        if (keyCode != 4 || event.getAction() != 1 || this.f21074o == null) {
            return false;
        }
        if (!g0() && this.f21074o.f21149a.booleanValue() && ((jVar = this.f21074o.f21164p) == null || !jVar.b(this))) {
            y();
        }
        return true;
    }

    protected void n() {
    }

    public BasePopupView n0() {
        com.lxj.xpopup.core.a aVar;
        Activity H = H();
        if (H == null || H.isFinishing()) {
            return this;
        }
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㔅"));
        }
        b3.e eVar = this.f21079t;
        b3.e eVar2 = b3.e.Showing;
        if (eVar != eVar2 && eVar != b3.e.Dismissing) {
            this.f21079t = eVar2;
            if (!bVar.L && (aVar = this.A) != null && aVar.isShowing()) {
                return this;
            }
            H.getWindow().getDecorView().findViewById(R.id.content).post(new b());
        }
        return this;
    }

    protected void o() {
    }

    protected void o0(View focusView) {
        if (this.f21074o != null) {
            l lVar = this.D;
            if (lVar == null) {
                this.D = new l(focusView);
            } else {
                this.f21084y.removeCallbacks(lVar);
            }
            this.f21084y.postDelayed(this.D, 10L);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        J().post(new d());
        return super.onApplyWindowInsets(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b0();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        J().post(new e());
    }

    @l0(t.b.ON_DESTROY)
    public void onDestroy() {
        onDetachedFromWindow();
        w();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        t tVar;
        super.onDetachedFromWindow();
        if (a0() != null) {
            KeyboardUtils.f(L(), this);
        }
        this.f21084y.removeCallbacksAndMessages(null);
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar != null) {
            if (bVar.L && this.f21081v) {
                L().setSoftInputMode(this.f21082w);
                this.f21081v = false;
            }
            if (this.f21074o.J) {
                v();
            }
        }
        com.lxj.xpopup.core.b bVar2 = this.f21074o;
        if (bVar2 != null && (tVar = bVar2.R) != null) {
            tVar.c(this);
        } else if (getContext() != null && (getContext() instanceof FragmentActivity)) {
            ((FragmentActivity) getContext()).getLifecycle().c(this);
        }
        this.f21079t = b3.e.Dismiss;
        this.D = null;
        this.f21083x = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r0 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r1 = r9.V()
            r1.getGlobalVisibleRect(r0)
            float r1 = r10.getX()
            float r2 = r10.getY()
            boolean r0 = com.lxj.xpopup.util.h.F(r1, r2, r0)
            r1 = 1
            if (r0 != 0) goto L9d
            int r0 = r10.getAction()
            if (r0 == 0) goto L83
            if (r0 == r1) goto L44
            r2 = 2
            if (r0 == r2) goto L2b
            r2 = 3
            if (r0 == r2) goto L44
            goto L9d
        L2b:
            com.lxj.xpopup.core.b r0 = r9.f21074o
            if (r0 == 0) goto L9d
            java.lang.Boolean r0 = r0.f21150b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            r9.s(r10)
        L3a:
            com.lxj.xpopup.core.b r0 = r9.f21074o
            boolean r0 = r0.F
            if (r0 == 0) goto L9d
            r9.l0(r10)
            goto L9d
        L44:
            float r0 = r10.getX()
            float r2 = r9.G
            float r0 = r0 - r2
            float r2 = r10.getY()
            float r3 = r9.H
            float r2 = r2 - r3
            double r3 = (double) r0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            double r7 = (double) r2
            double r5 = java.lang.Math.pow(r7, r5)
            double r5 = r5 + r3
            double r2 = java.lang.Math.sqrt(r5)
            float r0 = (float) r2
            r9.l0(r10)
            int r2 = r9.f21078s
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L7d
            com.lxj.xpopup.core.b r0 = r9.f21074o
            if (r0 == 0) goto L7d
            java.lang.Boolean r0 = r0.f21150b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            r9.s(r10)
        L7d:
            r10 = 0
            r9.G = r10
            r9.H = r10
            goto L9d
        L83:
            float r0 = r10.getX()
            r9.G = r0
            float r0 = r10.getY()
            r9.H = r0
            com.lxj.xpopup.core.b r0 = r9.f21074o
            if (r0 == 0) goto L9a
            c3.j r0 = r0.f21164p
            if (r0 == 0) goto L9a
            r0.f(r9)
        L9a:
            r9.l0(r10)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.core.BasePopupView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.view.y1.z
    public boolean onUnhandledKeyEvent(View v5, KeyEvent event) {
        return m0(event.getKeyCode(), event);
    }

    public void p0() {
        this.f21084y.post(new h());
    }

    protected void q() {
    }

    public void q0() {
        if (f0()) {
            x();
        } else {
            n0();
        }
    }

    protected void r() {
    }

    protected void r0() {
        if (getContext() instanceof FragmentActivity) {
            FragmentManager Y = ((FragmentActivity) getContext()).Y();
            List<Fragment> I0 = Y.I0();
            List<String> O = O();
            if (I0 == null || I0.size() <= 0 || O == null) {
                return;
            }
            for (int i5 = 0; i5 < I0.size(); i5++) {
                if (O.contains(I0.get(i5).getClass().getSimpleName())) {
                    Y.u().x(I0.get(i5)).n();
                }
            }
        }
    }

    public void t(long delay) {
        if (delay < 0) {
            delay = 0;
        }
        this.f21084y.postDelayed(new i(), delay);
    }

    public void u(long delay, Runnable runnable) {
        this.F = runnable;
        t(delay);
    }

    public void v() {
        View view;
        View view2;
        y1.t1(this, this);
        if (this.f21080u) {
            this.f21085z.j(t.b.ON_DESTROY);
        }
        this.f21085z.c(this);
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar != null) {
            bVar.f21154f = null;
            bVar.f21164p = null;
            t tVar = bVar.R;
            if (tVar != null) {
                tVar.c(this);
                this.f21074o.R = null;
            }
            com.lxj.xpopup.animator.c cVar = this.f21074o.f21156h;
            if (cVar != null) {
                View view3 = cVar.f19788c;
                if (view3 != null) {
                    view3.animate().cancel();
                    this.f21074o.f21156h.f19788c = null;
                }
                this.f21074o.f21156h = null;
            }
            if (this.f21074o.L) {
                r0();
            }
            this.f21074o = null;
        }
        com.lxj.xpopup.core.a aVar = this.A;
        if (aVar != null) {
            if (aVar.isShowing()) {
                this.A.dismiss();
            }
            this.A.f21148o = null;
            this.A = null;
        }
        com.lxj.xpopup.animator.f fVar = this.f21076q;
        if (fVar != null && (view2 = fVar.f19788c) != null) {
            view2.animate().cancel();
        }
        com.lxj.xpopup.animator.a aVar2 = this.f21077r;
        if (aVar2 == null || (view = aVar2.f19788c) == null) {
            return;
        }
        view.animate().cancel();
        Bitmap bitmap = this.f21077r.f19784h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f21077r.f19784h.recycle();
        this.f21077r.f19784h = null;
    }

    public void x() {
        c3.j jVar;
        this.f21084y.removeCallbacks(this.B);
        b3.e eVar = this.f21079t;
        b3.e eVar2 = b3.e.Dismissing;
        if (eVar == eVar2 || eVar == b3.e.Dismiss) {
            return;
        }
        this.f21079t = eVar2;
        clearFocus();
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar != null && (jVar = bVar.f21164p) != null) {
            jVar.i(this);
        }
        q();
        this.f21085z.j(t.b.ON_PAUSE);
        C();
        A();
    }

    public void y() {
        if (com.lxj.xpopup.util.h.v(L()) == 0) {
            x();
        } else {
            KeyboardUtils.c(this);
        }
    }

    public void z(Runnable runnable) {
        this.F = runnable;
        x();
    }
}

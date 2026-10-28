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
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.core.view.x1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1421d0;
import androidx.view.InterfaceC1423e0;
import androidx.view.g0;
import androidx.view.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.impl.FullScreenPopupView;
import com.lxj.xpopup.impl.PartShadowPopupView;
import com.lxj.xpopup.util.KeyboardUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class BasePopupView extends FrameLayout implements InterfaceC1421d0, InterfaceC1423e0, x1.u {

    /* renamed from: b, reason: collision with root package name */
    public com.lxj.xpopup.core.b f69527b;

    /* renamed from: c, reason: collision with root package name */
    protected com.lxj.xpopup.animator.c f69528c;

    /* renamed from: d, reason: collision with root package name */
    protected com.lxj.xpopup.animator.f f69529d;

    /* renamed from: e, reason: collision with root package name */
    protected com.lxj.xpopup.animator.a f69530e;

    /* renamed from: f, reason: collision with root package name */
    private final int f69531f;

    /* renamed from: g, reason: collision with root package name */
    public fb.e f69532g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f69533h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f69534i;

    /* renamed from: j, reason: collision with root package name */
    private int f69535j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f69536k;

    /* renamed from: l, reason: collision with root package name */
    protected Handler f69537l;

    /* renamed from: m, reason: collision with root package name */
    protected g0 f69538m;

    /* renamed from: n, reason: collision with root package name */
    public com.lxj.xpopup.core.a f69539n;

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f69540o;

    /* renamed from: p, reason: collision with root package name */
    protected Runnable f69541p;

    /* renamed from: q, reason: collision with root package name */
    private l f69542q;

    /* renamed from: r, reason: collision with root package name */
    protected Runnable f69543r;

    /* renamed from: s, reason: collision with root package name */
    Runnable f69544s;

    /* renamed from: t, reason: collision with root package name */
    private float f69545t;

    /* renamed from: u, reason: collision with root package name */
    private float f69546u;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69547a;

        static {
            int[] iArr = new int[fb.c.values().length];
            f69547a = iArr;
            try {
                iArr[fb.c.ScaleAlphaFromCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69547a[fb.c.ScaleAlphaFromLeftTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69547a[fb.c.ScaleAlphaFromRightTop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69547a[fb.c.ScaleAlphaFromLeftBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69547a[fb.c.ScaleAlphaFromRightBottom.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69547a[fb.c.TranslateAlphaFromLeft.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69547a[fb.c.TranslateAlphaFromTop.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f69547a[fb.c.TranslateAlphaFromRight.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f69547a[fb.c.TranslateAlphaFromBottom.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f69547a[fb.c.TranslateFromLeft.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f69547a[fb.c.TranslateFromTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f69547a[fb.c.TranslateFromRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f69547a[fb.c.TranslateFromBottom.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f69547a[fb.c.ScrollAlphaFromLeft.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f69547a[fb.c.ScrollAlphaFromLeftTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f69547a[fb.c.ScrollAlphaFromTop.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f69547a[fb.c.ScrollAlphaFromRightTop.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f69547a[fb.c.ScrollAlphaFromRight.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f69547a[fb.c.ScrollAlphaFromRightBottom.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f69547a[fb.c.ScrollAlphaFromBottom.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f69547a[fb.c.ScrollAlphaFromLeftBottom.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f69547a[fb.c.NoAnimation.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.j();
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
            gb.j jVar;
            BasePopupView.this.f0(height);
            BasePopupView basePopupView = BasePopupView.this;
            com.lxj.xpopup.core.b bVar = basePopupView.f69527b;
            if (bVar != null && (jVar = bVar.f69638p) != null) {
                jVar.g(basePopupView, height);
            }
            if (height == 0) {
                BasePopupView.this.post(new a());
                BasePopupView.this.f69536k = false;
                return;
            }
            BasePopupView basePopupView2 = BasePopupView.this;
            if ((basePopupView2 instanceof PartShadowPopupView) && basePopupView2.f69532g == fb.e.Showing) {
                return;
            }
            com.lxj.xpopup.util.h.N(height, basePopupView2);
            BasePopupView.this.f69536k = true;
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.z();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.z();
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gb.j jVar;
            if (BasePopupView.this.H() == null) {
                return;
            }
            BasePopupView basePopupView = BasePopupView.this;
            com.lxj.xpopup.core.b bVar = basePopupView.f69527b;
            if (bVar != null && (jVar = bVar.f69638p) != null) {
                jVar.f(basePopupView);
            }
            BasePopupView.this.m();
            BasePopupView.this.f69538m.l(AbstractC1450w.a.ON_START);
            BasePopupView basePopupView2 = BasePopupView.this;
            if (!(basePopupView2 instanceof FullScreenPopupView)) {
                basePopupView2.B();
            }
            BasePopupView basePopupView3 = BasePopupView.this;
            if ((basePopupView3 instanceof AttachPopupView) || (basePopupView3 instanceof BubbleAttachPopupView) || (basePopupView3 instanceof PositionPopupView) || (basePopupView3 instanceof PartShadowPopupView)) {
                return;
            }
            basePopupView3.Y();
            BasePopupView.this.A();
            BasePopupView.this.x();
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gb.j jVar;
            BasePopupView basePopupView = BasePopupView.this;
            basePopupView.f69532g = fb.e.Show;
            basePopupView.f69538m.l(AbstractC1450w.a.ON_RESUME);
            BasePopupView.this.g0();
            BasePopupView basePopupView2 = BasePopupView.this;
            if (basePopupView2 instanceof FullScreenPopupView) {
                basePopupView2.B();
            }
            BasePopupView basePopupView3 = BasePopupView.this;
            com.lxj.xpopup.core.b bVar = basePopupView3.f69527b;
            if (bVar != null && (jVar = bVar.f69638p) != null) {
                jVar.c(basePopupView3);
            }
            if (BasePopupView.this.H() == null || com.lxj.xpopup.util.h.v(BasePopupView.this.H()) <= 0) {
                return;
            }
            BasePopupView basePopupView4 = BasePopupView.this;
            if (basePopupView4.f69536k) {
                return;
            }
            com.lxj.xpopup.util.h.N(com.lxj.xpopup.util.h.v(basePopupView4.H()), BasePopupView.this);
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.p(r0.G() + 50);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePopupView.this.t();
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View findViewById;
            BasePopupView basePopupView = BasePopupView.this;
            basePopupView.f69532g = fb.e.Dismiss;
            basePopupView.f69538m.l(AbstractC1450w.a.ON_STOP);
            com.lxj.xpopup.core.b bVar = BasePopupView.this.f69527b;
            if (bVar == null) {
                return;
            }
            if (bVar.f69637o.booleanValue()) {
                BasePopupView basePopupView2 = BasePopupView.this;
                if (basePopupView2 instanceof PartShadowPopupView) {
                    KeyboardUtils.c(basePopupView2);
                }
            }
            BasePopupView.this.e0();
            com.lxj.xpopup.c.f69511h = null;
            BasePopupView basePopupView3 = BasePopupView.this;
            gb.j jVar = basePopupView3.f69527b.f69638p;
            if (jVar != null) {
                jVar.h(basePopupView3);
            }
            Runnable runnable = BasePopupView.this.f69544s;
            if (runnable != null) {
                runnable.run();
                BasePopupView.this.f69544s = null;
            }
            BasePopupView basePopupView4 = BasePopupView.this;
            com.lxj.xpopup.core.b bVar2 = basePopupView4.f69527b;
            if (bVar2.C && bVar2.L && basePopupView4.W() != null && (findViewById = BasePopupView.this.W().findViewById(R.id.content)) != null) {
                findViewById.setFocusable(true);
                findViewById.setFocusableInTouchMode(true);
            }
            BasePopupView.this.s();
        }
    }

    class k implements View.OnKeyListener {
        k() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View v4, int keyCode, KeyEvent event) {
            return BasePopupView.this.i0(keyCode, event);
        }
    }

    static class l implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        View f69559b;

        public l(View focusView) {
            this.f69559b = focusView;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f69559b;
            if (view != null) {
                KeyboardUtils.g(view);
            }
        }
    }

    public BasePopupView(@o0 Context context) {
        super(context);
        this.f69532g = fb.e.Dismiss;
        this.f69533h = false;
        this.f69534i = false;
        this.f69535j = -1;
        this.f69536k = false;
        this.f69537l = new Handler(Looper.getMainLooper());
        this.f69540o = new f();
        this.f69541p = new g();
        this.f69543r = new j();
        if (context instanceof Application) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ណ\u0001"));
        }
        this.f69538m = new g0(this);
        this.f69531f = ViewConfiguration.get(context).getScaledTouchSlop();
        setId(View.generateViewId());
        View inflate = LayoutInflater.from(context).inflate(J(), (ViewGroup) this, false);
        inflate.setAlpha(0.0f);
        addView(inflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ត\u0001"));
        }
        AbstractC1450w abstractC1450w = bVar.R;
        if (abstractC1450w != null) {
            abstractC1450w.a(this);
        } else if (getContext() instanceof FragmentActivity) {
            ((FragmentActivity) getContext()).getLifecycle().a(this);
        }
        z();
        if (this.f69527b.L) {
            ViewGroup viewGroup = (ViewGroup) D().getWindow().getDecorView();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            viewGroup.addView(this, getLayoutParams());
        } else {
            if (this.f69539n == null) {
                this.f69539n = new com.lxj.xpopup.core.a(getContext()).d(this);
            }
            Activity D = D();
            if (D != null && !D.isFinishing() && !this.f69539n.isShowing()) {
                this.f69539n.show();
            }
        }
        KeyboardUtils.e(H(), this, new c());
    }

    private void o(MotionEvent event) {
        ArrayList<Rect> arrayList = this.f69527b.Q;
        if (arrayList == null || arrayList.size() <= 0) {
            t();
            return;
        }
        Iterator<Rect> it = arrayList.iterator();
        while (it.hasNext()) {
            if (com.lxj.xpopup.util.h.F(event.getX(), event.getY(), it.next())) {
                return;
            }
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || !bVar.L) {
            com.lxj.xpopup.core.a aVar = this.f69539n;
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
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.animator.f fVar;
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return;
        }
        if (bVar.f69626d.booleanValue() && !this.f69527b.f69627e.booleanValue() && (fVar = this.f69529d) != null) {
            fVar.b();
        } else if (this.f69527b.f69627e.booleanValue() && (aVar = this.f69530e) != null) {
            aVar.b();
        }
        com.lxj.xpopup.animator.c cVar = this.f69528c;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void B() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || !bVar.C) {
            return;
        }
        setFocusableInTouchMode(true);
        setFocusable(true);
        if (Build.VERSION.SDK_INT >= 28) {
            g(this);
        } else {
            setOnKeyListener(new k());
        }
        ArrayList arrayList = new ArrayList();
        com.lxj.xpopup.util.h.q(arrayList, (ViewGroup) P());
        if (arrayList.size() <= 0) {
            if (this.f69527b.f69637o.booleanValue()) {
                k0(this);
                return;
            }
            return;
        }
        this.f69535j = H().getAttributes().softInputMode;
        if (this.f69527b.L) {
            H().setSoftInputMode(16);
            this.f69534i = true;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            EditText editText = (EditText) arrayList.get(i4);
            if (Build.VERSION.SDK_INT >= 28) {
                g(editText);
            } else if (!com.lxj.xpopup.util.h.E(editText)) {
                editText.setOnKeyListener(new k());
            }
            if (i4 == 0) {
                com.lxj.xpopup.core.b bVar2 = this.f69527b;
                if (bVar2.D) {
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                    if (this.f69527b.f69637o.booleanValue()) {
                        k0(editText);
                    }
                } else if (bVar2.f69637o.booleanValue()) {
                    k0(this);
                }
            }
        }
    }

    protected com.lxj.xpopup.animator.c C() {
        fb.c cVar;
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || (cVar = bVar.f69629g) == null) {
            return null;
        }
        switch (a.f69547a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return new com.lxj.xpopup.animator.d(P(), G(), this.f69527b.f69629g);
            case 6:
            case 7:
            case 8:
            case 9:
                return new com.lxj.xpopup.animator.g(P(), G(), this.f69527b.f69629g);
            case 10:
            case 11:
            case 12:
            case 13:
                return new com.lxj.xpopup.animator.h(P(), G(), this.f69527b.f69629g);
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return new com.lxj.xpopup.animator.e(P(), G(), this.f69527b.f69629g);
            case 22:
                return new com.lxj.xpopup.animator.b(P(), G(), null);
            default:
                return null;
        }
    }

    protected Activity D() {
        return com.lxj.xpopup.util.h.j(getContext());
    }

    protected int E() {
        return 0;
    }

    public View F() {
        return ((ViewGroup) D().getWindow().getDecorView()).getChildAt(0);
    }

    public int G() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return 0;
        }
        if (bVar.f69629g == fb.c.NoAnimation) {
            return 1;
        }
        int i4 = bVar.O;
        return i4 >= 0 ? i4 : com.lxj.xpopup.c.b() + 1;
    }

    public Window H() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || !bVar.L) {
            com.lxj.xpopup.core.a aVar = this.f69539n;
            if (aVar == null) {
                return null;
            }
            return aVar.getWindow();
        }
        Activity D = D();
        if (D == null) {
            return null;
        }
        return D.getWindow();
    }

    protected int I() {
        return -1;
    }

    protected abstract int J();

    protected List<String> K() {
        return null;
    }

    protected int L() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return 0;
        }
        return bVar.f69633k;
    }

    protected int M() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return 0;
        }
        return bVar.f69632j;
    }

    protected int N() {
        return com.lxj.xpopup.util.h.y(H());
    }

    protected com.lxj.xpopup.animator.c O() {
        return null;
    }

    public View P() {
        return getChildAt(0);
    }

    protected int Q() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return 0;
        }
        return bVar.f69635m;
    }

    public View R() {
        return ((ViewGroup) P()).getChildAt(0);
    }

    protected int S() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return 0;
        }
        return bVar.f69634l;
    }

    public int T() {
        int i4;
        com.lxj.xpopup.core.b bVar = this.f69527b;
        return (bVar == null || (i4 = bVar.N) == 0) ? com.lxj.xpopup.c.e() : i4;
    }

    public int U() {
        int i4;
        com.lxj.xpopup.core.b bVar = this.f69527b;
        return (bVar == null || (i4 = bVar.P) == 0) ? com.lxj.xpopup.c.f() : i4;
    }

    protected int V() {
        return com.lxj.xpopup.util.h.C(H());
    }

    protected View W() {
        if (H() == null) {
            return null;
        }
        return (ViewGroup) H().getDecorView();
    }

    protected void X() {
        if (this.f69529d == null) {
            this.f69529d = new com.lxj.xpopup.animator.f(this, G(), T());
        }
        if (this.f69527b.f69627e.booleanValue()) {
            com.lxj.xpopup.animator.a aVar = new com.lxj.xpopup.animator.a(this, T());
            this.f69530e = aVar;
            aVar.f67863i = this.f69527b.f69626d.booleanValue();
            this.f69530e.f67862h = com.lxj.xpopup.util.h.X(D().getWindow().getDecorView(), F().getHeight(), 5);
        }
        if ((this instanceof AttachPopupView) || (this instanceof BubbleAttachPopupView) || (this instanceof PartShadowPopupView) || (this instanceof PositionPopupView)) {
            Z();
        } else if (!this.f69533h) {
            Z();
        }
        if (!this.f69533h) {
            this.f69533h = true;
            d0();
            this.f69538m.l(AbstractC1450w.a.ON_CREATE);
            gb.j jVar = this.f69527b.f69638p;
            if (jVar != null) {
                jVar.a(this);
            }
        }
        this.f69537l.post(this.f69540o);
    }

    protected void Y() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.animator.c cVar;
        P().setAlpha(1.0f);
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || (cVar = bVar.f69630h) == null) {
            com.lxj.xpopup.animator.c C = C();
            this.f69528c = C;
            if (C == null) {
                this.f69528c = O();
            }
        } else {
            this.f69528c = cVar;
            if (cVar.f67866c == null) {
                cVar.f67866c = P();
            }
        }
        com.lxj.xpopup.core.b bVar2 = this.f69527b;
        if (bVar2 != null && bVar2.f69626d.booleanValue()) {
            this.f69529d.d();
        }
        com.lxj.xpopup.core.b bVar3 = this.f69527b;
        if (bVar3 != null && bVar3.f69627e.booleanValue() && (aVar = this.f69530e) != null) {
            aVar.d();
        }
        com.lxj.xpopup.animator.c cVar2 = this.f69528c;
        if (cVar2 != null) {
            cVar2.d();
        }
    }

    protected void Z() {
    }

    public boolean a0() {
        return this.f69532g == fb.e.Dismiss;
    }

    public boolean b0() {
        return this.f69532g != fb.e.Dismiss;
    }

    protected boolean c0() {
        return false;
    }

    protected void d0() {
    }

    protected void e0() {
    }

    protected void f0(int height) {
    }

    protected void g(View view) {
        x1.z1(view, this);
        x1.f(view, this);
    }

    protected void g0() {
    }

    @Override // androidx.view.InterfaceC1423e0
    @o0
    public AbstractC1450w getLifecycle() {
        return this.f69538m;
    }

    protected void h() {
    }

    public void h0(MotionEvent event) {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar != null) {
            if (bVar.E || bVar.F) {
                if (!bVar.L) {
                    D().dispatchTouchEvent(event);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) D().getWindow().getDecorView();
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    if (!(childAt instanceof BasePopupView)) {
                        childAt.dispatchTouchEvent(event);
                    }
                }
            }
        }
    }

    protected void i() {
    }

    protected boolean i0(int keyCode, KeyEvent event) {
        gb.j jVar;
        if (keyCode != 4 || event.getAction() != 1 || this.f69527b == null) {
            return false;
        }
        if (!c0() && this.f69527b.f69623a.booleanValue() && ((jVar = this.f69527b.f69638p) == null || !jVar.b(this))) {
            u();
        }
        return true;
    }

    public BasePopupView j0() {
        com.lxj.xpopup.core.a aVar;
        Activity D = D();
        if (D == null || D.isFinishing()) {
            return this;
        }
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ថ\u0001"));
        }
        fb.e eVar = this.f69532g;
        fb.e eVar2 = fb.e.Showing;
        if (eVar != eVar2 && eVar != fb.e.Dismissing) {
            this.f69532g = eVar2;
            if (!bVar.L && (aVar = this.f69539n) != null && aVar.isShowing()) {
                return this;
            }
            D.getWindow().getDecorView().findViewById(R.id.content).post(new b());
        }
        return this;
    }

    protected void k() {
    }

    protected void k0(View focusView) {
        if (this.f69527b != null) {
            l lVar = this.f69542q;
            if (lVar == null) {
                this.f69542q = new l(focusView);
            } else {
                this.f69537l.removeCallbacks(lVar);
            }
            this.f69537l.postDelayed(this.f69542q, 10L);
        }
    }

    public void l0() {
        this.f69537l.post(new h());
    }

    protected void m() {
    }

    public void m0() {
        if (b0()) {
            t();
        } else {
            j0();
        }
    }

    protected void n0() {
        if (getContext() instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) getContext()).getSupportFragmentManager();
            List<Fragment> I0 = supportFragmentManager.I0();
            List<String> K = K();
            if (I0 == null || I0.size() <= 0 || K == null) {
                return;
            }
            for (int i4 = 0; i4 < I0.size(); i4++) {
                if (K.contains(I0.get(i4).getClass().getSimpleName())) {
                    supportFragmentManager.u().C(I0.get(i4)).s();
                }
            }
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        F().post(new d());
        return super.onApplyWindowInsets(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        X();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        F().post(new e());
    }

    @q0(AbstractC1450w.a.ON_DESTROY)
    public void onDestroy() {
        onDetachedFromWindow();
        s();
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AbstractC1450w abstractC1450w;
        super.onDetachedFromWindow();
        if (W() != null) {
            KeyboardUtils.f(H(), this);
        }
        this.f69537l.removeCallbacksAndMessages(null);
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar != null) {
            if (bVar.L && this.f69534i) {
                H().setSoftInputMode(this.f69535j);
                this.f69534i = false;
            }
            if (this.f69527b.J) {
                r();
            }
        }
        com.lxj.xpopup.core.b bVar2 = this.f69527b;
        if (bVar2 != null && (abstractC1450w = bVar2.R) != null) {
            abstractC1450w.d(this);
        } else if (getContext() != null && (getContext() instanceof FragmentActivity)) {
            ((FragmentActivity) getContext()).getLifecycle().d(this);
        }
        this.f69532g = fb.e.Dismiss;
        this.f69542q = null;
        this.f69536k = false;
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
            android.view.View r1 = r9.R()
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
            com.lxj.xpopup.core.b r0 = r9.f69527b
            if (r0 == 0) goto L9d
            java.lang.Boolean r0 = r0.f69624b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            r9.o(r10)
        L3a:
            com.lxj.xpopup.core.b r0 = r9.f69527b
            boolean r0 = r0.F
            if (r0 == 0) goto L9d
            r9.h0(r10)
            goto L9d
        L44:
            float r0 = r10.getX()
            float r2 = r9.f69545t
            float r0 = r0 - r2
            float r2 = r10.getY()
            float r3 = r9.f69546u
            float r2 = r2 - r3
            double r3 = (double) r0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            double r7 = (double) r2
            double r5 = java.lang.Math.pow(r7, r5)
            double r5 = r5 + r3
            double r2 = java.lang.Math.sqrt(r5)
            float r0 = (float) r2
            r9.h0(r10)
            int r2 = r9.f69531f
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L7d
            com.lxj.xpopup.core.b r0 = r9.f69527b
            if (r0 == 0) goto L7d
            java.lang.Boolean r0 = r0.f69624b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            r9.o(r10)
        L7d:
            r10 = 0
            r9.f69545t = r10
            r9.f69546u = r10
            goto L9d
        L83:
            float r0 = r10.getX()
            r9.f69545t = r0
            float r0 = r10.getY()
            r9.f69546u = r0
            com.lxj.xpopup.core.b r0 = r9.f69527b
            if (r0 == 0) goto L9a
            gb.j r0 = r0.f69638p
            if (r0 == 0) goto L9a
            r0.e(r9)
        L9a:
            r9.h0(r10)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.core.BasePopupView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.view.x1.u
    public boolean onUnhandledKeyEvent(View v4, KeyEvent event) {
        return i0(event.getKeyCode(), event);
    }

    public void p(long delay) {
        if (delay < 0) {
            delay = 0;
        }
        this.f69537l.postDelayed(new i(), delay);
    }

    public void q(long delay, Runnable runnable) {
        this.f69544s = runnable;
        p(delay);
    }

    public void r() {
        View view;
        View view2;
        x1.z1(this, this);
        if (this.f69533h) {
            this.f69538m.l(AbstractC1450w.a.ON_DESTROY);
        }
        this.f69538m.d(this);
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar != null) {
            bVar.f69628f = null;
            bVar.f69638p = null;
            AbstractC1450w abstractC1450w = bVar.R;
            if (abstractC1450w != null) {
                abstractC1450w.d(this);
                this.f69527b.R = null;
            }
            com.lxj.xpopup.animator.c cVar = this.f69527b.f69630h;
            if (cVar != null) {
                View view3 = cVar.f67866c;
                if (view3 != null) {
                    view3.animate().cancel();
                    this.f69527b.f69630h.f67866c = null;
                }
                this.f69527b.f69630h = null;
            }
            if (this.f69527b.L) {
                n0();
            }
            this.f69527b = null;
        }
        com.lxj.xpopup.core.a aVar = this.f69539n;
        if (aVar != null) {
            if (aVar.isShowing()) {
                this.f69539n.dismiss();
            }
            this.f69539n.f69622b = null;
            this.f69539n = null;
        }
        com.lxj.xpopup.animator.f fVar = this.f69529d;
        if (fVar != null && (view2 = fVar.f67866c) != null) {
            view2.animate().cancel();
        }
        com.lxj.xpopup.animator.a aVar2 = this.f69530e;
        if (aVar2 == null || (view = aVar2.f67866c) == null) {
            return;
        }
        view.animate().cancel();
        Bitmap bitmap = this.f69530e.f67862h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f69530e.f67862h.recycle();
        this.f69530e.f67862h = null;
    }

    public void t() {
        gb.j jVar;
        this.f69537l.removeCallbacks(this.f69540o);
        fb.e eVar = this.f69532g;
        fb.e eVar2 = fb.e.Dismissing;
        if (eVar == eVar2 || eVar == fb.e.Dismiss) {
            return;
        }
        this.f69532g = eVar2;
        clearFocus();
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar != null && (jVar = bVar.f69638p) != null) {
            jVar.i(this);
        }
        k();
        this.f69538m.l(AbstractC1450w.a.ON_PAUSE);
        y();
        w();
    }

    public void u() {
        if (com.lxj.xpopup.util.h.v(H()) == 0) {
            t();
        } else {
            KeyboardUtils.c(this);
        }
    }

    public void v(Runnable runnable) {
        this.f69544s = runnable;
        t();
    }

    protected void w() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar != null && bVar.f69637o.booleanValue() && !(this instanceof PartShadowPopupView)) {
            KeyboardUtils.c(this);
        }
        this.f69537l.removeCallbacks(this.f69543r);
        this.f69537l.postDelayed(this.f69543r, G());
    }

    protected void x() {
        this.f69537l.removeCallbacks(this.f69541p);
        this.f69537l.postDelayed(this.f69541p, G());
    }

    protected void y() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.animator.f fVar;
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return;
        }
        if (bVar.f69626d.booleanValue() && !this.f69527b.f69627e.booleanValue() && (fVar = this.f69529d) != null) {
            fVar.a();
        } else if (this.f69527b.f69627e.booleanValue() && (aVar = this.f69530e) != null) {
            aVar.a();
        }
        com.lxj.xpopup.animator.c cVar = this.f69528c;
        if (cVar != null) {
            cVar.a();
        }
    }

    protected void z() {
        if (D() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        View F = F();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(F.getWidth(), F.getHeight());
        } else {
            marginLayoutParams.width = F.getWidth();
            marginLayoutParams.height = F.getHeight();
        }
        com.lxj.xpopup.core.b bVar = this.f69527b;
        marginLayoutParams.leftMargin = (bVar == null || !bVar.L) ? 0 : F.getLeft();
        marginLayoutParams.topMargin = F.getTop();
        setLayoutParams(marginLayoutParams);
    }
}

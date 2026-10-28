package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.c1;
import androidx.core.view.j3;
import androidx.core.view.y1;

/* compiled from: TooltipCompatHandler.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static final long A = 3000;
    private static d1 B = null;
    private static d1 C = null;

    /* renamed from: x, reason: collision with root package name */
    private static final String f1171x = "TooltipCompatHandler";

    /* renamed from: y, reason: collision with root package name */
    private static final long f1172y = 2500;

    /* renamed from: z, reason: collision with root package name */
    private static final long f1173z = 15000;

    /* renamed from: o, reason: collision with root package name */
    private final View f1174o;

    /* renamed from: p, reason: collision with root package name */
    private final CharSequence f1175p;

    /* renamed from: q, reason: collision with root package name */
    private final int f1176q;

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f1177r = new a();

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f1178s = new b();

    /* renamed from: t, reason: collision with root package name */
    private int f1179t;

    /* renamed from: u, reason: collision with root package name */
    private int f1180u;

    /* renamed from: v, reason: collision with root package name */
    private e1 f1181v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1182w;

    /* compiled from: TooltipCompatHandler.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.c();
        }
    }

    private d1(View view, CharSequence charSequence) {
        this.f1174o = view;
        this.f1175p = charSequence;
        this.f1176q = j3.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1174o.removeCallbacks(this.f1177r);
    }

    private void b() {
        this.f1179t = Integer.MAX_VALUE;
        this.f1180u = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1174o.postDelayed(this.f1177r, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(d1 d1Var) {
        d1 d1Var2 = B;
        if (d1Var2 != null) {
            d1Var2.a();
        }
        B = d1Var;
        if (d1Var != null) {
            d1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        d1 d1Var = B;
        if (d1Var != null && d1Var.f1174o == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new d1(view, charSequence);
            return;
        }
        d1 d1Var2 = C;
        if (d1Var2 != null && d1Var2.f1174o == view) {
            d1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        if (Math.abs(x5 - this.f1179t) <= this.f1176q && Math.abs(y5 - this.f1180u) <= this.f1176q) {
            return false;
        }
        this.f1179t = x5;
        this.f1180u = y5;
        return true;
    }

    void c() {
        if (C == this) {
            C = null;
            e1 e1Var = this.f1181v;
            if (e1Var != null) {
                e1Var.c();
                this.f1181v = null;
                b();
                this.f1174o.removeOnAttachStateChangeListener(this);
            }
        }
        if (B == this) {
            e(null);
        }
        this.f1174o.removeCallbacks(this.f1178s);
    }

    void g(boolean z5) {
        long longPressTimeout;
        long j5;
        long j6;
        if (y1.O0(this.f1174o)) {
            e(null);
            d1 d1Var = C;
            if (d1Var != null) {
                d1Var.c();
            }
            C = this;
            this.f1182w = z5;
            e1 e1Var = new e1(this.f1174o.getContext());
            this.f1181v = e1Var;
            e1Var.e(this.f1174o, this.f1179t, this.f1180u, this.f1182w, this.f1175p);
            this.f1174o.addOnAttachStateChangeListener(this);
            if (this.f1182w) {
                j6 = f1172y;
            } else {
                if ((y1.C0(this.f1174o) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = A;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = f1173z;
                }
                j6 = j5 - longPressTimeout;
            }
            this.f1174o.removeCallbacks(this.f1178s);
            this.f1174o.postDelayed(this.f1178s, j6);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1181v != null && this.f1182w) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1174o.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1174o.isEnabled() && this.f1181v == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1179t = view.getWidth() / 2;
        this.f1180u = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}

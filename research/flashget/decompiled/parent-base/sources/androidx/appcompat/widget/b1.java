package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.c1;
import androidx.core.view.b2;
import androidx.core.view.x1;

/* compiled from: TooltipCompatHandler.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l, reason: collision with root package name */
    private static final String f1753l = "TooltipCompatHandler";

    /* renamed from: m, reason: collision with root package name */
    private static final long f1754m = 2500;

    /* renamed from: n, reason: collision with root package name */
    private static final long f1755n = 15000;

    /* renamed from: o, reason: collision with root package name */
    private static final long f1756o = 3000;

    /* renamed from: p, reason: collision with root package name */
    private static b1 f1757p;

    /* renamed from: q, reason: collision with root package name */
    private static b1 f1758q;

    /* renamed from: b, reason: collision with root package name */
    private final View f1759b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f1760c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1761d;

    /* renamed from: g, reason: collision with root package name */
    private int f1764g;

    /* renamed from: h, reason: collision with root package name */
    private int f1765h;

    /* renamed from: i, reason: collision with root package name */
    private c1 f1766i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1767j;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f1762e = new Runnable() { // from class: androidx.appcompat.widget.z0
        @Override // java.lang.Runnable
        public final void run() {
            b1.this.i(false);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f1763f = new Runnable() { // from class: androidx.appcompat.widget.a1
        @Override // java.lang.Runnable
        public final void run() {
            b1.this.d();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private boolean f1768k = true;

    private b1(View view, CharSequence charSequence) {
        this.f1759b = view;
        this.f1760c = charSequence;
        this.f1761d = b2.g(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1759b.removeCallbacks(this.f1762e);
    }

    private void c() {
        this.f1768k = true;
    }

    private /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f1759b.postDelayed(this.f1762e, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(b1 b1Var) {
        b1 b1Var2 = f1757p;
        if (b1Var2 != null) {
            b1Var2.b();
        }
        f1757p = b1Var;
        if (b1Var != null) {
            b1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        b1 b1Var = f1757p;
        if (b1Var != null && b1Var.f1759b == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new b1(view, charSequence);
            return;
        }
        b1 b1Var2 = f1758q;
        if (b1Var2 != null && b1Var2.f1759b == view) {
            b1Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        if (!this.f1768k && Math.abs(x4 - this.f1764g) <= this.f1761d && Math.abs(y4 - this.f1765h) <= this.f1761d) {
            return false;
        }
        this.f1764g = x4;
        this.f1765h = y4;
        this.f1768k = false;
        return true;
    }

    void d() {
        if (f1758q == this) {
            f1758q = null;
            c1 c1Var = this.f1766i;
            if (c1Var != null) {
                c1Var.c();
                this.f1766i = null;
                this.f1768k = true;
                this.f1759b.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1757p == this) {
            g(null);
        }
        this.f1759b.removeCallbacks(this.f1763f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(boolean z4) {
        long longPressTimeout;
        long j4;
        long j5;
        if (x1.R0(this.f1759b)) {
            g(null);
            b1 b1Var = f1758q;
            if (b1Var != null) {
                b1Var.d();
            }
            f1758q = this;
            this.f1767j = z4;
            c1 c1Var = new c1(this.f1759b.getContext());
            this.f1766i = c1Var;
            c1Var.e(this.f1759b, this.f1764g, this.f1765h, this.f1767j, this.f1760c);
            this.f1759b.addOnAttachStateChangeListener(this);
            if (this.f1767j) {
                j5 = f1754m;
            } else {
                if ((this.f1759b.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = f1756o;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j5 = j4 - longPressTimeout;
            }
            this.f1759b.removeCallbacks(this.f1763f);
            this.f1759b.postDelayed(this.f1763f, j5);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1766i != null && this.f1767j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1759b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f1768k = true;
                d();
            }
        } else if (this.f1759b.isEnabled() && this.f1766i == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1764g = view.getWidth() / 2;
        this.f1765h = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}

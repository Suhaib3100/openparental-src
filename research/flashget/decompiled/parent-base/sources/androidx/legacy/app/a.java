package androidx.legacy.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.g1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.core.view.f0;
import androidx.core.view.x1;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;

/* compiled from: ActionBarDrawerToggle.java */
@Deprecated
/* loaded from: classes3.dex */
public class a implements DrawerLayout.e {

    /* renamed from: m, reason: collision with root package name */
    private static final String f30125m = "ActionBarDrawerToggle";

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f30126n = {R.attr.homeAsUpIndicator};

    /* renamed from: o, reason: collision with root package name */
    private static final float f30127o = 0.33333334f;

    /* renamed from: p, reason: collision with root package name */
    private static final int f30128p = 16908332;

    /* renamed from: a, reason: collision with root package name */
    final Activity f30129a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0484a f30130b;

    /* renamed from: c, reason: collision with root package name */
    private final DrawerLayout f30131c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30132d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30133e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f30134f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f30135g;

    /* renamed from: h, reason: collision with root package name */
    private d f30136h;

    /* renamed from: i, reason: collision with root package name */
    private final int f30137i;

    /* renamed from: j, reason: collision with root package name */
    private final int f30138j;

    /* renamed from: k, reason: collision with root package name */
    private final int f30139k;

    /* renamed from: l, reason: collision with root package name */
    private c f30140l;

    /* compiled from: ActionBarDrawerToggle.java */
    @Deprecated
    /* renamed from: androidx.legacy.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0484a {
        void a(Drawable drawable, @g1 int i4);

        @q0
        Drawable b();

        void c(@g1 int i4);
    }

    /* compiled from: ActionBarDrawerToggle.java */
    @Deprecated
    public interface b {
        @q0
        InterfaceC0484a getDrawerToggleDelegate();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        Method f30141a;

        /* renamed from: b, reason: collision with root package name */
        Method f30142b;

        /* renamed from: c, reason: collision with root package name */
        ImageView f30143c;

        c(Activity activity) {
            try {
                this.f30141a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f30142b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f30143c = (ImageView) childAt;
                }
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    private class d extends InsetDrawable implements Drawable.Callback {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f30144b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f30145c;

        /* renamed from: d, reason: collision with root package name */
        private float f30146d;

        /* renamed from: e, reason: collision with root package name */
        private float f30147e;

        d(Drawable drawable) {
            super(drawable, 0);
            this.f30144b = true;
            this.f30145c = new Rect();
        }

        public float a() {
            return this.f30146d;
        }

        public void b(float f4) {
            this.f30147e = f4;
            invalidateSelf();
        }

        public void c(float f4) {
            this.f30146d = f4;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@o0 Canvas canvas) {
            copyBounds(this.f30145c);
            canvas.save();
            boolean z4 = x1.c0(a.this.f30129a.getWindow().getDecorView()) == 1;
            int i4 = z4 ? -1 : 1;
            float width = this.f30145c.width();
            canvas.translate((-this.f30147e) * width * this.f30146d * i4, 0.0f);
            if (z4 && !this.f30144b) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, @v int i4, @g1 int i5, @g1 int i6) {
        this(activity, drawerLayout, !e(activity), i4, i5, i6);
    }

    private static boolean e(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    private Drawable f() {
        InterfaceC0484a interfaceC0484a = this.f30130b;
        if (interfaceC0484a != null) {
            return interfaceC0484a.b();
        }
        ActionBar actionBar = this.f30129a.getActionBar();
        TypedArray obtainStyledAttributes = (actionBar != null ? actionBar.getThemedContext() : this.f30129a).obtainStyledAttributes(null, f30126n, R.attr.actionBarStyle, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    private void j(int i4) {
        InterfaceC0484a interfaceC0484a = this.f30130b;
        if (interfaceC0484a != null) {
            interfaceC0484a.c(i4);
            return;
        }
        ActionBar actionBar = this.f30129a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i4);
        }
    }

    private void k(Drawable drawable, int i4) {
        InterfaceC0484a interfaceC0484a = this.f30130b;
        if (interfaceC0484a != null) {
            interfaceC0484a.a(drawable, i4);
            return;
        }
        ActionBar actionBar = this.f30129a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i4);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        this.f30136h.c(1.0f);
        if (this.f30132d) {
            j(this.f30139k);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        this.f30136h.c(0.0f);
        if (this.f30132d) {
            j(this.f30138j);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i4) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f4) {
        float a5 = this.f30136h.a();
        this.f30136h.c(f4 > 0.5f ? Math.max(a5, Math.max(0.0f, f4 - 0.5f) * 2.0f) : Math.min(a5, f4 * 2.0f));
    }

    public boolean g() {
        return this.f30132d;
    }

    public void h(Configuration configuration) {
        if (!this.f30133e) {
            this.f30134f = f();
        }
        this.f30135g = androidx.core.content.d.getDrawable(this.f30129a, this.f30137i);
        o();
    }

    public boolean i(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f30132d) {
            return false;
        }
        if (this.f30131c.H(f0.f27129b)) {
            this.f30131c.d(f0.f27129b);
            return true;
        }
        this.f30131c.M(f0.f27129b);
        return true;
    }

    public void l(boolean z4) {
        if (z4 != this.f30132d) {
            if (z4) {
                k(this.f30136h, this.f30131c.E(f0.f27129b) ? this.f30139k : this.f30138j);
            } else {
                k(this.f30134f, 0);
            }
            this.f30132d = z4;
        }
    }

    public void m(int i4) {
        n(i4 != 0 ? androidx.core.content.d.getDrawable(this.f30129a, i4) : null);
    }

    public void n(Drawable drawable) {
        if (drawable == null) {
            this.f30134f = f();
            this.f30133e = false;
        } else {
            this.f30134f = drawable;
            this.f30133e = true;
        }
        if (this.f30132d) {
            return;
        }
        k(this.f30134f, 0);
    }

    public void o() {
        if (this.f30131c.E(f0.f27129b)) {
            this.f30136h.c(1.0f);
        } else {
            this.f30136h.c(0.0f);
        }
        if (this.f30132d) {
            k(this.f30136h, this.f30131c.E(f0.f27129b) ? this.f30139k : this.f30138j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, DrawerLayout drawerLayout, boolean z4, @v int i4, @g1 int i5, @g1 int i6) {
        this.f30132d = true;
        this.f30129a = activity;
        if (activity instanceof b) {
            this.f30130b = ((b) activity).getDrawerToggleDelegate();
        } else {
            this.f30130b = null;
        }
        this.f30131c = drawerLayout;
        this.f30137i = i4;
        this.f30138j = i5;
        this.f30139k = i6;
        this.f30134f = f();
        this.f30135g = androidx.core.content.d.getDrawable(activity, i4);
        d dVar = new d(this.f30135g);
        this.f30136h = dVar;
        dVar.b(z4 ? f30127o : 0.0f);
    }
}

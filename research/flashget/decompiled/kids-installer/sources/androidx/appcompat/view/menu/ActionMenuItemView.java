package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.h0;
import d.a;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class ActionMenuItemView extends AppCompatTextView implements o.a, View.OnClickListener, ActionMenuView.a {
    private static final String E = "ActionMenuItemView";
    private static final int F = 32;
    private boolean A;
    private int B;
    private int C;
    private int D;

    /* renamed from: t, reason: collision with root package name */
    j f603t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f604u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f605v;

    /* renamed from: w, reason: collision with root package name */
    g.b f606w;

    /* renamed from: x, reason: collision with root package name */
    private h0 f607x;

    /* renamed from: y, reason: collision with root package name */
    b f608y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f609z;

    /* loaded from: classes2.dex */
    private class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.h0
        public q b() {
            b bVar = ActionMenuItemView.this.f608y;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.h0
        protected boolean c() {
            q b6;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f606w;
            return bVar != null && bVar.a(actionMenuItemView.f603t) && (b6 = b()) != null && b6.c();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract q a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean y() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        return i5 >= 480 || (i5 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void z() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f604u);
        if (this.f605v != null && (!this.f603t.E() || (!this.f609z && !this.A))) {
            z5 = false;
        }
        boolean z7 = z6 & z5;
        setText(z7 ? this.f604u : null);
        CharSequence contentDescription = this.f603t.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z7 ? null : this.f603t.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f603t.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            androidx.appcompat.widget.c1.a(this, z7 ? null : this.f603t.getTitle());
        } else {
            androidx.appcompat.widget.c1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return u();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void c(boolean z5, char c6) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j d() {
        return this.f603t;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean f() {
        return u() && this.f603t.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean g() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean k() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void l(j jVar, int i5) {
        this.f603t = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.l(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f607x == null) {
            this.f607x = new a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f606w;
        if (bVar != null) {
            bVar.a(this.f603t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f609z = y();
        z();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        boolean u5 = u();
        if (u5 && (i7 = this.C) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.B) : this.B;
        if (mode != 1073741824 && this.B > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), i6);
        }
        if (u5 || this.f605v == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f605v.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (this.f603t.hasSubMenu() && (h0Var = this.f607x) != null && h0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z5) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z5) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        this.f605v = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i5 = this.D;
            if (intrinsicWidth > i5) {
                intrinsicHeight = (int) (intrinsicHeight * (i5 / intrinsicWidth));
                intrinsicWidth = i5;
            }
            if (intrinsicHeight > i5) {
                intrinsicWidth = (int) (intrinsicWidth * (i5 / intrinsicHeight));
            } else {
                i5 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i5);
        }
        setCompoundDrawables(drawable, null, null, null);
        z();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i5, int i6, int i7, int i8) {
        this.C = i5;
        super.setPadding(i5, i6, i7, i8);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.f604u = charSequence;
        z();
    }

    public boolean u() {
        return !TextUtils.isEmpty(getText());
    }

    public void v(boolean z5) {
        if (this.A != z5) {
            this.A = z5;
            j jVar = this.f603t;
            if (jVar != null) {
                jVar.e();
            }
        }
    }

    public void w(g.b bVar) {
        this.f606w = bVar;
    }

    public void x(b bVar) {
        this.f608y = bVar;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        Resources resources = context.getResources();
        this.f609z = y();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.G, i5, 0);
        this.B = obtainStyledAttributes.getDimensionPixelSize(a.n.H, 0);
        obtainStyledAttributes.recycle();
        this.D = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.C = -1;
        setSaveEnabled(false);
    }
}

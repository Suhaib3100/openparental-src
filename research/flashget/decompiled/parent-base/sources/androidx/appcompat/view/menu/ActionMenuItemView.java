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
import android.widget.Button;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.y0;
import d.a;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements p.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: m, reason: collision with root package name */
    private static final String f1126m = "ActionMenuItemView";

    /* renamed from: n, reason: collision with root package name */
    private static final int f1127n = 32;

    /* renamed from: b, reason: collision with root package name */
    k f1128b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f1129c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f1130d;

    /* renamed from: e, reason: collision with root package name */
    h.b f1131e;

    /* renamed from: f, reason: collision with root package name */
    private e0 f1132f;

    /* renamed from: g, reason: collision with root package name */
    b f1133g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1134h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1135i;

    /* renamed from: j, reason: collision with root package name */
    private int f1136j;

    /* renamed from: k, reason: collision with root package name */
    private int f1137k;

    /* renamed from: l, reason: collision with root package name */
    private int f1138l;

    private class a extends e0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.e0
        public r b() {
            b bVar = ActionMenuItemView.this.f1133g;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.e0
        protected boolean c() {
            r b5;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            h.b bVar = actionMenuItemView.f1131e;
            return bVar != null && bVar.f(actionMenuItemView.f1128b) && (b5 = b()) != null && b5.c();
        }
    }

    public static abstract class b {
        public abstract r a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean l() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        return i4 >= 480 || (i4 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void m() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f1129c);
        if (this.f1130d != null && (!this.f1128b.E() || (!this.f1134h && !this.f1135i))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f1129c : null);
        CharSequence contentDescription = this.f1128b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z6 ? null : this.f1128b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1128b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            y0.a(this, z6 ? null : this.f1128b.getTitle());
        } else {
            y0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return d();
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void b(boolean z4, char c5) {
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return d() && this.f1128b.getIcon() == null;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void e(k kVar, int i4) {
        this.f1128b = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.l(this));
        setId(kVar.getItemId());
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1132f == null) {
            this.f1132f = new a();
        }
    }

    public void f(boolean z4) {
        if (this.f1135i != z4) {
            this.f1135i = z4;
            k kVar = this.f1128b;
            if (kVar != null) {
                kVar.e();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public k g() {
        return this.f1128b;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean h() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean i() {
        return true;
    }

    public void j(h.b bVar) {
        this.f1131e = bVar;
    }

    public void k(b bVar) {
        this.f1133g = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h.b bVar = this.f1131e;
        if (bVar != null) {
            bVar.f(this.f1128b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1134h = l();
        m();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        boolean d5 = d();
        if (d5 && (i6 = this.f1137k) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1136j) : this.f1136j;
        if (mode != 1073741824 && this.f1136j > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (d5 || this.f1130d == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1130d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        if (this.f1128b.hasSubMenu() && (e0Var = this.f1132f) != null && e0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setCheckable(boolean z4) {
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setChecked(boolean z4) {
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setIcon(Drawable drawable) {
        this.f1130d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f1138l;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        m();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        this.f1137k = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setTitle(CharSequence charSequence) {
        this.f1129c = charSequence;
        m();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Resources resources = context.getResources();
        this.f1134h = l();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.G, i4, 0);
        this.f1136j = obtainStyledAttributes.getDimensionPixelSize(a.m.H, 0);
        obtainStyledAttributes.recycle();
        this.f1138l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1137k = -1;
        setSaveEnabled(false);
    }
}

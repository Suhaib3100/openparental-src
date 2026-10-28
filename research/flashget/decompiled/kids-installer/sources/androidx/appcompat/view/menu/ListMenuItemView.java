package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.z0;
import androidx.core.view.y1;
import d.a;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {
    private static final String F = "ListMenuItemView";
    private boolean A;
    private Drawable B;
    private boolean C;
    private LayoutInflater D;
    private boolean E;

    /* renamed from: o, reason: collision with root package name */
    private j f614o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f615p;

    /* renamed from: q, reason: collision with root package name */
    private RadioButton f616q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f617r;

    /* renamed from: s, reason: collision with root package name */
    private CheckBox f618s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f619t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f620u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f621v;

    /* renamed from: w, reason: collision with root package name */
    private LinearLayout f622w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f623x;

    /* renamed from: y, reason: collision with root package name */
    private int f624y;

    /* renamed from: z, reason: collision with root package name */
    private Context f625z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f21562f2);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i5) {
        LinearLayout linearLayout = this.f622w;
        if (linearLayout != null) {
            linearLayout.addView(view, i5);
        } else {
            addView(view, i5);
        }
    }

    private LayoutInflater e() {
        if (this.D == null) {
            this.D = LayoutInflater.from(getContext());
        }
        return this.D;
    }

    private void f() {
        CheckBox checkBox = (CheckBox) e().inflate(a.k.f21958o, (ViewGroup) this, false);
        this.f618s = checkBox;
        b(checkBox, -1);
    }

    private void h() {
        ImageView imageView = (ImageView) e().inflate(a.k.f21959p, (ViewGroup) this, false);
        this.f615p = imageView;
        b(imageView, 0);
    }

    private void i() {
        RadioButton radioButton = (RadioButton) e().inflate(a.k.f21961r, (ViewGroup) this, false);
        this.f616q = radioButton;
        b(radioButton, -1);
    }

    private void n(boolean z5) {
        ImageView imageView = this.f620u;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f621v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f621v.getLayoutParams();
        rect.top = this.f621v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void c(boolean z5, char c6) {
        int i5 = (z5 && this.f614o.D()) ? 0 : 8;
        if (i5 == 0) {
            this.f619t.setText(this.f614o.k());
        }
        if (this.f619t.getVisibility() != i5) {
            this.f619t.setVisibility(i5);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j d() {
        return this.f614o;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean g() {
        return false;
    }

    public void j(boolean z5) {
        this.E = z5;
        this.A = z5;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean k() {
        return this.E;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void l(j jVar, int i5) {
        this.f614o = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.l(this));
        setCheckable(jVar.isCheckable());
        c(jVar.D(), jVar.j());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        n(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    public void m(boolean z5) {
        ImageView imageView = this.f621v;
        if (imageView != null) {
            imageView.setVisibility((this.C || !z5) ? 8 : 0);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        y1.I1(this, this.f623x);
        TextView textView = (TextView) findViewById(a.h.L1);
        this.f617r = textView;
        int i5 = this.f624y;
        if (i5 != -1) {
            textView.setTextAppearance(this.f625z, i5);
        }
        this.f619t = (TextView) findViewById(a.h.f21883j1);
        ImageView imageView = (ImageView) findViewById(a.h.f21904q1);
        this.f620u = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.B);
        }
        this.f621v = (ImageView) findViewById(a.h.f21915u0);
        this.f622w = (LinearLayout) findViewById(a.h.f21879i0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        if (this.f615p != null && this.A) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f615p.getLayoutParams();
            int i7 = layoutParams.height;
            if (i7 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i7;
            }
        }
        super.onMeasure(i5, i6);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f616q == null && this.f618s == null) {
            return;
        }
        if (this.f614o.p()) {
            if (this.f616q == null) {
                i();
            }
            compoundButton = this.f616q;
            view = this.f618s;
        } else {
            if (this.f618s == null) {
                f();
            }
            compoundButton = this.f618s;
            view = this.f616q;
        }
        if (z5) {
            compoundButton.setChecked(this.f614o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f618s;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f616q;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if (this.f614o.p()) {
            if (this.f616q == null) {
                i();
            }
            compoundButton = this.f616q;
        } else {
            if (this.f618s == null) {
                f();
            }
            compoundButton = this.f618s;
        }
        compoundButton.setChecked(z5);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        boolean z5 = this.f614o.C() || this.E;
        if (z5 || this.A) {
            ImageView imageView = this.f615p;
            if (imageView == null && drawable == null && !this.A) {
                return;
            }
            if (imageView == null) {
                h();
            }
            if (drawable == null && !this.A) {
                this.f615p.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f615p;
            if (!z5) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f615p.getVisibility() != 0) {
                this.f615p.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f617r.getVisibility() != 8) {
                this.f617r.setVisibility(8);
            }
        } else {
            this.f617r.setText(charSequence);
            if (this.f617r.getVisibility() != 0) {
                this.f617r.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet);
        z0 G = z0.G(getContext(), attributeSet, a.n.M5, i5, 0);
        this.f623x = G.h(a.n.S5);
        this.f624y = G.u(a.n.O5, -1);
        this.A = G.a(a.n.U5, false);
        this.f625z = context;
        this.B = G.h(a.n.V5);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.c.f21609n1, 0);
        this.C = obtainStyledAttributes.hasValue(0);
        G.I();
        obtainStyledAttributes.recycle();
    }
}

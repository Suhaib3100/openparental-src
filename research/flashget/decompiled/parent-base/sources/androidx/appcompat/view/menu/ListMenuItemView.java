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
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.t0;
import androidx.core.view.x1;
import d.a;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements p.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: s, reason: collision with root package name */
    private static final String f1143s = "ListMenuItemView";

    /* renamed from: b, reason: collision with root package name */
    private k f1144b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f1145c;

    /* renamed from: d, reason: collision with root package name */
    private RadioButton f1146d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f1147e;

    /* renamed from: f, reason: collision with root package name */
    private CheckBox f1148f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f1149g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f1150h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f1151i;

    /* renamed from: j, reason: collision with root package name */
    private LinearLayout f1152j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f1153k;

    /* renamed from: l, reason: collision with root package name */
    private int f1154l;

    /* renamed from: m, reason: collision with root package name */
    private Context f1155m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1156n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f1157o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1158p;

    /* renamed from: q, reason: collision with root package name */
    private LayoutInflater f1159q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1160r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.Y1);
    }

    private void a(View view) {
        c(view, -1);
    }

    private void c(View view, int i4) {
        LinearLayout linearLayout = this.f1152j;
        if (linearLayout != null) {
            linearLayout.addView(view, i4);
        } else {
            addView(view, i4);
        }
    }

    private LayoutInflater d() {
        if (this.f1159q == null) {
            this.f1159q = LayoutInflater.from(getContext());
        }
        return this.f1159q;
    }

    private void f() {
        CheckBox checkBox = (CheckBox) d().inflate(a.j.f73313o, (ViewGroup) this, false);
        this.f1148f = checkBox;
        c(checkBox, -1);
    }

    private void j() {
        ImageView imageView = (ImageView) d().inflate(a.j.f73314p, (ViewGroup) this, false);
        this.f1145c = imageView;
        c(imageView, 0);
    }

    private void k() {
        RadioButton radioButton = (RadioButton) d().inflate(a.j.f73316r, (ViewGroup) this, false);
        this.f1146d = radioButton;
        c(radioButton, -1);
    }

    private void n(boolean z4) {
        ImageView imageView = this.f1150h;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1151i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1151i.getLayoutParams();
        rect.top = this.f1151i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void b(boolean z4, char c5) {
        int i4 = (z4 && this.f1144b.D()) ? 0 : 8;
        if (i4 == 0) {
            this.f1149g.setText(this.f1144b.k());
        }
        if (this.f1149g.getVisibility() != i4) {
            this.f1149g.setVisibility(i4);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void e(k kVar, int i4) {
        this.f1144b = kVar;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.l(this));
        setCheckable(kVar.isCheckable());
        b(kVar.D(), kVar.j());
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        n(kVar.hasSubMenu());
        setContentDescription(kVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.p.a
    public k g() {
        return this.f1144b;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean i() {
        return this.f1160r;
    }

    public void l(boolean z4) {
        this.f1160r = z4;
        this.f1156n = z4;
    }

    public void m(boolean z4) {
        ImageView imageView = this.f1151i;
        if (imageView != null) {
            imageView.setVisibility((this.f1158p || !z4) ? 8 : 0);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        x1.P1(this, this.f1153k);
        TextView textView = (TextView) findViewById(a.g.f73273s0);
        this.f1147e = textView;
        int i4 = this.f1154l;
        if (i4 != -1) {
            textView.setTextAppearance(this.f1155m, i4);
        }
        this.f1149g = (TextView) findViewById(a.g.f73251h0);
        ImageView imageView = (ImageView) findViewById(a.g.f73263n0);
        this.f1150h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1157o);
        }
        this.f1151i = (ImageView) findViewById(a.g.C);
        this.f1152j = (LinearLayout) findViewById(a.g.f73274t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f1145c != null && this.f1156n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1145c.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f1146d == null && this.f1148f == null) {
            return;
        }
        if (this.f1144b.p()) {
            if (this.f1146d == null) {
                k();
            }
            compoundButton = this.f1146d;
            view = this.f1148f;
        } else {
            if (this.f1148f == null) {
                f();
            }
            compoundButton = this.f1148f;
            view = this.f1146d;
        }
        if (z4) {
            compoundButton.setChecked(this.f1144b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1148f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1146d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if (this.f1144b.p()) {
            if (this.f1146d == null) {
                k();
            }
            compoundButton = this.f1146d;
        } else {
            if (this.f1148f == null) {
                f();
            }
            compoundButton = this.f1148f;
        }
        compoundButton.setChecked(z4);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setIcon(Drawable drawable) {
        boolean z4 = this.f1144b.f1275y.D() || this.f1160r;
        if (z4 || this.f1156n) {
            ImageView imageView = this.f1145c;
            if (imageView == null && drawable == null && !this.f1156n) {
                return;
            }
            if (imageView == null) {
                j();
            }
            if (drawable == null && !this.f1156n) {
                this.f1145c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1145c;
            if (!z4) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1145c.getVisibility() != 0) {
                this.f1145c.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1147e.getVisibility() != 8) {
                this.f1147e.setVisibility(8);
            }
        } else {
            this.f1147e.setText(charSequence);
            if (this.f1147e.getVisibility() != 0) {
                this.f1147e.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        t0 G = t0.G(getContext(), attributeSet, a.m.I4, i4, 0);
        this.f1153k = G.h(a.m.O4);
        this.f1154l = G.u(a.m.K4, -1);
        this.f1156n = G.a(a.m.Q4, false);
        this.f1155m = context;
        this.f1157o = G.h(a.m.R4);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.b.f73025p1, 0);
        this.f1158p = obtainStyledAttributes.hasValue(0);
        G.I();
        obtainStyledAttributes.recycle();
    }
}

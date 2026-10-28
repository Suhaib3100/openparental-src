package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.i;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.f;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: o, reason: collision with root package name */
    protected int[] f2698o;

    /* renamed from: p, reason: collision with root package name */
    protected int f2699p;

    /* renamed from: q, reason: collision with root package name */
    protected Context f2700q;

    /* renamed from: r, reason: collision with root package name */
    protected i f2701r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f2702s;

    /* renamed from: t, reason: collision with root package name */
    protected String f2703t;

    /* renamed from: u, reason: collision with root package name */
    protected String f2704u;

    /* renamed from: v, reason: collision with root package name */
    private View[] f2705v;

    /* renamed from: w, reason: collision with root package name */
    private HashMap<Integer, String> f2706w;

    public ConstraintHelper(Context context) {
        super(context);
        this.f2698o = new int[32];
        this.f2702s = false;
        this.f2705v = null;
        this.f2706w = new HashMap<>();
        this.f2700q = context;
        r(null);
    }

    private void g(String str) {
        if (str == null || str.length() == 0 || this.f2700q == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int o5 = o(trim);
        if (o5 != 0) {
            this.f2706w.put(Integer.valueOf(o5), trim);
            h(o5);
        }
    }

    private void h(int i5) {
        if (i5 == getId()) {
            return;
        }
        int i6 = this.f2699p + 1;
        int[] iArr = this.f2698o;
        if (i6 > iArr.length) {
            this.f2698o = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2698o;
        int i7 = this.f2699p;
        iArr2[i7] = i5;
        this.f2699p = i7 + 1;
    }

    private void i(String str) {
        if (str == null || str.length() == 0 || this.f2700q == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).V) && childAt.getId() != -1) {
                h(childAt.getId());
            }
        }
    }

    private int[] m(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        for (String str2 : split) {
            int o5 = o(str2.trim());
            if (o5 != 0) {
                iArr[i5] = o5;
                i5++;
            }
        }
        return i5 != split.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    private int n(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f2700q.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int o(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i5 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m5 = constraintLayout.m(0, str);
            if (m5 instanceof Integer) {
                i5 = ((Integer) m5).intValue();
            }
        }
        if (i5 == 0 && constraintLayout != null) {
            i5 = n(constraintLayout, str);
        }
        if (i5 == 0) {
            try {
                i5 = f.g.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i5 == 0 ? this.f2700q.getResources().getIdentifier(str, "id", this.f2700q.getPackageName()) : i5;
    }

    public void A(ConstraintLayout constraintLayout) {
    }

    public void B(ConstraintLayout constraintLayout) {
    }

    public void C(androidx.constraintlayout.solver.widgets.f fVar, i iVar, SparseArray<androidx.constraintlayout.solver.widgets.e> sparseArray) {
        iVar.b();
        for (int i5 = 0; i5 < this.f2699p; i5++) {
            iVar.a(sparseArray.get(this.f2698o[i5]));
        }
    }

    public void D(ConstraintLayout constraintLayout) {
        String str;
        int n5;
        if (isInEditMode()) {
            v(this.f2703t);
        }
        i iVar = this.f2701r;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i5 = 0; i5 < this.f2699p; i5++) {
            int i6 = this.f2698o[i5];
            View u5 = constraintLayout.u(i6);
            if (u5 == null && (n5 = n(constraintLayout, (str = this.f2706w.get(Integer.valueOf(i6))))) != 0) {
                this.f2698o[i5] = n5;
                this.f2706w.put(Integer.valueOf(n5), str);
                u5 = constraintLayout.u(n5);
            }
            if (u5 != null) {
                this.f2701r.a(constraintLayout.A(u5));
            }
        }
        this.f2701r.c(constraintLayout.f2709q);
    }

    public void E() {
        if (this.f2701r == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2757n0 = (androidx.constraintlayout.solver.widgets.e) this.f2701r;
        }
    }

    public void j(View view) {
        if (view == this || view.getId() == -1 || view.getParent() == null) {
            return;
        }
        this.f2703t = null;
        h(view.getId());
        requestLayout();
    }

    protected void k() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        l((ConstraintLayout) parent);
    }

    protected void l(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i5 = 0; i5 < this.f2699p; i5++) {
            View u5 = constraintLayout.u(this.f2698o[i5]);
            if (u5 != null) {
                u5.setVisibility(visibility);
                if (elevation > 0.0f) {
                    u5.setTranslationZ(u5.getTranslationZ() + elevation);
                }
            }
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2703t;
        if (str != null) {
            v(str);
        }
        String str2 = this.f2704u;
        if (str2 != null) {
            w(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        if (this.f2702s) {
            super.onMeasure(i5, i6);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public int[] p() {
        return Arrays.copyOf(this.f2698o, this.f2699p);
    }

    protected View[] q(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2705v;
        if (viewArr == null || viewArr.length != this.f2699p) {
            this.f2705v = new View[this.f2699p];
        }
        for (int i5 = 0; i5 < this.f2699p; i5++) {
            this.f2705v[i5] = constraintLayout.u(this.f2698o[i5]);
        }
        return this.f2705v;
    }

    protected void r(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.W5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.q6) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2703t = string;
                    v(string);
                } else if (index == f.m.r6) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2704u = string2;
                    w(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void s(d.a aVar, j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<androidx.constraintlayout.solver.widgets.e> sparseArray) {
        d.b bVar = aVar.f2926d;
        int[] iArr = bVar.f2965e0;
        if (iArr != null) {
            x(iArr);
        } else {
            String str = bVar.f2967f0;
            if (str != null && str.length() > 0) {
                d.b bVar2 = aVar.f2926d;
                bVar2.f2965e0 = m(this, bVar2.f2967f0);
            }
        }
        jVar.b();
        if (aVar.f2926d.f2965e0 == null) {
            return;
        }
        int i5 = 0;
        while (true) {
            int[] iArr2 = aVar.f2926d.f2965e0;
            if (i5 >= iArr2.length) {
                return;
            }
            androidx.constraintlayout.solver.widgets.e eVar = sparseArray.get(iArr2[i5]);
            if (eVar != null) {
                jVar.a(eVar);
            }
            i5++;
        }
    }

    @Override // android.view.View
    public void setTag(int i5, Object obj) {
        super.setTag(i5, obj);
        if (obj == null && this.f2703t == null) {
            h(i5);
        }
    }

    public void t(View view) {
        int i5;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.f2703t = null;
        int i6 = 0;
        while (true) {
            if (i6 >= this.f2699p) {
                break;
            }
            if (this.f2698o[i6] == id) {
                while (true) {
                    i5 = this.f2699p;
                    if (i6 >= i5 - 1) {
                        break;
                    }
                    int[] iArr = this.f2698o;
                    int i7 = i6 + 1;
                    iArr[i6] = iArr[i7];
                    i6 = i7;
                }
                this.f2698o[i5 - 1] = 0;
                this.f2699p = i5 - 1;
            } else {
                i6++;
            }
        }
        requestLayout();
    }

    public void u(androidx.constraintlayout.solver.widgets.e eVar, boolean z5) {
    }

    protected void v(String str) {
        this.f2703t = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f2699p = 0;
        while (true) {
            int indexOf = str.indexOf(44, i5);
            if (indexOf == -1) {
                g(str.substring(i5));
                return;
            } else {
                g(str.substring(i5, indexOf));
                i5 = indexOf + 1;
            }
        }
    }

    protected void w(String str) {
        this.f2704u = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f2699p = 0;
        while (true) {
            int indexOf = str.indexOf(44, i5);
            if (indexOf == -1) {
                i(str.substring(i5));
                return;
            } else {
                i(str.substring(i5, indexOf));
                i5 = indexOf + 1;
            }
        }
    }

    public void x(int[] iArr) {
        this.f2703t = null;
        this.f2699p = 0;
        for (int i5 : iArr) {
            h(i5);
        }
    }

    public void y(ConstraintLayout constraintLayout) {
    }

    public void z(ConstraintLayout constraintLayout) {
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2698o = new int[32];
        this.f2702s = false;
        this.f2705v = null;
        this.f2706w = new HashMap<>();
        this.f2700q = context;
        r(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f2698o = new int[32];
        this.f2702s = false;
        this.f2705v = null;
        this.f2706w = new HashMap<>();
        this.f2700q = context;
        r(attributeSet);
    }
}

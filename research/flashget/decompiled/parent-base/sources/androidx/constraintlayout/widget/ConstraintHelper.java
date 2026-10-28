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
import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: b, reason: collision with root package name */
    protected int[] f23780b;

    /* renamed from: c, reason: collision with root package name */
    protected int f23781c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f23782d;

    /* renamed from: e, reason: collision with root package name */
    protected androidx.constraintlayout.core.widgets.i f23783e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f23784f;

    /* renamed from: g, reason: collision with root package name */
    protected String f23785g;

    /* renamed from: h, reason: collision with root package name */
    protected String f23786h;

    /* renamed from: i, reason: collision with root package name */
    private View[] f23787i;

    /* renamed from: j, reason: collision with root package name */
    protected HashMap<Integer, String> f23788j;

    public ConstraintHelper(Context context) {
        super(context);
        this.f23780b = new int[32];
        this.f23784f = false;
        this.f23787i = null;
        this.f23788j = new HashMap<>();
        this.f23782d = context;
        B(null);
    }

    private void n(String idString) {
        if (idString == null || idString.length() == 0 || this.f23782d == null) {
            return;
        }
        String trim = idString.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int x4 = x(trim);
        if (x4 != 0) {
            this.f23788j.put(Integer.valueOf(x4), trim);
            o(x4);
        }
    }

    private void o(int id2) {
        if (id2 == getId()) {
            return;
        }
        int i4 = this.f23781c + 1;
        int[] iArr = this.f23780b;
        if (i4 > iArr.length) {
            this.f23780b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f23780b;
        int i5 = this.f23781c;
        iArr2[i5] = id2;
        this.f23781c = i5 + 1;
    }

    private void p(String tagString) {
        if (tagString == null || tagString.length() == 0 || this.f23782d == null) {
            return;
        }
        String trim = tagString.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).R2) && childAt.getId() != -1) {
                o(childAt.getId());
            }
        }
    }

    private int[] v(View view, String referenceIdString) {
        String[] split = referenceIdString.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        for (String str : split) {
            int x4 = x(str.trim());
            if (x4 != 0) {
                iArr[i4] = x4;
                i4++;
            }
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    private int w(ConstraintLayout container, String idString) {
        Resources resources;
        String str;
        if (idString == null || container == null || (resources = this.f23782d.getResources()) == null) {
            return 0;
        }
        int childCount = container.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = container.getChildAt(i4);
            if (childAt.getId() != -1) {
                try {
                    str = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str = null;
                }
                if (idString.equals(str)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int x(String referenceId) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i4 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object l4 = constraintLayout.l(0, referenceId);
            if (l4 instanceof Integer) {
                i4 = ((Integer) l4).intValue();
            }
        }
        if (i4 == 0 && constraintLayout != null) {
            i4 = w(constraintLayout, referenceId);
        }
        if (i4 == 0) {
            try {
                i4 = g.C0399g.class.getField(referenceId).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i4 == 0 ? this.f23782d.getResources().getIdentifier(referenceId, "id", this.f23782d.getPackageName()) : i4;
    }

    public int A(final int id2) {
        int i4 = -1;
        for (int i5 : this.f23780b) {
            i4++;
            if (i5 == id2) {
                return i4;
            }
        }
        return i4;
    }

    protected void B(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.h7) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f23785g = string;
                    F(string);
                } else if (index == g.m.i7) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f23786h = string2;
                    G(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void C(d.a constraint, j child, ConstraintLayout.LayoutParams layoutParams, SparseArray<androidx.constraintlayout.core.widgets.e> mapIdToWidget) {
        d.b bVar = constraint.f24048e;
        int[] iArr = bVar.f24124k0;
        if (iArr != null) {
            H(iArr);
        } else {
            String str = bVar.f24126l0;
            if (str != null) {
                if (str.length() > 0) {
                    d.b bVar2 = constraint.f24048e;
                    bVar2.f24124k0 = v(this, bVar2.f24126l0);
                } else {
                    constraint.f24048e.f24124k0 = null;
                }
            }
        }
        if (child == null) {
            return;
        }
        child.b();
        if (constraint.f24048e.f24124k0 == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            int[] iArr2 = constraint.f24048e.f24124k0;
            if (i4 >= iArr2.length) {
                return;
            }
            androidx.constraintlayout.core.widgets.e eVar = mapIdToWidget.get(iArr2[i4]);
            if (eVar != null) {
                child.a(eVar);
            }
            i4++;
        }
    }

    public int D(View view) {
        int i4;
        int id2 = view.getId();
        int i5 = -1;
        if (id2 == -1) {
            return -1;
        }
        this.f23785g = null;
        int i6 = 0;
        while (true) {
            if (i6 >= this.f23781c) {
                break;
            }
            if (this.f23780b[i6] == id2) {
                int i7 = i6;
                while (true) {
                    i4 = this.f23781c;
                    if (i7 >= i4 - 1) {
                        break;
                    }
                    int[] iArr = this.f23780b;
                    int i10 = i7 + 1;
                    iArr[i7] = iArr[i10];
                    i7 = i10;
                }
                this.f23780b[i4 - 1] = 0;
                this.f23781c = i4 - 1;
                i5 = i6;
            } else {
                i6++;
            }
        }
        requestLayout();
        return i5;
    }

    public void E(androidx.constraintlayout.core.widgets.e widget, boolean isRtl) {
    }

    protected void F(String idList) {
        this.f23785g = idList;
        if (idList == null) {
            return;
        }
        int i4 = 0;
        this.f23781c = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i4);
            if (indexOf == -1) {
                n(idList.substring(i4));
                return;
            } else {
                n(idList.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    protected void G(String tagList) {
        this.f23786h = tagList;
        if (tagList == null) {
            return;
        }
        int i4 = 0;
        this.f23781c = 0;
        while (true) {
            int indexOf = tagList.indexOf(44, i4);
            if (indexOf == -1) {
                p(tagList.substring(i4));
                return;
            } else {
                p(tagList.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    public void H(int[] ids) {
        this.f23785g = null;
        this.f23781c = 0;
        for (int i4 : ids) {
            o(i4);
        }
    }

    public void I(ConstraintLayout container) {
    }

    public void J(ConstraintLayout container) {
    }

    public void K(ConstraintLayout container) {
    }

    public void L(ConstraintLayout container) {
    }

    public void M(androidx.constraintlayout.core.widgets.f container, androidx.constraintlayout.core.widgets.i helper, SparseArray<androidx.constraintlayout.core.widgets.e> map) {
        helper.b();
        for (int i4 = 0; i4 < this.f23781c; i4++) {
            helper.a(map.get(this.f23780b[i4]));
        }
    }

    public void N(ConstraintLayout container) {
        String str;
        int w4;
        if (isInEditMode()) {
            F(this.f23785g);
        }
        androidx.constraintlayout.core.widgets.i iVar = this.f23783e;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i4 = 0; i4 < this.f23781c; i4++) {
            int i5 = this.f23780b[i4];
            View w5 = container.w(i5);
            if (w5 == null && (w4 = w(container, (str = this.f23788j.get(Integer.valueOf(i5))))) != 0) {
                this.f23780b[i4] = w4;
                this.f23788j.put(Integer.valueOf(w4), str);
                w5 = container.w(w4);
            }
            if (w5 != null) {
                this.f23783e.a(container.z(w5));
            }
        }
        this.f23783e.c(container.f23791d);
    }

    public void O() {
        if (this.f23783e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f23848k3 = (androidx.constraintlayout.core.widgets.e) this.f23783e;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f23785g;
        if (str != null) {
            F(str);
        }
        String str2 = this.f23786h;
        if (str2 != null) {
            G(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f23784f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void q(View view) {
        if (view == this || view.getId() == -1 || view.getParent() == null) {
            return;
        }
        this.f23785g = null;
        o(view.getId());
        requestLayout();
    }

    protected void r() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        s((ConstraintLayout) parent);
    }

    protected void s(ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i4 = 0; i4 < this.f23781c; i4++) {
            View w4 = container.w(this.f23780b[i4]);
            if (w4 != null) {
                w4.setVisibility(visibility);
                if (elevation > 0.0f) {
                    w4.setTranslationZ(w4.getTranslationZ() + elevation);
                }
            }
        }
    }

    @Override // android.view.View
    public void setTag(int key, Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.f23785g == null) {
            o(key);
        }
    }

    protected void t(ConstraintLayout container) {
    }

    public boolean u(final int id2) {
        for (int i4 : this.f23780b) {
            if (i4 == id2) {
                return true;
            }
        }
        return false;
    }

    public int[] y() {
        return Arrays.copyOf(this.f23780b, this.f23781c);
    }

    protected View[] z(ConstraintLayout layout) {
        View[] viewArr = this.f23787i;
        if (viewArr == null || viewArr.length != this.f23781c) {
            this.f23787i = new View[this.f23781c];
        }
        for (int i4 = 0; i4 < this.f23781c; i4++) {
            this.f23787i[i4] = layout.w(this.f23780b[i4]);
        }
        return this.f23787i;
    }

    public ConstraintHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23780b = new int[32];
        this.f23784f = false;
        this.f23787i = null;
        this.f23788j = new HashMap<>();
        this.f23782d = context;
        B(attrs);
    }

    public ConstraintHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23780b = new int[32];
        this.f23784f = false;
        this.f23787i = null;
        this.f23788j = new HashMap<>();
        this.f23782d = context;
        B(attrs);
    }
}

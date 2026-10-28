package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.n;
import s8.a;

/* loaded from: classes6.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: i, reason: collision with root package name */
    private static final int f54234i = 15;

    /* renamed from: f, reason: collision with root package name */
    @o0
    private final ListPopupWindow f54235f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private final AccessibilityManager f54236g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    private final Rect f54237h;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            MaterialAutoCompleteTextView.this.f(i4 < 0 ? MaterialAutoCompleteTextView.this.f54235f.C() : MaterialAutoCompleteTextView.this.getAdapter().getItem(i4));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i4 < 0) {
                    view = MaterialAutoCompleteTextView.this.f54235f.F();
                    i4 = MaterialAutoCompleteTextView.this.f54235f.E();
                    j4 = MaterialAutoCompleteTextView.this.f54235f.D();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f54235f.q(), view, i4, j4);
            }
            MaterialAutoCompleteTextView.this.f54235f.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(@o0 Context context) {
        this(context, null);
    }

    @q0
    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d5 = d();
        int i4 = 0;
        if (adapter == null || d5 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f54235f.E()) + 15);
        View view = null;
        int i5 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(max, view, d5);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        Drawable i6 = this.f54235f.i();
        if (i6 != null) {
            i6.getPadding(this.f54237h);
            Rect rect = this.f54237h;
            i5 += rect.left + rect.right;
        }
        return d5.f0().getMeasuredWidth() + i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    @q0
    public CharSequence getHint() {
        TextInputLayout d5 = d();
        return (d5 == null || !d5.X0()) ? super.getHint() : d5.n0();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d5 = d();
        if (d5 != null && d5.X0() && super.getHint() == null && com.google.android.material.internal.e.c()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@q0 T t4) {
        super.setAdapter(t4);
        this.f54235f.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f54236g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f54235f.b();
        }
    }

    public MaterialAutoCompleteTextView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Y);
    }

    public MaterialAutoCompleteTextView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(a9.a.c(context, attributeSet, i4, 0), attributeSet, i4);
        this.f54237h = new Rect();
        Context context2 = getContext();
        TypedArray j4 = n.j(context2, attributeSet, a.o.tk, i4, a.n.f91316f9, new int[0]);
        int i5 = a.o.uk;
        if (j4.hasValue(i5) && j4.getInt(i5, 0) == 0) {
            setKeyListener(null);
        }
        this.f54236g = (AccessibilityManager) context2.getSystemService(ProtectedSandApp.s("\uf23d"));
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f54235f = listPopupWindow;
        listPopupWindow.d0(true);
        listPopupWindow.S(this);
        listPopupWindow.a0(2);
        listPopupWindow.o(getAdapter());
        listPopupWindow.f0(new a());
        j4.recycle();
    }
}

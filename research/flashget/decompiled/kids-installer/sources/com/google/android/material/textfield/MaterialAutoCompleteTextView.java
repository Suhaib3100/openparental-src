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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.n;
import n1.a;

/* loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: u, reason: collision with root package name */
    private static final int f14379u = 15;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private final ListPopupWindow f14380r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private final AccessibilityManager f14381s;

    /* renamed from: t, reason: collision with root package name */
    @o0
    private final Rect f14382t;

    /* loaded from: classes2.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            MaterialAutoCompleteTextView.this.f(i5 < 0 ? MaterialAutoCompleteTextView.this.f14380r.C() : MaterialAutoCompleteTextView.this.getAdapter().getItem(i5));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i5 < 0) {
                    view = MaterialAutoCompleteTextView.this.f14380r.F();
                    i5 = MaterialAutoCompleteTextView.this.f14380r.E();
                    j5 = MaterialAutoCompleteTextView.this.f14380r.D();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f14380r.k(), view, i5, j5);
            }
            MaterialAutoCompleteTextView.this.f14380r.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(@o0 Context context) {
        this(context, null);
    }

    @q0
    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c6 = c();
        int i5 = 0;
        if (adapter == null || c6 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f14380r.E()) + 15);
        View view = null;
        int i6 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(max, view, c6);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i6 = Math.max(i6, view.getMeasuredWidth());
        }
        Drawable i7 = this.f14380r.i();
        if (i7 != null) {
            i7.getPadding(this.f14382t);
            Rect rect = this.f14382t;
            i6 += rect.left + rect.right;
        }
        return c6.f0().getMeasuredWidth() + i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    @q0
    public CharSequence getHint() {
        TextInputLayout c6 = c();
        return (c6 == null || !c6.X0()) ? super.getHint() : c6.n0();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c6 = c();
        if (c6 != null && c6.X0() && super.getHint() == null && com.google.android.material.internal.e.c()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@q0 T t5) {
        super.setAdapter(t5);
        this.f14380r.q(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f14381s;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f14380r.a();
        }
    }

    public MaterialAutoCompleteTextView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Z);
    }

    public MaterialAutoCompleteTextView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(v1.a.c(context, attributeSet, i5, 0), attributeSet, i5);
        this.f14382t = new Rect();
        Context context2 = getContext();
        TypedArray j5 = n.j(context2, attributeSet, a.o.aj, i5, a.n.f9, new int[0]);
        int i6 = a.o.bj;
        if (j5.hasValue(i6) && j5.getInt(i6, 0) == 0) {
            setKeyListener(null);
        }
        this.f14381s = (AccessibilityManager) context2.getSystemService(ProtectedSandApp.s("✧"));
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f14380r = listPopupWindow;
        listPopupWindow.d0(true);
        listPopupWindow.S(this);
        listPopupWindow.a0(2);
        listPopupWindow.q(getAdapter());
        listPopupWindow.f0(new a());
        j5.recycle();
    }
}

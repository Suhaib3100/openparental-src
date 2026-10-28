package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.appcompat.app.c;
import androidx.core.view.v1;
import androidx.core.view.y1;
import d.a;

/* loaded from: classes2.dex */
public class AppCompatSpinner extends Spinner implements v1 {
    private static final int A = 1;
    private static final int B = -1;

    /* renamed from: x, reason: collision with root package name */
    private static final int f887x = 15;

    /* renamed from: z, reason: collision with root package name */
    private static final int f889z = 0;

    /* renamed from: o, reason: collision with root package name */
    private final androidx.appcompat.widget.d f890o;

    /* renamed from: p, reason: collision with root package name */
    private final Context f891p;

    /* renamed from: q, reason: collision with root package name */
    private h0 f892q;

    /* renamed from: r, reason: collision with root package name */
    private SpinnerAdapter f893r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f894s;

    /* renamed from: t, reason: collision with root package name */
    private f f895t;

    /* renamed from: u, reason: collision with root package name */
    int f896u;

    /* renamed from: v, reason: collision with root package name */
    final Rect f897v;

    /* renamed from: y, reason: collision with root package name */
    private static final String f888y = "AppCompatSpinner";

    /* renamed from: w, reason: collision with root package name */
    private static final int[] f886w = {R.attr.spinnerMode};

    /* loaded from: classes.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        boolean f898o;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeByte(this.f898o ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f898o = parcel.readByte() != 0;
        }
    }

    class a extends h0 {

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ e f899x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f899x = eVar;
        }

        @Override // androidx.appcompat.widget.h0
        public androidx.appcompat.view.menu.q b() {
            return this.f899x;
        }

        @Override // androidx.appcompat.widget.h0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.b().c()) {
                return true;
            }
            AppCompatSpinner.this.c();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.b().c()) {
                AppCompatSpinner.this.c();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    @m1
    class c implements f, DialogInterface.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        @m1
        androidx.appcompat.app.c f902o;

        /* renamed from: p, reason: collision with root package name */
        private ListAdapter f903p;

        /* renamed from: q, reason: collision with root package name */
        private CharSequence f904q;

        c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void b(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public boolean c() {
            androidx.appcompat.app.c cVar = this.f902o;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f902o;
            if (cVar != null) {
                cVar.dismiss();
                this.f902o = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void f(int i5) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public CharSequence g() {
            return this.f904q;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void j(CharSequence charSequence) {
            this.f904q = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void l(int i5) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void m(int i5) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void n(int i5, int i6) {
            if (this.f903p == null) {
                return;
            }
            c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f904q;
            if (charSequence != null) {
                aVar.K(charSequence);
            }
            androidx.appcompat.app.c a6 = aVar.H(this.f903p, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.f902o = a6;
            ListView g5 = a6.g();
            g5.setTextDirection(i5);
            g5.setTextAlignment(i6);
            this.f902o.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i5) {
            AppCompatSpinner.this.setSelection(i5);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i5, this.f903p.getItemId(i5));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int p() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void q(ListAdapter listAdapter) {
            this.f903p = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: o, reason: collision with root package name */
        private SpinnerAdapter f906o;

        /* renamed from: p, reason: collision with root package name */
        private ListAdapter f907p;

        public d(@androidx.annotation.q0 SpinnerAdapter spinnerAdapter, @androidx.annotation.q0 Resources.Theme theme) {
            this.f906o = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f907p = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof v0) {
                    v0 v0Var = (v0) spinnerAdapter;
                    if (v0Var.getDropDownViewTheme() == null) {
                        v0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f907p;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f906o;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f906o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i5, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i5) {
            SpinnerAdapter spinnerAdapter = this.f906o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i5);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i5) {
            SpinnerAdapter spinnerAdapter = this.f906o;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i5);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i5) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            return getDropDownView(i5, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f906o;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i5) {
            ListAdapter listAdapter = this.f907p;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i5);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f906o;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f906o;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @m1
    /* loaded from: classes3.dex */
    class e extends ListPopupWindow implements f {

        /* renamed from: h0, reason: collision with root package name */
        private CharSequence f908h0;

        /* renamed from: i0, reason: collision with root package name */
        ListAdapter f909i0;

        /* renamed from: j0, reason: collision with root package name */
        private final Rect f910j0;

        /* renamed from: k0, reason: collision with root package name */
        private int f911k0;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f913o;

            a(AppCompatSpinner appCompatSpinner) {
                this.f913o = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                AppCompatSpinner.this.setSelection(i5);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    AppCompatSpinner.this.performItemClick(view, i5, eVar.f909i0.getItemId(i5));
                }
                e.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.r0(AppCompatSpinner.this)) {
                    e.this.dismiss();
                } else {
                    e.this.q0();
                    e.super.a();
                }
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f916o;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f916o = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f916o);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i5) {
            super(context, attributeSet, i5);
            this.f910j0 = new Rect();
            S(AppCompatSpinner.this);
            d0(true);
            j0(0);
            f0(new a(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public CharSequence g() {
            return this.f908h0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void j(CharSequence charSequence) {
            this.f908h0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void m(int i5) {
            this.f911k0 = i5;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void n(int i5, int i6) {
            ViewTreeObserver viewTreeObserver;
            boolean c6 = c();
            q0();
            a0(2);
            super.a();
            ListView k5 = k();
            k5.setChoiceMode(1);
            k5.setTextDirection(i5);
            k5.setTextAlignment(i6);
            l0(AppCompatSpinner.this.getSelectedItemPosition());
            if (c6 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            e0(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int p() {
            return this.f911k0;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.f
        public void q(ListAdapter listAdapter) {
            super.q(listAdapter);
            this.f909i0 = listAdapter;
        }

        void q0() {
            int i5;
            Drawable i6 = i();
            if (i6 != null) {
                i6.getPadding(AppCompatSpinner.this.f897v);
                i5 = g1.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f897v.right : -AppCompatSpinner.this.f897v.left;
            } else {
                Rect rect = AppCompatSpinner.this.f897v;
                rect.right = 0;
                rect.left = 0;
                i5 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i7 = appCompatSpinner.f896u;
            if (i7 == -2) {
                int a6 = appCompatSpinner.a((SpinnerAdapter) this.f909i0, i());
                int i8 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f897v;
                int i9 = (i8 - rect2.left) - rect2.right;
                if (a6 > i9) {
                    a6 = i9;
                }
                U(Math.max(a6, (width - paddingLeft) - paddingRight));
            } else if (i7 == -1) {
                U((width - paddingLeft) - paddingRight);
            } else {
                U(i7);
            }
            f(g1.b(AppCompatSpinner.this) ? (((width - paddingRight) - H()) - p()) + i5 : paddingLeft + p() + i5);
        }

        boolean r0(View view) {
            return y1.O0(view) && view.getGlobalVisibleRect(this.f910j0);
        }
    }

    @m1
    /* loaded from: classes.dex */
    interface f {
        void b(Drawable drawable);

        boolean c();

        int d();

        void dismiss();

        void f(int i5);

        CharSequence g();

        Drawable i();

        void j(CharSequence charSequence);

        void l(int i5);

        void m(int i5);

        void n(int i5, int i6);

        int o();

        int p();

        void q(ListAdapter listAdapter);
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context) {
        this(context, (AttributeSet) null);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i5 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i6 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i6 = Math.max(i6, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i6;
        }
        drawable.getPadding(this.f897v);
        Rect rect = this.f897v;
        return i6 + rect.left + rect.right;
    }

    @m1
    final f b() {
        return this.f895t;
    }

    void c() {
        this.f895t.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.d dVar = this.f890o;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList e() {
        androidx.appcompat.widget.d dVar = this.f890o;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f895t;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f895t;
        return fVar != null ? fVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f895t != null ? this.f896u : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f895t;
        return fVar != null ? fVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f891p;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f895t;
        return fVar != null ? fVar.g() : super.getPrompt();
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode j() {
        androidx.appcompat.widget.d dVar = this.f890o;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(@androidx.annotation.q0 ColorStateList colorStateList) {
        androidx.appcompat.widget.d dVar = this.f890o;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        androidx.appcompat.widget.d dVar = this.f890o;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f895t;
        if (fVar == null || !fVar.c()) {
            return;
        }
        this.f895t.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f895t == null || View.MeasureSpec.getMode(i5) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f898o || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f895t;
        savedState.f898o = fVar != null && fVar.c();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f892q;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.f895t;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.c()) {
            return true;
        }
        c();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.d dVar = this.f890o;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i5) {
        super.setBackgroundResource(i5);
        androidx.appcompat.widget.d dVar = this.f890o;
        if (dVar != null) {
            dVar.g(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i5) {
        f fVar = this.f895t;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i5);
        } else {
            fVar.m(i5);
            this.f895t.f(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i5) {
        f fVar = this.f895t;
        if (fVar != null) {
            fVar.l(i5);
        } else {
            super.setDropDownVerticalOffset(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i5) {
        if (this.f895t != null) {
            this.f896u = i5;
        } else {
            super.setDropDownWidth(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f895t;
        if (fVar != null) {
            fVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@androidx.annotation.v int i5) {
        setPopupBackgroundDrawable(androidx.appcompat.content.res.a.d(getPopupContext(), i5));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f895t;
        if (fVar != null) {
            fVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context, int i5) {
        this(context, null, a.c.f21563f3, i5);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f894s) {
            this.f893r = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f895t != null) {
            Context context = this.f891p;
            if (context == null) {
                context = getContext();
            }
            this.f895t.q(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f21563f3);
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, -1);
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5, int i6) {
        this(context, attributeSet, i5, i6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r10 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(@androidx.annotation.o0 android.content.Context r6, @androidx.annotation.q0 android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f897v = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.u0.a(r5, r0)
            int[] r0 = d.a.n.x6
            r1 = 0
            androidx.appcompat.widget.z0 r0 = androidx.appcompat.widget.z0.G(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r5)
            r5.f890o = r2
            if (r10 == 0) goto L29
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r6, r10)
            r5.f891p = r2
            goto L3b
        L29:
            int r10 = d.a.n.C6
            int r10 = r0.u(r10, r1)
            if (r10 == 0) goto L39
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r6, r10)
            r5.f891p = r2
            goto L3b
        L39:
            r5.f891p = r6
        L3b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L61
            int[] r10 = androidx.appcompat.widget.AppCompatSpinner.f886w     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
            boolean r3 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L5e
            if (r3 == 0) goto L4f
            int r9 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L5e
        L4f:
            r10.recycle()
            goto L61
        L53:
            r6 = move-exception
            r2 = r10
            goto L57
        L56:
            r6 = move-exception
        L57:
            if (r2 == 0) goto L5c
            r2.recycle()
        L5c:
            throw r6
        L5d:
            r10 = r2
        L5e:
            if (r10 == 0) goto L61
            goto L4f
        L61:
            r10 = 1
            if (r9 == 0) goto L9e
            if (r9 == r10) goto L67
            goto Lae
        L67:
            androidx.appcompat.widget.AppCompatSpinner$e r9 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r5.f891p
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f891p
            int[] r4 = d.a.n.x6
            androidx.appcompat.widget.z0 r1 = androidx.appcompat.widget.z0.G(r3, r7, r4, r8, r1)
            int r3 = d.a.n.B6
            r4 = -2
            int r3 = r1.q(r3, r4)
            r5.f896u = r3
            int r3 = d.a.n.z6
            android.graphics.drawable.Drawable r3 = r1.h(r3)
            r9.b(r3)
            int r3 = d.a.n.A6
            java.lang.String r3 = r0.w(r3)
            r9.j(r3)
            r1.I()
            r5.f895t = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.f892q = r1
            goto Lae
        L9e:
            androidx.appcompat.widget.AppCompatSpinner$c r9 = new androidx.appcompat.widget.AppCompatSpinner$c
            r9.<init>()
            r5.f895t = r9
            int r1 = d.a.n.A6
            java.lang.String r1 = r0.w(r1)
            r9.j(r1)
        Lae:
            int r9 = d.a.n.y6
            java.lang.CharSequence[] r9 = r0.y(r9)
            if (r9 == 0) goto Lc6
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = d.a.k.M
            r1.setDropDownViewResource(r6)
            r5.setAdapter(r1)
        Lc6:
            r0.I()
            r5.f894s = r10
            android.widget.SpinnerAdapter r6 = r5.f893r
            if (r6 == 0) goto Ld4
            r5.setAdapter(r6)
            r5.f893r = r2
        Ld4:
            androidx.appcompat.widget.d r6 = r5.f890o
            r6.e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}

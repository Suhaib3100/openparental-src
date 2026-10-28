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
import androidx.annotation.i1;
import androidx.annotation.m1;
import androidx.appcompat.app.c;
import androidx.core.view.s1;
import androidx.core.view.x1;
import d.a;
import java.util.Objects;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements s1 {

    /* renamed from: k, reason: collision with root package name */
    private static final int f1488k = 15;

    /* renamed from: m, reason: collision with root package name */
    private static final int f1490m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final int f1491n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f1492o = -1;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1493b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1494c;

    /* renamed from: d, reason: collision with root package name */
    private e0 f1495d;

    /* renamed from: e, reason: collision with root package name */
    private SpinnerAdapter f1496e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1497f;

    /* renamed from: g, reason: collision with root package name */
    private i f1498g;

    /* renamed from: h, reason: collision with root package name */
    int f1499h;

    /* renamed from: i, reason: collision with root package name */
    final Rect f1500i;

    /* renamed from: l, reason: collision with root package name */
    private static final String f1489l = "AppCompatSpinner";

    /* renamed from: j, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    @i1
    private static final int[] f1487j = {R.attr.spinnerMode};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        boolean f1501b;

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
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.f1501b ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1501b = parcel.readByte() != 0;
        }
    }

    class a extends e0 {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ h f1502k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1502k = hVar;
        }

        @Override // androidx.appcompat.widget.e0
        public androidx.appcompat.view.menu.r b() {
            return this.f1502k;
        }

        @Override // androidx.appcompat.widget.e0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.b().c()) {
                return true;
            }
            AppCompatSpinner.this.c();
            return true;
        }
    }

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
                c.a(viewTreeObserver, this);
            }
        }
    }

    @androidx.annotation.x0(16)
    private static final class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.o0 ViewTreeObserver viewTreeObserver, @androidx.annotation.q0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @androidx.annotation.x0(17)
    private static final class d {
        private d() {
        }

        @androidx.annotation.u
        static int a(@androidx.annotation.o0 View view) {
            return view.getTextAlignment();
        }

        @androidx.annotation.u
        static int b(@androidx.annotation.o0 View view) {
            return view.getTextDirection();
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.o0 View view, int i4) {
            view.setTextAlignment(i4);
        }

        @androidx.annotation.u
        static void d(@androidx.annotation.o0 View view, int i4) {
            view.setTextDirection(i4);
        }
    }

    @androidx.annotation.x0(23)
    private static final class e {
        private e() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.o0 ThemedSpinnerAdapter themedSpinnerAdapter, @androidx.annotation.q0 Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    @m1
    class f implements i, DialogInterface.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        @m1
        androidx.appcompat.app.c f1505b;

        /* renamed from: c, reason: collision with root package name */
        private ListAdapter f1506c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f1507d;

        f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void a(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public boolean c() {
            androidx.appcompat.app.c cVar = this.f1505b;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1505b;
            if (cVar != null) {
                cVar.dismiss();
                this.f1505b = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void g(int i4) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence h() {
            return this.f1507d;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void j(CharSequence charSequence) {
            this.f1507d = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void k(int i4) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void l(int i4) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void m(int i4, int i5) {
            if (this.f1506c == null) {
                return;
            }
            c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f1507d;
            if (charSequence != null) {
                aVar.K(charSequence);
            }
            androidx.appcompat.app.c a5 = aVar.H(this.f1506c, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.f1505b = a5;
            ListView p4 = a5.p();
            d.d(p4, i4);
            d.c(p4, i5);
            this.f1505b.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void o(ListAdapter listAdapter) {
            this.f1506c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            AppCompatSpinner.this.setSelection(i4);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i4, this.f1506c.getItemId(i4));
            }
            dismiss();
        }
    }

    private static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private SpinnerAdapter f1509b;

        /* renamed from: c, reason: collision with root package name */
        private ListAdapter f1510c;

        public g(@androidx.annotation.q0 SpinnerAdapter spinnerAdapter, @androidx.annotation.q0 Resources.Theme theme) {
            this.f1509b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1510c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof p0) {
                    p0 p0Var = (p0) spinnerAdapter;
                    if (p0Var.getDropDownViewTheme() == null) {
                        p0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1510c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1509b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1509b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i4, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            SpinnerAdapter spinnerAdapter = this.f1509b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            SpinnerAdapter spinnerAdapter = this.f1509b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i4);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i4) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            return getDropDownView(i4, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1509b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i4) {
            ListAdapter listAdapter = this.f1510c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i4);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1509b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1509b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @m1
    class h extends ListPopupWindow implements i {
        private int L2;
        ListAdapter Q1;
        private final Rect V1;
        private CharSequence Z;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f1511b;

            a(AppCompatSpinner appCompatSpinner) {
                this.f1511b = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                AppCompatSpinner.this.setSelection(i4);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    AppCompatSpinner.this.performItemClick(view, i4, hVar.Q1.getItemId(i4));
                }
                h.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.r0(AppCompatSpinner.this)) {
                    h.this.dismiss();
                } else {
                    h.this.q0();
                    h.super.b();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1514b;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1514b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1514b);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.V1 = new Rect();
            S(AppCompatSpinner.this);
            d0(true);
            j0(0);
            f0(new a(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence h() {
            return this.Z;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void j(CharSequence charSequence) {
            this.Z = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void l(int i4) {
            this.L2 = i4;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void m(int i4, int i5) {
            ViewTreeObserver viewTreeObserver;
            boolean c5 = c();
            q0();
            a0(2);
            super.b();
            ListView q4 = q();
            q4.setChoiceMode(1);
            d.d(q4, i4);
            d.c(q4, i5);
            l0(AppCompatSpinner.this.getSelectedItemPosition());
            if (c5 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            e0(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int n() {
            return this.L2;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.i
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.Q1 = listAdapter;
        }

        void q0() {
            int i4;
            Drawable i5 = i();
            if (i5 != null) {
                i5.getPadding(AppCompatSpinner.this.f1500i);
                i4 = e1.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f1500i.right : -AppCompatSpinner.this.f1500i.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1500i;
                rect.right = 0;
                rect.left = 0;
                i4 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i6 = appCompatSpinner.f1499h;
            if (i6 == -2) {
                int a5 = appCompatSpinner.a((SpinnerAdapter) this.Q1, i());
                int i7 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1500i;
                int i10 = (i7 - rect2.left) - rect2.right;
                if (a5 > i10) {
                    a5 = i10;
                }
                U(Math.max(a5, (width - paddingLeft) - paddingRight));
            } else if (i6 == -1) {
                U((width - paddingLeft) - paddingRight);
            } else {
                U(i6);
            }
            g(e1.b(AppCompatSpinner.this) ? (((width - paddingRight) - H()) - n()) + i4 : paddingLeft + n() + i4);
        }

        boolean r0(View view) {
            return x1.R0(view) && view.getGlobalVisibleRect(this.V1);
        }
    }

    @m1
    interface i {
        void a(Drawable drawable);

        boolean c();

        int d();

        void dismiss();

        int e();

        void g(int i4);

        CharSequence h();

        Drawable i();

        void j(CharSequence charSequence);

        void k(int i4);

        void l(int i4);

        void m(int i4, int i5);

        int n();

        void o(ListAdapter listAdapter);
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context) {
        this(context, (AttributeSet) null);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i5;
        }
        drawable.getPadding(this.f1500i);
        Rect rect = this.f1500i;
        return i5 + rect.left + rect.right;
    }

    @m1
    final i b() {
        return this.f1498g;
    }

    void c() {
        this.f1498g.m(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1493b;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f1498g;
        return iVar != null ? iVar.e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f1498g;
        return iVar != null ? iVar.d() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1498g != null ? this.f1499h : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f1498g;
        return iVar != null ? iVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1494c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f1498g;
        return iVar != null ? iVar.h() : super.getPrompt();
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1493b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1493b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f1498g;
        if (iVar == null || !iVar.c()) {
            return;
        }
        this.f1498g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f1498g == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1501b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        i iVar = this.f1498g;
        savedState.f1501b = iVar != null && iVar.c();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f1495d;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        i iVar = this.f1498g;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.c()) {
            return true;
        }
        c();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1493b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i4) {
        super.setBackgroundResource(i4);
        androidx.appcompat.widget.e eVar = this.f1493b;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        i iVar = this.f1498g;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            iVar.l(i4);
            this.f1498g.g(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        i iVar = this.f1498g;
        if (iVar != null) {
            iVar.k(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f1498g != null) {
            this.f1499h = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f1498g;
        if (iVar != null) {
            iVar.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@androidx.annotation.v int i4) {
        setPopupBackgroundDrawable(e.a.b(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f1498g;
        if (iVar != null) {
            iVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1493b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1493b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context, int i4) {
        this(context, null, a.b.Y2, i4, null);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1497f) {
            this.f1496e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1498g != null) {
            Context context = this.f1494c;
            if (context == null) {
                context = getContext();
            }
            this.f1498g.o(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.Y2);
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, -1, null);
    }

    public AppCompatSpinner(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4, int i5) {
        this(context, attributeSet, i4, i5, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r10 == null) goto L27;
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
            r5.f1500i = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.o0.a(r5, r0)
            int[] r0 = d.a.m.t5
            r1 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.t0.G(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r5)
            r5.f1493b = r2
            if (r10 == 0) goto L29
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r6, r10)
            r5.f1494c = r2
            goto L3b
        L29:
            int r10 = d.a.m.y5
            int r10 = r0.u(r10, r1)
            if (r10 == 0) goto L39
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r6, r10)
            r5.f1494c = r2
            goto L3b
        L39:
            r5.f1494c = r6
        L3b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L64
            int[] r10 = androidx.appcompat.widget.AppCompatSpinner.f1487j     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            boolean r3 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L61
            if (r3 == 0) goto L53
            int r9 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L61
            goto L53
        L50:
            r6 = move-exception
            r2 = r10
            goto L5b
        L53:
            r10.recycle()
            goto L64
        L57:
            r6 = move-exception
            goto L5b
        L59:
            r10 = r2
            goto L61
        L5b:
            if (r2 == 0) goto L60
            r2.recycle()
        L60:
            throw r6
        L61:
            if (r10 == 0) goto L64
            goto L53
        L64:
            r10 = 1
            if (r9 == 0) goto La1
            if (r9 == r10) goto L6a
            goto Lb1
        L6a:
            androidx.appcompat.widget.AppCompatSpinner$h r9 = new androidx.appcompat.widget.AppCompatSpinner$h
            android.content.Context r3 = r5.f1494c
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f1494c
            int[] r4 = d.a.m.t5
            androidx.appcompat.widget.t0 r1 = androidx.appcompat.widget.t0.G(r3, r7, r4, r8, r1)
            int r3 = d.a.m.x5
            r4 = -2
            int r3 = r1.q(r3, r4)
            r5.f1499h = r3
            int r3 = d.a.m.v5
            android.graphics.drawable.Drawable r3 = r1.h(r3)
            r9.a(r3)
            int r3 = d.a.m.w5
            java.lang.String r3 = r0.w(r3)
            r9.j(r3)
            r1.I()
            r5.f1498g = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.f1495d = r1
            goto Lb1
        La1:
            androidx.appcompat.widget.AppCompatSpinner$f r9 = new androidx.appcompat.widget.AppCompatSpinner$f
            r9.<init>()
            r5.f1498g = r9
            int r1 = d.a.m.w5
            java.lang.String r1 = r0.w(r1)
            r9.j(r1)
        Lb1:
            int r9 = d.a.m.u5
            java.lang.CharSequence[] r9 = r0.y(r9)
            if (r9 == 0) goto Lc9
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = d.a.j.F
            r1.setDropDownViewResource(r6)
            r5.setAdapter(r1)
        Lc9:
            r0.I()
            r5.f1497f = r10
            android.widget.SpinnerAdapter r6 = r5.f1496e
            if (r6 == 0) goto Ld7
            r5.setAdapter(r6)
            r5.f1496e = r2
        Ld7:
            androidx.appcompat.widget.e r6 = r5.f1493b
            r6.e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}

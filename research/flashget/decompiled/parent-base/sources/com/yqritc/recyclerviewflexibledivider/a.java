package com.yqritc.recyclerviewflexibledivider;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.n;
import androidx.annotation.q;
import androidx.annotation.v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FlexibleDividerDecoration.java */
/* loaded from: classes7.dex */
public abstract class a extends RecyclerView.o {

    /* renamed from: j, reason: collision with root package name */
    private static final int f72875j = 2;

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f72876k = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    protected f f72877a;

    /* renamed from: b, reason: collision with root package name */
    protected j f72878b;

    /* renamed from: c, reason: collision with root package name */
    protected h f72879c;

    /* renamed from: d, reason: collision with root package name */
    protected e f72880d;

    /* renamed from: e, reason: collision with root package name */
    protected g f72881e;

    /* renamed from: f, reason: collision with root package name */
    protected i f72882f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f72883g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f72884h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f72885i;

    /* compiled from: FlexibleDividerDecoration.java */
    /* renamed from: com.yqritc.recyclerviewflexibledivider.a$a, reason: collision with other inner class name */
    class C1009a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Drawable f72886a;

        C1009a(final Drawable val$divider) {
            this.f72886a = val$divider;
        }

        @Override // com.yqritc.recyclerviewflexibledivider.a.g
        public Drawable a(int position, RecyclerView parent) {
            return this.f72886a;
        }
    }

    /* compiled from: FlexibleDividerDecoration.java */
    class b implements i {
        b() {
        }

        @Override // com.yqritc.recyclerviewflexibledivider.a.i
        public int a(int position, RecyclerView parent) {
            return 2;
        }
    }

    /* compiled from: FlexibleDividerDecoration.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72889a;

        static {
            int[] iArr = new int[f.values().length];
            f72889a = iArr;
            try {
                iArr[f.DRAWABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72889a[f.PAINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72889a[f.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: FlexibleDividerDecoration.java */
    public static class d<T extends d> {

        /* renamed from: a, reason: collision with root package name */
        private Context f72890a;

        /* renamed from: b, reason: collision with root package name */
        protected Resources f72891b;

        /* renamed from: c, reason: collision with root package name */
        private h f72892c;

        /* renamed from: d, reason: collision with root package name */
        private e f72893d;

        /* renamed from: e, reason: collision with root package name */
        private g f72894e;

        /* renamed from: f, reason: collision with root package name */
        private i f72895f;

        /* renamed from: g, reason: collision with root package name */
        private j f72896g = new C1010a();

        /* renamed from: h, reason: collision with root package name */
        private boolean f72897h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f72898i = false;

        /* compiled from: FlexibleDividerDecoration.java */
        /* renamed from: com.yqritc.recyclerviewflexibledivider.a$d$a, reason: collision with other inner class name */
        class C1010a implements j {
            C1010a() {
            }

            @Override // com.yqritc.recyclerviewflexibledivider.a.j
            public boolean a(int position, RecyclerView parent) {
                return false;
            }
        }

        /* compiled from: FlexibleDividerDecoration.java */
        class b implements h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Paint f72900a;

            b(final Paint val$paint) {
                this.f72900a = val$paint;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.a.h
            public Paint a(int position, RecyclerView parent) {
                return this.f72900a;
            }
        }

        /* compiled from: FlexibleDividerDecoration.java */
        class c implements e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f72902a;

            c(final int val$color) {
                this.f72902a = val$color;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.a.e
            public int a(int position, RecyclerView parent) {
                return this.f72902a;
            }
        }

        /* compiled from: FlexibleDividerDecoration.java */
        /* renamed from: com.yqritc.recyclerviewflexibledivider.a$d$d, reason: collision with other inner class name */
        class C1011d implements g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Drawable f72904a;

            C1011d(final Drawable val$drawable) {
                this.f72904a = val$drawable;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.a.g
            public Drawable a(int position, RecyclerView parent) {
                return this.f72904a;
            }
        }

        /* compiled from: FlexibleDividerDecoration.java */
        class e implements i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f72906a;

            e(final int val$size) {
                this.f72906a = val$size;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.a.i
            public int a(int position, RecyclerView parent) {
                return this.f72906a;
            }
        }

        public d(Context context) {
            this.f72890a = context;
            this.f72891b = context.getResources();
        }

        protected void i() {
            if (this.f72892c != null) {
                if (this.f72893d != null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("当\u0001"));
                }
                if (this.f72895f != null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("归\u0001"));
                }
            }
        }

        public T j(final int color) {
            return k(new c(color));
        }

        public T k(e provider) {
            this.f72893d = provider;
            return this;
        }

        public T l(@n int colorId) {
            return j(androidx.core.content.d.getColor(this.f72890a, colorId));
        }

        public T m(@v int id2) {
            return n(androidx.core.content.d.getDrawable(this.f72890a, id2));
        }

        public T n(final Drawable drawable) {
            return o(new C1011d(drawable));
        }

        public T o(g provider) {
            this.f72894e = provider;
            return this;
        }

        public T p(final Paint paint) {
            return q(new b(paint));
        }

        public T q(h provider) {
            this.f72892c = provider;
            return this;
        }

        public T r(boolean positionInsideItem) {
            this.f72898i = positionInsideItem;
            return this;
        }

        public T s() {
            this.f72897h = true;
            return this;
        }

        public T t(final int size) {
            return u(new e(size));
        }

        public T u(i provider) {
            this.f72895f = provider;
            return this;
        }

        public T v(@q int sizeId) {
            return t(this.f72891b.getDimensionPixelSize(sizeId));
        }

        public T w(j provider) {
            this.f72896g = provider;
            return this;
        }
    }

    /* compiled from: FlexibleDividerDecoration.java */
    public interface e {
        int a(int position, RecyclerView parent);
    }

    /* compiled from: FlexibleDividerDecoration.java */
    protected enum f {
        DRAWABLE,
        PAINT,
        COLOR
    }

    /* compiled from: FlexibleDividerDecoration.java */
    public interface g {
        Drawable a(int position, RecyclerView parent);
    }

    /* compiled from: FlexibleDividerDecoration.java */
    public interface h {
        Paint a(int position, RecyclerView parent);
    }

    /* compiled from: FlexibleDividerDecoration.java */
    public interface i {
        int a(int position, RecyclerView parent);
    }

    /* compiled from: FlexibleDividerDecoration.java */
    public interface j {
        boolean a(int position, RecyclerView parent);
    }

    protected a(d builder) {
        f fVar = f.DRAWABLE;
        this.f72877a = fVar;
        if (builder.f72892c != null) {
            this.f72877a = f.PAINT;
            this.f72879c = builder.f72892c;
        } else if (builder.f72893d != null) {
            this.f72877a = f.COLOR;
            this.f72880d = builder.f72893d;
            this.f72885i = new Paint();
            h(builder);
        } else {
            this.f72877a = fVar;
            if (builder.f72894e == null) {
                TypedArray obtainStyledAttributes = builder.f72890a.obtainStyledAttributes(f72876k);
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                this.f72881e = new C1009a(drawable);
            } else {
                this.f72881e = builder.f72894e;
            }
            this.f72882f = builder.f72895f;
        }
        this.f72878b = builder.f72896g;
        this.f72883g = builder.f72897h;
        this.f72884h = builder.f72898i;
    }

    private int d(int position, RecyclerView parent) {
        if (!(parent.getLayoutManager() instanceof GridLayoutManager)) {
            return position;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) parent.getLayoutManager();
        return gridLayoutManager.Q().getSpanGroupIndex(position, gridLayoutManager.M());
    }

    private int e(RecyclerView parent) {
        if (!(parent.getLayoutManager() instanceof GridLayoutManager)) {
            return 1;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) parent.getLayoutManager();
        GridLayoutManager.b Q = gridLayoutManager.Q();
        int M = gridLayoutManager.M();
        int itemCount = parent.getAdapter().getItemCount();
        for (int i4 = itemCount - 1; i4 >= 0; i4--) {
            if (Q.getSpanIndex(i4, M) == 0) {
                return itemCount - i4;
            }
        }
        return 1;
    }

    private void h(d builder) {
        i iVar = builder.f72895f;
        this.f72882f = iVar;
        if (iVar == null) {
            this.f72882f = new b();
        }
    }

    private boolean i(int position, RecyclerView parent) {
        if (!(parent.getLayoutManager() instanceof GridLayoutManager)) {
            return false;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) parent.getLayoutManager();
        return gridLayoutManager.Q().getSpanIndex(position, gridLayoutManager.M()) > 0;
    }

    protected abstract Rect c(int position, RecyclerView parent, View child);

    protected boolean f(RecyclerView parent) {
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getReverseLayout();
        }
        return false;
    }

    protected abstract void g(Rect outRect, int position, RecyclerView parent);

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View v4, RecyclerView parent, RecyclerView.a0 state) {
        int childAdapterPosition = parent.getChildAdapterPosition(v4);
        int itemCount = parent.getAdapter().getItemCount();
        int e4 = e(parent);
        if (this.f72883g || childAdapterPosition < itemCount - e4) {
            int d5 = d(childAdapterPosition, parent);
            if (this.f72878b.a(d5, parent)) {
                return;
            }
            g(rect, d5, parent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas c5, RecyclerView parent, RecyclerView.a0 state) {
        RecyclerView.h adapter = parent.getAdapter();
        if (adapter == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        int e4 = e(parent);
        int childCount = parent.getChildCount();
        int i4 = -1;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = parent.getChildAt(i5);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= i4) {
                if ((this.f72883g || childAdapterPosition < itemCount - e4) && !i(childAdapterPosition, parent)) {
                    int d5 = d(childAdapterPosition, parent);
                    if (!this.f72878b.a(d5, parent)) {
                        Rect c6 = c(d5, parent, childAt);
                        int i6 = c.f72889a[this.f72877a.ordinal()];
                        if (i6 == 1) {
                            Drawable a5 = this.f72881e.a(d5, parent);
                            a5.setBounds(c6);
                            a5.draw(c5);
                            i4 = childAdapterPosition;
                        } else if (i6 == 2) {
                            Paint a6 = this.f72879c.a(d5, parent);
                            this.f72885i = a6;
                            c5.drawLine(c6.left, c6.top, c6.right, c6.bottom, a6);
                        } else if (i6 == 3) {
                            this.f72885i.setColor(this.f72880d.a(d5, parent));
                            this.f72885i.setStrokeWidth(this.f72882f.a(d5, parent));
                            c5.drawLine(c6.left, c6.top, c6.right, c6.bottom, this.f72885i);
                        }
                    }
                }
                i4 = childAdapterPosition;
            }
        }
    }
}

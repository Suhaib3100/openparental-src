package com.yqritc.recyclerviewflexibledivider;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.q;
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yqritc.recyclerviewflexibledivider.a;

/* compiled from: HorizontalDividerItemDecoration.java */
/* loaded from: classes7.dex */
public class b extends com.yqritc.recyclerviewflexibledivider.a {

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC1014b f72908l;

    /* compiled from: HorizontalDividerItemDecoration.java */
    public static class a extends a.d<a> {

        /* renamed from: j, reason: collision with root package name */
        private InterfaceC1014b f72909j;

        /* compiled from: HorizontalDividerItemDecoration.java */
        /* renamed from: com.yqritc.recyclerviewflexibledivider.b$a$a, reason: collision with other inner class name */
        class C1012a implements InterfaceC1014b {
            C1012a() {
            }

            @Override // com.yqritc.recyclerviewflexibledivider.b.InterfaceC1014b
            public int a(int position, RecyclerView parent) {
                return 0;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.b.InterfaceC1014b
            public int b(int position, RecyclerView parent) {
                return 0;
            }
        }

        /* compiled from: HorizontalDividerItemDecoration.java */
        /* renamed from: com.yqritc.recyclerviewflexibledivider.b$a$b, reason: collision with other inner class name */
        class C1013b implements InterfaceC1014b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f72911a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f72912b;

            C1013b(final int val$leftMargin, final int val$rightMargin) {
                this.f72911a = val$leftMargin;
                this.f72912b = val$rightMargin;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.b.InterfaceC1014b
            public int a(int position, RecyclerView parent) {
                return this.f72912b;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.b.InterfaceC1014b
            public int b(int position, RecyclerView parent) {
                return this.f72911a;
            }
        }

        public a(Context context) {
            super(context);
            this.f72909j = new C1012a();
        }

        public a A(final int leftMargin, final int rightMargin) {
            return B(new C1013b(leftMargin, rightMargin));
        }

        public a B(InterfaceC1014b provider) {
            this.f72909j = provider;
            return this;
        }

        public a C(@q int horizontalMarginId) {
            return D(horizontalMarginId, horizontalMarginId);
        }

        public a D(@q int leftMarginId, @q int rightMarginId) {
            return A(this.f72891b.getDimensionPixelSize(leftMarginId), this.f72891b.getDimensionPixelSize(rightMarginId));
        }

        public b y() {
            i();
            return new b(this);
        }

        public a z(int horizontalMargin) {
            return A(horizontalMargin, horizontalMargin);
        }
    }

    /* compiled from: HorizontalDividerItemDecoration.java */
    /* renamed from: com.yqritc.recyclerviewflexibledivider.b$b, reason: collision with other inner class name */
    public interface InterfaceC1014b {
        int a(int position, RecyclerView parent);

        int b(int position, RecyclerView parent);
    }

    protected b(a builder) {
        super(builder);
        this.f72908l = builder.f72909j;
    }

    private int j(int position, RecyclerView parent) {
        a.h hVar = this.f72879c;
        if (hVar != null) {
            return (int) hVar.a(position, parent).getStrokeWidth();
        }
        a.i iVar = this.f72882f;
        if (iVar != null) {
            return iVar.a(position, parent);
        }
        a.g gVar = this.f72881e;
        if (gVar != null) {
            return gVar.a(position, parent).getIntrinsicHeight();
        }
        throw new RuntimeException(ProtectedSandApp.s("彗\u0001"));
    }

    @Override // com.yqritc.recyclerviewflexibledivider.a
    protected Rect c(int position, RecyclerView parent, View child) {
        Rect rect = new Rect(0, 0, 0, 0);
        int B0 = (int) x1.B0(child);
        int translationY = (int) child.getTranslationY();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
        rect.left = this.f72908l.b(position, parent) + parent.getPaddingStart() + B0;
        rect.right = ((parent.getWidth() - parent.getPaddingRight()) - this.f72908l.a(position, parent)) + B0;
        int j4 = j(position, parent);
        boolean f4 = f(parent);
        if (this.f72877a != a.f.DRAWABLE) {
            int i4 = j4 / 2;
            if (f4) {
                rect.top = ((child.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - i4) + translationY;
            } else {
                rect.top = child.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4 + translationY;
            }
            rect.bottom = rect.top;
        } else if (f4) {
            int top2 = (child.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + translationY;
            rect.bottom = top2;
            rect.top = top2 - j4;
        } else {
            int bottom = child.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + translationY;
            rect.top = bottom;
            rect.bottom = bottom + j4;
        }
        if (this.f72884h) {
            if (f4) {
                rect.top += j4;
                rect.bottom += j4;
            } else {
                rect.top -= j4;
                rect.bottom -= j4;
            }
        }
        return rect;
    }

    @Override // com.yqritc.recyclerviewflexibledivider.a
    protected void g(Rect outRect, int position, RecyclerView parent) {
        if (this.f72884h) {
            outRect.set(0, 0, 0, 0);
        } else if (f(parent)) {
            outRect.set(0, j(position, parent), 0, 0);
        } else {
            outRect.set(0, 0, 0, j(position, parent));
        }
    }
}

package com.yqritc.recyclerviewflexibledivider;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.q;
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yqritc.recyclerviewflexibledivider.a;

/* compiled from: VerticalDividerItemDecoration.java */
/* loaded from: classes7.dex */
public class c extends com.yqritc.recyclerviewflexibledivider.a {

    /* renamed from: l, reason: collision with root package name */
    private b f72914l;

    /* compiled from: VerticalDividerItemDecoration.java */
    public static class a extends a.d<a> {

        /* renamed from: j, reason: collision with root package name */
        private b f72915j;

        /* compiled from: VerticalDividerItemDecoration.java */
        /* renamed from: com.yqritc.recyclerviewflexibledivider.c$a$a, reason: collision with other inner class name */
        class C1015a implements b {
            C1015a() {
            }

            @Override // com.yqritc.recyclerviewflexibledivider.c.b
            public int a(int position, RecyclerView parent) {
                return 0;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.c.b
            public int b(int position, RecyclerView parent) {
                return 0;
            }
        }

        /* compiled from: VerticalDividerItemDecoration.java */
        class b implements b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f72917a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f72918b;

            b(final int val$topMargin, final int val$bottomMargin) {
                this.f72917a = val$topMargin;
                this.f72918b = val$bottomMargin;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.c.b
            public int a(int position, RecyclerView parent) {
                return this.f72918b;
            }

            @Override // com.yqritc.recyclerviewflexibledivider.c.b
            public int b(int position, RecyclerView parent) {
                return this.f72917a;
            }
        }

        public a(Context context) {
            super(context);
            this.f72915j = new C1015a();
        }

        public a A(final int topMargin, final int bottomMargin) {
            return B(new b(topMargin, bottomMargin));
        }

        public a B(b provider) {
            this.f72915j = provider;
            return this;
        }

        public a C(@q int verticalMarginId) {
            return D(verticalMarginId, verticalMarginId);
        }

        public a D(@q int topMarginId, @q int bottomMarginId) {
            return A(this.f72891b.getDimensionPixelSize(topMarginId), this.f72891b.getDimensionPixelSize(bottomMarginId));
        }

        public c y() {
            i();
            return new c(this);
        }

        public a z(int verticalMargin) {
            return A(verticalMargin, verticalMargin);
        }
    }

    /* compiled from: VerticalDividerItemDecoration.java */
    public interface b {
        int a(int position, RecyclerView parent);

        int b(int position, RecyclerView parent);
    }

    protected c(a builder) {
        super(builder);
        this.f72914l = builder.f72915j;
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
            return gVar.a(position, parent).getIntrinsicWidth();
        }
        throw new RuntimeException(ProtectedSandApp.s("彘\u0001"));
    }

    @Override // com.yqritc.recyclerviewflexibledivider.a
    protected Rect c(int position, RecyclerView parent, View child) {
        Rect rect = new Rect(0, 0, 0, 0);
        int B0 = (int) x1.B0(child);
        int translationY = (int) child.getTranslationY();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
        rect.top = this.f72914l.b(position, parent) + parent.getPaddingTop() + translationY;
        rect.bottom = ((parent.getHeight() - parent.getPaddingBottom()) - this.f72914l.a(position, parent)) + translationY;
        int j4 = j(position, parent);
        boolean f4 = f(parent);
        if (this.f72877a != a.f.DRAWABLE) {
            int i4 = j4 / 2;
            if (f4) {
                rect.left = ((child.getLeft() - layoutParams.getMarginStart()) - i4) + B0;
            } else {
                rect.left = layoutParams.getMarginEnd() + child.getRight() + i4 + B0;
            }
            rect.right = rect.left;
        } else if (f4) {
            int left = (child.getLeft() - layoutParams.getMarginStart()) + B0;
            rect.right = left;
            rect.left = left - j4;
        } else {
            int marginEnd = layoutParams.getMarginEnd() + child.getRight() + B0;
            rect.left = marginEnd;
            rect.right = marginEnd + j4;
        }
        if (this.f72884h) {
            if (f4) {
                rect.left += j4;
                rect.right += j4;
            } else {
                rect.left -= j4;
                rect.right -= j4;
            }
        }
        return rect;
    }

    @Override // com.yqritc.recyclerviewflexibledivider.a
    protected void g(Rect outRect, int position, RecyclerView parent) {
        if (this.f72884h) {
            outRect.set(0, 0, 0, 0);
        } else if (f(parent)) {
            outRect.set(j(position, parent), 0, 0, 0);
        } else {
            outRect.set(0, 0, j(position, parent), 0);
        }
    }
}

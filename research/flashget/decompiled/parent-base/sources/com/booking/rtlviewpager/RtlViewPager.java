package com.booking.rtlviewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.viewpager.widget.ViewPager;
import java.util.Map;

/* loaded from: classes3.dex */
public class RtlViewPager extends ViewPager {

    /* renamed from: r3, reason: collision with root package name */
    @o0
    private final Map<ViewPager.i, d> f42767r3;

    /* renamed from: s3, reason: collision with root package name */
    @q0
    private DataSetObserver f42768s3;

    /* renamed from: t3, reason: collision with root package name */
    private boolean f42769t3;

    private static class b extends DataSetObserver {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final c f42770a;

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            this.f42770a.A();
        }

        private b(@o0 c cVar) {
            this.f42770a = cVar;
        }
    }

    private class c extends com.booking.rtlviewpager.a {

        /* renamed from: f, reason: collision with root package name */
        private int f42771f;

        public c(@o0 androidx.viewpager.widget.a aVar) {
            super(aVar);
            this.f42771f = aVar.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A() {
            int h4 = h();
            int i4 = this.f42771f;
            if (h4 != i4) {
                RtlViewPager.this.u0(Math.max(0, i4 - 1));
                this.f42771f = h4;
            }
        }

        private int B(int i4) {
            return (h() - i4) - 1;
        }

        @Override // com.booking.rtlviewpager.a, androidx.viewpager.widget.a
        public void e(ViewGroup viewGroup, int i4, Object obj) {
            super.e(viewGroup, B(i4), obj);
        }

        @Override // com.booking.rtlviewpager.a, androidx.viewpager.widget.a
        public int i(Object obj) {
            int i4 = super.i(obj);
            return i4 < 0 ? i4 : B(i4);
        }

        @Override // com.booking.rtlviewpager.a, androidx.viewpager.widget.a
        public CharSequence j(int i4) {
            return super.j(B(i4));
        }

        @Override // com.booking.rtlviewpager.a, androidx.viewpager.widget.a
        public float k(int i4) {
            return super.k(B(i4));
        }

        @Override // com.booking.rtlviewpager.a, androidx.viewpager.widget.a
        public Object m(ViewGroup viewGroup, int i4) {
            return super.m(viewGroup, B(i4));
        }

        @Override // com.booking.rtlviewpager.a, androidx.viewpager.widget.a
        public void t(ViewGroup viewGroup, int i4, Object obj) {
            super.t(viewGroup, (this.f42771f - i4) - 1, obj);
        }
    }

    private class d implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final ViewPager.i f42773a;

        /* renamed from: b, reason: collision with root package name */
        private int f42774b;

        private int b(int i4) {
            return RtlViewPager.this.u() == null ? i4 : (r0.h() - i4) - 1;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i4, float f4, int i5) {
            if (RtlViewPager.this.f42769t3) {
                return;
            }
            if (f4 == 0.0f && i5 == 0) {
                this.f42774b = b(i4);
            } else {
                this.f42774b = b(i4 + 1);
            }
            ViewPager.i iVar = this.f42773a;
            int i6 = this.f42774b;
            if (f4 > 0.0f) {
                f4 = 1.0f - f4;
            }
            iVar.a(i6, f4, i5);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i4) {
            if (RtlViewPager.this.f42769t3) {
                return;
            }
            this.f42773a.c(i4);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i4) {
            if (RtlViewPager.this.f42769t3) {
                return;
            }
            this.f42773a.d(b(i4));
        }

        private d(@o0 ViewPager.i iVar) {
            this.f42773a = iVar;
            this.f42774b = -1;
        }
    }

    public RtlViewPager(Context context) {
        super(context);
        this.f42767r3 = new androidx.collection.a(1);
    }

    private int r0(int i4) {
        if (i4 < 0 || !s0()) {
            return i4;
        }
        if (u() == null) {
            return 0;
        }
        return (u().h() - i4) - 1;
    }

    private void t0(androidx.viewpager.widget.a aVar) {
        if ((aVar instanceof c) && this.f42768s3 == null) {
            c cVar = (c) aVar;
            b bVar = new b(cVar);
            this.f42768s3 = bVar;
            aVar.p(bVar);
            cVar.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(int i4) {
        this.f42769t3 = true;
        Z(i4, false);
        this.f42769t3 = false;
    }

    private void v0() {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a u4 = super.u();
        if (!(u4 instanceof c) || (dataSetObserver = this.f42768s3) == null) {
            return;
        }
        u4.x(dataSetObserver);
        this.f42768s3 = null;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void T(@o0 ViewPager.i iVar) {
        if (s0()) {
            iVar = this.f42767r3.remove(iVar);
        }
        super.T(iVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void X(@q0 androidx.viewpager.widget.a aVar) {
        v0();
        boolean z4 = aVar != null && s0();
        if (z4) {
            c cVar = new c(aVar);
            t0(cVar);
            aVar = cVar;
        }
        super.X(aVar);
        if (z4) {
            u0(0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void Y(int i4) {
        super.Y(r0(i4));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void Z(int i4, boolean z4) {
        super.Z(r0(i4), z4);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void c(@o0 ViewPager.i iVar) {
        if (s0()) {
            d dVar = new d(iVar);
            this.f42767r3.put(iVar, dVar);
            iVar = dVar;
        }
        super.c(iVar);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t0(super.u());
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        v0();
        super.onDetachedFromWindow();
    }

    protected boolean s0() {
        return TextUtils.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void t(float f4) {
        if (!s0()) {
            f4 = -f4;
        }
        super.t(f4);
    }

    @Override // androidx.viewpager.widget.ViewPager
    @q0
    public androidx.viewpager.widget.a u() {
        androidx.viewpager.widget.a u4 = super.u();
        return u4 instanceof c ? ((c) u4).y() : u4;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int x() {
        return r0(super.x());
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42767r3 = new androidx.collection.a(1);
    }
}

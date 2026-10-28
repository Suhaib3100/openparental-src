package com.applandeo.materialcalendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.annimon.stream.p;
import com.applandeo.materialcalendarview.exceptions.OutOfDateRangeException;
import com.applandeo.materialcalendarview.extensions.CalendarViewPager;
import com.applandeo.materialcalendarview.n;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class CalendarView extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final int f41853m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f41854n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f41855o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f41856p = 3;

    /* renamed from: b, reason: collision with root package name */
    private Context f41857b;

    /* renamed from: c, reason: collision with root package name */
    private com.applandeo.materialcalendarview.adapters.f f41858c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f41859d;

    /* renamed from: e, reason: collision with root package name */
    private ImageButton f41860e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f41861f;

    /* renamed from: g, reason: collision with root package name */
    private int f41862g;

    /* renamed from: h, reason: collision with root package name */
    private CalendarViewPager f41863h;

    /* renamed from: i, reason: collision with root package name */
    private t3.f f41864i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f41865j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnClickListener f41866k;

    /* renamed from: l, reason: collision with root package name */
    private final ViewPager.i f41867l;

    class a implements ViewPager.i {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i4, float f4, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i4) {
            Calendar calendar = (Calendar) CalendarView.this.f41864i.r().clone();
            calendar.add(2, i4);
            if (CalendarView.this.r(calendar, i4)) {
                return;
            }
            CalendarView.this.F(calendar, i4);
            CalendarView.this.S(calendar);
        }
    }

    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41865j = new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarView.this.t(view);
            }
        };
        this.f41866k = new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarView.this.u(view);
            }
        };
        this.f41867l = new a();
        p(context, attributeSet);
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Calendar calendar, int i4) {
        this.f41861f.setText(t3.h.c(this.f41857b, calendar));
        h(i4);
    }

    private void Q(Calendar calendar) {
        t3.h.h(calendar);
        if (this.f41864i.j() == 1) {
            this.f41864i.D0(calendar);
        }
        this.f41864i.r().setTime(calendar.getTime());
        this.f41864i.r().add(2, -1200);
        this.f41863h.Y(1200);
        S(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(Calendar calendar) {
        if (!this.f41864i.L()) {
            this.f41860e.setEnabled(true);
            this.f41859d.setEnabled(true);
            return;
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(2, -1);
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.add(2, 1);
        boolean z4 = !t3.h.g(this.f41864i.B(), calendar2);
        boolean z5 = !t3.h.f(this.f41864i.z(), calendar3);
        this.f41860e.setEnabled(z4);
        this.f41859d.setEnabled(z5);
    }

    public static /* synthetic */ Calendar a(Calendar calendar) {
        return calendar;
    }

    private void h(int i4) {
        if (i4 > this.f41862g && this.f41864i.E() != null) {
            this.f41864i.E().onChange();
        }
        if (i4 < this.f41862g && this.f41864i.G() != null) {
            this.f41864i.G().onChange();
        }
        if (i4 == this.f41862g && this.f41864i.F() != null) {
            this.f41864i.F().onChange();
        }
        this.f41862g = i4;
    }

    private void m() {
        t3.a.e(getRootView(), this.f41864i.t());
        t3.a.g(getRootView(), this.f41864i.v());
        t3.a.b(getRootView(), this.f41864i.f());
        t3.a.h(getRootView(), this.f41864i.C());
        t3.a.f(getRootView(), this.f41864i.u());
        t3.a.a(getRootView(), this.f41864i.e());
        t3.a.c(getRootView(), this.f41864i.g(), this.f41864i.r().getFirstDayOfWeek());
        t3.a.i(getRootView(), this.f41864i.J());
        t3.a.j(getRootView(), this.f41864i.K());
        t3.a.d(getRootView(), this.f41864i.s());
        this.f41863h.p0(this.f41864i.P());
        x();
    }

    private void n() {
        com.applandeo.materialcalendarview.adapters.f fVar = new com.applandeo.materialcalendarview.adapters.f(this.f41857b, this.f41864i);
        this.f41858c = fVar;
        this.f41863h.X(fVar);
        this.f41863h.c(this.f41867l);
        Q(Calendar.getInstance());
    }

    private void o(TypedArray typedArray) {
        this.f41864i.k0(typedArray.getColor(n.m.X3, 0));
        this.f41864i.l0(typedArray.getColor(n.m.Y3, 0));
        this.f41864i.W(typedArray.getColor(n.m.H3, 0));
        this.f41864i.Y(typedArray.getColor(n.m.I3, 0));
        this.f41864i.A0(typedArray.getColor(n.m.f42515b4, 0));
        this.f41864i.d0(typedArray.getColor(n.m.T3, 0));
        this.f41864i.Z(typedArray.getColor(n.m.J3, 0));
        this.f41864i.K0(typedArray.getColor(n.m.g4, 0));
        this.f41864i.G0(typedArray.getColor(n.m.f42537d4, 0));
        this.f41864i.H0(typedArray.getColor(n.m.e4, 0));
        this.f41864i.g0(typedArray.getColor(n.m.U3, 0));
        this.f41864i.o0(typedArray.getColor(n.m.Z3, 0));
        this.f41864i.b0(typedArray.getInt(n.m.h4, 0));
        this.f41864i.r0(typedArray.getInt(n.m.f42505a4, 0));
        if (typedArray.getBoolean(n.m.S3, false)) {
            this.f41864i.b0(1);
        }
        this.f41864i.i0(typedArray.getBoolean(n.m.V3, this.f41864i.j() == 0));
        this.f41864i.I0(typedArray.getBoolean(n.m.f4, true));
        this.f41864i.B0(typedArray.getDrawable(n.m.f42526c4));
        this.f41864i.j0(typedArray.getDrawable(n.m.W3));
    }

    private void p(Context context, AttributeSet attributeSet) {
        this.f41857b = context;
        this.f41864i = new t3.f(context);
        ((LayoutInflater) context.getSystemService(ProtectedSandApp.s("ߵ"))).inflate(n.j.C, this);
        q();
        w(attributeSet);
    }

    private void q() {
        ImageButton imageButton = (ImageButton) findViewById(n.h.X);
        this.f41859d = imageButton;
        imageButton.setOnClickListener(this.f41865j);
        ImageButton imageButton2 = (ImageButton) findViewById(n.h.D0);
        this.f41860e = imageButton2;
        imageButton2.setOnClickListener(this.f41866k);
        this.f41861f = (TextView) findViewById(n.h.J);
        this.f41863h = (CalendarViewPager) findViewById(n.h.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(Calendar calendar, int i4) {
        if (!this.f41864i.L()) {
            return false;
        }
        if (t3.h.g(this.f41864i.B(), calendar)) {
            this.f41863h.Y(i4 + 1);
            return true;
        }
        if (!t3.h.f(this.f41864i.z(), calendar)) {
            return false;
        }
        this.f41863h.Y(i4 - 1);
        return true;
    }

    private static /* synthetic */ Calendar s(Calendar calendar) {
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view) {
        CalendarViewPager calendarViewPager = this.f41863h;
        calendarViewPager.Y(calendarViewPager.x() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(View view) {
        this.f41863h.Y(r2.x() - 1);
    }

    private void w(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.m.G3);
        try {
            o(obtainStyledAttributes);
            m();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void x() {
        if (this.f41864i.q()) {
            this.f41864i.p0(n.j.D);
        } else {
            this.f41864i.p0(n.j.F);
        }
    }

    public void A(List<Calendar> list) {
        this.f41864i.f0(list);
    }

    public void B(List<m> list) {
        if (this.f41864i.q()) {
            this.f41864i.h0(list);
            this.f41858c.o();
        }
    }

    public void C(Drawable drawable) {
        this.f41864i.j0(drawable);
        t3.a.d(getRootView(), this.f41864i.s());
    }

    public void D(@androidx.annotation.n int i4) {
        this.f41864i.k0(i4);
        t3.a.e(getRootView(), this.f41864i.t());
    }

    public void E(@androidx.annotation.n int i4) {
        this.f41864i.l0(i4);
        t3.a.f(getRootView(), this.f41864i.u());
    }

    public void G(int i4) {
        this.f41864i.m0(i4);
        t3.a.g(getRootView(), this.f41864i.v());
    }

    public void H(List<Calendar> list) {
        this.f41864i.n0(list);
    }

    public void I(Calendar calendar) {
        this.f41864i.q0(calendar);
        S(i());
    }

    public void J(Calendar calendar) {
        this.f41864i.s0(calendar);
        S(i());
    }

    public void K(s3.i iVar) {
        this.f41864i.u0(iVar);
    }

    public void L(s3.h hVar) {
        this.f41864i.v0(hVar);
    }

    public void M(s3.h hVar) {
        this.f41864i.x0(hVar);
    }

    public void N(Drawable drawable) {
        this.f41864i.B0(drawable);
        t3.a.j(getRootView(), this.f41864i.K());
    }

    public void O(List<Calendar> list) {
        this.f41864i.F0(list);
        this.f41858c.o();
    }

    public void P(boolean z4) {
        this.f41864i.I0(z4);
        this.f41863h.p0(this.f41864i.P());
    }

    public void R() {
        CalendarViewPager calendarViewPager = this.f41863h;
        calendarViewPager.Z(calendarViewPager.x() - t3.h.d(t3.h.a(), i()), true);
    }

    public Calendar i() {
        Calendar calendar = (Calendar) this.f41864i.r().clone();
        calendar.set(5, 1);
        calendar.add(2, this.f41863h.x());
        return calendar;
    }

    public Calendar j() {
        return (Calendar) p.N0(this.f41858c.A()).c0(new e()).z().h();
    }

    @Deprecated
    public Calendar k() {
        return j();
    }

    public List<Calendar> l() {
        return p.N0(this.f41858c.A()).c0(new e()).g2(new f()).G2();
    }

    public void v(int i4) {
        this.f41864i.X(i4);
        t3.a.b(getRootView(), this.f41864i.f());
    }

    public void y(Calendar calendar) throws OutOfDateRangeException {
        if (this.f41864i.B() != null && calendar.before(this.f41864i.B())) {
            throw new OutOfDateRangeException(ProtectedSandApp.s("߶"));
        }
        if (this.f41864i.z() != null && calendar.after(this.f41864i.z())) {
            throw new OutOfDateRangeException(ProtectedSandApp.s("߷"));
        }
        Q(calendar);
        this.f41861f.setText(t3.h.c(this.f41857b, calendar));
        this.f41858c.o();
    }

    public void z(Date date) throws OutOfDateRangeException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        y(calendar);
    }

    public CalendarView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f41865j = new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarView.this.t(view);
            }
        };
        this.f41866k = new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarView.this.u(view);
            }
        };
        this.f41867l = new a();
        p(context, attributeSet);
        n();
    }

    protected CalendarView(Context context, t3.f fVar) {
        super(context);
        this.f41865j = new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarView.this.t(view);
            }
        };
        this.f41866k = new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarView.this.u(view);
            }
        };
        this.f41867l = new a();
        this.f41857b = context;
        this.f41864i = fVar;
        ((LayoutInflater) context.getSystemService(ProtectedSandApp.s("ߵ"))).inflate(n.j.C, this);
        q();
        m();
        n();
    }
}

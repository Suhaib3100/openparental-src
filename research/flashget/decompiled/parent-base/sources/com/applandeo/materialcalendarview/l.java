package com.applandeo.materialcalendarview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.x1;
import com.applandeo.materialcalendarview.exceptions.OutOfDateRangeException;
import com.applandeo.materialcalendarview.n;
import java.util.Calendar;

/* compiled from: DatePicker.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f41897a;

    /* renamed from: b, reason: collision with root package name */
    private t3.f f41898b;

    /* renamed from: c, reason: collision with root package name */
    private AppCompatButton f41899c;

    /* renamed from: d, reason: collision with root package name */
    private AppCompatButton f41900d;

    /* renamed from: e, reason: collision with root package name */
    private AppCompatButton f41901e;

    public l(Context context, t3.f fVar) {
        this.f41897a = context;
        this.f41898b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(CalendarView calendarView, Calendar calendar) {
        try {
            calendarView.y(calendar);
        } catch (OutOfDateRangeException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(androidx.appcompat.app.c cVar, CalendarView calendarView, View view) {
        cVar.cancel();
        this.f41898b.H().a(calendarView.l());
    }

    private void j() {
        if (this.f41898b.m() != 0) {
            this.f41899c.setTextColor(androidx.core.content.d.getColor(this.f41897a, n.e.N));
            this.f41901e.setTextColor(androidx.core.content.d.getColor(this.f41897a, this.f41898b.m()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z4) {
        this.f41900d.setEnabled(true);
        if (this.f41898b.m() != 0) {
            this.f41900d.setTextColor(androidx.core.content.d.getColor(this.f41897a, this.f41898b.m()));
        }
    }

    private void l() {
        if (t3.h.f(this.f41898b.z(), t3.h.a()) || t3.h.g(this.f41898b.B(), t3.h.a())) {
            this.f41901e.setVisibility(8);
        }
    }

    public l m() {
        View inflate = LayoutInflater.from(this.f41897a).inflate(n.j.G, (ViewGroup) null);
        View findViewById = inflate.findViewById(n.h.M);
        if (this.f41898b.J() != 0) {
            Drawable mutate = findViewById.getBackground().mutate();
            mutate.setTint(this.f41898b.J());
            x1.P1(findViewById, mutate);
        }
        this.f41899c = (AppCompatButton) inflate.findViewById(n.h.f42283r0);
        this.f41900d = (AppCompatButton) inflate.findViewById(n.h.C0);
        this.f41901e = (AppCompatButton) inflate.findViewById(n.h.A1);
        l();
        j();
        k(this.f41898b.j() == 1);
        this.f41898b.z0(new s3.k() { // from class: com.applandeo.materialcalendarview.g
            @Override // s3.k
            public final void a(boolean z4) {
                l.this.k(z4);
            }
        });
        final CalendarView calendarView = new CalendarView(this.f41897a, this.f41898b);
        ((FrameLayout) inflate.findViewById(n.h.A)).addView(calendarView);
        com.annimon.stream.j.s(this.f41898b.i()).i(new com.annimon.stream.function.h() { // from class: com.applandeo.materialcalendarview.h
            @Override // com.annimon.stream.function.h
            public final void accept(Object obj) {
                l.f(CalendarView.this, (Calendar) obj);
            }
        });
        final androidx.appcompat.app.c a5 = new c.a(this.f41897a).a();
        a5.A(inflate);
        this.f41899c.setOnClickListener(new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                androidx.appcompat.app.c.this.cancel();
            }
        });
        this.f41900d.setOnClickListener(new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.this.h(a5, calendarView, view);
            }
        });
        this.f41901e.setOnClickListener(new View.OnClickListener() { // from class: com.applandeo.materialcalendarview.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarView.this.R();
            }
        });
        a5.show();
        Window window = a5.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.4f;
            window.setAttributes(attributes);
            x1.V1(window.getDecorView(), 0.0f);
        }
        return this;
    }
}

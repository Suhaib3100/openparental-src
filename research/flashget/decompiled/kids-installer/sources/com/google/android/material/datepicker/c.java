package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import n1.a;

/* compiled from: DateFormatTextWatcher.java */
/* loaded from: classes3.dex */
abstract class c extends com.google.android.material.internal.m {

    /* renamed from: u, reason: collision with root package name */
    private static final int f13346u = 1000;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final TextInputLayout f13347o;

    /* renamed from: p, reason: collision with root package name */
    private final DateFormat f13348p;

    /* renamed from: q, reason: collision with root package name */
    private final CalendarConstraints f13349q;

    /* renamed from: r, reason: collision with root package name */
    private final String f13350r;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f13351s;

    /* renamed from: t, reason: collision with root package name */
    private Runnable f13352t;

    /* compiled from: DateFormatTextWatcher.java */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f13353o;

        a(String str) {
            this.f13353o = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout textInputLayout = c.this.f13347o;
            DateFormat dateFormat = c.this.f13348p;
            Context context = textInputLayout.getContext();
            String string = context.getString(a.m.f29985x0);
            String format = String.format(context.getString(a.m.f29989z0), this.f13353o);
            String format2 = String.format(context.getString(a.m.f29987y0), dateFormat.format(new Date(q.t().getTimeInMillis())));
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String s5 = ProtectedSandApp.s("ሙ");
            sb.append(s5);
            sb.append(format);
            sb.append(s5);
            sb.append(format2);
            textInputLayout.V1(sb.toString());
            c.this.e();
        }
    }

    /* compiled from: DateFormatTextWatcher.java */
    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f13355o;

        b(long j5) {
            this.f13355o = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f13347o.V1(String.format(c.this.f13350r, d.d(this.f13355o, null)));
            c.this.e();
        }
    }

    c(String str, DateFormat dateFormat, @o0 TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f13348p = dateFormat;
        this.f13347o = textInputLayout;
        this.f13349q = calendarConstraints;
        this.f13350r = textInputLayout.getContext().getString(a.m.C0);
        this.f13351s = new a(str);
    }

    private Runnable d(long j5) {
        return new b(j5);
    }

    void e() {
    }

    abstract void f(@q0 Long l5);

    public void g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    @Override // com.google.android.material.internal.m, android.text.TextWatcher
    public void onTextChanged(@o0 CharSequence charSequence, int i5, int i6, int i7) {
        this.f13347o.removeCallbacks(this.f13351s);
        this.f13347o.removeCallbacks(this.f13352t);
        this.f13347o.V1(null);
        f(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date parse = this.f13348p.parse(charSequence.toString());
            this.f13347o.V1(null);
            long time = parse.getTime();
            if (this.f13349q.f().E0(time) && this.f13349q.l(time)) {
                f(Long.valueOf(parse.getTime()));
                return;
            }
            b bVar = new b(time);
            this.f13352t = bVar;
            g(this.f13347o, bVar);
        } catch (ParseException unused) {
            g(this.f13347o, this.f13351s);
        }
    }
}

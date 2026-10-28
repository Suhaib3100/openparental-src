package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import s8.a;

/* compiled from: DateFormatTextWatcher.java */
/* loaded from: classes6.dex */
abstract class c extends com.google.android.material.internal.m {

    /* renamed from: h, reason: collision with root package name */
    private static final int f53099h = 1000;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final TextInputLayout f53100b;

    /* renamed from: c, reason: collision with root package name */
    private final DateFormat f53101c;

    /* renamed from: d, reason: collision with root package name */
    private final CalendarConstraints f53102d;

    /* renamed from: e, reason: collision with root package name */
    private final String f53103e;

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f53104f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f53105g;

    /* compiled from: DateFormatTextWatcher.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53106b;

        a(String str) {
            this.f53106b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout textInputLayout = c.this.f53100b;
            DateFormat dateFormat = c.this.f53101c;
            Context context = textInputLayout.getContext();
            String string = context.getString(a.m.f91257x0);
            String format = String.format(context.getString(a.m.f91261z0), this.f53106b);
            String format2 = String.format(context.getString(a.m.f91259y0), dateFormat.format(new Date(q.t().getTimeInMillis())));
            String s4 = ProtectedSandApp.s("\uf198");
            textInputLayout.V1(androidx.core.provider.f.a(string, s4, format, s4, format2));
            c.this.e();
        }
    }

    /* compiled from: DateFormatTextWatcher.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f53108b;

        b(long j4) {
            this.f53108b = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f53100b.V1(String.format(c.this.f53103e, d.d(this.f53108b, null)));
            c.this.e();
        }
    }

    c(String str, DateFormat dateFormat, @o0 TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f53101c = dateFormat;
        this.f53100b = textInputLayout;
        this.f53102d = calendarConstraints;
        this.f53103e = textInputLayout.getContext().getString(a.m.C0);
        this.f53104f = new a(str);
    }

    private Runnable d(long j4) {
        return new b(j4);
    }

    void e() {
    }

    abstract void f(@q0 Long l4);

    public void g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    @Override // com.google.android.material.internal.m, android.text.TextWatcher
    public void onTextChanged(@o0 CharSequence charSequence, int i4, int i5, int i6) {
        this.f53100b.removeCallbacks(this.f53104f);
        this.f53100b.removeCallbacks(this.f53105g);
        this.f53100b.V1(null);
        f(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date parse = this.f53101c.parse(charSequence.toString());
            this.f53100b.V1(null);
            long time = parse.getTime();
            if (this.f53102d.f().j1(time) && this.f53102d.o(time)) {
                f(Long.valueOf(parse.getTime()));
                return;
            }
            b bVar = new b(time);
            this.f53105g = bVar;
            g(this.f53100b, bVar);
        } catch (ParseException unused) {
            g(this.f53100b, this.f53104f);
        }
    }
}

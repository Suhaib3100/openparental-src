package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Calendar;
import java.util.Locale;
import n1.a;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes2.dex */
class e extends BaseAdapter {

    /* renamed from: r, reason: collision with root package name */
    private static final int f13357r = 4;

    /* renamed from: s, reason: collision with root package name */
    private static final int f13358s;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final Calendar f13359o;

    /* renamed from: p, reason: collision with root package name */
    private final int f13360p;

    /* renamed from: q, reason: collision with root package name */
    private final int f13361q;

    static {
        f13358s = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar v5 = q.v();
        this.f13359o = v5;
        this.f13360p = v5.getMaximum(7);
        this.f13361q = v5.getFirstDayOfWeek();
    }

    private int b(int i5) {
        int i6 = i5 + this.f13361q;
        int i7 = this.f13360p;
        return i6 > i7 ? i6 - i7 : i6;
    }

    @Override // android.widget.Adapter
    @q0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i5) {
        if (i5 >= this.f13360p) {
            return null;
        }
        return Integer.valueOf(b(i5));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f13360p;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @q0
    @SuppressLint({"WrongConstant"})
    public View getView(int i5, @q0 View view, @o0 ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f29912n0, viewGroup, false);
        }
        this.f13359o.set(7, b(i5));
        textView.setText(this.f13359o.getDisplayName(7, f13358s, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(a.m.f29983w0), this.f13359o.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}

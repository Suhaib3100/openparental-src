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
import s8.a;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes6.dex */
class e extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static final int f53110e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f53111f;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Calendar f53112b;

    /* renamed from: c, reason: collision with root package name */
    private final int f53113c;

    /* renamed from: d, reason: collision with root package name */
    private final int f53114d;

    static {
        f53111f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar v4 = q.v();
        this.f53112b = v4;
        this.f53113c = v4.getMaximum(7);
        this.f53114d = v4.getFirstDayOfWeek();
    }

    private int b(int i4) {
        int i5 = i4 + this.f53114d;
        int i6 = this.f53113c;
        return i5 > i6 ? i5 - i6 : i5;
    }

    @Override // android.widget.Adapter
    @q0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i4) {
        if (i4 >= this.f53113c) {
            return null;
        }
        return Integer.valueOf(b(i4));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f53113c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @q0
    @SuppressLint({"WrongConstant"})
    public View getView(int i4, @q0 View view, @o0 ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f91184n0, viewGroup, false);
        }
        this.f53112b.set(7, b(i4));
        textView.setText(this.f53112b.getDisplayName(7, f53111f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(a.m.f91255w0), this.f53112b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}

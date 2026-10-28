package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.s;
import java.util.Collection;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public interface DateSelector<S> extends Parcelable {
    void E3(long j4);

    @g1
    int S();

    @o0
    View T2(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle, @o0 CalendarConstraints calendarConstraints, @o0 m<S> mVar);

    @h1
    int e1(Context context);

    @o0
    String e2(Context context);

    @o0
    Collection<s<Long, Long>> g2();

    @q0
    S getSelection();

    boolean i3();

    @o0
    Collection<Long> j3();

    void l2(@o0 S s4);
}

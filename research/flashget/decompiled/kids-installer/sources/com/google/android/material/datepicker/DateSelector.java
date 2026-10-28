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
import java.util.Collection;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    @h1
    int A0(Context context);

    void B(@o0 S s5);

    boolean F0();

    @o0
    Collection<Long> M0();

    @q0
    S U0();

    void f1(long j5);

    @o0
    View m0(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle, @o0 CalendarConstraints calendarConstraints, @o0 m<S> mVar);

    @g1
    int n0();

    @o0
    String o(Context context);

    @o0
    Collection<androidx.core.util.m<Long, Long>> z();
}

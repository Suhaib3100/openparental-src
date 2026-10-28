package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule.java */
@h1.h
/* loaded from: classes2.dex */
abstract class l {
    l() {
    }

    @h1.i
    @h3.f
    @SuppressLint({"ThreadPoolCreation"})
    static Executor a() {
        return new q(Executors.newSingleThreadExecutor());
    }
}

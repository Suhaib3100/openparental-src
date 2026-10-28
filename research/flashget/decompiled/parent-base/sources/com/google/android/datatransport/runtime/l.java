package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule.java */
@m8.e
/* loaded from: classes5.dex */
abstract class l {
    l() {
    }

    @cd.f
    @SuppressLint({"ThreadPoolCreation"})
    @m8.f
    static Executor a() {
        return new q(Executors.newSingleThreadExecutor());
    }
}

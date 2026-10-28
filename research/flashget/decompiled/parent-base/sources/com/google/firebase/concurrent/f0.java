package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* compiled from: PausableExecutor.java */
/* loaded from: classes6.dex */
public interface f0 extends Executor {
    boolean d1();

    void pause();

    void resume();
}

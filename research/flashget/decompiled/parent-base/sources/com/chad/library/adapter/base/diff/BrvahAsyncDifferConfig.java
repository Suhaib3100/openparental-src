package com.chad.library.adapter.base.diff;

import androidx.annotation.c1;
import androidx.recyclerview.widget.k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: BrvahAsyncDifferConfig.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0011B'\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "T", "", "Ljava/util/concurrent/Executor;", "mainThreadExecutor", "backgroundThreadExecutor", "Landroidx/recyclerview/widget/k$f;", "diffCallback", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/recyclerview/widget/k$f;)V", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor", "()Ljava/util/concurrent/Executor;", "getBackgroundThreadExecutor", "Landroidx/recyclerview/widget/k$f;", "getDiffCallback", "()Landroidx/recyclerview/widget/k$f;", "Builder", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class BrvahAsyncDifferConfig<T> {

    @l
    private final Executor backgroundThreadExecutor;

    @l
    private final k.f<T> diffCallback;

    @m
    @c1({c1.a.LIBRARY})
    private final Executor mainThreadExecutor;

    /* compiled from: BrvahAsyncDifferConfig.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0013*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0013B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig$Builder;", "T", "", "Landroidx/recyclerview/widget/k$f;", "mDiffCallback", "<init>", "(Landroidx/recyclerview/widget/k$f;)V", "Ljava/util/concurrent/Executor;", "executor", "setMainThreadExecutor", "(Ljava/util/concurrent/Executor;)Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig$Builder;", "setBackgroundThreadExecutor", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "build", "()Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "mBackgroundThreadExecutor", "Landroidx/recyclerview/widget/k$f;", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
    public static final class Builder<T> {
        private static Executor sDiffExecutor;
        private Executor mBackgroundThreadExecutor;
        private final k.f<T> mDiffCallback;
        private Executor mMainThreadExecutor;
        private static final Object sExecutorLock = new Object();

        public Builder(@l k.f<T> fVar) {
            l0.q(fVar, ProtectedSandApp.s("\u0ee1"));
            this.mDiffCallback = fVar;
        }

        @l
        public final BrvahAsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    try {
                        if (sDiffExecutor == null) {
                            sDiffExecutor = Executors.newFixedThreadPool(2);
                        }
                        k2 k2Var = k2.f75408a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            Executor executor = this.mMainThreadExecutor;
            Executor executor2 = this.mBackgroundThreadExecutor;
            if (executor2 == null) {
                l0.L();
            }
            return new BrvahAsyncDifferConfig<>(executor, executor2, this.mDiffCallback);
        }

        @l
        public final Builder<T> setBackgroundThreadExecutor(@m Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        @l
        public final Builder<T> setMainThreadExecutor(@m Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }
    }

    public BrvahAsyncDifferConfig(@m Executor executor, @l Executor executor2, @l k.f<T> fVar) {
        l0.q(executor2, ProtectedSandApp.s("\u0ee2"));
        l0.q(fVar, ProtectedSandApp.s("\u0ee3"));
        this.mainThreadExecutor = executor;
        this.backgroundThreadExecutor = executor2;
        this.diffCallback = fVar;
    }

    @l
    public final Executor getBackgroundThreadExecutor() {
        return this.backgroundThreadExecutor;
    }

    @l
    public final k.f<T> getDiffCallback() {
        return this.diffCallback;
    }

    @m
    public final Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }
}

package com.chad.library.adapter.base.diff;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: BrvahAsyncDiffer.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001<B'\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00028\u00002\b\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u001bJ+\u0010'\u001a\u00020\u000f2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b'\u0010\u0015J\u001d\u0010*\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010:R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;¨\u0006="}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "T", "Lcom/chad/library/adapter/base/diff/DifferImp;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "config", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "", "newList", "Landroidx/recyclerview/widget/k$e;", "diffResult", "Ljava/lang/Runnable;", "commitCallback", "Lkotlin/k2;", "latchList", "(Ljava/util/List;Landroidx/recyclerview/widget/k$e;Ljava/lang/Runnable;)V", "", "previousList", "onCurrentListChanged", "(Ljava/util/List;Ljava/lang/Runnable;)V", "", "index", "data", "addData", "(ILjava/lang/Object;)V", "(Ljava/lang/Object;)V", "list", "addList", "(Ljava/util/List;)V", "newData", "payload", "changeData", "(ILjava/lang/Object;Ljava/lang/Object;)V", "removeAt", "(I)V", "t", "remove", "submitList", "Lcom/chad/library/adapter/base/diff/ListChangeListener;", "listener", "addListListener", "(Lcom/chad/library/adapter/base/diff/ListChangeListener;)V", "removeListListener", "clearAllListListener", "()V", "Landroidx/recyclerview/widget/v;", "mUpdateCallback", "Landroidx/recyclerview/widget/v;", "Ljava/util/concurrent/Executor;", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "sMainThreadExecutor", "mListeners", "Ljava/util/List;", "mMaxScheduledGeneration", "I", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "MainThreadExecutor", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class BrvahAsyncDiffer<T> implements DifferImp<T> {
    private final BaseQuickAdapter<T, ?> adapter;
    private final BrvahAsyncDifferConfig<T> config;
    private final List<ListChangeListener<T>> mListeners;
    private Executor mMainThreadExecutor;
    private int mMaxScheduledGeneration;
    private final v mUpdateCallback;
    private final Executor sMainThreadExecutor;

    /* compiled from: BrvahAsyncDiffer.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Lkotlin/k2;", "execute", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
    private static final class MainThreadExecutor implements Executor {

        @l
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@l Runnable command) {
            l0.q(command, ProtectedSandApp.s("ໜ"));
            this.mHandler.post(command);
        }

        @l
        public final Handler getMHandler() {
            return this.mHandler;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor] */
    public BrvahAsyncDiffer(@l BaseQuickAdapter<T, ?> baseQuickAdapter, @l BrvahAsyncDifferConfig<T> brvahAsyncDifferConfig) {
        l0.q(baseQuickAdapter, ProtectedSandApp.s("ໞ"));
        l0.q(brvahAsyncDifferConfig, ProtectedSandApp.s("ໟ"));
        this.adapter = baseQuickAdapter;
        this.config = brvahAsyncDifferConfig;
        this.mUpdateCallback = new BrvahListUpdateCallback(baseQuickAdapter);
        MainThreadExecutor mainThreadExecutor = new MainThreadExecutor();
        this.sMainThreadExecutor = mainThreadExecutor;
        ?? mainThreadExecutor2 = brvahAsyncDifferConfig.getMainThreadExecutor();
        this.mMainThreadExecutor = mainThreadExecutor2 != 0 ? mainThreadExecutor2 : mainThreadExecutor;
        this.mListeners = new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void latchList(List<T> newList, k.e diffResult, Runnable commitCallback) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.setData$com_github_CymChad_brvah(newList);
        diffResult.d(this.mUpdateCallback);
        onCurrentListChanged(data, commitCallback);
    }

    private final void onCurrentListChanged(List<? extends T> previousList, Runnable commitCallback) {
        Iterator<ListChangeListener<T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(previousList, this.adapter.getData());
        }
        if (commitCallback != null) {
            commitCallback.run();
        }
    }

    public static /* synthetic */ void submitList$default(BrvahAsyncDiffer brvahAsyncDiffer, List list, Runnable runnable, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            runnable = null;
        }
        brvahAsyncDiffer.submitList(list, runnable);
    }

    public final void addData(int index, T data) {
        List<? extends T> data2 = this.adapter.getData();
        this.adapter.getData().add(index, data);
        this.mUpdateCallback.onInserted(index, 1);
        onCurrentListChanged(data2, null);
    }

    public final void addList(@m List<? extends T> list) {
        if (list == null) {
            return;
        }
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().addAll(list);
        this.mUpdateCallback.onInserted(data.size(), list.size());
        onCurrentListChanged(data, null);
    }

    @Override // com.chad.library.adapter.base.diff.DifferImp
    public void addListListener(@l ListChangeListener<T> listener) {
        l0.q(listener, ProtectedSandApp.s("\u0ee0"));
        this.mListeners.add(listener);
    }

    public final void changeData(int index, T newData, @m T payload) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().set(index, newData);
        this.mUpdateCallback.onChanged(index, 1, payload);
        onCurrentListChanged(data, null);
    }

    public final void clearAllListListener() {
        this.mListeners.clear();
    }

    public final void remove(T t4) {
        List<? extends T> data = this.adapter.getData();
        int indexOf = this.adapter.getData().indexOf(t4);
        if (indexOf == -1) {
            return;
        }
        this.adapter.getData().remove(indexOf);
        this.mUpdateCallback.onRemoved(indexOf, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeAt(int index) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().remove(index);
        this.mUpdateCallback.onRemoved(index, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeListListener(@l ListChangeListener<T> listener) {
        l0.q(listener, ProtectedSandApp.s("\u0ee0"));
        this.mListeners.remove(listener);
    }

    @j
    public final void submitList(@m List<T> list) {
        submitList$default(this, list, null, 2, null);
    }

    @j
    public final void submitList(@m List<T> newList, @m Runnable commitCallback) {
        int i4 = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i4;
        if (newList == this.adapter.getData()) {
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        List<? extends T> data = this.adapter.getData();
        if (newList == null) {
            int size = this.adapter.getData().size();
            this.adapter.setData$com_github_CymChad_brvah(new ArrayList());
            this.mUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(data, commitCallback);
            return;
        }
        if (!this.adapter.getData().isEmpty()) {
            this.config.getBackgroundThreadExecutor().execute(new BrvahAsyncDiffer$submitList$1(this, data, newList, i4, commitCallback));
            return;
        }
        this.adapter.setData$com_github_CymChad_brvah(newList);
        this.mUpdateCallback.onInserted(0, newList.size());
        onCurrentListChanged(data, commitCallback);
    }

    public final void addData(T data) {
        List<? extends T> data2 = this.adapter.getData();
        this.adapter.getData().add(data);
        this.mUpdateCallback.onInserted(data2.size(), 1);
        onCurrentListChanged(data2, null);
    }
}

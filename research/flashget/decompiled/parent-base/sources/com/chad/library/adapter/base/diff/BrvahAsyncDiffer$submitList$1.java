package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: BrvahAsyncDiffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class BrvahAsyncDiffer$submitList$1 implements Runnable {
    final /* synthetic */ Runnable $commitCallback;
    final /* synthetic */ List $newList;
    final /* synthetic */ List $oldList;
    final /* synthetic */ int $runGeneration;
    final /* synthetic */ BrvahAsyncDiffer this$0;

    BrvahAsyncDiffer$submitList$1(BrvahAsyncDiffer brvahAsyncDiffer, List list, List list2, int i4, Runnable runnable) {
        this.this$0 = brvahAsyncDiffer;
        this.$oldList = list;
        this.$newList = list2;
        this.$runGeneration = i4;
        this.$commitCallback = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        final k.e b5 = k.b(new k.b() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$submitList$1$result$1
            @Override // androidx.recyclerview.widget.k.b
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                Object obj = BrvahAsyncDiffer$submitList$1.this.$oldList.get(oldItemPosition);
                Object obj2 = BrvahAsyncDiffer$submitList$1.this.$newList.get(newItemPosition);
                if (obj != null && obj2 != null) {
                    brvahAsyncDifferConfig = BrvahAsyncDiffer$submitList$1.this.this$0.config;
                    return brvahAsyncDifferConfig.getDiffCallback().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.k.b
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                Object obj = BrvahAsyncDiffer$submitList$1.this.$oldList.get(oldItemPosition);
                Object obj2 = BrvahAsyncDiffer$submitList$1.this.$newList.get(newItemPosition);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                brvahAsyncDifferConfig = BrvahAsyncDiffer$submitList$1.this.this$0.config;
                return brvahAsyncDifferConfig.getDiffCallback().areItemsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.k.b
            @m
            public Object getChangePayload(int oldItemPosition, int newItemPosition) {
                BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                Object obj = BrvahAsyncDiffer$submitList$1.this.$oldList.get(oldItemPosition);
                Object obj2 = BrvahAsyncDiffer$submitList$1.this.$newList.get(newItemPosition);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                brvahAsyncDifferConfig = BrvahAsyncDiffer$submitList$1.this.this$0.config;
                return brvahAsyncDifferConfig.getDiffCallback().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.k.b
            public int getNewListSize() {
                return BrvahAsyncDiffer$submitList$1.this.$newList.size();
            }

            @Override // androidx.recyclerview.widget.k.b
            public int getOldListSize() {
                return BrvahAsyncDiffer$submitList$1.this.$oldList.size();
            }
        });
        l0.h(b5, ProtectedSandApp.s("ໝ"));
        executor = this.this$0.mMainThreadExecutor;
        executor.execute(new Runnable() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$submitList$1.1
            @Override // java.lang.Runnable
            public final void run() {
                int i4;
                i4 = BrvahAsyncDiffer$submitList$1.this.this$0.mMaxScheduledGeneration;
                BrvahAsyncDiffer$submitList$1 brvahAsyncDiffer$submitList$1 = BrvahAsyncDiffer$submitList$1.this;
                if (i4 == brvahAsyncDiffer$submitList$1.$runGeneration) {
                    brvahAsyncDiffer$submitList$1.this$0.latchList(brvahAsyncDiffer$submitList$1.$newList, b5, brvahAsyncDiffer$submitList$1.$commitCallback);
                }
            }
        });
    }
}

package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(@o0 Context context, @o0 WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override // androidx.work.Worker
    @o0
    public ListenableWorker.a y() {
        return new ListenableWorker.a.c(g());
    }
}

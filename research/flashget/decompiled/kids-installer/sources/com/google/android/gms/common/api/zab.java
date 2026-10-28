package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    zab(Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Object obj;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        PendingResult[] pendingResultArr;
        obj = this.zaa.zai;
        synchronized (obj) {
            if (this.zaa.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                this.zaa.zag = true;
            } else if (!status.isSuccess()) {
                this.zaa.zaf = true;
            }
            Batch batch = this.zaa;
            i5 = batch.zae;
            batch.zae = i5 - 1;
            Batch batch2 = this.zaa;
            i6 = batch2.zae;
            if (i6 == 0) {
                z5 = batch2.zag;
                if (z5) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                } else {
                    z6 = batch2.zaf;
                    Status status2 = z6 ? new Status(13) : Status.RESULT_SUCCESS;
                    Batch batch3 = this.zaa;
                    pendingResultArr = batch3.zah;
                    batch3.setResult(new BatchResult(status2, pendingResultArr));
                }
            }
        }
    }
}

package com.google.firebase.installations;

import androidx.annotation.o0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: AwaitListener.java */
/* loaded from: classes3.dex */
final class b implements OnCompleteListener<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f16681a = new CountDownLatch(1);

    b() {
    }

    public boolean a(long j5, TimeUnit timeUnit) throws InterruptedException {
        return this.f16681a.await(j5, timeUnit);
    }

    public void b() {
        this.f16681a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@o0 Task<Void> task) {
        this.f16681a.countDown();
    }
}

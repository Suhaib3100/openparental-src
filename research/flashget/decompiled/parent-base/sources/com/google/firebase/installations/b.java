package com.google.firebase.installations;

import androidx.annotation.o0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: AwaitListener.java */
/* loaded from: classes6.dex */
final class b implements OnCompleteListener<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f59702a = new CountDownLatch(1);

    b() {
    }

    public boolean a(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f59702a.await(j4, timeUnit);
    }

    public void b() {
        this.f59702a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@o0 Task<Void> task) {
        this.f59702a.countDown();
    }
}

package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.content.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public final class zbc extends a implements SignInConnectionListener {
    private final Semaphore zba;
    private final Set zbb;

    public zbc(Context context, Set set) {
        super(context);
        this.zba = new Semaphore(0);
        this.zbb = set;
    }

    @Override // androidx.loader.content.a
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Iterator it = this.zbb.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).maybeSignIn(this)) {
                i4++;
            }
        }
        try {
            this.zba.tryAcquire(i4, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zba.release();
    }

    @Override // androidx.loader.content.c
    protected final void onStartLoading() {
        this.zba.drainPermits();
        forceLoad();
    }
}

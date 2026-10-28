package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class ListenerHolder<L> {
    private final Executor zaa;

    @q0
    private volatile Object zab;

    @q0
    private volatile ListenerKey zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public static final class ListenerKey<L> {
        private final Object zaa;
        private final String zab;

        @KeepForSdk
        ListenerKey(L l4, String str) {
            this.zaa = l4;
            this.zab = str;
        }

        @KeepForSdk
        public boolean equals(@q0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        @KeepForSdk
        public int hashCode() {
            return this.zab.hashCode() + (System.identityHashCode(this.zaa) * 31);
        }

        @o0
        @KeepForSdk
        public String toIdString() {
            return this.zab + ProtectedSandApp.s("짹") + System.identityHashCode(this.zaa);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@o0 L l4);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    ListenerHolder(@o0 Looper looper, @o0 L l4, @o0 String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = Preconditions.checkNotNull(l4, ProtectedSandApp.s("짺"));
        this.zac = new ListenerKey(l4, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    @q0
    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.zab != null;
    }

    @KeepForSdk
    public void notifyListener(@o0 final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, ProtectedSandApp.s("짼"));
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder.this.zaa(notifier);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zaa(Notifier notifier) {
        Object obj = this.zab;
        if (obj == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(obj);
        } catch (RuntimeException e4) {
            notifier.onNotifyListenerFailed();
            throw e4;
        }
    }

    @KeepForSdk
    ListenerHolder(@o0 Executor executor, @o0 L l4, @o0 String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, ProtectedSandApp.s("짻"));
        this.zab = Preconditions.checkNotNull(l4, ProtectedSandApp.s("짺"));
        this.zac = new ListenerKey(l4, Preconditions.checkNotEmpty(str));
    }
}

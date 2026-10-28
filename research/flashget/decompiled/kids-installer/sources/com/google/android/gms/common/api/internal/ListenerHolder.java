package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class ListenerHolder<L> {
    private final Executor zaa;

    @q0
    private volatile L zab;

    @q0
    private volatile ListenerKey<L> zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static final class ListenerKey<L> {
        private final L zaa;
        private final String zab;

        @KeepForSdk
        ListenerKey(L l5, String str) {
            this.zaa = l5;
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
            String str = this.zab;
            int identityHashCode = System.identityHashCode(this.zaa);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append(ProtectedSandApp.s("૯"));
            sb.append(identityHashCode);
            return sb.toString();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@o0 L l5);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    ListenerHolder(@o0 Looper looper, @o0 L l5, @o0 String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = (L) Preconditions.checkNotNull(l5, ProtectedSandApp.s("૰"));
        this.zac = new ListenerKey<>(l5, Preconditions.checkNotEmpty(str));
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
        Preconditions.checkNotNull(notifier, ProtectedSandApp.s("\u0af3"));
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder.this.zaa(notifier);
            }
        });
    }

    final void zaa(Notifier<? super L> notifier) {
        L l5 = this.zab;
        if (l5 == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l5);
        } catch (RuntimeException e6) {
            notifier.onNotifyListenerFailed();
            throw e6;
        }
    }

    @KeepForSdk
    ListenerHolder(@o0 Executor executor, @o0 L l5, @o0 String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, ProtectedSandApp.s("૱"));
        this.zab = (L) Preconditions.checkNotNull(l5, ProtectedSandApp.s("\u0af2"));
        this.zac = new ListenerKey<>(l5, Preconditions.checkNotEmpty(str));
    }
}

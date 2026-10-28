package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ListenerHolders {
    private final Set<ListenerHolder<?>> zaa = Collections.newSetFromMap(new WeakHashMap());

    @o0
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@o0 L l5, @o0 Looper looper, @o0 String str) {
        Preconditions.checkNotNull(l5, ProtectedSandApp.s("\u0af4"));
        Preconditions.checkNotNull(looper, ProtectedSandApp.s("\u0af5"));
        Preconditions.checkNotNull(str, ProtectedSandApp.s("\u0af6"));
        return new ListenerHolder<>(looper, l5, str);
    }

    @o0
    @KeepForSdk
    public static <L> ListenerHolder.ListenerKey<L> createListenerKey(@o0 L l5, @o0 String str) {
        Preconditions.checkNotNull(l5, ProtectedSandApp.s("ૺ"));
        Preconditions.checkNotNull(str, ProtectedSandApp.s("ૻ"));
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("ૼ"));
        return new ListenerHolder.ListenerKey<>(l5, str);
    }

    @o0
    public final <L> ListenerHolder<L> zaa(@o0 L l5, @o0 Looper looper, @o0 String str) {
        ListenerHolder<L> createListenerHolder = createListenerHolder(l5, looper, ProtectedSandApp.s("૽"));
        this.zaa.add(createListenerHolder);
        return createListenerHolder;
    }

    public final void zab() {
        Iterator<ListenerHolder<?>> it = this.zaa.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.zaa.clear();
    }

    @o0
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@o0 L l5, @o0 Executor executor, @o0 String str) {
        Preconditions.checkNotNull(l5, ProtectedSandApp.s("\u0af7"));
        Preconditions.checkNotNull(executor, ProtectedSandApp.s("\u0af8"));
        Preconditions.checkNotNull(str, ProtectedSandApp.s("ૹ"));
        return new ListenerHolder<>(executor, l5, str);
    }
}

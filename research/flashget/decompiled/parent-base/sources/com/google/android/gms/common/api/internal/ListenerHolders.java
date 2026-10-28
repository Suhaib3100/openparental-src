package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class ListenerHolders {
    private final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    @o0
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@o0 L l4, @o0 Looper looper, @o0 String str) {
        Preconditions.checkNotNull(l4, ProtectedSandApp.s("짽"));
        Preconditions.checkNotNull(looper, ProtectedSandApp.s("짾"));
        Preconditions.checkNotNull(str, ProtectedSandApp.s("짿"));
        return new ListenerHolder<>(looper, l4, str);
    }

    @o0
    @KeepForSdk
    public static <L> ListenerHolder.ListenerKey<L> createListenerKey(@o0 L l4, @o0 String str) {
        Preconditions.checkNotNull(l4, ProtectedSandApp.s("짽"));
        Preconditions.checkNotNull(str, ProtectedSandApp.s("짿"));
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("쨁"));
        return new ListenerHolder.ListenerKey<>(l4, str);
    }

    @o0
    public final ListenerHolder zaa(@o0 Object obj, @o0 Looper looper, @o0 String str) {
        Set set = this.zaa;
        ListenerHolder createListenerHolder = createListenerHolder(obj, looper, ProtectedSandApp.s("쨂"));
        set.add(createListenerHolder);
        return createListenerHolder;
    }

    public final void zab() {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((ListenerHolder) it.next()).clear();
        }
        this.zaa.clear();
    }

    @o0
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@o0 L l4, @o0 Executor executor, @o0 String str) {
        Preconditions.checkNotNull(l4, ProtectedSandApp.s("짽"));
        Preconditions.checkNotNull(executor, ProtectedSandApp.s("쨀"));
        Preconditions.checkNotNull(str, ProtectedSandApp.s("짿"));
        return new ListenerHolder<>(executor, l4, str);
    }
}

package com.tencent.beacon.event;

import androidx.annotation.o0;
import com.tencent.beacon.event.open.EventResult;

/* compiled from: IEventManager.java */
/* loaded from: classes6.dex */
public interface i {
    void a();

    void a(int i4);

    void a(String str, @o0 EventBean eventBean);

    void a(boolean z4);

    void a(boolean z4, int i4);

    boolean a(Runnable runnable);

    void b(String str, @o0 EventBean eventBean);

    EventResult c(String str, @o0 EventBean eventBean);
}

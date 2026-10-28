package com.google.android.datatransport.runtime;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import m8.c;

/* compiled from: TransportRuntimeComponent.java */
@cd.f
@m8.c(modules = {com.google.android.datatransport.runtime.backends.f.class, com.google.android.datatransport.runtime.scheduling.persistence.f.class, l.class, com.google.android.datatransport.runtime.scheduling.h.class, com.google.android.datatransport.runtime.scheduling.f.class, com.google.android.datatransport.runtime.time.d.class})
/* loaded from: classes5.dex */
abstract class y implements Closeable {

    /* compiled from: TransportRuntimeComponent.java */
    @c.a
    interface a {
        y a();

        @m8.b
        a b(Context context);
    }

    y() {
    }

    abstract com.google.android.datatransport.runtime.scheduling.persistence.d a();

    abstract x b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}

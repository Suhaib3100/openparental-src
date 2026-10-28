package com.google.android.datatransport.runtime;

import android.content.Context;
import h1.d;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: TransportRuntimeComponent.java */
@h3.f
@h1.d(modules = {com.google.android.datatransport.runtime.backends.f.class, com.google.android.datatransport.runtime.scheduling.persistence.f.class, l.class, com.google.android.datatransport.runtime.scheduling.h.class, com.google.android.datatransport.runtime.scheduling.f.class, com.google.android.datatransport.runtime.time.d.class})
/* loaded from: classes2.dex */
abstract class y implements Closeable {

    /* compiled from: TransportRuntimeComponent.java */
    @d.a
    interface a {
        @h1.b
        a a(Context context);

        y build();
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

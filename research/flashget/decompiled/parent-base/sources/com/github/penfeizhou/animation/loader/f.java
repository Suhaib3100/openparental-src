package com.github.penfeizhou.animation.loader;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamLoader.java */
/* loaded from: classes5.dex */
public abstract class f implements d {
    @Override // com.github.penfeizhou.animation.loader.d
    public final synchronized Reader a() throws IOException {
        return new com.github.penfeizhou.animation.io.e(b());
    }

    protected abstract InputStream b() throws IOException;
}

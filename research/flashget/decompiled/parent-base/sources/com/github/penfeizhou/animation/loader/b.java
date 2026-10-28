package com.github.penfeizhou.animation.loader;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferLoader.java */
/* loaded from: classes5.dex */
public abstract class b implements d {
    @Override // com.github.penfeizhou.animation.loader.d
    public Reader a() throws IOException {
        return new com.github.penfeizhou.animation.io.a(b());
    }

    public abstract ByteBuffer b();
}

package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.g;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public abstract class ChunkOffsetBox extends AbstractFullBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public ChunkOffsetBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("\u0f6d"), ChunkOffsetBox.class);
        ajc$tjp_0 = eVar.H(ProtectedSandApp.s("ི"), eVar.E(ProtectedSandApp.s("\u0f6f"), ProtectedSandApp.s("\u0f70"), ProtectedSandApp.s("ཱ"), "", "", "", ProtectedSandApp.s("\u0f6e")), 18);
    }

    public abstract long[] getChunkOffsets();

    public abstract void setChunkOffsets(long[] jArr);

    public String toString() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(ProtectedSandApp.s("ཱི"));
        return android.support.v4.media.b.a(sb, getChunkOffsets().length, ProtectedSandApp.s("ུ"));
    }
}

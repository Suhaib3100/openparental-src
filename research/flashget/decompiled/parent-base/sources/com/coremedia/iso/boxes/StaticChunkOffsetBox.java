package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class StaticChunkOffsetBox extends ChunkOffsetBox {
    public static final String TYPE = ProtectedSandApp.s("ᇵ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private long[] chunkOffsets;

    static {
        ajc$preClinit();
    }

    public StaticChunkOffsetBox() {
        super(ProtectedSandApp.s("ᇵ"));
        this.chunkOffsets = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᇶ"), StaticChunkOffsetBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᇸ"), ProtectedSandApp.s("ᇹ"), ProtectedSandApp.s("ᇺ"), "", "", "", ProtectedSandApp.s("ᇷ"));
        String s4 = ProtectedSandApp.s("ᇻ");
        ajc$tjp_0 = eVar.H(s4, E, 39);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇸ"), ProtectedSandApp.s("ᇽ"), ProtectedSandApp.s("ᇺ"), ProtectedSandApp.s("ᇷ"), ProtectedSandApp.s("ᇾ"), "", ProtectedSandApp.s("ᇼ")), 48);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.chunkOffsets = new long[a5];
        for (int i4 = 0; i4 < a5; i4++) {
            this.chunkOffsets[i4] = g.l(byteBuffer);
        }
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public long[] getChunkOffsets() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.chunkOffsets;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.chunkOffsets.length);
        for (long j4 : this.chunkOffsets) {
            byteBuffer.putInt((int) j4);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (this.chunkOffsets.length * 4) + 8;
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public void setChunkOffsets(long[] jArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, jArr));
        this.chunkOffsets = jArr;
    }
}

package com.coremedia.iso.boxes.mdat;

import androidx.collection.y0;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public final class MediaDataBox implements b {
    public static final String TYPE = ProtectedSandApp.s("ᐏ");
    private com.googlecode.mp4parser.a dataSource;
    private long offset;
    c parent;
    private long size;

    private static void transfer(com.googlecode.mp4parser.a aVar, long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        long j6 = 0;
        while (j6 < j5) {
            j6 += aVar.T(j4 + j6, Math.min(67076096L, j5 - j6), writableByteChannel);
        }
    }

    @Override // com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.b
    public long getOffset() {
        return this.offset;
    }

    @Override // com.coremedia.iso.boxes.b
    public c getParent() {
        return this.parent;
    }

    @Override // com.coremedia.iso.boxes.b
    public long getSize() {
        return this.size;
    }

    @Override // com.coremedia.iso.boxes.b
    public String getType() {
        return ProtectedSandApp.s("ᐏ");
    }

    @Override // com.coremedia.iso.boxes.b
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.offset = aVar.position() - byteBuffer.remaining();
        this.dataSource = aVar;
        this.size = byteBuffer.remaining() + j4;
        aVar.O1(aVar.position() + j4);
    }

    @Override // com.coremedia.iso.boxes.b
    public void setParent(c cVar) {
        this.parent = cVar;
    }

    public String toString() {
        return y0.a(new StringBuilder(ProtectedSandApp.s("ᐐ")), this.size, '}');
    }
}

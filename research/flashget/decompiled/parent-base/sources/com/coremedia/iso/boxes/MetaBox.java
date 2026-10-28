package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public class MetaBox extends AbstractContainerBox {
    public static final String TYPE = ProtectedSandApp.s("ყ");
    private int flags;
    private boolean isFullBox;
    private int version;

    public MetaBox() {
        super(ProtectedSandApp.s("ყ"));
        this.isFullBox = true;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        if (this.isFullBox) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            writeVersionAndFlags(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
        }
        writeContainer(writableByteChannel);
    }

    public int getFlags() {
        return this.flags;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        long containerSize = getContainerSize() + (this.isFullBox ? 4L : 0L);
        return containerSize + ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j4));
        aVar.read(allocate);
        allocate.position(4);
        if (ProtectedSandApp.s("შ").equals(g.b(allocate))) {
            this.isFullBox = false;
            initContainer(new e((ByteBuffer) allocate.rewind()), j4, cVar);
        } else {
            this.isFullBox = true;
            parseVersionAndFlags((ByteBuffer) allocate.rewind());
            initContainer(new e(allocate), j4 - 4, cVar);
        }
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = g.p(byteBuffer);
        this.flags = g.k(byteBuffer);
        return 4L;
    }

    public void setFlags(int i4) {
        this.flags = i4;
    }

    public void setVersion(int i4) {
        this.version = i4;
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        i.m(byteBuffer, this.version);
        i.h(byteBuffer, this.flags);
    }
}

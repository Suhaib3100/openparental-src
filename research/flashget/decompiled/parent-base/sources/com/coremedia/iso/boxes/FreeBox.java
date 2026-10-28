package com.coremedia.iso.boxes;

import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class FreeBox implements b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = ProtectedSandApp.s("ရ");
    ByteBuffer data;
    private long offset;
    private c parent;
    List<b> replacers;

    public FreeBox() {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public void addAndReplace(b bVar) {
        this.data.position(com.googlecode.mp4parser.util.c.a(bVar.getSize()));
        this.data = this.data.slice();
        this.replacers.add(bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreeBox freeBox = (FreeBox) obj;
        return getData() == null ? freeBox.getData() == null : getData().equals(freeBox.getData());
    }

    @Override // com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<b> it = this.replacers.iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        i.i(allocate, this.data.limit() + 8);
        allocate.put(ProtectedSandApp.s("ရ").getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.data.rewind();
        writableByteChannel.write(this.data);
        this.data.rewind();
    }

    public ByteBuffer getData() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return (ByteBuffer) byteBuffer.duplicate().rewind();
        }
        return null;
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
        Iterator<b> it = this.replacers.iterator();
        long j4 = 8;
        while (it.hasNext()) {
            j4 += it.next().getSize();
        }
        return j4 + this.data.limit();
    }

    @Override // com.coremedia.iso.boxes.b
    public String getType() {
        return ProtectedSandApp.s("ရ");
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    @Override // com.coremedia.iso.boxes.b
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.offset = aVar.position() - byteBuffer.remaining();
        if (j4 > 1048576) {
            this.data = aVar.e3(aVar.position(), j4);
            aVar.O1(aVar.position() + j4);
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j4));
            this.data = allocate;
            aVar.read(allocate);
        }
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    @Override // com.coremedia.iso.boxes.b
    public void setParent(c cVar) {
        this.parent = cVar;
    }

    public FreeBox(int i4) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(i4);
    }
}

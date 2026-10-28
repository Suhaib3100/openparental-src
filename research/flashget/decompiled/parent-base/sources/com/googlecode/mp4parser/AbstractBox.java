package com.googlecode.mp4parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.i;
import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
public abstract class AbstractBox implements com.coremedia.iso.boxes.b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static i LOG = i.a(AbstractBox.class);
    private ByteBuffer content;
    a dataSource;
    private ByteBuffer deadBytes = null;
    boolean isParsed = true;
    long offset;
    private com.coremedia.iso.boxes.c parent;
    protected String type;
    private byte[] userType;

    protected AbstractBox(String str) {
        this.type = str;
    }

    private void getHeader(ByteBuffer byteBuffer) {
        if (isSmallBox()) {
            com.coremedia.iso.i.i(byteBuffer, getSize());
            byteBuffer.put(com.coremedia.iso.f.b(getType()));
        } else {
            com.coremedia.iso.i.i(byteBuffer, 1L);
            byteBuffer.put(com.coremedia.iso.f.b(getType()));
            byteBuffer.putLong(getSize());
        }
        if (ProtectedSandApp.s("౮\u0001").equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    private boolean isSmallBox() {
        int i4 = ProtectedSandApp.s("౮\u0001").equals(getType()) ? 24 : 8;
        if (!this.isParsed) {
            return ((long) (this.content.limit() + i4)) < 4294967296L;
        }
        long contentSize = getContentSize();
        ByteBuffer byteBuffer = this.deadBytes;
        return (contentSize + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i4) < 4294967296L;
    }

    private boolean verify(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(getContentSize() + (this.deadBytes != null ? r2.limit() : 0)));
        getContent(allocate);
        ByteBuffer byteBuffer2 = this.deadBytes;
        if (byteBuffer2 != null) {
            byteBuffer2.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate.put(this.deadBytes);
            }
        }
        byteBuffer.rewind();
        allocate.rewind();
        if (byteBuffer.remaining() != allocate.remaining()) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder(String.valueOf(getType()));
            String s4 = ProtectedSandApp.s("౯\u0001");
            sb.append(s4);
            sb.append(byteBuffer.remaining());
            String s5 = ProtectedSandApp.s("\u0c70\u0001");
            sb.append(s5);
            sb.append(allocate.remaining());
            printStream.print(sb.toString());
            LOG.c(String.valueOf(getType()) + s4 + byteBuffer.remaining() + s5 + allocate.remaining());
            return false;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 1;
        int limit2 = allocate.limit() - 1;
        while (limit >= position) {
            byte b5 = byteBuffer.get(limit);
            byte b6 = allocate.get(limit2);
            if (b5 != b6) {
                LOG.c(String.format(ProtectedSandApp.s("\u0c71\u0001"), getType(), Integer.valueOf(limit), Byte.valueOf(b5), Byte.valueOf(b6)));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[allocate.remaining()];
                byteBuffer.get(bArr);
                allocate.get(bArr2);
                PrintStream printStream2 = System.err;
                printStream2.println(ProtectedSandApp.s("\u0c72\u0001") + com.coremedia.iso.e.c(bArr, 4));
                printStream2.println(ProtectedSandApp.s("\u0c73\u0001") + com.coremedia.iso.e.c(bArr2, 4));
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    protected abstract void _parseDetails(ByteBuffer byteBuffer);

    @Override // com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        if (!this.isParsed) {
            ByteBuffer allocate = ByteBuffer.allocate((isSmallBox() ? 8 : 16) + (ProtectedSandApp.s("౮\u0001").equals(getType()) ? 16 : 0));
            getHeader(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
            return;
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(getSize()));
        getHeader(allocate2);
        getContent(allocate2);
        ByteBuffer byteBuffer = this.deadBytes;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate2.put(this.deadBytes);
            }
        }
        writableByteChannel.write((ByteBuffer) allocate2.rewind());
    }

    protected abstract void getContent(ByteBuffer byteBuffer);

    protected abstract long getContentSize();

    @Override // com.coremedia.iso.boxes.b
    public long getOffset() {
        return this.offset;
    }

    @Override // com.coremedia.iso.boxes.b
    @va.a
    public com.coremedia.iso.boxes.c getParent() {
        return this.parent;
    }

    @va.a
    public String getPath() {
        return m.a(this);
    }

    @Override // com.coremedia.iso.boxes.b
    public long getSize() {
        long limit;
        if (this.isParsed) {
            limit = getContentSize();
        } else {
            ByteBuffer byteBuffer = this.content;
            limit = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        return limit + (limit >= 4294967288L ? 8 : 0) + 8 + (ProtectedSandApp.s("౮\u0001").equals(getType()) ? 16 : 0) + (this.deadBytes != null ? r0.limit() : 0);
    }

    @Override // com.coremedia.iso.boxes.b
    @va.a
    public String getType() {
        return this.type;
    }

    @va.a
    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    @Override // com.coremedia.iso.boxes.b
    @va.a
    public void parse(a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.offset = aVar.position() - byteBuffer.remaining();
        this.dataSource = aVar;
        this.content = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j4));
        while (this.content.remaining() > 0) {
            aVar.read(this.content);
        }
        this.content.position(0);
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        try {
            LOG.b(ProtectedSandApp.s("\u0c74\u0001") + getType());
            ByteBuffer byteBuffer = this.content;
            if (byteBuffer != null) {
                this.isParsed = true;
                byteBuffer.rewind();
                _parseDetails(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.deadBytes = byteBuffer.slice();
                }
                this.content = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.coremedia.iso.boxes.b
    @va.a
    public void setParent(com.coremedia.iso.boxes.c cVar) {
        this.parent = cVar;
    }

    protected AbstractBox(String str, byte[] bArr) {
        this.type = str;
        this.userType = bArr;
    }
}

package com.googlecode.mp4parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public class BasicContainer implements com.coremedia.iso.boxes.c, Iterator<com.coremedia.iso.boxes.b>, Closeable {
    private static final com.coremedia.iso.boxes.b EOF = new AbstractBox(ProtectedSandApp.s("\u0c75\u0001")) { // from class: com.googlecode.mp4parser.BasicContainer.1
        @Override // com.googlecode.mp4parser.AbstractBox
        protected void _parseDetails(ByteBuffer byteBuffer) {
        }

        @Override // com.googlecode.mp4parser.AbstractBox
        protected void getContent(ByteBuffer byteBuffer) {
        }

        @Override // com.googlecode.mp4parser.AbstractBox
        protected long getContentSize() {
            return 0L;
        }
    };
    private static i LOG = i.a(BasicContainer.class);
    protected com.coremedia.iso.c boxParser;
    protected a dataSource;
    com.coremedia.iso.boxes.b lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;
    long endPosition = 0;
    private List<com.coremedia.iso.boxes.b> boxes = new ArrayList();

    public void addBox(com.coremedia.iso.boxes.b bVar) {
        if (bVar != null) {
            this.boxes = new ArrayList(getBoxes());
            bVar.setParent(this);
            this.boxes.add(bVar);
        }
    }

    public void close() throws IOException {
        this.dataSource.close();
    }

    @Override // com.coremedia.iso.boxes.c
    public List<com.coremedia.iso.boxes.b> getBoxes() {
        return (this.dataSource == null || this.lookahead == EOF) ? this.boxes : new com.googlecode.mp4parser.util.h(this.boxes, this);
    }

    @Override // com.coremedia.iso.boxes.c
    public ByteBuffer getByteBuffer(long j4, long j5) throws IOException {
        ByteBuffer e32;
        a aVar = this.dataSource;
        if (aVar != null) {
            synchronized (aVar) {
                e32 = this.dataSource.e3(this.startPosition + j4, j5);
            }
            return e32;
        }
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j5));
        long j6 = j4 + j5;
        long j7 = 0;
        for (com.coremedia.iso.boxes.b bVar : this.boxes) {
            long size = bVar.getSize() + j7;
            if (size > j4 && j7 < j6) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel = Channels.newChannel(byteArrayOutputStream);
                bVar.getBox(newChannel);
                newChannel.close();
                if (j7 >= j4 && size <= j6) {
                    allocate.put(byteArrayOutputStream.toByteArray());
                } else if (j7 < j4 && size > j6) {
                    long j10 = j4 - j7;
                    allocate.put(byteArrayOutputStream.toByteArray(), com.googlecode.mp4parser.util.c.a(j10), com.googlecode.mp4parser.util.c.a((bVar.getSize() - j10) - (size - j6)));
                } else if (j7 < j4 && size <= j6) {
                    long j11 = j4 - j7;
                    allocate.put(byteArrayOutputStream.toByteArray(), com.googlecode.mp4parser.util.c.a(j11), com.googlecode.mp4parser.util.c.a(bVar.getSize() - j11));
                } else if (j7 >= j4 && size > j6) {
                    allocate.put(byteArrayOutputStream.toByteArray(), 0, com.googlecode.mp4parser.util.c.a(bVar.getSize() - (size - j6)));
                }
            }
            j7 = size;
        }
        return (ByteBuffer) allocate.rewind();
    }

    protected long getContainerSize() {
        long j4 = 0;
        for (int i4 = 0; i4 < getBoxes().size(); i4++) {
            j4 += this.boxes.get(i4).getSize();
        }
        return j4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        com.coremedia.iso.boxes.b bVar = this.lookahead;
        if (bVar == EOF) {
            return false;
        }
        if (bVar != null) {
            return true;
        }
        try {
            this.lookahead = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.lookahead = EOF;
            return false;
        }
    }

    public void initContainer(a aVar, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.dataSource = aVar;
        long position = aVar.position();
        this.startPosition = position;
        this.parsePosition = position;
        aVar.O1(aVar.position() + j4);
        this.endPosition = aVar.position();
        this.boxParser = cVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.coremedia.iso.boxes.c
    public void setBoxes(List<com.coremedia.iso.boxes.b> list) {
        this.boxes = new ArrayList(list);
        this.lookahead = EOF;
        this.dataSource = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(ProtectedSandApp.s("\u0c76\u0001"));
        for (int i4 = 0; i4 < this.boxes.size(); i4++) {
            if (i4 > 0) {
                sb.append(ProtectedSandApp.s("౸\u0001"));
            }
            sb.append(this.boxes.get(i4).toString());
        }
        sb.append(ProtectedSandApp.s("౷\u0001"));
        return sb.toString();
    }

    @Override // com.coremedia.iso.boxes.c
    public final void writeContainer(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<com.coremedia.iso.boxes.b> it = getBoxes().iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public com.coremedia.iso.boxes.b next() {
        com.coremedia.iso.boxes.b a5;
        com.coremedia.iso.boxes.b bVar = this.lookahead;
        if (bVar != null && bVar != EOF) {
            this.lookahead = null;
            return bVar;
        }
        a aVar = this.dataSource;
        if (aVar == null || this.parsePosition >= this.endPosition) {
            this.lookahead = EOF;
            throw new NoSuchElementException();
        }
        try {
            synchronized (aVar) {
                this.dataSource.O1(this.parsePosition);
                a5 = this.boxParser.a(this.dataSource, this);
                this.parsePosition = this.dataSource.position();
            }
            return a5;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // com.coremedia.iso.boxes.c
    public <T extends com.coremedia.iso.boxes.b> List<T> getBoxes(Class<T> cls) {
        List<com.coremedia.iso.boxes.b> boxes = getBoxes();
        ArrayList arrayList = null;
        com.coremedia.iso.boxes.b bVar = null;
        for (int i4 = 0; i4 < boxes.size(); i4++) {
            com.coremedia.iso.boxes.b bVar2 = boxes.get(i4);
            if (cls.isInstance(bVar2)) {
                if (bVar == null) {
                    bVar = bVar2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(bVar);
                    }
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (bVar != null) {
            return Collections.singletonList(bVar);
        }
        return Collections.emptyList();
    }

    @Override // com.coremedia.iso.boxes.c
    public <T extends com.coremedia.iso.boxes.b> List<T> getBoxes(Class<T> cls, boolean z4) {
        ArrayList arrayList = new ArrayList(2);
        List<com.coremedia.iso.boxes.b> boxes = getBoxes();
        for (int i4 = 0; i4 < boxes.size(); i4++) {
            com.coremedia.iso.boxes.b bVar = boxes.get(i4);
            if (cls.isInstance(bVar)) {
                arrayList.add(bVar);
            }
            if (z4 && (bVar instanceof com.coremedia.iso.boxes.c)) {
                arrayList.addAll(((com.coremedia.iso.boxes.c) bVar).getBoxes(cls, z4));
            }
        }
        return arrayList;
    }
}

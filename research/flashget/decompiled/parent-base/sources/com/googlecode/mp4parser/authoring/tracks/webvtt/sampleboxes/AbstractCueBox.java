package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.coremedia.iso.f;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.util.c;
import com.mp4parser.streaming.WriteOnlyBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
public abstract class AbstractCueBox extends WriteOnlyBox {
    String content;

    public AbstractCueBox(String str) {
        super(str);
        this.content = "";
    }

    @Override // com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(c.a(getSize()));
        i.i(allocate, getSize());
        allocate.put(f.b(getType()));
        allocate.put(l.b(this.content));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    public String getContent() {
        return this.content;
    }

    @Override // com.coremedia.iso.boxes.b
    public long getSize() {
        return l.c(this.content) + 8;
    }

    public void setContent(String str) {
        this.content = str;
    }
}

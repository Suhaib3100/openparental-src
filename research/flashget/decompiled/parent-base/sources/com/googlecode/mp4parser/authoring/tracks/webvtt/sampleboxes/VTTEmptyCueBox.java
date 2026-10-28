package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.coremedia.iso.f;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.mp4parser.streaming.WriteOnlyBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
public class VTTEmptyCueBox extends WriteOnlyBox {
    public VTTEmptyCueBox() {
        super(ProtectedSandApp.s("༢\u0001"));
    }

    @Override // com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        i.i(allocate, getSize());
        allocate.put(f.b(getType()));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    @Override // com.coremedia.iso.boxes.b
    public long getSize() {
        return 8L;
    }
}

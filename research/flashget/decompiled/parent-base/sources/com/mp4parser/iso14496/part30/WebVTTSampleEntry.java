package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.coremedia.iso.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.a;
import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
public class WebVTTSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = ProtectedSandApp.s("ᦣ\u0001");

    public WebVTTSampleEntry() {
        super(ProtectedSandApp.s("ᦣ\u0001"));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    public WebVTTConfigurationBox getConfig() {
        return (WebVTTConfigurationBox) m.e(this, ProtectedSandApp.s("ᦤ\u0001"));
    }

    public WebVTTSourceLabelBox getSourceLabel() {
        return (WebVTTSourceLabelBox) m.e(this, ProtectedSandApp.s("ᦥ\u0001"));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(a aVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException {
        initContainer(aVar, j4, cVar);
    }
}

package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class SyncSampleBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ሜ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private long[] sampleNumber;

    static {
        ajc$preClinit();
    }

    public SyncSampleBox() {
        super(ProtectedSandApp.s("ሜ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ም"), SyncSampleBox.class);
        v E = eVar.E(ProtectedSandApp.s("ሟ"), ProtectedSandApp.s("ሠ"), ProtectedSandApp.s("ሡ"), "", "", "", ProtectedSandApp.s("ሞ"));
        String s4 = ProtectedSandApp.s("ሢ");
        ajc$tjp_0 = eVar.H(s4, E, 46);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሟ"), ProtectedSandApp.s("ሤ"), ProtectedSandApp.s("ሡ"), "", "", "", ProtectedSandApp.s("ሣ")), 77);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሟ"), ProtectedSandApp.s("ሦ"), ProtectedSandApp.s("ሡ"), ProtectedSandApp.s("ሞ"), ProtectedSandApp.s("ሧ"), "", ProtectedSandApp.s("ሥ")), 81);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.sampleNumber = new long[a5];
        for (int i4 = 0; i4 < a5; i4++) {
            this.sampleNumber[i4] = g.l(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.sampleNumber.length);
        for (long j4 : this.sampleNumber) {
            byteBuffer.putInt((int) j4);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (this.sampleNumber.length * 4) + 8;
    }

    public long[] getSampleNumber() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.sampleNumber;
    }

    public void setSampleNumber(long[] jArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, jArr));
        this.sampleNumber = jArr;
    }

    public String toString() {
        return android.support.v4.media.b.a(a.a(e.v(ajc$tjp_1, this, this), ProtectedSandApp.s("ረ")), this.sampleNumber.length, ProtectedSandApp.s("ሩ"));
    }
}

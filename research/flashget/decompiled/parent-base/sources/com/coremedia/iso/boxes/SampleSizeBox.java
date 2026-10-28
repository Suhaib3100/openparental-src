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
public class SampleSizeBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᆤ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes;

    static {
        ajc$preClinit();
    }

    public SampleSizeBox() {
        super(ProtectedSandApp.s("ᆤ"));
        this.sampleSizes = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᆥ"), SampleSizeBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᆧ"), ProtectedSandApp.s("ᆨ"), ProtectedSandApp.s("ᆩ"), "", "", "", ProtectedSandApp.s("ᆦ"));
        String s4 = ProtectedSandApp.s("ᆪ");
        ajc$tjp_0 = eVar.H(s4, E, 50);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆧ"), ProtectedSandApp.s("ᆬ"), ProtectedSandApp.s("ᆩ"), ProtectedSandApp.s("ᆦ"), ProtectedSandApp.s("ᆭ"), "", ProtectedSandApp.s("ᆫ")), 54);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆧ"), ProtectedSandApp.s("ᆮ"), ProtectedSandApp.s("ᆩ"), ProtectedSandApp.s("ᆯ"), ProtectedSandApp.s("ᆰ"), "", ProtectedSandApp.s("ᆦ")), 59);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆧ"), ProtectedSandApp.s("ᆱ"), ProtectedSandApp.s("ᆩ"), "", "", "", ProtectedSandApp.s("ᆦ")), 67);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆧ"), ProtectedSandApp.s("ᆳ"), ProtectedSandApp.s("ᆩ"), "", "", "", ProtectedSandApp.s("ᆲ")), 76);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆧ"), ProtectedSandApp.s("ᆴ"), ProtectedSandApp.s("ᆩ"), ProtectedSandApp.s("ᆲ"), ProtectedSandApp.s("ᆵ"), "", ProtectedSandApp.s("ᆫ")), 80);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆧ"), ProtectedSandApp.s("ᆷ"), ProtectedSandApp.s("ᆩ"), "", "", "", ProtectedSandApp.s("ᆶ")), 119);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sampleSize = g.l(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.sampleCount = a5;
        if (this.sampleSize == 0) {
            this.sampleSizes = new long[a5];
            for (int i4 = 0; i4 < this.sampleCount; i4++) {
                this.sampleSizes[i4] = g.l(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.sampleSize);
        if (this.sampleSize != 0) {
            byteBuffer.putInt(this.sampleCount);
            return;
        }
        byteBuffer.putInt(this.sampleSizes.length);
        for (long j4 : this.sampleSizes) {
            byteBuffer.putInt((int) j4);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (this.sampleSize == 0 ? this.sampleSizes.length * 4 : 0) + 12;
    }

    public long getSampleCount() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.sampleSize > 0 ? this.sampleCount : this.sampleSizes.length;
    }

    public long getSampleSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.sampleSize;
    }

    public long getSampleSizeAtIndex(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, new Integer(i4)));
        long j4 = this.sampleSize;
        return j4 > 0 ? j4 : this.sampleSizes[i4];
    }

    public long[] getSampleSizes() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.sampleSizes;
    }

    public void setSampleSize(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Long(j4)));
        this.sampleSize = j4;
    }

    public void setSampleSizes(long[] jArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, jArr));
        this.sampleSizes = jArr;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_6, this, this), ProtectedSandApp.s("ᆸ"));
        a5.append(getSampleSize());
        a5.append(ProtectedSandApp.s("ᆹ"));
        a5.append(getSampleCount());
        a5.append(ProtectedSandApp.s("ᆺ"));
        return a5.toString();
    }
}

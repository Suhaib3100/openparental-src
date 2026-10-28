package com.mp4parser.iso14496.part12;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public final class BitRateBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᡢ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    static {
        ajc$preClinit();
    }

    public BitRateBox() {
        super(ProtectedSandApp.s("ᡢ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᡣ\u0001"), BitRateBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᡥ\u0001"), ProtectedSandApp.s("ᡦ\u0001"), ProtectedSandApp.s("ᡧ\u0001"), "", "", "", ProtectedSandApp.s("ᡤ\u0001"));
        String s4 = ProtectedSandApp.s("ᡨ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 74);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡥ\u0001"), ProtectedSandApp.s("ᡪ\u0001"), ProtectedSandApp.s("ᡧ\u0001"), ProtectedSandApp.s("ᡤ\u0001"), ProtectedSandApp.s("ᡫ\u0001"), "", ProtectedSandApp.s("ᡩ\u0001")), 82);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡥ\u0001"), ProtectedSandApp.s("ᡬ\u0001"), ProtectedSandApp.s("ᡧ\u0001"), "", "", "", ProtectedSandApp.s("ᡤ\u0001")), 90);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡥ\u0001"), ProtectedSandApp.s("ᡭ\u0001"), ProtectedSandApp.s("ᡧ\u0001"), ProtectedSandApp.s("ᡤ\u0001"), ProtectedSandApp.s("ᡮ\u0001"), "", ProtectedSandApp.s("ᡩ\u0001")), 98);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡥ\u0001"), ProtectedSandApp.s("ᡯ\u0001"), ProtectedSandApp.s("ᡧ\u0001"), "", "", "", ProtectedSandApp.s("ᡤ\u0001")), 106);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡥ\u0001"), ProtectedSandApp.s("ᡰ\u0001"), ProtectedSandApp.s("ᡧ\u0001"), ProtectedSandApp.s("ᡤ\u0001"), ProtectedSandApp.s("ᡱ\u0001"), "", ProtectedSandApp.s("ᡩ\u0001")), 114);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.bufferSizeDb = g.l(byteBuffer);
        this.maxBitrate = g.l(byteBuffer);
        this.avgBitrate = g.l(byteBuffer);
    }

    public long getAvgBitrate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.avgBitrate;
    }

    public long getBufferSizeDb() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.bufferSizeDb;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        i.i(byteBuffer, this.bufferSizeDb);
        byteBuffer.putInt((int) this.maxBitrate);
        byteBuffer.putInt((int) this.avgBitrate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 12L;
    }

    public long getMaxBitrate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.maxBitrate;
    }

    public void setAvgBitrate(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Long(j4)));
        this.avgBitrate = j4;
    }

    public void setBufferSizeDb(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Long(j4)));
        this.bufferSizeDb = j4;
    }

    public void setMaxBitrate(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Long(j4)));
        this.maxBitrate = j4;
    }
}

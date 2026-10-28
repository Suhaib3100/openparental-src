package com.coremedia.iso.boxes;

import androidx.collection.y0;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class HintMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = ProtectedSandApp.s("ၮ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    static {
        ajc$preClinit();
    }

    public HintMediaHeaderBox() {
        super(ProtectedSandApp.s("ၮ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ၯ"), HintMediaHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("ၱ"), ProtectedSandApp.s("ၲ"), ProtectedSandApp.s("ၳ"), "", "", "", ProtectedSandApp.s("ၰ"));
        String s4 = ProtectedSandApp.s("ၴ");
        ajc$tjp_0 = eVar.H(s4, E, 42);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၱ"), ProtectedSandApp.s("ၵ"), ProtectedSandApp.s("ၳ"), "", "", "", ProtectedSandApp.s("ၰ")), 46);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၱ"), ProtectedSandApp.s("ၷ"), ProtectedSandApp.s("ၳ"), "", "", "", ProtectedSandApp.s("ၶ")), 50);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၱ"), ProtectedSandApp.s("ၸ"), ProtectedSandApp.s("ၳ"), "", "", "", ProtectedSandApp.s("ၶ")), 54);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၱ"), ProtectedSandApp.s("ၺ"), ProtectedSandApp.s("ၳ"), "", "", "", ProtectedSandApp.s("ၹ")), 84);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxPduSize = g.i(byteBuffer);
        this.avgPduSize = g.i(byteBuffer);
        this.maxBitrate = g.l(byteBuffer);
        this.avgBitrate = g.l(byteBuffer);
        g.l(byteBuffer);
    }

    public long getAvgBitrate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.avgBitrate;
    }

    public int getAvgPduSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.avgPduSize;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.f(byteBuffer, this.maxPduSize);
        i.f(byteBuffer, this.avgPduSize);
        byteBuffer.putInt((int) this.maxBitrate);
        byteBuffer.putInt((int) this.avgBitrate);
        byteBuffer.putInt((int) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 20L;
    }

    public long getMaxBitrate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.maxBitrate;
    }

    public int getMaxPduSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.maxPduSize;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_4, this, this), ProtectedSandApp.s("ၻ"));
        a5.append(this.maxPduSize);
        a5.append(ProtectedSandApp.s("ၼ"));
        a5.append(this.avgPduSize);
        a5.append(ProtectedSandApp.s("ၽ"));
        a5.append(this.maxBitrate);
        a5.append(ProtectedSandApp.s("ၾ"));
        return y0.a(a5, this.avgBitrate, '}');
    }
}

package com.coremedia.iso.boxes.fragment;

import androidx.collection.y0;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class TrackFragmentBaseMediaDecodeTimeBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("፵");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private long baseMediaDecodeTime;

    static {
        ajc$preClinit();
    }

    public TrackFragmentBaseMediaDecodeTimeBox() {
        super(ProtectedSandApp.s("፵"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("፶"), TrackFragmentBaseMediaDecodeTimeBox.class);
        v E = eVar.E(ProtectedSandApp.s("፸"), ProtectedSandApp.s("፹"), ProtectedSandApp.s("፺"), "", "", "", ProtectedSandApp.s("፷"));
        String s4 = ProtectedSandApp.s("፻");
        ajc$tjp_0 = eVar.H(s4, E, 65);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፸"), ProtectedSandApp.s("\u137d"), ProtectedSandApp.s("፺"), ProtectedSandApp.s("፷"), ProtectedSandApp.s("\u137e"), "", ProtectedSandApp.s("፼")), 69);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፸"), ProtectedSandApp.s("ᎀ"), ProtectedSandApp.s("፺"), "", "", "", ProtectedSandApp.s("\u137f")), 74);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.baseMediaDecodeTime = g.o(byteBuffer);
        } else {
            this.baseMediaDecodeTime = g.l(byteBuffer);
        }
    }

    public long getBaseMediaDecodeTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.baseMediaDecodeTime;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            i.l(byteBuffer, this.baseMediaDecodeTime);
        } else {
            i.i(byteBuffer, this.baseMediaDecodeTime);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return getVersion() == 0 ? 8 : 12;
    }

    public void setBaseMediaDecodeTime(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Long(j4)));
        this.baseMediaDecodeTime = j4;
    }

    public String toString() {
        return y0.a(com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᎁ")), this.baseMediaDecodeTime, '}');
    }
}

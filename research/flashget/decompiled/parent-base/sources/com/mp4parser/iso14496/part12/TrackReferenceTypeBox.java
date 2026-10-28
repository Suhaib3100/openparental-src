package com.mp4parser.iso14496.part12;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.util.l;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class TrackReferenceTypeBox extends AbstractBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    long[] trackIds;

    static {
        ajc$preClinit();
    }

    public TrackReferenceTypeBox(String str) {
        super(str);
        this.trackIds = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᢤ\u0001"), TrackReferenceTypeBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᢦ\u0001"), ProtectedSandApp.s("ᢧ\u0001"), ProtectedSandApp.s("ᢨ\u0001"), "", "", "", ProtectedSandApp.s("ᢥ\u0001"));
        String s4 = ProtectedSandApp.s("ᢩ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 58);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢦ\u0001"), ProtectedSandApp.s("\u18ab\u0001"), ProtectedSandApp.s("ᢨ\u0001"), ProtectedSandApp.s("ᢥ\u0001"), ProtectedSandApp.s("\u18ac\u0001"), "", ProtectedSandApp.s("ᢪ\u0001")), 62);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() >= 4) {
            this.trackIds = l.c(this.trackIds, g.l(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        for (long j4 : this.trackIds) {
            i.i(byteBuffer, j4);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.trackIds.length * 4;
    }

    public long[] getTrackIds() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.trackIds;
    }

    public void setTrackIds(long[] jArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, jArr));
        this.trackIds = jArr;
    }
}

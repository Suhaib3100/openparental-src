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
public class MovieFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ጮ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private long sequenceNumber;

    static {
        ajc$preClinit();
    }

    public MovieFragmentHeaderBox() {
        super(ProtectedSandApp.s("ጮ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ጯ"), MovieFragmentHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("ጱ"), ProtectedSandApp.s("ጲ"), ProtectedSandApp.s("ጳ"), "", "", "", ProtectedSandApp.s("ጰ"));
        String s4 = ProtectedSandApp.s("ጴ");
        ajc$tjp_0 = eVar.H(s4, E, 59);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ጱ"), ProtectedSandApp.s("ጶ"), ProtectedSandApp.s("ጳ"), ProtectedSandApp.s("ጰ"), ProtectedSandApp.s("ጷ"), "", ProtectedSandApp.s("ጵ")), 63);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ጱ"), ProtectedSandApp.s("ጹ"), ProtectedSandApp.s("ጳ"), "", "", "", ProtectedSandApp.s("ጸ")), 68);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sequenceNumber = g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.sequenceNumber);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public long getSequenceNumber() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.sequenceNumber;
    }

    public void setSequenceNumber(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Long(j4)));
        this.sequenceNumber = j4;
    }

    public String toString() {
        return y0.a(com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ጺ")), this.sequenceNumber, '}');
    }
}

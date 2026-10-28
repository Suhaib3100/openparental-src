package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class TrackProductionApertureDimensionsAtom extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᇳ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    double height;
    double width;

    static {
        ajc$preClinit();
    }

    public TrackProductionApertureDimensionsAtom() {
        super(ProtectedSandApp.s("ᇳ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᇴ\u0001"), TrackProductionApertureDimensionsAtom.class);
        v E = eVar.E(ProtectedSandApp.s("ᇶ\u0001"), ProtectedSandApp.s("ᇷ\u0001"), ProtectedSandApp.s("ᇸ\u0001"), "", "", "", ProtectedSandApp.s("ᇵ\u0001"));
        String s4 = ProtectedSandApp.s("ᇹ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 44);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇶ\u0001"), ProtectedSandApp.s("ᇻ\u0001"), ProtectedSandApp.s("ᇸ\u0001"), ProtectedSandApp.s("ᇵ\u0001"), ProtectedSandApp.s("ᇼ\u0001"), "", ProtectedSandApp.s("ᇺ\u0001")), 48);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇶ\u0001"), ProtectedSandApp.s("ᇽ\u0001"), ProtectedSandApp.s("ᇸ\u0001"), "", "", "", ProtectedSandApp.s("ᇵ\u0001")), 52);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇶ\u0001"), ProtectedSandApp.s("ᇾ\u0001"), ProtectedSandApp.s("ᇸ\u0001"), ProtectedSandApp.s("ᇵ\u0001"), ProtectedSandApp.s("ᇿ\u0001"), "", ProtectedSandApp.s("ᇺ\u0001")), 56);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.width = g.d(byteBuffer);
        this.height = g.d(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.b(byteBuffer, this.width);
        i.b(byteBuffer, this.height);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 12L;
    }

    public double getHeight() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.height;
    }

    public double getWidth() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.width;
    }

    public void setHeight(double d5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Double(d5)));
        this.height = d5;
    }

    public void setWidth(double d5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Double(d5)));
        this.width = d5;
    }
}

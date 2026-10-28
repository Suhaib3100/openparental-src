package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AppleGPSCoordinatesBox extends AbstractBox {
    private static final int DEFAULT_LANG = 5575;
    public static final String TYPE = ProtectedSandApp.s("ჴ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    String coords;
    int lang;

    static {
        ajc$preClinit();
    }

    public AppleGPSCoordinatesBox() {
        super(ProtectedSandApp.s("ჴ\u0001"));
        this.lang = DEFAULT_LANG;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ჵ\u0001"), AppleGPSCoordinatesBox.class);
        v E = eVar.E(ProtectedSandApp.s("ჷ\u0001"), ProtectedSandApp.s("ჸ\u0001"), ProtectedSandApp.s("ჹ\u0001"), "", "", "", ProtectedSandApp.s("ჶ\u0001"));
        String s4 = ProtectedSandApp.s("ჺ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 22);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჷ\u0001"), ProtectedSandApp.s("ჼ\u0001"), ProtectedSandApp.s("ჹ\u0001"), ProtectedSandApp.s("ჶ\u0001"), ProtectedSandApp.s("ჽ\u0001"), "", ProtectedSandApp.s("჻\u0001")), 26);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჷ\u0001"), ProtectedSandApp.s("ჾ\u0001"), ProtectedSandApp.s("ჹ\u0001"), "", "", "", ProtectedSandApp.s("ჶ\u0001")), 52);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getShort();
        this.lang = byteBuffer.getShort();
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        this.coords = l.a(bArr);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short) this.coords.length());
        byteBuffer.putShort((short) this.lang);
        byteBuffer.put(l.b(this.coords));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.coords) + 4;
    }

    public String getValue() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.coords;
    }

    public void setValue(String str) {
        g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.lang = DEFAULT_LANG;
        this.coords = str;
    }

    public String toString() {
        return android.support.v4.media.c.a(a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ჿ\u0001")), this.coords, ProtectedSandApp.s("ᄀ\u0001"));
    }
}

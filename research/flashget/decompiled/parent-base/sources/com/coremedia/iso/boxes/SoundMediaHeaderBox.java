package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class SoundMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = ProtectedSandApp.s("ᇪ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private float balance;

    static {
        ajc$preClinit();
    }

    public SoundMediaHeaderBox() {
        super(ProtectedSandApp.s("ᇪ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᇫ"), SoundMediaHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᇭ"), ProtectedSandApp.s("ᇮ"), ProtectedSandApp.s("ᇯ"), "", "", "", ProtectedSandApp.s("ᇬ"));
        String s4 = ProtectedSandApp.s("ᇰ");
        ajc$tjp_0 = eVar.H(s4, E, 36);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇭ"), ProtectedSandApp.s("ᇲ"), ProtectedSandApp.s("ᇯ"), "", "", "", ProtectedSandApp.s("ᇱ")), 58);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.balance = g.e(byteBuffer);
        g.i(byteBuffer);
    }

    public float getBalance() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.balance;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.c(byteBuffer, this.balance);
        i.f(byteBuffer, 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_1, this, this), ProtectedSandApp.s("ᇳ"));
        a5.append(getBalance());
        a5.append(ProtectedSandApp.s("ᇴ"));
        return a5.toString();
    }
}

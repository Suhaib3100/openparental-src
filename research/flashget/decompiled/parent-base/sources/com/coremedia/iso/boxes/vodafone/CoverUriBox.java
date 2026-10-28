package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class CoverUriBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᒐ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private String coverUri;

    static {
        ajc$preClinit();
    }

    public CoverUriBox() {
        super(ProtectedSandApp.s("ᒐ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᒑ"), CoverUriBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᒓ"), ProtectedSandApp.s("ᒔ"), ProtectedSandApp.s("ᒕ"), "", "", "", ProtectedSandApp.s("ᒒ"));
        String s4 = ProtectedSandApp.s("ᒖ");
        ajc$tjp_0 = eVar.H(s4, E, 38);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᒓ"), ProtectedSandApp.s("ᒘ"), ProtectedSandApp.s("ᒕ"), ProtectedSandApp.s("ᒒ"), ProtectedSandApp.s("ᒙ"), "", ProtectedSandApp.s("ᒗ")), 42);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᒓ"), ProtectedSandApp.s("ᒚ"), ProtectedSandApp.s("ᒕ"), "", "", "", ProtectedSandApp.s("ᒒ")), 64);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.coverUri = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(l.b(this.coverUri));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.coverUri) + 5;
    }

    public String getCoverUri() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.coverUri;
    }

    public void setCoverUri(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.coverUri = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᒛ"));
        a5.append(getCoverUri());
        a5.append(ProtectedSandApp.s("ᒜ"));
        return a5.toString();
    }
}

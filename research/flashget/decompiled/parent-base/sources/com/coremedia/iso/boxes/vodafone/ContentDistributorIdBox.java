package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class ContentDistributorIdBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᒄ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private String contentDistributorId;
    private String language;

    static {
        ajc$preClinit();
    }

    public ContentDistributorIdBox() {
        super(ProtectedSandApp.s("ᒄ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᒅ"), ContentDistributorIdBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᒇ"), ProtectedSandApp.s("ᒈ"), ProtectedSandApp.s("ᒉ"), "", "", "", ProtectedSandApp.s("ᒆ"));
        String s4 = ProtectedSandApp.s("ᒊ");
        ajc$tjp_0 = eVar.H(s4, E, 40);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᒇ"), ProtectedSandApp.s("ᒋ"), ProtectedSandApp.s("ᒉ"), "", "", "", ProtectedSandApp.s("ᒆ")), 44);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᒇ"), ProtectedSandApp.s("ᒌ"), ProtectedSandApp.s("ᒉ"), "", "", "", ProtectedSandApp.s("ᒆ")), 68);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.contentDistributorId = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.contentDistributorId));
        byteBuffer.put((byte) 0);
    }

    public String getContentDistributorId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.contentDistributorId;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.contentDistributorId) + 7;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᒍ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ᒎ"));
        a5.append(getContentDistributorId());
        a5.append(ProtectedSandApp.s("ᒏ"));
        return a5.toString();
    }
}

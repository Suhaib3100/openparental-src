package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.f;
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
public class AppleDataReferenceBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ዜ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;

    static {
        ajc$preClinit();
    }

    public AppleDataReferenceBox() {
        super(ProtectedSandApp.s("ዜ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ዝ"), AppleDataReferenceBox.class);
        v E = eVar.E(ProtectedSandApp.s("ዟ"), ProtectedSandApp.s("ዠ"), ProtectedSandApp.s("ዡ"), "", "", "", ProtectedSandApp.s("ዞ"));
        String s4 = ProtectedSandApp.s("ዢ");
        ajc$tjp_0 = eVar.H(s4, E, 63);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዟ"), ProtectedSandApp.s("ዤ"), ProtectedSandApp.s("ዡ"), "", "", "", ProtectedSandApp.s("ዣ")), 67);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዟ"), ProtectedSandApp.s("ዥ"), ProtectedSandApp.s("ዡ"), "", "", "", ProtectedSandApp.s("ዣ")), 71);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.dataReferenceType = g.b(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.dataReferenceSize = a5;
        this.dataReference = g.h(byteBuffer, a5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(f.b(this.dataReferenceType));
        i.i(byteBuffer, this.dataReferenceSize);
        byteBuffer.put(l.b(this.dataReference));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.dataReferenceSize + 12;
    }

    public String getDataReference() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.dataReference;
    }

    public long getDataReferenceSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.dataReferenceSize;
    }

    public String getDataReferenceType() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.dataReferenceType;
    }
}

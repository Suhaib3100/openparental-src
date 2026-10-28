package com.coremedia.iso.boxes;

import com.coremedia.iso.f;
import com.coremedia.iso.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class OriginalFormatBox extends AbstractBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = ProtectedSandApp.s("ᄿ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private String dataFormat;

    static {
        ajc$preClinit();
    }

    public OriginalFormatBox() {
        super(ProtectedSandApp.s("ᄿ"));
        this.dataFormat = ProtectedSandApp.s("ᅀ");
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᅁ"), OriginalFormatBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᅃ"), ProtectedSandApp.s("ᅄ"), ProtectedSandApp.s("ᅅ"), "", "", "", ProtectedSandApp.s("ᅂ"));
        String s4 = ProtectedSandApp.s("ᅆ");
        ajc$tjp_0 = eVar.H(s4, E, 42);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅃ"), ProtectedSandApp.s("ᅈ"), ProtectedSandApp.s("ᅅ"), ProtectedSandApp.s("ᅂ"), ProtectedSandApp.s("ᅉ"), "", ProtectedSandApp.s("ᅇ")), 47);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅃ"), ProtectedSandApp.s("ᅊ"), ProtectedSandApp.s("ᅅ"), "", "", "", ProtectedSandApp.s("ᅂ")), 67);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.dataFormat = g.b(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(f.b(this.dataFormat));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 4L;
    }

    public String getDataFormat() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.dataFormat;
    }

    public void setDataFormat(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.dataFormat = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᅋ"));
        a5.append(getDataFormat());
        a5.append(ProtectedSandApp.s("ᅌ"));
        return a5.toString();
    }
}

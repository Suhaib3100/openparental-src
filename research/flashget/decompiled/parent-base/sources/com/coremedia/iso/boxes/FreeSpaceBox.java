package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class FreeSpaceBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("လ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    byte[] data;

    static {
        ajc$preClinit();
    }

    public FreeSpaceBox() {
        super(ProtectedSandApp.s("လ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ဝ"), FreeSpaceBox.class);
        v E = eVar.E(ProtectedSandApp.s("ဟ"), ProtectedSandApp.s("ဠ"), ProtectedSandApp.s("အ"), ProtectedSandApp.s("ဢ"), ProtectedSandApp.s("ဣ"), "", ProtectedSandApp.s("သ"));
        String s4 = ProtectedSandApp.s("ဤ");
        ajc$tjp_0 = eVar.H(s4, E, 42);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ဟ"), ProtectedSandApp.s("ဥ"), ProtectedSandApp.s("အ"), "", "", "", ProtectedSandApp.s("ဢ")), 46);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ဟ"), ProtectedSandApp.s("ဧ"), ProtectedSandApp.s("အ"), "", "", "", ProtectedSandApp.s("ဦ")), 61);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.data = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.data.length;
    }

    public byte[] getData() {
        g.b().c(e.v(ajc$tjp_1, this, this));
        return this.data;
    }

    public void setData(byte[] bArr) {
        g.b().c(e.w(ajc$tjp_0, this, this, bArr));
        this.data = bArr;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ဨ"));
        a5.append(this.data.length);
        a5.append(ProtectedSandApp.s("ဩ"));
        a5.append(getType());
        a5.append(ProtectedSandApp.s("ဪ"));
        return a5.toString();
    }
}

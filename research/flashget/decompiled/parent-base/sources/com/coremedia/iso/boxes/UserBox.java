package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class UserBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ኢ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    byte[] data;

    static {
        ajc$preClinit();
    }

    public UserBox(byte[] bArr) {
        super(ProtectedSandApp.s("ኢ"), bArr);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ኣ"), UserBox.class);
        v E = eVar.E(ProtectedSandApp.s("እ"), ProtectedSandApp.s("ኦ"), ProtectedSandApp.s("ኧ"), "", "", "", ProtectedSandApp.s("ኤ"));
        String s4 = ProtectedSandApp.s("ከ");
        ajc$tjp_0 = eVar.H(s4, E, 40);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("እ"), ProtectedSandApp.s("ኪ"), ProtectedSandApp.s("ኧ"), "", "", "", ProtectedSandApp.s("ኩ")), 47);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("እ"), ProtectedSandApp.s("ኬ"), ProtectedSandApp.s("ኧ"), ProtectedSandApp.s("ኩ"), ProtectedSandApp.s("ክ"), "", ProtectedSandApp.s("ካ")), 51);
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
        g.b().c(e.w(ajc$tjp_2, this, this, bArr));
        this.data = bArr;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_0, this, this), ProtectedSandApp.s("ኮ"));
        a5.append(getType());
        a5.append(ProtectedSandApp.s("ኯ"));
        a5.append(new String(getUserType()));
        a5.append(ProtectedSandApp.s("ኰ"));
        return android.support.v4.media.b.a(a5, this.data.length, ProtectedSandApp.s("\u12b1"));
    }
}

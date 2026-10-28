package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class UnknownBox extends AbstractBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    ByteBuffer data;

    static {
        ajc$preClinit();
    }

    public UnknownBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ን"), UnknownBox.class);
        v E = eVar.E(ProtectedSandApp.s("ኗ"), ProtectedSandApp.s("ኘ"), ProtectedSandApp.s("ኙ"), "", "", "", ProtectedSandApp.s("ኖ"));
        String s4 = ProtectedSandApp.s("ኚ");
        ajc$tjp_0 = eVar.H(s4, E, 52);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኗ"), ProtectedSandApp.s("ኜ"), ProtectedSandApp.s("ኙ"), ProtectedSandApp.s("ኖ"), ProtectedSandApp.s("ኝ"), "", ProtectedSandApp.s("ኛ")), 56);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኗ"), ProtectedSandApp.s("ኟ"), ProtectedSandApp.s("ኙ"), "", "", "", ProtectedSandApp.s("ኞ")), 61);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.data.limit();
    }

    public ByteBuffer getData() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer) {
        g.b().c(e.w(ajc$tjp_1, this, this, byteBuffer));
        this.data = byteBuffer;
    }

    public String toString() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return getClass().getName() + ProtectedSandApp.s("አ") + getType() + ProtectedSandApp.s("ኡ") + Integer.toHexString(hashCode());
    }
}

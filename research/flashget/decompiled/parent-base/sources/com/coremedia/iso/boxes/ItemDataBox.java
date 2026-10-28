package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class ItemDataBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ၿ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    ByteBuffer data;

    static {
        ajc$preClinit();
    }

    public ItemDataBox() {
        super(ProtectedSandApp.s("ၿ"));
        this.data = ByteBuffer.allocate(0);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ႀ"), ItemDataBox.class);
        v E = eVar.E(ProtectedSandApp.s("ႂ"), ProtectedSandApp.s("ႃ"), ProtectedSandApp.s("ႄ"), "", "", "", ProtectedSandApp.s("ႁ"));
        String s4 = ProtectedSandApp.s("ႅ");
        ajc$tjp_0 = eVar.H(s4, E, 19);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ႂ"), ProtectedSandApp.s("ႇ"), ProtectedSandApp.s("ႄ"), ProtectedSandApp.s("ႁ"), ProtectedSandApp.s("ႈ"), "", ProtectedSandApp.s("ႆ")), 23);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
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
}

package com.googlecode.mp4parser.boxes.mp4;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class ESDescriptorBox extends AbstractDescriptorBox {
    public static final String TYPE = ProtectedSandApp.s("ካ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;

    static {
        ajc$preClinit();
    }

    public ESDescriptorBox() {
        super(ProtectedSandApp.s("ካ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ኬ\u0001"), ESDescriptorBox.class);
        v E = eVar.E(ProtectedSandApp.s("ኮ\u0001"), ProtectedSandApp.s("ኯ\u0001"), ProtectedSandApp.s("ኰ\u0001"), "", "", "", ProtectedSandApp.s("ክ\u0001"));
        String s4 = ProtectedSandApp.s("\u12b1\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 35);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኮ\u0001"), ProtectedSandApp.s("ኳ\u0001"), ProtectedSandApp.s("ኰ\u0001"), ProtectedSandApp.s("ክ\u0001"), ProtectedSandApp.s("ኴ\u0001"), "", ProtectedSandApp.s("ኲ\u0001")), 39);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኮ\u0001"), ProtectedSandApp.s("\u12b6\u0001"), ProtectedSandApp.s("ኰ\u0001"), ProtectedSandApp.s("\u12b7\u0001"), ProtectedSandApp.s("ኸ\u0001"), "", ProtectedSandApp.s("ኵ\u0001")), 44);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኮ\u0001"), ProtectedSandApp.s("ኺ\u0001"), ProtectedSandApp.s("ኰ\u0001"), "", "", "", ProtectedSandApp.s("ኹ\u0001")), 55);
    }

    public boolean equals(Object obj) {
        g.b().c(e.w(ajc$tjp_2, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.data;
        ByteBuffer byteBuffer2 = ((ESDescriptorBox) obj).data;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox, com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        h esDescriptor = getEsDescriptor();
        if (esDescriptor != null) {
            byteBuffer.put((ByteBuffer) esDescriptor.g().rewind());
        } else {
            byteBuffer.put(this.data.duplicate());
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox, com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (getEsDescriptor() != null ? r0.b() : this.data.remaining()) + 4;
    }

    public h getEsDescriptor() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return (h) super.getDescriptor();
    }

    public int hashCode() {
        g.b().c(e.v(ajc$tjp_3, this, this));
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public void setEsDescriptor(h hVar) {
        g.b().c(e.w(ajc$tjp_1, this, this, hVar));
        super.setDescriptor(hVar);
    }
}

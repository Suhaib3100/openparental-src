package com.googlecode.mp4parser.boxes.mp4;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.m;
import com.googlecode.mp4parser.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AbstractDescriptorBox extends AbstractFullBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static Logger log;
    protected ByteBuffer data;
    protected b descriptor;

    static {
        ajc$preClinit();
        log = Logger.getLogger(AbstractDescriptorBox.class.getName());
    }

    public AbstractDescriptorBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ኛ\u0001"), AbstractDescriptorBox.class);
        v E = eVar.E(ProtectedSandApp.s("ኝ\u0001"), ProtectedSandApp.s("ኞ\u0001"), ProtectedSandApp.s("ኟ\u0001"), "", "", "", ProtectedSandApp.s("ኜ\u0001"));
        String s4 = ProtectedSandApp.s("አ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 42);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኝ\u0001"), ProtectedSandApp.s("ኢ\u0001"), ProtectedSandApp.s("ኟ\u0001"), ProtectedSandApp.s("ኜ\u0001"), ProtectedSandApp.s("ኣ\u0001"), "", ProtectedSandApp.s("ኡ\u0001")), 46);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኝ\u0001"), ProtectedSandApp.s("እ\u0001"), ProtectedSandApp.s("ኟ\u0001"), "", "", "", ProtectedSandApp.s("ኤ\u0001")), 62);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኝ\u0001"), ProtectedSandApp.s("ኦ\u0001"), ProtectedSandApp.s("ኟ\u0001"), ProtectedSandApp.s("ኤ\u0001"), ProtectedSandApp.s("ኧ\u0001"), "", ProtectedSandApp.s("ኡ\u0001")), 66);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ኝ\u0001"), ProtectedSandApp.s("ኩ\u0001"), ProtectedSandApp.s("ኟ\u0001"), "", "", "", ProtectedSandApp.s("ከ\u0001")), 70);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        String s4 = ProtectedSandApp.s("ኪ\u0001");
        parseVersionAndFlags(byteBuffer);
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.data.rewind();
            this.descriptor = m.a(-1, this.data.duplicate());
        } catch (IOException e4) {
            log.log(Level.WARNING, s4, (Throwable) e4);
        } catch (IndexOutOfBoundsException e5) {
            log.log(Level.WARNING, s4, (Throwable) e5);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.data.limit() + 4;
    }

    public ByteBuffer getData() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.data;
    }

    public b getDescriptor() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.descriptor;
    }

    public String getDescriptorAsString() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.descriptor.toString();
    }

    public void setData(ByteBuffer byteBuffer) {
        g.b().c(e.w(ajc$tjp_1, this, this, byteBuffer));
        this.data = byteBuffer;
    }

    public void setDescriptor(b bVar) {
        g.b().c(e.w(ajc$tjp_3, this, this, bVar));
        this.descriptor = bVar;
    }
}

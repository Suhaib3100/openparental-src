package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class DataEntryUrnBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("࿕");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private String location;
    private String name;

    static {
        ajc$preClinit();
    }

    public DataEntryUrnBox() {
        super(ProtectedSandApp.s("࿕"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("࿖"), DataEntryUrnBox.class);
        v E = eVar.E(ProtectedSandApp.s("࿘"), ProtectedSandApp.s("࿙"), ProtectedSandApp.s("࿚"), "", "", "", ProtectedSandApp.s("࿗"));
        String s4 = ProtectedSandApp.s("\u0fdb");
        ajc$tjp_0 = eVar.H(s4, E, 40);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿘"), ProtectedSandApp.s("\u0fdc"), ProtectedSandApp.s("࿚"), "", "", "", ProtectedSandApp.s("࿗")), 44);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿘"), ProtectedSandApp.s("\u0fdd"), ProtectedSandApp.s("࿚"), "", "", "", ProtectedSandApp.s("࿗")), 67);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.name = g.g(byteBuffer);
        this.location = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(l.b(this.name));
        byteBuffer.put((byte) 0);
        byteBuffer.put(l.b(this.location));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.location) + l.c(this.name) + 1 + 1;
    }

    public String getLocation() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.location;
    }

    public String getName() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.name;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("\u0fde"));
        a5.append(getName());
        a5.append(ProtectedSandApp.s("\u0fdf"));
        a5.append(getLocation());
        a5.append(ProtectedSandApp.s("\u0fe0"));
        return a5.toString();
    }
}

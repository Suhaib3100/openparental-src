package com.coremedia.iso.boxes;

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
public class DescriptionBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("\u0fe3");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private String description;
    private String language;

    static {
        ajc$preClinit();
    }

    public DescriptionBox() {
        super(ProtectedSandApp.s("\u0fe3"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("\u0fe4"), DescriptionBox.class);
        v E = eVar.E(ProtectedSandApp.s("\u0fe6"), ProtectedSandApp.s("\u0fe7"), ProtectedSandApp.s("\u0fe8"), "", "", "", ProtectedSandApp.s("\u0fe5"));
        String s4 = ProtectedSandApp.s("\u0fe9");
        ajc$tjp_0 = eVar.H(s4, E, 40);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u0fe6"), ProtectedSandApp.s("\u0fea"), ProtectedSandApp.s("\u0fe8"), "", "", "", ProtectedSandApp.s("\u0fe5")), 44);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u0fe6"), ProtectedSandApp.s("\u0feb"), ProtectedSandApp.s("\u0fe8"), "", "", "", ProtectedSandApp.s("\u0fe5")), 67);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u0fe6"), ProtectedSandApp.s("\u0fed"), ProtectedSandApp.s("\u0fe8"), ProtectedSandApp.s("\u0fe5"), ProtectedSandApp.s("\u0fee"), "", ProtectedSandApp.s("\u0fec")), 71);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u0fe6"), ProtectedSandApp.s("\u0fef"), ProtectedSandApp.s("\u0fe8"), ProtectedSandApp.s("\u0fe5"), ProtectedSandApp.s("\u0ff0"), "", ProtectedSandApp.s("\u0fec")), 75);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.description = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.description));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.description) + 7;
    }

    public String getDescription() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.description;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setDescription(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, str));
        this.description = str;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.language = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("\u0ff1"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("\u0ff2"));
        a5.append(getDescription());
        a5.append(ProtectedSandApp.s("\u0ff3"));
        return a5.toString();
    }
}

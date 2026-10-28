package com.googlecode.mp4parser.boxes.apple;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class PixelAspectRationAtom extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᆉ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private int hSpacing;
    private int vSpacing;

    static {
        ajc$preClinit();
    }

    public PixelAspectRationAtom() {
        super(ProtectedSandApp.s("ᆉ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᆊ\u0001"), PixelAspectRationAtom.class);
        v E = eVar.E(ProtectedSandApp.s("ᆌ\u0001"), ProtectedSandApp.s("ᆍ\u0001"), ProtectedSandApp.s("ᆎ\u0001"), "", "", "", ProtectedSandApp.s("ᆋ\u0001"));
        String s4 = ProtectedSandApp.s("ᆏ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 35);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆌ\u0001"), ProtectedSandApp.s("ᆑ\u0001"), ProtectedSandApp.s("ᆎ\u0001"), ProtectedSandApp.s("ᆋ\u0001"), ProtectedSandApp.s("ᆒ\u0001"), "", ProtectedSandApp.s("ᆐ\u0001")), 39);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆌ\u0001"), ProtectedSandApp.s("ᆓ\u0001"), ProtectedSandApp.s("ᆎ\u0001"), "", "", "", ProtectedSandApp.s("ᆋ\u0001")), 43);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆌ\u0001"), ProtectedSandApp.s("ᆔ\u0001"), ProtectedSandApp.s("ᆎ\u0001"), ProtectedSandApp.s("ᆋ\u0001"), ProtectedSandApp.s("ᆕ\u0001"), "", ProtectedSandApp.s("ᆐ\u0001")), 47);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.hSpacing = byteBuffer.getInt();
        this.vSpacing = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.hSpacing);
        byteBuffer.putInt(this.vSpacing);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public int gethSpacing() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.hSpacing;
    }

    public int getvSpacing() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.vSpacing;
    }

    public void sethSpacing(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.hSpacing = i4;
    }

    public void setvSpacing(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.vSpacing = i4;
    }
}

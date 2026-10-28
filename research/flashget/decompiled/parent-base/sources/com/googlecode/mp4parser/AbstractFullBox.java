package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public abstract class AbstractFullBox extends AbstractBox implements FullBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private int flags;
    private int version;

    static {
        ajc$preClinit();
    }

    protected AbstractFullBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("౹\u0001"), AbstractFullBox.class);
        v E = eVar.E(ProtectedSandApp.s("౻\u0001"), ProtectedSandApp.s("౼\u0001"), ProtectedSandApp.s("౽\u0001"), ProtectedSandApp.s("౾\u0001"), ProtectedSandApp.s("౿\u0001"), "", ProtectedSandApp.s("౺\u0001"));
        String s4 = ProtectedSandApp.s("ಀ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 51);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("౻\u0001"), ProtectedSandApp.s("ಁ\u0001"), ProtectedSandApp.s("౽\u0001"), ProtectedSandApp.s("౾\u0001"), ProtectedSandApp.s("ಂ\u0001"), "", ProtectedSandApp.s("౺\u0001")), 64);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    @va.a
    public int getFlags() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.flags;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    @va.a
    public int getVersion() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.version;
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = com.coremedia.iso.g.p(byteBuffer);
        this.flags = com.coremedia.iso.g.k(byteBuffer);
        return 4L;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.flags = i4;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_0, this, this, new Integer(i4)));
        this.version = i4;
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        i.m(byteBuffer, this.version);
        i.h(byteBuffer, this.flags);
    }

    protected AbstractFullBox(String str, byte[] bArr) {
        super(str, bArr);
    }
}

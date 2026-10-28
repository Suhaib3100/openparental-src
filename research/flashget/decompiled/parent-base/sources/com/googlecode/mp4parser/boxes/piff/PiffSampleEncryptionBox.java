package com.googlecode.mp4parser.boxes.piff;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox;
import com.googlecode.mp4parser.g;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class PiffSampleEncryptionBox extends AbstractSampleEncryptionBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;

    static {
        ajc$preClinit();
    }

    public PiffSampleEncryptionBox() {
        super(ProtectedSandApp.s("Ꭽ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ꭾ\u0001"), PiffSampleEncryptionBox.class);
        v E = eVar.E(ProtectedSandApp.s("Ꮀ\u0001"), ProtectedSandApp.s("Ꮁ\u0001"), ProtectedSandApp.s("Ꮂ\u0001"), "", "", "", ProtectedSandApp.s("Ꭿ\u0001"));
        String s4 = ProtectedSandApp.s("Ꮃ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 46);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮀ\u0001"), ProtectedSandApp.s("Ꮅ\u0001"), ProtectedSandApp.s("Ꮂ\u0001"), ProtectedSandApp.s("Ꭿ\u0001"), ProtectedSandApp.s("Ꮆ\u0001"), "", ProtectedSandApp.s("Ꮄ\u0001")), 50);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮀ\u0001"), ProtectedSandApp.s("Ꮇ\u0001"), ProtectedSandApp.s("Ꮂ\u0001"), "", "", "", ProtectedSandApp.s("Ꭿ\u0001")), 54);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮀ\u0001"), ProtectedSandApp.s("Ꮈ\u0001"), ProtectedSandApp.s("Ꮂ\u0001"), ProtectedSandApp.s("Ꭿ\u0001"), ProtectedSandApp.s("Ꮉ\u0001"), "", ProtectedSandApp.s("Ꮄ\u0001")), 58);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮀ\u0001"), ProtectedSandApp.s("Ꮋ\u0001"), ProtectedSandApp.s("Ꮂ\u0001"), "", "", "", ProtectedSandApp.s("Ꮊ\u0001")), 62);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮀ\u0001"), ProtectedSandApp.s("Ꮌ\u0001"), ProtectedSandApp.s("Ꮂ\u0001"), ProtectedSandApp.s("Ꮊ\u0001"), ProtectedSandApp.s("Ꮍ\u0001"), "", ProtectedSandApp.s("Ꮄ\u0001")), 66);
    }

    public int getAlgorithmId() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.algorithmId;
    }

    public int getIvSize() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.ivSize;
    }

    public byte[] getKid() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.kid;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-94, 57, 79, 82, 90, -101, 79, com.google.common.base.c.f54878x, -94, 68, 108, 66, 124, 100, -115, -12};
    }

    @Override // com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox
    @va.a
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    public void setAlgorithmId(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.algorithmId = i4;
    }

    public void setIvSize(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.ivSize = i4;
    }

    public void setKid(byte[] bArr) {
        g.b().c(e.w(ajc$tjp_5, this, this, bArr));
        this.kid = bArr;
    }

    @va.a
    public void setOverrideTrackEncryptionBoxParameters(boolean z4) {
        if (z4) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }
}

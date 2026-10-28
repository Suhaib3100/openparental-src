package com.googlecode.mp4parser.boxes.piff;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox;
import com.googlecode.mp4parser.g;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public PiffTrackEncryptionBox() {
        super(ProtectedSandApp.s("Ꮎ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ꮏ\u0001"), PiffTrackEncryptionBox.class);
        ajc$tjp_0 = eVar.H(ProtectedSandApp.s("Ꮔ\u0001"), eVar.E(ProtectedSandApp.s("Ꮑ\u0001"), ProtectedSandApp.s("Ꮒ\u0001"), ProtectedSandApp.s("Ꮓ\u0001"), "", "", "", ProtectedSandApp.s("Ꮐ\u0001")), 29);
    }

    @Override // com.googlecode.mp4parser.AbstractFullBox, com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return 0;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-119, 116, -37, -50, 123, -25, 76, 81, -124, -7, 113, 72, -7, -120, 37, 84};
    }
}

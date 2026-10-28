package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public abstract class AbstractTrackEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte[] default_KID;

    static {
        ajc$preClinit();
    }

    protected AbstractTrackEncryptionBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ཛྷ\u0001"), AbstractTrackEncryptionBox.class);
        v E = eVar.E(ProtectedSandApp.s("ཞ\u0001"), ProtectedSandApp.s("ཟ\u0001"), ProtectedSandApp.s("འ\u0001"), "", "", "", ProtectedSandApp.s("ཝ\u0001"));
        String s4 = ProtectedSandApp.s("ཡ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 24);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཞ\u0001"), ProtectedSandApp.s("ལ\u0001"), ProtectedSandApp.s("འ\u0001"), ProtectedSandApp.s("ཝ\u0001"), ProtectedSandApp.s("ཤ\u0001"), "", ProtectedSandApp.s("ར\u0001")), 28);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཞ\u0001"), ProtectedSandApp.s("ཥ\u0001"), ProtectedSandApp.s("འ\u0001"), "", "", "", ProtectedSandApp.s("ཝ\u0001")), 32);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཞ\u0001"), ProtectedSandApp.s("ས\u0001"), ProtectedSandApp.s("འ\u0001"), ProtectedSandApp.s("ཝ\u0001"), ProtectedSandApp.s("ཧ\u0001"), "", ProtectedSandApp.s("ར\u0001")), 36);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཞ\u0001"), ProtectedSandApp.s("ཀྵ\u0001"), ProtectedSandApp.s("འ\u0001"), "", "", "", ProtectedSandApp.s("ཨ\u0001")), 40);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཞ\u0001"), ProtectedSandApp.s("ཪ\u0001"), ProtectedSandApp.s("འ\u0001"), ProtectedSandApp.s("ཨ\u0001"), ProtectedSandApp.s("ཫ\u0001"), "", ProtectedSandApp.s("ར\u0001")), 46);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཞ\u0001"), ProtectedSandApp.s("\u0f6d\u0001"), ProtectedSandApp.s("འ\u0001"), ProtectedSandApp.s("\u0f6e\u0001"), ProtectedSandApp.s("\u0f6f\u0001"), "", ProtectedSandApp.s("ཬ\u0001")), 76);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཞ\u0001"), ProtectedSandApp.s("\u0f70\u0001"), ProtectedSandApp.s("འ\u0001"), "", "", "", ProtectedSandApp.s("ཝ\u0001")), 90);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.defaultAlgorithmId = g.k(byteBuffer);
        this.defaultIvSize = g.p(byteBuffer);
        byte[] bArr = new byte[16];
        this.default_KID = bArr;
        byteBuffer.get(bArr);
    }

    public boolean equals(Object obj) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_6, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractTrackEncryptionBox abstractTrackEncryptionBox = (AbstractTrackEncryptionBox) obj;
        return this.defaultAlgorithmId == abstractTrackEncryptionBox.defaultAlgorithmId && this.defaultIvSize == abstractTrackEncryptionBox.defaultIvSize && Arrays.equals(this.default_KID, abstractTrackEncryptionBox.default_KID);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.h(byteBuffer, this.defaultAlgorithmId);
        i.m(byteBuffer, this.defaultIvSize);
        byteBuffer.put(this.default_KID);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public int getDefaultAlgorithmId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.defaultAlgorithmId;
    }

    public int getDefaultIvSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.defaultIvSize;
    }

    public UUID getDefault_KID() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        ByteBuffer wrap = ByteBuffer.wrap(this.default_KID);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public int hashCode() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        int i4 = ((this.defaultAlgorithmId * 31) + this.defaultIvSize) * 31;
        byte[] bArr = this.default_KID;
        return i4 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public void setDefaultAlgorithmId(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.defaultAlgorithmId = i4;
    }

    public void setDefaultIvSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.defaultIvSize = i4;
    }

    public void setDefault_KID(UUID uuid) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, uuid));
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        this.default_KID = wrap.array();
    }
}

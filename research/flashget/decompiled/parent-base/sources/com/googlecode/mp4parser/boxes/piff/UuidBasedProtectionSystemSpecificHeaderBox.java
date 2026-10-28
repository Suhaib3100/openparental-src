package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.util.o;
import java.nio.ByteBuffer;
import java.util.UUID;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    public static byte[] USER_TYPE;
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    a protectionSpecificHeader;
    UUID systemId;

    static {
        ajc$preClinit();
        USER_TYPE = new byte[]{-48, -118, 79, com.google.common.base.c.B, com.google.common.base.c.f54872r, -13, 74, -126, -74, -56, 50, -40, -85, -95, -125, -45};
    }

    public UuidBasedProtectionSystemSpecificHeaderBox() {
        super(ProtectedSandApp.s("Ꮫ\u0001"), USER_TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ꮬ\u0001"), UuidBasedProtectionSystemSpecificHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("Ꮮ\u0001"), ProtectedSandApp.s("Ꮯ\u0001"), ProtectedSandApp.s("Ꮰ\u0001"), "", "", "", ProtectedSandApp.s("Ꮭ\u0001"));
        String s4 = ProtectedSandApp.s("Ꮱ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 67);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮮ\u0001"), ProtectedSandApp.s("Ꮳ\u0001"), ProtectedSandApp.s("Ꮰ\u0001"), ProtectedSandApp.s("Ꮭ\u0001"), ProtectedSandApp.s("Ꮴ\u0001"), "", ProtectedSandApp.s("Ꮲ\u0001")), 71);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮮ\u0001"), ProtectedSandApp.s("Ꮶ\u0001"), ProtectedSandApp.s("Ꮰ\u0001"), "", "", "", ProtectedSandApp.s("Ꮵ\u0001")), 75);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮮ\u0001"), ProtectedSandApp.s("Ꮸ\u0001"), ProtectedSandApp.s("Ꮰ\u0001"), "", "", "", ProtectedSandApp.s("Ꮷ\u0001")), 79);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮮ\u0001"), ProtectedSandApp.s("Ꮹ\u0001"), ProtectedSandApp.s("Ꮰ\u0001"), "", "", "", ProtectedSandApp.s("Ꮵ\u0001")), 83);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮮ\u0001"), ProtectedSandApp.s("Ꮺ\u0001"), ProtectedSandApp.s("Ꮰ\u0001"), ProtectedSandApp.s("Ꮷ\u0001"), ProtectedSandApp.s("Ꮻ\u0001"), "", ProtectedSandApp.s("Ꮲ\u0001")), 87);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮮ\u0001"), ProtectedSandApp.s("Ꮼ\u0001"), ProtectedSandApp.s("Ꮰ\u0001"), "", "", "", ProtectedSandApp.s("Ꮵ\u0001")), 92);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.systemId = o.a(bArr);
        com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.protectionSpecificHeader = a.a(this.systemId, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.l(byteBuffer, this.systemId.getMostSignificantBits());
        byteBuffer.putLong(this.systemId.getLeastSignificantBits());
        ByteBuffer b5 = this.protectionSpecificHeader.b();
        b5.rewind();
        byteBuffer.putInt(b5.limit());
        byteBuffer.put(b5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.protectionSpecificHeader.b().limit() + 24;
    }

    public a getProtectionSpecificHeader() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.protectionSpecificHeader;
    }

    public String getProtectionSpecificHeaderString() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.protectionSpecificHeader.toString();
    }

    public UUID getSystemId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.systemId;
    }

    public String getSystemIdString() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.systemId.toString();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return USER_TYPE;
    }

    public void setProtectionSpecificHeader(a aVar) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, aVar));
        this.protectionSpecificHeader = aVar;
    }

    public void setSystemId(UUID uuid) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, uuid));
        this.systemId = uuid;
    }

    public String toString() {
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_6, this, this), ProtectedSandApp.s("Ꮽ\u0001"));
        a5.append(this.systemId.toString());
        a5.append(ProtectedSandApp.s("Ꮾ\u0001"));
        a5.append(this.protectionSpecificHeader.b().limit());
        a5.append('}');
        return a5.toString();
    }
}

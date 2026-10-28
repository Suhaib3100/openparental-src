package com.mp4parser.iso23001.part7;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.util.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static byte[] OMA2_SYSTEM_ID;
    public static byte[] PLAYREADY_SYSTEM_ID;
    public static final String TYPE = ProtectedSandApp.s("ᦱ\u0001");
    public static byte[] WIDEVINE;
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    byte[] content;
    List<UUID> keyIds;
    byte[] systemId;

    static {
        ajc$preClinit();
        OMA2_SYSTEM_ID = o.b(UUID.fromString(ProtectedSandApp.s("ᦲ\u0001")));
        WIDEVINE = o.b(UUID.fromString(ProtectedSandApp.s("ᦳ\u0001")));
        PLAYREADY_SYSTEM_ID = o.b(UUID.fromString(ProtectedSandApp.s("ᦴ\u0001")));
    }

    public ProtectionSystemSpecificHeaderBox(byte[] bArr, byte[] bArr2) {
        super(ProtectedSandApp.s("ᦱ\u0001"));
        this.keyIds = new ArrayList();
        this.content = bArr2;
        this.systemId = bArr;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᦵ\u0001"), ProtectionSystemSpecificHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᦷ\u0001"), ProtectedSandApp.s("ᦸ\u0001"), ProtectedSandApp.s("ᦹ\u0001"), "", "", "", ProtectedSandApp.s("ᦶ\u0001"));
        String s4 = ProtectedSandApp.s("ᦺ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 50);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᦷ\u0001"), ProtectedSandApp.s("ᦼ\u0001"), ProtectedSandApp.s("ᦹ\u0001"), ProtectedSandApp.s("ᦶ\u0001"), ProtectedSandApp.s("ᦽ\u0001"), "", ProtectedSandApp.s("ᦻ\u0001")), 54);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᦷ\u0001"), ProtectedSandApp.s("ᦿ\u0001"), ProtectedSandApp.s("ᦹ\u0001"), "", "", "", ProtectedSandApp.s("ᦾ\u0001")), 61);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᦷ\u0001"), ProtectedSandApp.s("ᧀ\u0001"), ProtectedSandApp.s("ᦹ\u0001"), ProtectedSandApp.s("ᦾ\u0001"), ProtectedSandApp.s("ᧁ\u0001"), "", ProtectedSandApp.s("ᦻ\u0001")), 65);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᦷ\u0001"), ProtectedSandApp.s("ᧂ\u0001"), ProtectedSandApp.s("ᦹ\u0001"), "", "", "", ProtectedSandApp.s("ᦾ\u0001")), 70);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᦷ\u0001"), ProtectedSandApp.s("ᧃ\u0001"), ProtectedSandApp.s("ᦹ\u0001"), ProtectedSandApp.s("ᦾ\u0001"), ProtectedSandApp.s("ᧄ\u0001"), "", ProtectedSandApp.s("ᦻ\u0001")), 74);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[16];
        this.systemId = bArr;
        byteBuffer.get(bArr);
        if (getVersion() > 0) {
            int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
            while (true) {
                int i4 = a5 - 1;
                if (a5 <= 0) {
                    break;
                }
                byte[] bArr2 = new byte[16];
                byteBuffer.get(bArr2);
                this.keyIds.add(o.a(bArr2));
                a5 = i4;
            }
        }
        g.l(byteBuffer);
        byte[] bArr3 = new byte[byteBuffer.remaining()];
        this.content = bArr3;
        byteBuffer.get(bArr3);
    }

    public byte[] getContent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.content;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        long length = this.content.length + 24;
        return getVersion() > 0 ? length + 4 + (this.keyIds.size() * 16) : length;
    }

    public List<UUID> getKeyIds() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.keyIds;
    }

    public byte[] getSystemId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.systemId;
    }

    public void setContent(byte[] bArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, bArr));
        this.content = bArr;
    }

    public void setKeyIds(List<UUID> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, list));
        this.keyIds = list;
    }

    public void setSystemId(byte[] bArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, bArr));
        this.systemId = bArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.systemId, 0, 16);
        if (getVersion() > 0) {
            i.i(byteBuffer, this.keyIds.size());
            Iterator<UUID> it = this.keyIds.iterator();
            while (it.hasNext()) {
                byteBuffer.put(o.b(it.next()));
            }
        }
        i.i(byteBuffer, this.content.length);
        byteBuffer.put(this.content);
    }

    public ProtectionSystemSpecificHeaderBox() {
        super(ProtectedSandApp.s("ᦱ\u0001"));
        this.keyIds = new ArrayList();
    }
}

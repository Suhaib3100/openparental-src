package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class BaseLocationBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ስ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    String baseLocation;
    String purchaseLocation;

    static {
        ajc$preClinit();
    }

    public BaseLocationBox() {
        super(ProtectedSandApp.s("ስ\u0001"));
        this.baseLocation = "";
        this.purchaseLocation = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ሶ\u0001"), BaseLocationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ሸ\u0001"), ProtectedSandApp.s("ሹ\u0001"), ProtectedSandApp.s("ሺ\u0001"), "", "", "", ProtectedSandApp.s("ሷ\u0001"));
        String s4 = ProtectedSandApp.s("ሻ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 44);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሸ\u0001"), ProtectedSandApp.s("ሽ\u0001"), ProtectedSandApp.s("ሺ\u0001"), ProtectedSandApp.s("ሷ\u0001"), ProtectedSandApp.s("ሾ\u0001"), "", ProtectedSandApp.s("ሼ\u0001")), 48);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሸ\u0001"), ProtectedSandApp.s("ሿ\u0001"), ProtectedSandApp.s("ሺ\u0001"), "", "", "", ProtectedSandApp.s("ሷ\u0001")), 52);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሸ\u0001"), ProtectedSandApp.s("ቀ\u0001"), ProtectedSandApp.s("ሺ\u0001"), ProtectedSandApp.s("ሷ\u0001"), ProtectedSandApp.s("ቁ\u0001"), "", ProtectedSandApp.s("ሼ\u0001")), 56);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሸ\u0001"), ProtectedSandApp.s("ቃ\u0001"), ProtectedSandApp.s("ሺ\u0001"), ProtectedSandApp.s("ቄ\u0001"), ProtectedSandApp.s("ቅ\u0001"), "", ProtectedSandApp.s("ቂ\u0001")), 86);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሸ\u0001"), ProtectedSandApp.s("ቇ\u0001"), ProtectedSandApp.s("ሺ\u0001"), "", "", "", ProtectedSandApp.s("ቆ\u0001")), 100);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሸ\u0001"), ProtectedSandApp.s("ቈ\u0001"), ProtectedSandApp.s("ሺ\u0001"), "", "", "", ProtectedSandApp.s("ሷ\u0001")), 107);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        String g4 = g.g(byteBuffer);
        this.baseLocation = g4;
        byteBuffer.get(new byte[255 - l.c(g4)]);
        String g5 = g.g(byteBuffer);
        this.purchaseLocation = g5;
        byteBuffer.get(new byte[255 - l.c(g5)]);
        byteBuffer.get(new byte[512]);
    }

    public boolean equals(Object obj) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseLocationBox baseLocationBox = (BaseLocationBox) obj;
        String str = this.baseLocation;
        if (str == null ? baseLocationBox.baseLocation != null : !str.equals(baseLocationBox.baseLocation)) {
            return false;
        }
        String str2 = this.purchaseLocation;
        String str3 = baseLocationBox.purchaseLocation;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public String getBaseLocation() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.baseLocation;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(l.b(this.baseLocation));
        byteBuffer.put(new byte[256 - l.c(this.baseLocation)]);
        byteBuffer.put(l.b(this.purchaseLocation));
        byteBuffer.put(new byte[256 - l.c(this.purchaseLocation)]);
        byteBuffer.put(new byte[512]);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 1028L;
    }

    public String getPurchaseLocation() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.purchaseLocation;
    }

    public int hashCode() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        String str = this.baseLocation;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.purchaseLocation;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setBaseLocation(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.baseLocation = str;
    }

    public void setPurchaseLocation(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.purchaseLocation = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_6, this, this), ProtectedSandApp.s("\u1249\u0001"));
        a5.append(this.baseLocation);
        a5.append(ProtectedSandApp.s("ቊ\u0001"));
        return android.support.v4.media.c.a(a5, this.purchaseLocation, ProtectedSandApp.s("ቋ\u0001"));
    }

    public BaseLocationBox(String str, String str2) {
        super(ProtectedSandApp.s("ስ\u0001"));
        this.baseLocation = str;
        this.purchaseLocation = str2;
    }
}

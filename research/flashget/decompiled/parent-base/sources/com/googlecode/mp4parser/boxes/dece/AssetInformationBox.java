package com.googlecode.mp4parser.boxes.dece;

import androidx.compose.foundation.text.modifiers.n;
import com.android.internal.telephony.cdma.UserData;
import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AssetInformationBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = ProtectedSandApp.s("ሦ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    String apid;
    String profileVersion;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f63895a;

        /* renamed from: b, reason: collision with root package name */
        public String f63896b;

        /* renamed from: c, reason: collision with root package name */
        public String f63897c;

        public a(String str, String str2, String str3) {
            this.f63895a = str;
            this.f63896b = str2;
            this.f63897c = str3;
        }

        public int a() {
            return l.c(this.f63897c) + l.c(this.f63896b) + l.c(this.f63895a) + 3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f63897c.equals(aVar.f63897c) && this.f63895a.equals(aVar.f63895a) && this.f63896b.equals(aVar.f63896b);
        }

        public int hashCode() {
            return this.f63897c.hashCode() + n.a(this.f63896b, this.f63895a.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ሢ\u0001"));
            sb.append(this.f63895a);
            sb.append(ProtectedSandApp.s("ሣ\u0001"));
            sb.append(this.f63896b);
            sb.append(ProtectedSandApp.s("ሤ\u0001"));
            return android.support.v4.media.c.a(sb, this.f63897c, ProtectedSandApp.s("ሥ\u0001"));
        }
    }

    static {
        ajc$preClinit();
    }

    public AssetInformationBox() {
        super(ProtectedSandApp.s("ሦ\u0001"));
        this.apid = "";
        this.profileVersion = ProtectedSandApp.s("ሧ\u0001");
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ረ\u0001"), AssetInformationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ሪ\u0001"), ProtectedSandApp.s("ራ\u0001"), ProtectedSandApp.s("ሬ\u0001"), "", "", "", ProtectedSandApp.s("ሩ\u0001"));
        String s4 = ProtectedSandApp.s("ር\u0001");
        ajc$tjp_0 = eVar.H(s4, E, UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሪ\u0001"), ProtectedSandApp.s("ሯ\u0001"), ProtectedSandApp.s("ሬ\u0001"), ProtectedSandApp.s("ሩ\u0001"), ProtectedSandApp.s("ሰ\u0001"), "", ProtectedSandApp.s("ሮ\u0001")), 135);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሪ\u0001"), ProtectedSandApp.s("ሱ\u0001"), ProtectedSandApp.s("ሬ\u0001"), "", "", "", ProtectedSandApp.s("ሩ\u0001")), 139);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሪ\u0001"), ProtectedSandApp.s("ሲ\u0001"), ProtectedSandApp.s("ሬ\u0001"), ProtectedSandApp.s("ሩ\u0001"), ProtectedSandApp.s("ሳ\u0001"), "", ProtectedSandApp.s("ሮ\u0001")), 143);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.profileVersion = g.h(byteBuffer, 4);
        this.apid = g.g(byteBuffer);
    }

    public String getApid() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.apid;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() != 0) {
            throw new RuntimeException(ProtectedSandApp.s("ሴ\u0001") + getVersion());
        }
        byteBuffer.put(l.b(this.profileVersion), 0, 4);
        byteBuffer.put(l.b(this.apid));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.apid) + 9;
    }

    public String getProfileVersion() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.profileVersion;
    }

    @va.a
    public boolean isHidden() {
        return (getFlags() & 1) == 1;
    }

    public void setApid(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.apid = str;
    }

    @va.a
    public void setHidden(boolean z4) {
        int flags = getFlags();
        if (isHidden() ^ z4) {
            if (z4) {
                setFlags(flags | 1);
            } else {
                setFlags(16777214 & flags);
            }
        }
    }

    public void setProfileVersion(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.profileVersion = str;
    }
}

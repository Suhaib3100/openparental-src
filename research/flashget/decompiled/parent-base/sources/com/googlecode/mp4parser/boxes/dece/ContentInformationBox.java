package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.luck.picture.lib.config.PictureConfig;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import lg.v;
import org.apache.log4j.net.SyslogAppender;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class ContentInformationBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ቌ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_12 = null;
    private static final /* synthetic */ c.b ajc$tjp_13 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    Map<String, String> brandEntries;
    String codecs;
    Map<String, String> idEntries;
    String languages;
    String mimeSubtypeName;
    String profileLevelIdc;
    String protection;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f63898a;

        /* renamed from: b, reason: collision with root package name */
        String f63899b;

        public a(String str, String str2) {
            this.f63898a = str;
            this.f63899b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f63898a;
            if (str == null ? aVar.f63898a != null : !str.equals(aVar.f63898a)) {
                return false;
            }
            String str2 = this.f63899b;
            String str3 = aVar.f63899b;
            return str2 == null ? str3 == null : str2.equals(str3);
        }

        public int hashCode() {
            String str = this.f63898a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f63899b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    static {
        ajc$preClinit();
    }

    public ContentInformationBox() {
        super(ProtectedSandApp.s("ቌ\u0001"));
        this.brandEntries = new LinkedHashMap();
        this.idEntries = new LinkedHashMap();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ቍ\u0001"), ContentInformationBox.class);
        v E = eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቐ\u0001"), ProtectedSandApp.s("ቑ\u0001"), "", "", "", ProtectedSandApp.s("\u124e\u0001"));
        String s4 = ProtectedSandApp.s("ቒ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 144);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቔ\u0001"), ProtectedSandApp.s("ቑ\u0001"), ProtectedSandApp.s("\u124e\u0001"), ProtectedSandApp.s("ቕ\u0001"), "", ProtectedSandApp.s("ቓ\u0001")), 148);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("\u1257\u0001"), ProtectedSandApp.s("ቑ\u0001"), "", "", "", ProtectedSandApp.s("ቖ\u0001")), SyslogAppender.LOG_LOCAL7);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቘ\u0001"), ProtectedSandApp.s("ቑ\u0001"), ProtectedSandApp.s("ቖ\u0001"), ProtectedSandApp.s("\u1259\u0001"), "", ProtectedSandApp.s("ቓ\u0001")), PictureConfig.CHOOSE_REQUEST);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቚ\u0001"), ProtectedSandApp.s("ቑ\u0001"), "", "", "", ProtectedSandApp.s("ቖ\u0001")), 192);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቛ\u0001"), ProtectedSandApp.s("ቑ\u0001"), ProtectedSandApp.s("ቖ\u0001"), ProtectedSandApp.s("ቜ\u0001"), "", ProtectedSandApp.s("ቓ\u0001")), 196);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቝ\u0001"), ProtectedSandApp.s("ቑ\u0001"), "", "", "", ProtectedSandApp.s("\u124e\u0001")), SyslogAppender.LOG_LOCAL3);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("\u125e\u0001"), ProtectedSandApp.s("ቑ\u0001"), ProtectedSandApp.s("\u124e\u0001"), ProtectedSandApp.s("\u125f\u0001"), "", ProtectedSandApp.s("ቓ\u0001")), 156);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("በ\u0001"), ProtectedSandApp.s("ቑ\u0001"), "", "", "", ProtectedSandApp.s("\u124e\u0001")), 160);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቡ\u0001"), ProtectedSandApp.s("ቑ\u0001"), ProtectedSandApp.s("\u124e\u0001"), ProtectedSandApp.s("ቢ\u0001"), "", ProtectedSandApp.s("ቓ\u0001")), 164);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ባ\u0001"), ProtectedSandApp.s("ቑ\u0001"), "", "", "", ProtectedSandApp.s("\u124e\u0001")), SyslogAppender.LOG_LOCAL5);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቤ\u0001"), ProtectedSandApp.s("ቑ\u0001"), ProtectedSandApp.s("\u124e\u0001"), ProtectedSandApp.s("ብ\u0001"), "", ProtectedSandApp.s("ቓ\u0001")), 172);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቦ\u0001"), ProtectedSandApp.s("ቑ\u0001"), "", "", "", ProtectedSandApp.s("\u124e\u0001")), SyslogAppender.LOG_LOCAL6);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f\u0001"), ProtectedSandApp.s("ቧ\u0001"), ProtectedSandApp.s("ቑ\u0001"), ProtectedSandApp.s("\u124e\u0001"), ProtectedSandApp.s("ቨ\u0001"), "", ProtectedSandApp.s("ቓ\u0001")), 180);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.mimeSubtypeName = g.g(byteBuffer);
        this.profileLevelIdc = g.g(byteBuffer);
        this.codecs = g.g(byteBuffer);
        this.protection = g.g(byteBuffer);
        this.languages = g.g(byteBuffer);
        int p4 = g.p(byteBuffer);
        while (true) {
            int i4 = p4 - 1;
            if (p4 <= 0) {
                break;
            }
            this.brandEntries.put(g.g(byteBuffer), g.g(byteBuffer));
            p4 = i4;
        }
        int p5 = g.p(byteBuffer);
        while (true) {
            int i5 = p5 - 1;
            if (p5 <= 0) {
                return;
            }
            this.idEntries.put(g.g(byteBuffer), g.g(byteBuffer));
            p5 = i5;
        }
    }

    public Map<String, String> getBrandEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_10, this, this));
        return this.brandEntries;
    }

    public String getCodecs() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.codecs;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.o(byteBuffer, this.mimeSubtypeName);
        i.o(byteBuffer, this.profileLevelIdc);
        i.o(byteBuffer, this.codecs);
        i.o(byteBuffer, this.protection);
        i.o(byteBuffer, this.languages);
        i.m(byteBuffer, this.brandEntries.size());
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            i.o(byteBuffer, entry.getKey());
            i.o(byteBuffer, entry.getValue());
        }
        i.m(byteBuffer, this.idEntries.size());
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            i.o(byteBuffer, entry2.getKey());
            i.o(byteBuffer, entry2.getValue());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        long c5 = l.c(this.mimeSubtypeName) + 1 + 4 + l.c(this.profileLevelIdc) + 1 + l.c(this.codecs) + 1 + l.c(this.protection) + 1 + l.c(this.languages) + 1 + 1;
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            c5 = c5 + l.c(entry.getKey()) + 1 + l.c(entry.getValue()) + 1;
        }
        long j4 = c5 + 1;
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            j4 = j4 + l.c(entry2.getKey()) + 1 + l.c(entry2.getValue()) + 1;
        }
        return j4;
    }

    public Map<String, String> getIdEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_12, this, this));
        return this.idEntries;
    }

    public String getLanguages() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.languages;
    }

    public String getMimeSubtypeName() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.mimeSubtypeName;
    }

    public String getProfileLevelIdc() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.profileLevelIdc;
    }

    public String getProtection() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.protection;
    }

    public void setBrandEntries(Map<String, String> map) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, map));
        this.brandEntries = map;
    }

    public void setCodecs(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, str));
        this.codecs = str;
    }

    public void setIdEntries(Map<String, String> map) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_13, this, this, map));
        this.idEntries = map;
    }

    public void setLanguages(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, str));
        this.languages = str;
    }

    public void setMimeSubtypeName(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.mimeSubtypeName = str;
    }

    public void setProfileLevelIdc(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.profileLevelIdc = str;
    }

    public void setProtection(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, str));
        this.protection = str;
    }
}

package com.coremedia.iso.boxes;

import com.coremedia.iso.f;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class RatingBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᅮ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;

    static {
        ajc$preClinit();
    }

    public RatingBox() {
        super(ProtectedSandApp.s("ᅮ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᅯ"), RatingBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᅲ"), ProtectedSandApp.s("ᅳ"), ProtectedSandApp.s("ᅴ"), ProtectedSandApp.s("ᅵ"), "", ProtectedSandApp.s("ᅰ"));
        String s4 = ProtectedSandApp.s("ᅶ");
        ajc$tjp_0 = eVar.H(s4, E, 46);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᅷ"), ProtectedSandApp.s("ᅳ"), ProtectedSandApp.s("ᅴ"), ProtectedSandApp.s("ᅸ"), "", ProtectedSandApp.s("ᅰ")), 50);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᅹ"), ProtectedSandApp.s("ᅳ"), ProtectedSandApp.s("ᅴ"), ProtectedSandApp.s("ᅺ"), "", ProtectedSandApp.s("ᅰ")), 54);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᅻ"), ProtectedSandApp.s("ᅳ"), ProtectedSandApp.s("ᅴ"), ProtectedSandApp.s("ᅼ"), "", ProtectedSandApp.s("ᅰ")), 58);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᅽ"), ProtectedSandApp.s("ᅳ"), "", "", "", ProtectedSandApp.s("ᅴ")), 62);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᅾ"), ProtectedSandApp.s("ᅳ"), "", "", "", ProtectedSandApp.s("ᅴ")), 73);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᅿ"), ProtectedSandApp.s("ᅳ"), "", "", "", ProtectedSandApp.s("ᅴ")), 83);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᆀ"), ProtectedSandApp.s("ᅳ"), "", "", "", ProtectedSandApp.s("ᅴ")), 87);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅱ"), ProtectedSandApp.s("ᆁ"), ProtectedSandApp.s("ᅳ"), "", "", "", ProtectedSandApp.s("ᅴ")), 115);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.ratingEntity = g.b(byteBuffer);
        this.ratingCriteria = g.b(byteBuffer);
        this.language = g.f(byteBuffer);
        this.ratingInfo = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(f.b(this.ratingEntity));
        byteBuffer.put(f.b(this.ratingCriteria));
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.ratingInfo));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.ratingInfo) + 15;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.language;
    }

    public String getRatingCriteria() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.ratingCriteria;
    }

    public String getRatingEntity() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return this.ratingEntity;
    }

    public String getRatingInfo() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        return this.ratingInfo;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public void setRatingCriteria(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.ratingCriteria = str;
    }

    public void setRatingEntity(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_0, this, this, str));
        this.ratingEntity = str;
    }

    public void setRatingInfo(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.ratingInfo = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_8, this, this), ProtectedSandApp.s("ᆂ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ᆃ"));
        a5.append(getRatingEntity());
        a5.append(ProtectedSandApp.s("ᆄ"));
        a5.append(getRatingCriteria());
        a5.append(ProtectedSandApp.s("ᆅ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ᆆ"));
        a5.append(getRatingInfo());
        a5.append(ProtectedSandApp.s("ᆇ"));
        return a5.toString();
    }
}

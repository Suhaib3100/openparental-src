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
public class ClassificationBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ཿ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;

    static {
        ajc$preClinit();
    }

    public ClassificationBox() {
        super(ProtectedSandApp.s("ཿ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ྀ"), ClassificationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("ྃ"), ProtectedSandApp.s("྄"), "", "", "", ProtectedSandApp.s("ཱྀ"));
        String s4 = ProtectedSandApp.s("྅");
        ajc$tjp_0 = eVar.H(s4, E, 44);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("྆"), ProtectedSandApp.s("྄"), "", "", "", ProtectedSandApp.s("ཱྀ")), 48);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("ྈ"), ProtectedSandApp.s("྄"), "", "", "", ProtectedSandApp.s("྇")), 52);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("ྉ"), ProtectedSandApp.s("྄"), "", "", "", ProtectedSandApp.s("ཱྀ")), 56);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("ྋ"), ProtectedSandApp.s("྄"), ProtectedSandApp.s("ཱྀ"), ProtectedSandApp.s("ྌ"), "", ProtectedSandApp.s("ྊ")), 60);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("ྍ"), ProtectedSandApp.s("྄"), ProtectedSandApp.s("྇"), ProtectedSandApp.s("ྎ"), "", ProtectedSandApp.s("ྊ")), 64);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("ྏ"), ProtectedSandApp.s("྄"), ProtectedSandApp.s("ཱྀ"), ProtectedSandApp.s("ྐ"), "", ProtectedSandApp.s("ྊ")), 68);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("ྑ"), ProtectedSandApp.s("྄"), ProtectedSandApp.s("ཱྀ"), ProtectedSandApp.s("ྒ"), "", ProtectedSandApp.s("ྊ")), 72);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྂ"), ProtectedSandApp.s("ྒྷ"), ProtectedSandApp.s("྄"), "", "", "", ProtectedSandApp.s("ཱྀ")), 101);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.classificationEntity = f.a(bArr);
        this.classificationTableIndex = g.i(byteBuffer);
        this.language = g.f(byteBuffer);
        this.classificationInfo = g.g(byteBuffer);
    }

    public String getClassificationEntity() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.classificationEntity;
    }

    public String getClassificationInfo() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.classificationInfo;
    }

    public int getClassificationTableIndex() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.classificationTableIndex;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(f.b(this.classificationEntity));
        i.f(byteBuffer, this.classificationTableIndex);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.classificationInfo));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.classificationInfo) + 9;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setClassificationEntity(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, str));
        this.classificationEntity = str;
    }

    public void setClassificationInfo(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, str));
        this.classificationInfo = str;
    }

    public void setClassificationTableIndex(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.classificationTableIndex = i4;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_6, this, this, str));
        this.language = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_8, this, this), ProtectedSandApp.s("ྔ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ྕ"));
        a5.append(getClassificationEntity());
        a5.append(ProtectedSandApp.s("ྖ"));
        a5.append(getClassificationTableIndex());
        a5.append(ProtectedSandApp.s("ྗ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("\u0f98"));
        a5.append(getClassificationInfo());
        a5.append(ProtectedSandApp.s("ྙ"));
        return a5.toString();
    }
}

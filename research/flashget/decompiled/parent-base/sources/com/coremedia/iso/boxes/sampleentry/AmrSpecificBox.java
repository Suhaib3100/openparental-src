package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.f;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class AmrSpecificBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᐒ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;

    static {
        ajc$preClinit();
    }

    public AmrSpecificBox() {
        super(ProtectedSandApp.s("ᐒ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᐓ"), AmrSpecificBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᐕ"), ProtectedSandApp.s("ᐖ"), ProtectedSandApp.s("ᐗ"), "", "", "", ProtectedSandApp.s("ᐔ"));
        String s4 = ProtectedSandApp.s("ᐘ");
        ajc$tjp_0 = eVar.H(s4, E, 46);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᐕ"), ProtectedSandApp.s("ᐚ"), ProtectedSandApp.s("ᐗ"), "", "", "", ProtectedSandApp.s("ᐙ")), 50);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᐕ"), ProtectedSandApp.s("ᐛ"), ProtectedSandApp.s("ᐗ"), "", "", "", ProtectedSandApp.s("ᐙ")), 54);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᐕ"), ProtectedSandApp.s("ᐜ"), ProtectedSandApp.s("ᐗ"), "", "", "", ProtectedSandApp.s("ᐙ")), 58);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᐕ"), ProtectedSandApp.s("ᐝ"), ProtectedSandApp.s("ᐗ"), "", "", "", ProtectedSandApp.s("ᐙ")), 62);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᐕ"), ProtectedSandApp.s("ᐟ"), ProtectedSandApp.s("ᐗ"), ProtectedSandApp.s("ᐠ"), ProtectedSandApp.s("ᐡ"), "", ProtectedSandApp.s("ᐞ")), 84);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᐕ"), ProtectedSandApp.s("ᐢ"), ProtectedSandApp.s("ᐗ"), "", "", "", ProtectedSandApp.s("ᐔ")), 92);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.vendor = f.a(bArr);
        this.decoderVersion = g.p(byteBuffer);
        this.modeSet = g.i(byteBuffer);
        this.modeChangePeriod = g.p(byteBuffer);
        this.framesPerSample = g.p(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, byteBuffer));
        byteBuffer.put(f.b(this.vendor));
        i.m(byteBuffer, this.decoderVersion);
        i.f(byteBuffer, this.modeSet);
        i.m(byteBuffer, this.modeChangePeriod);
        i.m(byteBuffer, this.framesPerSample);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 9L;
    }

    public int getDecoderVersion() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.decoderVersion;
    }

    public int getFramesPerSample() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.framesPerSample;
    }

    public int getModeChangePeriod() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.modeChangePeriod;
    }

    public int getModeSet() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.modeSet;
    }

    public String getVendor() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.vendor;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_6, this, this), ProtectedSandApp.s("ᐣ"));
        a5.append(getVendor());
        a5.append(ProtectedSandApp.s("ᐤ"));
        a5.append(getDecoderVersion());
        a5.append(ProtectedSandApp.s("ᐥ"));
        a5.append(getModeSet());
        a5.append(ProtectedSandApp.s("ᐦ"));
        a5.append(getModeChangePeriod());
        a5.append(ProtectedSandApp.s("ᐧ"));
        a5.append(getFramesPerSample());
        a5.append(ProtectedSandApp.s("ᐨ"));
        return a5.toString();
    }
}

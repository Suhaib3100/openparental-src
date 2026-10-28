package com.coremedia.iso.boxes.threegpp26244;

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
public class LocationInformationBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᑒ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_12 = null;
    private static final /* synthetic */ c.b ajc$tjp_13 = null;
    private static final /* synthetic */ c.b ajc$tjp_14 = null;
    private static final /* synthetic */ c.b ajc$tjp_15 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    private String additionalNotes;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;

    static {
        ajc$preClinit();
    }

    public LocationInformationBox() {
        super(ProtectedSandApp.s("ᑒ"));
        this.name = "";
        this.astronomicalBody = "";
        this.additionalNotes = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᑓ"), LocationInformationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑖ"), ProtectedSandApp.s("ᑗ"), "", "", "", ProtectedSandApp.s("ᑔ"));
        String s4 = ProtectedSandApp.s("ᑘ");
        ajc$tjp_0 = eVar.H(s4, E, 30);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑚ"), ProtectedSandApp.s("ᑗ"), ProtectedSandApp.s("ᑔ"), ProtectedSandApp.s("ᑛ"), "", ProtectedSandApp.s("ᑙ")), 34);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑝ"), ProtectedSandApp.s("ᑗ"), "", "", "", ProtectedSandApp.s("ᑜ")), 70);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑞ"), ProtectedSandApp.s("ᑗ"), ProtectedSandApp.s("ᑜ"), ProtectedSandApp.s("ᑟ"), "", ProtectedSandApp.s("ᑙ")), 74);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑠ"), ProtectedSandApp.s("ᑗ"), "", "", "", ProtectedSandApp.s("ᑔ")), 78);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑡ"), ProtectedSandApp.s("ᑗ"), ProtectedSandApp.s("ᑔ"), ProtectedSandApp.s("ᑢ"), "", ProtectedSandApp.s("ᑙ")), 82);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑣ"), ProtectedSandApp.s("ᑗ"), "", "", "", ProtectedSandApp.s("ᑔ")), 86);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑤ"), ProtectedSandApp.s("ᑗ"), ProtectedSandApp.s("ᑔ"), ProtectedSandApp.s("ᑥ"), "", ProtectedSandApp.s("ᑙ")), 90);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑦ"), ProtectedSandApp.s("ᑗ"), "", "", "", ProtectedSandApp.s("ᑔ")), 38);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑧ"), ProtectedSandApp.s("ᑗ"), ProtectedSandApp.s("ᑔ"), ProtectedSandApp.s("ᑨ"), "", ProtectedSandApp.s("ᑙ")), 42);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑪ"), ProtectedSandApp.s("ᑗ"), "", "", "", ProtectedSandApp.s("ᑩ")), 46);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑫ"), ProtectedSandApp.s("ᑗ"), ProtectedSandApp.s("ᑩ"), ProtectedSandApp.s("ᑬ"), "", ProtectedSandApp.s("ᑙ")), 50);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑭ"), ProtectedSandApp.s("ᑗ"), "", "", "", ProtectedSandApp.s("ᑜ")), 54);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑮ"), ProtectedSandApp.s("ᑗ"), ProtectedSandApp.s("ᑜ"), ProtectedSandApp.s("ᑯ"), "", ProtectedSandApp.s("ᑙ")), 58);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑰ"), ProtectedSandApp.s("ᑗ"), "", "", "", ProtectedSandApp.s("ᑜ")), 62);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑕ"), ProtectedSandApp.s("ᑱ"), ProtectedSandApp.s("ᑗ"), ProtectedSandApp.s("ᑜ"), ProtectedSandApp.s("ᑲ"), "", ProtectedSandApp.s("ᑙ")), 66);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.name = g.g(byteBuffer);
        this.role = g.p(byteBuffer);
        this.longitude = g.d(byteBuffer);
        this.latitude = g.d(byteBuffer);
        this.altitude = g.d(byteBuffer);
        this.astronomicalBody = g.g(byteBuffer);
        this.additionalNotes = g.g(byteBuffer);
    }

    public String getAdditionalNotes() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_14, this, this));
        return this.additionalNotes;
    }

    public double getAltitude() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_10, this, this));
        return this.altitude;
    }

    public String getAstronomicalBody() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_12, this, this));
        return this.astronomicalBody;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.name));
        byteBuffer.put((byte) 0);
        i.m(byteBuffer, this.role);
        i.b(byteBuffer, this.longitude);
        i.b(byteBuffer, this.latitude);
        i.b(byteBuffer, this.altitude);
        byteBuffer.put(l.b(this.astronomicalBody));
        byteBuffer.put((byte) 0);
        byteBuffer.put(l.b(this.additionalNotes));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.b(this.name).length + 22 + l.b(this.astronomicalBody).length + l.b(this.additionalNotes).length;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public double getLatitude() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.latitude;
    }

    public double getLongitude() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.longitude;
    }

    public String getName() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.name;
    }

    public int getRole() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.role;
    }

    public void setAdditionalNotes(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_15, this, this, str));
        this.additionalNotes = str;
    }

    public void setAltitude(double d5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, new Double(d5)));
        this.altitude = d5;
    }

    public void setAstronomicalBody(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_13, this, this, str));
        this.astronomicalBody = str;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.language = str;
    }

    public void setLatitude(double d5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, new Double(d5)));
        this.latitude = d5;
    }

    public void setLongitude(double d5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, new Double(d5)));
        this.longitude = d5;
    }

    public void setName(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.name = str;
    }

    public void setRole(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.role = i4;
    }
}

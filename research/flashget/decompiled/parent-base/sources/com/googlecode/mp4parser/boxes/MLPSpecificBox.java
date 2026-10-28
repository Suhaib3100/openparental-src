package com.googlecode.mp4parser.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class MLPSpecificBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("࿂\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public MLPSpecificBox() {
        super(ProtectedSandApp.s("࿂\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("࿃\u0001"), MLPSpecificBox.class);
        v E = eVar.E(ProtectedSandApp.s("࿅\u0001"), ProtectedSandApp.s("࿆\u0001"), ProtectedSandApp.s("࿇\u0001"), "", "", "", ProtectedSandApp.s("࿄\u0001"));
        String s4 = ProtectedSandApp.s("࿈\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 49);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿅\u0001"), ProtectedSandApp.s("࿊\u0001"), ProtectedSandApp.s("࿇\u0001"), ProtectedSandApp.s("࿄\u0001"), ProtectedSandApp.s("࿋\u0001"), "", ProtectedSandApp.s("࿉\u0001")), 53);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿅\u0001"), ProtectedSandApp.s("࿌\u0001"), ProtectedSandApp.s("࿇\u0001"), "", "", "", ProtectedSandApp.s("࿄\u0001")), 57);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿅\u0001"), ProtectedSandApp.s("\u0fcd\u0001"), ProtectedSandApp.s("࿇\u0001"), ProtectedSandApp.s("࿄\u0001"), ProtectedSandApp.s("࿎\u0001"), "", ProtectedSandApp.s("࿉\u0001")), 61);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿅\u0001"), ProtectedSandApp.s("࿏\u0001"), ProtectedSandApp.s("࿇\u0001"), "", "", "", ProtectedSandApp.s("࿄\u0001")), 65);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿅\u0001"), ProtectedSandApp.s("࿐\u0001"), ProtectedSandApp.s("࿇\u0001"), ProtectedSandApp.s("࿄\u0001"), ProtectedSandApp.s("࿑\u0001"), "", ProtectedSandApp.s("࿉\u0001")), 69);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿅\u0001"), ProtectedSandApp.s("࿒\u0001"), ProtectedSandApp.s("࿇\u0001"), "", "", "", ProtectedSandApp.s("࿄\u0001")), 73);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿅\u0001"), ProtectedSandApp.s("࿓\u0001"), ProtectedSandApp.s("࿇\u0001"), ProtectedSandApp.s("࿄\u0001"), ProtectedSandApp.s("࿔\u0001"), "", ProtectedSandApp.s("࿉\u0001")), 77);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.format_info = cVar.c(32);
        this.peak_data_rate = cVar.c(15);
        this.reserved = cVar.c(1);
        this.reserved2 = cVar.c(32);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        d dVar = new d(byteBuffer);
        dVar.a(this.format_info, 32);
        dVar.a(this.peak_data_rate, 15);
        dVar.a(this.reserved, 1);
        dVar.a(this.reserved2, 32);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 10L;
    }

    public int getFormat_info() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.format_info;
    }

    public int getPeak_data_rate() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.peak_data_rate;
    }

    public int getReserved() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.reserved;
    }

    public int getReserved2() {
        g.b().c(e.v(ajc$tjp_6, this, this));
        return this.reserved2;
    }

    public void setFormat_info(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.format_info = i4;
    }

    public void setPeak_data_rate(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.peak_data_rate = i4;
    }

    public void setReserved(int i4) {
        g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.reserved = i4;
    }

    public void setReserved2(int i4) {
        g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.reserved2 = i4;
    }
}

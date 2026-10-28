package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class VideoMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = ProtectedSandApp.s("ኳ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private int graphicsmode;
    private int[] opcolor;

    static {
        ajc$preClinit();
    }

    public VideoMediaHeaderBox() {
        super(ProtectedSandApp.s("ኳ"));
        this.graphicsmode = 0;
        this.opcolor = new int[3];
        setFlags(1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ኴ"), VideoMediaHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("\u12b6"), ProtectedSandApp.s("\u12b7"), ProtectedSandApp.s("ኸ"), "", "", "", ProtectedSandApp.s("ኵ"));
        String s4 = ProtectedSandApp.s("ኹ");
        ajc$tjp_0 = eVar.H(s4, E, 39);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u12b6"), ProtectedSandApp.s("ኻ"), ProtectedSandApp.s("ኸ"), "", "", "", ProtectedSandApp.s("ኺ")), 43);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u12b6"), ProtectedSandApp.s("ኽ"), ProtectedSandApp.s("ኸ"), "", "", "", ProtectedSandApp.s("ኼ")), 71);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u12b6"), ProtectedSandApp.s("\u12bf"), ProtectedSandApp.s("ኸ"), ProtectedSandApp.s("ኺ"), ProtectedSandApp.s("ዀ"), "", ProtectedSandApp.s("ኾ")), 75);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u12b6"), ProtectedSandApp.s("\u12c1"), ProtectedSandApp.s("ኸ"), ProtectedSandApp.s("ኵ"), ProtectedSandApp.s("ዂ"), "", ProtectedSandApp.s("ኾ")), 79);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsmode = g.i(byteBuffer);
        this.opcolor = new int[3];
        for (int i4 = 0; i4 < 3; i4++) {
            this.opcolor[i4] = g.i(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.f(byteBuffer, this.graphicsmode);
        for (int i4 : this.opcolor) {
            i.f(byteBuffer, i4);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 12L;
    }

    public int getGraphicsmode() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.graphicsmode;
    }

    public int[] getOpcolor() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.opcolor;
    }

    public void setGraphicsmode(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, new Integer(i4)));
        this.graphicsmode = i4;
    }

    public void setOpcolor(int[] iArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, iArr));
        this.opcolor = iArr;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ዃ"));
        a5.append(getGraphicsmode());
        a5.append(ProtectedSandApp.s("ዄ"));
        a5.append(getOpcolor()[0]);
        a5.append(ProtectedSandApp.s("ዅ"));
        a5.append(getOpcolor()[1]);
        a5.append(ProtectedSandApp.s("\u12c6"));
        return android.support.v4.media.b.a(a5, getOpcolor()[2], ProtectedSandApp.s("\u12c7"));
    }
}

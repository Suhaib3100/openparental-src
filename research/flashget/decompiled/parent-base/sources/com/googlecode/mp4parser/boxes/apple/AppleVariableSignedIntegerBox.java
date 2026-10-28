package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.h;
import com.coremedia.iso.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public abstract class AppleVariableSignedIntegerBox extends AppleDataBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    int intLength;
    long value;

    static {
        ajc$preClinit();
    }

    protected AppleVariableSignedIntegerBox(String str) {
        super(str, 15);
        this.intLength = 1;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("\u10c9\u0001"), AppleVariableSignedIntegerBox.class);
        v E = eVar.E(ProtectedSandApp.s("\u10cb\u0001"), ProtectedSandApp.s("\u10cc\u0001"), ProtectedSandApp.s("Ⴭ\u0001"), "", "", "", ProtectedSandApp.s("\u10ca\u0001"));
        String s4 = ProtectedSandApp.s("\u10ce\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 19);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10cb\u0001"), ProtectedSandApp.s("ა\u0001"), ProtectedSandApp.s("Ⴭ\u0001"), ProtectedSandApp.s("\u10ca\u0001"), ProtectedSandApp.s("ბ\u0001"), "", ProtectedSandApp.s("\u10cf\u0001")), 23);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10cb\u0001"), ProtectedSandApp.s("დ\u0001"), ProtectedSandApp.s("Ⴭ\u0001"), "", "", "", ProtectedSandApp.s("გ\u0001")), 27);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10cb\u0001"), ProtectedSandApp.s("ე\u0001"), ProtectedSandApp.s("Ⴭ\u0001"), ProtectedSandApp.s("გ\u0001"), ProtectedSandApp.s("ვ\u0001"), "", ProtectedSandApp.s("\u10cf\u0001")), 36);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.intLength;
    }

    public int getIntLength() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.intLength;
    }

    public long getValue() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.value = h.a(byteBuffer, remaining);
        this.intLength = remaining;
    }

    public void setIntLength(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.intLength = i4;
    }

    public void setValue(long j4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Long(j4)));
        if (j4 <= 127 && j4 > -128) {
            this.intLength = 1;
        } else if (j4 <= 32767 && j4 > -32768 && this.intLength < 2) {
            this.intLength = 2;
        } else if (j4 > 8388607 || j4 <= -8388608 || this.intLength >= 3) {
            this.intLength = 4;
        } else {
            this.intLength = 3;
        }
        this.value = j4;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        int dataLength = getDataLength();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[dataLength]);
        j.a(this.value, wrap, dataLength);
        return wrap.array();
    }
}

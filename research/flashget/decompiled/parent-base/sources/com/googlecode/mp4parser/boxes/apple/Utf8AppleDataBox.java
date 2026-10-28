package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;
import va.a;

/* loaded from: classes6.dex */
public abstract class Utf8AppleDataBox extends AppleDataBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    String value;

    static {
        ajc$preClinit();
    }

    protected Utf8AppleDataBox(String str) {
        super(str, 1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ⴚ\u0001"), Utf8AppleDataBox.class);
        v E = eVar.E(ProtectedSandApp.s("Ⴜ\u0001"), ProtectedSandApp.s("Ⴝ\u0001"), ProtectedSandApp.s("Ⴞ\u0001"), "", "", "", ProtectedSandApp.s("Ⴛ\u0001"));
        String s4 = ProtectedSandApp.s("Ⴟ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 21);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ⴜ\u0001"), ProtectedSandApp.s("Ⴡ\u0001"), ProtectedSandApp.s("Ⴞ\u0001"), ProtectedSandApp.s("Ⴛ\u0001"), ProtectedSandApp.s("Ⴢ\u0001"), "", ProtectedSandApp.s("Ⴠ\u0001")), 30);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.value.getBytes(Charset.forName(ProtectedSandApp.s("Ⴣ\u0001"))).length;
    }

    public String getValue() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        this.value = com.coremedia.iso.g.h(byteBuffer, byteBuffer.remaining());
    }

    public void setValue(String str) {
        g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.value = str;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    @a
    public byte[] writeData() {
        return l.b(this.value);
    }
}

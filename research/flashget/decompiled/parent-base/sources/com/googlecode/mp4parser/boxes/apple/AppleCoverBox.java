package com.googlecode.mp4parser.boxes.apple;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AppleCoverBox extends AppleDataBox {
    private static final int IMAGE_TYPE_JPG = 13;
    private static final int IMAGE_TYPE_PNG = 14;
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private byte[] data;

    static {
        ajc$preClinit();
    }

    public AppleCoverBox() {
        super(ProtectedSandApp.s("კ\u0001"), 1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ლ\u0001"), AppleCoverBox.class);
        v E = eVar.E(ProtectedSandApp.s("ნ\u0001"), ProtectedSandApp.s("ო\u0001"), ProtectedSandApp.s("პ\u0001"), "", "", "", ProtectedSandApp.s("მ\u0001"));
        String s4 = ProtectedSandApp.s("ჟ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 21);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ნ\u0001"), ProtectedSandApp.s("ს\u0001"), ProtectedSandApp.s("პ\u0001"), ProtectedSandApp.s("მ\u0001"), ProtectedSandApp.s("ტ\u0001"), "", ProtectedSandApp.s("რ\u0001")), 25);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ნ\u0001"), ProtectedSandApp.s("უ\u0001"), ProtectedSandApp.s("პ\u0001"), ProtectedSandApp.s("მ\u0001"), ProtectedSandApp.s("ტ\u0001"), "", ProtectedSandApp.s("რ\u0001")), 29);
    }

    private void setImageData(byte[] bArr, int i4) {
        this.data = bArr;
        this.dataType = i4;
    }

    public byte[] getCoverData() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.data;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.data.length;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.limit()];
        this.data = bArr;
        byteBuffer.get(bArr);
    }

    public void setJpg(byte[] bArr) {
        g.b().c(e.w(ajc$tjp_1, this, this, bArr));
        setImageData(bArr, 13);
    }

    public void setPng(byte[] bArr) {
        g.b().c(e.w(ajc$tjp_2, this, this, bArr));
        setImageData(bArr, 14);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        return this.data;
    }
}

package com.googlecode.mp4parser.boxes.apple;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AppleTrackNumberBox extends AppleDataBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;

    /* renamed from: a, reason: collision with root package name */
    int f63878a;

    /* renamed from: b, reason: collision with root package name */
    int f63879b;

    static {
        ajc$preClinit();
    }

    public AppleTrackNumberBox() {
        super(ProtectedSandApp.s("ᄦ\u0001"), 0);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᄧ\u0001"), AppleTrackNumberBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᄩ\u0001"), ProtectedSandApp.s("ᄪ\u0001"), ProtectedSandApp.s("ᄫ\u0001"), "", "", "", ProtectedSandApp.s("ᄨ\u0001"));
        String s4 = ProtectedSandApp.s("ᄬ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 16);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄩ\u0001"), ProtectedSandApp.s("ᄮ\u0001"), ProtectedSandApp.s("ᄫ\u0001"), ProtectedSandApp.s("ᄨ\u0001"), ProtectedSandApp.s("ᄯ\u0001"), "", ProtectedSandApp.s("ᄭ\u0001")), 20);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄩ\u0001"), ProtectedSandApp.s("ᄰ\u0001"), ProtectedSandApp.s("ᄫ\u0001"), "", "", "", ProtectedSandApp.s("ᄨ\u0001")), 24);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄩ\u0001"), ProtectedSandApp.s("ᄱ\u0001"), ProtectedSandApp.s("ᄫ\u0001"), ProtectedSandApp.s("ᄨ\u0001"), ProtectedSandApp.s("ᄲ\u0001"), "", ProtectedSandApp.s("ᄭ\u0001")), 28);
    }

    public int getA() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.f63878a;
    }

    public int getB() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.f63879b;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return 8;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        this.f63878a = byteBuffer.getInt();
        this.f63879b = byteBuffer.getInt();
    }

    public void setA(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.f63878a = i4;
    }

    public void setB(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.f63879b = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(this.f63878a);
        allocate.putInt(this.f63879b);
        return allocate.array();
    }
}

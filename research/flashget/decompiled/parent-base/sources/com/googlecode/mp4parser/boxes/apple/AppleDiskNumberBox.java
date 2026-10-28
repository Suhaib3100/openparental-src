package com.googlecode.mp4parser.boxes.apple;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AppleDiskNumberBox extends AppleDataBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;

    /* renamed from: a, reason: collision with root package name */
    int f63875a;

    /* renamed from: b, reason: collision with root package name */
    short f63876b;

    static {
        ajc$preClinit();
    }

    public AppleDiskNumberBox() {
        super(ProtectedSandApp.s("ქ\u0001"), 0);
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ღ\u0001"), AppleDiskNumberBox.class);
        v E = eVar.E(ProtectedSandApp.s("შ\u0001"), ProtectedSandApp.s("ჩ\u0001"), ProtectedSandApp.s("ც\u0001"), "", "", "", ProtectedSandApp.s("ყ\u0001"));
        String s4 = ProtectedSandApp.s("ძ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 16);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("შ\u0001"), ProtectedSandApp.s("ჭ\u0001"), ProtectedSandApp.s("ც\u0001"), ProtectedSandApp.s("ყ\u0001"), ProtectedSandApp.s("ხ\u0001"), "", ProtectedSandApp.s("წ\u0001")), 20);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("შ\u0001"), ProtectedSandApp.s("ჰ\u0001"), ProtectedSandApp.s("ც\u0001"), "", "", "", ProtectedSandApp.s("ჯ\u0001")), 24);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("შ\u0001"), ProtectedSandApp.s("ჱ\u0001"), ProtectedSandApp.s("ც\u0001"), ProtectedSandApp.s("ჯ\u0001"), ProtectedSandApp.s("ჲ\u0001"), "", ProtectedSandApp.s("წ\u0001")), 28);
    }

    public int getA() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.f63875a;
    }

    public short getB() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.f63876b;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return 6;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        this.f63875a = byteBuffer.getInt();
        this.f63876b = byteBuffer.getShort();
    }

    public void setA(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.f63875a = i4;
    }

    public void setB(short s4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Short(s4)));
        this.f63876b = s4;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.putInt(this.f63875a);
        allocate.putShort(this.f63876b);
        return allocate.array();
    }
}

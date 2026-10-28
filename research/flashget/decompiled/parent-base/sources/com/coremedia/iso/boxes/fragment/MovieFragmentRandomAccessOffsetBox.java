package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class MovieFragmentRandomAccessOffsetBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ጼ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private long mfraSize;

    static {
        ajc$preClinit();
    }

    public MovieFragmentRandomAccessOffsetBox() {
        super(ProtectedSandApp.s("ጼ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ጽ"), MovieFragmentRandomAccessOffsetBox.class);
        v E = eVar.E(ProtectedSandApp.s("ጿ"), ProtectedSandApp.s("ፀ"), ProtectedSandApp.s("ፁ"), "", "", "", ProtectedSandApp.s("ጾ"));
        String s4 = ProtectedSandApp.s("ፂ");
        ajc$tjp_0 = eVar.H(s4, E, 56);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ጿ"), ProtectedSandApp.s("ፄ"), ProtectedSandApp.s("ፁ"), ProtectedSandApp.s("ጾ"), ProtectedSandApp.s("ፅ"), "", ProtectedSandApp.s("ፃ")), 60);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.mfraSize = g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.mfraSize);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public long getMfraSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.mfraSize;
    }

    public void setMfraSize(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Long(j4)));
        this.mfraSize = j4;
    }
}

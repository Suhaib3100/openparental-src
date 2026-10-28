package com.mp4parser.iso14496.part12;

import com.coremedia.iso.f;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᡲ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private long[] offsets;

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationOffsetsBox() {
        super(ProtectedSandApp.s("ᡲ\u0001"));
        this.offsets = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᡳ\u0001"), SampleAuxiliaryInformationOffsetsBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᡵ\u0001"), ProtectedSandApp.s("ᡶ\u0001"), ProtectedSandApp.s("ᡷ\u0001"), "", "", "", ProtectedSandApp.s("ᡴ\u0001"));
        String s4 = ProtectedSandApp.s("ᡸ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 107);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡵ\u0001"), ProtectedSandApp.s("\u187a\u0001"), ProtectedSandApp.s("ᡷ\u0001"), ProtectedSandApp.s("ᡴ\u0001"), ProtectedSandApp.s("\u187b\u0001"), "", ProtectedSandApp.s("\u1879\u0001")), 111);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡵ\u0001"), ProtectedSandApp.s("\u187c\u0001"), ProtectedSandApp.s("ᡷ\u0001"), "", "", "", ProtectedSandApp.s("ᡴ\u0001")), 115);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡵ\u0001"), ProtectedSandApp.s("\u187d\u0001"), ProtectedSandApp.s("ᡷ\u0001"), ProtectedSandApp.s("ᡴ\u0001"), ProtectedSandApp.s("\u187e\u0001"), "", ProtectedSandApp.s("\u1879\u0001")), 119);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡵ\u0001"), ProtectedSandApp.s("ᢀ\u0001"), ProtectedSandApp.s("ᡷ\u0001"), "", "", "", ProtectedSandApp.s("\u187f\u0001")), 123);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᡵ\u0001"), ProtectedSandApp.s("ᢁ\u0001"), ProtectedSandApp.s("ᡷ\u0001"), ProtectedSandApp.s("\u187f\u0001"), ProtectedSandApp.s("ᢂ\u0001"), "", ProtectedSandApp.s("\u1879\u0001")), 127);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = g.b(byteBuffer);
            this.auxInfoTypeParameter = g.b(byteBuffer);
        }
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.offsets = new long[a5];
        for (int i4 = 0; i4 < a5; i4++) {
            if (getVersion() == 0) {
                this.offsets[i4] = g.l(byteBuffer);
            } else {
                this.offsets[i4] = g.o(byteBuffer);
            }
        }
    }

    public String getAuxInfoType() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.auxInfoTypeParameter;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(f.b(this.auxInfoType));
            byteBuffer.put(f.b(this.auxInfoTypeParameter));
        }
        i.i(byteBuffer, this.offsets.length);
        for (long j4 : this.offsets) {
            if (getVersion() == 0) {
                byteBuffer.putInt((int) j4);
            } else {
                byteBuffer.putLong(j4);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (getVersion() == 0 ? this.offsets.length * 4 : this.offsets.length * 8) + 8 + ((getFlags() & 1) != 1 ? 0 : 8);
    }

    public long[] getOffsets() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.offsets;
    }

    public void setAuxInfoType(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.auxInfoTypeParameter = str;
    }

    public void setOffsets(long[] jArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, jArr));
        this.offsets = jArr;
    }
}

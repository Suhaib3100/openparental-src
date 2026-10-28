package com.coremedia.iso.boxes.fragment;

import androidx.content.preferences.protobuf.n;
import com.coremedia.iso.f;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class SegmentTypeBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ፆ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private List<String> compatibleBrands;
    private String majorBrand;
    private long minorVersion;

    static {
        ajc$preClinit();
    }

    public SegmentTypeBox() {
        super(ProtectedSandApp.s("ፆ"));
        this.compatibleBrands = Collections.emptyList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ፇ"), SegmentTypeBox.class);
        v E = eVar.E(ProtectedSandApp.s("ፉ"), ProtectedSandApp.s("ፊ"), ProtectedSandApp.s("ፋ"), "", "", "", ProtectedSandApp.s("ፈ"));
        String s4 = ProtectedSandApp.s("ፌ");
        ajc$tjp_0 = eVar.H(s4, E, 85);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ፉ"), ProtectedSandApp.s("ፎ"), ProtectedSandApp.s("ፋ"), ProtectedSandApp.s("ፈ"), ProtectedSandApp.s("ፏ"), "", ProtectedSandApp.s("ፍ")), 94);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ፉ"), ProtectedSandApp.s("ፐ"), ProtectedSandApp.s("ፋ"), ProtectedSandApp.s("ፑ"), ProtectedSandApp.s("ፒ"), "", ProtectedSandApp.s("ፍ")), 103);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ፉ"), ProtectedSandApp.s("ፓ"), ProtectedSandApp.s("ፋ"), "", "", "", ProtectedSandApp.s("ፑ")), 113);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ፉ"), ProtectedSandApp.s("ፕ"), ProtectedSandApp.s("ፋ"), "", "", "", ProtectedSandApp.s("ፔ")), 122);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ፉ"), ProtectedSandApp.s("ፖ"), ProtectedSandApp.s("ፋ"), ProtectedSandApp.s("ፔ"), ProtectedSandApp.s("ፗ"), "", ProtectedSandApp.s("ፍ")), 126);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.majorBrand = g.b(byteBuffer);
        this.minorVersion = g.l(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList();
        for (int i4 = 0; i4 < remaining; i4++) {
            this.compatibleBrands.add(g.b(byteBuffer));
        }
    }

    public List<String> getCompatibleBrands() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.compatibleBrands;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(f.b(this.majorBrand));
        i.i(byteBuffer, this.minorVersion);
        Iterator<String> it = this.compatibleBrands.iterator();
        while (it.hasNext()) {
            byteBuffer.put(f.b(it.next()));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return n.a(this.compatibleBrands, 4, 8);
    }

    public String getMajorBrand() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.majorBrand;
    }

    public long getMinorVersion() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.minorVersion;
    }

    public void setCompatibleBrands(List<String> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, list));
        this.compatibleBrands = list;
    }

    public void setMajorBrand(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.majorBrand = str;
    }

    public void setMinorVersion(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, new Long(j4)));
        this.minorVersion = j4;
    }

    @va.a
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ፘ"));
        sb.append(getMajorBrand());
        sb.append(ProtectedSandApp.s("ፙ"));
        sb.append(getMinorVersion());
        for (String str : this.compatibleBrands) {
            sb.append(ProtectedSandApp.s("\u135b"));
            sb.append(str);
        }
        sb.append(ProtectedSandApp.s("ፚ"));
        return sb.toString();
    }

    public SegmentTypeBox(String str, long j4, List<String> list) {
        super(ProtectedSandApp.s("ፆ"));
        Collections.emptyList();
        this.majorBrand = str;
        this.minorVersion = j4;
        this.compatibleBrands = list;
    }
}

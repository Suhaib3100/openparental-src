package com.coremedia.iso.boxes;

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
public class FileTypeBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("စ");
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

    public FileTypeBox() {
        super(ProtectedSandApp.s("စ"));
        this.compatibleBrands = Collections.emptyList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ဆ"), FileTypeBox.class);
        v E = eVar.E(ProtectedSandApp.s("ဈ"), ProtectedSandApp.s("ဉ"), ProtectedSandApp.s("ည"), "", "", "", ProtectedSandApp.s("ဇ"));
        String s4 = ProtectedSandApp.s("ဋ");
        ajc$tjp_0 = eVar.H(s4, E, 85);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ဈ"), ProtectedSandApp.s("ဍ"), ProtectedSandApp.s("ည"), ProtectedSandApp.s("ဇ"), ProtectedSandApp.s("ဎ"), "", ProtectedSandApp.s("ဌ")), 94);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ဈ"), ProtectedSandApp.s("ဏ"), ProtectedSandApp.s("ည"), ProtectedSandApp.s("တ"), ProtectedSandApp.s("ထ"), "", ProtectedSandApp.s("ဌ")), 103);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ဈ"), ProtectedSandApp.s("ဒ"), ProtectedSandApp.s("ည"), "", "", "", ProtectedSandApp.s("တ")), 113);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ဈ"), ProtectedSandApp.s("န"), ProtectedSandApp.s("ည"), "", "", "", ProtectedSandApp.s("ဓ")), 122);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ဈ"), ProtectedSandApp.s("ပ"), ProtectedSandApp.s("ည"), ProtectedSandApp.s("ဓ"), ProtectedSandApp.s("ဖ"), "", ProtectedSandApp.s("ဌ")), 126);
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
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ဗ"));
        sb.append(getMajorBrand());
        sb.append(ProtectedSandApp.s("ဘ"));
        sb.append(getMinorVersion());
        for (String str : this.compatibleBrands) {
            sb.append(ProtectedSandApp.s("ယ"));
            sb.append(str);
        }
        sb.append(ProtectedSandApp.s("မ"));
        return sb.toString();
    }

    public FileTypeBox(String str, long j4, List<String> list) {
        super(ProtectedSandApp.s("စ"));
        Collections.emptyList();
        this.majorBrand = str;
        this.minorVersion = j4;
        this.compatibleBrands = list;
    }
}

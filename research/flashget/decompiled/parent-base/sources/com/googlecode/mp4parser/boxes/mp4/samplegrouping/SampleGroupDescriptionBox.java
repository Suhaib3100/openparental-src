package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import androidx.compose.ui.graphics.l6;
import com.android.internal.telephony.SmsConstants;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.tencent.beacon.event.open.EventResult;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("፥\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private int defaultLength;
    private List<b> groupEntries;
    private String groupingType;

    static {
        ajc$preClinit();
    }

    public SampleGroupDescriptionBox() {
        super(ProtectedSandApp.s("፥\u0001"));
        this.groupEntries = new LinkedList();
        setVersion(1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("፦\u0001"), SampleGroupDescriptionBox.class);
        v E = eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፩\u0001"), ProtectedSandApp.s("፪\u0001"), "", "", "", ProtectedSandApp.s("፧\u0001"));
        String s4 = ProtectedSandApp.s("፫\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 57);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፭\u0001"), ProtectedSandApp.s("፪\u0001"), ProtectedSandApp.s("፧\u0001"), ProtectedSandApp.s("፮\u0001"), "", ProtectedSandApp.s("፬\u0001")), 61);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፰\u0001"), ProtectedSandApp.s("፪\u0001"), "", "", "", ProtectedSandApp.s("፯\u0001")), SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፱\u0001"), ProtectedSandApp.s("፪\u0001"), ProtectedSandApp.s("፯\u0001"), ProtectedSandApp.s("፲\u0001"), "", ProtectedSandApp.s("፬\u0001")), 157);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፴\u0001"), ProtectedSandApp.s("፪\u0001"), "", "", "", ProtectedSandApp.s("፳\u0001")), 161);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፵\u0001"), ProtectedSandApp.s("፪\u0001"), ProtectedSandApp.s("፳\u0001"), ProtectedSandApp.s("፶\u0001"), "", ProtectedSandApp.s("፬\u0001")), 165);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፸\u0001"), ProtectedSandApp.s("፪\u0001"), ProtectedSandApp.s("፹\u0001"), ProtectedSandApp.s("፺\u0001"), "", ProtectedSandApp.s("፷\u0001")), 170);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፻\u0001"), ProtectedSandApp.s("፪\u0001"), "", "", "", ProtectedSandApp.s("፯\u0001")), 191);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፨\u0001"), ProtectedSandApp.s("፼\u0001"), ProtectedSandApp.s("፪\u0001"), "", "", "", ProtectedSandApp.s("፧\u0001")), EventResult.ERROR_CODE_OTHER);
    }

    private b parseGroupEntry(ByteBuffer byteBuffer, String str) {
        b dVar = ProtectedSandApp.s("\u137d\u0001").equals(str) ? new d() : ProtectedSandApp.s("\u137e\u0001").equals(str) ? new c() : ProtectedSandApp.s("\u137f\u0001").equals(str) ? new a() : ProtectedSandApp.s("ᎀ\u0001").equals(str) ? new g() : ProtectedSandApp.s("ᎁ\u0001").equals(str) ? new e() : ProtectedSandApp.s("ᎂ\u0001").equals(str) ? new com.mp4parser.iso14496.part15.d() : ProtectedSandApp.s("ᎃ\u0001").equals(str) ? new com.mp4parser.iso14496.part15.e() : ProtectedSandApp.s("ᎄ\u0001").equals(str) ? new com.mp4parser.iso14496.part15.f() : ProtectedSandApp.s("ᎅ\u0001").equals(str) ? new com.mp4parser.iso14496.part15.c() : new f(str);
        dVar.c(byteBuffer);
        return dVar;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() != 1) {
            throw new RuntimeException(ProtectedSandApp.s("ᎇ\u0001"));
        }
        this.groupingType = com.coremedia.iso.g.b(byteBuffer);
        if (getVersion() == 1) {
            this.defaultLength = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        }
        long l4 = com.coremedia.iso.g.l(byteBuffer);
        while (true) {
            long j4 = l4 - 1;
            if (l4 <= 0) {
                return;
            }
            int i4 = this.defaultLength;
            if (getVersion() != 1) {
                throw new RuntimeException(ProtectedSandApp.s("ᎆ\u0001"));
            }
            if (this.defaultLength == 0) {
                i4 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
            }
            int position = byteBuffer.position() + i4;
            ByteBuffer slice = byteBuffer.slice();
            slice.limit(i4);
            this.groupEntries.add(parseGroupEntry(slice, this.groupingType));
            byteBuffer.position(position);
            l4 = j4;
        }
    }

    public boolean equals(Object obj) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_6, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox) obj;
        if (this.defaultLength != sampleGroupDescriptionBox.defaultLength) {
            return false;
        }
        List<b> list = this.groupEntries;
        List<b> list2 = sampleGroupDescriptionBox.groupEntries;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(com.coremedia.iso.f.b(this.groupingType));
        if (getVersion() == 1) {
            i.i(byteBuffer, this.defaultLength);
        }
        i.i(byteBuffer, this.groupEntries.size());
        for (b bVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                byteBuffer.putInt(bVar.a().limit());
            }
            byteBuffer.put(bVar.a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        long j4 = (getVersion() == 1 ? 12L : 8L) + 4;
        for (b bVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                j4 += 4;
            }
            j4 += bVar.d();
        }
        return j4;
    }

    public int getDefaultLength() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_2, this, this));
        return this.defaultLength;
    }

    public List<b> getGroupEntries() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_4, this, this));
        return this.groupEntries;
    }

    public String getGroupingType() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.groupingType;
    }

    public int hashCode() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_7, this, this));
        int i4 = this.defaultLength * 31;
        List<b> list = this.groupEntries;
        return i4 + (list != null ? list.hashCode() : 0);
    }

    public void setDefaultLength(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.defaultLength = i4;
    }

    public void setGroupEntries(List<b> list) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_5, this, this, list));
        this.groupEntries = list;
    }

    public void setGroupingType(String str) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, str));
        this.groupingType = str;
    }

    public String toString() {
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_8, this, this), ProtectedSandApp.s("ᎈ\u0001"));
        a5.append(this.groupEntries.size() > 0 ? this.groupEntries.get(0).b() : ProtectedSandApp.s("ᎉ\u0001"));
        a5.append(ProtectedSandApp.s("ᎊ\u0001"));
        a5.append(this.defaultLength);
        a5.append(ProtectedSandApp.s("ᎋ\u0001"));
        return l6.a(a5, this.groupEntries, '}');
    }
}

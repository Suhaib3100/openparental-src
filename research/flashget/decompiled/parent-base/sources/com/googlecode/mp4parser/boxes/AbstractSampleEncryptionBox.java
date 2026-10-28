package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.mp4parser.iso23001.part7.a;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    protected int algorithmId;
    List<a> entries;
    protected int ivSize;
    protected byte[] kid;

    static {
        ajc$preClinit();
    }

    protected AbstractSampleEncryptionBox(String str) {
        super(str);
        this.algorithmId = -1;
        this.ivSize = -1;
        this.kid = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.entries = Collections.emptyList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ཉ\u0001"), AbstractSampleEncryptionBox.class);
        v E = eVar.E(ProtectedSandApp.s("ཋ\u0001"), ProtectedSandApp.s("ཌ\u0001"), ProtectedSandApp.s("ཌྷ\u0001"), "", "", "", ProtectedSandApp.s("ཊ\u0001"));
        String s4 = ProtectedSandApp.s("ཎ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 29);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཋ\u0001"), ProtectedSandApp.s("ཐ\u0001"), ProtectedSandApp.s("ཌྷ\u0001"), "", "", "", ProtectedSandApp.s("ཏ\u0001")), 89);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཋ\u0001"), ProtectedSandApp.s("དྷ\u0001"), ProtectedSandApp.s("ཌྷ\u0001"), ProtectedSandApp.s("ཏ\u0001"), ProtectedSandApp.s("ན\u0001"), "", ProtectedSandApp.s("ད\u0001")), 93);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཋ\u0001"), ProtectedSandApp.s("ཕ\u0001"), ProtectedSandApp.s("ཌྷ\u0001"), ProtectedSandApp.s("བ\u0001"), ProtectedSandApp.s("བྷ\u0001"), "", ProtectedSandApp.s("པ\u0001")), 173);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཋ\u0001"), ProtectedSandApp.s("མ\u0001"), ProtectedSandApp.s("ཌྷ\u0001"), "", "", "", ProtectedSandApp.s("ཊ\u0001")), 200);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཋ\u0001"), ProtectedSandApp.s("ཙ\u0001"), ProtectedSandApp.s("ཌྷ\u0001"), "", "", "", ProtectedSandApp.s("ཏ\u0001")), 208);
    }

    private int getNonEmptyEntriesNum() {
        Iterator<a> it = this.entries.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (it.next().b() > 0) {
                i4++;
            }
        }
        return i4;
    }

    private List<a> parseEntries(ByteBuffer byteBuffer, long j4, int i4) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            long j5 = j4 - 1;
            if (j4 <= 0) {
                return arrayList;
            }
            try {
                a aVar = new a();
                byte[] bArr = new byte[i4];
                aVar.f70084a = bArr;
                byteBuffer.get(bArr);
                if ((getFlags() & 2) > 0) {
                    aVar.f70085b = new a.k[g.i(byteBuffer)];
                    int i5 = 0;
                    while (true) {
                        a.k[] kVarArr = aVar.f70085b;
                        if (i5 >= kVarArr.length) {
                            break;
                        }
                        kVarArr[i5] = aVar.a(g.i(byteBuffer), g.l(byteBuffer));
                        i5++;
                    }
                }
                arrayList.add(aVar);
                j4 = j5;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.algorithmId = g.k(byteBuffer);
            this.ivSize = g.p(byteBuffer);
            byte[] bArr = new byte[16];
            this.kid = bArr;
            byteBuffer.get(bArr);
        }
        long l4 = g.l(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        List<a> parseEntries = parseEntries(duplicate, l4, 8);
        this.entries = parseEntries;
        if (parseEntries == null) {
            this.entries = parseEntries(duplicate2, l4, 16);
            byteBuffer.position((byteBuffer.remaining() + byteBuffer.position()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.remaining() + byteBuffer.position()) - duplicate.remaining());
        }
        if (this.entries == null) {
            throw new RuntimeException(ProtectedSandApp.s("ཚ\u0001"));
        }
    }

    public boolean equals(Object obj) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractSampleEncryptionBox abstractSampleEncryptionBox = (AbstractSampleEncryptionBox) obj;
        if (this.algorithmId != abstractSampleEncryptionBox.algorithmId || this.ivSize != abstractSampleEncryptionBox.ivSize) {
            return false;
        }
        List<a> list = this.entries;
        if (list == null ? abstractSampleEncryptionBox.entries == null : list.equals(abstractSampleEncryptionBox.entries)) {
            return Arrays.equals(this.kid, abstractSampleEncryptionBox.kid);
        }
        return false;
    }

    @Override // com.googlecode.mp4parser.AbstractBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            i.h(byteBuffer, this.algorithmId);
            i.m(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        i.i(byteBuffer, getNonEmptyEntriesNum());
        for (a aVar : this.entries) {
            if (aVar.b() > 0) {
                byte[] bArr = aVar.f70084a;
                if (bArr.length != 8 && bArr.length != 16) {
                    throw new RuntimeException(ProtectedSandApp.s("ཛ\u0001"));
                }
                byteBuffer.put(bArr);
                if (isSubSampleEncryption()) {
                    i.f(byteBuffer, aVar.f70085b.length);
                    for (a.k kVar : aVar.f70085b) {
                        i.f(byteBuffer, kVar.clear());
                        byteBuffer.putInt((int) kVar.a());
                    }
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + this.kid.length : 4L) + 4;
        while (this.entries.iterator().hasNext()) {
            length += r0.next().b();
        }
        return length;
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.entries;
    }

    public List<Short> getEntrySizes() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (a aVar : this.entries) {
            short length = (short) aVar.f70084a.length;
            if (isSubSampleEncryption()) {
                length = (short) ((aVar.f70085b.length * 6) + ((short) (length + 2)));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int getOffsetToFirstIV() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return (getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0) + 4;
    }

    public int hashCode() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        int i4 = ((this.algorithmId * 31) + this.ivSize) * 31;
        byte[] bArr = this.kid;
        int hashCode = (i4 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List<a> list = this.entries;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @va.a
    protected boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    @va.a
    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, list));
        this.entries = list;
    }

    @va.a
    public void setSubSampleEncryption(boolean z4) {
        if (z4) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & 16777213);
        }
    }
}

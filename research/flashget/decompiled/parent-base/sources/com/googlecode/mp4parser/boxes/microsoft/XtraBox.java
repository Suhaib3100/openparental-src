package com.googlecode.mp4parser.boxes.microsoft;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class XtraBox extends AbstractBox {
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10000;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final String TYPE = ProtectedSandApp.s("ት\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    ByteBuffer data;
    private boolean successfulParse;
    Vector<b> tags;

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f63903a;

        /* renamed from: b, reason: collision with root package name */
        public String f63904b;

        /* renamed from: c, reason: collision with root package name */
        public long f63905c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f63906d;

        /* renamed from: e, reason: collision with root package name */
        public Date f63907e;

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(ByteBuffer byteBuffer) {
            try {
                byteBuffer.putInt(f());
                byteBuffer.putShort((short) this.f63903a);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i4 = this.f63903a;
                if (i4 == 8) {
                    XtraBox.writeUtf16String(byteBuffer, this.f63904b);
                } else if (i4 == 19) {
                    byteBuffer.putLong(this.f63905c);
                } else if (i4 != 21) {
                    byteBuffer.put(this.f63906d);
                } else {
                    byteBuffer.putLong(XtraBox.millisToFiletime(this.f63907e.getTime()));
                }
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            } catch (Throwable th) {
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int f() {
            int i4 = this.f63903a;
            if (i4 == 8) {
                return (this.f63904b.length() * 2) + 8;
            }
            if (i4 == 19 || i4 == 21) {
                return 14;
            }
            return this.f63906d.length + 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object g() {
            int i4 = this.f63903a;
            return i4 != 8 ? i4 != 19 ? i4 != 21 ? this.f63906d : this.f63907e : new Long(this.f63905c) : this.f63904b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(ByteBuffer byteBuffer) {
            int i4 = byteBuffer.getInt() - 6;
            this.f63903a = byteBuffer.getShort();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            int i5 = this.f63903a;
            if (i5 == 8) {
                this.f63904b = XtraBox.readUtf16String(byteBuffer, i4);
            } else if (i5 == 19) {
                this.f63905c = byteBuffer.getLong();
            } else if (i5 != 21) {
                byte[] bArr = new byte[i4];
                this.f63906d = bArr;
                byteBuffer.get(bArr);
            } else {
                this.f63907e = new Date(XtraBox.filetimeToMillis(byteBuffer.getLong()));
            }
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public String toString() {
            int i4 = this.f63903a;
            if (i4 == 8) {
                return ProtectedSandApp.s("ቴ\u0001") + this.f63904b;
            }
            if (i4 == 19) {
                return ProtectedSandApp.s("ታ\u0001") + String.valueOf(this.f63905c);
            }
            if (i4 != 21) {
                return ProtectedSandApp.s("ቱ\u0001");
            }
            return ProtectedSandApp.s("ቲ\u0001") + this.f63907e.toString();
        }

        /* synthetic */ c(c cVar) {
            this();
        }

        private c(String str) {
            this.f63903a = 8;
            this.f63904b = str;
        }

        /* synthetic */ c(String str, c cVar) {
            this(str);
        }

        private c(long j4) {
            this.f63903a = 19;
            this.f63905c = j4;
        }

        /* synthetic */ c(long j4, c cVar) {
            this(j4);
        }

        private c(Date date) {
            this.f63903a = 21;
            this.f63907e = date;
        }

        /* synthetic */ c(Date date, c cVar) {
            this(date);
        }
    }

    static {
        ajc$preClinit();
    }

    public XtraBox() {
        super(ProtectedSandApp.s("ት\u0001"));
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ቶ\u0001"), XtraBox.class);
        v E = eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ቹ\u0001"), ProtectedSandApp.s("ቺ\u0001"), "", "", "", ProtectedSandApp.s("ቷ\u0001"));
        String s4 = ProtectedSandApp.s("ቻ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 88);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ች\u0001"), ProtectedSandApp.s("ቺ\u0001"), "", "", "", ProtectedSandApp.s("ቼ\u0001")), 151);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ቿ\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("ኀ\u0001"), ProtectedSandApp.s("ኁ\u0001"), "", ProtectedSandApp.s("ቾ\u0001")), 289);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ኂ\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("ቷ\u0001"), ProtectedSandApp.s("ኃ\u0001"), "", ProtectedSandApp.s("ቷ\u0001")), 166);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ኅ\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("ቷ\u0001"), ProtectedSandApp.s("ኃ\u0001"), "", ProtectedSandApp.s("ኄ\u0001")), 183);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ኇ\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("ቷ\u0001"), ProtectedSandApp.s("ኃ\u0001"), "", ProtectedSandApp.s("ኆ\u0001")), 200);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("\u1289\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("ቷ\u0001"), ProtectedSandApp.s("ኃ\u0001"), "", ProtectedSandApp.s("ኈ\u0001")), 216);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ኊ\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("ቷ\u0001"), ProtectedSandApp.s("ኃ\u0001"), "", ProtectedSandApp.s("ቾ\u0001")), 236);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ኋ\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("ኌ\u0001"), ProtectedSandApp.s("ኍ\u0001"), "", ProtectedSandApp.s("ቾ\u0001")), 249);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ቿ\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("\u128e\u0001"), ProtectedSandApp.s("ኁ\u0001"), "", ProtectedSandApp.s("ቾ\u0001")), 265);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ቸ\u0001"), ProtectedSandApp.s("ቿ\u0001"), ProtectedSandApp.s("ቺ\u0001"), ProtectedSandApp.s("\u128f\u0001"), ProtectedSandApp.s("ነ\u0001"), "", ProtectedSandApp.s("ቾ\u0001")), 276);
    }

    private int detailSize() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.tags.size(); i5++) {
            i4 += this.tags.elementAt(i5).g();
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long filetimeToMillis(long j4) {
        return (j4 / 10000) - FILETIME_EPOCH_DIFF;
    }

    private b getTagByName(String str) {
        Iterator<b> it = this.tags.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f63901b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long millisToFiletime(long j4) {
        return (j4 + FILETIME_EPOCH_DIFF) * 10000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String readAsciiString(ByteBuffer byteBuffer, int i4) {
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, ProtectedSandApp.s("ኑ\u0001"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(ProtectedSandApp.s("ኒ\u0001"), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String readUtf16String(ByteBuffer byteBuffer, int i4) {
        int i5 = (i4 / 2) - 1;
        char[] cArr = new char[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            cArr[i6] = byteBuffer.getChar();
        }
        byteBuffer.getChar();
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeAsciiString(ByteBuffer byteBuffer, String str) {
        try {
            byteBuffer.put(str.getBytes(ProtectedSandApp.s("ኑ\u0001")));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(ProtectedSandApp.s("ኒ\u0001"), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeUtf16String(ByteBuffer byteBuffer, String str) {
        for (char c5 : str.toCharArray()) {
            byteBuffer.putChar(c5);
        }
        byteBuffer.putChar((char) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int detailSize;
        int remaining = byteBuffer.remaining();
        this.data = byteBuffer.slice();
        this.successfulParse = false;
        try {
            try {
                this.tags.clear();
                while (byteBuffer.remaining() > 0) {
                    b bVar = new b((b) null);
                    bVar.h(byteBuffer);
                    this.tags.addElement(bVar);
                }
                detailSize = detailSize();
            } catch (Exception e4) {
                this.successfulParse = false;
                System.err.println(ProtectedSandApp.s("ኖ\u0001") + e4.toString());
                e4.printStackTrace();
                byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
            }
            if (remaining == detailSize) {
                this.successfulParse = true;
                return;
            }
            throw new RuntimeException(ProtectedSandApp.s("ና\u0001") + remaining + ProtectedSandApp.s("ኔ\u0001") + detailSize + ProtectedSandApp.s("ን\u0001"));
        } finally {
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    public String[] getAllTagNames() {
        g.b().c(e.v(ajc$tjp_1, this, this));
        String[] strArr = new String[this.tags.size()];
        for (int i4 = 0; i4 < this.tags.size(); i4++) {
            strArr[i4] = this.tags.elementAt(i4).f63901b;
        }
        return strArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        if (!this.successfulParse) {
            this.data.rewind();
            byteBuffer.put(this.data);
        } else {
            for (int i4 = 0; i4 < this.tags.size(); i4++) {
                this.tags.elementAt(i4).f(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.successfulParse ? detailSize() : this.data.limit();
    }

    public Date getFirstDateValue(String str) {
        g.b().c(e.w(ajc$tjp_3, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
        }
        return null;
    }

    public Long getFirstLongValue(String str) {
        g.b().c(e.w(ajc$tjp_4, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
        }
        return null;
    }

    public String getFirstStringValue(String str) {
        g.b().c(e.w(ajc$tjp_2, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Object[] getValues(String str) {
        g.b().c(e.w(ajc$tjp_5, this, this, str));
        b tagByName = getTagByName(str);
        if (tagByName == null) {
            return new Object[0];
        }
        Object[] objArr = new Object[tagByName.f63902c.size()];
        for (int i4 = 0; i4 < tagByName.f63902c.size(); i4++) {
            objArr[i4] = ((c) tagByName.f63902c.elementAt(i4)).g();
        }
        return objArr;
    }

    public void removeTag(String str) {
        g.b().c(e.w(ajc$tjp_6, this, this, str));
        b tagByName = getTagByName(str);
        if (tagByName != null) {
            this.tags.remove(tagByName);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValue(String str, long j4) {
        g.b().c(e.x(ajc$tjp_10, this, this, str, new Long(j4)));
        removeTag(str);
        b bVar = new b(str, null);
        bVar.f63902c.addElement(new c(j4, (c) (0 == true ? 1 : 0)));
        this.tags.addElement(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValues(String str, String[] strArr) {
        g.b().c(e.x(ajc$tjp_7, this, this, str, strArr));
        removeTag(str);
        Object[] objArr = 0;
        b bVar = new b(str, null);
        for (String str2 : strArr) {
            bVar.f63902c.addElement(new c(str2, (c) (objArr == true ? 1 : 0)));
        }
        this.tags.addElement(bVar);
    }

    public String toString() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        StringBuffer stringBuffer = new StringBuffer(ProtectedSandApp.s("ኗ\u0001"));
        Iterator<b> it = this.tags.iterator();
        while (it.hasNext()) {
            b next = it.next();
            Iterator it2 = next.f63902c.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                stringBuffer.append(next.f63901b);
                stringBuffer.append(ProtectedSandApp.s("ኙ\u0001"));
                stringBuffer.append(cVar.toString());
                stringBuffer.append(ProtectedSandApp.s("ኚ\u0001"));
            }
        }
        stringBuffer.append(ProtectedSandApp.s("ኘ\u0001"));
        return stringBuffer.toString();
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f63900a;

        /* renamed from: b, reason: collision with root package name */
        private String f63901b;

        /* renamed from: c, reason: collision with root package name */
        private Vector<c> f63902c;

        private b() {
            this.f63902c = new Vector<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(ByteBuffer byteBuffer) {
            byteBuffer.putInt(g());
            byteBuffer.putInt(this.f63901b.length());
            XtraBox.writeAsciiString(byteBuffer, this.f63901b);
            byteBuffer.putInt(this.f63902c.size());
            for (int i4 = 0; i4 < this.f63902c.size(); i4++) {
                this.f63902c.elementAt(i4).e(byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int g() {
            int length = this.f63901b.length() + 12;
            for (int i4 = 0; i4 < this.f63902c.size(); i4++) {
                length += this.f63902c.elementAt(i4).f();
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(ByteBuffer byteBuffer) {
            this.f63900a = byteBuffer.getInt();
            this.f63901b = XtraBox.readAsciiString(byteBuffer, byteBuffer.getInt());
            int i4 = byteBuffer.getInt();
            for (int i5 = 0; i5 < i4; i5++) {
                c cVar = new c((c) null);
                cVar.h(byteBuffer);
                this.f63902c.addElement(cVar);
            }
            if (this.f63900a == g()) {
                return;
            }
            throw new RuntimeException(ProtectedSandApp.s("ቪ\u0001") + this.f63900a + ProtectedSandApp.s("ቫ\u0001") + g() + ProtectedSandApp.s("ቬ\u0001") + this.f63901b);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f63901b);
            stringBuffer.append(ProtectedSandApp.s("ቭ\u0001"));
            stringBuffer.append(this.f63900a);
            stringBuffer.append(ProtectedSandApp.s("ቫ\u0001"));
            stringBuffer.append(this.f63902c.size());
            stringBuffer.append(ProtectedSandApp.s("ቮ\u0001"));
            for (int i4 = 0; i4 < this.f63902c.size(); i4++) {
                stringBuffer.append(ProtectedSandApp.s("ቯ\u0001"));
                stringBuffer.append(this.f63902c.elementAt(i4).toString());
                stringBuffer.append(ProtectedSandApp.s("ተ\u0001"));
            }
            return stringBuffer.toString();
        }

        /* synthetic */ b(b bVar) {
            this();
        }

        /* synthetic */ b(String str, b bVar) {
            this(str);
        }

        private b(String str) {
            this();
            this.f63901b = str;
        }
    }

    public XtraBox(String str) {
        super(str);
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    public void setTagValue(String str, String str2) {
        g.b().c(e.x(ajc$tjp_8, this, this, str, str2));
        setTagValues(str, new String[]{str2});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValue(String str, Date date) {
        g.b().c(e.x(ajc$tjp_9, this, this, str, date));
        removeTag(str);
        b bVar = new b(str, null);
        bVar.f63902c.addElement(new c(date, (c) (0 == true ? 1 : 0)));
        this.tags.addElement(bVar);
    }
}

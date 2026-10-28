package android.content.preferences.protobuf;

import org.apache.commons.io.n;

/* compiled from: TextFormatEscaper.java */
/* loaded from: classes.dex */
final class x3 {

    /* compiled from: TextFormatEscaper.java */
    /* loaded from: classes3.dex */
    static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f7608a;

        a(w wVar) {
            this.f7608a = wVar;
        }

        @Override // androidx.datastore.preferences.protobuf.x3.c
        public byte a(int i5) {
            return this.f7608a.i(i5);
        }

        @Override // androidx.datastore.preferences.protobuf.x3.c
        public int size() {
            return this.f7608a.size();
        }
    }

    /* compiled from: TextFormatEscaper.java */
    /* loaded from: classes3.dex */
    static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f7609a;

        b(byte[] bArr) {
            this.f7609a = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.x3.c
        public byte a(int i5) {
            return this.f7609a[i5];
        }

        @Override // androidx.datastore.preferences.protobuf.x3.c
        public int size() {
            return this.f7609a.length;
        }
    }

    /* compiled from: TextFormatEscaper.java */
    private interface c {
        byte a(int i5);

        int size();
    }

    private x3() {
    }

    static String a(w wVar) {
        return b(new a(wVar));
    }

    static String b(c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i5 = 0; i5 < cVar.size(); i5++) {
            byte a6 = cVar.a(i5);
            if (a6 == 34) {
                sb.append("\\\"");
            } else if (a6 == 39) {
                sb.append("\\'");
            } else if (a6 != 92) {
                switch (a6) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a6 < 32 || a6 > 126) {
                            sb.append(n.f32061c);
                            sb.append((char) (((a6 >>> 6) & 3) + 48));
                            sb.append((char) (((a6 >>> 3) & 7) + 48));
                            sb.append((char) ((a6 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a6);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String c(byte[] bArr) {
        return b(new b(bArr));
    }

    static String d(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String e(String str) {
        return a(w.z(str));
    }
}

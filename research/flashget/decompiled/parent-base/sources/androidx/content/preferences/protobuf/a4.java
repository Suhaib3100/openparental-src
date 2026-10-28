package androidx.content.preferences.protobuf;

/* compiled from: TextFormatEscaper.java */
/* loaded from: classes3.dex */
final class a4 {

    /* compiled from: TextFormatEscaper.java */
    static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f28629a;

        a(w wVar) {
            this.f28629a = wVar;
        }

        @Override // androidx.datastore.preferences.protobuf.a4.c
        public byte a(int i4) {
            return this.f28629a.i(i4);
        }

        @Override // androidx.datastore.preferences.protobuf.a4.c
        public int size() {
            return this.f28629a.size();
        }
    }

    /* compiled from: TextFormatEscaper.java */
    static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f28630a;

        b(byte[] bArr) {
            this.f28630a = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.a4.c
        public byte a(int i4) {
            return this.f28630a[i4];
        }

        @Override // androidx.datastore.preferences.protobuf.a4.c
        public int size() {
            return this.f28630a.length;
        }
    }

    /* compiled from: TextFormatEscaper.java */
    private interface c {
        byte a(int i4);

        int size();
    }

    private a4() {
    }

    static String a(w wVar) {
        return b(new a(wVar));
    }

    static String b(c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i4 = 0; i4 < cVar.size(); i4++) {
            byte a5 = cVar.a(i4);
            if (a5 == 34) {
                sb.append("\\\"");
            } else if (a5 == 39) {
                sb.append("\\'");
            } else if (a5 != 92) {
                switch (a5) {
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
                        if (a5 < 32 || a5 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a5 >>> 6) & 3) + 48));
                            sb.append((char) (((a5 >>> 3) & 7) + 48));
                            sb.append((char) ((a5 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a5);
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
        return a(w.A(str));
    }
}

package androidx.documentfile.provider;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.q0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: RawDocumentFile.java */
/* loaded from: classes3.dex */
class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private File f7676c;

    c(@q0 a aVar, File file) {
        super(aVar);
        this.f7676c = file;
    }

    private static boolean w(File file) {
        File[] listFiles = file.listFiles();
        boolean z5 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z5 &= w(file2);
                }
                if (!file2.delete()) {
                    file2.toString();
                    z5 = false;
                }
            }
        }
        return z5;
    }

    private static String x(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return this.f7676c.canRead();
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return this.f7676c.canWrite();
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public a c(String str) {
        File file = new File(this.f7676c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new c(this, file);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public a d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f7676c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e6) {
            e6.toString();
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        w(this.f7676c);
        return this.f7676c.delete();
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return this.f7676c.exists();
    }

    @Override // androidx.documentfile.provider.a
    public String k() {
        return this.f7676c.getName();
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public String m() {
        if (this.f7676c.isDirectory()) {
            return null;
        }
        return x(this.f7676c.getName());
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return Uri.fromFile(this.f7676c);
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return this.f7676c.isDirectory();
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return this.f7676c.isFile();
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return false;
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return this.f7676c.lastModified();
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return this.f7676c.length();
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f7676c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new c(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        File file = new File(this.f7676c.getParentFile(), str);
        if (!this.f7676c.renameTo(file)) {
            return false;
        }
        this.f7676c = file;
        return true;
    }
}

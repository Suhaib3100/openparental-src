package androidx.documentfile.provider;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.q0;
import androidx.compose.material3.z3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: RawDocumentFile.java */
/* loaded from: classes3.dex */
class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private File f29136c;

    c(@q0 a aVar, File file) {
        super(aVar);
        this.f29136c = file;
    }

    private static boolean w(File file) {
        File[] listFiles = file.listFiles();
        boolean z4 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z4 &= w(file2);
                }
                if (!file2.delete()) {
                    file2.toString();
                    z4 = false;
                }
            }
        }
        return z4;
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
        return this.f29136c.canRead();
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return this.f29136c.canWrite();
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public a c(String str) {
        File file = new File(this.f29136c, str);
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
            str2 = z3.a(str2, ".", extensionFromMimeType);
        }
        File file = new File(this.f29136c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e4) {
            e4.toString();
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        w(this.f29136c);
        return this.f29136c.delete();
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return this.f29136c.exists();
    }

    @Override // androidx.documentfile.provider.a
    public String k() {
        return this.f29136c.getName();
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public String m() {
        if (this.f29136c.isDirectory()) {
            return null;
        }
        return x(this.f29136c.getName());
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return Uri.fromFile(this.f29136c);
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return this.f29136c.isDirectory();
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return this.f29136c.isFile();
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return false;
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return this.f29136c.lastModified();
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return this.f29136c.length();
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f29136c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new c(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        File file = new File(this.f29136c.getParentFile(), str);
        if (!this.f29136c.renameTo(file)) {
            return false;
        }
        this.f29136c = file;
        return true;
    }
}

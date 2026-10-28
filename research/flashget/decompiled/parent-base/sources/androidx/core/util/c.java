package androidx.core.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: AtomicFile.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26836d = "AtomicFile";

    /* renamed from: a, reason: collision with root package name */
    private final File f26837a;

    /* renamed from: b, reason: collision with root package name */
    private final File f26838b;

    /* renamed from: c, reason: collision with root package name */
    private final File f26839c;

    public c(@o0 File file) {
        this.f26837a = file;
        this.f26838b = new File(file.getPath() + ".new");
        this.f26839c = new File(file.getPath() + ".bak");
    }

    private static void g(@o0 File file, @o0 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            file2.toString();
        }
        if (file.renameTo(file2)) {
            return;
        }
        file.toString();
        file2.toString();
    }

    private static boolean i(@o0 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f26837a.delete();
        this.f26838b.delete();
        this.f26839c.delete();
    }

    public void b(@q0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        i(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        if (this.f26838b.delete()) {
            return;
        }
        Objects.toString(this.f26838b);
    }

    public void c(@q0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        i(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        g(this.f26838b, this.f26837a);
    }

    @o0
    public File d() {
        return this.f26837a;
    }

    @o0
    public FileInputStream e() throws FileNotFoundException {
        if (this.f26839c.exists()) {
            g(this.f26839c, this.f26837a);
        }
        if (this.f26838b.exists() && this.f26837a.exists() && !this.f26838b.delete()) {
            Objects.toString(this.f26838b);
        }
        return new FileInputStream(this.f26837a);
    }

    @o0
    public byte[] f() throws IOException {
        FileInputStream e4 = e();
        try {
            byte[] bArr = new byte[e4.available()];
            int i4 = 0;
            while (true) {
                int read = e4.read(bArr, i4, bArr.length - i4);
                if (read <= 0) {
                    return bArr;
                }
                i4 += read;
                int available = e4.available();
                if (available > bArr.length - i4) {
                    byte[] bArr2 = new byte[available + i4];
                    System.arraycopy(bArr, 0, bArr2, 0, i4);
                    bArr = bArr2;
                }
            }
        } finally {
            e4.close();
        }
    }

    @o0
    public FileOutputStream h() throws IOException {
        if (this.f26839c.exists()) {
            g(this.f26839c, this.f26837a);
        }
        try {
            return new FileOutputStream(this.f26838b);
        } catch (FileNotFoundException unused) {
            if (!this.f26838b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f26838b);
            }
            try {
                return new FileOutputStream(this.f26838b);
            } catch (FileNotFoundException e4) {
                throw new IOException("Failed to create new file " + this.f26838b, e4);
            }
        }
    }
}

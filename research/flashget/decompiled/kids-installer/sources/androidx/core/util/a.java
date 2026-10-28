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
/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f5228d = "AtomicFile";

    /* renamed from: a, reason: collision with root package name */
    private final File f5229a;

    /* renamed from: b, reason: collision with root package name */
    private final File f5230b;

    /* renamed from: c, reason: collision with root package name */
    private final File f5231c;

    public a(@o0 File file) {
        this.f5229a = file;
        this.f5230b = new File(file.getPath() + ".new");
        this.f5231c = new File(file.getPath() + ".bak");
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
        this.f5229a.delete();
        this.f5230b.delete();
        this.f5231c.delete();
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
        if (this.f5230b.delete()) {
            return;
        }
        Objects.toString(this.f5230b);
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
        g(this.f5230b, this.f5229a);
    }

    @o0
    public File d() {
        return this.f5229a;
    }

    @o0
    public FileInputStream e() throws FileNotFoundException {
        if (this.f5231c.exists()) {
            g(this.f5231c, this.f5229a);
        }
        if (this.f5230b.exists() && this.f5229a.exists() && !this.f5230b.delete()) {
            Objects.toString(this.f5230b);
        }
        return new FileInputStream(this.f5229a);
    }

    @o0
    public byte[] f() throws IOException {
        FileInputStream e6 = e();
        try {
            byte[] bArr = new byte[e6.available()];
            int i5 = 0;
            while (true) {
                int read = e6.read(bArr, i5, bArr.length - i5);
                if (read <= 0) {
                    return bArr;
                }
                i5 += read;
                int available = e6.available();
                if (available > bArr.length - i5) {
                    byte[] bArr2 = new byte[available + i5];
                    System.arraycopy(bArr, 0, bArr2, 0, i5);
                    bArr = bArr2;
                }
            }
        } finally {
            e6.close();
        }
    }

    @o0
    public FileOutputStream h() throws IOException {
        if (this.f5231c.exists()) {
            g(this.f5231c, this.f5229a);
        }
        try {
            return new FileOutputStream(this.f5230b);
        } catch (FileNotFoundException unused) {
            if (!this.f5230b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f5230b);
            }
            try {
                return new FileOutputStream(this.f5230b);
            } catch (FileNotFoundException e6) {
                throw new IOException("Failed to create new file " + this.f5230b, e6);
            }
        }
    }
}

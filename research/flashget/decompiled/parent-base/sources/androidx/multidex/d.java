package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* compiled from: MultiDexExtractor.java */
/* loaded from: classes3.dex */
final class d implements Closeable {

    /* renamed from: m, reason: collision with root package name */
    private static final int f30972m = 3;

    /* renamed from: t, reason: collision with root package name */
    private static final int f30979t = 16384;

    /* renamed from: u, reason: collision with root package name */
    private static final long f30980u = -1;

    /* renamed from: b, reason: collision with root package name */
    private final File f30982b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30983c;

    /* renamed from: d, reason: collision with root package name */
    private final File f30984d;

    /* renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f30985e;

    /* renamed from: f, reason: collision with root package name */
    private final FileChannel f30986f;

    /* renamed from: g, reason: collision with root package name */
    private final FileLock f30987g;

    /* renamed from: p, reason: collision with root package name */
    private static final String f30975p = "crc";

    /* renamed from: q, reason: collision with root package name */
    private static final String f30976q = "dex.number";

    /* renamed from: r, reason: collision with root package name */
    private static final String f30977r = "dex.crc.";

    /* renamed from: s, reason: collision with root package name */
    private static final String f30978s = "dex.time.";

    /* renamed from: v, reason: collision with root package name */
    private static final String f30981v = "MultiDex.lock";

    /* renamed from: h, reason: collision with root package name */
    private static final String f30967h = "MultiDex";

    /* renamed from: i, reason: collision with root package name */
    private static final String f30968i = "classes";

    /* renamed from: j, reason: collision with root package name */
    static final String f30969j = ".dex";

    /* renamed from: k, reason: collision with root package name */
    private static final String f30970k = ".classes";

    /* renamed from: l, reason: collision with root package name */
    static final String f30971l = ".zip";

    /* renamed from: n, reason: collision with root package name */
    private static final String f30973n = "multidex.version";

    /* renamed from: o, reason: collision with root package name */
    private static final String f30974o = "timestamp";

    /* compiled from: MultiDexExtractor.java */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* compiled from: MultiDexExtractor.java */
    private static class b extends File {

        /* renamed from: b, reason: collision with root package name */
        public long f30989b;

        public b(File file, String str) {
            super(file, str);
            this.f30989b = -1L;
        }
    }

    d(File file, File file2) throws IOException {
        file.getPath();
        file2.getPath();
        this.f30982b = file;
        this.f30984d = file2;
        this.f30983c = f(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f30985e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f30986f = channel;
            try {
                file3.getPath();
                this.f30987g = channel.lock();
                file3.getPath();
            } catch (IOException e4) {
                e = e4;
                b(this.f30986f);
                throw e;
            } catch (Error e5) {
                e = e5;
                b(this.f30986f);
                throw e;
            } catch (RuntimeException e6) {
                e = e6;
                b(this.f30986f);
                throw e;
            }
        } catch (IOException e7) {
            e = e7;
            b(this.f30985e);
            throw e;
        } catch (Error e10) {
            e = e10;
            b(this.f30985e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            b(this.f30985e);
            throw e;
        }
    }

    private void a() {
        File[] listFiles = this.f30984d.listFiles(new a());
        if (listFiles == null) {
            this.f30984d.getPath();
            return;
        }
        for (File file : listFiles) {
            file.getPath();
            file.length();
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(androidx.constraintlayout.core.motion.key.c.a("tmp-", str), ".zip", file.getParentFile());
        createTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                file.getPath();
                if (createTempFile.renameTo(file)) {
                    b(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            b(inputStream);
            createTempFile.delete();
            throw th2;
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static long e(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long f(File file) throws IOException {
        long c5 = f.c(file);
        return c5 == -1 ? c5 - 1 : c5;
    }

    private static boolean g(Context context, File file, long j4, String str) {
        SharedPreferences d5 = d(context);
        if (d5.getLong(str + "timestamp", -1L) == e(file)) {
            if (d5.getLong(str + "crc", -1L) == j4) {
                return false;
            }
        }
        return true;
    }

    private List<b> i(Context context, String str) throws IOException {
        String str2 = this.f30982b.getName() + ".classes";
        SharedPreferences d5 = d(context);
        int i4 = d5.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i4 + (-1));
        int i5 = 2;
        while (i5 <= i4) {
            b bVar = new b(this.f30984d, str2 + i5 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f30989b = f(bVar);
            long j4 = d5.getLong(str + "dex.crc." + i5, -1L);
            long j5 = d5.getLong(str + "dex.time." + i5, -1L);
            long lastModified = bVar.lastModified();
            if (j5 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = d5;
                if (j4 == bVar.f30989b) {
                    arrayList.add(bVar);
                    i5++;
                    d5 = sharedPreferences;
                    str2 = str3;
                }
            }
            StringBuilder sb = new StringBuilder("Invalid extracted dex: ");
            sb.append(bVar);
            sb.append(" (key \"");
            sb.append(str);
            sb.append("\"), expected modification time: ");
            sb.append(j5);
            c.a(sb, ", modification time: ", lastModified, ", expected crc: ");
            sb.append(j4);
            sb.append(", file crc: ");
            sb.append(bVar.f30989b);
            throw new IOException(sb.toString());
        }
        return arrayList;
    }

    private List<b> k() throws IOException {
        String str = this.f30982b.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f30982b);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i4 = 2;
            while (entry != null) {
                b bVar = new b(this.f30984d, str + i4 + ".zip");
                arrayList.add(bVar);
                bVar.toString();
                int i5 = 0;
                boolean z4 = false;
                while (i5 < 3 && !z4) {
                    i5++;
                    c(zipFile, entry, bVar, str);
                    try {
                        bVar.f30989b = f(bVar);
                        z4 = true;
                    } catch (IOException unused) {
                        bVar.getAbsolutePath();
                        z4 = false;
                    }
                    bVar.getAbsolutePath();
                    bVar.length();
                    if (!z4) {
                        bVar.delete();
                        if (bVar.exists()) {
                            bVar.getPath();
                        }
                    }
                }
                if (!z4) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i4 + ")");
                }
                i4++;
                entry = zipFile.getEntry("classes" + i4 + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    private static void l(Context context, String str, long j4, long j5, List<b> list) {
        SharedPreferences.Editor edit = d(context).edit();
        edit.putLong(str + "timestamp", j4);
        edit.putLong(android.support.v4.media.c.a(new StringBuilder(), str, "crc"), j5);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i4 = 2;
        for (b bVar : list) {
            edit.putLong(str + "dex.crc." + i4, bVar.f30989b);
            edit.putLong(str + "dex.time." + i4, bVar.lastModified());
            i4++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30987g.release();
        this.f30986f.close();
        this.f30985e.close();
    }

    List<? extends File> h(Context context, String str, boolean z4) throws IOException {
        List<b> k4;
        this.f30982b.getPath();
        if (!this.f30987g.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z4 || g(context, this.f30982b, this.f30983c, str)) {
            k4 = k();
            l(context, str, e(this.f30982b), this.f30983c, k4);
        } else {
            try {
                k4 = i(context, str);
            } catch (IOException unused) {
                k4 = k();
                l(context, str, e(this.f30982b), this.f30983c, k4);
            }
        }
        k4.size();
        return k4;
    }
}

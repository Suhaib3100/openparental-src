package org.apache.commons.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.filefilter.v;
import org.apache.commons.io.filefilter.w;

/* compiled from: FileUtils.java */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final long f85416a = 1024;

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f85417b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f85418c = 1048576;

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f85419d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f85420e = 31457280;

    /* renamed from: f, reason: collision with root package name */
    public static final long f85421f = 1073741824;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f85422g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f85423h = 1099511627776L;

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f85424i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f85425j = 1125899906842624L;

    /* renamed from: k, reason: collision with root package name */
    public static final BigInteger f85426k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f85427l = 1152921504606846976L;

    /* renamed from: m, reason: collision with root package name */
    public static final BigInteger f85428m;

    /* renamed from: n, reason: collision with root package name */
    public static final BigInteger f85429n;

    /* renamed from: o, reason: collision with root package name */
    public static final BigInteger f85430o;

    /* renamed from: p, reason: collision with root package name */
    public static final File[] f85431p;

    /* renamed from: q, reason: collision with root package name */
    private static final Charset f85432q;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        f85417b = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        f85419d = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        f85422g = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        f85424i = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        f85426k = multiply4;
        f85428m = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        f85429n = multiply5;
        f85430o = valueOf.multiply(multiply5);
        f85431p = new File[0];
        f85432q = Charset.forName("UTF-8");
    }

    public static boolean A(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                f(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    private static String[] A0(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i4 = 0; i4 < strArr.length; i4++) {
            strArr2[i4] = "." + strArr[i4];
        }
        return strArr2;
    }

    public static boolean B(File file, File file2) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(androidx.core.content.g.a("Not a directory: ", file));
        }
        if (file2 != null && file.exists() && file2.exists()) {
            return j.b(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    public static URL[] B0(File[] fileArr) throws IOException {
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i4 = 0; i4 < length; i4++) {
            urlArr[i4] = fileArr[i4].toURI().toURL();
        }
        return urlArr;
    }

    private static void C(File file, File file2, FileFilter fileFilter, boolean z4, List<String> list) throws IOException {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles == null) {
            throw new IOException(androidx.core.content.g.a("Failed to list contents of ", file));
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException(com.sand.file.b.a("Destination '", file2, "' exists but is not a directory"));
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException(com.sand.file.b.a("Destination '", file2, "' directory cannot be created"));
        }
        if (!file2.canWrite()) {
            throw new IOException(com.sand.file.b.a("Destination '", file2, "' cannot be written to"));
        }
        for (File file3 : listFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    C(file3, file4, fileFilter, z4, list);
                } else {
                    D(file3, file4, z4);
                }
            }
        }
        if (z4) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void C0(File file) throws IOException {
        if (!file.exists()) {
            m.d(k0(file, false));
        }
        if (!file.setLastModified(System.currentTimeMillis())) {
            throw new IOException(androidx.core.content.g.a("Unable to set the last modification time for ", file));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable, java.io.FileOutputStream] */
    private static void D(File file, File file2, boolean z4) throws IOException {
        FileInputStream fileInputStream;
        ?? r4;
        FileChannel fileChannel;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException(com.sand.file.b.a("Destination '", file2, "' exists but is a directory"));
        }
        FileChannel fileChannel2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                r4 = new FileOutputStream(file2);
                try {
                    fileChannel = fileInputStream.getChannel();
                    try {
                        fileChannel2 = r4.getChannel();
                        long size = fileChannel.size();
                        long j4 = 0;
                        while (j4 < size) {
                            long j5 = size - j4;
                            j4 += fileChannel2.transferFrom(fileChannel, j4, j5 > f85420e ? 31457280L : j5);
                        }
                        m.b(fileChannel2);
                        m.b(r4);
                        m.b(fileChannel);
                        m.b(fileInputStream);
                        if (file.length() == file2.length()) {
                            if (z4) {
                                file2.setLastModified(file.lastModified());
                            }
                        } else {
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
                        }
                    } catch (Throwable th) {
                        th = th;
                        m.b(fileChannel2);
                        m.b(r4);
                        m.b(fileChannel);
                        m.b(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = null;
                }
            } catch (Throwable th3) {
                th = th3;
                r4 = 0;
                fileChannel = r4;
                m.b(fileChannel2);
                m.b(r4);
                m.b(fileChannel);
                m.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            r4 = 0;
        }
    }

    private static void D0(File file, org.apache.commons.io.filefilter.n nVar) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory");
        }
        if (nVar == null) {
            throw new NullPointerException("Parameter 'fileFilter' is null");
        }
    }

    public static void E(File file) throws IOException {
        if (file.isDirectory()) {
            y(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            throw new FileNotFoundException(androidx.core.content.g.a("File does not exist: ", file));
        }
        throw new IOException(androidx.core.content.g.a("Unable to delete file: ", file));
    }

    public static boolean E0(File file, int i4) {
        int i5 = 0;
        int i6 = 0;
        while (!file.exists()) {
            int i7 = i5 + 1;
            if (i5 >= 10) {
                int i10 = i6 + 1;
                if (i6 > i4) {
                    return false;
                }
                i6 = i10;
                i5 = 0;
            } else {
                i5 = i7;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            } catch (Exception unused2) {
                return true;
            }
        }
        return true;
    }

    public static void F(File file) throws IOException {
        if (file.isDirectory()) {
            z(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void F0(File file, CharSequence charSequence) throws IOException {
        J0(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void G(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(com.sand.file.b.a("File ", file, " exists and is not a directory. Unable to create directory."));
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(androidx.core.content.g.a("Unable to create directory ", file));
        }
    }

    public static void G0(File file, CharSequence charSequence, String str) throws IOException {
        H0(file, charSequence, str, false);
    }

    public static File H(File file, String... strArr) {
        if (file == null) {
            throw new NullPointerException("directorydirectory must not be null");
        }
        if (strArr == null) {
            throw new NullPointerException("names must not be null");
        }
        int length = strArr.length;
        int i4 = 0;
        while (i4 < length) {
            File file2 = new File(file, strArr[i4]);
            i4++;
            file = file2;
        }
        return file;
    }

    public static void H0(File file, CharSequence charSequence, String str, boolean z4) throws IOException {
        J0(file, charSequence, b.a(str), z4);
    }

    public static File I(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("names must not be null");
        }
        File file = null;
        for (String str : strArr) {
            file = file == null ? new File(str) : new File(file, str);
        }
        return file;
    }

    public static void I0(File file, CharSequence charSequence, Charset charset) throws IOException {
        J0(file, charSequence, charset, false);
    }

    public static File J() {
        return new File(System.getProperty("java.io.tmpdir"));
    }

    public static void J0(File file, CharSequence charSequence, Charset charset, boolean z4) throws IOException {
        Z0(file, charSequence == null ? null : charSequence.toString(), charset, z4);
    }

    public static String K() {
        return System.getProperty("java.io.tmpdir");
    }

    public static void K0(File file, CharSequence charSequence, boolean z4) throws IOException {
        J0(file, charSequence, Charset.defaultCharset(), z4);
    }

    public static File L() {
        return new File(System.getProperty("user.home"));
    }

    public static void L0(File file, byte[] bArr) throws IOException {
        M0(file, bArr, false);
    }

    public static String M() {
        return System.getProperty("user.home");
    }

    public static void M0(File file, byte[] bArr, boolean z4) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = k0(file, z4);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            m.d(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            m.d(fileOutputStream);
            throw th;
        }
    }

    private static void N(Collection<File> collection, File file, org.apache.commons.io.filefilter.n nVar, boolean z4) {
        File[] listFiles = file.listFiles((FileFilter) nVar);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (z4) {
                        collection.add(file2);
                    }
                    N(collection, file2, nVar, z4);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    public static void N0(File file, String str, Collection<?> collection) throws IOException {
        P0(file, str, collection, null, false);
    }

    public static boolean O(File file, long j4) {
        if (file != null) {
            return file.exists() && file.lastModified() > j4;
        }
        throw new IllegalArgumentException("No specified file");
    }

    public static void O0(File file, String str, Collection<?> collection, String str2) throws IOException {
        P0(file, str, collection, str2, false);
    }

    public static boolean P(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (file2.exists()) {
            return O(file, file2.lastModified());
        }
        throw new IllegalArgumentException(com.sand.file.b.a("The reference file '", file2, "' doesn't exist"));
    }

    public static void P0(File file, String str, Collection<?> collection, String str2, boolean z4) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = k0(file, z4);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                m.X0(collection, str2, bufferedOutputStream, str);
                bufferedOutputStream.flush();
                fileOutputStream.close();
                m.b(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                m.d(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static boolean Q(File file, Date date) {
        if (date != null) {
            return O(file, date.getTime());
        }
        throw new IllegalArgumentException("No specified date");
    }

    public static void Q0(File file, String str, Collection<?> collection, boolean z4) throws IOException {
        P0(file, str, collection, null, z4);
    }

    public static boolean R(File file, long j4) {
        if (file != null) {
            return file.exists() && file.lastModified() < j4;
        }
        throw new IllegalArgumentException("No specified file");
    }

    public static void R0(File file, Collection<?> collection) throws IOException {
        P0(file, null, collection, null, false);
    }

    public static boolean S(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (file2.exists()) {
            return R(file, file2.lastModified());
        }
        throw new IllegalArgumentException(com.sand.file.b.a("The reference file '", file2, "' doesn't exist"));
    }

    public static void S0(File file, Collection<?> collection, String str) throws IOException {
        P0(file, null, collection, str, false);
    }

    public static boolean T(File file, Date date) {
        if (date != null) {
            return R(file, date.getTime());
        }
        throw new IllegalArgumentException("No specified date");
    }

    public static void T0(File file, Collection<?> collection, String str, boolean z4) throws IOException {
        P0(file, null, collection, str, z4);
    }

    public static boolean U(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (j.z()) {
            return false;
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static void U0(File file, Collection<?> collection, boolean z4) throws IOException {
        P0(file, null, collection, null, z4);
    }

    public static Iterator<File> V(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        return a0(file, nVar, nVar2).iterator();
    }

    public static void V0(File file, String str) throws IOException {
        Z0(file, str, Charset.defaultCharset(), false);
    }

    public static Iterator<File> W(File file, String[] strArr, boolean z4) {
        return b0(file, strArr, z4).iterator();
    }

    public static void W0(File file, String str, String str2) throws IOException {
        X0(file, str, str2, false);
    }

    public static Iterator<File> X(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        return c0(file, nVar, nVar2).iterator();
    }

    public static void X0(File file, String str, String str2, boolean z4) throws IOException {
        Z0(file, str, b.a(str2), z4);
    }

    public static n Y(File file) throws IOException {
        return Z(file, null);
    }

    public static void Y0(File file, String str, Charset charset) throws IOException {
        Z0(file, str, charset, false);
    }

    public static n Z(File file, String str) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = i0(file);
            return m.C(fileInputStream, str);
        } catch (IOException e4) {
            m.c(fileInputStream);
            throw e4;
        } catch (RuntimeException e5) {
            m.c(fileInputStream);
            throw e5;
        }
    }

    public static void Z0(File file, String str, Charset charset, boolean z4) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = k0(file, z4);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            m.J0(str, fileOutputStream, charset);
            fileOutputStream.close();
            m.b(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            m.d(fileOutputStream);
            throw th;
        }
    }

    public static String a(long j4) {
        return b(BigInteger.valueOf(j4));
    }

    public static Collection<File> a0(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        D0(file, nVar);
        org.apache.commons.io.filefilter.n t02 = t0(nVar);
        org.apache.commons.io.filefilter.n s02 = s0(nVar2);
        LinkedList linkedList = new LinkedList();
        N(linkedList, file, org.apache.commons.io.filefilter.l.F(t02, s02), false);
        return linkedList;
    }

    public static void a1(File file, String str, boolean z4) throws IOException {
        Z0(file, str, Charset.defaultCharset(), z4);
    }

    public static String b(BigInteger bigInteger) {
        BigInteger bigInteger2 = f85428m;
        BigInteger divide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (divide.compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger2)).concat(" EB");
        }
        BigInteger bigInteger4 = f85426k;
        if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger4)).concat(" PB");
        }
        BigInteger bigInteger5 = f85424i;
        if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger5)).concat(" TB");
        }
        BigInteger bigInteger6 = f85422g;
        if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger6)).concat(" GB");
        }
        BigInteger bigInteger7 = f85419d;
        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger7)).concat(" MB");
        }
        BigInteger bigInteger8 = f85417b;
        return bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0 ? String.valueOf(bigInteger.divide(bigInteger8)).concat(" KB") : String.valueOf(bigInteger).concat(" bytes");
    }

    public static Collection<File> b0(File file, String[] strArr, boolean z4) {
        return a0(file, strArr == null ? w.f85401c : new v(A0(strArr)), z4 ? w.f85401c : org.apache.commons.io.filefilter.j.f85380c);
    }

    private static void c(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IllegalArgumentException(file + " is not a directory");
    }

    public static Collection<File> c0(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        D0(file, nVar);
        org.apache.commons.io.filefilter.n t02 = t0(nVar);
        org.apache.commons.io.filefilter.n s02 = s0(nVar2);
        LinkedList linkedList = new LinkedList();
        if (file.isDirectory()) {
            linkedList.add(file);
        }
        N(linkedList, file, org.apache.commons.io.filefilter.l.F(t02, s02), true);
        return linkedList;
    }

    public static Checksum d(File file, Checksum checksum) throws IOException {
        CheckedInputStream checkedInputStream;
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        CheckedInputStream checkedInputStream2 = null;
        try {
            checkedInputStream = new CheckedInputStream(new FileInputStream(file), checksum);
        } catch (Throwable th) {
            th = th;
        }
        try {
            m.m(checkedInputStream, new org.apache.commons.io.output.j());
            m.b(checkedInputStream);
            return checksum;
        } catch (Throwable th2) {
            th = th2;
            checkedInputStream2 = checkedInputStream;
            m.c(checkedInputStream2);
            throw th;
        }
    }

    public static void d0(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(com.sand.file.b.a("Source '", file, "' does not exist"));
        }
        if (!file.isDirectory()) {
            throw new IOException(com.sand.file.b.a("Source '", file, "' is not a directory"));
        }
        if (file2.exists()) {
            throw new FileExistsException(com.sand.file.b.a("Destination '", file2, "' already exists"));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
        k(file, file2);
        y(file);
        if (file.exists()) {
            throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
        }
    }

    public static long e(File file) throws IOException {
        CRC32 crc32 = new CRC32();
        d(file, crc32);
        return crc32.getValue();
    }

    public static void e0(File file, File file2, boolean z4) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && z4) {
            file2.mkdirs();
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException(com.sand.file.b.a("Destination '", file2, "' is not a directory"));
            }
            d0(file, new File(file2, file.getName()));
        } else {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z4 + "]");
        }
    }

    public static void f(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException(androidx.core.content.g.a("Failed to list contents of ", file));
        }
        IOException e4 = null;
        for (File file2 : listFiles) {
            try {
                E(file2);
            } catch (IOException e5) {
                e4 = e5;
            }
        }
        if (e4 != null) {
            throw e4;
        }
    }

    public static void f0(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(com.sand.file.b.a("Source '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(com.sand.file.b.a("Source '", file, "' is a directory"));
        }
        if (file2.exists()) {
            throw new FileExistsException(com.sand.file.b.a("Destination '", file2, "' already exists"));
        }
        if (file2.isDirectory()) {
            throw new IOException(com.sand.file.b.a("Destination '", file2, "' is a directory"));
        }
        if (file.renameTo(file2)) {
            return;
        }
        r(file, file2, true);
        if (file.delete()) {
            return;
        }
        A(file2);
        throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
    }

    private static void g(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException(androidx.core.content.g.a("Failed to list contents of ", file));
        }
        IOException e4 = null;
        for (File file2 : listFiles) {
            try {
                F(file2);
            } catch (IOException e5) {
                e4 = e5;
            }
        }
        if (e4 != null) {
            throw e4;
        }
    }

    public static void g0(File file, File file2, boolean z4) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && z4) {
            file2.mkdirs();
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException(com.sand.file.b.a("Destination '", file2, "' is not a directory"));
            }
            f0(file, new File(file2, file.getName()));
        } else {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z4 + "]");
        }
    }

    public static boolean h(File file, File file2) throws IOException {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        boolean exists = file.exists();
        if (exists != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.length() != file2.length()) {
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        FileInputStream fileInputStream3 = null;
        try {
            fileInputStream2 = new FileInputStream(file);
            try {
                fileInputStream = new FileInputStream(file2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            boolean j4 = m.j(fileInputStream2, fileInputStream);
            m.b(fileInputStream2);
            m.b(fileInputStream);
            return j4;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream3 = fileInputStream2;
            m.c(fileInputStream3);
            m.b(fileInputStream);
            throw th;
        }
    }

    public static void h0(File file, File file2, boolean z4) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(com.sand.file.b.a("Source '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            e0(file, file2, z4);
        } else {
            g0(file, file2, z4);
        }
    }

    public static boolean i(File file, File file2, String str) throws IOException {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        boolean exists = file.exists();
        if (exists != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        InputStreamReader inputStreamReader3 = null;
        try {
            if (str == null) {
                InputStreamReader inputStreamReader4 = new InputStreamReader(new FileInputStream(file));
                try {
                    inputStreamReader2 = new InputStreamReader(new FileInputStream(file2));
                    inputStreamReader3 = inputStreamReader4;
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader = null;
                    inputStreamReader3 = inputStreamReader4;
                    m.e(inputStreamReader3);
                    m.b(inputStreamReader);
                    throw th;
                }
            } else {
                InputStreamReader inputStreamReader5 = new InputStreamReader(new FileInputStream(file), str);
                try {
                    inputStreamReader2 = new InputStreamReader(new FileInputStream(file2), str);
                    inputStreamReader3 = inputStreamReader5;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = null;
                    inputStreamReader3 = inputStreamReader5;
                    m.e(inputStreamReader3);
                    m.b(inputStreamReader);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = inputStreamReader3;
        }
        try {
            boolean l4 = m.l(inputStreamReader3, inputStreamReader2);
            m.b(inputStreamReader3);
            m.b(inputStreamReader2);
            return l4;
        } catch (Throwable th4) {
            inputStreamReader = inputStreamReader2;
            th = th4;
            m.e(inputStreamReader3);
            m.b(inputStreamReader);
            throw th;
        }
    }

    public static FileInputStream i0(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException(com.sand.file.b.a("File '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(com.sand.file.b.a("File '", file, "' exists but is a directory"));
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        throw new IOException(com.sand.file.b.a("File '", file, "' cannot be read"));
    }

    public static File[] j(Collection<File> collection) {
        return (File[]) collection.toArray(new File[collection.size()]);
    }

    public static FileOutputStream j0(File file) throws IOException {
        return k0(file, false);
    }

    public static void k(File file, File file2) throws IOException {
        m(file, file2, null, true);
    }

    public static FileOutputStream k0(File file, boolean z4) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException(com.sand.file.b.a("Directory '", parentFile, "' could not be created"));
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException(com.sand.file.b.a("File '", file, "' exists but is a directory"));
            }
            if (!file.canWrite()) {
                throw new IOException(com.sand.file.b.a("File '", file, "' cannot be written to"));
            }
        }
        return new FileOutputStream(file, z4);
    }

    public static void l(File file, File file2, FileFilter fileFilter) throws IOException {
        m(file, file2, fileFilter, true);
    }

    public static byte[] l0(File file) throws IOException {
        FileInputStream fileInputStream;
        try {
            fileInputStream = i0(file);
            try {
                byte[] Z = m.Z(fileInputStream, file.length());
                m.b(fileInputStream);
                return Z;
            } catch (Throwable th) {
                th = th;
                m.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static void m(File file, File file2, FileFilter fileFilter, boolean z4) throws IOException {
        ArrayList arrayList;
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(com.sand.file.b.a("Source '", file, "' does not exist"));
        }
        if (!file.isDirectory()) {
            throw new IOException(com.sand.file.b.a("Source '", file, "' exists but is not a directory"));
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
            if (listFiles != null && listFiles.length > 0) {
                arrayList = new ArrayList(listFiles.length);
                for (File file3 : listFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
                C(file, file2, fileFilter, z4, arrayList);
            }
        }
        arrayList = null;
        C(file, file2, fileFilter, z4, arrayList);
    }

    public static String m0(File file) throws IOException {
        return o0(file, Charset.defaultCharset());
    }

    public static void n(File file, File file2, boolean z4) throws IOException {
        m(file, file2, null, z4);
    }

    public static String n0(File file, String str) throws IOException {
        return o0(file, b.a(str));
    }

    public static void o(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException(com.sand.file.b.a("Source '", file2, "' is not a directory"));
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException(com.sand.file.b.a("Destination '", file2, "' is not a directory"));
        }
        m(file, new File(file2, file.getName()), null, true);
    }

    public static String o0(File file, Charset charset) throws IOException {
        FileInputStream fileInputStream;
        try {
            fileInputStream = i0(file);
            try {
                String t02 = m.t0(fileInputStream, b.b(charset));
                m.b(fileInputStream);
                return t02;
            } catch (Throwable th) {
                th = th;
                m.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static long p(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return m.u(fileInputStream, outputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public static List<String> p0(File file) throws IOException {
        return r0(file, Charset.defaultCharset());
    }

    public static void q(File file, File file2) throws IOException {
        r(file, file2, true);
    }

    public static List<String> q0(File file, String str) throws IOException {
        return r0(file, b.a(str));
    }

    public static void r(File file, File file2, boolean z4) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(com.sand.file.b.a("Source '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(com.sand.file.b.a("Source '", file, "' exists but is a directory"));
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException(com.sand.file.b.a("Destination '", parentFile, "' directory cannot be created"));
        }
        if (file2.exists() && !file2.canWrite()) {
            throw new IOException(com.sand.file.b.a("Destination '", file2, "' exists but is read-only"));
        }
        D(file, file2, z4);
    }

    public static List<String> r0(File file, Charset charset) throws IOException {
        FileInputStream fileInputStream;
        try {
            fileInputStream = i0(file);
            try {
                List<String> P = m.P(fileInputStream, b.b(charset));
                m.b(fileInputStream);
                return P;
            } catch (Throwable th) {
                th = th;
                m.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static void s(File file, File file2) throws IOException {
        t(file, file2, true);
    }

    private static org.apache.commons.io.filefilter.n s0(org.apache.commons.io.filefilter.n nVar) {
        return nVar == null ? org.apache.commons.io.filefilter.j.f85380c : org.apache.commons.io.filefilter.l.g(nVar, org.apache.commons.io.filefilter.h.f85376c);
    }

    public static void t(File file, File file2, boolean z4) throws IOException {
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException(com.sand.file.b.a("Destination '", file2, "' is not a directory"));
        }
        r(file, new File(file2, file.getName()), z4);
    }

    private static org.apache.commons.io.filefilter.n t0(org.apache.commons.io.filefilter.n nVar) {
        return org.apache.commons.io.filefilter.l.g(nVar, org.apache.commons.io.filefilter.l.E(org.apache.commons.io.filefilter.h.f85376c));
    }

    public static void u(InputStream inputStream, File file) throws IOException {
        try {
            FileOutputStream k02 = k0(file, false);
            try {
                m.m(inputStream, k02);
                k02.close();
                m.b(k02);
                m.b(inputStream);
            } catch (Throwable th) {
                m.d(k02);
                throw th;
            }
        } catch (Throwable th2) {
            m.c(inputStream);
            throw th2;
        }
    }

    public static long u0(File file) {
        if (file.exists()) {
            return file.isDirectory() ? w0(file) : file.length();
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    public static void v(URL url, File file) throws IOException {
        u(url.openStream(), file);
    }

    public static BigInteger v0(File file) {
        if (file.exists()) {
            return file.isDirectory() ? x0(file) : BigInteger.valueOf(file.length());
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    public static void w(URL url, File file, int i4, int i5) throws IOException {
        URLConnection openConnection = url.openConnection();
        openConnection.setConnectTimeout(i4);
        openConnection.setReadTimeout(i5);
        u(openConnection.getInputStream(), file);
    }

    public static long w0(File file) {
        c(file);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        long j4 = 0;
        for (File file2 : listFiles) {
            try {
                if (!U(file2)) {
                    j4 += u0(file2);
                    if (j4 < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return j4;
    }

    static String x(String str) {
        int i4;
        if (str == null || str.indexOf(37) < 0) {
            return str;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int i5 = 0;
        while (i5 < length) {
            if (str.charAt(i5) == '%') {
                while (true) {
                    i4 = i5 + 3;
                    try {
                        try {
                            allocate.put((byte) Integer.parseInt(str.substring(i5 + 1, i4), 16));
                            if (i4 >= length) {
                                break;
                            }
                            try {
                                if (str.charAt(i4) != '%') {
                                    break;
                                }
                                i5 = i4;
                            } catch (RuntimeException unused) {
                                i5 = i4;
                                if (allocate.position() > 0) {
                                    allocate.flip();
                                    stringBuffer.append(f85432q.decode(allocate).toString());
                                    allocate.clear();
                                }
                                stringBuffer.append(str.charAt(i5));
                                i5++;
                            }
                        } catch (RuntimeException unused2) {
                        }
                    } finally {
                        if (allocate.position() > 0) {
                            allocate.flip();
                            stringBuffer.append(f85432q.decode(allocate).toString());
                            allocate.clear();
                        }
                    }
                }
                i5 = i4;
            }
            stringBuffer.append(str.charAt(i5));
            i5++;
        }
        return stringBuffer.toString();
    }

    public static BigInteger x0(File file) {
        c(file);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigInteger = BigInteger.ZERO;
        for (File file2 : listFiles) {
            try {
                if (!U(file2)) {
                    bigInteger = bigInteger.add(BigInteger.valueOf(u0(file2)));
                }
            } catch (IOException unused) {
            }
        }
        return bigInteger;
    }

    public static void y(File file) throws IOException {
        if (file.exists()) {
            if (!U(file)) {
                f(file);
            }
            if (!file.delete()) {
                throw new IOException(com.sand.file.b.a("Unable to delete directory ", file, "."));
            }
        }
    }

    public static File y0(URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        return new File(x(url.getFile().replace('/', File.separatorChar)));
    }

    private static void z(File file) throws IOException {
        if (file.exists()) {
            file.deleteOnExit();
            if (U(file)) {
                return;
            }
            g(file);
        }
    }

    public static File[] z0(URL[] urlArr) {
        if (urlArr == null || urlArr.length == 0) {
            return f85431p;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i4 = 0; i4 < urlArr.length; i4++) {
            URL url = urlArr[i4];
            if (url != null) {
                if (!url.getProtocol().equals("file")) {
                    throw new IllegalArgumentException("URL could not be converted to a File: " + url);
                }
                fileArr[i4] = y0(url);
            }
        }
        return fileArr;
    }
}

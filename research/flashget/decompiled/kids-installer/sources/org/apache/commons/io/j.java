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
/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final long f32009a = 1024;

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f32010b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f32011c = 1048576;

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f32012d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f32013e = 31457280;

    /* renamed from: f, reason: collision with root package name */
    public static final long f32014f = 1073741824;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f32015g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f32016h = 1099511627776L;

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f32017i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f32018j = 1125899906842624L;

    /* renamed from: k, reason: collision with root package name */
    public static final BigInteger f32019k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f32020l = 1152921504606846976L;

    /* renamed from: m, reason: collision with root package name */
    public static final BigInteger f32021m;

    /* renamed from: n, reason: collision with root package name */
    public static final BigInteger f32022n;

    /* renamed from: o, reason: collision with root package name */
    public static final BigInteger f32023o;

    /* renamed from: p, reason: collision with root package name */
    public static final File[] f32024p;

    /* renamed from: q, reason: collision with root package name */
    private static final Charset f32025q;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        f32010b = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        f32012d = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        f32015g = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        f32017i = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        f32019k = multiply4;
        f32021m = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        f32022n = multiply5;
        f32023o = valueOf.multiply(multiply5);
        f32024p = new File[0];
        f32025q = Charset.forName("UTF-8");
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
        for (int i5 = 0; i5 < strArr.length; i5++) {
            strArr2[i5] = "." + strArr[i5];
        }
        return strArr2;
    }

    public static boolean B(File file, File file2) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Not a directory: " + file);
        }
        if (file2 != null && file.exists() && file2.exists()) {
            return k.b(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    public static URL[] B0(File[] fileArr) throws IOException {
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i5 = 0; i5 < length; i5++) {
            urlArr[i5] = fileArr[i5].toURI().toURL();
        }
        return urlArr;
    }

    private static void C(File file, File file2, FileFilter fileFilter, boolean z5, List<String> list) throws IOException {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException(h.a("Destination '", file2, "' exists but is not a directory"));
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException(h.a("Destination '", file2, "' directory cannot be created"));
        }
        if (!file2.canWrite()) {
            throw new IOException(h.a("Destination '", file2, "' cannot be written to"));
        }
        for (File file3 : listFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    C(file3, file4, fileFilter, z5, list);
                } else {
                    D(file3, file4, z5);
                }
            }
        }
        if (z5) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void C0(File file) throws IOException {
        if (!file.exists()) {
            n.d(k0(file, false));
        }
        if (file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        throw new IOException("Unable to set the last modification time for " + file);
    }

    private static void D(File file, File file2, boolean z5) throws IOException {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileChannel fileChannel;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException(h.a("Destination '", file2, "' exists but is a directory"));
        }
        FileChannel fileChannel2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    fileChannel = fileInputStream.getChannel();
                    try {
                        fileChannel2 = fileOutputStream.getChannel();
                        long size = fileChannel.size();
                        long j5 = 0;
                        while (j5 < size) {
                            long j6 = size - j5;
                            j5 += fileChannel2.transferFrom(fileChannel, j5, j6 > f32013e ? 31457280L : j6);
                        }
                        n.b(fileChannel2);
                        n.b(fileOutputStream);
                        n.b(fileChannel);
                        n.b(fileInputStream);
                        if (file.length() == file2.length()) {
                            if (z5) {
                                file2.setLastModified(file.lastModified());
                            }
                        } else {
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
                        }
                    } catch (Throwable th) {
                        th = th;
                        n.b(fileChannel2);
                        n.b(fileOutputStream);
                        n.b(fileChannel);
                        n.b(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileChannel = null;
                n.b(fileChannel2);
                n.b(fileOutputStream);
                n.b(fileChannel);
                n.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
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
        if (exists) {
            throw new IOException("Unable to delete file: " + file);
        }
        throw new FileNotFoundException("File does not exist: " + file);
    }

    public static boolean E0(File file, int i5) {
        int i6 = 0;
        int i7 = 0;
        while (!file.exists()) {
            int i8 = i6 + 1;
            if (i6 >= 10) {
                int i9 = i7 + 1;
                if (i7 > i5) {
                    return false;
                }
                i7 = i9;
                i6 = 0;
            } else {
                i6 = i8;
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
                throw new IOException(h.a("File ", file, " exists and is not a directory. Unable to create directory."));
            }
        } else {
            if (file.mkdirs() || file.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create directory " + file);
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
        int i5 = 0;
        while (i5 < length) {
            File file2 = new File(file, strArr[i5]);
            i5++;
            file = file2;
        }
        return file;
    }

    public static void H0(File file, CharSequence charSequence, String str, boolean z5) throws IOException {
        J0(file, charSequence, b.a(str), z5);
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
        return new File(K());
    }

    public static void J0(File file, CharSequence charSequence, Charset charset, boolean z5) throws IOException {
        Z0(file, charSequence == null ? null : charSequence.toString(), charset, z5);
    }

    public static String K() {
        return System.getProperty("java.io.tmpdir");
    }

    public static void K0(File file, CharSequence charSequence, boolean z5) throws IOException {
        J0(file, charSequence, Charset.defaultCharset(), z5);
    }

    public static File L() {
        return new File(M());
    }

    public static void L0(File file, byte[] bArr) throws IOException {
        M0(file, bArr, false);
    }

    public static String M() {
        return System.getProperty("user.home");
    }

    public static void M0(File file, byte[] bArr, boolean z5) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = k0(file, z5);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            n.d(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            n.d(fileOutputStream);
            throw th;
        }
    }

    private static void N(Collection<File> collection, File file, org.apache.commons.io.filefilter.n nVar, boolean z5) {
        File[] listFiles = file.listFiles((FileFilter) nVar);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (z5) {
                        collection.add(file2);
                    }
                    N(collection, file2, nVar, z5);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    public static void N0(File file, String str, Collection<?> collection) throws IOException {
        P0(file, str, collection, null, false);
    }

    public static boolean O(File file, long j5) {
        if (file != null) {
            return file.exists() && file.lastModified() > j5;
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
        throw new IllegalArgumentException(h.a("The reference file '", file2, "' doesn't exist"));
    }

    public static void P0(File file, String str, Collection<?> collection, String str2, boolean z5) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = k0(file, z5);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                n.X0(collection, str2, bufferedOutputStream, str);
                bufferedOutputStream.flush();
                fileOutputStream.close();
                n.d(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                n.d(fileOutputStream);
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

    public static void Q0(File file, String str, Collection<?> collection, boolean z5) throws IOException {
        P0(file, str, collection, null, z5);
    }

    public static boolean R(File file, long j5) {
        if (file != null) {
            return file.exists() && file.lastModified() < j5;
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
        throw new IllegalArgumentException(h.a("The reference file '", file2, "' doesn't exist"));
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

    public static void T0(File file, Collection<?> collection, String str, boolean z5) throws IOException {
        P0(file, null, collection, str, z5);
    }

    public static boolean U(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (k.z()) {
            return false;
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static void U0(File file, Collection<?> collection, boolean z5) throws IOException {
        P0(file, null, collection, null, z5);
    }

    public static Iterator<File> V(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        return a0(file, nVar, nVar2).iterator();
    }

    public static void V0(File file, String str) throws IOException {
        Z0(file, str, Charset.defaultCharset(), false);
    }

    public static Iterator<File> W(File file, String[] strArr, boolean z5) {
        return b0(file, strArr, z5).iterator();
    }

    public static void W0(File file, String str, String str2) throws IOException {
        X0(file, str, str2, false);
    }

    public static Iterator<File> X(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        return c0(file, nVar, nVar2).iterator();
    }

    public static void X0(File file, String str, String str2, boolean z5) throws IOException {
        Z0(file, str, b.a(str2), z5);
    }

    public static o Y(File file) throws IOException {
        return Z(file, null);
    }

    public static void Y0(File file, String str, Charset charset) throws IOException {
        Z0(file, str, charset, false);
    }

    public static o Z(File file, String str) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = i0(file);
            return n.C(fileInputStream, str);
        } catch (IOException e6) {
            n.c(fileInputStream);
            throw e6;
        } catch (RuntimeException e7) {
            n.c(fileInputStream);
            throw e7;
        }
    }

    public static void Z0(File file, String str, Charset charset, boolean z5) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = k0(file, z5);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            n.J0(str, fileOutputStream, charset);
            fileOutputStream.close();
            n.d(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            n.d(fileOutputStream);
            throw th;
        }
    }

    public static String a(long j5) {
        return b(BigInteger.valueOf(j5));
    }

    public static Collection<File> a0(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        D0(file, nVar);
        org.apache.commons.io.filefilter.n t02 = t0(nVar);
        org.apache.commons.io.filefilter.n s02 = s0(nVar2);
        LinkedList linkedList = new LinkedList();
        N(linkedList, file, org.apache.commons.io.filefilter.l.F(t02, s02), false);
        return linkedList;
    }

    public static void a1(File file, String str, boolean z5) throws IOException {
        Z0(file, str, Charset.defaultCharset(), z5);
    }

    public static String b(BigInteger bigInteger) {
        BigInteger bigInteger2 = f32021m;
        BigInteger divide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (divide.compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger2)).concat(" EB");
        }
        BigInteger bigInteger4 = f32019k;
        if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger4)).concat(" PB");
        }
        BigInteger bigInteger5 = f32017i;
        if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger5)).concat(" TB");
        }
        BigInteger bigInteger6 = f32015g;
        if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger6)).concat(" GB");
        }
        BigInteger bigInteger7 = f32012d;
        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger7)).concat(" MB");
        }
        BigInteger bigInteger8 = f32010b;
        return bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0 ? String.valueOf(bigInteger.divide(bigInteger8)).concat(" KB") : String.valueOf(bigInteger).concat(" bytes");
    }

    public static Collection<File> b0(File file, String[] strArr, boolean z5) {
        return a0(file, strArr == null ? w.f31901p : new v(A0(strArr)), z5 ? w.f31901p : org.apache.commons.io.filefilter.j.f31880p);
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
            n.m(checkedInputStream, new org.apache.commons.io.output.j());
            n.c(checkedInputStream);
            return checksum;
        } catch (Throwable th2) {
            th = th2;
            checkedInputStream2 = checkedInputStream;
            n.c(checkedInputStream2);
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
            throw new FileNotFoundException(h.a("Source '", file, "' does not exist"));
        }
        if (!file.isDirectory()) {
            throw new IOException(h.a("Source '", file, "' is not a directory"));
        }
        if (file2.exists()) {
            throw new FileExistsException(h.a("Destination '", file2, "' already exists"));
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

    public static void e0(File file, File file2, boolean z5) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && z5) {
            file2.mkdirs();
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException(h.a("Destination '", file2, "' is not a directory"));
            }
            d0(file, new File(file2, file.getName()));
        } else {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z5 + "]");
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
            throw new IOException("Failed to list contents of " + file);
        }
        IOException e6 = null;
        for (File file2 : listFiles) {
            try {
                E(file2);
            } catch (IOException e7) {
                e6 = e7;
            }
        }
        if (e6 != null) {
            throw e6;
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
            throw new FileNotFoundException(h.a("Source '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(h.a("Source '", file, "' is a directory"));
        }
        if (file2.exists()) {
            throw new FileExistsException(h.a("Destination '", file2, "' already exists"));
        }
        if (file2.isDirectory()) {
            throw new IOException(h.a("Destination '", file2, "' is a directory"));
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
            throw new IOException("Failed to list contents of " + file);
        }
        IOException e6 = null;
        for (File file2 : listFiles) {
            try {
                F(file2);
            } catch (IOException e7) {
                e6 = e7;
            }
        }
        if (e6 != null) {
            throw e6;
        }
    }

    public static void g0(File file, File file2, boolean z5) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && z5) {
            file2.mkdirs();
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException(h.a("Destination '", file2, "' is not a directory"));
            }
            f0(file, new File(file2, file.getName()));
        } else {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z5 + "]");
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
            boolean j5 = n.j(fileInputStream2, fileInputStream);
            n.b(fileInputStream2);
            n.b(fileInputStream);
            return j5;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream3 = fileInputStream2;
            n.c(fileInputStream3);
            n.b(fileInputStream);
            throw th;
        }
    }

    public static void h0(File file, File file2, boolean z5) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(h.a("Source '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            e0(file, file2, z5);
        } else {
            g0(file, file2, z5);
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
                    n.e(inputStreamReader3);
                    n.b(inputStreamReader);
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
                    n.e(inputStreamReader3);
                    n.b(inputStreamReader);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = inputStreamReader3;
        }
        try {
            boolean l5 = n.l(inputStreamReader3, inputStreamReader2);
            n.b(inputStreamReader3);
            n.b(inputStreamReader2);
            return l5;
        } catch (Throwable th4) {
            inputStreamReader = inputStreamReader2;
            th = th4;
            n.e(inputStreamReader3);
            n.b(inputStreamReader);
            throw th;
        }
    }

    public static FileInputStream i0(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException(h.a("File '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(h.a("File '", file, "' exists but is a directory"));
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        throw new IOException(h.a("File '", file, "' cannot be read"));
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

    public static FileOutputStream k0(File file, boolean z5) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException(h.a("Directory '", parentFile, "' could not be created"));
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException(h.a("File '", file, "' exists but is a directory"));
            }
            if (!file.canWrite()) {
                throw new IOException(h.a("File '", file, "' cannot be written to"));
            }
        }
        return new FileOutputStream(file, z5);
    }

    public static void l(File file, File file2, FileFilter fileFilter) throws IOException {
        m(file, file2, fileFilter, true);
    }

    public static byte[] l0(File file) throws IOException {
        FileInputStream fileInputStream;
        try {
            fileInputStream = i0(file);
            try {
                byte[] Z = n.Z(fileInputStream, file.length());
                n.c(fileInputStream);
                return Z;
            } catch (Throwable th) {
                th = th;
                n.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static void m(File file, File file2, FileFilter fileFilter, boolean z5) throws IOException {
        ArrayList arrayList;
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(h.a("Source '", file, "' does not exist"));
        }
        if (!file.isDirectory()) {
            throw new IOException(h.a("Source '", file, "' exists but is not a directory"));
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
                C(file, file2, fileFilter, z5, arrayList);
            }
        }
        arrayList = null;
        C(file, file2, fileFilter, z5, arrayList);
    }

    public static String m0(File file) throws IOException {
        return o0(file, Charset.defaultCharset());
    }

    public static void n(File file, File file2, boolean z5) throws IOException {
        m(file, file2, null, z5);
    }

    public static String n0(File file, String str) throws IOException {
        return o0(file, b.a(str));
    }

    public static void o(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException(h.a("Source '", file2, "' is not a directory"));
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException(h.a("Destination '", file2, "' is not a directory"));
        }
        m(file, new File(file2, file.getName()), null, true);
    }

    public static String o0(File file, Charset charset) throws IOException {
        FileInputStream fileInputStream;
        try {
            fileInputStream = i0(file);
            try {
                String t02 = n.t0(fileInputStream, b.b(charset));
                n.c(fileInputStream);
                return t02;
            } catch (Throwable th) {
                th = th;
                n.c(fileInputStream);
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
            return n.u(fileInputStream, outputStream);
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

    public static void r(File file, File file2, boolean z5) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(h.a("Source '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(h.a("Source '", file, "' exists but is a directory"));
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException(h.a("Destination '", parentFile, "' directory cannot be created"));
        }
        if (file2.exists() && !file2.canWrite()) {
            throw new IOException(h.a("Destination '", file2, "' exists but is read-only"));
        }
        D(file, file2, z5);
    }

    public static List<String> r0(File file, Charset charset) throws IOException {
        FileInputStream fileInputStream;
        try {
            fileInputStream = i0(file);
            try {
                List<String> P = n.P(fileInputStream, b.b(charset));
                n.c(fileInputStream);
                return P;
            } catch (Throwable th) {
                th = th;
                n.c(fileInputStream);
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
        return nVar == null ? org.apache.commons.io.filefilter.j.f31880p : org.apache.commons.io.filefilter.l.g(nVar, org.apache.commons.io.filefilter.h.f31876p);
    }

    public static void t(File file, File file2, boolean z5) throws IOException {
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException(h.a("Destination '", file2, "' is not a directory"));
        }
        r(file, new File(file2, file.getName()), z5);
    }

    private static org.apache.commons.io.filefilter.n t0(org.apache.commons.io.filefilter.n nVar) {
        return org.apache.commons.io.filefilter.l.g(nVar, org.apache.commons.io.filefilter.l.E(org.apache.commons.io.filefilter.h.f31876p));
    }

    public static void u(InputStream inputStream, File file) throws IOException {
        try {
            FileOutputStream k02 = k0(file, false);
            try {
                n.m(inputStream, k02);
                k02.close();
            } finally {
                n.d(k02);
            }
        } finally {
            n.c(inputStream);
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

    public static void w(URL url, File file, int i5, int i6) throws IOException {
        URLConnection openConnection = url.openConnection();
        openConnection.setConnectTimeout(i5);
        openConnection.setReadTimeout(i6);
        u(openConnection.getInputStream(), file);
    }

    public static long w0(File file) {
        c(file);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        long j5 = 0;
        for (File file2 : listFiles) {
            try {
                if (!U(file2)) {
                    j5 += u0(file2);
                    if (j5 < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return j5;
    }

    static String x(String str) {
        int i5;
        if (str == null || str.indexOf(37) < 0) {
            return str;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int i6 = 0;
        while (i6 < length) {
            if (str.charAt(i6) == '%') {
                while (true) {
                    i5 = i6 + 3;
                    try {
                        try {
                            allocate.put((byte) Integer.parseInt(str.substring(i6 + 1, i5), 16));
                            if (i5 >= length) {
                                break;
                            }
                            try {
                                if (str.charAt(i5) != '%') {
                                    break;
                                }
                                i6 = i5;
                            } catch (RuntimeException unused) {
                                i6 = i5;
                                if (allocate.position() > 0) {
                                    allocate.flip();
                                    stringBuffer.append(f32025q.decode(allocate).toString());
                                    allocate.clear();
                                }
                                stringBuffer.append(str.charAt(i6));
                                i6++;
                            }
                        } catch (RuntimeException unused2) {
                        }
                    } finally {
                        if (allocate.position() > 0) {
                            allocate.flip();
                            stringBuffer.append(f32025q.decode(allocate).toString());
                            allocate.clear();
                        }
                    }
                }
                i6 = i5;
            }
            stringBuffer.append(str.charAt(i6));
            i6++;
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
                throw new IOException(h.a("Unable to delete directory ", file, "."));
            }
        }
    }

    public static File y0(URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        return new File(x(url.getFile().replace(n.f32060b, File.separatorChar)));
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
            return f32024p;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i5 = 0; i5 < urlArr.length; i5++) {
            URL url = urlArr[i5];
            if (url != null) {
                if (!url.getProtocol().equals("file")) {
                    throw new IllegalArgumentException("URL could not be converted to a File: " + url);
                }
                fileArr[i5] = y0(url);
            }
        }
        return fileArr;
    }
}

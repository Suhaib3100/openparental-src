package com.tencent.beacon.base.net.b;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.util.f;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* compiled from: CompressUtil.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final f<com.tencent.beacon.base.net.b.a.b.c> f71160a = new f<>(5);

    public static byte[] a(int i4, byte[] bArr) throws Exception {
        return i4 == 1 ? f(bArr) : i4 == 2 ? c(bArr) : i4 == 3 ? a(bArr) : c(bArr);
    }

    public static byte[] b(int i4, byte[] bArr) throws Exception {
        return i4 == 1 ? e(bArr) : i4 == 2 ? d(bArr) : i4 == 3 ? b(bArr) : d(bArr);
    }

    private static byte[] c(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.finish();
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] d(byte[] r10) throws java.lang.Exception {
        /*
            r0 = 0
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        L15:
            int r7 = r3.read(r5, r0, r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L34
            r8 = -1
            if (r7 == r8) goto L22
            r6.write(r5, r0, r7)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L34
            goto L15
        L20:
            r10 = move-exception
            goto L39
        L22:
            byte[] r1 = r6.toByteArray()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L34
            r6.flush()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L34
            r6.close()
            r3.close()
            r2.close()
            goto Lad
        L34:
            r4 = move-exception
            r5 = r4
            r4 = r1
            r1 = r6
            goto L59
        L39:
            r1 = r6
            goto Lae
        L3c:
            r10 = move-exception
            goto Lae
        L3f:
            r4 = move-exception
            r5 = r4
            r4 = r1
            goto L59
        L43:
            r10 = move-exception
            goto L48
        L45:
            r3 = move-exception
            r4 = r3
            goto L4a
        L48:
            r3 = r1
            goto Lae
        L4a:
            r3 = r1
        L4b:
            r5 = r4
            r4 = r3
            goto L59
        L4e:
            r10 = move-exception
            goto L53
        L50:
            r2 = move-exception
            r4 = r2
            goto L56
        L53:
            r2 = r1
            r3 = r2
            goto Lae
        L56:
            r2 = r1
            r3 = r2
            goto L4b
        L59:
            com.tencent.beacon.a.b.j r6 = com.tencent.beacon.a.b.j.e()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = "ㄉ\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r8.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r9 = "ㄊ\u0001"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            r8.append(r9)     // Catch: java.lang.Throwable -> L3c
            int r10 = r10.length     // Catch: java.lang.Throwable -> L3c
            r8.append(r10)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = r8.toString()     // Catch: java.lang.Throwable -> L3c
            r6.a(r7, r10, r5)     // Catch: java.lang.Throwable -> L3c
            com.tencent.beacon.base.util.c.a(r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r10.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "ㄋ\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r10.append(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3c
            r10.append(r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3c
            com.tencent.beacon.base.util.c.b(r10, r0)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto La2
            r1.close()
        La2:
            if (r3 == 0) goto La7
            r3.close()
        La7:
            if (r2 == 0) goto Lac
            r2.close()
        Lac:
            r1 = r4
        Lad:
            return r1
        Lae:
            if (r1 == 0) goto Lb3
            r1.close()
        Lb3:
            if (r3 == 0) goto Lb8
            r3.close()
        Lb8:
            if (r2 == 0) goto Lbd
            r2.close()
        Lbd:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.base.net.b.a.d(byte[]):byte[]");
    }

    private static byte[] e(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ZipInputStream zipInputStream = new ZipInputStream(byteArrayInputStream);
        byte[] bArr2 = null;
        while (zipInputStream.getNextEntry() != null) {
            byte[] bArr3 = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = zipInputStream.read(bArr3, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr3, 0, read);
                }
            }
            bArr2 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        }
        zipInputStream.close();
        byteArrayInputStream.close();
        return bArr2;
    }

    private static byte[] f(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        ZipEntry zipEntry = new ZipEntry(ProtectedSandApp.s("ㄌ\u0001"));
        zipEntry.setSize(bArr.length);
        zipOutputStream.putNextEntry(zipEntry);
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static byte[] a(byte[] bArr) throws Exception {
        com.tencent.beacon.base.net.b.a.b bVar = new com.tencent.beacon.base.net.b.a.b();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        try {
            try {
                com.tencent.beacon.base.net.b.a.b.c a5 = f71160a.a();
                if (a5 == null) {
                    a5 = new com.tencent.beacon.base.net.b.a.b.c();
                }
                com.tencent.beacon.base.net.b.a.b.c cVar = a5;
                cVar.g(bVar.f71200k);
                cVar.h(bVar.f71192c);
                cVar.j(bVar.f71197h);
                cVar.i(bVar.f71201l);
                cVar.c(bVar.f71194e, bVar.f71195f, bVar.f71196g);
                cVar.a(false);
                cVar.b(bufferedOutputStream);
                long length = bArr.length;
                for (int i4 = 0; i4 < 8; i4++) {
                    bufferedOutputStream.write(((int) (length >>> (i4 * 8))) & 255);
                }
                cVar.a(bufferedInputStream, bufferedOutputStream, -1L, -1L, null);
                bufferedOutputStream.flush();
                f71160a.a(cVar);
            } catch (Exception e4) {
                StringBuilder sb = new StringBuilder();
                sb.append(ProtectedSandApp.s("\u3103\u0001"));
                sb.append(e4.getMessage());
                String sb2 = sb.toString();
                com.tencent.beacon.base.util.c.b(sb2, new Object[0]);
                j.e().a(ProtectedSandApp.s("\u3104\u0001"), sb2);
            }
            bufferedOutputStream.close();
            bufferedInputStream.close();
            byteArrayInputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            bufferedOutputStream.close();
            bufferedInputStream.close();
            byteArrayInputStream.close();
            byteArrayOutputStream.close();
            throw th;
        }
    }

    public static byte[] b(byte[] bArr) throws Exception {
        byte[] bArr2;
        new com.tencent.beacon.base.net.b.a.b();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        try {
            try {
                bArr2 = new byte[5];
            } catch (Exception e4) {
                StringBuilder sb = new StringBuilder();
                sb.append(ProtectedSandApp.s("ㄈ\u0001"));
                sb.append(e4.getMessage());
                String sb2 = sb.toString();
                com.tencent.beacon.base.util.c.b(sb2, new Object[0]);
                j.e().a(ProtectedSandApp.s("\u3104\u0001"), sb2);
            }
            if (byteArrayInputStream.read(bArr2, 0, 5) == 5) {
                com.tencent.beacon.base.net.b.a.b.b bVar = new com.tencent.beacon.base.net.b.a.b.b();
                bVar.a(bArr2);
                long j4 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    int read = bufferedInputStream.read();
                    if (read < 0) {
                        throw new Exception(ProtectedSandApp.s("ㄅ\u0001"));
                    }
                    j4 |= read << (i4 * 8);
                }
                if (bVar.a(bufferedInputStream, bufferedOutputStream, j4)) {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    byteArrayInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                throw new Exception(ProtectedSandApp.s("ㄆ\u0001"));
            }
            throw new Exception(ProtectedSandApp.s("ㄇ\u0001"));
        } catch (Throwable th) {
            bufferedOutputStream.close();
            bufferedInputStream.close();
            byteArrayInputStream.close();
            byteArrayOutputStream.close();
            throw th;
        }
    }
}

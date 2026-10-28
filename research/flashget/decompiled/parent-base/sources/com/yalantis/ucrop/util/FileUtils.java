package com.yalantis.ucrop.util;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.o0;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;

/* loaded from: classes7.dex */
public class FileUtils {
    public static final String WEBP = ProtectedSandApp.s("式\u0001");
    public static final String GIF = ProtectedSandApp.s("弐\u0001");
    public static final String JPEG = ProtectedSandApp.s("弑\u0001");
    private static final String TAG = ProtectedSandApp.s("弒\u0001");

    /* renamed from: sf, reason: collision with root package name */
    private static final SimpleDateFormat f72874sf = new SimpleDateFormat(ProtectedSandApp.s("弓\u0001"));

    private FileUtils() {
    }

    public static void copyFile(@o0 String str, @o0 String str2) throws IOException {
        FileChannel fileChannel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = new FileInputStream(new File(str)).getChannel();
            try {
                fileChannel2 = new FileOutputStream(new File(str2)).getChannel();
                channel.transferTo(0L, channel.size(), fileChannel2);
                channel.close();
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (Throwable th) {
                th = th;
                FileChannel fileChannel3 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel3;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }

    public static String getCreateFileName(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder a5 = j4.a(str);
        a5.append(f72874sf.format(Long.valueOf(currentTimeMillis)));
        return a5.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "引\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            if (r8 == 0) goto L30
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L2e
            if (r9 == 0) goto L30
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L2e
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L2e
            r8.close()
            return r9
        L2b:
            r9 = move-exception
            r7 = r8
            goto L53
        L2e:
            r9 = move-exception
            goto L3a
        L30:
            if (r8 == 0) goto L52
        L32:
            r8.close()
            goto L52
        L36:
            r9 = move-exception
            goto L53
        L38:
            r9 = move-exception
            r8 = r7
        L3a:
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r11 = "弖\u0001"
            java.lang.String r11 = com.flashget.parentalcontrol.ProtectedSandApp.s(r11)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L2b
            java.lang.String.format(r10, r11, r9)     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L52
            goto L32
        L52:
            return r7
        L53:
            if (r7 == 0) goto L58
            r7.close()
        L58:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.FileUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String getInputPath(Uri uri) {
        return (isContent(uri.toString()) || isHasHttp(uri.toString())) ? uri.toString() : uri.getPath();
    }

    public static String getMimeTypeFromMediaContentUri(Context context, Uri uri) {
        if (uri.getScheme().equals(ProtectedSandApp.s("弗\u0001"))) {
            return context.getContentResolver().getType(uri);
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    @SuppressLint({"NewApi"})
    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            boolean isExternalStorageDocument = isExternalStorageDocument(uri);
            String s4 = ProtectedSandApp.s("弘\u0001");
            if (isExternalStorageDocument) {
                String[] split = DocumentsContract.getDocumentId(uri).split(s4);
                if (ProtectedSandApp.s("弙\u0001").equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + ProtectedSandApp.s("弚\u0001") + split[1];
                }
            } else if (isDownloadsDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse(ProtectedSandApp.s("弛\u0001")), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e4) {
                        e4.getMessage();
                        return null;
                    }
                }
            } else if (isMediaDocument(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(s4);
                String str = split2[0];
                if (ProtectedSandApp.s("弜\u0001").equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (ProtectedSandApp.s("弝\u0001").equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (ProtectedSandApp.s("弞\u0001").equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getDataColumn(context, uri2, ProtectedSandApp.s("弟\u0001"), new String[]{split2[1]});
            }
        } else {
            if (ProtectedSandApp.s("弗\u0001").equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
            }
            if (ProtectedSandApp.s("张\u0001").equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static String getPostfixDefaultEmpty(Context context, boolean z4, Uri uri) {
        if (z4) {
            String mimeTypeFromMediaContentUri = getMimeTypeFromMediaContentUri(context, uri);
            if (isGif(mimeTypeFromMediaContentUri)) {
                return ProtectedSandApp.s("弐\u0001");
            }
            if (isWebp(mimeTypeFromMediaContentUri)) {
                return ProtectedSandApp.s("式\u0001");
            }
        }
        return "";
    }

    public static String getPostfixDefaultJPEG(Context context, boolean z4, Uri uri) {
        if (z4) {
            String mimeTypeFromMediaContentUri = getMimeTypeFromMediaContentUri(context, uri);
            if (isGif(mimeTypeFromMediaContentUri)) {
                return ProtectedSandApp.s("弐\u0001");
            }
            if (isWebp(mimeTypeFromMediaContentUri)) {
                return ProtectedSandApp.s("式\u0001");
            }
        }
        return ProtectedSandApp.s("弑\u0001");
    }

    public static boolean isContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ProtectedSandApp.s("弡\u0001"));
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return ProtectedSandApp.s("弢\u0001").equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return ProtectedSandApp.s("弣\u0001").equals(uri.getAuthority());
    }

    public static boolean isGif(String str) {
        return str != null && (str.equals(ProtectedSandApp.s("弤\u0001")) || str.equals(ProtectedSandApp.s("弥\u0001")));
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return ProtectedSandApp.s("弦\u0001").equals(uri.getAuthority());
    }

    public static boolean isHasAudio(String str) {
        return str != null && str.startsWith(ProtectedSandApp.s("弞\u0001"));
    }

    public static boolean isHasHttp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ProtectedSandApp.s("弧\u0001")) || str.startsWith(ProtectedSandApp.s("弨\u0001")) || str.startsWith(ProtectedSandApp.s("弩\u0001")) || str.startsWith(ProtectedSandApp.s("弪\u0001"));
    }

    public static boolean isHasVideo(String str) {
        return str != null && str.startsWith(ProtectedSandApp.s("弝\u0001"));
    }

    public static boolean isMediaDocument(Uri uri) {
        return ProtectedSandApp.s("弫\u0001").equals(uri.getAuthority());
    }

    public static boolean isUrlHasVideo(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().endsWith(ProtectedSandApp.s("弬\u0001"));
    }

    public static boolean isWebp(String str) {
        return str != null && (str.equals(ProtectedSandApp.s("弭\u0001")) || str.equals(ProtectedSandApp.s("弮\u0001")));
    }

    public static Uri replaceOutputUri(Context context, boolean z4, Uri uri, Uri uri2) {
        try {
            String postfixDefaultEmpty = getPostfixDefaultEmpty(context, z4, uri);
            if (TextUtils.isEmpty(postfixDefaultEmpty)) {
                return uri2;
            }
            String uri3 = isContent(uri2.toString()) ? uri2.toString() : uri2.getPath();
            String replace = uri3.replace(uri3.substring(uri3.lastIndexOf(ProtectedSandApp.s("弯\u0001"))), postfixDefaultEmpty);
            return isContent(replace) ? Uri.parse(replace) : Uri.fromFile(new File(replace));
        } catch (Exception e4) {
            e4.printStackTrace();
            return uri2;
        }
    }

    public static boolean writeFileFromIS(InputStream inputStream, OutputStream outputStream) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
            } catch (Exception e4) {
                e = e4;
                bufferedOutputStream = null;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        outputStream.flush();
                        BitmapLoadUtils.close(bufferedInputStream2);
                        BitmapLoadUtils.close(bufferedOutputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (Exception e5) {
                e = e5;
                bufferedInputStream = bufferedInputStream2;
                try {
                    e.printStackTrace();
                    BitmapLoadUtils.close(bufferedInputStream);
                    BitmapLoadUtils.close(bufferedOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    BitmapLoadUtils.close(bufferedInputStream);
                    BitmapLoadUtils.close(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = bufferedInputStream2;
                BitmapLoadUtils.close(bufferedInputStream);
                BitmapLoadUtils.close(bufferedOutputStream);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public static String getCreateFileName() {
        return f72874sf.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static void copyFile(@o0 Context context, @o0 Uri uri, @o0 Uri uri2) throws IOException {
        OutputStream outputStream;
        if (uri.equals(uri2)) {
            return;
        }
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
                if ((openInputStream instanceof FileInputStream) && (openOutputStream instanceof FileOutputStream)) {
                    FileChannel channel = ((FileInputStream) openInputStream).getChannel();
                    channel.transferTo(0L, channel.size(), ((FileOutputStream) openOutputStream).getChannel());
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    if (openOutputStream != null) {
                        openOutputStream.close();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("弔\u0001"));
            } catch (Throwable th) {
                th = th;
                inputStream = openInputStream;
                outputStream = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }
}

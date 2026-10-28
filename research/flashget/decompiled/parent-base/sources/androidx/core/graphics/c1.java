package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.c1;
import androidx.core.provider.q;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypefaceCompatUtil.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26176a = "TypefaceCompatUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final String f26177b = ".font";

    private c1() {
    }

    public static void a(@androidx.annotation.q0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @androidx.annotation.q0
    public static ByteBuffer b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources, int i4) {
        File e4 = e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (c(e4, resources, i4)) {
                return g(e4);
            }
            return null;
        } finally {
            e4.delete();
        }
    }

    public static boolean c(@androidx.annotation.o0 File file, @androidx.annotation.o0 Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean d5 = d(file, inputStream);
                a(inputStream);
                return d5;
            } catch (Throwable th) {
                th = th;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean d(@androidx.annotation.o0 File file, @androidx.annotation.o0 InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    @androidx.annotation.q0
    public static File e(@androidx.annotation.o0 Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    @androidx.annotation.q0
    public static ByteBuffer f(@androidx.annotation.o0 Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @androidx.annotation.q0
    private static ByteBuffer g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.o0
    public static Map<Uri, ByteBuffer> h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 q.c[] cVarArr, @androidx.annotation.q0 CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (q.c cVar : cVarArr) {
            if (cVar.b() == 0) {
                Uri d5 = cVar.d();
                if (!hashMap.containsKey(d5)) {
                    hashMap.put(d5, f(context, cancellationSignal, d5));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.c1;
import androidx.core.provider.h;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
/* loaded from: classes.dex */
public class k3 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4765a = "TypefaceCompatUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final String f4766b = ".font";

    /* compiled from: TypefaceCompatUtil.java */
    @androidx.annotation.x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    private k3() {
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
    @androidx.annotation.x0(19)
    public static ByteBuffer b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources, int i5) {
        File e6 = e(context);
        if (e6 == null) {
            return null;
        }
        try {
            if (c(e6, resources, i5)) {
                return g(e6);
            }
            return null;
        } finally {
            e6.delete();
        }
    }

    public static boolean c(@androidx.annotation.o0 File file, @androidx.annotation.o0 Resources resources, int i5) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i5);
            try {
                boolean d6 = d(file, inputStream);
                a(inputStream);
                return d6;
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
            } catch (IOException e6) {
                e = e6;
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
        } catch (IOException e7) {
            e = e7;
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
        for (int i5 = 0; i5 < 100; i5++) {
            File file = new File(cacheDir, str + i5);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(19)
    public static ByteBuffer f(@androidx.annotation.o0 Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 Uri uri) {
        try {
            ParcelFileDescriptor a6 = a.a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (a6 == null) {
                if (a6 != null) {
                    a6.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(a6.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    a6.close();
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
    @androidx.annotation.x0(19)
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
    @androidx.annotation.x0(19)
    public static Map<Uri, ByteBuffer> h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 h.c[] cVarArr, @androidx.annotation.q0 CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (h.c cVar : cVarArr) {
            if (cVar.b() == 0) {
                Uri d6 = cVar.d();
                if (!hashMap.containsKey(d6)) {
                    hashMap.put(d6, f(context, cancellationSignal, d6));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

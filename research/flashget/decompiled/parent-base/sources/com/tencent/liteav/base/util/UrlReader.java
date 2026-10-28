package com.tencent.liteav.base.util;

import android.net.Uri;
import androidx.compose.runtime.snapshots.f0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class UrlReader {
    private static final int AVSEEK_SIZE = 65536;
    private static final int SEEK_CUR = 1;
    private static final int SEEK_END = 2;
    private static final int SEEK_SET = 0;
    private static final String TAG = ProtectedSandApp.s("厦\u0001");
    private int mFileSize;
    private long mOffset;
    private InputStream mStream;
    private Uri mUri;

    public UrlReader(String str) {
        this.mUri = Uri.parse(str);
        open();
    }

    private void open() {
        String s4 = ProtectedSandApp.s("厦\u0001");
        try {
            InputStream openInputStream = ContextUtils.getApplicationContext().getContentResolver().openInputStream(this.mUri);
            this.mStream = openInputStream;
            this.mFileSize = openInputStream.available();
        } catch (FileNotFoundException unused) {
            Log.e(s4, ProtectedSandApp.s("厨\u0001") + this.mUri.toString(), new Object[0]);
            this.mStream = null;
        } catch (IOException e4) {
            Log.e(s4, ProtectedSandApp.s("厧\u0001") + e4.getMessage(), new Object[0]);
            this.mStream = null;
        }
    }

    private long seekFromBegin(long j4) {
        if (j4 < 0) {
            return -1L;
        }
        close();
        open();
        InputStream inputStream = this.mStream;
        if (inputStream == null) {
            return -1L;
        }
        try {
            long skip = inputStream.skip(j4);
            this.mOffset = skip;
            return skip;
        } catch (IOException e4) {
            StringBuilder a5 = f0.a(ProtectedSandApp.s("厩\u0001"), j4, ProtectedSandApp.s("厪\u0001"));
            a5.append(e4.getMessage());
            Log.e(ProtectedSandApp.s("厦\u0001"), a5.toString(), new Object[0]);
            return -1L;
        }
    }

    private long seekFromCurrent(long j4) {
        if (j4 < 0) {
            return seekFromBegin(this.mOffset + j4);
        }
        try {
            long skip = this.mOffset + this.mStream.skip(j4);
            this.mOffset = skip;
            return skip;
        } catch (IOException e4) {
            StringBuilder a5 = f0.a(ProtectedSandApp.s("厩\u0001"), j4, ProtectedSandApp.s("厪\u0001"));
            a5.append(e4.getMessage());
            Log.e(ProtectedSandApp.s("厦\u0001"), a5.toString(), new Object[0]);
            return -1L;
        }
    }

    private long seekFromEnd(long j4) {
        if (j4 > 0) {
            return -1L;
        }
        long j5 = this.mFileSize + j4;
        if (j5 < 0) {
            return -1L;
        }
        long j6 = this.mOffset;
        if (j5 < j6) {
            return seekFromBegin(j5);
        }
        try {
            long skip = j6 + this.mStream.skip(j5 - j6);
            this.mOffset = skip;
            return skip;
        } catch (IOException e4) {
            StringBuilder a5 = f0.a(ProtectedSandApp.s("厩\u0001"), j4, ProtectedSandApp.s("厪\u0001"));
            a5.append(e4.getMessage());
            Log.e(ProtectedSandApp.s("厦\u0001"), a5.toString(), new Object[0]);
            return -1L;
        }
    }

    public void close() {
        InputStream inputStream = this.mStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                Log.e(ProtectedSandApp.s("厦\u0001"), ProtectedSandApp.s("厫\u0001") + e4.getMessage(), new Object[0]);
            }
        }
        this.mStream = null;
        this.mOffset = 0L;
        this.mFileSize = 0;
    }

    public int read(byte[] bArr, int i4) {
        InputStream inputStream = this.mStream;
        int i5 = -1;
        if (inputStream == null) {
            return -1;
        }
        try {
            i5 = inputStream.read(bArr, 0, i4);
            this.mOffset += i5;
            return i5;
        } catch (IOException e4) {
            Log.e(ProtectedSandApp.s("厦\u0001"), ProtectedSandApp.s("厬\u0001") + e4.getMessage(), new Object[0]);
            return i5;
        }
    }

    public long seek(long j4, int i4) {
        if (this.mStream == null) {
            return -1L;
        }
        if (i4 == 0) {
            return seekFromBegin(j4);
        }
        if (i4 == 1) {
            return seekFromCurrent(j4);
        }
        if (i4 == 2) {
            return seekFromEnd(j4);
        }
        if (i4 != 65536) {
            return -1L;
        }
        return this.mFileSize;
    }
}

package com.google.firebase.installations;

import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* compiled from: CrossProcessLock.java */
/* loaded from: classes2.dex */
class d {

    /* renamed from: c, reason: collision with root package name */
    private static final String f16686c = ProtectedSandApp.s("ᘽ");

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f16687a;

    /* renamed from: b, reason: collision with root package name */
    private final FileLock f16688b;

    private d(FileChannel fileChannel, FileLock fileLock) {
        this.f16687a = fileChannel;
        this.f16688b = fileLock;
    }

    static d a(Context context, String str) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), str), ProtectedSandApp.s("ᘼ")).getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new d(fileChannel, fileLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            fileChannel = null;
            fileLock = null;
        }
    }

    void b() {
        try {
            this.f16688b.release();
            this.f16687a.close();
        } catch (IOException unused) {
        }
    }
}

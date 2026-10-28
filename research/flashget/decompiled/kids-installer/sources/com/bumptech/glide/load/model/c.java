package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder.java */
/* loaded from: classes3.dex */
public class c implements com.bumptech.glide.load.d<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11521a = ProtectedSandApp.s("ᴠ");

    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 ByteBuffer byteBuffer, @o0 File file, @o0 com.bumptech.glide.load.i iVar) {
        try {
            com.bumptech.glide.util.a.e(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(ProtectedSandApp.s("ᴟ"), 3);
            return false;
        }
    }
}

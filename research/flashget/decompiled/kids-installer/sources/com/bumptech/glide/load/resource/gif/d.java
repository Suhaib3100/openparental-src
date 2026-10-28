package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.l;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder.java */
/* loaded from: classes3.dex */
public class d implements l<c> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11838a = ProtectedSandApp.s("ᶄ");

    @Override // com.bumptech.glide.load.l
    @o0
    public com.bumptech.glide.load.c b(@o0 com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.c.SOURCE;
    }

    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 u<c> uVar, @o0 File file, @o0 com.bumptech.glide.load.i iVar) {
        try {
            com.bumptech.glide.util.a.e(uVar.get().e(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(ProtectedSandApp.s("ᶃ"), 5);
            return false;
        }
    }
}

package com.bumptech.glide.load;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11500a = ProtectedSandApp.s("š");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f11501b = Charset.forName(ProtectedSandApp.s("Ţ"));

    void a(@o0 MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}

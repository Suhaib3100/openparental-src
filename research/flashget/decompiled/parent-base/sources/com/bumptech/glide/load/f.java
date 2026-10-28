package com.bumptech.glide.load;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* loaded from: classes3.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f44240a = ProtectedSandApp.s("ࣘ");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f44241b = Charset.forName(ProtectedSandApp.s("ࣘ"));

    void b(@o0 MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}

package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.v0;
import java.io.File;
import java.net.URL;

/* compiled from: ModelTypes.java */
/* loaded from: classes.dex */
interface h<T> {
    @androidx.annotation.j
    @Deprecated
    T c(@q0 URL url);

    @androidx.annotation.j
    @o0
    T d(@q0 Uri uri);

    @androidx.annotation.j
    @o0
    T e(@q0 byte[] bArr);

    @androidx.annotation.j
    @o0
    T f(@q0 File file);

    @androidx.annotation.j
    @o0
    T i(@q0 Drawable drawable);

    @androidx.annotation.j
    @o0
    T j(@q0 Bitmap bitmap);

    @androidx.annotation.j
    @o0
    T l(@q0 Object obj);

    @androidx.annotation.j
    @o0
    T m(@q0 @v0 @v Integer num);

    @androidx.annotation.j
    @o0
    T s(@q0 String str);
}

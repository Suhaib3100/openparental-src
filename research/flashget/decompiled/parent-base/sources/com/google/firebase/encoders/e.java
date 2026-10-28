package com.google.firebase.encoders;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;

/* compiled from: ObjectEncoderContext.java */
/* loaded from: classes6.dex */
public interface e {
    @o0
    e b(@o0 c cVar, boolean z4) throws IOException;

    @o0
    e c(@o0 c cVar, long j4) throws IOException;

    @o0
    e d(@o0 c cVar, int i4) throws IOException;

    @o0
    e e(@o0 c cVar, float f4) throws IOException;

    @o0
    e f(@o0 c cVar) throws IOException;

    @o0
    e g(@o0 c cVar, double d5) throws IOException;

    @o0
    @Deprecated
    e h(@o0 String str, boolean z4) throws IOException;

    @o0
    @Deprecated
    e i(@o0 String str, double d5) throws IOException;

    @o0
    @Deprecated
    e j(@o0 String str, long j4) throws IOException;

    @o0
    @Deprecated
    e k(@o0 String str, int i4) throws IOException;

    @o0
    e m(@o0 c cVar, @q0 Object obj) throws IOException;

    @o0
    e n(@q0 Object obj) throws IOException;

    @o0
    @Deprecated
    e p(@o0 String str, @q0 Object obj) throws IOException;

    @o0
    e s(@o0 String str) throws IOException;
}

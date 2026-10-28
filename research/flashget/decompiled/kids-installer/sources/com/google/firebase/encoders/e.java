package com.google.firebase.encoders;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;

/* compiled from: ObjectEncoderContext.java */
/* loaded from: classes2.dex */
public interface e {
    @o0
    e a(@o0 c cVar, boolean z5) throws IOException;

    @o0
    e b(@o0 c cVar, long j5) throws IOException;

    @o0
    e c(@o0 c cVar, int i5) throws IOException;

    @o0
    e e(@o0 c cVar, float f6) throws IOException;

    @o0
    e f(@o0 c cVar) throws IOException;

    @o0
    e g(@o0 c cVar, double d6) throws IOException;

    @o0
    e h(@q0 Object obj) throws IOException;

    @o0
    @Deprecated
    e i(@o0 String str, boolean z5) throws IOException;

    @o0
    @Deprecated
    e j(@o0 String str, double d6) throws IOException;

    @o0
    @Deprecated
    e k(@o0 String str, long j5) throws IOException;

    @o0
    @Deprecated
    e l(@o0 String str, int i5) throws IOException;

    @o0
    @Deprecated
    e o(@o0 String str, @q0 Object obj) throws IOException;

    @o0
    e q(@o0 String str) throws IOException;

    @o0
    e r(@o0 c cVar, @q0 Object obj) throws IOException;
}

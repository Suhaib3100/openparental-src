package androidx.view.result;

import androidx.annotation.o0;
import b.a;

/* compiled from: ActivityResultCaller.java */
/* loaded from: classes.dex */
public interface b {
    @o0
    <I, O> h<I> registerForActivityResult(@o0 a<I, O> aVar, @o0 ActivityResultRegistry activityResultRegistry, @o0 a<O> aVar2);

    @o0
    <I, O> h<I> registerForActivityResult(@o0 a<I, O> aVar, @o0 a<O> aVar2);
}

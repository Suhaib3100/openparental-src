package com.mp4parser.streaming;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import java.util.concurrent.BlockingQueue;

/* compiled from: StreamingTrack.java */
/* loaded from: classes6.dex */
public interface f {
    BlockingQueue<d> A();

    String a();

    void b(Class<? extends g> cls);

    <T extends g> T c(Class<T> cls);

    long d();

    void e(g gVar);

    TrackHeaderBox f();

    boolean g();

    String getHandler();

    SampleDescriptionBox getSampleDescriptionBox();
}

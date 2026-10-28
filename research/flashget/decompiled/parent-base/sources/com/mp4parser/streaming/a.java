package com.mp4parser.streaming;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* compiled from: AbstractStreamingTrack.java */
/* loaded from: classes6.dex */
public abstract class a implements f {

    /* renamed from: b, reason: collision with root package name */
    protected TrackHeaderBox f70147b;

    /* renamed from: c, reason: collision with root package name */
    protected SampleDescriptionBox f70148c;

    /* renamed from: a, reason: collision with root package name */
    protected BlockingQueue<d> f70146a = new ArrayBlockingQueue(1000);

    /* renamed from: d, reason: collision with root package name */
    protected HashMap<Class<? extends g>, g> f70149d = new HashMap<>();

    public a() {
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        this.f70147b = trackHeaderBox;
        trackHeaderBox.setTrackId(1L);
    }

    @Override // com.mp4parser.streaming.f
    public BlockingQueue<d> A() {
        return this.f70146a;
    }

    @Override // com.mp4parser.streaming.f
    public void b(Class<? extends g> cls) {
        this.f70149d.remove(cls);
    }

    @Override // com.mp4parser.streaming.f
    public <T extends g> T c(Class<T> cls) {
        return (T) this.f70149d.get(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mp4parser.streaming.f
    public void e(g gVar) {
        this.f70149d.put(gVar.getClass(), gVar);
    }

    @Override // com.mp4parser.streaming.f
    public TrackHeaderBox f() {
        return this.f70147b;
    }

    @Override // com.mp4parser.streaming.f
    public boolean g() {
        return false;
    }

    @Override // com.mp4parser.streaming.f
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f70148c;
    }
}

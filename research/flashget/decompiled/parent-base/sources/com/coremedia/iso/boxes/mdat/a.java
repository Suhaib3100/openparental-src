package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.c;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import java.util.AbstractList;
import java.util.List;

/* compiled from: SampleList.java */
/* loaded from: classes3.dex */
public class a extends AbstractList<f> {

    /* renamed from: b, reason: collision with root package name */
    List<f> f47621b;

    public a(TrackBox trackBox, com.coremedia.iso.f... fVarArr) {
        c parent = ((b) trackBox.getParent()).getParent();
        if (!trackBox.getParent().getBoxes(MovieExtendsBox.class).isEmpty()) {
            this.f47621b = new com.googlecode.mp4parser.authoring.samples.b(trackBox.getTrackHeaderBox().getTrackId(), parent, fVarArr);
        } else {
            if (fVarArr.length > 0) {
                throw new RuntimeException(ProtectedSandApp.s("ᐑ"));
            }
            this.f47621b = new com.googlecode.mp4parser.authoring.samples.a(trackBox.getTrackHeaderBox().getTrackId(), parent);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get(int i4) {
        return this.f47621b.get(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f47621b.size();
    }
}

package wa;

import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.f;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.b;
import com.googlecode.mp4parser.authoring.d;
import com.googlecode.mp4parser.authoring.e;
import com.googlecode.mp4parser.c;
import com.googlecode.mp4parser.util.m;
import java.io.File;
import java.io.IOException;

/* compiled from: MovieCreator.java */
/* loaded from: classes6.dex */
public class a {
    public static d a(com.googlecode.mp4parser.a aVar) throws IOException {
        f fVar = new f(aVar);
        d dVar = new d();
        for (TrackBox trackBox : fVar.c().getBoxes(TrackBox.class)) {
            SchemeTypeBox schemeTypeBox = (SchemeTypeBox) m.e(trackBox, ProtectedSandApp.s("㣎\u0001"));
            String s4 = ProtectedSandApp.s("㣏\u0001");
            String s5 = ProtectedSandApp.s("㣐\u0001");
            if (schemeTypeBox == null || !(schemeTypeBox.getSchemeType().equals(ProtectedSandApp.s("㣑\u0001")) || schemeTypeBox.getSchemeType().equals(ProtectedSandApp.s("㣒\u0001")))) {
                dVar.a(new e(String.valueOf(aVar.toString()) + s5 + trackBox.getTrackHeaderBox().getTrackId() + s4, trackBox, new f[0]));
            } else {
                dVar.a(new b(String.valueOf(aVar.toString()) + s5 + trackBox.getTrackHeaderBox().getTrackId() + s4, trackBox, new f[0]));
            }
        }
        dVar.h(fVar.c().getMovieHeaderBox().getMatrix());
        return dVar;
    }

    public static d b(String str) throws IOException {
        return a(new c(new File(str)));
    }
}
